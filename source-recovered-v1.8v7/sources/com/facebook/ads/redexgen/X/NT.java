package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.List;

@TargetApi(19)
/* loaded from: assets/audience_network.dex */
public final class NT extends LinearLayout {
    public static byte[] A05;
    public static final int A06;
    public static final int A07;
    public static final Uri A08;
    public static final View.OnTouchListener A09;
    public ImageView A00;
    public ImageView A01;
    public NS A02;
    public NZ A03;
    public String A04;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 57);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A05 = new byte[]{-51, -39, -41, -104, -53, -40, -50, -36, -39, -45, -50, -104, -51, -46, -36, -39, -41, -49, -78, -45, -56, -47, -125, -47, -60, -41, -52, -39, -56, -125, -59, -43, -46, -38, -42, -56, -43, 17, 30, 20, 34, 31, 25, 20, -34, 25, 30, 36, 21, 30, 36, -34, 17, 19, 36, 25, 31, 30, -34, 6, -7, -11, 7, 18, 19, 32, 38, 37, -21, 19, 29, 18, 31, 28, -7, 34, 37, 41, 27, 23, 35, 35, 31, -23, -34, -34, 38, 38, 38, -35, 21, 16, 18, 20, 17, 30, 30, 26, -35, 18, 30, 28};
    }

    static {
        A04();
        A06 = Color.rgb(224, 224, 224);
        A08 = Uri.parse(A02(79, 23, k.AppCompatTheme_windowFixedHeightMajor));
        A09 = new NP();
        A07 = Color.argb(34, 0, 0, 0);
    }

    public NT(XI xi) {
        super(xi);
        A05(xi);
    }

    private void A05(XI xi) {
        float f = getResources().getDisplayMetrics().density;
        int i = (int) (50.0f * f);
        int i2 = (int) (4.0f * f);
        C0635Ly.A0P(this, -1);
        setGravity(16);
        this.A00 = new ImageView(xi);
        this.A00.setContentDescription(A02(74, 5, 125));
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        this.A00.setScaleType(ImageView.ScaleType.CENTER);
        this.A00.setImageBitmap(M7.A00(M6.BROWSER_CLOSE));
        this.A00.setOnTouchListener(A09);
        this.A00.setOnClickListener(new NQ(this));
        addView(this.A00, layoutParams);
        this.A03 = new NZ(xi);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        this.A03.setPadding(0, i2, 0, i2);
        addView(this.A03, layoutParams2);
        this.A01 = new ImageView(xi);
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i, i);
        this.A01.setContentDescription(A02(18, 19, 42));
        this.A01.setScaleType(ImageView.ScaleType.CENTER);
        this.A01.setOnTouchListener(A09);
        this.A01.setOnClickListener(new NR(this, xi));
        addView(this.A01, layoutParams3);
        setupDefaultNativeBrowser(xi);
    }

    public void setListener(NS ns) {
        this.A02 = ns;
    }

    public void setTitle(String str) {
        this.A03.setTitle(str);
    }

    public void setUrl(String str) {
        NT nt = this;
        nt.A04 = str;
        char c2 = !TextUtils.isEmpty(str) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    str = str;
                    if (!A02(63, 11, k.AppCompatTheme_windowFixedWidthMajor).equals(str)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    nt = nt;
                    nt.A03.setSubtitle(null);
                    nt.A01.setEnabled(false);
                    nt.A01.setColorFilter(new PorterDuffColorFilter(A06, PorterDuff.Mode.SRC_IN));
                    c2 = 4;
                    break;
                case 4:
                    return;
                case 5:
                    nt = nt;
                    str = str;
                    nt.A03.setSubtitle(str);
                    nt.A01.setEnabled(true);
                    nt.A01.setColorFilter((ColorFilter) null);
                    c2 = 4;
                    break;
            }
        }
    }

    private void setupDefaultNativeBrowser(XI xi) {
        NT nt = this;
        Bitmap bitmapA00 = null;
        List<ResolveInfo> listQueryIntentActivities = xi.getPackageManager().queryIntentActivities(new Intent(A02(37, 26, k.AppCompatTheme_windowFixedHeightMinor), A08), 65536);
        char c2 = listQueryIntentActivities.size() == 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    nt = nt;
                    nt.A01.setVisibility(8);
                    bitmapA00 = null;
                    c2 = 3;
                    break;
                case 3:
                    nt.A01.setImageBitmap(bitmapA00);
                    return;
                case 4:
                    listQueryIntentActivities = listQueryIntentActivities;
                    if (listQueryIntentActivities.size() != 1) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    listQueryIntentActivities = listQueryIntentActivities;
                    if (!A02(0, 18, 49).equals(listQueryIntentActivities.get(0).activityInfo.packageName)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    bitmapA00 = M7.A00(M6.BROWSER_LAUNCH_CHROME);
                    c2 = 3;
                    break;
                case 7:
                    bitmapA00 = M7.A00(M6.BROWSER_LAUNCH_NATIVE);
                    c2 = 3;
                    break;
            }
        }
    }
}
