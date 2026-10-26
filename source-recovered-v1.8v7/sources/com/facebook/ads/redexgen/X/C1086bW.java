package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bW, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1086bW implements InterfaceC0516He {
    public static byte[] A05;
    public long A00;
    public Uri A01;
    public RandomAccessFile A02;
    public boolean A03;
    public final InterfaceC0535Hz<? super C1086bW> A04;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 120);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A05 = new byte[]{-14};
    }

    public C1086bW() {
        this(null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hz != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.FileDataSource> */
    public C1086bW(InterfaceC0535Hz<? super C1086bW> interfaceC0535Hz) {
        this.A04 = interfaceC0535Hz;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0516He
    public final Uri A7F() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0516He
    public final long ABU(C0520Hi c0520Hi) throws IOException {
        try {
            this.A01 = c0520Hi.A04;
            this.A02 = new RandomAccessFile(c0520Hi.A04.getPath(), A00(0, 1, 8));
            this.A02.seek(c0520Hi.A03);
            this.A00 = c0520Hi.A02 == -1 ? this.A02.length() - c0520Hi.A03 : c0520Hi.A02;
            if (this.A00 >= 0) {
                this.A03 = true;
                InterfaceC0535Hz<? super C1086bW> interfaceC0535Hz = this.A04;
                if (interfaceC0535Hz != null) {
                    interfaceC0535Hz.ABF(this, c0520Hi);
                }
                return this.A00;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new C0522Hl(e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0516He
    public final void close() throws C0522Hl {
        this.A01 = null;
        try {
            try {
                if (this.A02 != null) {
                    this.A02.close();
                }
            } catch (IOException e) {
                throw new C0522Hl(e);
            }
        } finally {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                InterfaceC0535Hz<? super C1086bW> interfaceC0535Hz = this.A04;
                if (interfaceC0535Hz != null) {
                    interfaceC0535Hz.ABE(this);
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0516He
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C1086bW c1086bW = this;
        InterfaceC0535Hz<? super C1086bW> interfaceC0535Hz = null;
        int i3 = 0;
        long j = 0;
        char c2 = i2 == 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return 0;
                case 3:
                    c1086bW = c1086bW;
                    j = c1086bW.A00;
                    if (j != 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return -1;
                case 5:
                    try {
                        c1086bW = c1086bW;
                        i3 = c1086bW.A02.read(bArr, i, (int) Math.min(j, i2));
                        if (i3 <= 0) {
                            c2 = 11;
                            break;
                        } else {
                            c2 = '\t';
                            break;
                        }
                    } catch (IOException e) {
                        throw new C0522Hl(e);
                    }
                case '\t':
                    c1086bW = c1086bW;
                    c1086bW.A00 -= i3;
                    interfaceC0535Hz = c1086bW.A04;
                    if (interfaceC0535Hz == null) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c1086bW = c1086bW;
                    interfaceC0535Hz = interfaceC0535Hz;
                    interfaceC0535Hz.A96(c1086bW, i3);
                    c2 = 11;
                    break;
                case 11:
                    return i3;
            }
        }
    }
}
