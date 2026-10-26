package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Dv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0433Dv implements Z2 {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public C0433Dv(long j, long j2, CI ci) {
        this.A04 = j2;
        this.A01 = ci.A02;
        this.A00 = ci.A00;
        if (j == -1) {
            this.A02 = -1L;
            this.A03 = -9223372036854775807L;
        } else {
            this.A02 = j - j2;
            this.A03 = A79(j);
        }
    }

    @Override // com.facebook.ads.redexgen.X.CL
    public final long A65() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.CL
    public final CK A6t(long positionOffset) {
        int i = 0;
        long j = 0;
        long jA0F = 0;
        CM cm = null;
        C0433Dv c0433Dv = this;
        long j2 = c0433Dv.A02;
        char c2 = j2 == -1 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    long seekTimeUs = c0433Dv.A04;
                    return new CK(new CM(0L, seekTimeUs));
                case 3:
                    c0433Dv = c0433Dv;
                    int i2 = c0433Dv.A01;
                    jA0F = C0560Iy.A0F((((c0433Dv.A00 * positionOffset) / 8000000) / i2) * i2, 0L, j2 - i2);
                    j = c0433Dv.A04 + jA0F;
                    long seekTimeUs2 = c0433Dv.A79(j);
                    cm = new CM(seekTimeUs2, j);
                    if (seekTimeUs2 >= positionOffset) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0433Dv = c0433Dv;
                    long j3 = c0433Dv.A02;
                    i = c0433Dv.A01;
                    long seekTimeUs3 = i;
                    if (jA0F != j3 - seekTimeUs3) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return new CK(cm);
                case 6:
                    CM secondSeekPoint = cm;
                    long j4 = i + j;
                    return new CK(secondSeekPoint, new CM(c0433Dv.A79(j4), j4));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.Z2
    public final long A79(long j) {
        return ((Math.max(0L, j - this.A04) * 1000000) * 8) / this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.CL
    public final boolean A7n() {
        boolean z = false;
        char c2 = this.A02 != -1 ? (char) 2 : (char) 4;
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
}
