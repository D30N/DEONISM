package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.On, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0701On extends FrameLayout {
    public static final int A07 = (int) (C0635Ly.A01 * 16.0f);
    public C03349j A00;

    @Nullable
    public C02997y A01;
    public C0549In A02;
    public C7W A03;
    public AnonymousClass76 A04;
    public final XI A05;
    public final C0565Jd A06;

    public C0701On(XI xi, C0565Jd c0565Jd) {
        super(xi);
        this.A06 = c0565Jd;
        this.A05 = xi;
        setUpView(xi);
    }

    public final void A01() {
        A0b(true, 10);
    }

    public final void A02() {
        C02997y c02997y = this.A01;
        if (c02997y != null) {
            c02997y.A0f();
            this.A01 = null;
        }
    }

    public final void A03(C9C c9c) {
        getEventBus().A05(c9c);
    }

    public final void A04(JW jw, String str, Map<String, String> extraParams) {
        A02();
        this.A01 = new C02997y(this.A05, jw, this.A00, str, extraParams);
    }

    public final void A05(PC pc) {
        A0Y(pc, 13);
    }

    public final boolean A06() {
        return A0h();
    }

    @VisibleForTesting
    public C0755Qq getSimpleVideoView() {
        return this.A00;
    }

    public float getVolume() {
        return getVolume();
    }

    public void setPlaceholderUrl(String str) {
        this.A03.setImage(str);
    }

    private void setUpPlugins(XI xi) {
        A0T();
        this.A03 = new C7W(xi);
        A0Z(this.A03);
        this.A02 = new C0549In(xi, this.A06);
        A0Z(new C02887h(xi));
        A0Z(this.A02);
        this.A04 = new AnonymousClass76(xi, true, this.A06);
        A0Z(this.A04);
        A0Z(new C0550Io(this.A04, PO.A02, true, true));
        if (!A0d()) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        int i = A07;
        layoutParams.setMargins(i, i, i, i);
        this.A02.setLayoutParams(layoutParams);
        addView(this.A02);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.9j] */
    private void setUpVideo(final XI xi) {
        this.A00 = new C0755Qq(xi) { // from class: com.facebook.ads.redexgen.X.9j
            @Override // android.widget.RelativeLayout, android.view.View
            public final void onMeasure(int newHeightSpec, int i) {
                int i2 = newHeightSpec;
                int i3 = i;
                char c2 = View.MeasureSpec.getMode(newHeightSpec) == 1073741824 ? (char) 2 : (char) 4;
                while (true) {
                    switch (c2) {
                        case 2:
                            i3 = newHeightSpec;
                            c2 = 3;
                            break;
                        case 3:
                            super.onMeasure(i2, i3);
                            return;
                        case 4:
                            if (View.MeasureSpec.getMode(i) != 1073741824) {
                                c2 = 3;
                                break;
                            } else {
                                c2 = 5;
                                break;
                            }
                        case 5:
                            i2 = i;
                            c2 = 3;
                            break;
                    }
                }
            }
        };
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        C0635Ly.A0N(this.A00);
        addView(this.A00);
        setOnClickListener(new ViewOnClickListenerC0700Om(this));
    }

    private void setUpView(XI xi) {
        setUpVideo(xi);
        setUpPlugins(xi);
    }

    public void setVideoURI(String str) {
        setVideoURI(str);
    }

    public void setVolume(float f) {
        setVolume(f);
        this.A02.A09();
    }
}
