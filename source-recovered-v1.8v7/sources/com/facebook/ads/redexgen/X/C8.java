package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class C8 implements InterfaceC1019aR, InterfaceC1018aQ {
    public long A00;
    public long A01;
    public long A02;
    public InterfaceC1018aQ A03;
    public C1006aE[] A04 = new C1006aE[0];
    public final InterfaceC1019aR A05;

    public C8(InterfaceC1019aR interfaceC1019aR, boolean z, long j, long j2) {
        this.A05 = interfaceC1019aR;
        this.A02 = z ? j : -9223372036854775807L;
        this.A01 = j;
        this.A00 = j2;
    }

    private AX A00(long j, AX ax) {
        AX ax2 = ax;
        long j2 = 0;
        long jA0F = 0;
        long jA0F2 = C0560Iy.A0F(ax2.A01, 0L, j - this.A01);
        long j3 = ax2.A00;
        long j4 = this.A00;
        char c2 = j4 == Long.MIN_VALUE ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    j2 = Long.MAX_VALUE;
                    c2 = 3;
                    break;
                case 3:
                    ax2 = ax2;
                    jA0F = C0560Iy.A0F(j3, 0L, j2);
                    long toleranceBeforeUs = ax2.A01;
                    if (jA0F2 != toleranceBeforeUs) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    ax2 = ax2;
                    long toleranceBeforeUs2 = ax2.A00;
                    if (jA0F != toleranceBeforeUs2) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return ax2;
                case 6:
                    j2 = j4 - j;
                    c2 = 3;
                    break;
                case 7:
                    return new AX(jA0F2, jA0F);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.FW
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A9G(InterfaceC1019aR interfaceC1019aR) {
        this.A03.A9G(this);
    }

    public static boolean A02(long j, HQ[] hqArr) {
        int i = 0;
        HQ hq = null;
        int length = 0;
        char c2 = j != 0 ? (char) 2 : '\b';
        while (true) {
            switch (c2) {
                case 2:
                    hqArr = hqArr;
                    length = hqArr.length;
                    i = 0;
                    c2 = 3;
                    break;
                case 3:
                    if (i >= length) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    hqArr = hqArr;
                    hq = hqArr[i];
                    if (hq == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    hq = hq;
                    if (!C0537Ib.A0B(hq.A6w().A0O)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 6:
                    return true;
                case 7:
                    i++;
                    c2 = 3;
                    break;
                case '\b':
                    return false;
            }
        }
    }

    public final boolean A03() {
        boolean z = false;
        char c2 = this.A02 != -9223372036854775807L ? (char) 2 : (char) 4;
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

    @Override // com.facebook.ads.redexgen.X.InterfaceC1019aR
    public final boolean A49(long j) {
        return this.A05.A49(j);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1019aR
    public final void A4m(long j, boolean z) {
        this.A05.A4m(j, z);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1019aR
    public final long A5J(long j, AX ax) {
        long j2 = this.A01;
        if (j == j2) {
            return j2;
        }
        return this.A05.A5J(j, A00(j, ax));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1019aR
    public final long A5Y() {
        C8 c8 = this;
        long j = 0;
        long jA5Y = c8.A05.A5Y();
        char c2 = jA5Y != Long.MIN_VALUE ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c8 = c8;
                    j = c8.A00;
                    if (j == Long.MIN_VALUE) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (jA5Y < j) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return Long.MIN_VALUE;
                case 5:
                    return jA5Y;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1019aR
    public final long A6a() {
        C8 c8 = this;
        long j = 0;
        long jA6a = c8.A05.A6a();
        char c2 = jA6a != Long.MIN_VALUE ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c8 = c8;
                    j = c8.A00;
                    if (j == Long.MIN_VALUE) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (jA6a < j) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return Long.MIN_VALUE;
                case 5:
                    return jA6a;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1019aR
    public final TrackGroupArray A7C() {
        return this.A05.A7C();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1019aR
    public final void A8W() throws IOException {
        this.A05.A8W();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1018aQ
    public final void AAg(InterfaceC1019aR interfaceC1019aR) {
        this.A03.AAg(this);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1019aR
    public final void ABo(InterfaceC1018aQ interfaceC1018aQ, long j) {
        this.A03 = interfaceC1018aQ;
        this.A05.ABo(this, j);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1019aR
    public final long AC7() {
        C8 c8 = this;
        long j = 0;
        boolean z = false;
        long j2 = 0;
        boolean z2 = false;
        long jAC7 = 0;
        long j3 = 0;
        long jAC72 = 0;
        char c2 = c8.A03() ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    c8 = c8;
                    j3 = c8.A02;
                    c8.A02 = -9223372036854775807L;
                    jAC7 = c8.AC7();
                    if (jAC7 == -9223372036854775807L) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    j2 = jAC7;
                    c2 = 4;
                    break;
                case 4:
                    return j2;
                case 5:
                    j2 = j3;
                    c2 = 4;
                    break;
                case 6:
                    c8 = c8;
                    jAC72 = c8.A05.AC7();
                    if (jAC72 != -9223372036854775807L) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return -9223372036854775807L;
                case '\b':
                    c8 = c8;
                    z2 = true;
                    if (jAC72 < c8.A01) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    z = true;
                    c2 = '\n';
                    break;
                case '\n':
                    c8 = c8;
                    IJ.A04(z);
                    j = c8.A00;
                    if (j == Long.MIN_VALUE) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    if (jAC72 > j) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    IJ.A04(z2);
                    return jAC72;
                case '\r':
                    z2 = false;
                    c2 = '\f';
                    break;
                case 14:
                    z = false;
                    c2 = '\n';
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1019aR
    public final void ACF(long j) {
        this.A05.ACF(j);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1019aR
    public final long ACt(long j) {
        C8 c8 = this;
        long jACt = 0;
        C1006aE c1006aE = null;
        long j2 = 0;
        c8.A02 = -9223372036854775807L;
        C1006aE[] c1006aEArr = c8.A04;
        int length = c1006aEArr.length;
        boolean z = false;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= length) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c1006aEArr = c1006aEArr;
                    c1006aE = c1006aEArr[i];
                    if (c1006aE == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1006aE = c1006aE;
                    c1006aE.A00();
                    c2 = 5;
                    break;
                case 5:
                    i++;
                    c2 = 2;
                    break;
                case 6:
                    c8 = c8;
                    jACt = c8.A05.ACt(j);
                    if (jACt == j) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c8 = c8;
                    if (jACt < c8.A01) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c8 = c8;
                    j2 = c8.A00;
                    if (j2 == Long.MIN_VALUE) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    if (jACt > j2) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    z = true;
                    c2 = 11;
                    break;
                case 11:
                    IJ.A04(z);
                    return jACt;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1019aR
    public final long ACu(HQ[] hqArr, boolean[] zArr, FV[] fvArr, boolean[] zArr2, long j) {
        boolean[] zArr3 = zArr2;
        boolean[] zArr4 = zArr;
        FV[] fvArr2 = fvArr;
        HQ[] hqArr2 = hqArr;
        C8 c8 = this;
        long j2 = 0;
        long jACu = 0;
        int i = 0;
        long j3 = 0;
        long j4 = 0;
        boolean z = false;
        C1006aE[] c1006aEArr = null;
        FV fv = null;
        c8.A04 = new C1006aE[fvArr2.length];
        FV[] fvArr3 = new FV[fvArr2.length];
        int i2 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    fvArr2 = fvArr2;
                    fv = null;
                    if (i2 >= fvArr2.length) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c8 = c8;
                    fvArr2 = fvArr2;
                    c1006aEArr = c8.A04;
                    c1006aEArr[i2] = (C1006aE) fvArr2[i2];
                    if (c1006aEArr[i2] == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1006aEArr = c1006aEArr;
                    fv = c1006aEArr[i2].A01;
                    c2 = 5;
                    break;
                case 5:
                    fvArr3 = fvArr3;
                    fvArr3[i2] = fv;
                    i2++;
                    c2 = 2;
                    break;
                case 6:
                    c8 = c8;
                    hqArr2 = hqArr2;
                    zArr4 = zArr4;
                    zArr3 = zArr3;
                    fvArr3 = fvArr3;
                    jACu = c8.A05.ACu(hqArr2, zArr4, fvArr3, zArr3, j);
                    if (!c8.A03()) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c8 = c8;
                    j3 = c8.A01;
                    if (j != j3) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    hqArr2 = hqArr2;
                    if (!A02(j3, hqArr2)) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    j2 = jACu;
                    c2 = '\n';
                    break;
                case '\n':
                    c8 = c8;
                    c8.A02 = j2;
                    if (jACu == j) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c8 = c8;
                    if (jACu < c8.A01) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    c8 = c8;
                    j4 = c8.A00;
                    if (j4 == Long.MIN_VALUE) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    if (jACu > j4) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    z = true;
                    c2 = 15;
                    break;
                case 15:
                    IJ.A04(z);
                    i = 0;
                    c2 = 16;
                    break;
                case 16:
                    fvArr2 = fvArr2;
                    if (i >= fvArr2.length) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    fvArr3 = fvArr3;
                    if (fvArr3[i] != null) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    c8 = c8;
                    c8.A04[i] = fv;
                    c2 = 19;
                    break;
                case 19:
                    c8 = c8;
                    fvArr2 = fvArr2;
                    fvArr2[i] = c8.A04[i];
                    i++;
                    c2 = 16;
                    break;
                case 20:
                    fvArr2 = fvArr2;
                    if (fvArr2[i] == null) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    c8 = c8;
                    fvArr3 = fvArr3;
                    if (c8.A04[i].A01 == fvArr3[i]) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    c8 = c8;
                    fvArr3 = fvArr3;
                    c8.A04[i] = new C1006aE(c8, fvArr3[i]);
                    c2 = 19;
                    break;
                case 23:
                    z = false;
                    c2 = 15;
                    break;
                case 24:
                    j2 = -9223372036854775807L;
                    c2 = '\n';
                    break;
                case 25:
                    return jACu;
            }
        }
    }
}
