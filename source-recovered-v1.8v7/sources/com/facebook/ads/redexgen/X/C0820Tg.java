package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.facebook.ads.DefaultMediaViewVideoRenderer;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.api.AdComponentView;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.AdComponentViewParentApi;
import com.facebook.ads.internal.api.AdViewConstructorParams;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.api.MediaViewApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.Repairable;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Tg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0820Tg extends AnonymousClass52 implements MediaViewApi, Repairable, C8A {
    public static byte[] A0D;
    public static final String A0E;
    public View A00;
    public ImageView A01;
    public MediaView A02;

    @Nullable
    public MediaViewListener A03;
    public MediaViewVideoRenderer A04;
    public C0452Eq A05;
    public AdComponentViewParentApi A06;
    public XI A07;
    public C1V A08;
    public C0673Nl A09;

    @Nullable
    public C0703Op A0A;
    public boolean A0B;
    public boolean A0C;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 92);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A05() {
        A0D = new byte[]{-24, -28, -29, 23, 6, 11, 7, 16, 5, 7, -16, 7, 22, 25, 17, 20, 13, -69, -33, -45, -39, -41, -110, -28, -41, -32, -42, -41, -28, -41, -28, -110, -33, -25, -27, -26, -110, -44, -41, -110, -27, -41, -26, -110, -44, -41, -40, -31, -28, -41, -110, -32, -45, -26, -37, -24, -41, -77, -42, -96, 13, 43, 60, 57, 63, 61, 47, 54, -22, 60, 47, 56, 46, 47, 60, 47, 60, -22, 55, 63, 61, 62, -22, 44, 47, -22, 61, 47, 62, -22, 44, 47, 48, 57, 60, 47, -22, 56, 43, 62, 51, 64, 47, 11, 46, -8, -68, -49, -30, -41, -28, -45, -114, -81, -46, -114, -73, -47, -35, -36, -114, -41, -31, -114, -36, -29, -38, -38, -100, -83, -46, -38, -59, -48, -51, -56, -124, -70, -51, -55, -37, -124, -57, -45, -46, -41, -40, -42, -39, -57, -40, -45, -42, -124, -44, -59, -42, -59, -47, -41, -124, -40, -35, -44, -55, -110, 36, 23, 18, 19, 29, 3, 32, 26, -21, 32, 47, 40, -50, -14, -26, -20, -22, -91, -9, -22, -13, -23, -22, -9, -22, -9, -91, -14, -6, -8, -7, -91, -25, -22, -91, -8, -22, -7, -91, -25, -22, -21, -12, -9, -22, -91, -13, -26, -7, -18, -5, -22, -57, -26, -13, -13, -22, -9, -58, -23, -77, -17, 2, -3, -2, 8, -71, 11, -2, 7, -3, -2, 11, -2, 11, -71, 6, 14, 12, 13, -71, -5, -2, -71, 12, -2, 13, -71, -5, -2, -1, 8, 11, -2, -71, 7, -6, 13, 2, 15, -2, -38, -3, -57};
    }

    static {
        A05();
        A0E = MediaView.class.getSimpleName();
    }

    private void A03() {
        C0820Tg c0820Tg = this;
        char c2 = !c0820Tg.A0C ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0820Tg = c0820Tg;
                    if (c0820Tg.A05 == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0820Tg = c0820Tg;
                    C0635Ly.A0M(c0820Tg.A08);
                    c2 = 4;
                    break;
                case 4:
                    C0820Tg c0820Tg2 = c0820Tg;
                    float f = C0635Ly.A01;
                    int iRound = Math.round(4.0f * f);
                    int iRound2 = Math.round(12.0f * f);
                    c0820Tg2.A08.setChildSpacing(iRound);
                    c0820Tg2.A08.setPadding(0, iRound2, 0, iRound2);
                    c0820Tg2.A08.setVisibility(8);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    layoutParams.addRule(13);
                    c0820Tg2.A02.addView(c0820Tg2.A08, layoutParams);
                    return;
                case 5:
                    throw new IllegalStateException(A02(60, 46, 110));
            }
        }
    }

    private void A04() {
        LW.A04(this.A02, LW.A0A);
        LW.A04(this.A09, LW.A0A);
        LW.A04(this.A04, LW.A0A);
        LW.A04(this.A05, LW.A0A);
    }

    private final void A06(View view, ViewGroup.LayoutParams layoutParams) {
        A01(false);
        this.A02.addView(view, layoutParams);
        A01(true);
    }

    private void A07(View view, C1141cR c1141cR) {
        C0820Tg c0820Tg = this;
        int i = 0;
        String strA15 = null;
        RelativeLayout.LayoutParams layoutParams = null;
        C0703Op c0703Op = c0820Tg.A0A;
        char c2 = c0703Op != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0820Tg = c0820Tg;
                    c0703Op = c0703Op;
                    c0820Tg.A02.removeView(c0703Op);
                    c2 = 3;
                    break;
                case 3:
                    c1141cR = c1141cR;
                    if (!c1141cR.A1U()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    return;
                case 5:
                    c0820Tg = c0820Tg;
                    c1141cR = c1141cR;
                    strA15 = c1141cR.A15();
                    if (c0820Tg.A02.getContext() != null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return;
                case 7:
                    c0820Tg = c0820Tg;
                    strA15 = strA15;
                    c0820Tg.A0A = C0702Oo.A01(c0820Tg.A07, strA15);
                    if (c0820Tg.A0A == null) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    view = view;
                    layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    layoutParams.addRule(5, view.getId());
                    layoutParams.addRule(7, view.getId());
                    layoutParams.addRule(6, view.getId());
                    layoutParams.addRule(8, view.getId());
                    i = 17;
                    if (Build.VERSION.SDK_INT < 17) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    view = view;
                    layoutParams = layoutParams;
                    layoutParams.addRule(16, view.getId());
                    layoutParams.addRule(i, view.getId());
                    c2 = '\n';
                    break;
                case '\n':
                    c0820Tg = c0820Tg;
                    layoutParams = layoutParams;
                    c0820Tg.A06(c0820Tg.A0A, layoutParams);
                    c0820Tg.A06.bringChildToFront(c0820Tg.A0A);
                    c2 = 11;
                    break;
                case 11:
                    return;
            }
        }
    }

    private void A08(ImageView imageView) {
        C0820Tg c0820Tg = this;
        ImageView imageView2 = null;
        char c2 = !c0820Tg.A0C ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0820Tg = c0820Tg;
                    imageView2 = c0820Tg.A01;
                    if (imageView2 == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    imageView2 = imageView2;
                    C0635Ly.A0M(imageView2);
                    c2 = 4;
                    break;
                case 4:
                    C0820Tg c0820Tg2 = c0820Tg;
                    ImageView imageView3 = imageView;
                    imageView3.setVisibility(8);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    layoutParams.addRule(13);
                    c0820Tg2.A02.addView(imageView3, layoutParams);
                    imageView3.setId(C0635Ly.A00());
                    c0820Tg2.A01 = imageView3;
                    return;
                case 5:
                    throw new IllegalStateException(A02(178, 49, 41));
            }
        }
    }

    @TargetApi(21)
    private final void A09(XI xi, AttributeSet attributeSet, int i, int i2, MediaView mediaView) {
        this.A02 = mediaView;
        A08(new ImageView(xi, attributeSet, i, i2));
        A0E(new C0673Nl(xi, attributeSet, i, i2));
        this.A08 = new C1V(xi, attributeSet, i);
        A03();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(xi, attributeSet, i, i2));
        A04();
    }

    private final void A0A(XI xi, AttributeSet attributeSet, int i, MediaView mediaView) {
        this.A02 = mediaView;
        A08(new ImageView(xi, attributeSet, i));
        A0E(new C0673Nl(xi, attributeSet, i));
        this.A08 = new C1V(xi, attributeSet, i);
        A03();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(xi, attributeSet, i));
        A04();
    }

    private final void A0B(XI xi, AttributeSet attributeSet, MediaView mediaView) {
        this.A02 = mediaView;
        A08(new ImageView(xi, attributeSet));
        A0E(new C0673Nl(xi, attributeSet));
        this.A08 = new C1V(xi, attributeSet);
        A03();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(xi, attributeSet));
        A04();
    }

    private final void A0C(XI xi, MediaView mediaView) {
        this.A02 = mediaView;
        A08(new ImageView(xi));
        A0E(new C0673Nl(xi));
        this.A08 = new C1V(xi);
        A03();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(xi));
        A04();
    }

    private void A0D(C1141cR c1141cR, boolean z, C0580Js c0580Js) {
        AsyncTaskC1002aA asyncTaskC1002aAA04 = new AsyncTaskC1002aA(this.A01, this.A07).A04();
        if (z) {
            asyncTaskC1002aAA04.A06(new C0816Tb(this, c1141cR));
        }
        asyncTaskC1002aAA04.A07(c0580Js.getUrl());
    }

    private void A0E(C0673Nl c0673Nl) {
        C0820Tg c0820Tg = this;
        C0673Nl c0673Nl2 = null;
        char c2 = !c0820Tg.A0C ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0820Tg = c0820Tg;
                    c0673Nl2 = c0820Tg.A09;
                    if (c0673Nl2 == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0820Tg = c0820Tg;
                    c0673Nl2 = c0673Nl2;
                    c0820Tg.A02.removeView(c0673Nl2);
                    c2 = 4;
                    break;
                case 4:
                    C0820Tg c0820Tg2 = c0820Tg;
                    C0673Nl c0673Nl3 = c0673Nl;
                    c0673Nl3.setVisibility(8);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    layoutParams.addRule(13);
                    c0820Tg2.A02.addView(c0673Nl3, layoutParams);
                    c0820Tg2.A09 = c0673Nl3;
                    return;
                case 5:
                    throw new IllegalStateException(A02(17, 43, 22));
            }
        }
    }

    private boolean A0F(NativeAd nativeAd) {
        Iterator<NativeAd> it = null;
        List<NativeAd> listA03 = ((C5B) nativeAd.getNativeAdApi()).A03();
        char c2 = listA03 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return false;
                case 3:
                    listA03 = listA03;
                    it = listA03.iterator();
                    c2 = 4;
                    break;
                case 4:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    it = it;
                    if (it.next().getAdCoverImage() != null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return false;
                case 7:
                    return true;
            }
        }
    }

    private boolean A0G(NativeAd nativeAd) {
        boolean z = false;
        char c2 = Build.VERSION.SDK_INT >= 14 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    nativeAd = nativeAd;
                    if (!TextUtils.isEmpty(((C5B) nativeAd.getNativeAdApi()).A02())) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
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

    public final void A0H(NativeAd nativeAd) {
        C0820Tg c0820Tg = this;
        C0452Eq c0452Eq = null;
        AbstractC0785Ru c0462Fa = null;
        C0452Eq c0452Eq2 = null;
        XI xiA0w = ((C1141cR) nativeAd.getInternalNativeAd()).A0w();
        xiA0w.A0C(c0820Tg);
        c0820Tg.A07.A0D(xiA0w);
        c0820Tg.A07.A0B(xiA0w.A0A());
        boolean z = true;
        c0820Tg.A0C = true;
        C1141cR c1141cRA0J = C1141cR.A0J(nativeAd.getInternalNativeAd());
        c1141cRA0J.A1J(c0820Tg.A02);
        c0820Tg.A01.setVisibility(8);
        c0820Tg.A01.setImageDrawable(null);
        int i = 0;
        char c2 = c0820Tg.A0F(nativeAd) ? (char) 2 : '\t';
        while (true) {
            switch (c2) {
                case 2:
                    c1141cRA0J = c1141cRA0J;
                    c1141cRA0J.A0w().A0A().ADD(EnumC01080d.A03);
                    if (c1141cRA0J.A12() != EnumC0583Jv.A0B) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0820Tg = c0820Tg;
                    i = 0;
                    c0820Tg.A05 = c0820Tg.A08;
                    ((C1V) c0820Tg.A05).setCurrentPosition(0);
                    ((C1V) c0820Tg.A05).setShowTextInCarousel(z);
                    if (!z) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0820Tg = c0820Tg;
                    c1141cRA0J = c1141cRA0J;
                    c0462Fa = new C0463Fb(c0820Tg.A07, (C1V) c0820Tg.A05, c1141cRA0J.A1B(), c1141cRA0J.A11());
                    c2 = 5;
                    break;
                case 5:
                    c0820Tg = c0820Tg;
                    c1141cRA0J = c1141cRA0J;
                    c0462Fa = c0462Fa;
                    c0462Fa.A0G(new C0817Tc(c0820Tg, c1141cRA0J));
                    c0820Tg.A05.setAdapter(c0462Fa);
                    c0820Tg.A00 = c0820Tg.A05;
                    c0820Tg.A09.setVisibility(8);
                    c0820Tg.A09.setImage(null, null);
                    c0820Tg.A04.setVisibility(8);
                    c0820Tg.A04.unsetNativeAd();
                    ((C5A) c0820Tg.A04.getMediaViewVideoRendererApi()).A03();
                    c0820Tg.bringChildToFront(c0820Tg.A05);
                    c0820Tg.A05.setVisibility(i);
                    c0820Tg.A07(c0820Tg.A05, c1141cRA0J);
                    c2 = 6;
                    break;
                case 6:
                    return;
                case 7:
                    c0820Tg = c0820Tg;
                    c1141cRA0J = c1141cRA0J;
                    c0462Fa = new C0462Fa((C1V) c0820Tg.A05, c1141cRA0J.A1B(), c0820Tg.A07);
                    c2 = 5;
                    break;
                case '\b':
                    z = false;
                    c2 = 3;
                    break;
                case '\t':
                    c0820Tg = c0820Tg;
                    nativeAd = nativeAd;
                    if (!c0820Tg.A0G(nativeAd)) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c0820Tg = c0820Tg;
                    c1141cRA0J = c1141cRA0J;
                    c1141cRA0J.A0w().A0A().ADD(EnumC01080d.A08);
                    c1141cRA0J.A1S(c0820Tg.A0B);
                    c0820Tg.A00 = c0820Tg.A04.getMediaViewVideoRendererApi().getVideoView();
                    c0820Tg.A09.setVisibility(8);
                    c0820Tg.A09.setImage(null, null);
                    c0452Eq2 = c0820Tg.A05;
                    if (c0452Eq2 == null) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c0820Tg = c0820Tg;
                    c0452Eq2 = c0452Eq2;
                    c0452Eq2.setVisibility(8);
                    c0820Tg.A05.setAdapter(null);
                    c2 = '\f';
                    break;
                case '\f':
                    c0820Tg = c0820Tg;
                    nativeAd = nativeAd;
                    c1141cRA0J = c1141cRA0J;
                    i = 0;
                    c0820Tg.bringChildToFront(c0820Tg.A04);
                    c0820Tg.A04.setNativeAd(nativeAd);
                    ((C5A) c0820Tg.A04.getMediaViewVideoRendererApi()).A04(nativeAd);
                    c0820Tg.A04.setVisibility(0);
                    if (c1141cRA0J.getAdCoverImage() == null) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c0820Tg = c0820Tg;
                    c1141cRA0J = c1141cRA0J;
                    new AsyncTaskC1002aA(c0820Tg.A02, c0820Tg.A07).A05(c0820Tg.A02.getHeight(), c0820Tg.A02.getWidth()).A06(new Td(c0820Tg, c1141cRA0J)).A07(c1141cRA0J.getAdCoverImage().getUrl());
                    c2 = 14;
                    break;
                case 14:
                    if (!BuildConfigApi.isDebug()) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    nativeAd = nativeAd;
                    Log.i(A0E, A02(166, 9, 82) + ((C5B) nativeAd.getNativeAdApi()).A02());
                    c2 = 16;
                    break;
                case 16:
                    c0820Tg = c0820Tg;
                    c1141cRA0J = c1141cRA0J;
                    c0820Tg.A07(c0820Tg.A04, c1141cRA0J);
                    c2 = 6;
                    break;
                case 17:
                    nativeAd = nativeAd;
                    if (nativeAd.getAdCoverImage() == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    c0820Tg = c0820Tg;
                    c1141cRA0J = c1141cRA0J;
                    c1141cRA0J.A0w().A0A().ADD(EnumC01080d.A06);
                    c0820Tg.A00 = c0820Tg.A09.getBodyImageView();
                    c0820Tg.A04.setVisibility(8);
                    c0820Tg.A04.unsetNativeAd();
                    ((C5A) c0820Tg.A04.getMediaViewVideoRendererApi()).A03();
                    c0452Eq = c0820Tg.A05;
                    if (c0452Eq == null) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    c0820Tg = c0820Tg;
                    c0452Eq = c0452Eq;
                    c0452Eq.setVisibility(8);
                    c0820Tg.A05.setAdapter(null);
                    c2 = 20;
                    break;
                case 20:
                    c0820Tg = c0820Tg;
                    c1141cRA0J = c1141cRA0J;
                    i = 0;
                    c0820Tg.bringChildToFront(c0820Tg.A09);
                    c0820Tg.A09.setVisibility(0);
                    new AsyncTaskC1002aA(c0820Tg.A09, c0820Tg.A07).A05(c0820Tg.A02.getHeight(), c0820Tg.A02.getWidth()).A06(new C0818Te(c0820Tg, c1141cRA0J)).A07(c1141cRA0J.getAdCoverImage().getUrl());
                    c0820Tg.A07(c0820Tg.A09, c1141cRA0J);
                    c2 = 6;
                    break;
            }
        }
    }

    public final void A0I(NativeAdBaseApi nativeAdBaseApi, boolean z) {
        NativeAdBaseApi nativeAdBaseApi2 = nativeAdBaseApi;
        C0820Tg c0820Tg = this;
        InterfaceC1142cS interfaceC1142cSA10 = null;
        Bitmap bitmapA0H = null;
        AdErrorType adErrorType = null;
        C0580Js adIcon = null;
        XI xiA0w = ((C1141cR) nativeAdBaseApi2).A0w();
        c0820Tg.A07.A0D(xiA0w);
        xiA0w.A0C(c0820Tg);
        c0820Tg.A0C = true;
        C1141cR c1141cRA0J = C1141cR.A0J(nativeAdBaseApi2);
        c1141cRA0J.A1I(c0820Tg.A02);
        c0820Tg.A09.setVisibility(8);
        c0820Tg.A09.setImage(null, null);
        c0820Tg.A04.setVisibility(8);
        c0820Tg.A04.unsetNativeAd();
        ((C5A) c0820Tg.A04.getMediaViewVideoRendererApi()).A03();
        C0452Eq c0452Eq = c0820Tg.A05;
        char c2 = c0452Eq != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0820Tg = c0820Tg;
                    c0452Eq = c0452Eq;
                    c0452Eq.setVisibility(8);
                    c0820Tg.A05.setAdapter(null);
                    c2 = 3;
                    break;
                case 3:
                    c0820Tg = c0820Tg;
                    c1141cRA0J = c1141cRA0J;
                    c0820Tg.A01.setVisibility(0);
                    c0820Tg.bringChildToFront(c0820Tg.A01);
                    c0820Tg.A00 = c0820Tg.A01;
                    adIcon = c1141cRA0J.getAdIcon();
                    if (adIcon == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1141cRA0J = c1141cRA0J;
                    adIcon = adIcon;
                    bitmapA0H = c1141cRA0J.A0v().A0H(adIcon.getUrl());
                    if (bitmapA0H == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0820Tg = c0820Tg;
                    bitmapA0H = bitmapA0H;
                    c0820Tg.A01.setImageBitmap(bitmapA0H);
                    if (!z) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0820Tg = c0820Tg;
                    c1141cRA0J = c1141cRA0J;
                    c0820Tg.A02.post(new C0815Ta(c0820Tg, c1141cRA0J));
                    c2 = 7;
                    break;
                case 7:
                    C0820Tg c0820Tg2 = c0820Tg;
                    c0820Tg2.A07(c0820Tg2.A01, c1141cRA0J);
                    return;
                case '\b':
                    c0820Tg = c0820Tg;
                    c1141cRA0J = c1141cRA0J;
                    adIcon = adIcon;
                    c0820Tg.A0D(c1141cRA0J, z, adIcon);
                    c2 = 7;
                    break;
                case '\t':
                    xiA0w = xiA0w;
                    c1141cRA0J = c1141cRA0J;
                    interfaceC1142cSA10 = c1141cRA0J.A10();
                    adErrorType = AdErrorType.NATIVE_AD_IS_NOT_LOADED;
                    xiA0w.A0A().A2c(c1141cRA0J.A0t(), adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
                    if (interfaceC1142cSA10 == null) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    interfaceC1142cSA10 = interfaceC1142cSA10;
                    adErrorType = adErrorType;
                    interfaceC1142cSA10.A9Y(K5.A01(adErrorType));
                    c2 = 11;
                    break;
                case 11:
                    nativeAdBaseApi2 = nativeAdBaseApi2;
                    adErrorType = adErrorType;
                    Log.e(A02(0, 17, 70), adErrorType.getDefaultErrorMessage());
                    if (!nativeAdBaseApi2.isAdLoaded()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    c0820Tg = c0820Tg;
                    c0820Tg.A07.A04().A83(A02(175, 3, 99), C03008a.A0L, new C03018b(A02(106, 23, 18)));
                    c2 = 7;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C8A
    public final XI A5G() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass52, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void bringChildToFront(View view) {
        C0820Tg c0820Tg = this;
        C0703Op c0703Op = null;
        char c2 = view != c0820Tg.A05 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0820Tg = c0820Tg;
                    view = view;
                    if (view == c0820Tg.A04) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0820Tg = c0820Tg;
                    view = view;
                    if (view == c0820Tg.A09) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0820Tg = c0820Tg;
                    view = view;
                    if (view != c0820Tg.A01) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0820Tg = c0820Tg;
                    view = view;
                    c0820Tg.A06.bringChildToFront(view);
                    c0703Op = c0820Tg.A0A;
                    if (c0703Op == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0820Tg = c0820Tg;
                    c0703Op = c0703Op;
                    c0820Tg.A06.bringChildToFront(c0703Op);
                    c2 = 7;
                    break;
                case 7:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void destroy() {
        this.A04.pause(false);
        this.A04.getMediaViewVideoRendererApi().destroy();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final AdComponentViewApi getAdComponentViewApi() {
        return this;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final View getAdContentsView() {
        return this.A00;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final int getMediaHeight() {
        C0820Tg c0820Tg = this;
        char c2 = c0820Tg.A09.getVisibility() == 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return c0820Tg.A09.getImageHeight();
                case 3:
                    c0820Tg = c0820Tg;
                    if (c0820Tg.A02.getVisibility() != 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return c0820Tg.A02.getHeight();
                case 5:
                    c0820Tg = c0820Tg;
                    if (c0820Tg.A04.getVisibility() != 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return c0820Tg.A04.getMediaViewVideoRendererApi().getVideoView().getHeight();
                case 7:
                    return 0;
            }
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final int getMediaWidth() {
        C0820Tg c0820Tg = this;
        char c2 = c0820Tg.A09.getVisibility() == 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return c0820Tg.A09.getImageWidth();
                case 3:
                    c0820Tg = c0820Tg;
                    if (c0820Tg.A02.getVisibility() != 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return c0820Tg.A02.getWidth();
                case 5:
                    c0820Tg = c0820Tg;
                    if (c0820Tg.A04.getVisibility() != 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return c0820Tg.A04.getMediaViewVideoRendererApi().getVideoView().getWidth();
                case 7:
                    return 0;
            }
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void initialize(AdViewConstructorParams adViewConstructorParams, MediaView mediaView) {
        MediaView mediaView2 = mediaView;
        C0820Tg c0820Tg = this;
        c0820Tg.A07 = AnonymousClass53.A02(adViewConstructorParams.getContext());
        c0820Tg.A07.A0C(c0820Tg);
        int initializationType = adViewConstructorParams.getInitializationType();
        char c2 = initializationType != 0 ? (char) 2 : '\t';
        while (true) {
            switch (c2) {
                case 2:
                    if (initializationType == 1) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (initializationType == 2) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (initializationType != 3) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0820Tg = c0820Tg;
                    adViewConstructorParams = adViewConstructorParams;
                    mediaView2 = mediaView2;
                    c0820Tg.A09(c0820Tg.A07, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleAttr(), adViewConstructorParams.getDefStyleRes(), mediaView2);
                    c2 = 6;
                    break;
                case 6:
                    c0820Tg.A01(true);
                    return;
                case 7:
                    c0820Tg = c0820Tg;
                    adViewConstructorParams = adViewConstructorParams;
                    mediaView2 = mediaView2;
                    c0820Tg.A0A(c0820Tg.A07, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleAttr(), mediaView2);
                    c2 = 6;
                    break;
                case '\b':
                    c0820Tg = c0820Tg;
                    adViewConstructorParams = adViewConstructorParams;
                    mediaView2 = mediaView2;
                    c0820Tg.A0B(c0820Tg.A07, adViewConstructorParams.getAttributeSet(), mediaView2);
                    c2 = 6;
                    break;
                case '\t':
                    c0820Tg = c0820Tg;
                    mediaView2 = mediaView2;
                    c0820Tg.A0C(c0820Tg.A07, mediaView2);
                    c2 = 6;
                    break;
                case '\n':
                    throw new IllegalArgumentException(A02(129, 37, 8));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass52, com.facebook.ads.internal.api.AdComponentViewApi
    public final void onAttachedToView(AdComponentView adComponentView, AdComponentViewParentApi adComponentViewParentApi) {
        super.onAttachedToView(adComponentView, adComponentViewParentApi);
        this.A06 = adComponentViewParentApi;
    }

    @Override // com.facebook.ads.internal.api.Repairable
    public final void repair(Throwable th) {
        C0820Tg c0820Tg = this;
        int width = c0820Tg.A02.getWidth();
        int height = c0820Tg.A02.getHeight();
        char c2 = width > 0 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    if (height <= 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0820Tg = c0820Tg;
                    th = th;
                    c0820Tg.A02.repair(th);
                    c0820Tg.A02.getLayoutParams().width = width;
                    c0820Tg.A02.getLayoutParams().height = height;
                    c0820Tg.A02.setBackgroundColor(-3355444);
                    c2 = 4;
                    break;
                case 4:
                    return;
                case 5:
                    c0820Tg = c0820Tg;
                    th = th;
                    c0820Tg.A02.repair(th);
                    c2 = 4;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void setListener(MediaViewListener mediaViewListener) {
        this.A03 = mediaViewListener;
        if (mediaViewListener == null) {
            ((C5A) this.A04.getMediaViewVideoRendererApi()).A07(null);
        } else {
            ((C5A) this.A04.getMediaViewVideoRendererApi()).A07(new C0819Tf(this, mediaViewListener));
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void setVideoRenderer(MediaViewVideoRenderer mediaViewVideoRenderer) {
        C0820Tg c0820Tg = this;
        boolean z = false;
        MediaViewVideoRenderer mediaViewVideoRenderer2 = null;
        char c2 = !c0820Tg.A0C ? (char) 2 : '\b';
        while (true) {
            switch (c2) {
                case 2:
                    c0820Tg = c0820Tg;
                    mediaViewVideoRenderer2 = c0820Tg.A04;
                    if (mediaViewVideoRenderer2 == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0820Tg = c0820Tg;
                    mediaViewVideoRenderer2 = mediaViewVideoRenderer2;
                    c0820Tg.A02.removeView(mediaViewVideoRenderer2);
                    c0820Tg.A04.getMediaViewVideoRendererApi().destroy();
                    c2 = 4;
                    break;
                case 4:
                    c0820Tg = c0820Tg;
                    mediaViewVideoRenderer = mediaViewVideoRenderer;
                    ((C5A) mediaViewVideoRenderer.getMediaViewVideoRendererApi()).A05(c0820Tg.A07.A06());
                    mediaViewVideoRenderer.setVisibility(8);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    layoutParams.addRule(13);
                    ((C0820Tg) c0820Tg.A02.getMediaViewApi()).A06(mediaViewVideoRenderer, layoutParams);
                    c0820Tg.A04 = mediaViewVideoRenderer;
                    if (!(c0820Tg.A04 instanceof DefaultMediaViewVideoRenderer)) {
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
                    c0820Tg.A0B = z;
                    mediaViewVideoRenderer.setId(C0635Ly.A00());
                    return;
                case 7:
                    z = false;
                    c2 = 6;
                    break;
                case '\b':
                    throw new IllegalStateException(A02(227, 43, 61));
            }
        }
    }
}
