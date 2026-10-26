package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class Z3 implements CC {
    public static byte[] A0E;
    public static final CF A0F;
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public CE A04;
    public CO A05;
    public Z2 A06;
    public Metadata A07;
    public final int A08;
    public final long A09;
    public final CG A0A;
    public final CH A0B;
    public final CI A0C;
    public final C0544Ii A0D;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 68);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A05() {
        A0E = new byte[]{-59, -41, -45, -28, -43, -38, -41, -42, -110, -26, -31, -31, -110, -33, -45, -32, -21, -110, -44, -21, -26, -41, -27, -96, -12, -32, -16, -25, -61, -24, -32, -23, -96, -79, -74, -81};
    }

    static {
        A05();
        A0F = new Z1();
        A0I = C0560Iy.A08(A04(32, 4, 4));
        A0G = C0560Iy.A08(A04(28, 4, 54));
        A0H = C0560Iy.A08(A04(24, 4, 90));
    }

    public Z3() {
        this(0);
    }

    public Z3(int i) {
        this(i, -9223372036854775807L);
    }

    public Z3(int i, long j) {
        this.A08 = i;
        this.A09 = j;
        this.A0D = new C0544Ii(10);
        this.A0C = new CI();
        this.A0A = new CG();
        this.A02 = -9223372036854775807L;
        this.A0B = new CH();
    }

    private int A00(CD cd) throws InterruptedException, IOException {
        Z3 z3 = this;
        int iACj = 0;
        int iA08 = 0;
        long j = 0;
        int i = 0;
        char c2 = z3.A00 == 0 ? (char) 2 : (char) 11;
        while (true) {
            switch (c2) {
                case 2:
                    z3 = z3;
                    cd = cd;
                    i = 0;
                    cd.ACg();
                    if (!cd.ABg(z3.A0D.A00, 0, 4, true)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    return -1;
                case 4:
                    z3 = z3;
                    z3.A0D.A0Y(i);
                    iA08 = z3.A0D.A08();
                    if (!A06(iA08, z3.A01)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (CI.A00(iA08) != -1) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    cd.ADL(1);
                    z3.A01 = i;
                    return i;
                case 7:
                    z3 = z3;
                    CI.A04(iA08, z3.A0C);
                    j = -9223372036854775807L;
                    if (z3.A02 != -9223372036854775807L) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    z3 = z3;
                    cd = cd;
                    z3.A02 = z3.A06.A79(cd.A6n());
                    if (z3.A09 == j) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    z3 = z3;
                    long jA79 = z3.A06.A79(0L);
                    long j2 = z3.A02;
                    long embeddedFirstSampleTimestampUs = z3.A09;
                    z3.A02 = j2 + (embeddedFirstSampleTimestampUs - jA79);
                    c2 = '\n';
                    break;
                case '\n':
                    z3 = z3;
                    z3.A00 = z3.A0C.A02;
                    c2 = 11;
                    break;
                case 11:
                    z3 = z3;
                    cd = cd;
                    iACj = z3.A05.ACj(cd, z3.A00, true);
                    if (iACj != -1) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    return -1;
                case '\r':
                    z3 = z3;
                    z3.A00 -= iACj;
                    if (z3.A00 <= 0) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    return i;
                case 15:
                    Z3 z32 = z3;
                    long j3 = z32.A02;
                    long j4 = z32.A03 * 1000000;
                    long embeddedFirstSampleTimestampUs2 = z32.A0C.A03;
                    z32.A05.ACl(j3 + (j4 / embeddedFirstSampleTimestampUs2), 1, z32.A0C.A02, 0, null);
                    long j5 = z32.A03;
                    long embeddedFirstSampleTimestampUs3 = z32.A0C.A04;
                    z32.A03 = j5 + embeddedFirstSampleTimestampUs3;
                    z32.A00 = i;
                    return i;
            }
        }
    }

    public static int A01(C0544Ii c0544Ii, int i) {
        int i2 = 0;
        int iA08 = 0;
        char c2 = c0544Ii.A07() >= i + 4 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0544Ii = c0544Ii;
                    c0544Ii.A0Y(i);
                    iA08 = c0544Ii.A08();
                    if (iA08 == A0I) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (iA08 != A0G) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return iA08;
                case 5:
                    c0544Ii = c0544Ii;
                    if (c0544Ii.A07() < 40) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0544Ii = c0544Ii;
                    c0544Ii.A0Y(36);
                    int iA082 = c0544Ii.A08();
                    i2 = A0H;
                    if (iA082 != i2) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return i2;
                case '\b':
                    return 0;
            }
        }
    }

    private Z2 A02(CD cd) throws InterruptedException, IOException {
        cd.ABf(this.A0D.A00, 0, 4);
        this.A0D.A0Y(0);
        CI.A04(this.A0D.A08(), this.A0C);
        return new C0433Dv(cd.A6U(), cd.A6n(), this.A0C);
    }

    private Z2 A03(CD cd) throws InterruptedException, IOException {
        CD cd2 = cd;
        Z3 z3 = this;
        Z2 seeker = null;
        int i = 0;
        int iA01 = 0;
        C0544Ii c0544Ii = new C0544Ii(z3.A0C.A02);
        cd2.ABf(c0544Ii.A00, 0, z3.A0C.A02);
        int i2 = 21;
        char c2 = (z3.A0C.A05 & 1) != 0 ? (char) 2 : '\r';
        while (true) {
            switch (c2) {
                case 2:
                    z3 = z3;
                    if (z3.A0C.A01 == 1) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    i2 = 36;
                    c2 = 4;
                    break;
                case 4:
                    c0544Ii = c0544Ii;
                    i = i2;
                    iA01 = A01(c0544Ii, i);
                    if (iA01 == A0I) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (iA01 != A0G) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    z3 = z3;
                    cd2 = cd2;
                    c0544Ii = c0544Ii;
                    seeker = C0421De.A01(cd2.A6U(), cd2.A6n(), z3.A0C, c0544Ii);
                    if (seeker == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    z3 = z3;
                    if (!z3.A0A.A03()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\b':
                    z3 = z3;
                    cd2 = cd2;
                    cd2.ACg();
                    cd2.A3L(i + 141);
                    cd2.ABf(z3.A0D.A00, 0, 3);
                    z3.A0D.A0Y(0);
                    z3.A0A.A04(z3.A0D.A0G());
                    c2 = '\t';
                    break;
                case '\t':
                    z3 = z3;
                    cd2 = cd2;
                    seeker = (C0421De) seeker;
                    cd2.ADL(z3.A0C.A02);
                    if (seeker == null) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    seeker = (C0421De) seeker;
                    if (!seeker.A7n()) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 11:
                    if (iA01 != A0G) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    return z3.A02(cd2);
                case '\r':
                    z3 = z3;
                    if (z3.A0C.A01 == 1) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 14:
                    i2 = 13;
                    c2 = 4;
                    break;
                case 15:
                    if (iA01 != A0H) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    z3 = z3;
                    cd2 = cd2;
                    c0544Ii = c0544Ii;
                    seeker = C0422Df.A00(cd2.A6U(), cd2.A6n(), z3.A0C, c0544Ii);
                    cd2.ADL(z3.A0C.A02);
                    c2 = 17;
                    break;
                case 17:
                    return seeker;
                case 18:
                    cd2 = cd2;
                    seeker = null;
                    cd2.ACg();
                    c2 = 17;
                    break;
            }
        }
    }

    public static boolean A06(int i, long j) {
        boolean z = false;
        char c2 = ((long) ((-128000) & i)) == ((-128000) & j) ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    private boolean A07(CD cd, boolean z) throws InterruptedException, IOException {
        CD cd2 = cd;
        Z3 z3 = this;
        int i = 0;
        E2 e2 = null;
        int iA00 = 0;
        boolean z2 = false;
        Metadata metadata = null;
        int i2 = 0;
        boolean z4 = false;
        byte[] bArr = null;
        boolean z5 = false;
        boolean z6 = false;
        int iA08 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int iA6i = 0;
        int i6 = 0;
        char c2 = z ? (char) 2 : '$';
        while (true) {
            switch (c2) {
                case 2:
                    i3 = 16384;
                    c2 = 3;
                    break;
                case 3:
                    cd2 = cd2;
                    cd2.ACg();
                    z4 = false;
                    z4 = false;
                    z6 = true;
                    z6 = true;
                    if (cd2.A6n() != 0) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z3 = z3;
                    if ((z3.A08 & 2) == 0) {
                        c2 = '#';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    z2 = true;
                    c2 = 6;
                    break;
                case 6:
                    if (!z2) {
                        c2 = '\"';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    e2 = CG.A03;
                    c2 = '\b';
                    break;
                case '\b':
                    z3 = z3;
                    cd2 = cd2;
                    z3.A07 = z3.A0B.A00(cd2, e2);
                    metadata = z3.A07;
                    if (metadata == null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    z3 = z3;
                    metadata = metadata;
                    z3.A0A.A05(metadata);
                    c2 = '\n';
                    break;
                case '\n':
                    cd2 = cd2;
                    iA6i = (int) cd2.A6i();
                    if (!z) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case 11:
                    cd2 = cd2;
                    cd2.ADL(iA6i);
                    c2 = '\f';
                    break;
                case '\f':
                    z3 = z3;
                    bArr = z3.A0D.A00;
                    if (i4 <= 0) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    z5 = true;
                    c2 = 14;
                    break;
                case 14:
                    cd2 = cd2;
                    bArr = bArr;
                    i = 4;
                    if (!cd2.ABg(bArr, z4 ? 1 : 0, 4, z5)) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 15:
                    if (!z) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    cd2 = cd2;
                    cd2.ADL(iA6i + i6);
                    c2 = 17;
                    break;
                case 17:
                    z3.A01 = i5;
                    return z6;
                case 18:
                    cd2 = cd2;
                    cd2.ACg();
                    c2 = 17;
                    break;
                case 19:
                    z3 = z3;
                    z3.A0D.A0Y(z4 ? 1 : 0);
                    iA08 = z3.A0D.A08();
                    if (i5 == 0) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    if (!A06(iA08, i5)) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    iA00 = CI.A00(iA08);
                    if (iA00 != -1) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    i2 = i6 + 1;
                    if (i6 != i3) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    if (!z) {
                        c2 = '%';
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 24:
                    return z4;
                case 25:
                    i4 = 0;
                    i5 = 0;
                    if (!z) {
                        c2 = 28;
                        break;
                    } else {
                        c2 = 26;
                        break;
                    }
                case 26:
                    cd2 = cd2;
                    cd2.ACg();
                    cd2.A3L(iA6i + i2);
                    c2 = 27;
                    break;
                case 27:
                    i6 = i2;
                    c2 = '\f';
                    break;
                case 28:
                    cd2 = cd2;
                    cd2.ADL(z6 ? 1 : 0);
                    c2 = 27;
                    break;
                case 29:
                    i4++;
                    if (i4 != z6) {
                        c2 = ' ';
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 30:
                    z3 = z3;
                    CI.A04(iA08, z3.A0C);
                    i5 = iA08;
                    c2 = 31;
                    break;
                case 31:
                    cd2 = cd2;
                    cd2.A3L(iA00 - 4);
                    c2 = '\f';
                    break;
                case ' ':
                    if (i4 != i) {
                        c2 = 31;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case '!':
                    z5 = false;
                    c2 = 14;
                    break;
                case '\"':
                    e2 = null;
                    c2 = '\b';
                    break;
                case '#':
                    z2 = false;
                    c2 = 6;
                    break;
                case '$':
                    i3 = 131072;
                    c2 = 3;
                    break;
                case '%':
                    throw new AF(A04(0, 24, 46));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final void A7T(CE ce) {
        this.A04 = ce;
        this.A05 = this.A04.ADd(0, 1);
        this.A04.A4w();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00d4 -> B:5:0x0020). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00d7 -> B:5:0x0020). Please report as a decompilation issue!!! */
    @Override // com.facebook.ads.redexgen.X.CC
    public final int AC3(com.facebook.ads.redexgen.X.CD r25, com.facebook.ads.redexgen.X.CJ r26) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.Z3.AC3(com.facebook.ads.redexgen.X.CD, com.facebook.ads.redexgen.X.CJ):int");
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final void ACp(long j, long j2) {
        this.A01 = 0;
        this.A02 = -9223372036854775807L;
        this.A03 = 0L;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final boolean ADM(CD cd) throws InterruptedException, IOException {
        return A07(cd, true);
    }
}
