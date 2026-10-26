package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class HR {
    public int A00;
    public final int A01;
    public final HQ[] A02;

    public HR(HQ... hqArr) {
        this.A02 = hqArr;
        this.A01 = hqArr.length;
    }

    @Nullable
    public final HQ A00(int i) {
        return this.A02[i];
    }

    public final HQ[] A01() {
        return (HQ[]) this.A02.clone();
    }

    public final boolean equals(@Nullable Object obj) {
        HR hr = this;
        char c2 = hr == obj ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return true;
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
                    hr = hr;
                    obj = obj;
                    if (hr.getClass() == obj.getClass()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    HR other = hr;
                    return Arrays.equals(other.A02, ((HR) obj).A02);
            }
        }
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = (17 * 31) + Arrays.hashCode(this.A02);
        }
        int result = this.A00;
        return result;
    }
}
