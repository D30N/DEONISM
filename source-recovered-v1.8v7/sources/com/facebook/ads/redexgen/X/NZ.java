package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;

@TargetApi(19)
/* loaded from: assets/audience_network.dex */
public final class NZ extends LinearLayout {
    public static byte[] A04;
    public Drawable A00;
    public TextView A01;
    public TextView A02;
    public final XI A03;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 82);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A04 = new byte[]{19, 31, 31, 27, 30};
    }

    public NZ(XI xi) {
        super(xi);
        this.A03 = xi;
        A01();
    }

    private void A01() {
        float f = getResources().getDisplayMetrics().density;
        setOrientation(1);
        this.A02 = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        this.A02.setTextColor(-16777216);
        this.A02.setTextSize(2, 20.0f);
        this.A02.setEllipsize(TextUtils.TruncateAt.END);
        this.A02.setSingleLine(true);
        this.A02.setVisibility(8);
        addView(this.A02, layoutParams);
        this.A01 = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        this.A01.setAlpha(0.5f);
        this.A01.setTextColor(-16777216);
        this.A01.setTextSize(2, 15.0f);
        this.A01.setCompoundDrawablePadding((int) (5.0f * f));
        this.A01.setEllipsize(TextUtils.TruncateAt.END);
        this.A01.setSingleLine(true);
        this.A01.setVisibility(8);
        addView(this.A01, layoutParams2);
    }

    private Drawable getPadlockDrawable() {
        if (this.A00 == null) {
            this.A00 = M7.A01(this.A03, M6.BROWSER_PADLOCK);
        }
        return this.A00;
    }

    public void setSubtitle(String str) {
        NZ nz = this;
        Drawable padlockDrawable = null;
        TextView textView = null;
        Drawable drawable = null;
        char c2 = TextUtils.isEmpty(str) ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    nz = nz;
                    drawable = null;
                    nz.A01.setText((CharSequence) null);
                    nz.A01.setVisibility(8);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    nz = nz;
                    str = str;
                    Uri uri = Uri.parse(str);
                    nz.A01.setText(uri.getHost());
                    textView = nz.A01;
                    if (!A00(0, 5, 89).equals(uri.getScheme())) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    nz = nz;
                    padlockDrawable = nz.getPadlockDrawable();
                    c2 = 6;
                    break;
                case 6:
                    nz = nz;
                    textView = textView;
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds(padlockDrawable, drawable, drawable, drawable);
                    nz.A01.setVisibility(0);
                    c2 = 3;
                    break;
                case 7:
                    drawable = null;
                    padlockDrawable = null;
                    c2 = 6;
                    break;
            }
        }
    }

    public void setTitle(String str) {
        NZ nz = this;
        char c2 = TextUtils.isEmpty(str) ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    nz = nz;
                    nz.A02.setText((CharSequence) null);
                    nz.A02.setVisibility(8);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    nz = nz;
                    str = str;
                    nz.A02.setText(str);
                    nz.A02.setVisibility(0);
                    c2 = 3;
                    break;
            }
        }
    }
}
