package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: com.facebook.ads.redexgen.X.Ox, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0710Ox {
    public final AnonymousClass18 A00;
    public final C1H A01;
    public final C1K A02;
    public final C1R A03;
    public final XI A04;
    public final C0565Jd A05;
    public static final int A08 = (int) (C0635Ly.A01 * 4.0f);
    public static final int A06 = (int) (C0635Ly.A01 * 72.0f);
    public static final int A07 = (int) (C0635Ly.A01 * 8.0f);

    public C0710Ox(XI xi, JW jw, AnonymousClass17 anonymousClass17) {
        this.A04 = xi;
        this.A05 = new C0565Jd(anonymousClass17.A0P(), jw);
        this.A00 = anonymousClass17.A0K();
        this.A01 = anonymousClass17.A0L().A0E();
        this.A03 = anonymousClass17.A0N();
        this.A02 = anonymousClass17.A0L().A0G();
    }

    private View A00() {
        C0452Eq c0452Eq = new C0452Eq(this.A04);
        c0452Eq.setLayoutManager(new T2(this.A04, 0, false));
        c0452Eq.setAdapter(new R0(this.A04, this.A02.A00(), A08));
        return c0452Eq;
    }

    private View A01(@Nullable ViewOnClickListenerC0998a5 viewOnClickListenerC0998a5) {
        O5 o5 = new O5(this.A04, this.A00.A01(), true, false, false);
        o5.A01(this.A01.A06(), this.A01.A01(), null, false, true);
        o5.setAlignment(17);
        C0687Nz c0687Nz = new C0687Nz(this.A04);
        C0635Ly.A0P(c0687Nz, 0);
        c0687Nz.setRadius(50);
        new AsyncTaskC1002aA(c0687Nz, this.A04).A04().A07(this.A03.A01());
        LinearLayout linearLayout = new LinearLayout(this.A04);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int i = A06;
        linearLayout.addView(c0687Nz, new LinearLayout.LayoutParams(i, i));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i2 = A07;
        layoutParams.setMargins(0, i2, 0, i2);
        linearLayout.addView(o5, layoutParams);
        if (viewOnClickListenerC0998a5 != null) {
            C0635Ly.A0M(viewOnClickListenerC0998a5);
            linearLayout.addView(viewOnClickListenerC0998a5, layoutParams);
            if (TextUtils.isEmpty(viewOnClickListenerC0998a5.getText())) {
                C0635Ly.A0K(viewOnClickListenerC0998a5);
            }
        }
        return linearLayout;
    }

    public final Pair<EnumC0709Ow, View> A02(@Nullable ViewOnClickListenerC0998a5 viewOnClickListenerC0998a5) {
        C0710Ox c0710Ox = this;
        View viewA00 = null;
        EnumC0709Ow enumC0709OwA03 = c0710Ox.A03();
        char c2 = C0708Ov.A00[enumC0709OwA03.ordinal()] != 1 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0710Ox = c0710Ox;
                    viewOnClickListenerC0998a5 = viewOnClickListenerC0998a5;
                    viewA00 = c0710Ox.A01(viewOnClickListenerC0998a5);
                    c2 = 3;
                    break;
                case 3:
                    View view = viewA00;
                    C0567Jf.A04(view, c0710Ox.A05, EnumC0564Jc.A0R);
                    return new Pair<>(enumC0709OwA03, view);
                case 4:
                    c0710Ox = c0710Ox;
                    viewA00 = c0710Ox.A00();
                    c2 = 3;
                    break;
            }
        }
    }

    public final EnumC0709Ow A03() {
        if (!this.A02.A00().isEmpty()) {
            return EnumC0709Ow.A03;
        }
        return EnumC0709Ow.A02;
    }
}
