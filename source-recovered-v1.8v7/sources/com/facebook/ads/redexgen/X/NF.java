package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: assets/audience_network.dex */
public final class NF extends LinearLayout {
    public final ImageView A00;
    public final LinearLayout A01;
    public final TextView A02;
    public static final int A05 = (int) (C0635Ly.A01 * 8.0f);
    public static final int A06 = (int) (C0635Ly.A01 * 14.5d);
    public static final int A04 = (int) (C0635Ly.A01 * 20.0f);
    public static final LinearLayout.LayoutParams A03 = new LinearLayout.LayoutParams(-1, -2);

    public NF(XI xi) {
        super(xi);
        this.A00 = new ImageView(xi);
        this.A00.setColorFilter(-10459280);
        int i = A04;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 16;
        this.A00.setLayoutParams(layoutParams);
        this.A01 = new LinearLayout(xi);
        this.A01.setOrientation(1);
        this.A01.setPadding(A05 * 2, 0, 0, 0);
        this.A01.setLayoutParams(A03);
        this.A02 = new TextView(xi);
        C0635Ly.A0b(this.A02, true, 16);
        this.A02.setTextColor(-14934495);
        this.A01.addView(this.A02, A03);
        setOrientation(0);
        addView(this.A00);
        addView(this.A01);
    }

    public void setInfo(M6 m6, String str, String str2) {
        NF nf = this;
        nf.A00.setImageBitmap(M7.A00(m6));
        nf.A02.setText(str);
        char c2 = !TextUtils.isEmpty(str2) ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    nf = nf;
                    str2 = str2;
                    TextView textView = new TextView(nf.getContext());
                    C0635Ly.A0b(textView, false, 14);
                    textView.setTextColor(-10459280);
                    textView.setText(str2);
                    nf.A01.addView(textView, A03);
                    int i = A05;
                    nf.setPadding(0, i, 0, i);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    nf = nf;
                    int i2 = A06;
                    nf.setPadding(0, i2, 0, i2);
                    c2 = 3;
                    break;
            }
        }
    }
}
