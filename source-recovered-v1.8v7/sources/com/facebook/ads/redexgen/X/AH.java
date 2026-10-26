package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class AH {
    public static final AH A04 = new AH(1.0f);
    public final float A00;
    public final float A01;
    public final boolean A02;
    public final int A03;

    public AH(float f) {
        this(f, 1.0f, false);
    }

    public AH(float f, float f2, boolean z) {
        IJ.A03(f > 0.0f);
        IJ.A03(f2 > 0.0f);
        this.A01 = f;
        this.A00 = f2;
        this.A02 = z;
        this.A03 = Math.round(1000.0f * f);
    }

    public final long A00(long j) {
        return this.A03 * j;
    }

    public final boolean equals(@Nullable Object obj) {
        AH ah = this;
        AH ah2 = null;
        boolean z = true;
        char c2 = ah == obj ? (char) 2 : (char) 3;
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
                    ah = ah;
                    obj = obj;
                    if (ah.getClass() == obj.getClass()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    ah = ah;
                    obj = obj;
                    ah2 = (AH) obj;
                    if (ah.A01 != ah2.A01) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    ah = ah;
                    ah2 = ah2;
                    if (ah.A00 != ah2.A00) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    ah = ah;
                    ah2 = ah2;
                    if (ah.A02 != ah2.A02) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    return z;
                case '\n':
                    z = false;
                    c2 = '\t';
                    break;
            }
        }
    }

    public final int hashCode() {
        return (((((17 * 31) + Float.floatToRawIntBits(this.A01)) * 31) + Float.floatToRawIntBits(this.A00)) * 31) + (this.A02 ? 1 : 0);
    }
}
