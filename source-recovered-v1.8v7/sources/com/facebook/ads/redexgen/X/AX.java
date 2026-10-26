package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class AX {
    public final long A00;
    public final long A01;
    public static final AX A04 = new AX(0, 0);
    public static final AX A02 = new AX(Long.MAX_VALUE, Long.MAX_VALUE);
    public static final AX A06 = new AX(Long.MAX_VALUE, 0);
    public static final AX A05 = new AX(0, Long.MAX_VALUE);
    public static final AX A03 = A04;

    public AX(long j, long j2) {
        IJ.A03(j >= 0);
        IJ.A03(j2 >= 0);
        this.A01 = j;
        this.A00 = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        AX ax = this;
        AX ax2 = null;
        boolean z = true;
        char c2 = ax == obj ? (char) 2 : (char) 3;
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
                    ax = ax;
                    obj = obj;
                    if (ax.getClass() == obj.getClass()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    ax = ax;
                    obj = obj;
                    ax2 = (AX) obj;
                    if (ax.A01 != ax2.A01) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    ax = ax;
                    ax2 = ax2;
                    if (ax.A00 != ax2.A00) {
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
        return (((int) this.A01) * 31) + ((int) this.A00);
    }
}
