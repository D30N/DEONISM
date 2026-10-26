package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.util.Pair;

/* loaded from: assets/audience_network.dex */
public final class AE {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public AC A04;
    public AC A05;
    public AC A06;
    public AbstractC0352Ab A07;
    public Object A08;
    public boolean A09;
    public final AZ A0A = new AZ();
    public final C0351Aa A0B = new C0351Aa();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 22 out of bounds for length 22
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private AD A02(int i, long j, long j2) {
        F8 f8 = new F8(i, j2);
        this.A07.A09(f8.A02, this.A0A);
        int iA04 = this.A0A.A04(j);
        long jA09 = iA04 == -1 ? Long.MIN_VALUE : this.A0A.A09(iA04);
        boolean zA0A = A0A(f8, jA09);
        return new AD(f8, j, jA09, -9223372036854775807L, jA09 == Long.MIN_VALUE ? this.A0A.A07() : jA09, zA0A, A0B(f8, zA0A));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private AD A04(AD ad, F8 f8) {
        long j = ad.A03;
        long j2 = ad.A02;
        boolean zA0A = A0A(f8, j2);
        boolean zA0B = A0B(f8, zA0A);
        this.A07.A09(f8.A02, this.A0A);
        return new AD(f8, j, j2, ad.A00, f8.A01() ? this.A0A.A0A(f8.A00, f8.A01) : j2 == Long.MIN_VALUE ? this.A0A.A07() : j2, zA0A, zA0B);
    }

    private long A00(int i) {
        AE ae = this;
        AC acA0E = null;
        int iA04 = 0;
        int iA042 = 0;
        AC acA0E2 = null;
        Object obj = ae.A07.A0A(i, ae.A0A, true).A03;
        int i2 = ae.A0A.A00;
        Object obj2 = ae.A08;
        int oldFrontPeriodIndex = obj2 != null ? 2 : 5;
        while (true) {
            switch (oldFrontPeriodIndex) {
                case 2:
                    ae = ae;
                    obj2 = obj2;
                    iA042 = ae.A07.A04(obj2);
                    if (iA042 == -1) {
                        oldFrontPeriodIndex = 5;
                        break;
                    } else {
                        oldFrontPeriodIndex = 3;
                        break;
                    }
                case 3:
                    ae = ae;
                    if (ae.A07.A09(iA042, ae.A0A).A00 != i2) {
                        oldFrontPeriodIndex = 5;
                        break;
                    } else {
                        oldFrontPeriodIndex = 4;
                        break;
                    }
                case 4:
                    return ae.A03;
                case 5:
                    ae = ae;
                    acA0E2 = ae.A0E();
                    oldFrontPeriodIndex = 6;
                    break;
                case 6:
                    acA0E2 = acA0E2;
                    if (acA0E2 == null) {
                        oldFrontPeriodIndex = 10;
                        break;
                    } else {
                        oldFrontPeriodIndex = 7;
                        break;
                    }
                case 7:
                    obj = obj;
                    acA0E2 = acA0E2;
                    if (!acA0E2.A09.equals(obj)) {
                        oldFrontPeriodIndex = 9;
                        break;
                    } else {
                        oldFrontPeriodIndex = 8;
                        break;
                    }
                case 8:
                    return acA0E2.A02.A04.A03;
                case 9:
                    acA0E2 = acA0E2.A01;
                    oldFrontPeriodIndex = 6;
                    break;
                case 10:
                    ae = ae;
                    acA0E = ae.A0E();
                    oldFrontPeriodIndex = 11;
                    break;
                case 11:
                    acA0E = acA0E;
                    if (acA0E == null) {
                        oldFrontPeriodIndex = 16;
                        break;
                    } else {
                        oldFrontPeriodIndex = 12;
                        break;
                    }
                case 12:
                    ae = ae;
                    acA0E = acA0E;
                    iA04 = ae.A07.A04(acA0E.A09);
                    if (iA04 == -1) {
                        oldFrontPeriodIndex = 15;
                        break;
                    } else {
                        oldFrontPeriodIndex = 13;
                        break;
                    }
                case 13:
                    ae = ae;
                    if (ae.A07.A09(iA04, ae.A0A).A00 != i2) {
                        oldFrontPeriodIndex = 15;
                        break;
                    } else {
                        oldFrontPeriodIndex = 14;
                        break;
                    }
                case 14:
                    return acA0E.A02.A04.A03;
                case 15:
                    acA0E = acA0E.A01;
                    oldFrontPeriodIndex = 11;
                    break;
                case 16:
                    AE ae2 = ae;
                    long j = ae2.A02;
                    ae2.A02 = 1 + j;
                    return j;
            }
        }
    }

    private AD A01(int i, int i2, int i3, long durationUs, long j) {
        long jA06;
        F8 f8 = new F8(i, i2, i3, j);
        boolean zA0A = A0A(f8, Long.MIN_VALUE);
        boolean zA0B = A0B(f8, zA0A);
        long jA0A = this.A07.A09(f8.A02, this.A0A).A0A(f8.A00, f8.A01);
        if (i3 == this.A0A.A02(i2)) {
            jA06 = this.A0A.A06();
        } else {
            jA06 = 0;
        }
        return new AD(f8, jA06, Long.MIN_VALUE, durationUs, jA0A, zA0A, zA0B);
    }

    @Nullable
    private AD A03(AC ac, long j) {
        AC ac2 = ac;
        AE ae = this;
        int iA02 = 0;
        int nextPeriodIndex = 0;
        long j2 = 0;
        AD adA01 = null;
        AD mediaPeriodInfo = null;
        int iA03 = 0;
        F8 periodId = null;
        int i = 0;
        long j3 = 0;
        int iA022 = 0;
        long jLongValue = 0;
        int iA00 = 0;
        long j4 = 0;
        Object obj = null;
        int iA032 = 0;
        Pair<Integer, Long> pairA08 = null;
        int iA05 = 0;
        int i2 = 0;
        int iA01 = 0;
        int iIntValue = 0;
        long j5 = 0;
        int i3 = 0;
        long j6 = 0;
        int i4 = 0;
        AE ae2 = ae;
        AC ac3 = ac2;
        AD ad = ac3.A02;
        char c2 = ad.A06 ? (char) 2 : (char) 14;
        while (true) {
            switch (c2) {
                case 2:
                    ae2 = ae2;
                    ad = ad;
                    iA032 = ae2.A07.A03(ad.A04.A02, ae2.A0A, ae2.A0B, ae2.A01, ae2.A09);
                    if (iA032 != -1) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return (AD) null;
                case 4:
                    ae2 = ae2;
                    ad = ad;
                    i2 = ae2.A07.A0A(iA032, ae2.A0A, true).A00;
                    obj = ae2.A0A.A03;
                    j6 = ad.A04.A03;
                    if (ae2.A07.A0B(i2, ae2.A0B).A00 != iA032) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    ac2 = ac2;
                    ae2 = ae2;
                    ad = ad;
                    pairA08 = ae2.A07.A08(ae2.A0B, ae2.A0A, i2, -9223372036854775807L, Math.max(0L, (ac2.A07() + ad.A01) - j));
                    if (pairA08 != null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return (AD) null;
                case 7:
                    ac3 = ac3;
                    pairA08 = pairA08;
                    iIntValue = ((Integer) pairA08.first).intValue();
                    jLongValue = ((Long) pairA08.second).longValue();
                    if (ac3.A01 == null) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    ac3 = ac3;
                    obj = obj;
                    if (!ac3.A01.A09.equals(obj)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    ac3 = ac3;
                    j5 = ac3.A01.A02.A04.A03;
                    i4 = iIntValue;
                    c2 = '\n';
                    break;
                case '\n':
                    j3 = j5;
                    j4 = jLongValue;
                    i = i4;
                    c2 = '\r';
                    break;
                case 11:
                    ae2 = ae2;
                    j5 = ae2.A02;
                    i4 = iIntValue;
                    ae2.A02 = j5 + 1;
                    c2 = '\n';
                    break;
                case '\f':
                    j3 = j6;
                    j4 = 0;
                    i = iA032;
                    c2 = '\r';
                    break;
                case '\r':
                    AE ae3 = ae;
                    return ae3.A06(ae3.A07(i, j4, j3), j4, j4);
                case 14:
                    ae2 = ae2;
                    ad = ad;
                    periodId = ad.A04;
                    ae2.A07.A09(periodId.A02, ae2.A0A);
                    if (!periodId.A01()) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    ae2 = ae2;
                    periodId = periodId;
                    i3 = periodId.A00;
                    iA01 = ae2.A0A.A01(i3);
                    if (iA01 != -1) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    return (AD) null;
                case 17:
                    ae2 = ae2;
                    periodId = periodId;
                    iA03 = ae2.A0A.A03(i3, periodId.A01);
                    if (iA03 >= iA01) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    ae2 = ae2;
                    if (!ae2.A0A.A0E(i3, iA03)) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 19:
                    mediaPeriodInfo = null;
                    c2 = 20;
                    break;
                case 20:
                    return mediaPeriodInfo;
                case 21:
                    ae = ae;
                    ad = ad;
                    periodId = periodId;
                    mediaPeriodInfo = ae.A01(periodId.A02, i3, iA03, ad.A00, periodId.A03);
                    c2 = 20;
                    break;
                case 22:
                    F8 f8 = periodId;
                    return ae.A02(f8.A02, ad.A00, f8.A03);
                case 23:
                    ad = ad;
                    j2 = Long.MIN_VALUE;
                    if (ad.A02 == Long.MIN_VALUE) {
                        c2 = 30;
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 24:
                    ae2 = ae2;
                    ad = ad;
                    iA05 = ae2.A0A.A05(ad.A02);
                    if (iA05 != -1) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = 25;
                        break;
                    }
                case 25:
                    F8 f82 = periodId;
                    return ae.A02(f82.A02, ad.A02, f82.A03);
                case 26:
                    ae2 = ae2;
                    iA022 = ae2.A0A.A02(iA05);
                    if (!ae2.A0A.A0E(iA05, iA022)) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 29;
                        break;
                    }
                case 27:
                    adA01 = null;
                    c2 = 28;
                    break;
                case 28:
                    return adA01;
                case 29:
                    ae = ae;
                    ad = ad;
                    periodId = periodId;
                    adA01 = ae.A01(periodId.A02, iA05, iA022, ad.A02, periodId.A03);
                    c2 = 28;
                    break;
                case 30:
                    ae2 = ae2;
                    iA00 = ae2.A0A.A00();
                    if (iA00 != 0) {
                        c2 = ' ';
                        break;
                    } else {
                        c2 = 31;
                        break;
                    }
                case 31:
                    return (AD) null;
                case ' ':
                    ae2 = ae2;
                    nextPeriodIndex = iA00 - 1;
                    if (ae2.A0A.A09(nextPeriodIndex) != j2) {
                        c2 = '\"';
                        break;
                    } else {
                        c2 = '!';
                        break;
                    }
                case '!':
                    ae2 = ae2;
                    if (!ae2.A0A.A0D(nextPeriodIndex)) {
                        c2 = '#';
                        break;
                    } else {
                        c2 = '\"';
                        break;
                    }
                case '\"':
                    return (AD) null;
                case '#':
                    ae2 = ae2;
                    iA02 = ae2.A0A.A02(nextPeriodIndex);
                    if (!ae2.A0A.A0E(nextPeriodIndex, iA02)) {
                        c2 = '$';
                        break;
                    } else {
                        c2 = '%';
                        break;
                    }
                case '$':
                    return (AD) null;
                case '%':
                    F8 periodId2 = periodId;
                    return ae.A01(periodId2.A02, nextPeriodIndex, iA02, ae2.A0A.A07(), periodId2.A03);
            }
        }
    }

    private AD A05(AG ag) {
        return A06(ag.A04, ag.A01, ag.A02);
    }

    private AD A06(F8 f8, long j, long j2) {
        AE ae = this;
        ae.A07.A09(f8.A02, ae.A0A);
        char c2 = f8.A01() ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    ae = ae;
                    f8 = f8;
                    if (!ae.A0A.A0E(f8.A00, f8.A01)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    return (AD) null;
                case 4:
                    F8 f82 = f8;
                    return ae.A01(f82.A02, f82.A00, f82.A01, j, f82.A03);
                case 5:
                    F8 f83 = f8;
                    return ae.A02(f83.A02, j2, f83.A03);
            }
        }
    }

    private F8 A07(int i, long j, long j2) {
        this.A07.A09(i, this.A0A);
        int iA05 = this.A0A.A05(j);
        if (iA05 == -1) {
            return new F8(i, j2);
        }
        return new F8(i, iA05, this.A0A.A02(iA05), j2);
    }

    private boolean A08() {
        AE ae = this;
        int iA03 = 0;
        AC acA0E = ae.A0E();
        boolean z = true;
        int nextPeriodIndex = acA0E == null ? 2 : 3;
        while (true) {
            switch (nextPeriodIndex) {
                case 2:
                    return z;
                case 3:
                    ae = ae;
                    acA0E = acA0E;
                    iA03 = ae.A07.A03(acA0E.A02.A04.A02, ae.A0A, ae.A0B, ae.A01, ae.A09);
                    nextPeriodIndex = 4;
                    break;
                case 4:
                    acA0E = acA0E;
                    if (acA0E.A01 == null) {
                        nextPeriodIndex = 7;
                        break;
                    } else {
                        nextPeriodIndex = 5;
                        break;
                    }
                case 5:
                    acA0E = acA0E;
                    if (!acA0E.A02.A06) {
                        nextPeriodIndex = 6;
                        break;
                    } else {
                        nextPeriodIndex = 7;
                        break;
                    }
                case 6:
                    acA0E = acA0E.A01;
                    nextPeriodIndex = 4;
                    break;
                case 7:
                    if (iA03 == -1) {
                        nextPeriodIndex = 10;
                        break;
                    } else {
                        nextPeriodIndex = 8;
                        break;
                    }
                case 8:
                    acA0E = acA0E;
                    if (acA0E.A01 == null) {
                        nextPeriodIndex = 10;
                        break;
                    } else {
                        nextPeriodIndex = 9;
                        break;
                    }
                case 9:
                    acA0E = acA0E;
                    if (acA0E.A01.A02.A04.A02 == iA03) {
                        nextPeriodIndex = 14;
                        break;
                    } else {
                        nextPeriodIndex = 10;
                        break;
                    }
                case 10:
                    ae = ae;
                    acA0E = acA0E;
                    boolean zA0S = ae.A0S(acA0E);
                    acA0E.A02 = ae.A04(acA0E.A02, acA0E.A02.A04);
                    if (!zA0S) {
                        nextPeriodIndex = 12;
                        break;
                    } else {
                        nextPeriodIndex = 11;
                        break;
                    }
                case 11:
                    ae = ae;
                    boolean readingPeriodRemoved = ae.A0P();
                    if (!readingPeriodRemoved) {
                        nextPeriodIndex = 12;
                        break;
                    } else {
                        nextPeriodIndex = 13;
                        break;
                    }
                case 12:
                    return z;
                case 13:
                    z = false;
                    nextPeriodIndex = 12;
                    break;
                case 14:
                    acA0E = acA0E.A01;
                    nextPeriodIndex = 3;
                    break;
            }
        }
    }

    private boolean A09(AC ac, AD ad) {
        boolean z = false;
        AD ad2 = ac.A02;
        char c2 = ad2.A03 == ad.A03 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    ad = ad;
                    ad2 = ad2;
                    if (ad2.A02 != ad.A02) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    ad = ad;
                    ad2 = ad2;
                    if (!ad2.A04.equals(ad.A04)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z = true;
                    c2 = 5;
                    break;
                case 5:
                    return z;
                case 6:
                    z = false;
                    c2 = 5;
                    break;
            }
        }
    }

    private boolean A0A(F8 f8, long j) {
        AE ae = this;
        int postrollAdCount = 0;
        int i = 0;
        long j2 = 0;
        boolean z = false;
        boolean zA01 = false;
        int iA00 = ae.A07.A09(f8.A02, ae.A0A).A00();
        boolean z2 = true;
        char c2 = iA00 == 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return z2;
                case 3:
                    ae = ae;
                    f8 = f8;
                    i = iA00 - 1;
                    zA01 = f8.A01();
                    j2 = Long.MIN_VALUE;
                    if (ae.A0A.A09(i) == Long.MIN_VALUE) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (!zA01) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 5:
                    if (j != j2) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return z2;
                case 7:
                    z2 = false;
                    c2 = 6;
                    break;
                case '\b':
                    ae = ae;
                    postrollAdCount = ae.A0A.A01(i);
                    if (postrollAdCount != -1) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    return false;
                case '\n':
                    if (!zA01) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    f8 = f8;
                    if (f8.A00 != i) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    f8 = f8;
                    if (f8.A01 != postrollAdCount - 1) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    z = true;
                    c2 = 14;
                    break;
                case 14:
                    if (!z) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 15:
                    if (!zA01) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 16:
                    ae = ae;
                    if (ae.A0A.A02(i) != postrollAdCount) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    return z2;
                case 18:
                    z2 = false;
                    c2 = 17;
                    break;
                case 19:
                    z = false;
                    c2 = 14;
                    break;
            }
        }
    }

    private boolean A0B(F8 f8, boolean z) {
        AE ae = this;
        boolean z2 = false;
        char c2 = !ae.A07.A0B(ae.A07.A09(f8.A02, ae.A0A).A00, ae.A0B).A08 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    ae = ae;
                    f8 = f8;
                    if (!ae.A07.A0F(f8.A02, ae.A0A, ae.A0B, ae.A01, ae.A09)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (!z) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z2 = true;
                    c2 = 5;
                    break;
                case 5:
                    return z2;
                case 6:
                    z2 = false;
                    c2 = 5;
                    break;
            }
        }
    }

    public final AC A0C() {
        AE ae = this;
        AC ac = ae.A05;
        char c2 = ac != null ? (char) 2 : '\b';
        while (true) {
            switch (c2) {
                case 2:
                    ae = ae;
                    ac = ac;
                    if (ac != ae.A06) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    ae = ae;
                    ac = ac;
                    ae.A06 = ac.A01;
                    c2 = 4;
                    break;
                case 4:
                    ae = ae;
                    ae.A05.A0D();
                    ae.A00--;
                    if (ae.A00 != 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    ae = ae;
                    ae.A04 = null;
                    ae.A08 = ae.A05.A09;
                    ae.A03 = ae.A05.A02.A04.A03;
                    c2 = 6;
                    break;
                case 6:
                    ae = ae;
                    ae.A05 = ae.A05.A01;
                    c2 = 7;
                    break;
                case 7:
                    return ae.A05;
                case '\b':
                    ae = ae;
                    AC ac2 = ae.A04;
                    ae.A05 = ac2;
                    ae.A06 = ac2;
                    c2 = 7;
                    break;
            }
        }
    }

    public final AC A0D() {
        boolean z = false;
        AC ac = this.A06;
        char c2 = ac != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    ac = ac;
                    if (ac.A01 == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z = true;
                    c2 = 4;
                    break;
                case 4:
                    AE ae = this;
                    IJ.A04(z);
                    ae.A06 = ae.A06.A01;
                    return ae.A06;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    public final AC A0E() {
        AE ae = this;
        AC ac = null;
        char c2 = ae.A0P() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    ae = ae;
                    ac = ae.A05;
                    c2 = 3;
                    break;
                case 3:
                    return ac;
                case 4:
                    ae = ae;
                    ac = ae.A04;
                    c2 = 3;
                    break;
            }
        }
    }

    public final AC A0F() {
        return this.A04;
    }

    public final AC A0G() {
        return this.A05;
    }

    public final AC A0H() {
        return this.A06;
    }

    @Nullable
    public final AD A0I(long j, AG ag) {
        AE ae = this;
        AD adA03 = null;
        AC ac = ae.A04;
        char c2 = ac == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    ae = ae;
                    ag = ag;
                    adA03 = ae.A05(ag);
                    c2 = 3;
                    break;
                case 3:
                    return adA03;
                case 4:
                    ae = ae;
                    ac = ac;
                    adA03 = ae.A03(ac, j);
                    c2 = 3;
                    break;
            }
        }
    }

    public final AD A0J(AD ad, int i) {
        return A04(ad, ad.A04.A00(i));
    }

    public final InterfaceC1019aR A0K(AU[] auArr, HT ht, HW hw, FA fa, Object obj, AD ad) {
        AC ac = this.A04;
        AC ac2 = new AC(auArr, ac == null ? ad.A03 : ac.A07() + this.A04.A02.A01, ht, hw, fa, obj, ad);
        if (this.A04 != null) {
            IJ.A04(A0P());
            this.A04.A01 = ac2;
        }
        this.A08 = null;
        this.A04 = ac2;
        this.A00++;
        return ac2.A08;
    }

    public final F8 A0L(int i, long j) {
        return A07(i, j, A00(i));
    }

    public final void A0M(long j) {
        AC ac = this.A04;
        if (ac != null) {
            ac.A0G(j);
        }
    }

    public final void A0N(AbstractC0352Ab abstractC0352Ab) {
        this.A07 = abstractC0352Ab;
    }

    public final void A0O(boolean z) {
        AE ae = this;
        Object obj = null;
        AC acA0E = ae.A0E();
        AC ac = null;
        char c2 = acA0E != null ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    if (!z) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    acA0E = acA0E;
                    obj = acA0E.A09;
                    c2 = 4;
                    break;
                case 4:
                    ae = ae;
                    acA0E = acA0E;
                    ae.A08 = obj;
                    ae.A03 = acA0E.A02.A04.A03;
                    acA0E.A0D();
                    ae.A0S(acA0E);
                    c2 = 5;
                    break;
                case 5:
                    AE ae2 = ae;
                    ae2.A05 = ac;
                    ae2.A04 = ac;
                    ae2.A06 = ac;
                    ae2.A00 = 0;
                    return;
                case 6:
                    ac = null;
                    obj = null;
                    c2 = 4;
                    break;
                case 7:
                    if (!z) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case '\b':
                    ae = ae;
                    ac = null;
                    ae.A08 = null;
                    c2 = 5;
                    break;
            }
        }
    }

    public final boolean A0P() {
        boolean z = false;
        char c2 = this.A05 != null ? (char) 2 : (char) 4;
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

    public final boolean A0Q() {
        AE ae = this;
        boolean z = false;
        AC ac = ae.A04;
        char c2 = ac != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    ac = ac;
                    if (!ac.A02.A05) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 3:
                    ae = ae;
                    if (!ae.A04.A0H()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    ae = ae;
                    if (ae.A04.A02.A01 == -9223372036854775807L) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    ae = ae;
                    if (ae.A00 >= 100) {
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
            }
        }
    }

    public final boolean A0R(int i) {
        this.A01 = i;
        return A08();
    }

    public final boolean A0S(AC ac) {
        AE ae = this;
        boolean z = false;
        boolean z2 = false;
        char c2 = ac != null ? (char) 2 : '\b';
        while (true) {
            switch (c2) {
                case 2:
                    z2 = true;
                    c2 = 3;
                    break;
                case 3:
                    ae = ae;
                    ac = ac;
                    IJ.A04(z2);
                    z = false;
                    ae.A04 = ac;
                    c2 = 4;
                    break;
                case 4:
                    ac = ac;
                    if (ac.A01 == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    ae = ae;
                    ac = ac.A01;
                    if (ac != ae.A06) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    ae = ae;
                    ae.A06 = ae.A05;
                    z = true;
                    c2 = 7;
                    break;
                case 7:
                    ae = ae;
                    ac = ac;
                    ac.A0D();
                    ae.A00--;
                    c2 = 4;
                    break;
                case '\b':
                    z2 = false;
                    c2 = 3;
                    break;
                case '\t':
                    ae.A04.A01 = null;
                    return z;
            }
        }
    }

    public final boolean A0T(InterfaceC1019aR interfaceC1019aR) {
        boolean z = false;
        AC ac = this.A04;
        char c2 = ac != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    interfaceC1019aR = interfaceC1019aR;
                    ac = ac;
                    if (ac.A08 != interfaceC1019aR) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z = true;
                    c2 = 4;
                    break;
                case 4:
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    public final boolean A0U(F8 f8, long j) {
        AE ae = this;
        AD periodInfo = null;
        boolean z = false;
        int iA03 = f8.A02;
        AC ac = null;
        AC acA0E = ae.A0E();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    acA0E = acA0E;
                    z = true;
                    if (acA0E == null) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (ac != null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    ae = ae;
                    acA0E = acA0E;
                    acA0E.A02 = ae.A0J(acA0E.A02, iA03);
                    c2 = 5;
                    break;
                case 5:
                    acA0E = acA0E;
                    if (!acA0E.A02.A06) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    ae = ae;
                    iA03 = ae.A07.A03(iA03, ae.A0A, ae.A0B, ae.A01, ae.A09);
                    c2 = 7;
                    break;
                case 7:
                    AC ac2 = acA0E;
                    ac = ac2;
                    acA0E = ac2.A01;
                    c2 = 2;
                    break;
                case '\b':
                    if (iA03 == -1) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    ae = ae;
                    acA0E = acA0E;
                    if (!acA0E.A09.equals(ae.A07.A0A(iA03, ae.A0A, z).A03)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case '\n':
                    return z ^ ae.A0S(ac);
                case 11:
                    ae = ae;
                    periodInfo = ae.A03(ac, j);
                    if (periodInfo != null) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    return z ^ ae.A0S(ac);
                case '\r':
                    ae = ae;
                    acA0E = acA0E;
                    periodInfo = periodInfo;
                    acA0E.A02 = ae.A0J(acA0E.A02, iA03);
                    if (!ae.A09(acA0E, periodInfo)) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 14:
                    return z ^ ae.A0S(ac);
                case 15:
                    return z;
            }
        }
    }

    public final boolean A0V(boolean z) {
        this.A09 = z;
        return A08();
    }
}
