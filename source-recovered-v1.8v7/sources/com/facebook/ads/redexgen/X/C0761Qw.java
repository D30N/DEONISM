package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeBannerAd;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.Qw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0761Qw extends LinearLayout implements P2 {
    public final NativeBannerAd A00;
    public final XI A01;
    public final ArrayList<View> A02;
    public static final int A04 = (int) (C0635Ly.A01 * 42.0f);
    public static final int A03 = (int) (C0635Ly.A01 * 48.0f);
    public static final int A05 = (int) (C0635Ly.A01 * 54.0f);
    public static final int A07 = (int) (C0635Ly.A01 * 4.0f);
    public static final int A06 = (int) (C0635Ly.A01 * 8.0f);

    public C0761Qw(XI xi, NativeBannerAd nativeBannerAd, C0582Ju c0582Ju, EnumC0583Jv enumC0583Jv, MediaView mediaView, AdOptionsView adOptionsView) {
        LinearLayout.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        super(xi);
        this.A02 = new ArrayList<>();
        this.A00 = nativeBannerAd;
        this.A01 = xi;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        int iA00 = A00(enumC0583Jv);
        O0 o0 = new O0(this.A01);
        o0.setFullCircleCorners(true);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(iA00, iA00);
        layoutParams3.gravity = 16;
        o0.addView(mediaView, new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(o0, layoutParams3);
        C0712Oz c0712Oz = new C0712Oz(xi, this.A00, enumC0583Jv, c0582Ju, adOptionsView);
        c0712Oz.setPadding(A06, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        layoutParams4.gravity = 16;
        linearLayout.addView(c0712Oz, layoutParams4);
        if (enumC0583Jv == EnumC0583Jv.A0A) {
            int i = A07;
            setPadding(i, i, i, i);
            setOrientation(0);
            layoutParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
            linearLayout.setPadding(0, 0, A07, 0);
        } else {
            int i2 = A06;
            setPadding(i2, i2, i2, i2);
            setOrientation(1);
            layoutParams = new LinearLayout.LayoutParams(-1, 0);
            layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            linearLayout.setPadding(0, 0, 0, A06);
        }
        layoutParams.weight = 1.0f;
        addView(linearLayout, layoutParams);
        TextView textView = new TextView(getContext());
        int iconSize = A06;
        int i3 = A07;
        textView.setPadding(iconSize, i3, iconSize, i3);
        c0582Ju.A05(textView);
        textView.setText(this.A00.getAdCallToAction());
        addView(textView, layoutParams2);
        this.A02.add(mediaView);
        this.A02.add(textView);
    }

    public static int A00(EnumC0583Jv enumC0583Jv) {
        int i = P0.A00[enumC0583Jv.ordinal()];
        char c2 = i != 1 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    if (i == 2) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return A05;
                case 4:
                    return A03;
                case 5:
                    return A04;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.P2
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.P2
    public ArrayList<View> getViewsForInteraction() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.P2
    public final void unregisterView() {
        this.A00.unregisterView();
    }
}
