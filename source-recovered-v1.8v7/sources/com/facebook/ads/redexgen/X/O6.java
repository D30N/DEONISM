package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import d.b.a.b.k;

/* loaded from: assets/audience_network.dex */
public final class O6 {
    public static final int A01 = C2H.A01(-16777216, k.AppCompatTheme_windowActionBar);
    public static final int A00 = C2H.A01(-1, 0);

    public static void A00(XI xi, ViewGroup viewGroup, String str) {
        new AsyncTaskC1002aA(viewGroup, xi).A07(str);
        View view = new View(xi);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        C0635Ly.A0V(view, xi);
        viewGroup.addView(view, 0);
    }
}
