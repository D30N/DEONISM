package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.Mn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0649Mn extends LinearLayout {
    public static final int A05 = (int) (C0635Ly.A01 * 10.0f);
    public static final int A06 = (int) (C0635Ly.A01 * 44.0f);
    public int A00;
    public final ImageView A01;
    public final LinearLayout A02;
    public final TextView A03;
    public final C0684Nw A04;

    public C0649Mn(XI xi, int i) {
        super(xi);
        this.A01 = new ImageView(xi);
        ImageView imageView = this.A01;
        int i2 = A05;
        imageView.setPadding(i2, i2, i2, i2);
        this.A04 = new C0684Nw(xi);
        this.A04.setProgress(0.0f);
        C0684Nw c0684Nw = this.A04;
        int i3 = A05;
        c0684Nw.setPadding(i3, i3, i3, i3);
        this.A03 = new TextView(xi);
        setOrientation(0);
        this.A02 = new LinearLayout(xi);
        this.A00 = i;
        A00();
    }

    private void A00() {
        setToolbarActionMode(this.A00);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        setGravity(17);
        int i = A06;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i, i);
        C0635Ly.A0b(this.A03, true, 16);
        this.A03.setTextColor(-1);
        this.A03.setVisibility(8);
        this.A02.addView(this.A01, layoutParams2);
        this.A02.addView(this.A04, layoutParams2);
        addView(this.A02, layoutParams);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        addView(this.A03, layoutParams3);
    }

    public final boolean A01() {
        return !this.A03.getText().toString().isEmpty();
    }

    public final boolean A02() {
        boolean z = false;
        int i = this.A00;
        char c2 = i != 2 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    if (i == 4) {
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

    public void setActionClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    public void setColors(int i) {
        this.A04.A02(C2H.A01(i, 77), i);
        this.A01.setColorFilter(i);
    }

    public void setInitialUnskippableSeconds(int i) {
        if (i > 0) {
            setToolbarActionMode(2);
        }
    }

    public void setProgress(float f) {
        this.A04.setProgressWithAnimation(f);
    }

    public void setToolbarActionMode(int i) {
        C0649Mn c0649Mn = this;
        M6 m6 = null;
        int i2 = 0;
        ImageView imageView = null;
        int i3 = 0;
        c0649Mn.A00 = i;
        C0684Nw c0684Nw = c0649Mn.A04;
        char c2 = i == 2 ? (char) 2 : (char) 16;
        while (true) {
            switch (c2) {
                case 2:
                    i3 = 0;
                    c2 = 3;
                    break;
                case 3:
                    c0649Mn = c0649Mn;
                    c0684Nw = c0684Nw;
                    c0684Nw.setVisibility(i3);
                    imageView = c0649Mn.A01;
                    if (i != 2) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i2 = 8;
                    c2 = 5;
                    break;
                case 5:
                    c0649Mn = c0649Mn;
                    imageView = imageView;
                    imageView.setVisibility(i2);
                    c0649Mn.setVisibility(0);
                    if (i == 0) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (i == 1) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (i == 3) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    if (i == 4) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    m6 = M6.CROSS;
                    c2 = '\n';
                    break;
                case '\n':
                    C0649Mn c0649Mn2 = c0649Mn;
                    c0649Mn2.A01.setImageBitmap(M7.A00(m6));
                    C0635Ly.A0J(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, c0649Mn2.A01);
                    return;
                case 11:
                    c0649Mn = c0649Mn;
                    m6 = M6.CROSS;
                    c0649Mn.A01.setVisibility(8);
                    c0649Mn.setVisibility(8);
                    c2 = '\n';
                    break;
                case '\f':
                    m6 = M6.MINIMIZE_ARROW;
                    c2 = '\n';
                    break;
                case '\r':
                    m6 = M6.SKIP_ARROW;
                    c2 = '\n';
                    break;
                case 14:
                    m6 = M6.CROSS;
                    c2 = '\n';
                    break;
                case 15:
                    i2 = 0;
                    c2 = 5;
                    break;
                case 16:
                    i3 = 8;
                    c2 = 3;
                    break;
            }
        }
    }

    public void setToolbarMessage(String str) {
        int i = 0;
        this.A03.setText(str);
        TextView textView = this.A03;
        char c2 = TextUtils.isEmpty(str) ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i = 8;
                    c2 = 3;
                    break;
                case 3:
                    textView.setVisibility(i);
                    return;
                case 4:
                    i = 0;
                    c2 = 3;
                    break;
            }
        }
    }

    public void setToolbarMessageEnabled(boolean z) {
        int i = 0;
        TextView textView = this.A03;
        char c2 = z ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i = 0;
                    c2 = 3;
                    break;
                case 3:
                    textView.setVisibility(i);
                    return;
                case 4:
                    i = 4;
                    c2 = 3;
                    break;
            }
        }
    }
}
