package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.source.TrackGroup;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1071bH implements HQ {
    public int A00;
    public final long[] A01;
    public final Format[] A02;
    public final int A03;
    public final TrackGroup A04;
    public final int[] A05;

    public AbstractC1071bH(TrackGroup trackGroup, int... iArr) {
        IJ.A04(iArr.length > 0);
        this.A04 = (TrackGroup) IJ.A01(trackGroup);
        this.A03 = iArr.length;
        this.A02 = new Format[this.A03];
        for (int i = 0; i < iArr.length; i++) {
            this.A02[i] = trackGroup.A01(iArr[i]);
        }
        Arrays.sort(this.A02, new HE());
        this.A05 = new int[this.A03];
        int i2 = 0;
        while (true) {
            int i3 = this.A03;
            if (i2 < i3) {
                this.A05[i2] = trackGroup.A00(this.A02[i2]);
                i2++;
            } else {
                this.A01 = new long[i3];
                return;
            }
        }
    }

    public final boolean A00(int i, long j) {
        boolean z = false;
        char c2 = this.A01[i] > j ? (char) 2 : (char) 4;
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

    @Override // com.facebook.ads.redexgen.X.HQ
    public void A4s() {
    }

    @Override // com.facebook.ads.redexgen.X.HQ
    public final Format A6K(int i) {
        return this.A02[i];
    }

    @Override // com.facebook.ads.redexgen.X.HQ
    public final int A6P(int i) {
        return this.A05[i];
    }

    @Override // com.facebook.ads.redexgen.X.HQ
    public final Format A6w() {
        return this.A02[A6x()];
    }

    @Override // com.facebook.ads.redexgen.X.HQ
    public final TrackGroup A7B() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.HQ
    public void AAZ(float f) {
    }

    public final boolean equals(@Nullable Object obj) {
        AbstractC1071bH abstractC1071bH = this;
        AbstractC1071bH abstractC1071bH2 = null;
        boolean z = true;
        char c2 = abstractC1071bH == obj ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return z;
                case 3:
                    obj = obj;
                    if (obj == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    abstractC1071bH = abstractC1071bH;
                    obj = obj;
                    if (abstractC1071bH.getClass() == obj.getClass()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    abstractC1071bH = abstractC1071bH;
                    obj = obj;
                    abstractC1071bH2 = (AbstractC1071bH) obj;
                    if (abstractC1071bH.A04 != abstractC1071bH2.A04) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    abstractC1071bH = abstractC1071bH;
                    abstractC1071bH2 = abstractC1071bH2;
                    if (!Arrays.equals(abstractC1071bH.A05, abstractC1071bH2.A05)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return z;
                case '\t':
                    z = false;
                    c2 = '\b';
                    break;
            }
        }
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = (System.identityHashCode(this.A04) * 31) + Arrays.hashCode(this.A05);
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.HQ
    public final int length() {
        return this.A05.length;
    }
}
