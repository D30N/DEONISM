package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import d.b.a.b.k;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1098bi implements InterfaceC0516He {
    public static byte[] A07;
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public InputStream A03;
    public boolean A04;
    public final Resources A05;
    public final InterfaceC0535Hz<? super C1098bi> A06;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ k.AppCompatTheme_windowActionBarOverlay);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A07 = new byte[]{26, 29, 6, 111, 34, 58, 60, 59, 111, 58, 60, 42, 111, 60, 44, 39, 42, 34, 42, 111, 61, 46, 56, 61, 42, 60, 32, 58, 61, 44, 42, 40, 31, 9, 21, 15, 8, 25, 31, 90, 19, 30, 31, 20, 14, 19, 28, 19, 31, 8, 90, 23, 15, 9, 14, 90, 24, 31, 90, 27, 20, 90, 19, 20, 14, 31, 29, 31, 8, 84, 71, 84, 66, 71, 80, 70, 90, 64, 71, 86, 80};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hz != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.RawResourceDataSource> */
    public C1098bi(Context context, InterfaceC0535Hz<? super C1098bi> interfaceC0535Hz) {
        this.A05 = context.getResources();
        this.A06 = interfaceC0535Hz;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0516He
    public final Uri A7F() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0516He
    public final long ABU(C0520Hi c0520Hi) throws IOException {
        try {
            this.A02 = c0520Hi.A04;
            if (TextUtils.equals(A00(70, 11, 65), this.A02.getScheme())) {
                try {
                    this.A01 = this.A05.openRawResourceFd(Integer.parseInt(this.A02.getLastPathSegment()));
                    this.A03 = new FileInputStream(this.A01.getFileDescriptor());
                    this.A03.skip(this.A01.getStartOffset());
                    if (this.A03.skip(c0520Hi.A03) >= c0520Hi.A03) {
                        if (c0520Hi.A02 != -1) {
                            this.A00 = c0520Hi.A02;
                        } else {
                            long assetFileDescriptorLength = this.A01.getLength();
                            this.A00 = assetFileDescriptorLength != -1 ? assetFileDescriptorLength - c0520Hi.A03 : -1L;
                        }
                        this.A04 = true;
                        InterfaceC0535Hz<? super C1098bi> interfaceC0535Hz = this.A06;
                        if (interfaceC0535Hz != null) {
                            interfaceC0535Hz.ABF(this, c0520Hi);
                        }
                        return this.A00;
                    }
                    throw new EOFException();
                } catch (NumberFormatException unused) {
                    throw new C0534Hy(A00(31, 39, 14));
                }
            }
            throw new C0534Hy(A00(0, 31, 59));
        } catch (IOException e) {
            throw new C0534Hy(e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0516He
    public final void close() throws C0534Hy {
        this.A02 = null;
        try {
            try {
                if (this.A03 != null) {
                    this.A03.close();
                }
                this.A03 = null;
            } catch (Throwable th) {
                this.A03 = null;
                try {
                    try {
                        if (this.A01 != null) {
                            this.A01.close();
                        }
                        this.A01 = null;
                        if (this.A04) {
                            this.A04 = false;
                            InterfaceC0535Hz<? super C1098bi> interfaceC0535Hz = this.A06;
                            if (interfaceC0535Hz != null) {
                                interfaceC0535Hz.ABE(this);
                            }
                        }
                        throw th;
                    } catch (IOException e) {
                        throw new C0534Hy(e);
                    }
                } finally {
                    this.A01 = null;
                    if (this.A04) {
                        this.A04 = false;
                        InterfaceC0535Hz<? super C1098bi> interfaceC0535Hz2 = this.A06;
                        if (interfaceC0535Hz2 != null) {
                            interfaceC0535Hz2.ABE(this);
                        }
                    }
                }
            }
            try {
                try {
                    if (this.A01 != null) {
                        this.A01.close();
                    }
                } catch (IOException e2) {
                    throw new C0534Hy(e2);
                }
            } finally {
                this.A01 = null;
                if (this.A04) {
                    this.A04 = false;
                    InterfaceC0535Hz<? super C1098bi> interfaceC0535Hz3 = this.A06;
                    if (interfaceC0535Hz3 != null) {
                        interfaceC0535Hz3.ABE(this);
                    }
                }
            }
        } catch (IOException e3) {
            throw new C0534Hy(e3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0516He
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C1098bi c1098bi = this;
        long j = 0;
        long j2 = 0;
        InterfaceC0535Hz<? super C1098bi> interfaceC0535Hz = null;
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
                    c1098bi = c1098bi;
                    j3 = c1098bi.A00;
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
                    try {
                        iMin = (int) Math.min(j3, j4);
                        c2 = '\n';
                        break;
                    } catch (IOException e) {
                        throw new C0534Hy(e);
                    }
                case '\n':
                    c1098bi = c1098bi;
                    i4 = c1098bi.A03.read(bArr, i, iMin);
                    if (i4 != i3) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c1098bi = c1098bi;
                    if (c1098bi.A00 != j2) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    return i3;
                case 15:
                    throw new C0534Hy(new EOFException());
                case 16:
                    c1098bi = c1098bi;
                    j = c1098bi.A00;
                    if (j == j2) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    c1098bi = c1098bi;
                    c1098bi.A00 = j - i4;
                    c2 = 18;
                    break;
                case 18:
                    c1098bi = c1098bi;
                    interfaceC0535Hz = c1098bi.A06;
                    if (interfaceC0535Hz == null) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    c1098bi = c1098bi;
                    interfaceC0535Hz = interfaceC0535Hz;
                    interfaceC0535Hz.A96(c1098bi, i4);
                    c2 = 20;
                    break;
                case 20:
                    return i4;
            }
        }
    }
}
