package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.No, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0676No {
    public static byte[] A01;
    public final Map<String, String> A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 17);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{-20, -1, -5, -7, -24, -26, -17, -16, -11, -5, -6, -118, -123, -117, 121, 126};
    }

    public C0676No() {
        this.A00 = new HashMap();
    }

    public C0676No(Map<String, String> extraData) {
        this.A00 = extraData;
    }

    public final C0676No A02(@Nullable C0628Lr c0628Lr) throws JSONException {
        if (c0628Lr != null) {
            this.A00.put(A00(11, 5, 5), LX.A01(c0628Lr.A04()));
        }
        return this;
    }

    public final C0676No A03(@Nullable Q1 q1) {
        if (q1 != null) {
            this.A00.putAll(q1.A0T());
        }
        return this;
    }

    public final C0676No A04(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            this.A00.put(A00(0, 11, k.AppCompatTheme_windowFixedHeightMajor), str);
        }
        return this;
    }

    public final Map<String, String> A05() {
        return this.A00;
    }
}
