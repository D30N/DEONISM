package com.facebook.ads.redexgen.X;

import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.ads.AdSize;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class KD {
    public static final Map<KA, KB> A00 = new HashMap();

    static {
        A00.put(KA.A08, KB.A09);
        A00.put(KA.A06, KB.A0B);
        A00.put(KA.A05, KB.A0A);
    }

    public static AdSize A00(KB kb) {
        Map.Entry<KA, KB> next = null;
        Iterator<Map.Entry<KA, KB>> it = A00.entrySet().iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    kb = kb;
                    it = it;
                    next = it.next();
                    if (next.getValue() != kb) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return next.getKey().A05();
                case 5:
                    return AdSize.BANNER_320_50;
            }
        }
    }

    public static KB A01(DisplayMetrics displayMetrics) {
        int i = (int) (displayMetrics.widthPixels / displayMetrics.density);
        int i2 = (int) (displayMetrics.heightPixels / displayMetrics.density);
        int screenHeight = LU.A04(i, i2) ? 2 : 3;
        while (true) {
            switch (screenHeight) {
                case 2:
                    return KB.A0E;
                case 3:
                    if (i2 <= i) {
                        screenHeight = 5;
                        break;
                    } else {
                        screenHeight = 4;
                        break;
                    }
                case 4:
                    return KB.A0G;
                case 5:
                    return KB.A0D;
            }
        }
    }

    public static KB A02(KA ka) {
        KB kb = A00.get(ka);
        if (kb == null) {
            return KB.A0C;
        }
        return kb;
    }

    public static void A03(DisplayMetrics displayMetrics, View view, KA ka) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(((int) (((float) displayMetrics.widthPixels) / displayMetrics.density)) >= ka.getWidth() ? displayMetrics.widthPixels : (int) Math.ceil(ka.getWidth() * displayMetrics.density), (int) Math.ceil(ka.getHeight() * displayMetrics.density));
        layoutParams.addRule(14, -1);
        view.setLayoutParams(layoutParams);
    }
}
