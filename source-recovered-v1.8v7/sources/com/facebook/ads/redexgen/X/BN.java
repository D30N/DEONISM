package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.source.TrackGroup;

/* loaded from: assets/audience_network.dex */
public final class BN extends AbstractC1071bH {
    public float A00;
    public int A01;
    public int A02;
    public long A03;
    public final float A04;
    public final float A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final HZ A0A;
    public final IM A0B;

    public BN(TrackGroup trackGroup, int[] iArr, HZ hz, long j, long j2, long j3, float f, float f2, long j4, IM im) {
        super(trackGroup, iArr);
        this.A0A = hz;
        this.A07 = j * 1000;
        this.A06 = j2 * 1000;
        this.A08 = 1000 * j3;
        this.A04 = f;
        this.A05 = f2;
        this.A09 = j4;
        this.A0B = im;
        this.A00 = 1.0f;
        this.A01 = 1;
        this.A03 = -9223372036854775807L;
        this.A02 = A00(Long.MIN_VALUE);
    }

    private int A00(long j) {
        BN bn = this;
        long jA5S = (long) (bn.A0A.A5S() * bn.A04);
        int i = 0;
        int i2 = 0;
        int i3 = 2;
        while (true) {
            switch (i3) {
                case 2:
                    bn = bn;
                    int i4 = ((AbstractC1071bH) bn).A03;
                    if (i2 >= i4) {
                        i3 = 9;
                        break;
                    } else {
                        i3 = 3;
                        break;
                    }
                case 3:
                    if (j == Long.MIN_VALUE) {
                        i3 = 5;
                        break;
                    } else {
                        i3 = 4;
                        break;
                    }
                case 4:
                    bn = bn;
                    if (!bn.A00(i2, j)) {
                        i3 = 5;
                        break;
                    } else {
                        i3 = 8;
                        break;
                    }
                case 5:
                    bn = bn;
                    Format format = bn.A6K(i2);
                    if (Math.round(format.A04 * bn.A00) > jA5S) {
                        i3 = 7;
                        break;
                    } else {
                        i3 = 6;
                        break;
                    }
                case 6:
                    return i2;
                case 7:
                    i = i2;
                    i3 = 8;
                    break;
                case 8:
                    i2++;
                    i3 = 2;
                    break;
                case 9:
                    return i;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1071bH, com.facebook.ads.redexgen.X.HQ
    public final void A4s() {
        this.A03 = -9223372036854775807L;
    }

    @Override // com.facebook.ads.redexgen.X.HQ
    public final int A6x() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1071bH, com.facebook.ads.redexgen.X.HQ
    public final void AAZ(float f) {
        this.A00 = f;
    }
}
