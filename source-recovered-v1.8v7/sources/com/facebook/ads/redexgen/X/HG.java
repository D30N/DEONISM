package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.text.TextUtils;

/* loaded from: assets/audience_network.dex */
public final class HG {
    public final int A00;
    public final int A01;

    @Nullable
    public final String A02;

    public HG(int i, int i2, @Nullable String str) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
    }

    public final boolean equals(@Nullable Object obj) {
        HG hg = this;
        HG hg2 = null;
        boolean z = true;
        char c2 = hg == obj ? (char) 2 : (char) 3;
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
                    hg = hg;
                    obj = obj;
                    if (hg.getClass() == obj.getClass()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    hg = hg;
                    obj = obj;
                    hg2 = (HG) obj;
                    if (hg.A00 != hg2.A00) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    hg = hg;
                    hg2 = hg2;
                    if (hg.A01 != hg2.A01) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    hg = hg;
                    hg2 = hg2;
                    if (!TextUtils.equals(hg.A02, hg2.A02)) {
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
        int result = 0;
        int i = ((this.A00 * 31) + this.A01) * 31;
        String str = this.A02;
        char c2 = str != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    str = str;
                    result = str.hashCode();
                    c2 = 3;
                    break;
                case 3:
                    return i + result;
                case 4:
                    result = 0;
                    c2 = 3;
                    break;
            }
        }
    }
}
