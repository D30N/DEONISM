package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: assets/audience_network.dex */
public final class O5 extends LinearLayout {
    public static final float A04 = Resources.getSystem().getDisplayMetrics().density;
    public static final int A05;
    public static final int A06;
    public boolean A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;

    static {
        float f = A04;
        A06 = (int) (6.0f * f);
        A05 = (int) (f * 8.0f);
    }

    public O5(XI xi, C1I c1i, boolean z, int i, int i2, int i3) {
        super(xi);
        this.A00 = false;
        setOrientation(1);
        this.A03 = new TextView(xi);
        C0635Ly.A0b(this.A03, true, i);
        this.A03.setEllipsize(TextUtils.TruncateAt.END);
        this.A03.setLineSpacing(A06, 1.0f);
        this.A02 = new TextView(xi);
        this.A01 = new TextView(xi);
        C0635Ly.A0b(this.A01, false, i2);
        this.A01.setEllipsize(TextUtils.TruncateAt.END);
        this.A01.setLineSpacing(A06, 1.0f);
        addView(this.A03, new LinearLayout.LayoutParams(-1, -2));
        addView(this.A02, new LinearLayout.LayoutParams(-1, -2));
        this.A02.setVisibility(8);
        A00(c1i, z);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, i3, 0, 0);
        addView(this.A01, layoutParams);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public O5(XI xi, C1I c1i, boolean z, boolean z2, boolean z3) {
        int i = z2 ? 18 : 22;
        int i2 = z2 ? 14 : 16;
        int i3 = A05;
        this(xi, c1i, z, i, i2, z3 ? i3 / 2 : i3);
    }

    public final void A00(C1I c1i, boolean z) {
        this.A03.setTextColor(c1i.A06(z));
        this.A02.setTextColor(c1i.A04(z));
        this.A01.setTextColor(c1i.A05(z));
    }

    public final void A01(String str, String str2, @Nullable String str3, boolean z, boolean z2) {
        String str4 = str;
        String str5 = str3;
        String str6 = str2;
        O5 o5 = this;
        TextView textView = null;
        TextView textView2 = null;
        String str7 = null;
        TextView textView3 = null;
        int i = 0;
        TextView textView4 = null;
        String str8 = null;
        int i2 = 0;
        int i3 = 1;
        boolean z3 = !TextUtils.isEmpty(str4);
        boolean z4 = !TextUtils.isEmpty(str6);
        TextView textView5 = o5.A03;
        char c2 = z3 ? (char) 2 : (char) 24;
        while (true) {
            switch (c2) {
                case 2:
                    str4 = str4;
                    str7 = str4;
                    c2 = 3;
                    break;
                case 3:
                    str5 = str5;
                    textView5 = textView5;
                    str7 = str7;
                    textView5.setText(str7);
                    if (str5 == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    o5 = o5;
                    str5 = str5;
                    o5.A02.setText(str5);
                    c2 = 5;
                    break;
                case 5:
                    o5 = o5;
                    textView4 = o5.A01;
                    if (!z3) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    str6 = str6;
                    str8 = str6;
                    c2 = 7;
                    break;
                case 7:
                    textView4 = textView4;
                    str8 = str8;
                    textView4.setText(str8);
                    i2 = 3;
                    if (!z3) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    if (!z4) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case '\t':
                    o5 = o5;
                    textView2 = o5.A03;
                    if (!z) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    i2 = 2;
                    c2 = 11;
                    break;
                case 11:
                    textView2 = textView2;
                    textView2.setMaxLines(i2);
                    c2 = '\f';
                    break;
                case '\f':
                    return;
                case '\r':
                    if (!z2) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    i2 = 4;
                    c2 = 11;
                    break;
                case 15:
                    o5 = o5;
                    textView3 = o5.A03;
                    if (!z) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    i = 1;
                    c2 = 17;
                    break;
                case 17:
                    o5 = o5;
                    textView3 = textView3;
                    textView3.setMaxLines(i);
                    textView = o5.A01;
                    if (!z) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    textView = textView;
                    textView.setMaxLines(i3);
                    c2 = '\f';
                    break;
                case 19:
                    if (!z2) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    i3 = 3;
                    c2 = 18;
                    break;
                case 21:
                    i3 = 2;
                    c2 = 18;
                    break;
                case 22:
                    i = 2;
                    c2 = 17;
                    break;
                case 23:
                    str8 = "";
                    c2 = 7;
                    break;
                case 24:
                    str6 = str6;
                    str7 = str6;
                    c2 = 3;
                    break;
            }
        }
    }

    public TextView getDescriptionTextView() {
        return this.A01;
    }

    public TextView getTitleTextView() {
        return this.A03;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        O5 o5 = this;
        float f = 0.0f;
        float f2 = 0.0f;
        TextView textView = null;
        boolean z = false;
        TextView textView2 = null;
        super.onConfigurationChanged(configuration);
        char c2 = o5.A00 ? (char) 2 : '\t';
        while (true) {
            switch (c2) {
                case 2:
                    configuration = configuration;
                    if (configuration.orientation != 2) {
                        c2 = '\f';
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
                    o5 = o5;
                    textView2 = o5.A03;
                    if (!z) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    f2 = 18.0f;
                    c2 = 6;
                    break;
                case 6:
                    o5 = o5;
                    textView2 = textView2;
                    textView2.setTextSize(f2);
                    textView = o5.A01;
                    if (!z) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    f = 14.0f;
                    c2 = '\b';
                    break;
                case '\b':
                    textView = textView;
                    textView.setTextSize(f);
                    c2 = '\t';
                    break;
                case '\t':
                    return;
                case '\n':
                    f = 16.0f;
                    c2 = '\b';
                    break;
                case 11:
                    f2 = 22.0f;
                    c2 = 6;
                    break;
                case '\f':
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    public void setAlignment(int i) {
        this.A03.setGravity(i);
        this.A01.setGravity(i);
    }

    public void setDescriptionVisibility(int i) {
        this.A01.setVisibility(i);
    }

    public void setUseNewLandscapeEndCard(boolean z) {
        this.A00 = z;
    }
}
