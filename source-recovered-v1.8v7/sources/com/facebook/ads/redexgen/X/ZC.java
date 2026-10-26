package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class ZC implements CC, CL {
    public static byte[] A0J;
    public static final CF A0K;
    public static final int A0L;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public CE A09;
    public C0544Ii A0A;
    public boolean A0B;
    public Cs[] A0C;
    public long[][] A0D;
    public final int A0E;
    public final C0544Ii A0F;
    public final C0544Ii A0G;
    public final C0544Ii A0H;
    public final ArrayDeque<Z4> A0I;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0J, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 97);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A07() {
        A0J = new byte[]{51, 54, -30, -30, -37, 14, 9, 7, -70, 13, 3, 20, -1, -70, 6, -1, 13, 13, -70, 14, 2, -5, 8, -70, 2, -1, -5, -2, -1, 12, -70, 6, -1, 8, 1, 14, 2, -70, -62, 15, 8, 13, 15, 10, 10, 9, 12, 14, -1, -2, -61, -56};
    }

    static {
        A07();
        A0K = new ZB();
        A0L = C0560Iy.A08(A04(0, 4, 97));
    }

    public ZC() {
        this(0);
    }

    public ZC(int i) {
        this.A0E = i;
        this.A0F = new C0544Ii(16);
        this.A0I = new ArrayDeque<>();
        this.A0H = new C0544Ii(C0540Ie.A02);
        this.A0G = new C0544Ii(4);
        this.A06 = -1;
    }

    private int A00(long preferredSkipAmount) {
        int preferredTrackIndex = 0;
        Cs[] csArr = null;
        Cs cs = null;
        int trackIndex = 0;
        int i = 0;
        long j = 0;
        long j2 = 0;
        ZC zc = this;
        long j3 = Long.MAX_VALUE;
        int i2 = 1;
        int i3 = -1;
        long j4 = Long.MAX_VALUE;
        long j5 = Long.MAX_VALUE;
        int i4 = 1;
        int i5 = -1;
        int i6 = 0;
        int minAccumulatedBytesTrackIndex = 2;
        while (true) {
            switch (minAccumulatedBytesTrackIndex) {
                case 2:
                    zc = zc;
                    csArr = zc.A0C;
                    int minAccumulatedBytesTrackIndex2 = csArr.length;
                    if (i6 >= minAccumulatedBytesTrackIndex2) {
                        minAccumulatedBytesTrackIndex = 16;
                        break;
                    } else {
                        minAccumulatedBytesTrackIndex = 3;
                        break;
                    }
                case 3:
                    csArr = csArr;
                    cs = csArr[i6];
                    preferredTrackIndex = cs.A00;
                    if (preferredTrackIndex != cs.A03.A01) {
                        minAccumulatedBytesTrackIndex = 5;
                        break;
                    } else {
                        minAccumulatedBytesTrackIndex = 4;
                        break;
                    }
                case 4:
                    i6++;
                    minAccumulatedBytesTrackIndex = 2;
                    break;
                case 5:
                    zc = zc;
                    cs = cs;
                    long j6 = cs.A03.A06[preferredTrackIndex];
                    j2 = zc.A0D[i6][preferredTrackIndex];
                    j = j6 - preferredSkipAmount;
                    if (j < 0) {
                        minAccumulatedBytesTrackIndex = 7;
                        break;
                    } else {
                        minAccumulatedBytesTrackIndex = 6;
                        break;
                    }
                case 6:
                    if (j < 262144) {
                        minAccumulatedBytesTrackIndex = 15;
                        break;
                    } else {
                        minAccumulatedBytesTrackIndex = 7;
                        break;
                    }
                case 7:
                    trackIndex = 1;
                    minAccumulatedBytesTrackIndex = 8;
                    break;
                case 8:
                    if (trackIndex != 0) {
                        minAccumulatedBytesTrackIndex = 10;
                        break;
                    } else {
                        minAccumulatedBytesTrackIndex = 9;
                        break;
                    }
                case 9:
                    if (i2 != 0) {
                        minAccumulatedBytesTrackIndex = 12;
                        break;
                    } else {
                        minAccumulatedBytesTrackIndex = 10;
                        break;
                    }
                case 10:
                    if (trackIndex != i2) {
                        minAccumulatedBytesTrackIndex = 13;
                        break;
                    } else {
                        minAccumulatedBytesTrackIndex = 11;
                        break;
                    }
                case 11:
                    if (j >= j3) {
                        minAccumulatedBytesTrackIndex = 13;
                        break;
                    } else {
                        minAccumulatedBytesTrackIndex = 12;
                        break;
                    }
                case 12:
                    i2 = trackIndex;
                    j3 = j;
                    i3 = i6;
                    j4 = j2;
                    minAccumulatedBytesTrackIndex = 13;
                    break;
                case 13:
                    if (j2 >= j5) {
                        minAccumulatedBytesTrackIndex = 4;
                        break;
                    } else {
                        minAccumulatedBytesTrackIndex = 14;
                        break;
                    }
                case 14:
                    j5 = j2;
                    i4 = trackIndex;
                    i5 = i6;
                    minAccumulatedBytesTrackIndex = 4;
                    break;
                case 15:
                    trackIndex = 0;
                    minAccumulatedBytesTrackIndex = 8;
                    break;
                case 16:
                    if (j5 == Long.MAX_VALUE) {
                        minAccumulatedBytesTrackIndex = 19;
                        break;
                    } else {
                        minAccumulatedBytesTrackIndex = 17;
                        break;
                    }
                case 17:
                    if (i4 == 0) {
                        minAccumulatedBytesTrackIndex = 19;
                        break;
                    } else {
                        minAccumulatedBytesTrackIndex = 18;
                        break;
                    }
                case 18:
                    if (j4 >= 10485760 + j5) {
                        minAccumulatedBytesTrackIndex = 21;
                        break;
                    } else {
                        minAccumulatedBytesTrackIndex = 19;
                        break;
                    }
                case 19:
                    i = i3;
                    minAccumulatedBytesTrackIndex = 20;
                    break;
                case 20:
                    return i;
                case 21:
                    i = i5;
                    minAccumulatedBytesTrackIndex = 20;
                    break;
            }
        }
    }

    private int A01(CD cd, CJ cj) throws InterruptedException, IOException {
        CD cd2 = cd;
        int i = 0;
        int nalUnitLengthFieldLength = 0;
        int i2 = 0;
        long skipAmount = 0;
        long skipAmount2 = 0;
        int i3 = 0;
        int i4 = 0;
        long j = 0;
        int i5 = 0;
        int i6 = 0;
        Cs cs = null;
        int i7 = 0;
        long j2 = 0;
        CO co = null;
        ZC zc = this;
        long jA6n = cd2.A6n();
        int nalUnitLengthFieldLengthDiff = zc.A06 == -1 ? 2 : 4;
        while (true) {
            switch (nalUnitLengthFieldLengthDiff) {
                case 2:
                    zc = zc;
                    int sampleIndex = zc.A00(jA6n);
                    zc.A06 = sampleIndex;
                    int sampleIndex2 = zc.A06;
                    if (sampleIndex2 != -1) {
                        nalUnitLengthFieldLengthDiff = 4;
                        break;
                    } else {
                        nalUnitLengthFieldLengthDiff = 3;
                        break;
                    }
                case 3:
                    return -1;
                case 4:
                    zc = zc;
                    cs = zc.A0C[zc.A06];
                    co = cs.A01;
                    i = cs.A00;
                    skipAmount = cs.A03.A06[i];
                    i6 = cs.A03.A05[i];
                    int sampleIndex3 = zc.A04;
                    skipAmount2 = (skipAmount - jA6n) + sampleIndex3;
                    i7 = 1;
                    if (skipAmount2 < 0) {
                        nalUnitLengthFieldLengthDiff = 8;
                        break;
                    } else {
                        nalUnitLengthFieldLengthDiff = 5;
                        break;
                    }
                case 5:
                    if (skipAmount2 < 262144) {
                        nalUnitLengthFieldLengthDiff = 9;
                        break;
                    } else {
                        nalUnitLengthFieldLengthDiff = 6;
                        break;
                    }
                case 6:
                    j = skipAmount;
                    nalUnitLengthFieldLengthDiff = 7;
                    break;
                case 7:
                    cj.A00 = j;
                    return 1;
                case 8:
                    j = skipAmount;
                    nalUnitLengthFieldLengthDiff = 7;
                    break;
                case 9:
                    cs = cs;
                    if (cs.A02.A02 != i7) {
                        nalUnitLengthFieldLengthDiff = 17;
                        break;
                    } else {
                        nalUnitLengthFieldLengthDiff = 10;
                        break;
                    }
                case 10:
                    j2 = skipAmount2 + 8;
                    i6 -= 8;
                    nalUnitLengthFieldLengthDiff = 11;
                    break;
                case 11:
                    cd2 = cd2;
                    cs = cs;
                    cd2.ADL((int) j2);
                    if (cs.A02.A01 == 0) {
                        nalUnitLengthFieldLengthDiff = 18;
                        break;
                    } else {
                        nalUnitLengthFieldLengthDiff = 12;
                        break;
                    }
                case 12:
                    zc = zc;
                    cs = cs;
                    byte[] bArr = zc.A0G.A00;
                    bArr[0] = 0;
                    bArr[i7] = 0;
                    bArr[2] = 0;
                    int sampleIndex4 = cs.A02.A01;
                    i5 = sampleIndex4;
                    int sampleIndex5 = cs.A02.A01;
                    i3 = 4 - sampleIndex5;
                    nalUnitLengthFieldLengthDiff = 13;
                    break;
                case 13:
                    zc = zc;
                    int nalUnitLengthFieldLengthDiff2 = zc.A04;
                    if (nalUnitLengthFieldLengthDiff2 >= i6) {
                        nalUnitLengthFieldLengthDiff = 21;
                        break;
                    } else {
                        nalUnitLengthFieldLengthDiff = 14;
                        break;
                    }
                case 14:
                    zc = zc;
                    i2 = zc.A05;
                    if (i2 != 0) {
                        nalUnitLengthFieldLengthDiff = 16;
                        break;
                    } else {
                        nalUnitLengthFieldLengthDiff = 15;
                        break;
                    }
                case 15:
                    zc = zc;
                    cd2 = cd2;
                    co = co;
                    cd2.readFully(zc.A0G.A00, i3, i5);
                    zc.A0G.A0Y(0);
                    zc.A05 = zc.A0G.A0H();
                    zc.A0H.A0Y(0);
                    co.ACk(zc.A0H, 4);
                    zc.A04 += 4;
                    i6 += i3;
                    nalUnitLengthFieldLengthDiff = 13;
                    break;
                case 16:
                    zc = zc;
                    cd2 = cd2;
                    co = co;
                    int writtenBytes = co.ACj(cd2, i2, false);
                    zc.A04 += writtenBytes;
                    zc.A05 -= writtenBytes;
                    nalUnitLengthFieldLengthDiff = 13;
                    break;
                case 17:
                    j2 = skipAmount2;
                    nalUnitLengthFieldLengthDiff = 11;
                    break;
                case 18:
                    zc = zc;
                    nalUnitLengthFieldLength = zc.A04;
                    if (nalUnitLengthFieldLength >= i6) {
                        nalUnitLengthFieldLengthDiff = 20;
                        break;
                    } else {
                        nalUnitLengthFieldLengthDiff = 19;
                        break;
                    }
                case 19:
                    zc = zc;
                    cd2 = cd2;
                    co = co;
                    int iACj = co.ACj(cd2, i6 - nalUnitLengthFieldLength, false);
                    zc.A04 += iACj;
                    zc.A05 -= iACj;
                    nalUnitLengthFieldLengthDiff = 18;
                    break;
                case 20:
                    i4 = i6;
                    nalUnitLengthFieldLengthDiff = 22;
                    break;
                case 21:
                    i4 = i6;
                    nalUnitLengthFieldLengthDiff = 22;
                    break;
                case 22:
                    ZC zc2 = zc;
                    Cs cs2 = cs;
                    long j3 = cs2.A03.A07[i];
                    int sampleSize = cs2.A03.A04[i];
                    co.ACl(j3, sampleSize, i4, 0, null);
                    cs2.A00++;
                    zc2.A06 = -1;
                    zc2.A04 = 0;
                    zc2.A05 = 0;
                    return 0;
            }
        }
    }

    public static int A02(D1 d1, long j) {
        int iA00 = d1.A00(j);
        if (iA00 == -1) {
            return d1.A01(j);
        }
        return iA00;
    }

    public static long A03(D1 d1, long j, long j2) {
        int iA02 = A02(d1, j);
        if (iA02 == -1) {
            return j2;
        }
        return Math.min(d1.A06[iA02], j2);
    }

    private ArrayList<D1> A05(Z4 z4, CG cg, boolean z) throws AF {
        Z4 z42 = z4;
        CG cg2 = cg;
        ZC zc = this;
        D1 trackSampleTable = null;
        C0416Cy c0416CyA0C = null;
        Z4 z43 = null;
        ArrayList<D1> arrayList = new ArrayList<>();
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    z42 = z42;
                    if (i >= z42.A01.size()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z42 = z42;
                    z43 = z42.A01.get(i);
                    if (((AbstractC0402Cd) z43).A00 == AbstractC0402Cd.A1L) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i++;
                    c2 = 2;
                    break;
                case 5:
                    zc = zc;
                    z42 = z42;
                    z43 = z43;
                    c0416CyA0C = C0407Ci.A0C(z43, z42.A07(AbstractC0402Cd.A0n), -9223372036854775807L, null, z, zc.A0B);
                    if (c0416CyA0C != null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 6:
                    cg2 = cg2;
                    z43 = z43;
                    c0416CyA0C = c0416CyA0C;
                    trackSampleTable = C0407Ci.A0E(c0416CyA0C, z43.A06(AbstractC0402Cd.A0d).A06(AbstractC0402Cd.A0h).A06(AbstractC0402Cd.A16), cg2);
                    if (trackSampleTable.A01 != 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 7:
                    arrayList = arrayList;
                    trackSampleTable = trackSampleTable;
                    arrayList.add(trackSampleTable);
                    c2 = 4;
                    break;
                case '\b':
                    return arrayList;
            }
        }
    }

    private void A06() {
        this.A03 = 0;
        this.A00 = 0;
    }

    private void A08(long j) throws AF {
        ZC zc = this;
        int i = 0;
        Z4 z4Pop = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    zc = zc;
                    i = 2;
                    if (!zc.A0I.isEmpty()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 3:
                    zc = zc;
                    if (zc.A0I.peek().A00 != j) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    zc = zc;
                    z4Pop = zc.A0I.pop();
                    if (((AbstractC0402Cd) z4Pop).A00 != AbstractC0402Cd.A0j) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    zc = zc;
                    z4Pop = z4Pop;
                    zc.A0A(z4Pop);
                    zc.A0I.clear();
                    zc.A03 = i;
                    c2 = 2;
                    break;
                case 6:
                    zc = zc;
                    if (!zc.A0I.isEmpty()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 2;
                        break;
                    }
                case 7:
                    zc = zc;
                    z4Pop = z4Pop;
                    zc.A0I.peek().A08(z4Pop);
                    c2 = 2;
                    break;
                case '\b':
                    zc = zc;
                    if (zc.A03 == i) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    zc = zc;
                    zc.A06();
                    c2 = '\n';
                    break;
                case '\n':
                    return;
            }
        }
    }

    private void A09(long j) {
        int iA00 = 0;
        D1 d1 = null;
        Cs cs = null;
        Cs[] csArr = this.A0C;
        int length = csArr.length;
        int i = 0;
        int sampleIndex = 2;
        while (true) {
            switch (sampleIndex) {
                case 2:
                    if (i >= length) {
                        sampleIndex = 6;
                        break;
                    } else {
                        sampleIndex = 3;
                        break;
                    }
                case 3:
                    csArr = csArr;
                    cs = csArr[i];
                    d1 = cs.A03;
                    iA00 = d1.A00(j);
                    if (iA00 != -1) {
                        sampleIndex = 5;
                        break;
                    } else {
                        sampleIndex = 4;
                        break;
                    }
                case 4:
                    d1 = d1;
                    iA00 = d1.A01(j);
                    sampleIndex = 5;
                    break;
                case 5:
                    cs = cs;
                    cs.A00 = iA00;
                    i++;
                    sampleIndex = 2;
                    break;
                case 6:
                    return;
            }
        }
    }

    private void A0A(Z4 z4) throws AF {
        Z4 z42 = z4;
        D1 d1 = null;
        CG cg = null;
        ArrayList<D1> arrayList = null;
        long j = 0;
        Metadata metadataA0F = null;
        C0416Cy c0416Cy = null;
        boolean z = false;
        boolean z2 = false;
        Format formatA0O = null;
        boolean z3 = false;
        ArrayList<D1> arrayListA05 = null;
        int size = 0;
        int i = 0;
        Metadata metadata = null;
        Cs cs = null;
        ZC zc = this;
        int size2 = -1;
        long jMax = -9223372036854775807L;
        ArrayList arrayList2 = new ArrayList();
        CG cg2 = new CG();
        Z5 z5A07 = z42.A07(AbstractC0402Cd.A1P);
        int i2 = z5A07 != null ? 2 : 9;
        while (true) {
            switch (i2) {
                case 2:
                    zc = zc;
                    z5A07 = z5A07;
                    metadataA0F = C0407Ci.A0F(z5A07, zc.A0B);
                    if (metadataA0F == null) {
                        i2 = 4;
                        break;
                    } else {
                        i2 = 3;
                        break;
                    }
                case 3:
                    cg2 = cg2;
                    metadataA0F = metadataA0F;
                    cg2.A05(metadataA0F);
                    i2 = 4;
                    break;
                case 4:
                    metadataA0F = metadataA0F;
                    metadata = metadataA0F;
                    i2 = 5;
                    break;
                case 5:
                    zc = zc;
                    z3 = true;
                    if ((zc.A0E & 1) == 0) {
                        i2 = 8;
                        break;
                    } else {
                        i2 = 6;
                        break;
                    }
                case 6:
                    z = true;
                    i2 = 7;
                    break;
                case 7:
                    z2 = z;
                    i2 = 10;
                    break;
                case 8:
                    z = false;
                    i2 = 7;
                    break;
                case 9:
                    metadata = null;
                    i2 = 5;
                    break;
                case 10:
                    try {
                        zc = zc;
                        z42 = z42;
                        cg2 = cg2;
                        arrayListA05 = zc.A05(z42, cg2, z2);
                        i2 = 13;
                        break;
                    } catch (Z8 unused) {
                        cg2 = new CG();
                        arrayListA05 = zc.A05(z42, cg2, z3);
                        i2 = 13;
                        break;
                    }
                case 13:
                    arrayListA05 = arrayListA05;
                    size = arrayListA05.size();
                    i = 0;
                    i2 = 14;
                    break;
                case 14:
                    if (i >= size) {
                        i2 = 27;
                        break;
                    } else {
                        i2 = 15;
                        break;
                    }
                case 15:
                    zc = zc;
                    arrayListA05 = arrayListA05;
                    d1 = arrayListA05.get(i);
                    c0416Cy = d1.A03;
                    arrayList = arrayListA05;
                    CE ce = zc.A09;
                    int i3 = c0416Cy.A03;
                    cs = new Cs(c0416Cy, d1, ce.ADd(i, i3));
                    int i4 = d1.A00;
                    formatA0O = c0416Cy.A07.A0J(i4 + 30);
                    if (c0416Cy.A03 != 1) {
                        i2 = 20;
                        break;
                    } else {
                        i2 = 16;
                        break;
                    }
                case 16:
                    cg2 = cg2;
                    if (!cg2.A03()) {
                        i2 = 18;
                        break;
                    } else {
                        i2 = 17;
                        break;
                    }
                case 17:
                    cg2 = cg2;
                    formatA0O = formatA0O.A0K(cg2.A00, cg2.A01);
                    i2 = 18;
                    break;
                case 18:
                    if (metadata == null) {
                        i2 = 20;
                        break;
                    } else {
                        i2 = 19;
                        break;
                    }
                case 19:
                    formatA0O = formatA0O.A0O(metadata);
                    i2 = 20;
                    break;
                case 20:
                    cg2 = cg2;
                    c0416Cy = c0416Cy;
                    cs = cs;
                    formatA0O = formatA0O;
                    cs.A01.A5A(formatA0O);
                    cg = cg2;
                    if (c0416Cy.A04 == -9223372036854775807L) {
                        i2 = 26;
                        break;
                    } else {
                        i2 = 21;
                        break;
                    }
                case 21:
                    c0416Cy = c0416Cy;
                    j = c0416Cy.A04;
                    i2 = 22;
                    break;
                case 22:
                    c0416Cy = c0416Cy;
                    jMax = Math.max(jMax, j);
                    if (c0416Cy.A03 != 2) {
                        i2 = 25;
                        break;
                    } else {
                        i2 = 23;
                        break;
                    }
                case 23:
                    if (size2 != -1) {
                        i2 = 25;
                        break;
                    } else {
                        i2 = 24;
                        break;
                    }
                case 24:
                    arrayList2 = arrayList2;
                    size2 = arrayList2.size();
                    i2 = 25;
                    break;
                case 25:
                    arrayList2 = arrayList2;
                    arrayList = arrayList;
                    cs = cs;
                    cg = cg;
                    arrayList2.add(cs);
                    i++;
                    cg2 = cg;
                    arrayListA05 = arrayList;
                    i2 = 14;
                    break;
                case 26:
                    d1 = d1;
                    j = d1.A02;
                    i2 = 22;
                    break;
                case 27:
                    ZC zc2 = zc;
                    ArrayList arrayList3 = arrayList2;
                    zc2.A02 = size2;
                    zc2.A08 = jMax;
                    zc2.A0C = (Cs[]) arrayList3.toArray(new Cs[arrayList3.size()]);
                    zc2.A0D = A0G(zc2.A0C);
                    zc2.A09.A4w();
                    zc2.A09.ACq(zc2);
                    return;
            }
        }
    }

    public static boolean A0B(int i) {
        boolean z = false;
        char c2 = i != AbstractC0402Cd.A0j ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    if (i == AbstractC0402Cd.A1L) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i == AbstractC0402Cd.A0d) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i == AbstractC0402Cd.A0h) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i == AbstractC0402Cd.A16) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (i != AbstractC0402Cd.A0N) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    z = true;
                    c2 = '\b';
                    break;
                case '\b':
                    return z;
                case '\t':
                    z = false;
                    c2 = '\b';
                    break;
            }
        }
    }

    public static boolean A0C(int i) {
        boolean z = false;
        char c2 = i != AbstractC0402Cd.A0c ? (char) 2 : (char) 17;
        while (true) {
            switch (c2) {
                case 2:
                    if (i == AbstractC0402Cd.A0n) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i == AbstractC0402Cd.A0V) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i == AbstractC0402Cd.A1A) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i == AbstractC0402Cd.A1D) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (i == AbstractC0402Cd.A1B) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (i == AbstractC0402Cd.A0C) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    if (i == AbstractC0402Cd.A0O) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    if (i == AbstractC0402Cd.A19) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    if (i == AbstractC0402Cd.A1C) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    if (i == AbstractC0402Cd.A1E) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    if (i == AbstractC0402Cd.A17) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    if (i == AbstractC0402Cd.A0B) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    if (i == AbstractC0402Cd.A1J) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    if (i == AbstractC0402Cd.A0U) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    if (i != AbstractC0402Cd.A1P) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    z = true;
                    c2 = 18;
                    break;
                case 18:
                    return z;
                case 19:
                    z = false;
                    c2 = 18;
                    break;
            }
        }
    }

    private boolean A0D(CD cd) throws InterruptedException, IOException {
        CD cd2 = cd;
        ZC zc = this;
        long j = 0;
        long jA6U = 0;
        long j2 = 0;
        boolean z = false;
        boolean z2 = false;
        long jA6n = 0;
        boolean z3 = false;
        char c2 = zc.A00 == 0 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    zc = zc;
                    cd2 = cd2;
                    z3 = false;
                    z3 = false;
                    if (!cd2.AC8(zc.A0F.A00, 0, 8, true)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    return z3;
                case 4:
                    zc = zc;
                    zc.A00 = 8;
                    zc.A0F.A0Y(z3 ? 1 : 0);
                    zc.A07 = zc.A0F.A0M();
                    zc.A01 = zc.A0F.A08();
                    c2 = 5;
                    break;
                case 5:
                    zc = zc;
                    j2 = zc.A07;
                    if (j2 != 1) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    zc = zc;
                    cd2 = cd2;
                    cd2.readFully(zc.A0F.A00, 8, 8);
                    zc.A00 += 8;
                    zc.A07 = zc.A0F.A0N();
                    c2 = 7;
                    break;
                case 7:
                    zc = zc;
                    if (zc.A07 < zc.A00) {
                        c2 = 28;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    zc = zc;
                    if (!A0B(zc.A01)) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    zc = zc;
                    cd2 = cd2;
                    jA6n = (cd2.A6n() + zc.A07) - zc.A00;
                    zc.A0I.push(new Z4(zc.A01, jA6n));
                    if (zc.A07 != zc.A00) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    zc = zc;
                    zc.A08(jA6n);
                    c2 = 11;
                    break;
                case 11:
                    return true;
                case '\f':
                    zc = zc;
                    zc.A06();
                    c2 = 11;
                    break;
                case '\r':
                    zc = zc;
                    if (!A0C(zc.A01)) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    zc = zc;
                    if (zc.A00 != 8) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    z2 = true;
                    c2 = 16;
                    break;
                case 16:
                    zc = zc;
                    IJ.A04(z2);
                    if (zc.A07 > 2147483647L) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    z = true;
                    c2 = 18;
                    break;
                case 18:
                    zc = zc;
                    IJ.A04(z);
                    zc.A0A = new C0544Ii((int) zc.A07);
                    System.arraycopy(zc.A0F.A00, z3 ? 1 : 0, zc.A0A.A00, z3 ? 1 : 0, 8);
                    zc.A03 = 1;
                    c2 = 11;
                    break;
                case 19:
                    z = false;
                    c2 = 18;
                    break;
                case 20:
                    z2 = false;
                    c2 = 16;
                    break;
                case 21:
                    zc = zc;
                    zc.A0A = null;
                    zc.A03 = 1;
                    c2 = 11;
                    break;
                case 22:
                    if (j2 != 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    cd2 = cd2;
                    jA6U = cd2.A6U();
                    j = -1;
                    if (jA6U != -1) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 24:
                    zc = zc;
                    if (!zc.A0I.isEmpty()) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 26;
                        break;
                    }
                case 25:
                    zc = zc;
                    jA6U = zc.A0I.peek().A00;
                    c2 = 26;
                    break;
                case 26:
                    if (jA6U == j) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 27;
                        break;
                    }
                case 27:
                    zc = zc;
                    cd2 = cd2;
                    zc.A07 = (jA6U - cd2.A6n()) + zc.A00;
                    c2 = 7;
                    break;
                case 28:
                    throw new AF(A04(4, 48, 57));
            }
        }
    }

    private boolean A0E(CD cd, CJ cj) throws InterruptedException, IOException {
        ZC zc = this;
        boolean z = false;
        long j = zc.A07 - zc.A00;
        long jA6n = cd.A6n() + j;
        boolean z2 = false;
        C0544Ii c0544Ii = zc.A0A;
        char c2 = c0544Ii != null ? (char) 2 : (char) 11;
        while (true) {
            switch (c2) {
                case 2:
                    zc = zc;
                    cd = cd;
                    c0544Ii = c0544Ii;
                    cd.readFully(c0544Ii.A00, zc.A00, (int) j);
                    if (zc.A01 != AbstractC0402Cd.A0U) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    zc = zc;
                    boolean seekRequired = A0F(zc.A0A);
                    zc.A0B = seekRequired;
                    c2 = 4;
                    break;
                case 4:
                    zc = zc;
                    zc.A08(jA6n);
                    if (!z2) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    zc = zc;
                    if (zc.A03 == 2) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    z = true;
                    c2 = 7;
                    break;
                case 7:
                    return z;
                case '\b':
                    z = false;
                    c2 = 7;
                    break;
                case '\t':
                    zc = zc;
                    boolean seekRequired2 = zc.A0I.isEmpty();
                    if (!seekRequired2) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case '\n':
                    zc = zc;
                    zc.A0I.peek().A09(new Z5(zc.A01, zc.A0A));
                    c2 = 4;
                    break;
                case 11:
                    if (j >= 262144) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    cd = cd;
                    cd.ADL((int) j);
                    c2 = 4;
                    break;
                case '\r':
                    cd = cd;
                    cj = cj;
                    cj.A00 = cd.A6n() + j;
                    z2 = true;
                    c2 = 4;
                    break;
            }
        }
    }

    public static boolean A0F(C0544Ii c0544Ii) {
        c0544Ii.A0Y(8);
        char c2 = c0544Ii.A08() == A0L ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return true;
                case 3:
                    c0544Ii = c0544Ii;
                    c0544Ii.A0Z(4);
                    c2 = 4;
                    break;
                case 4:
                    c0544Ii = c0544Ii;
                    if (c0544Ii.A04() <= 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0544Ii = c0544Ii;
                    if (c0544Ii.A08() != A0L) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return true;
                case 7:
                    return false;
            }
        }
    }

    public static long[][] A0G(Cs[] csArr) {
        Cs[] csArr2 = csArr;
        int i = 0;
        long j = 0;
        boolean z = false;
        long minTimeUs = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        long[][] jArr = new long[csArr2.length][];
        int[] iArr = new int[csArr2.length];
        long[] jArr2 = new long[csArr2.length];
        boolean[] zArr = new boolean[csArr2.length];
        int i5 = 0;
        int minTimeTrackIndex = 2;
        while (true) {
            switch (minTimeTrackIndex) {
                case 2:
                    csArr2 = csArr2;
                    int i6 = csArr2.length;
                    if (i5 >= i6) {
                        minTimeTrackIndex = 4;
                        break;
                    } else {
                        minTimeTrackIndex = 3;
                        break;
                    }
                case 3:
                    csArr2 = csArr2;
                    jArr = jArr;
                    jArr2 = jArr2;
                    jArr[i5] = new long[csArr2[i5].A03.A01];
                    long accumulatedSampleSize = csArr2[i5].A03.A07[0];
                    jArr2[i5] = accumulatedSampleSize;
                    i5++;
                    minTimeTrackIndex = 2;
                    break;
                case 4:
                    j = 0;
                    i4 = 0;
                    minTimeTrackIndex = 5;
                    break;
                case 5:
                    csArr2 = csArr2;
                    int trackSampleIndex = csArr2.length;
                    if (i4 >= trackSampleIndex) {
                        minTimeTrackIndex = 15;
                        break;
                    } else {
                        minTimeTrackIndex = 6;
                        break;
                    }
                case 6:
                    minTimeUs = Long.MAX_VALUE;
                    i = -1;
                    i3 = 0;
                    minTimeTrackIndex = 7;
                    break;
                case 7:
                    csArr2 = csArr2;
                    int i7 = csArr2.length;
                    if (i3 >= i7) {
                        minTimeTrackIndex = 12;
                        break;
                    } else {
                        minTimeTrackIndex = 8;
                        break;
                    }
                case 8:
                    zArr = zArr;
                    if (!zArr[i3]) {
                        minTimeTrackIndex = 9;
                        break;
                    } else {
                        minTimeTrackIndex = 11;
                        break;
                    }
                case 9:
                    jArr2 = jArr2;
                    if (jArr2[i3] > minTimeUs) {
                        minTimeTrackIndex = 11;
                        break;
                    } else {
                        minTimeTrackIndex = 10;
                        break;
                    }
                case 10:
                    jArr2 = jArr2;
                    i = i3;
                    minTimeUs = jArr2[i3];
                    minTimeTrackIndex = 11;
                    break;
                case 11:
                    i3++;
                    minTimeTrackIndex = 7;
                    break;
                case 12:
                    csArr2 = csArr2;
                    jArr = jArr;
                    iArr = iArr;
                    int i8 = iArr[i];
                    jArr[i][i8] = j;
                    int trackSampleIndex2 = csArr2[i].A03.A05[i8];
                    j += trackSampleIndex2;
                    z = true;
                    i2 = i8 + 1;
                    iArr[i] = i2;
                    int trackSampleIndex3 = jArr[i].length;
                    if (i2 >= trackSampleIndex3) {
                        minTimeTrackIndex = 14;
                        break;
                    } else {
                        minTimeTrackIndex = 13;
                        break;
                    }
                case 13:
                    csArr2 = csArr2;
                    jArr2 = jArr2;
                    jArr2[i] = csArr2[i].A03.A07[i2];
                    minTimeTrackIndex = 5;
                    break;
                case 14:
                    zArr = zArr;
                    zArr[i] = z;
                    i4++;
                    minTimeTrackIndex = 5;
                    break;
                case 15:
                    return jArr;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CL
    public final long A65() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.CL
    public final CK A6t(long j) {
        CM firstSeekPoint = null;
        D1 d1 = null;
        long jA03 = 0;
        long j2 = 0;
        int iA02 = 0;
        int secondSampleIndex = 0;
        int i = 0;
        int iA01 = 0;
        int i2 = 0;
        Cs[] csArr = null;
        long jA032 = 0;
        D1 d12 = null;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        ZC zc = this;
        Cs[] csArr2 = zc.A0C;
        char c2 = csArr2.length == 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return new CK(CM.A03);
                case 3:
                    zc = zc;
                    j5 = -9223372036854775807L;
                    j3 = -1;
                    i2 = zc.A02;
                    i = -1;
                    if (i2 == -1) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    csArr2 = csArr2;
                    d12 = csArr2[i2].A03;
                    iA02 = A02(d12, j);
                    if (iA02 != i) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return new CK(CM.A03);
                case 6:
                    j6 = j;
                    j4 = Long.MAX_VALUE;
                    c2 = '\f';
                    break;
                case 7:
                    d12 = d12;
                    j6 = d12.A07[iA02];
                    j4 = d12.A06[iA02];
                    if (j6 >= j) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    d12 = d12;
                    if (iA02 >= d12.A01 - 1) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    d12 = d12;
                    iA01 = d12.A01(j);
                    if (iA01 == i) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    if (iA01 == iA02) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    d12 = d12;
                    j5 = d12.A07[iA01];
                    j3 = d12.A06[iA01];
                    c2 = '\f';
                    break;
                case '\f':
                    secondSampleIndex = 0;
                    jA03 = j3;
                    jA032 = j4;
                    c2 = '\r';
                    break;
                case '\r':
                    zc = zc;
                    csArr = zc.A0C;
                    j2 = -9223372036854775807L;
                    if (secondSampleIndex >= csArr.length) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    zc = zc;
                    if (secondSampleIndex == zc.A02) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    csArr = csArr;
                    d1 = csArr[secondSampleIndex].A03;
                    jA032 = A03(d1, j6, jA032);
                    if (j5 == j2) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    d1 = d1;
                    jA03 = A03(d1, j5, jA03);
                    c2 = 17;
                    break;
                case 17:
                    secondSampleIndex++;
                    c2 = '\r';
                    break;
                case 18:
                    firstSeekPoint = new CM(j6, jA032);
                    if (j5 != j2) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    return new CK(firstSeekPoint);
                case 20:
                    return new CK(firstSeekPoint, new CM(j5, jA03));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final void A7T(CE ce) {
        this.A09 = ce;
    }

    @Override // com.facebook.ads.redexgen.X.CL
    public final boolean A7n() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final int AC3(CD cd, CJ cj) throws InterruptedException, IOException {
        ZC zc = this;
        int i = 0;
        int i2 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    zc = zc;
                    i2 = zc.A03;
                    if (i2 == 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    i = 1;
                    if (i2 == 1) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i2 != 2) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return zc.A01(cd, cj);
                case 6:
                    zc = zc;
                    cd = cd;
                    cj = cj;
                    if (!zc.A0E(cd, cj)) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return i;
                case '\b':
                    zc = zc;
                    cd = cd;
                    if (!zc.A0D(cd)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 2;
                        break;
                    }
                case '\t':
                    return -1;
                case '\n':
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final void ACp(long j, long j2) {
        ZC zc = this;
        zc.A0I.clear();
        zc.A00 = 0;
        zc.A06 = -1;
        zc.A04 = 0;
        zc.A05 = 0;
        char c2 = j == 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    zc = zc;
                    zc.A06();
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    zc = zc;
                    if (zc.A0C == null) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    zc = zc;
                    zc.A09(j2);
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final boolean ADM(CD cd) throws InterruptedException, IOException {
        return C0415Cw.A04(cd);
    }
}
