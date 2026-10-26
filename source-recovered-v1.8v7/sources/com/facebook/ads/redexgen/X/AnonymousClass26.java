package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: com.facebook.ads.redexgen.X.26, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass26 {
    public static byte[] A03;

    @Nullable
    public C0565Jd A00;
    public final List<String> A02 = new ArrayList();
    public final List<String> A01 = new ArrayList();

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 40);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A03 = new byte[]{65, 76, 64, 79, 64, 70, 68, 126, 64, 69, 126, 81, 83, 68, 71, 68, 83, 68, 79, 66, 68, 82, 98, 100, 114, 101, 72, 125, 120, 98, 101, 121, 114, 110, 98, 125, 108, 74, 116, 120, 74, 124, 74, 102, 112, 112, 124, 123, 114, 74, 97, 125, 124, 102, 98, 101, 112, 99, 101, 120, 103, 99, 126, 120, 121, 100, 72, 100, 114, 123, 114, 116, 99, 114, 115, 41, 19, 24, 18};
    }

    public AnonymousClass26() {
    }

    public AnonymousClass26(C0565Jd c0565Jd) {
        this.A00 = c0565Jd;
    }

    public final Map<String, String> A02() {
        HashMap map = new HashMap();
        map.put(A00(22, 12, 63), new JSONArray((Collection) this.A02).toString());
        map.put(A00(59, 16, 63), new JSONArray((Collection) this.A01).toString());
        return map;
    }

    public final void A03() {
        this.A02.clear();
        this.A01.clear();
    }

    public final void A04() {
        this.A02.add(A00(1, 21, 9));
        C0565Jd c0565Jd = this.A00;
        if (c0565Jd != null) {
            c0565Jd.A02(EnumC0564Jc.A0A, null);
        }
    }

    public final void A05() {
        this.A02.add(A00(54, 5, 57));
    }

    public final void A06() {
        this.A02.add(A00(34, 20, 61));
        C0565Jd c0565Jd = this.A00;
        if (c0565Jd != null) {
            c0565Jd.A02(EnumC0564Jc.A0B, null);
        }
    }

    public final void A07(int i) {
        this.A01.add(String.valueOf(i));
    }

    public final void A08(AnonymousClass25 anonymousClass25) {
        this.A02.add(anonymousClass25.A02() + A00(75, 4, 94));
        C0565Jd c0565Jd = this.A00;
        if (c0565Jd != null) {
            c0565Jd.A02(EnumC0564Jc.A08, null);
        }
    }

    public final void A09(AnonymousClass25 anonymousClass25, int i) {
        this.A02.add(anonymousClass25.A02() + A00(0, 1, 54) + i);
    }

    public final boolean A0A() {
        AnonymousClass26 anonymousClass26 = this;
        boolean z = false;
        char c2 = anonymousClass26.A02.isEmpty() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass26 = anonymousClass26;
                    if (!anonymousClass26.A01.isEmpty()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
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
