package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import d.b.a.b.k;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1075bL implements InterfaceC0516He {
    public static byte[] A06;
    public long A00;
    public Uri A01;
    public InputStream A02;
    public boolean A03;
    public final AssetManager A04;
    public final InterfaceC0535Hz<? super C1075bL> A05;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
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

    public static void A01() {
        A06 = new byte[]{99, 31, 81, 94, 84, 66, 95, 89, 84, 111, 81, 67, 67, 85, 68, 31};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hz != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.AssetDataSource> */
    public C1075bL(Context context, InterfaceC0535Hz<? super C1075bL> interfaceC0535Hz) {
        this.A04 = context.getAssets();
        this.A05 = interfaceC0535Hz;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0516He
    public final Uri A7F() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0516He
    public final long ABU(C0520Hi c0520Hi) throws EOFException, HX {
        try {
            this.A01 = c0520Hi.A04;
            String path = this.A01.getPath();
            if (path.startsWith(A00(1, 15, k.AppCompatTheme_windowFixedHeightMajor))) {
                path = path.substring(15);
            } else if (path.startsWith(A00(0, 1, 10))) {
                path = path.substring(1);
            }
            this.A02 = this.A04.open(path, 1);
            if (this.A02.skip(c0520Hi.A03) >= c0520Hi.A03) {
                if (c0520Hi.A02 != -1) {
                    long skipped = c0520Hi.A02;
                    this.A00 = skipped;
                } else {
                    long skipped2 = this.A02.available();
                    this.A00 = skipped2;
                    if (this.A00 == 2147483647L) {
                        this.A00 = -1L;
                    }
                }
                this.A03 = true;
                InterfaceC0535Hz<? super C1075bL> interfaceC0535Hz = this.A05;
                if (interfaceC0535Hz != null) {
                    interfaceC0535Hz.ABF(this, c0520Hi);
                }
                return this.A00;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new HX(e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0516He
    public final void close() throws HX {
        this.A01 = null;
        try {
            try {
                if (this.A02 != null) {
                    this.A02.close();
                }
            } catch (IOException e) {
                throw new HX(e);
            }
        } finally {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                InterfaceC0535Hz<? super C1075bL> interfaceC0535Hz = this.A05;
                if (interfaceC0535Hz != null) {
                    interfaceC0535Hz.ABE(this);
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0516He
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C1075bL c1075bL = this;
        long j = 0;
        long j2 = 0;
        InterfaceC0535Hz<? super C1075bL> interfaceC0535Hz = null;
        int i3 = 0;
        int iMin = 0;
        int i4 = 0;
        long j3 = 0;
        long j4 = 0;
        char c2 = i2 == 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return 0;
                case 3:
                    c1075bL = c1075bL;
                    j3 = c1075bL.A00;
                    i3 = -1;
                    if (j3 != 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return i3;
                case 5:
                    j2 = -1;
                    if (j3 != -1) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    iMin = i2;
                    c2 = '\n';
                    break;
                case 7:
                    j4 = i2;
                    c2 = '\b';
                    break;
                case '\b':
                    iMin = (int) Math.min(j3, j4);
                    c2 = '\n';
                    break;
                case '\n':
                    try {
                        c1075bL = c1075bL;
                        i4 = c1075bL.A02.read(bArr, i, iMin);
                        if (i4 != i3) {
                            c2 = 16;
                            break;
                        } else {
                            c2 = '\r';
                            break;
                        }
                    } catch (IOException e) {
                        throw new HX(e);
                    }
                case '\r':
                    c1075bL = c1075bL;
                    if (c1075bL.A00 != j2) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    return i3;
                case 15:
                    throw new HX(new EOFException());
                case 16:
                    c1075bL = c1075bL;
                    j = c1075bL.A00;
                    if (j == j2) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    c1075bL = c1075bL;
                    c1075bL.A00 = j - i4;
                    c2 = 18;
                    break;
                case 18:
                    c1075bL = c1075bL;
                    interfaceC0535Hz = c1075bL.A05;
                    if (interfaceC0535Hz == null) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    c1075bL = c1075bL;
                    interfaceC0535Hz = interfaceC0535Hz;
                    interfaceC0535Hz.A96(c1075bL, i4);
                    c2 = 20;
                    break;
                case 20:
                    return i4;
            }
        }
    }
}
