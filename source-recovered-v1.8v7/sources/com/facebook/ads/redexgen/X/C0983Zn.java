package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Zn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0983Zn implements CL {
    public long A00;
    public long A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;

    public C0983Zn(int i, int i2, int i3, int i4, int i5, int i6) {
        this.A06 = i;
        this.A07 = i2;
        this.A02 = i3;
        this.A04 = i4;
        this.A03 = i5;
        this.A05 = i6;
    }

    public final int A00() {
        return this.A07 * this.A03 * this.A06;
    }

    public final int A01() {
        return this.A04;
    }

    public final int A02() {
        return this.A05;
    }

    public final int A03() {
        return this.A06;
    }

    public final int A04() {
        return this.A07;
    }

    public final long A05(long j) {
        return (1000000 * Math.max(0L, j - this.A01)) / this.A02;
    }

    public final void A06(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public final boolean A07() {
        C0983Zn c0983Zn = this;
        boolean z = false;
        char c2 = c0983Zn.A01 != 0 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0983Zn = c0983Zn;
                    if (c0983Zn.A00 == 0) {
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

    @Override // com.facebook.ads.redexgen.X.CL
    public final long A65() {
        return (1000000 * (this.A00 / this.A04)) / this.A07;
    }

    @Override // com.facebook.ads.redexgen.X.CL
    public final CK A6t(long j) {
        C0983Zn c0983Zn = this;
        int i = 0;
        int i2 = c0983Zn.A04;
        long jA0F = C0560Iy.A0F((((c0983Zn.A02 * j) / 1000000) / i2) * i2, 0L, c0983Zn.A00 - i2);
        long j2 = c0983Zn.A01 + jA0F;
        long jA05 = c0983Zn.A05(j2);
        CM cm = new CM(jA05, j2);
        char c2 = jA05 < j ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0983Zn = c0983Zn;
                    long j3 = c0983Zn.A00;
                    i = c0983Zn.A04;
                    if (jA0F != j3 - i) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return new CK(cm);
                case 4:
                    long j4 = i + j2;
                    long seekPosition = c0983Zn.A05(j4);
                    return new CK(cm, new CM(seekPosition, j4));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CL
    public final boolean A7n() {
        return true;
    }
}
