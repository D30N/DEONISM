package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1170cv extends AbstractC0679Nr {
    public static byte[] A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public static final int A0L;
    public static final int A0M;
    public C1H A00;
    public boolean A01;
    public boolean A02;
    public final ImageView A03;
    public final LinearLayout.LayoutParams A04;
    public final LinearLayout.LayoutParams A05;
    public final LinearLayout A06;
    public final LinearLayout A07;
    public final RelativeLayout.LayoutParams A08;
    public final RelativeLayout.LayoutParams A09;
    public final TextView A0A;
    public final TextView A0B;
    public final TextView A0C;
    public final TextView A0D;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 81);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A08() {
        A0E = new byte[]{-83, -1, -14, 3, -10, -14, 4, 0};
    }

    static {
        A08();
        A0G = (int) (C0635Ly.A01 * 2.0f);
        A0F = (int) (C0635Ly.A01 * 3.0f);
        A0H = (int) (C0635Ly.A01 * 8.0f);
        A0L = (int) (C0635Ly.A01 * 16.0f);
        A0M = (int) (C0635Ly.A01 * 2.0f);
        A0I = (int) (C0635Ly.A01 * 8.0f);
        A0J = (int) (C0635Ly.A01 * 48.0f);
        A0K = (int) (C0635Ly.A01 * 82.0f);
    }

    public C1170cv(XI xi, int i, C1I c1i, String str, JW jw, MQ mq, Q1 q1, C0628Lr c0628Lr) {
        super(xi, i, c1i, str, jw, mq, q1, c0628Lr);
        this.A09 = new RelativeLayout.LayoutParams(-1, -2);
        this.A08 = new RelativeLayout.LayoutParams(-2, -1);
        this.A04 = new LinearLayout.LayoutParams(-1, 0);
        this.A05 = new LinearLayout.LayoutParams(-1, 0);
        this.A02 = false;
        this.A01 = false;
        setOrientation(1);
        int i2 = A0I;
        C0635Ly.A0U(this, -1087164882, new float[]{0.0f, 0.0f, 0.0f, 0.0f, i2, i2, i2, i2});
        setPadding(0, 0, 0, A0H);
        this.A09.addRule(12);
        RelativeLayout.LayoutParams layoutParams = this.A09;
        int i3 = A0L;
        layoutParams.setMargins(i3, 0, i3, i3);
        this.A03 = new ImageView(xi);
        this.A03.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.A03.setColorFilter(-1);
        this.A03.setImageBitmap(M7.A00(M6.STAR));
        this.A0B = new TextView(xi);
        this.A0C = new TextView(xi);
        this.A0D = new TextView(xi);
        this.A0A = new TextView(xi);
        this.A06 = new LinearLayout(xi);
        this.A06.setOrientation(1);
        this.A07 = new LinearLayout(xi);
        this.A07.setOrientation(0);
        if (xi.A09() != null && xi.A09().getWindow() != null) {
            xi.A09().getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new MM(this));
        }
        setupMetadataContainer(getResources().getConfiguration().orientation == 1);
    }

    private RelativeLayout.LayoutParams A01(View view) {
        C0635Ly.A0P(this, 0);
        this.A08.setMargins(0, 0, 0, 0);
        this.A08.addRule(1, view.getId());
        A05();
        return this.A08;
    }

    private void A05() {
        super.A01.removeAllViews();
        removeView(super.A03);
        setGravity(16);
        this.A04.setMargins(0, 0, A0L * 3, 0);
        C0635Ly.A0b(this.A0D, true, 18);
        this.A05.setMargins(0, 0, A0L * 3, 0);
        this.A0A.setVisibility(0);
        this.A07.setLayoutParams(this.A04);
        this.A0D.setLayoutParams(this.A05);
        int i = A0K;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
        int i2 = A0L;
        layoutParams.setMargins(i2, 0, i2, 0);
        layoutParams.addRule(9);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, A0K);
        layoutParams2.addRule(1, super.A04.getId());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        int i3 = A0L;
        layoutParams3.setMargins(i3, i3, i3 * 3, 0);
        layoutParams3.addRule(3, super.A04.getId());
        super.A01.addView(super.A04, layoutParams);
        super.A01.addView(this.A06, layoutParams2);
        super.A01.addView(super.A03, layoutParams3);
    }

    private void A06() {
        int i = 0;
        super.A01.removeAllViews();
        removeView(super.A03);
        this.A04.setMargins(0, 0, A0L, 0);
        TextView textView = this.A0D;
        char c2 = this.A01 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i = 18;
                    c2 = 3;
                    break;
                case 3:
                    C1170cv c1170cv = this;
                    C0635Ly.A0b(textView, true, i);
                    c1170cv.A05.setMargins(0, 0, A0L, 0);
                    c1170cv.A0A.setVisibility(8);
                    c1170cv.A07.setLayoutParams(c1170cv.A04);
                    c1170cv.A0D.setLayoutParams(c1170cv.A05);
                    int i2 = A0J;
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i2, i2);
                    int i3 = A0L;
                    layoutParams.setMargins(i3, 0, i3, 0);
                    layoutParams.addRule(9);
                    RelativeLayout.LayoutParams metadataContainerParams = new RelativeLayout.LayoutParams(-1, A0J);
                    metadataContainerParams.addRule(1, ((AbstractC0679Nr) c1170cv).A04.getId());
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                    int i4 = A0L;
                    layoutParams2.setMargins(i4, A0H, i4, 0);
                    ((AbstractC0679Nr) c1170cv).A01.addView(((AbstractC0679Nr) c1170cv).A04, layoutParams);
                    ((AbstractC0679Nr) c1170cv).A01.addView(c1170cv.A06, metadataContainerParams);
                    c1170cv.addView(((AbstractC0679Nr) c1170cv).A03, layoutParams2);
                    return;
                case 4:
                    i = 15;
                    c2 = 3;
                    break;
            }
        }
    }

    private void A07() {
        C1170cv c1170cv = this;
        c1170cv.A0D.setText(c1170cv.A00.A06());
        c1170cv.A0A.setText(c1170cv.A00.A05());
        boolean z = false;
        char c2 = !c1170cv.A00.A03().isEmpty() ? (char) 2 : '\b';
        while (true) {
            switch (c2) {
                case 2:
                    c1170cv = c1170cv;
                    z = false;
                    c1170cv.A0B.setText(c1170cv.A00.A03());
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                    c1170cv.A0B.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    c2 = 3;
                    break;
                case 3:
                    c1170cv = c1170cv;
                    if (!c1170cv.A00.A02().isEmpty()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 4:
                    c1170cv = c1170cv;
                    c1170cv.A0C.setText(c1170cv.A00.A02() + A04(0, 8, 60));
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    c1170cv = c1170cv;
                    c1170cv.A0C.setVisibility(8);
                    if (!c1170cv.A00.A03().isEmpty()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c1170cv = c1170cv;
                    c1170cv.A07.setVisibility(8);
                    C0635Ly.A0b(c1170cv.A0D, true, 18);
                    c1170cv.A0D.setMaxLines(2);
                    LinearLayout.LayoutParams layoutParams = c1170cv.A05;
                    layoutParams.weight = 2.0f;
                    c1170cv.A0D.setLayoutParams(layoutParams);
                    c1170cv.A0A.setGravity(48);
                    C0635Ly.A0b(c1170cv.A0A, z, 15);
                    c1170cv.A01 = true;
                    c2 = 5;
                    break;
                case '\b':
                    c1170cv = c1170cv;
                    c1170cv.A0B.setVisibility(8);
                    c1170cv.A03.setVisibility(8);
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0679Nr
    public final RelativeLayout.LayoutParams A0A(View view) {
        C1170cv c1170cv = this;
        int i = 0;
        int i2 = 0;
        RelativeLayout.LayoutParams layoutParams = null;
        char c2 = c1170cv.getResources().getConfiguration().orientation == 1 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    c1170cv = c1170cv;
                    c1170cv.A06();
                    C0635Ly.A0R(c1170cv, -1087164882, A0I);
                    layoutParams = c1170cv.A09;
                    i2 = A0L;
                    if (!c1170cv.A02) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    i = i2 * 3;
                    c2 = 4;
                    break;
                case 4:
                    C1170cv c1170cv2 = c1170cv;
                    layoutParams.setMargins(i2, 0, i2, i);
                    int i3 = A0H;
                    c1170cv2.setPadding(0, i3, 0, i3);
                    return c1170cv2.A09;
                case 5:
                    i = i2;
                    c2 = 4;
                    break;
                case 6:
                    C1170cv c1170cv3 = c1170cv;
                    c1170cv3.A08.setMargins(0, 0, 0, 0);
                    c1170cv3.A08.addRule(1, view.getId());
                    C0635Ly.A0P(c1170cv3, -1087164882);
                    c1170cv3.A05();
                    return c1170cv3.A08;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0679Nr
    public final RelativeLayout.LayoutParams A0B(View view) {
        bringToFront();
        addView(super.A01);
        C0635Ly.A0N(this.A0C);
        C0635Ly.A0N(super.A04);
        C0635Ly.A0N(this.A0D);
        C0635Ly.A0N(this.A0B);
        C0635Ly.A0N(this.A03);
        C0635Ly.A0N(super.A03);
        C0635Ly.A0N(this.A0A);
        C0635Ly.A0N(this.A06);
        C0635Ly.A0N(this.A07);
        if (getResources().getConfiguration().orientation == 1) {
            return getPortraitLayoutParams();
        }
        return A01(view);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0679Nr
    public final void A0C(int i) {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0679Nr
    public final void A0D(boolean z) {
    }

    private RelativeLayout.LayoutParams getPortraitLayoutParams() {
        int i = 0;
        int i2 = A0I;
        C0635Ly.A0U(this, -1087164882, new float[]{0.0f, 0.0f, 0.0f, 0.0f, i2, i2, i2, i2});
        RelativeLayout.LayoutParams layoutParams = this.A09;
        int i3 = A0L;
        char c2 = this.A02 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i = i3 * 3;
                    c2 = 3;
                    break;
                case 3:
                    C1170cv c1170cv = this;
                    layoutParams.setMargins(i3, 0, i3, i);
                    c1170cv.A06();
                    return c1170cv.A09;
                case 4:
                    i = i3;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0679Nr
    public void setInfo(C1H c1h, C1J c1j, String str, String str2, @Nullable InterfaceC0682Nu interfaceC0682Nu) {
        super.setInfo(c1h, c1j, str, str2, interfaceC0682Nu);
        this.A00 = c1h;
        A07();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    private void setupMetadataContainer(boolean z) {
        C1170cv c1170cv = this;
        TextView textView = null;
        LinearLayout.LayoutParams layoutParams = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        TextView textView2 = null;
        int i4 = 0;
        TextView textView3 = null;
        float f = 0.0f;
        LinearLayout.LayoutParams layoutParams2 = null;
        LinearLayout.LayoutParams layoutParams3 = null;
        int i5 = 0;
        TextView textView4 = null;
        int i6 = 0;
        int i7 = 0;
        boolean z2 = false;
        TextView textView5 = null;
        boolean z3 = 0;
        LinearLayout linearLayout = null;
        int i8 = 0;
        int i9 = 0;
        c1170cv.A06.removeAllViews();
        c1170cv.A07.removeAllViews();
        LinearLayout.LayoutParams layoutParams4 = c1170cv.A04;
        layoutParams4.weight = 1.0f;
        int i10 = A0L;
        char c2 = z ? (char) 2 : (char) 25;
        while (true) {
            switch (c2) {
                case 2:
                    c1170cv = c1170cv;
                    layoutParams4 = layoutParams4;
                    z3 = 0;
                    z3 = 0;
                    layoutParams4.setMargins(0, 0, i10, 0);
                    layoutParams2 = c1170cv.A05;
                    if (!c1170cv.A01) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    f = 2.0f;
                    c2 = 4;
                    break;
                case 4:
                    c1170cv = c1170cv;
                    layoutParams2 = layoutParams2;
                    layoutParams2.weight = f;
                    textView4 = c1170cv.A0D;
                    z2 = true;
                    z2 = true;
                    if (!c1170cv.A01) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    i6 = 2;
                    c2 = 6;
                    break;
                case 6:
                    c1170cv = c1170cv;
                    textView4 = textView4;
                    textView4.setMaxLines(i6);
                    textView5 = c1170cv.A0D;
                    i2 = 15;
                    if (!c1170cv.A01) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 7:
                    if (!z) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case '\b':
                    i7 = 18;
                    c2 = '\t';
                    break;
                case '\t':
                    c1170cv = c1170cv;
                    textView5 = textView5;
                    C0635Ly.A0b(textView5, z2 ? 1 : 0, i7);
                    i9 = -1;
                    c1170cv.A0D.setTextColor(-1);
                    c1170cv.A0D.setEllipsize(TextUtils.TruncateAt.END);
                    i = 16;
                    c1170cv.A0D.setGravity(16);
                    layoutParams3 = c1170cv.A05;
                    i8 = A0L;
                    if (!z) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c1170cv = c1170cv;
                    layoutParams3 = layoutParams3;
                    layoutParams3.setMargins(z3, z3, i8, z3);
                    textView3 = c1170cv.A0A;
                    if (!z) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    i4 = 8;
                    c2 = '\f';
                    break;
                case '\f':
                    c1170cv = c1170cv;
                    textView3 = textView3;
                    textView3.setVisibility(i4);
                    layoutParams = new LinearLayout.LayoutParams(i9, (int) z3);
                    layoutParams.weight = 1.0f;
                    c1170cv.A0A.setMaxLines(z2 ? 1 : 0);
                    c1170cv.A0A.setTextColor(i9);
                    textView2 = c1170cv.A0A;
                    if (!c1170cv.A01) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    i3 = 48;
                    c2 = 14;
                    break;
                case 14:
                    c1170cv = c1170cv;
                    textView2 = textView2;
                    textView2.setGravity(i3);
                    textView = c1170cv.A0A;
                    i5 = 13;
                    if (!c1170cv.A01) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    c1170cv = c1170cv;
                    layoutParams = layoutParams;
                    textView = textView;
                    C0635Ly.A0b(textView, z3, i2);
                    c1170cv.A0A.setEllipsize(TextUtils.TruncateAt.END);
                    layoutParams.setMargins(z3, z3, A0L * 3, z3);
                    LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, i9);
                    c1170cv.A0B.setTextColor(i9);
                    C0635Ly.A0b(c1170cv.A0B, z2, i5);
                    c1170cv.A0B.setGravity(i);
                    LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, i9);
                    int i11 = A0M;
                    layoutParams6.setMargins(z3, i11, z3, i11);
                    LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, i9);
                    c1170cv.A0C.setMaxLines(z2 ? 1 : 0);
                    c1170cv.A0C.setTextColor(i9);
                    c1170cv.A0C.setEllipsize(TextUtils.TruncateAt.END);
                    c1170cv.A0C.setGravity(i);
                    C0635Ly.A0b(c1170cv.A0C, z3, i5);
                    c1170cv.A07.addView(c1170cv.A0B, layoutParams5);
                    c1170cv.A07.addView(c1170cv.A03, layoutParams6);
                    c1170cv.A07.addView(c1170cv.A0C, layoutParams7);
                    linearLayout = c1170cv.A07;
                    if (!c1170cv.A01) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    z3 = 8;
                    c2 = 17;
                    break;
                case 17:
                    C1170cv c1170cv2 = c1170cv;
                    linearLayout.setVisibility(z3);
                    c1170cv2.A06.addView(c1170cv2.A0D, c1170cv2.A05);
                    c1170cv2.A06.addView(c1170cv2.A07, c1170cv2.A04);
                    c1170cv2.A06.addView(c1170cv2.A0A, layoutParams);
                    return;
                case 18:
                    i2 = 13;
                    c2 = 15;
                    break;
                case 19:
                    i3 = 16;
                    c2 = 14;
                    break;
                case 20:
                    i4 = 0;
                    c2 = '\f';
                    break;
                case 21:
                    i8 *= 3;
                    c2 = '\n';
                    break;
                case 22:
                    i7 = 15;
                    c2 = '\t';
                    break;
                case 23:
                    i6 = 1;
                    c2 = 6;
                    break;
                case 24:
                    f = 1.0f;
                    c2 = 4;
                    break;
                case 25:
                    i10 *= 3;
                    c2 = 2;
                    break;
            }
        }
    }
}
