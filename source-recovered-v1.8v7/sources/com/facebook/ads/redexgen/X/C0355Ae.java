package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Ae, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0355Ae {
    public final int A00;
    public final F8 A01;

    public C0355Ae(int i, F8 f8) {
        this.A00 = i;
        this.A01 = f8;
    }

    public final boolean equals(@Nullable Object obj) {
        C0355Ae c0355Ae = this;
        C0355Ae c0355Ae2 = null;
        boolean z = true;
        char c2 = c0355Ae == obj ? (char) 2 : (char) 3;
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
                    c0355Ae = c0355Ae;
                    obj = obj;
                    if (c0355Ae.getClass() == obj.getClass()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    c0355Ae = c0355Ae;
                    obj = obj;
                    c0355Ae2 = (C0355Ae) obj;
                    if (c0355Ae.A00 != c0355Ae2.A00) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0355Ae = c0355Ae;
                    c0355Ae2 = c0355Ae2;
                    if (!c0355Ae.A01.equals(c0355Ae2.A01)) {
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
        return (this.A00 * 31) + this.A01.hashCode();
    }
}
