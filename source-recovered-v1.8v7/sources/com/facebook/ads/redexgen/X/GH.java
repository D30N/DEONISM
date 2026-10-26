package com.facebook.ads.redexgen.X;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class GH {

    @Nullable
    public final String A00;

    @NonNull
    public final String A01;

    @Nullable
    public final String A02;

    public GH(@NonNull String str, @Nullable String str2, @Nullable String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        GH gh = this;
        GH gh2 = null;
        boolean z = true;
        char c2 = gh == obj ? (char) 2 : (char) 3;
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
                    gh = gh;
                    obj = obj;
                    if (gh.getClass() == obj.getClass()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    gh = gh;
                    obj = obj;
                    gh2 = (GH) obj;
                    if (!C0560Iy.A0j(gh.A01, gh2.A01)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    gh = gh;
                    gh2 = gh2;
                    if (!C0560Iy.A0j(gh.A02, gh2.A02)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    gh = gh;
                    gh2 = gh2;
                    if (!C0560Iy.A0j(gh.A00, gh2.A00)) {
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
        GH gh = this;
        int i = 0;
        String str = null;
        int iHashCode = 0;
        String str2 = null;
        int i2 = 0;
        int iHashCode2 = 0;
        String str3 = gh.A01;
        int iHashCode3 = 0;
        int result = str3 != null ? 2 : 9;
        while (true) {
            switch (result) {
                case 2:
                    str3 = str3;
                    iHashCode = str3.hashCode();
                    result = 3;
                    break;
                case 3:
                    gh = gh;
                    i2 = iHashCode * 31;
                    str2 = gh.A02;
                    if (str2 == null) {
                        result = 8;
                        break;
                    } else {
                        result = 4;
                        break;
                    }
                case 4:
                    str2 = str2;
                    iHashCode2 = str2.hashCode();
                    result = 5;
                    break;
                case 5:
                    gh = gh;
                    int result2 = i2 + iHashCode2;
                    i = result2 * 31;
                    str = gh.A00;
                    if (str == null) {
                        result = 7;
                        break;
                    } else {
                        result = 6;
                        break;
                    }
                case 6:
                    str = str;
                    iHashCode3 = str.hashCode();
                    result = 7;
                    break;
                case 7:
                    return i + iHashCode3;
                case 8:
                    iHashCode2 = 0;
                    result = 5;
                    break;
                case 9:
                    iHashCode = 0;
                    result = 3;
                    break;
            }
        }
    }
}
