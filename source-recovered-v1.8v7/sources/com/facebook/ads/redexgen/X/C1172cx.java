package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdError;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1172cx extends C0649Mn {
    public static byte[] A00;
    public static final int A01;
    public static final int A02;
    public static final int A03;
    public static final int A04;
    public static final int A05;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 51);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A00 = new byte[]{-15, 9, 7, 14};
    }

    static {
        A01();
        A01 = (int) (C0635Ly.A01 * 10.0f);
        A04 = (int) (C0635Ly.A01 * 24.0f);
        A02 = (int) (C0635Ly.A01 * 30.0f);
        A05 = (int) (C0635Ly.A01 * 30.0f);
        A03 = (int) (C0635Ly.A01 * 50.0f);
    }

    public C1172cx(XI xi, int i) {
        super(xi, i);
        int i2 = A01;
        super.setPadding(i2, 0, i2, 0);
        LinearLayout linearLayout = this.A02;
        int i3 = A01;
        linearLayout.setPadding(i3, i3 / 3, i3, i3 / 3);
        this.A03.setTextSize(13.0f);
        TextView textView = this.A03;
        int i4 = A01;
        textView.setPadding(i4 / 4, i4 / 2, i4 / 4, i4 / 2);
        this.A03.setTextColor(-1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        int i5 = A05;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i5, i5);
        layoutParams2.gravity = 16;
        C0684Nw c0684Nw = this.A04;
        int i6 = A01;
        c0684Nw.setPadding(i6 / 3, i6 / 3, i6 / 3, i6 / 3);
        this.A04.A02(C2H.A01(-1, 77), -1);
        int i7 = A04;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i7, i7);
        layoutParams3.setMargins(0, 0, 0, 0);
        layoutParams3.gravity = 16;
        this.A01.setPadding(0, 0, 0, 0);
        super.removeAllViews();
        super.addView(this.A02, layoutParams);
        this.A02.removeAllViews();
        this.A02.addView(this.A04, layoutParams2);
        this.A02.addView(this.A03, layoutParams);
        this.A02.addView(this.A01, layoutParams3);
        setToolbarActionMode(i);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(A03);
        gradientDrawable.setColor(i);
        C0635Ly.A0W(this.A02, gradientDrawable);
    }

    @Override // com.facebook.ads.redexgen.X.C0649Mn
    public void setToolbarActionMode(int i) {
        C1172cx c1172cx = this;
        ViewGroup.LayoutParams layoutParams = null;
        M6 m6 = null;
        int i2 = 0;
        ImageView imageView = null;
        int i3 = 0;
        c1172cx.A00 = i;
        C0684Nw c0684Nw = c1172cx.A04;
        int i4 = 0;
        char c2 = i == 2 ? (char) 2 : (char) 16;
        while (true) {
            switch (c2) {
                case 2:
                    i3 = 0;
                    c2 = 3;
                    break;
                case 3:
                    c1172cx = c1172cx;
                    c0684Nw = c0684Nw;
                    c0684Nw.setVisibility(i3);
                    imageView = c1172cx.A01;
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
                    c1172cx = c1172cx;
                    imageView = imageView;
                    i4 = 0;
                    imageView.setVisibility(i2);
                    c1172cx.setVisibility(0);
                    if (i == 0) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (i == 1) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (i == 2) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c1172cx = c1172cx;
                    m6 = M6.CROSS_APP_INSTALL;
                    c1172cx.setVisibility(8);
                    c2 = '\t';
                    break;
                case '\t':
                    C1172cx c1172cx2 = c1172cx;
                    c1172cx2.A01.setImageBitmap(M7.A00(m6));
                    C0635Ly.A0J(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, c1172cx2.A01);
                    return;
                case '\n':
                    c1172cx = c1172cx;
                    m6 = M6.CROSS_APP_INSTALL;
                    c1172cx.A01.setVisibility(8);
                    c1172cx.A03.setVisibility(8);
                    c2 = '\t';
                    break;
                case 11:
                    c1172cx = c1172cx;
                    m6 = M6.SKIP_ARROW_APP_INSTALL;
                    c1172cx.A03.setVisibility(i4);
                    c1172cx.setToolbarMessage(A00(0, 4, 107));
                    c2 = '\t';
                    break;
                case '\f':
                    c1172cx = c1172cx;
                    m6 = M6.CROSS_APP_INSTALL;
                    LinearLayout linearLayout = c1172cx.A02;
                    int i5 = A01;
                    linearLayout.setPadding(i5 / 3, i5 / 3, i5 / 3, i5 / 3);
                    layoutParams = c1172cx.A01.getLayoutParams();
                    if (layoutParams == null) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c1172cx = c1172cx;
                    layoutParams = layoutParams;
                    int i6 = A02;
                    layoutParams.height = i6;
                    layoutParams.width = i6;
                    c1172cx.A01.setLayoutParams(layoutParams);
                    c2 = 14;
                    break;
                case 14:
                    c1172cx = c1172cx;
                    c1172cx.A03.setVisibility(8);
                    c2 = '\t';
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
}
