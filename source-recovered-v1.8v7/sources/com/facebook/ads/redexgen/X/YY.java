package com.facebook.ads.redexgen.X;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: assets/audience_network.dex */
public final class YY extends O8 {

    @Nullable
    public static YY A0O;
    public static byte[] A0P;
    public static final int A0Q;
    public static final int A0R;
    public static final int A0S;
    public static final int A0T;
    public static final int A0U;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public View A06;
    public LinearLayout A07;
    public LinearLayout A08;
    public TextView A09;
    public AnonymousClass17 A0A;
    public NT A0B;
    public NU A0C;

    @Nullable
    public C1011aJ A0D;
    public OC A0E;
    public OL A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final View A0K;
    public final AbstractC01100f A0L;
    public final C0565Jd A0M;
    public final IS A0N;

    public static String A0B(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0P, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 41);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0M() {
        A0P = new byte[]{116};
    }

    static {
        A0M();
        A0S = (int) (C0635Ly.A01 * 26.0f);
        A0Q = (int) (C0635Ly.A01 * 4.0f);
        A0U = (int) (C0635Ly.A01 * 8.0f);
        A0R = C2H.A01(-1, 77);
        A0T = (int) (C0635Ly.A01 * 12.0f);
        A0O = null;
    }

    public YY(OC oc, boolean z) {
        super(oc, true);
        this.A01 = 0;
        this.A0G = false;
        this.A0I = false;
        this.A0J = false;
        this.A0E = oc;
        this.A0A = this.A0E.A04();
        this.A0M = new C0565Jd(oc.A04().A0P(), oc.A06());
        this.A0N = this.A0E.A0A();
        IS is = this.A0N;
        if (is != null) {
            C0635Ly.A0N(is);
        }
        this.A0K = this.A0E.A03();
        this.A0L = C01110g.A01(oc.A05(), oc.A06(), oc.A04().A0P(), Uri.parse(oc.A04().A0L().A0F().A04()), new HashMap(), false, true);
        O6.A00(oc.A05(), this, oc.A04().A0L().A0D().A07());
        setupLayoutConfiguration(z);
        A0J();
        A0D();
        A0E();
        postDelayed(new C0950Yg(this), 1000L);
    }

    public static YY A09(OC oc, boolean z) {
        YY yy = A0O;
        char c2 = yy != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    oc = oc;
                    yy = yy;
                    if (!yy.getUrl().equals(oc.A04().A0L().A0F().A04())) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 3:
                    oc = oc;
                    A0O = new YY(oc, z);
                    c2 = 4;
                    break;
                case 4:
                    A0O.A0G();
                    A0O.A0F();
                    A0O.A0I();
                    return A0O;
                case 5:
                    oc = oc;
                    YY yy2 = A0O;
                    yy2.A0E = oc;
                    yy2.A0S(z);
                    c2 = 4;
                    break;
            }
        }
    }

    private void A0C() {
        C0635Ly.A0M(this.A08);
        this.A08 = new LinearLayout(this.A0E.A05());
        C0635Ly.A0V(this.A08, getAdContextWrapper());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A0G ? this.A02 / 4 : this.A02 / 5);
        layoutParams.addRule(12);
        this.A08.setLayoutParams(layoutParams);
        addView(this.A08, 2);
    }

    private void A0D() {
        C0635Ly.A0M(this.A07);
        this.A07 = new LinearLayout(this.A0E.A05());
        this.A07.setOrientation(1);
        C0635Ly.A0N(this.A07);
        A0K();
        this.A07.setBackgroundColor(-1);
        addView(this.A07);
    }

    private void A0E() {
        C0635Ly.A0M(this.A0B);
        this.A0B = new NT(this.A0E.A05());
        C0635Ly.A0N(this.A0B);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 0.1f;
        this.A0B.setListener(new C0947Yd(this));
        this.A0B.setOnTouchListener(new OG(this));
        this.A07.addView(this.A0B, layoutParams);
        C0635Ly.A0M(this.A0C);
        this.A0C = new NU(this.A0E.A05(), null, R.attr.progressBarStyleHorizontal);
        this.A07.addView(this.A0C, new LinearLayout.LayoutParams(-1, A0Q));
    }

    private void A0F() {
        View view = this.A0K;
        if (view != null) {
            C0635Ly.A0M(view);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(O8.A0A, O8.A0A);
            layoutParams.addRule(10);
            layoutParams.addRule(11);
            layoutParams.setMargins(O8.A09, this.A05, O8.A09, O8.A09);
            addView(this.A0K, layoutParams);
        }
    }

    private void A0G() {
        YY yy = this;
        RelativeLayout.LayoutParams layoutParams = null;
        IS is = yy.A0N;
        char c2 = is != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    yy = yy;
                    is = is;
                    C0635Ly.A0M(is);
                    IS is2 = yy.A0N;
                    int i = A0T;
                    is2.setPadding(i, i, i, i);
                    yy.A0N.A0A(-1, A0R);
                    yy.A0N.setTranslationY(0.0f);
                    layoutParams = new RelativeLayout.LayoutParams(-1, A0S);
                    if (!yy.A0H) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    yy = yy;
                    layoutParams = layoutParams;
                    layoutParams.addRule(8, yy.A06.getId());
                    c2 = 4;
                    break;
                case 4:
                    yy = yy;
                    layoutParams = layoutParams;
                    yy.addView(yy.A0N, layoutParams);
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    layoutParams = layoutParams;
                    layoutParams.addRule(12);
                    c2 = 4;
                    break;
            }
        }
    }

    private void A0I() {
        YY yy = this;
        boolean z = false;
        ML mlA08 = yy.A0E.A08();
        char c2 = mlA08 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    yy = yy;
                    if (!yy.A0H) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 4:
                    mlA08 = mlA08;
                    if (!mlA08.A06()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 5:
                    z = true;
                    c2 = 6;
                    break;
                case 6:
                    mlA08.setPageDetailsVisible(z);
                    return;
                case 7:
                    z = false;
                    c2 = 6;
                    break;
            }
        }
    }

    private void A0J() {
        int i = 0;
        this.A06 = this.A0E.A02();
        C0635Ly.A0M(this.A06);
        C0635Ly.A0N(this.A06);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        addView(this.A06, 1, layoutParams);
        this.A09 = new TextView(this.A0E.A05());
        C0635Ly.A0N(this.A09);
        this.A09.setGravity(17);
        this.A09.setTextColor(getColors().A05(true));
        this.A09.setEllipsize(TextUtils.TruncateAt.END);
        this.A09.setMaxLines(2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        int i2 = A0U;
        int i3 = i2 / 2;
        char c2 = this.A0N == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i = i2;
                    c2 = 3;
                    break;
                case 3:
                    YY yy = this;
                    RelativeLayout.LayoutParams layoutParams3 = layoutParams2;
                    layoutParams3.setMargins(i2, i3, i2, i);
                    yy.addView(yy.A09, layoutParams3);
                    C0635Ly.A0N(yy.A09);
                    OC oc = yy.A0E;
                    yy.A0F = new OL(oc, oc.A04().A0L().A0F().A03(), yy.getColors(), new C0949Yf(yy));
                    C0635Ly.A0J(AdError.NO_FILL_ERROR_CODE, yy.A0F);
                    yy.addView(yy.A0F);
                    yy.A0L();
                    yy.A0C();
                    return;
                case 4:
                    i = A0S;
                    c2 = 3;
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0K() {
        YY yy = this;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (yy.A03 * 4) / 5);
        char c2 = yy.A0b() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    yy = yy;
                    layoutParams = layoutParams;
                    layoutParams.setMargins(0, 0, 0, 0);
                    layoutParams.addRule(12);
                    yy.A07.setLayoutParams(layoutParams);
                    c2 = 3;
                    break;
                case 3:
                    YY yy2 = yy;
                    yy2.A07.setTranslationY(0.0f);
                    yy2.A07.setLayoutParams(layoutParams);
                    return;
                case 4:
                    yy = yy;
                    layoutParams = layoutParams;
                    layoutParams.setMargins(0, yy.A03 + 1, 0, 0);
                    c2 = 3;
                    break;
            }
        }
    }

    private void A0L() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, this.A0G ? this.A02 / 4 : this.A02 / 5);
        layoutParams.addRule(14);
        layoutParams.addRule(2, this.A09.getId());
        layoutParams.setMargins(0, 0, 0, 0);
        this.A0F.setLayoutParams(layoutParams);
        if (!this.A0A.A0e()) {
            C0635Ly.A0M(this.A0F);
            addView(this.A0F, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0Q(String str) {
        C0635Ly.A0M(this.A0D);
        this.A0D = new C1011aJ(this.A0E.A05(), new C0946Yc(this));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 0.9f;
        this.A07.addView(this.A0D, layoutParams);
        this.A0D.loadUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0R(boolean z) {
        int i = 0;
        IS is = null;
        int i2 = 0;
        int i3 = 0;
        long j = 0;
        ObjectAnimator mediaViewTransAnim = null;
        ObjectAnimator objectAnimatorOfFloat = null;
        ObjectAnimator objectAnimatorOfFloat2 = null;
        int[] iArr = null;
        IS is2 = null;
        float[] fArr = null;
        long j2 = 0;
        int i4 = 0;
        int i5 = 0;
        int height = 0;
        LinearLayout linearLayout = null;
        float f = 0.0f;
        AnimatorSet animatorSet = null;
        float[] fArr2 = null;
        View view = null;
        YY yy = this;
        yy.A0H = z;
        yy.postDelayed(new C0945Yb(yy, z), 250L);
        ObjectAnimator objectAnimatorOfFloat3 = null;
        String strA0B = A0B(0, 1, 36);
        char c2 = 0;
        char c3 = z ? (char) 2 : (char) 26;
        while (true) {
            switch (c3) {
                case 2:
                    yy = yy;
                    strA0B = strA0B;
                    c2 = 0;
                    OL ol = yy.A0F;
                    objectAnimatorOfFloat = ObjectAnimator.ofFloat(ol, strA0B, ol.getY(), yy.A03 / 5);
                    c3 = 3;
                    break;
                case 3:
                    yy = yy;
                    linearLayout = yy.A07;
                    fArr2 = new float[2];
                    fArr2[c2] = linearLayout.getY();
                    i5 = yy.A03;
                    if (!z) {
                        c3 = 5;
                        break;
                    } else {
                        c3 = 4;
                        break;
                    }
                case 4:
                    i5 /= 5;
                    c3 = 5;
                    break;
                case 5:
                    yy = yy;
                    strA0B = strA0B;
                    linearLayout = linearLayout;
                    fArr2 = fArr2;
                    fArr2[1] = i5;
                    mediaViewTransAnim = ObjectAnimator.ofFloat(linearLayout, strA0B, fArr2);
                    j2 = 500;
                    mediaViewTransAnim.setDuration(500L);
                    i = (yy.A03 / 2) - (yy.A01 / 2);
                    view = yy.A06;
                    fArr = new float[2];
                    fArr[c2] = view.getY();
                    if (!z) {
                        c3 = 6;
                        break;
                    } else {
                        c3 = 7;
                        break;
                    }
                case 6:
                    yy = yy;
                    if (!yy.A0G) {
                        c3 = 25;
                        break;
                    } else {
                        c3 = 7;
                        break;
                    }
                case 7:
                    f = 0.0f;
                    c3 = '\b';
                    break;
                case '\b':
                    yy = yy;
                    strA0B = strA0B;
                    view = view;
                    fArr = fArr;
                    fArr[1] = f;
                    objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, strA0B, fArr);
                    objectAnimatorOfFloat2.setDuration(j2);
                    is = yy.A0N;
                    if (is != null) {
                        c3 = 24;
                        break;
                    } else {
                        c3 = '\t';
                        break;
                    }
                case '\t':
                    height = 0;
                    c3 = '\n';
                    break;
                case '\n':
                    if (!z) {
                        c3 = 23;
                        break;
                    } else {
                        c3 = 11;
                        break;
                    }
                case 11:
                    yy = yy;
                    i4 = (yy.A02 / 5) - height;
                    c3 = '\f';
                    break;
                case '\f':
                    yy = yy;
                    is2 = yy.A0N;
                    if (is2 == null) {
                        c3 = 14;
                        break;
                    } else {
                        c3 = '\r';
                        break;
                    }
                case '\r':
                    strA0B = strA0B;
                    is2 = is2;
                    float[] fArr3 = new float[2];
                    fArr3[c2] = is2.getY();
                    fArr3[1] = i4;
                    objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(is2, strA0B, fArr3);
                    c3 = 14;
                    break;
                case 14:
                    yy = yy;
                    iArr = new int[2];
                    iArr[c2] = yy.A06.getHeight();
                    if (!z) {
                        c3 = 22;
                        break;
                    } else {
                        c3 = 15;
                        break;
                    }
                case 15:
                    yy = yy;
                    i3 = yy.A03 / 5;
                    c3 = 16;
                    break;
                case 16:
                    yy = yy;
                    mediaViewTransAnim = mediaViewTransAnim;
                    objectAnimatorOfFloat2 = objectAnimatorOfFloat2;
                    iArr = iArr;
                    iArr[1] = i3;
                    ValueAnimator duration = ValueAnimator.ofInt(iArr).setDuration(500L);
                    duration.addUpdateListener(new OH(yy));
                    animatorSet = new AnimatorSet();
                    animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
                    Animator[] animatorArr = new Animator[3];
                    animatorArr[c2] = mediaViewTransAnim;
                    animatorArr[1] = objectAnimatorOfFloat2;
                    animatorArr[2] = duration;
                    animatorSet.playTogether(animatorArr);
                    if (objectAnimatorOfFloat == null) {
                        c3 = 21;
                        break;
                    } else {
                        c3 = 17;
                        break;
                    }
                case 17:
                    animatorSet = animatorSet;
                    j = 500;
                    objectAnimatorOfFloat.setDuration(500L);
                    i2 = 1;
                    Animator[] animatorArr2 = new Animator[1];
                    animatorArr2[c2] = objectAnimatorOfFloat;
                    animatorSet.playTogether(animatorArr2);
                    c3 = 18;
                    break;
                case 18:
                    if (objectAnimatorOfFloat3 == null) {
                        c3 = 20;
                        break;
                    } else {
                        c3 = 19;
                        break;
                    }
                case 19:
                    animatorSet = animatorSet;
                    objectAnimatorOfFloat3.setDuration(j);
                    Animator[] animatorArr3 = new Animator[i2];
                    animatorArr3[c2] = objectAnimatorOfFloat3;
                    animatorSet.playTogether(animatorArr3);
                    c3 = 20;
                    break;
                case 20:
                    AnimatorSet animatorSet2 = animatorSet;
                    animatorSet2.addListener(new OI(yy, z));
                    animatorSet2.start();
                    return;
                case 21:
                    j = 500;
                    i2 = 1;
                    c3 = 18;
                    break;
                case 22:
                    yy = yy;
                    i3 = yy.A01;
                    c3 = 16;
                    break;
                case 23:
                    yy = yy;
                    i4 = (yy.A03 - A0S) - A0U;
                    c3 = '\f';
                    break;
                case 24:
                    is = is;
                    height = is.getHeight();
                    c3 = '\n';
                    break;
                case 25:
                    f = i;
                    c3 = '\b';
                    break;
                case 26:
                    objectAnimatorOfFloat3 = null;
                    objectAnimatorOfFloat = null;
                    c3 = 3;
                    break;
            }
        }
    }

    private void A0S(boolean z) {
        YY yy = this;
        RelativeLayout.LayoutParams layoutParams = null;
        yy.setupLayoutConfiguration(z);
        C0635Ly.A0M(yy.A06);
        yy.A06 = yy.A0E.A02();
        C0635Ly.A0N(yy.A06);
        char c2 = yy.A0H ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    yy = yy;
                    layoutParams = new RelativeLayout.LayoutParams(-1, yy.A03 / 5);
                    layoutParams.addRule(14);
                    layoutParams.addRule(10);
                    c2 = 3;
                    break;
                case 3:
                    YY yy2 = yy;
                    yy2.A06.setTranslationY(0.0f);
                    yy2.addView(yy2.A06, 1, layoutParams);
                    yy2.A0C();
                    yy2.A0L();
                    return;
                case 4:
                    yy = yy;
                    layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams.addRule(13);
                    yy.A0D();
                    yy.A0E();
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.O8
    public final void A0V() {
        super.A0V();
        A0O = null;
    }

    @Override // com.facebook.ads.redexgen.X.O8
    public final void A0W() {
        YY yy = this;
        boolean z = false;
        ML mlA08 = yy.A0E.A08();
        char c2 = mlA08 != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    yy = yy;
                    if (!yy.A0b()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 3:
                    mlA08 = mlA08;
                    if (!mlA08.A06()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 4:
                    z = true;
                    c2 = 5;
                    break;
                case 5:
                    mlA08 = mlA08;
                    mlA08.setPageDetailsVisible(z);
                    c2 = 6;
                    break;
                case 6:
                    return;
                case 7:
                    z = false;
                    c2 = 5;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.O8
    public final void A0X() {
        if (this.A0E.A08() != null) {
            this.A0E.A08().setPageDetailsVisible(false);
        }
    }

    @Override // com.facebook.ads.redexgen.X.O8
    public final void A0Y() {
        this.A0J = false;
    }

    @Override // com.facebook.ads.redexgen.X.O8
    public final void A0Z() {
        this.A0J = true;
    }

    @Override // com.facebook.ads.redexgen.X.O8
    public final void A0a(C1A c1a, String str, double d2, @Nullable Bundle bundle) {
        YY yy = this;
        int i = 0;
        super.A0a(c1a, str, d2, bundle);
        String strA05 = c1a.A0E().A05();
        char c2 = strA05 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    strA05 = strA05;
                    if (strA05.trim().length() != 0) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    yy = yy;
                    C0635Ly.A0Q(yy.A08, 8);
                    c2 = 4;
                    break;
                case 4:
                    if (d2 <= 0.0d) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    yy = yy;
                    yy.A01 = (int) (yy.A04 / d2);
                    c2 = 6;
                    break;
                case 6:
                    yy = yy;
                    if (!yy.A0G) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    yy = yy;
                    i = yy.A02;
                    c2 = '\b';
                    break;
                case '\b':
                    yy.A01 = i;
                    return;
                case '\t':
                    yy = yy;
                    i = yy.A01;
                    c2 = '\b';
                    break;
                case '\n':
                    yy = yy;
                    strA05 = strA05;
                    yy.A09.setText(strA05);
                    c2 = 4;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.O8
    public final boolean A0b() {
        return this.A0H;
    }

    @Override // com.facebook.ads.redexgen.X.O8
    public final boolean A0c() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.O8
    public final boolean A0d(boolean z) {
        if (!A0b()) {
            return false;
        }
        A0R(false);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.O8
    @ToolbarActionView$ToolbarActionMode
    public int getCloseButtonStyle() {
        YY yy = this;
        char c2 = yy.A0b() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return 3;
                case 3:
                    yy = yy;
                    if (!yy.A0J) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return 2;
                case 5:
                    return super.getCloseButtonStyle();
            }
        }
    }

    private String getUrl() {
        return this.A0E.A04().A0L().A0F().A04();
    }

    @Override // com.facebook.ads.redexgen.X.O8, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A0A.A0e()) {
            A09(this.A0E, A0b());
        }
        setupLayoutConfiguration(A0b());
        A0K();
    }

    private void setupLayoutConfiguration(boolean z) {
        YY yy = this;
        int i = 0;
        int toolbarHeight = 0;
        boolean z2 = false;
        int i2 = 0;
        char c2 = yy.getResources().getConfiguration().orientation == 2 ? (char) 2 : (char) 11;
        while (true) {
            switch (c2) {
                case 2:
                    z2 = true;
                    c2 = 3;
                    break;
                case 3:
                    yy = yy;
                    yy.A0G = z2;
                    if (yy.A0E.A08() != null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    toolbarHeight = 0;
                    c2 = 5;
                    break;
                case 5:
                    yy = yy;
                    yy.A05 = toolbarHeight;
                    yy.A0H = z;
                    yy.A02 = Resources.getSystem().getDisplayMetrics().heightPixels;
                    yy.A04 = Resources.getSystem().getDisplayMetrics().widthPixels;
                    i = yy.A02;
                    if (!yy.A0G) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    yy = yy;
                    yy.A03 = i + i2;
                    if (!yy.A0A.A0e()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    yy = yy;
                    yy.A01 = yy.A02;
                    c2 = '\b';
                    break;
                case '\b':
                    return;
                case '\t':
                    yy = yy;
                    i2 = yy.A05;
                    c2 = 6;
                    break;
                case '\n':
                    yy = yy;
                    toolbarHeight = yy.A0E.A08().getToolbarHeight();
                    c2 = 5;
                    break;
                case 11:
                    z2 = false;
                    c2 = 3;
                    break;
            }
        }
    }
}
