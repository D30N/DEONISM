package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.Qv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0760Qv extends FrameLayout implements P2 {

    @Nullable
    public TextView A00;

    @Nullable
    public TextView A01;

    @Nullable
    public TextView A02;

    @Nullable
    public TextView A03;
    public final MediaView A04;
    public final NativeAd A05;
    public final P3 A06;
    public final ArrayList<View> A07;
    public static final int A0D = (int) (C0635Ly.A01 * 6.0f);
    public static final int A0C = (int) (C0635Ly.A01 * 8.0f);
    public static final int A0B = (int) (C0635Ly.A01 * 12.0f);
    public static final int A09 = (int) (C0635Ly.A01 * 350.0f);
    public static final int A08 = (int) (C0635Ly.A01 * 250.0f);
    public static final int A0A = (int) (C0635Ly.A01 * 175.0f);

    public C0760Qv(XI xi, NativeAd nativeAd, C0582Ju c0582Ju, EnumC0583Jv enumC0583Jv, C0687Nz c0687Nz, MediaView mediaView, AdOptionsView adOptionsView) {
        super(xi);
        this.A07 = new ArrayList<>();
        this.A05 = nativeAd;
        this.A04 = mediaView;
        this.A06 = new P3(xi, this.A05, c0582Ju, c0687Nz, adOptionsView);
        P3 p3 = this.A06;
        int i = A0B;
        p3.setPadding(i, i, i, A0D);
        addView(this.A06, new FrameLayout.LayoutParams(-1, -2));
        if (enumC0583Jv == EnumC0583Jv.A09 || enumC0583Jv == EnumC0583Jv.A0B) {
            A07(c0582Ju);
        }
        addView(this.A04, new FrameLayout.LayoutParams(-1, -2));
        if (enumC0583Jv != EnumC0583Jv.A0B || this.A05.getAdCreativeType() != NativeAd.AdCreativeType.CAROUSEL) {
            A06(c0582Ju);
            A04(c0582Ju);
            A05(c0582Ju);
        }
        this.A07.add(c0687Nz);
        this.A07.add(mediaView);
    }

    private int A00() {
        C0760Qv c0760Qv = this;
        int ctaHeight = 0;
        int titleHeight = 0;
        int subtitleHeight = 0;
        TextView textView = null;
        TextView textView2 = null;
        TextView textView3 = null;
        TextView textView4 = c0760Qv.A03;
        int measuredHeight = 0;
        char c2 = textView4 != null ? (char) 2 : (char) 16;
        while (true) {
            switch (c2) {
                case 2:
                    textView4 = textView4;
                    if (textView4.getVisibility() != 0) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0760Qv = c0760Qv;
                    subtitleHeight = c0760Qv.A03.getMeasuredHeight();
                    c2 = 4;
                    break;
                case 4:
                    c0760Qv = c0760Qv;
                    textView2 = c0760Qv.A02;
                    if (textView2 == null) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    textView2 = textView2;
                    if (textView2.getVisibility() != 0) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0760Qv = c0760Qv;
                    titleHeight = c0760Qv.A02.getMeasuredHeight();
                    c2 = 7;
                    break;
                case 7:
                    c0760Qv = c0760Qv;
                    textView3 = c0760Qv.A00;
                    if (textView3 == null) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    textView3 = textView3;
                    if (textView3.getVisibility() != 0) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c0760Qv = c0760Qv;
                    ctaHeight = c0760Qv.A00.getMeasuredHeight();
                    c2 = '\n';
                    break;
                case '\n':
                    c0760Qv = c0760Qv;
                    textView = c0760Qv.A01;
                    if (textView == null) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    textView = textView;
                    if (textView.getVisibility() != 0) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    c0760Qv = c0760Qv;
                    measuredHeight = c0760Qv.A01.getMeasuredHeight() + A0B + A0C;
                    c2 = '\r';
                    break;
                case '\r':
                    C0760Qv c0760Qv2 = c0760Qv;
                    return ((((c0760Qv2.getMeasuredHeight() - c0760Qv2.A06.getMeasuredHeight()) - subtitleHeight) - titleHeight) - ctaHeight) - measuredHeight;
                case 14:
                    ctaHeight = 0;
                    c2 = '\n';
                    break;
                case 15:
                    titleHeight = 0;
                    c2 = 7;
                    break;
                case 16:
                    subtitleHeight = 0;
                    c2 = 4;
                    break;
            }
        }
    }

    private void A01() {
        C0760Qv c0760Qv = this;
        TextView textView = null;
        TextView textView2 = null;
        TextView textView3 = c0760Qv.A03;
        char c2 = textView3 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    textView3 = textView3;
                    textView3.setLines(1);
                    c2 = 3;
                    break;
                case 3:
                    c0760Qv = c0760Qv;
                    textView2 = c0760Qv.A02;
                    if (textView2 == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    textView2 = textView2;
                    textView2.setLines(1);
                    c2 = 5;
                    break;
                case 5:
                    c0760Qv = c0760Qv;
                    textView = c0760Qv.A00;
                    if (textView == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    textView = textView;
                    textView.setLines(1);
                    c2 = 7;
                    break;
                case 7:
                    return;
            }
        }
    }

    private void A02(int i) {
        C0760Qv c0760Qv = this;
        TextView textView = null;
        int i2 = 0;
        int i3 = 0;
        TextView textView2 = null;
        MediaView mediaView = c0760Qv.A04;
        int i4 = 0;
        char c2 = i > A0A ? (char) 2 : '\t';
        while (true) {
            switch (c2) {
                case 2:
                    i3 = 0;
                    c2 = 3;
                    break;
                case 3:
                    c0760Qv = c0760Qv;
                    mediaView = mediaView;
                    C0635Ly.A0Q(mediaView, i3);
                    textView2 = c0760Qv.A03;
                    if (i <= A09) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i2 = 0;
                    c2 = 5;
                    break;
                case 5:
                    c0760Qv = c0760Qv;
                    textView2 = textView2;
                    C0635Ly.A0Q(textView2, i2);
                    textView = c0760Qv.A00;
                    if (i <= A08) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    C0635Ly.A0Q(textView, i4);
                    return;
                case 7:
                    i4 = 8;
                    c2 = 6;
                    break;
                case '\b':
                    i2 = 8;
                    c2 = 5;
                    break;
                case '\t':
                    i3 = 8;
                    c2 = 3;
                    break;
            }
        }
    }

    public static void A03(int i, int i2, TextView... textViewArr) {
        TextView textView = null;
        int length = textViewArr.length;
        int i3 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i3 >= length) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    textViewArr = textViewArr;
                    textView = textViewArr[i3];
                    if (textView == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    textView = textView;
                    if (textView.getVisibility() != 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    textView = textView;
                    int iA05 = C0635Ly.A05(textView, i2);
                    textView.setLines(iA05 + 1);
                    textView.measure(i, View.MeasureSpec.makeMeasureSpec(textView.getMeasuredHeight() + (textView.getLineHeight() * iA05), 1073741824));
                    i2 -= textView.getLineHeight() * iA05;
                    c2 = 6;
                    break;
                case 6:
                    i3++;
                    c2 = 2;
                    break;
                case 7:
                    return;
            }
        }
    }

    private void A04(C0582Ju c0582Ju) {
        C0760Qv c0760Qv = this;
        char c2 = c0760Qv.A05.getAdBodyText() != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0760Qv = c0760Qv;
                    if (!c0760Qv.A05.getAdBodyText().trim().isEmpty()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    c0760Qv = c0760Qv;
                    c0582Ju = c0582Ju;
                    c0760Qv.A00 = new TextView(c0760Qv.getContext());
                    c0582Ju.A06(c0760Qv.A00);
                    c0760Qv.A00.setText(c0760Qv.A05.getAdBodyText());
                    TextView textView = c0760Qv.A00;
                    int i = A0B;
                    textView.setPadding(i, 0, i, 0);
                    c0760Qv.addView(c0760Qv.A00, new FrameLayout.LayoutParams(-1, -2));
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    private void A05(C0582Ju c0582Ju) {
        if (this.A05.hasCallToAction()) {
            this.A01 = new TextView(getContext());
            C0635Ly.A0N(this.A01);
            c0582Ju.A05(this.A01);
            this.A01.setText(this.A05.getAdCallToAction());
            TextView textView = this.A01;
            int i = A0C;
            textView.setPadding(i, i, i, i);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            int i2 = A0C;
            layoutParams.setMargins(i2, 0, i2, 0);
            addView(this.A01, layoutParams);
            this.A07.add(this.A01);
        }
    }

    private void A06(C0582Ju c0582Ju) {
        C0760Qv c0760Qv = this;
        char c2 = c0760Qv.A05.getAdHeadline() != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0760Qv = c0760Qv;
                    if (!c0760Qv.A05.getAdHeadline().trim().isEmpty()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    c0760Qv = c0760Qv;
                    c0582Ju = c0582Ju;
                    c0760Qv.A02 = new TextView(c0760Qv.getContext());
                    c0582Ju.A07(c0760Qv.A02);
                    c0760Qv.A02.setText(c0760Qv.A05.getAdHeadline());
                    TextView textView = c0760Qv.A02;
                    int i = A0B;
                    textView.setPadding(i, A0C, i, 0);
                    c0760Qv.addView(c0760Qv.A02, new FrameLayout.LayoutParams(-1, -2));
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    private void A07(C0582Ju c0582Ju) {
        C0760Qv c0760Qv = this;
        char c2 = c0760Qv.A05.getAdLinkDescription() != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0760Qv = c0760Qv;
                    if (!c0760Qv.A05.getAdLinkDescription().trim().isEmpty()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    c0760Qv = c0760Qv;
                    c0582Ju = c0582Ju;
                    c0760Qv.A03 = new TextView(c0760Qv.getContext());
                    c0582Ju.A06(c0760Qv.A03);
                    c0760Qv.A03.setText(c0760Qv.A05.getAdLinkDescription());
                    TextView textView = c0760Qv.A03;
                    int i = A0B;
                    textView.setPadding(i, 0, i, A0C);
                    c0760Qv.addView(c0760Qv.A03, new FrameLayout.LayoutParams(-1, -2));
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.P2
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.P2
    public ArrayList<View> getViewsForInteraction() {
        return this.A07;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0760Qv c0760Qv = this;
        TextView textView = null;
        TextView textView2 = null;
        TextView textView3 = null;
        int measuredHeight = 0;
        P3 p3 = c0760Qv.A06;
        p3.layout(i, i2, i3, p3.getMeasuredHeight() + i2);
        int measuredHeight2 = i2 + c0760Qv.A06.getMeasuredHeight();
        TextView textView4 = c0760Qv.A03;
        char c2 = textView4 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    textView4 = textView4;
                    if (textView4.getVisibility() != 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0760Qv = c0760Qv;
                    int measuredHeight3 = c0760Qv.A03.getMeasuredHeight();
                    c0760Qv.A03.layout(i, measuredHeight2, i3, measuredHeight2 + measuredHeight3);
                    measuredHeight2 += measuredHeight3;
                    c2 = 4;
                    break;
                case 4:
                    c0760Qv = c0760Qv;
                    MediaView mediaView = c0760Qv.A04;
                    mediaView.layout(i, measuredHeight2, i3, mediaView.getMeasuredHeight() + measuredHeight2);
                    measuredHeight = measuredHeight2 + c0760Qv.A04.getMeasuredHeight();
                    textView2 = c0760Qv.A02;
                    if (textView2 == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0760Qv = c0760Qv;
                    textView2 = textView2;
                    textView2.layout(i, measuredHeight, i3, textView2.getMeasuredHeight() + measuredHeight);
                    measuredHeight += c0760Qv.A02.getMeasuredHeight();
                    c2 = 6;
                    break;
                case 6:
                    c0760Qv = c0760Qv;
                    textView3 = c0760Qv.A00;
                    if (textView3 == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    textView3 = textView3;
                    if (textView3.getVisibility() != 0) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c0760Qv = c0760Qv;
                    TextView textView5 = c0760Qv.A00;
                    textView5.layout(i, measuredHeight, i3, textView5.getMeasuredHeight() + measuredHeight);
                    c2 = '\t';
                    break;
                case '\t':
                    c0760Qv = c0760Qv;
                    textView = c0760Qv.A01;
                    if (textView == null) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    textView = textView;
                    int i5 = A0B + i;
                    int measuredHeight4 = i4 - textView.getMeasuredHeight();
                    int i6 = A0B;
                    textView.layout(i5, measuredHeight4 - i6, i3 - i6, i4 - i6);
                    c2 = 11;
                    break;
                case 11:
                    return;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        C0760Qv c0760Qv = this;
        int iMin = 0;
        c0760Qv.A02(View.MeasureSpec.getSize(i2));
        c0760Qv.A01();
        super.onMeasure(i, i2);
        int iA00 = c0760Qv.A00();
        char c2 = c0760Qv.A04.getMediaWidth() != 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0760Qv = c0760Qv;
                    if (c0760Qv.A04.getMediaHeight() != 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    iMin = iA00;
                    c2 = 4;
                    break;
                case 4:
                    c0760Qv = c0760Qv;
                    c0760Qv.A04.measure(i, View.MeasureSpec.makeMeasureSpec(iMin, 1073741824));
                    if (iMin >= iA00) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0760Qv = c0760Qv;
                    A03(i, iA00 - iMin, c0760Qv.A02, c0760Qv.A00, c0760Qv.A03);
                    c2 = 6;
                    break;
                case 6:
                    return;
                case 7:
                    c0760Qv = c0760Qv;
                    iMin = Math.min((int) (c0760Qv.A04.getMeasuredWidth() * (c0760Qv.A04.getMediaHeight() / c0760Qv.A04.getMediaWidth())), iA00);
                    c2 = 4;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.P2
    public final void unregisterView() {
        this.A05.unregisterView();
    }
}
