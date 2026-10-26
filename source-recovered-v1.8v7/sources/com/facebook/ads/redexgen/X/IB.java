package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import d.b.a.b.k;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: assets/audience_network.dex */
public final class IB {
    public static byte[] A08;
    public C0551Ip A00;
    public boolean A01;
    public final SparseArray<String> A02;
    public final IL A03;
    public final HashMap<String, IA> A04;
    public final Cipher A05;
    public final SecretKeySpec A06;
    public final boolean A07;

    static {
        A05();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        int i4 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    bArrCopyOfRange = bArrCopyOfRange;
                    if (i4 >= bArrCopyOfRange.length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    bArrCopyOfRange = bArrCopyOfRange;
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 70);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A05() {
        A08 = new byte[]{32, 34, 32, 43, 38, 39, 28, 32, 44, 45, 55, 38, 45, 55, 28, 42, 45, 39, 38, 59, 109, 38, 59, 42, 65, 64, 73, 77, 91, 112, 116, 98, 30, 114, 115, 114, 30, 97, 122, 114, 98, 4, 97, 112, 117, 117, 120, Byte.MAX_VALUE, 118};
    }

    public IB(File file, byte[] bArr, boolean z) {
        this.A07 = z;
        if (bArr != null) {
            IJ.A03(bArr.length == 16);
            try {
                this.A05 = A03();
                this.A06 = new SecretKeySpec(bArr, A02(26, 3, 78));
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                throw new IllegalStateException(e);
            }
        } else {
            IJ.A04(!z);
            this.A05 = null;
            this.A06 = null;
        }
        this.A04 = new HashMap<>();
        this.A02 = new SparseArray<>();
        this.A03 = new IL(new File(file, A02(0, 24, 5)));
    }

    public static int A00(SparseArray<String> sparseArray) {
        int id = 0;
        int size = sparseArray.size();
        char c2 = size == 0 ? (char) 2 : '\t';
        while (true) {
            switch (c2) {
                case 2:
                    id = 0;
                    c2 = 3;
                    break;
                case 3:
                    if (id >= 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    id = 0;
                    c2 = 5;
                    break;
                case 5:
                    if (id >= size) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    sparseArray = sparseArray;
                    if (id == sparseArray.keyAt(id)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return id;
                case '\b':
                    id++;
                    c2 = 5;
                    break;
                case '\t':
                    sparseArray = sparseArray;
                    id = sparseArray.keyAt(size - 1) + 1;
                    c2 = 3;
                    break;
            }
        }
    }

    private IA A01(String str) {
        IA ia = new IA(A00(this.A02), str);
        A06(ia);
        this.A01 = true;
        return ia;
    }

    public static Cipher A03() throws NoSuchPaddingException, NoSuchAlgorithmException {
        int i = C0560Iy.A01;
        String strA02 = A02(29, 20, k.AppCompatTheme_windowFixedHeightMinor);
        if (i == 18) {
            try {
                return Cipher.getInstance(strA02, A02(24, 2, 69));
            } catch (Throwable unused) {
            }
        }
        return Cipher.getInstance(strA02);
    }

    private void A04() throws IOException {
        try {
            try {
                OutputStream outputStreamA04 = this.A03.A04();
                if (this.A00 == null) {
                    this.A00 = new C0551Ip(outputStreamA04);
                } else {
                    this.A00.A00(outputStreamA04);
                }
                DataOutputStream dataOutputStream = new DataOutputStream(this.A00);
                dataOutputStream.writeInt(2);
                dataOutputStream.writeInt(this.A07 ? 1 : 0);
                if (this.A07) {
                    byte[] bArr = new byte[16];
                    new Random().nextBytes(bArr);
                    dataOutputStream.write(bArr);
                    try {
                        this.A05.init(1, this.A06, new IvParameterSpec(bArr));
                        dataOutputStream.flush();
                        dataOutputStream = new DataOutputStream(new CipherOutputStream(this.A00, this.A05));
                    } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                        throw new IllegalStateException(e);
                    }
                }
                dataOutputStream.writeInt(this.A04.size());
                int i = 0;
                for (IA ia : this.A04.values()) {
                    ia.A0A(dataOutputStream);
                    int hashCode = ia.A03(2);
                    i += hashCode;
                }
                dataOutputStream.writeInt(i);
                this.A03.A06(dataOutputStream);
                C0560Iy.A0a(null);
            } catch (IOException e2) {
                throw new I1(e2);
            }
        } catch (Throwable th) {
            C0560Iy.A0a(null);
            throw th;
        }
    }

    private void A06(IA ia) {
        this.A04.put(ia.A03, ia);
        this.A02.put(ia.A02, ia.A03);
    }

    private boolean A07() throws IOException {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.A03.A03());
            DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
            int i = dataInputStream.readInt();
            if (i < 0 || i > 2) {
                C0560Iy.A0a(dataInputStream);
                return false;
            }
            int flags = dataInputStream.readInt();
            if ((flags & 1) != 0) {
                if (this.A05 == null) {
                    C0560Iy.A0a(dataInputStream);
                    return false;
                }
                byte[] initializationVector = new byte[16];
                dataInputStream.readFully(initializationVector);
                try {
                    this.A05.init(2, this.A06, new IvParameterSpec(initializationVector));
                    dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, this.A05));
                } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                    throw new IllegalStateException(e);
                }
            } else if (this.A07) {
                this.A01 = true;
            }
            int i2 = dataInputStream.readInt();
            int version = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                IA cachedContent = IA.A00(i, dataInputStream);
                A06(cachedContent);
                version += cachedContent.A03(i);
            }
            int i4 = dataInputStream.readInt();
            boolean isEOF = dataInputStream.read() == -1;
            if (i4 == version && isEOF) {
                C0560Iy.A0a(dataInputStream);
                return true;
            }
            C0560Iy.A0a(dataInputStream);
            return false;
        } catch (IOException unused) {
            if (0 != 0) {
                C0560Iy.A0a(null);
            }
            return false;
        } catch (Throwable th) {
            if (0 != 0) {
                C0560Iy.A0a(null);
            }
            throw th;
        }
    }

    public final int A08(String str) {
        return A0A(str).A02;
    }

    public final IA A09(String str) {
        return this.A04.get(str);
    }

    public final IA A0A(String str) {
        IB ib = this;
        IA iaA01 = null;
        IA ia = ib.A04.get(str);
        char c2 = ia == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    ib = ib;
                    str = str;
                    iaA01 = ib.A01(str);
                    c2 = 3;
                    break;
                case 3:
                    return iaA01;
                case 4:
                    ia = ia;
                    iaA01 = ia;
                    c2 = 3;
                    break;
            }
        }
    }

    public final ID A0B(String str) {
        ID idA05 = null;
        IA iaA09 = A09(str);
        char c2 = iaA09 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    iaA09 = iaA09;
                    idA05 = iaA09.A05();
                    c2 = 3;
                    break;
                case 3:
                    return idA05;
                case 4:
                    idA05 = C1108bs.A03;
                    c2 = 3;
                    break;
            }
        }
    }

    public final String A0C(int i) {
        return this.A02.get(i);
    }

    public final Collection<IA> A0D() {
        return this.A04.values();
    }

    public final void A0E() {
        IJ.A04(!this.A01);
        if (!A07()) {
            this.A03.A05();
            this.A04.clear();
            this.A02.clear();
        }
    }

    public final void A0F() {
        IB ib = this;
        String[] strArr = new String[ib.A04.size()];
        ib.A04.keySet().toArray(strArr);
        int length = strArr.length;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    ib = ib;
                    strArr = strArr;
                    String key = strArr[i];
                    ib.A0H(key);
                    i++;
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    public final void A0G() throws IOException {
        if (!this.A01) {
            return;
        }
        A04();
        this.A01 = false;
    }

    public final void A0H(String str) {
        IB ib = this;
        IA ia = ib.A04.get(str);
        char c2 = ia != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    ia = ia;
                    if (!ia.A0C()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    ia = ia;
                    if (!ia.A0D()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    ib = ib;
                    str = str;
                    ia = ia;
                    ib.A04.remove(str);
                    ib.A02.remove(ia.A02);
                    ib.A01 = true;
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    public final void A0I(String str, IF r3) {
        if (A0A(str).A0F(r3)) {
            this.A01 = true;
        }
    }
}
