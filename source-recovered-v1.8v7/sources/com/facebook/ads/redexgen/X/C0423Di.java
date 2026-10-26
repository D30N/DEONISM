package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.text.TextUtils;

/* renamed from: com.facebook.ads.redexgen.X.Di, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0423Di {
    public final String A00;
    public final boolean A01;

    public C0423Di(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    public final boolean equals(@Nullable Object obj) {
        C0423Di c0423Di = this;
        C0423Di other = null;
        boolean z = true;
        char c2 = c0423Di == obj ? (char) 2 : (char) 3;
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
                    obj = obj;
                    if (obj.getClass() == C0423Di.class) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    c0423Di = c0423Di;
                    obj = obj;
                    other = (C0423Di) obj;
                    if (!TextUtils.equals(c0423Di.A00, other.A00)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0423Di = c0423Di;
                    other = other;
                    if (c0423Di.A01 != other.A01) {
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
        C0423Di c0423Di = this;
        int i = 0;
        int i2 = 0;
        int iHashCode = 0;
        int i3 = 1 * 31;
        String str = c0423Di.A00;
        int result = str == null ? 2 : 7;
        while (true) {
            switch (result) {
                case 2:
                    iHashCode = 0;
                    result = 3;
                    break;
                case 3:
                    c0423Di = c0423Di;
                    int result2 = i3 + iHashCode;
                    i2 = result2 * 31;
                    if (!c0423Di.A01) {
                        result = 6;
                        break;
                    } else {
                        result = 4;
                        break;
                    }
                case 4:
                    i = 1231;
                    result = 5;
                    break;
                case 5:
                    return i2 + i;
                case 6:
                    i = 1237;
                    result = 5;
                    break;
                case 7:
                    str = str;
                    iHashCode = str.hashCode();
                    result = 3;
                    break;
            }
        }
    }
}
