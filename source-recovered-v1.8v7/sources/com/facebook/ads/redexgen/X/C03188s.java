package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.8s, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03188s {
    public static byte[] A05;
    public C03198t A01;

    @Nullable
    public String A02;

    @Nullable
    public String A03;
    public int A00 = 0;
    public List<C03168q> A04 = new ArrayList();

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        int i4 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    bArrCopyOfRange = bArrCopyOfRange;
                    if (i4 >= bArrCopyOfRange.length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    bArrCopyOfRange = bArrCopyOfRange;
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 1);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A05 = new byte[]{-45, -28};
    }

    public C03188s(C03198t c03198t, @Nullable String str, @Nullable String str2) {
        this.A01 = c03198t;
        this.A03 = str;
        this.A02 = str2;
    }

    public final int A02() {
        return this.A04.size();
    }

    public final long A03() {
        C03198t c03198t = this.A01;
        if (c03198t != null) {
            return c03198t.A0C() + this.A01.A03();
        }
        return -1L;
    }

    public final C03168q A04() {
        if (this.A00 < this.A04.size()) {
            this.A00++;
            return this.A04.get(this.A00 - 1);
        }
        return null;
    }

    public final C03198t A05() {
        return this.A01;
    }

    @Nullable
    public final String A06() {
        return this.A02;
    }

    @Nullable
    public final String A07() {
        C03188s c03188s = this;
        int i = c03188s.A00;
        char c2 = i > 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c03188s = c03188s;
                    if (i > c03188s.A04.size()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return c03188s.A04.get(r2.A00 - 1).A05().optString(A00(0, 2, 111));
                case 4:
                    return (String) null;
            }
        }
    }

    @Nullable
    public final String A08() {
        return this.A03;
    }

    public final void A09(C03168q c03168q) {
        this.A04.add(c03168q);
    }

    public final boolean A0A() {
        C03188s c03188s = this;
        boolean z = false;
        char c2 = c03188s.A01 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c03188s = c03188s;
                    if (C0627Lq.A00() <= c03188s.A01.A0C() + c03188s.A01.A03()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z = true;
                    c2 = 4;
                    break;
                case 4:
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }
}
