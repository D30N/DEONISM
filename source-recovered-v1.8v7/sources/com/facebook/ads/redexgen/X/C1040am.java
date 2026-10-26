package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

@SuppressLint({"ViewConstructor"})
@TargetApi(16)
/* renamed from: com.facebook.ads.redexgen.X.am, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1040am extends RelativeLayout implements MR {
    public static byte[] A0Q;
    public static final int A0R;
    public static final int A0S;
    public static final int A0T;
    public static final int A0U;
    public static final int A0V;
    public static final int A0W;
    public static final int A0X;
    public static final int A0Y;
    public static final int A0Z;
    public static final RelativeLayout.LayoutParams A0a;

    @Nullable
    public View A00;

    @Nullable
    public RelativeLayout A01;

    @Nullable
    public RelativeLayout A02;
    public Toast A03;

    @Nullable
    public C02304x A04;

    @Nullable
    public ViewOnClickListenerC0998a5 A05;
    public Os A06;
    public boolean A07;
    public boolean A08;
    public final AnonymousClass17 A09;
    public final C1T A0A;
    public final InterfaceC02284v A0B;
    public final XI A0C;
    public final JW A0D;
    public final C0565Jd A0E;
    public final LO A0F;
    public final ViewOnSystemUiVisibilityChangeListenerC0623Lm A0G;
    public final MQ A0H;
    public final InterfaceC0657Mv A0I;
    public final C0710Ox A0J;
    public final C0711Oy A0K;
    public final AtomicBoolean A0L;
    public final AtomicBoolean A0M;
    public final boolean A0N;
    public final boolean A0O;

    @VisibleForTesting
    public final ML A0P;

    public static String A0C(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0Q, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 49);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0M() {
        A0Q = new byte[]{-24, -19, -13, -28, -15, -14, -13, -24, -13, -24, -32, -21, 5, -8, 10, -12, 5, -9, -8, -9, -14, 9, -4, -9, -8, 2, -107, 103, -19, 5, -9, -11, 5, -17, -71, -62, -65, -71, -63, -75, -59, -56, -65, -67, -65, -60, -31, -44, -25, -36, -23, -40, -46, -42, -33, -36, -42, -34, -51, -69, -72, -52, -65, -69, -51, -75, -71, -62, -65, -71, -63, -17, -21, -32, -30, -28, -20, -28, -19, -13, -3, 9, 7, -56, 0, -5, -3, -1, -4, 9, 9, 5, -56, -5, -2, 13, -56, 3, 8, 14, -1, 12, 13, 14, 3, 14, 3, -5, 6, -56, -3, 6, 3, -3, 5, -1, -2};
    }

    static {
        A0M();
        A0Y = (int) (C0635Ly.A01 * 64.0f);
        A0T = (int) (C0635Ly.A01 * 16.0f);
        A0Z = (int) (C0635Ly.A01 * 12.0f);
        A0R = (int) (C0635Ly.A01 * 10.0f);
        A0a = new RelativeLayout.LayoutParams(-1, -1);
        A0U = (int) (C0635Ly.A01 * 48.0f);
        A0V = (int) (C0635Ly.A01 * 16.0f);
        A0X = (int) (C0635Ly.A01 * 14.0f);
        A0W = C2H.A01(-1, 77);
        A0S = (int) (C0635Ly.A01 * 8.0f);
    }

    public C1040am(XI xi, JW jw, MQ mq, AnonymousClass17 anonymousClass17, @Nullable String str, InterfaceC0657Mv interfaceC0657Mv) {
        super(xi);
        this.A0B = new C1047at(this);
        this.A0M = new AtomicBoolean(false);
        this.A0L = new AtomicBoolean(false);
        this.A0C = xi;
        this.A0H = mq;
        this.A0D = jw;
        this.A09 = anonymousClass17;
        this.A0A = anonymousClass17.A0L().A0D().A06();
        this.A0E = new C0565Jd(this.A09.A0P(), this.A0D);
        this.A0I = interfaceC0657Mv;
        this.A0K = new C0711Oy(xi, this.A0I, str, this.A0H);
        this.A0M.set(!this.A0A.A0H());
        this.A0F = new LO(this.A0A.A07(), new C1042ao(this, null));
        this.A0O = JQ.A1f(this.A0C);
        this.A0N = JQ.A0d(this.A0C);
        this.A0P = A05();
        this.A0J = new C0710Ox(this.A0C, this.A0D, this.A09);
        if (this.A0O) {
            O6.A00(xi, this, anonymousClass17.A0L().A0D().A07());
        } else {
            C0635Ly.A0P(this, -14473425);
        }
        this.A0G = new ViewOnSystemUiVisibilityChangeListenerC0623Lm(this);
        this.A0G.A05(EnumC0622Ll.A02);
    }

    private ML A05() {
        FullScreenAdToolbar fullScreenAdToolbar = new FullScreenAdToolbar(this.A0C, this.A0H, this.A0E, 0, this.A09.A0D());
        fullScreenAdToolbar.A04(this.A09.A0K().A01(), true);
        fullScreenAdToolbar.setPageDetailsVisible(false);
        fullScreenAdToolbar.setPageDetails(this.A09.A0N(), this.A09.A0P(), this.A0A.A07(), this.A09.A0O());
        fullScreenAdToolbar.setToolbarListener(new C1045ar(this));
        return fullScreenAdToolbar;
    }

    @Nullable
    private ViewOnClickListenerC0998a5 A08() {
        Os os = this.A06;
        if (os == null || os.getViewabilityChecker() == null || this.A06.getTouchDataRecorder() == null) {
            return null;
        }
        C1I c1iA01 = this.A09.A0K().A01();
        ViewOnClickListenerC0998a5 viewOnClickListenerC0998a5 = new ViewOnClickListenerC0998a5(this.A0C, A0C(80, 37, 105), c1iA01, this.A0D, this.A0H, this.A06.getViewabilityChecker(), this.A06.getTouchDataRecorder());
        C0635Ly.A0N(viewOnClickListenerC0998a5);
        viewOnClickListenerC0998a5.setText(this.A09.A0L().A0F().A03());
        viewOnClickListenerC0998a5.setTextSize(14.0f);
        viewOnClickListenerC0998a5.setIncludeFontPadding(false);
        int i = A0R;
        viewOnClickListenerC0998a5.setPadding(i, i, i, i);
        if (!this.A0O) {
            C0635Ly.A0Q(viewOnClickListenerC0998a5, 8);
        }
        viewOnClickListenerC0998a5.setOnClickListener(new ViewOnClickListenerC0638Mb(this));
        return viewOnClickListenerC0998a5;
    }

    private O5 A0A() {
        O5 o5 = new O5(this.A0C, this.A09.A0K().A01(), true, 16, 14, 0);
        o5.A01(this.A09.A0L().A0E().A06(), this.A09.A0L().A0E().A05(), null, false, true);
        TextView descriptionTextView = o5.getDescriptionTextView();
        descriptionTextView.setAlpha(0.8f);
        descriptionTextView.setMaxLines(1);
        descriptionTextView.setEllipsize(TextUtils.TruncateAt.END);
        TextView titleTextView = o5.getTitleTextView();
        titleTextView.setMaxLines(1);
        titleTextView.setEllipsize(TextUtils.TruncateAt.END);
        return o5;
    }

    private void A0F() {
        int i = A0U;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        C0687Nz c0687Nz = new C0687Nz(this.A0C);
        C0635Ly.A0P(c0687Nz, 0);
        C0635Ly.A0N(c0687Nz);
        AsyncTaskC1002aA asyncTaskC1002aA = new AsyncTaskC1002aA(c0687Nz, this.A0C);
        int i2 = A0U;
        asyncTaskC1002aA.A05(i2, i2).A07(this.A09.A0N().A01());
        TextView textView = new TextView(this.A0C);
        C0635Ly.A0N(textView);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setTextColor(this.A09.A0K().A01().A06(true));
        textView.setText(this.A09.A0L().A0E().A06());
        textView.setTextSize(16.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        O1 o1 = new O1(this.A0C, A0X, 5, A0W, -1);
        o1.setGravity(16);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
        TextView textView2 = new TextView(this.A0C);
        textView2.setTextColor(this.A09.A0K().A01().A06(true));
        textView2.setGravity(16);
        textView2.setIncludeFontPadding(false);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams3.leftMargin = A0S;
        LinearLayout linearLayout = new LinearLayout(this.A0C);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, A0V);
        layoutParams4.topMargin = A0S / 2;
        layoutParams4.addRule(3, textView.getId());
        linearLayout.addView(o1, layoutParams2);
        linearLayout.addView(textView2, layoutParams3);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.leftMargin = A0S;
        layoutParams5.addRule(1, c0687Nz.getId());
        layoutParams5.addRule(15);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.addView(linearLayout, layoutParams4);
        relativeLayout.addView(textView);
        RelativeLayout relativeLayout2 = this.A02;
        if (relativeLayout2 != null) {
            relativeLayout2.removeAllViews();
            this.A02.addView(relativeLayout, layoutParams5);
            this.A02.addView(c0687Nz, layoutParams);
        }
        if (TextUtils.isEmpty(this.A09.A0L().A0E().A03())) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        o1.setRating(Float.parseFloat(this.A09.A0L().A0E().A03()));
        if (this.A09.A0L().A0E().A02() == null) {
            return;
        }
        textView2.setText(A0C(27, 1, 14) + NumberFormat.getNumberInstance().format(Integer.parseInt(this.A09.A0L().A0E().A02())) + A0C(26, 1, 59));
    }

    private void A0G() {
        C1040am c1040am = this;
        char c2 = c1040am.A0A.A0H() ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    c1040am = c1040am;
                    c1040am.A0I();
                    c2 = 3;
                    break;
                case 3:
                    if (Build.VERSION.SDK_INT < 19) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1040am = c1040am;
                    c1040am.A0G.A05(EnumC0622Ll.A03);
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    c1040am = c1040am;
                    c1040am.A0J();
                    c2 = 3;
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H() {
        C1040am c1040am = this;
        c1040am.A08 = true;
        char c2 = c1040am.A09.A0L().A0K() ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c1040am = c1040am;
                    c1040am.A0K.A05();
                    c1040am.A0H.A3s(c1040am.A0I.A5F(), new C02987x(0, 0));
                    if (!c1040am.A07) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c1040am = c1040am;
                    if (!c1040am.A0O) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    c1040am = c1040am;
                    C0683Nv.A03(c1040am.A0C, c1040am.A06.getViewabilityChecker(), c1040am.A06.getTouchDataRecorder(), c1040am.A0D, c1040am.A09.A0L().A0F(), c1040am.A09.A0P());
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    private void A0I() {
        C0689Ob c0689ObA0B = new OZ(this.A0C, this.A09.A0L().A0E(), this.A09.A0N()).A08(this.A09.A0K().A01()).A0A(this.A0A.A0F()).A09(this.A0A.A0D()).A07(AdError.SERVER_ERROR_CODE).A0B();
        C0567Jf.A04(c0689ObA0B, this.A0E, EnumC0564Jc.A0T);
        addView(c0689ObA0B, A0a);
        c0689ObA0B.A04(new C1046as(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0J() {
        C1040am c1040am = this;
        int i = 0;
        ViewOnClickListenerC0998a5 viewOnClickListenerC0998a5 = null;
        RelativeLayout.LayoutParams layoutParams = null;
        int i2 = 0;
        C0635Ly.A0X(c1040am);
        c1040am.A06.A0B();
        c1040am.A05 = c1040am.A08();
        c1040am.A01 = new RelativeLayout(c1040am.getContext());
        C0635Ly.A0N(c1040am.A01);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        int i3 = A0T;
        int i4 = A0Z;
        layoutParams2.setMargins(i3, i4, i3, i4);
        layoutParams2.addRule(12);
        c1040am.A02 = new RelativeLayout(c1040am.getContext());
        C0635Ly.A0N(c1040am.A02);
        char c2 = c1040am.A0N ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    c1040am = c1040am;
                    c1040am.A0F();
                    c2 = 3;
                    break;
                case 3:
                    c1040am = c1040am;
                    i = -1;
                    layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    i2 = 0;
                    layoutParams.setMargins(0, 0, A0T, 0);
                    c1040am.A01.addView(c1040am.A02, layoutParams);
                    viewOnClickListenerC0998a5 = c1040am.A05;
                    if (viewOnClickListenerC0998a5 == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1040am = c1040am;
                    layoutParams = layoutParams;
                    viewOnClickListenerC0998a5 = viewOnClickListenerC0998a5;
                    layoutParams.addRule(i2, viewOnClickListenerC0998a5.getId());
                    RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams3.addRule(11);
                    layoutParams3.addRule(6, c1040am.A02.getId());
                    layoutParams3.addRule(8, c1040am.A02.getId());
                    c1040am.A01.addView(c1040am.A05, layoutParams3);
                    c2 = 5;
                    break;
                case 5:
                    C1040am c1040am2 = c1040am;
                    C0635Ly.A0N(c1040am2.A0P);
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(i, -2);
                    layoutParams4.addRule(10);
                    RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(i, i);
                    int i5 = A0T;
                    layoutParams5.setMargins(i5, i2, i5, i2);
                    layoutParams5.addRule(3, c1040am2.A0P.getId());
                    layoutParams5.addRule(2, c1040am2.A01.getId());
                    c1040am2.addView(c1040am2.A0P, layoutParams4);
                    c1040am2.addView(c1040am2.A06, layoutParams5);
                    c1040am2.addView(c1040am2.A01, layoutParams2);
                    c1040am2.A0F.A07();
                    return;
                case 6:
                    c1040am = c1040am;
                    RelativeLayout relativeLayout = c1040am.A02;
                    O5 o5A0A = c1040am.A0A();
                    RelativeLayout.LayoutParams iconAndMetaDataContainerParams = new RelativeLayout.LayoutParams(-2, -2);
                    relativeLayout.addView(o5A0A, iconAndMetaDataContainerParams);
                    c2 = 3;
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0K() {
        C1040am c1040am = this;
        RelativeLayout.LayoutParams screenshotParams = null;
        RelativeLayout relativeLayout = null;
        RelativeLayout relativeLayout2 = null;
        new C0565Jd(c1040am.A09.A0P(), c1040am.A0D).A02(EnumC0564Jc.A0m, null);
        c1040am.A0L.set(true);
        C0635Ly.A0X(c1040am);
        C0635Ly.A0K(c1040am.A06);
        C0635Ly.A0d(c1040am.A06, c1040am.A00);
        C0635Ly.A0O(c1040am.A0P);
        Pair<EnumC0709Ow, View> pairA02 = c1040am.A0J.A02(c1040am.A05);
        c1040am.A00 = (View) pairA02.second;
        int i = C0639Mc.A00[((EnumC0709Ow) pairA02.first).ordinal()];
        char c2 = i != 1 ? (char) 2 : (char) 7;
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
                    return;
                case 4:
                    c1040am = c1040am;
                    relativeLayout2 = c1040am.A01;
                    if (relativeLayout2 == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    relativeLayout2 = relativeLayout2;
                    C0635Ly.A0d(relativeLayout2);
                    c2 = 6;
                    break;
                case 6:
                    c1040am = c1040am;
                    c1040am.addView(c1040am.A00, new RelativeLayout.LayoutParams(-1, -1));
                    c2 = 3;
                    break;
                case 7:
                    c1040am = c1040am;
                    screenshotParams = new RelativeLayout.LayoutParams(-1, -1);
                    screenshotParams.setMargins(0, c1040am.A0P.getToolbarHeight(), 0, 0);
                    relativeLayout = c1040am.A01;
                    if (relativeLayout == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    screenshotParams = screenshotParams;
                    relativeLayout = relativeLayout;
                    screenshotParams.addRule(2, relativeLayout.getId());
                    c2 = '\t';
                    break;
                case '\t':
                    c1040am = c1040am;
                    screenshotParams = screenshotParams;
                    c1040am.addView(c1040am.A00, screenshotParams);
                    c2 = 3;
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L() {
        Toast toast = this.A03;
        char c2 = toast != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    toast = toast;
                    if (toast.getView().getWindowVisibility() != 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    C1040am c1040am = this;
                    c1040am.A03 = Toast.makeText(c1040am.getContext(), c1040am.A0A.A0C(), 1);
                    c1040am.A0N((int) c1040am.A0F.A03());
                    c1040am.A03.show();
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N(int i) {
        C0635Ly.A0c(this.A03, this.A0A.A0C().replace(A0C(28, 6, 97), String.valueOf(i)), 49, 0, A0Y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0U(boolean z) {
        HashMap map = new HashMap();
        map.put(A0C(34, 12, 37), z ? A0C(58, 13, 37) : A0C(46, 12, 66));
        C0683Nv c0683Nv = new C0683Nv(this.A0C, this.A0I.A5j(), this.A06.getViewabilityChecker(), this.A06.getTouchDataRecorder(), this.A0D, this.A0H);
        if (this.A0O) {
            c0683Nv.A08(this.A09.A0P(), this.A09.A0L().A0F().A04(), map);
            return;
        }
        boolean z2 = !this.A0F.A04();
        c0683Nv.A0A(!z2);
        c0683Nv.A08(this.A09.A0P(), this.A09.A0L().A0F().A04(), map);
        if (z2) {
            new Handler(Looper.getMainLooper()).post(new C1043ap(this));
        }
        this.A07 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0V() {
        C1040am c1040am = this;
        boolean z = false;
        char c2 = !c1040am.A09.A0S().equals(A0C(12, 14, 98)) ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c1040am = c1040am;
                    if (!c1040am.A09.A0S().equals(A0C(0, 12, 78))) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c1040am = c1040am;
                    if (!c1040am.A09.A0L().A0M()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z = true;
                    c2 = 5;
                    break;
                case 5:
                    return z;
                case 6:
                    z = false;
                    c2 = 5;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void A7s(Intent intent, Bundle bundle, C02304x c02304x) {
        this.A04 = c02304x;
        this.A04.A0K(this.A0B);
        HashMap map = new HashMap();
        map.put(A0C(71, 9, 78), this.A0I.A6k());
        C1T c1tA06 = this.A09.A0L().A0D().A06();
        if (c1tA06 == null) {
            this.A0H.A3r(this.A0I.A6C());
            this.A0H.A3r(this.A0I.A67());
        } else {
            this.A06 = new Os(this.A0C, this.A09, c1tA06, this.A0D, new C1041an(this, null), map);
            this.A0H.A3K(this, new RelativeLayout.LayoutParams(-1, -1));
            A0G();
        }
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void AAT(boolean z) {
        this.A0F.A06();
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void AAq(boolean z) {
        C1040am c1040am = this;
        char c2 = c1040am.A0M.get() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c1040am = c1040am;
                    if (!c1040am.A0F.A05()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    c1040am = c1040am;
                    c1040am.A0F.A07();
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void ACm(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void onDestroy() {
        C1040am c1040am = this;
        c1040am.A0G.A03();
        C02304x c02304x = c1040am.A04;
        char c2 = c02304x != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c1040am = c1040am;
                    c02304x = c02304x;
                    c02304x.A0L(c1040am.A0B);
                    c2 = 3;
                    break;
                case 3:
                    c1040am = c1040am;
                    if (c1040am.A06 == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1040am = c1040am;
                    if (!TextUtils.isEmpty(c1040am.A09.A0P())) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    c1040am = c1040am;
                    c1040am.A0D.A81(c1040am.A09.A0P(), new C0676No().A03(c1040am.A06.getViewabilityChecker()).A02(c1040am.A06.getTouchDataRecorder()).A05());
                    c2 = 6;
                    break;
                case 6:
                    c1040am = c1040am;
                    c1040am.A06.A0C();
                    c2 = 7;
                    break;
                case 7:
                    C1040am c1040am2 = c1040am;
                    c1040am2.A0F.A06();
                    c1040am2.A0P.setToolbarListener(null);
                    c1040am2.A03 = null;
                    c1040am2.A04 = null;
                    return;
            }
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        C1040am c1040am = this;
        super.onWindowFocusChanged(z);
        char c2 = z ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c1040am = c1040am;
                    c1040am.AAq(false);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    c1040am = c1040am;
                    c1040am.AAT(false);
                    c2 = 3;
                    break;
            }
        }
    }

    public void setListener(MQ mq) {
    }
}
