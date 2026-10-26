package com.facebook.ads.redexgen.X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.facebook.ads.redexgen.X.bm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1102bm implements InterfaceC0514Hc {
    public long A00;
    public long A01;
    public C0520Hi A02;
    public C0551Ip A03;
    public File A04;
    public FileOutputStream A05;
    public OutputStream A06;
    public final int A07;
    public final long A08;
    public final I3 A09;
    public final boolean A0A;

    public C1102bm(I3 i3, long j) {
        this(i3, j, 20480, true);
    }

    public C1102bm(I3 i3, long j, int i, boolean z) {
        this.A09 = (I3) IJ.A01(i3);
        this.A08 = j;
        this.A07 = i;
        this.A0A = z;
    }

    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.File, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    private void A00() throws Throwable {
        C1102bm c1102bm = this;
        Throwable th = null;
        ?? r6 = 0;
        File file = null;
        boolean z = false;
        File file2 = null;
        OutputStream outputStream = c1102bm.A06;
        char c2 = outputStream == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    z = false;
                    r6 = 0;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        outputStream = outputStream;
                        outputStream.flush();
                        if (c1102bm.A0A) {
                            c1102bm.A05.getFD().sync();
                        }
                        C0560Iy.A0a(c1102bm.A06);
                        c1102bm.A06 = r6;
                        file = c1102bm.A04;
                        c1102bm.A04 = r6;
                        if (1 == 0) {
                            c2 = '\r';
                            break;
                        } else {
                            c2 = 11;
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        C0560Iy.A0a(c1102bm.A06);
                        c1102bm.A06 = r6;
                        file2 = c1102bm.A04;
                        c1102bm.A04 = r6;
                        if (!z) {
                            c2 = 17;
                            break;
                        } else {
                            c2 = 15;
                            break;
                        }
                    }
                case 11:
                    c1102bm = c1102bm;
                    file = file;
                    c1102bm.A09.A43(file);
                    c2 = '\f';
                    break;
                case '\f':
                    return;
                case '\r':
                    file = file;
                    file.delete();
                    c2 = '\f';
                    break;
                case 15:
                    c1102bm = c1102bm;
                    file2 = file2;
                    c1102bm.A09.A43(file2);
                    c2 = 16;
                    break;
                case 16:
                    throw th;
                case 17:
                    file2 = file2;
                    file2.delete();
                    c2 = 16;
                    break;
            }
        }
    }

    private void A01() throws IOException {
        C1102bm c1102bm = this;
        C0551Ip c0551Ip = null;
        int i = 0;
        long jMin = 0;
        char c2 = c1102bm.A02.A02 == -1 ? (char) 2 : '\n';
        while (true) {
            switch (c2) {
                case 2:
                    c1102bm = c1102bm;
                    jMin = c1102bm.A08;
                    c2 = 3;
                    break;
                case 3:
                    c1102bm = c1102bm;
                    I3 i3 = c1102bm.A09;
                    String str = c1102bm.A02.A05;
                    long maxLength = c1102bm.A02.A01;
                    c1102bm.A04 = i3.ADO(str, c1102bm.A00 + maxLength, jMin);
                    c1102bm.A05 = new FileOutputStream(c1102bm.A04);
                    i = c1102bm.A07;
                    if (i <= 0) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1102bm = c1102bm;
                    c0551Ip = c1102bm.A03;
                    if (c0551Ip != null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c1102bm = c1102bm;
                    c1102bm.A03 = new C0551Ip(c1102bm.A05, i);
                    c2 = 6;
                    break;
                case 6:
                    c1102bm = c1102bm;
                    c1102bm.A06 = c1102bm.A03;
                    c2 = 7;
                    break;
                case 7:
                    c1102bm.A01 = 0L;
                    return;
                case '\b':
                    c1102bm = c1102bm;
                    c0551Ip = c0551Ip;
                    c0551Ip.A00(c1102bm.A05);
                    c2 = 6;
                    break;
                case '\t':
                    c1102bm = c1102bm;
                    c1102bm.A06 = c1102bm.A05;
                    c2 = 7;
                    break;
                case '\n':
                    c1102bm = c1102bm;
                    long j = c1102bm.A02.A02;
                    long maxLength2 = c1102bm.A00;
                    long j2 = j - maxLength2;
                    long maxLength3 = c1102bm.A08;
                    jMin = Math.min(j2, maxLength3);
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0514Hc
    public final void ABW(C0520Hi c0520Hi) throws C1101bl {
        C1102bm c1102bm = this;
        char c2 = c0520Hi.A02 == -1 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0520Hi = c0520Hi;
                    if (!c0520Hi.A04(2)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    c1102bm.A02 = null;
                    return;
                case 4:
                    c1102bm = c1102bm;
                    c0520Hi = c0520Hi;
                    c1102bm.A02 = c0520Hi;
                    c1102bm.A00 = 0L;
                    c2 = 5;
                    break;
                case 5:
                    try {
                        c1102bm.A01();
                        return;
                    } catch (IOException e) {
                        throw new C1101bl(e);
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0514Hc
    public final void close() throws Throwable {
        if (this.A02 == null) {
            return;
        }
        try {
            A00();
        } catch (IOException e) {
            throw new C1101bl(e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0514Hc
    public final void write(byte[] bArr, int bytesToWrite, int i) throws Throwable {
        C1102bm c1102bm = this;
        int i2 = 0;
        char c2 = c1102bm.A02 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    i2 = 0;
                    break;
                case 5:
                    try {
                        c1102bm = c1102bm;
                        if (c1102bm.A01 == c1102bm.A08) {
                            c1102bm.A00();
                            c1102bm.A01();
                        }
                        int iMin = (int) Math.min(i - i2, c1102bm.A08 - c1102bm.A01);
                        c1102bm.A06.write(bArr, bytesToWrite + i2, iMin);
                        i2 += iMin;
                        c1102bm.A01 += iMin;
                        c1102bm.A00 += iMin;
                        break;
                    } catch (IOException e) {
                        throw new C1101bl(e);
                    }
                case 20:
                    return;
            }
            c2 = i2 < i ? (char) 5 : (char) 20;
        }
    }
}
