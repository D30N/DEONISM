package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class AV {
    public static final AV A01 = new AV(0);
    public final int A00;

    public AV(int i) {
        this.A00 = i;
    }

    public final boolean equals(@Nullable Object obj) {
        AV av = this;
        boolean z = true;
        char c2 = av == obj ? (char) 2 : (char) 3;
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
                    av = av;
                    obj = obj;
                    if (av.getClass() == obj.getClass()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    av = av;
                    obj = obj;
                    AV other = (AV) obj;
                    if (av.A00 != other.A00) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return z;
                case '\b':
                    z = false;
                    c2 = 7;
                    break;
            }
        }
    }

    public final int hashCode() {
        return this.A00;
    }
}
