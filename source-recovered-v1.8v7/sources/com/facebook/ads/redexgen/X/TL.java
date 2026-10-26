package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.AdOptionsViewApi;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class TL extends AnonymousClass52 implements AdOptionsViewApi {
    public static byte[] A03;
    public static final int A04;
    public static final int A05;
    public final ImageView A00;
    public final ImageView A01;
    public final AdOptionsView A02;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 101);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A03 = new byte[]{-34, -15, -4, -5, -2, 0, -84, -51, -16};
    }

    static {
        A02();
        A04 = (int) (C0635Ly.A01 * 23.0f);
        A05 = (int) (C0635Ly.A01 * 4.0f);
    }

    public TL(Context context, NativeAdBase nativeAdBase, @Nullable NativeAdLayout nativeAdLayout, AdOptionsView.Orientation orientation, int i, AdOptionsView adOptionsView) {
        this.A02 = adOptionsView;
        LinearLayout linearLayout = new LinearLayout(context);
        this.A02.addView(linearLayout);
        linearLayout.setOrientation(orientation == AdOptionsView.Orientation.HORIZONTAL ? 0 : 1);
        this.A01 = A00(M6.DEFAULT_INFO_ICON);
        this.A00 = A00(M6.AD_CHOICES_ICON);
        this.A00.setContentDescription(A01(0, 9, 39));
        linearLayout.addView(this.A01);
        linearLayout.addView(this.A00);
        setIconSizeDp(i);
        setIconColor(-10459280);
        final C1141cR c1141cRA0J = C1141cR.A0J(nativeAdBase.getInternalNativeAd());
        c1141cRA0J.A1K(nativeAdLayout);
        c1141cRA0J.A1L(this);
        C0770Rf c0770RfA0u = c1141cRA0J.A0u();
        if (c0770RfA0u != null && c0770RfA0u.A0f() && !c0770RfA0u.A0d()) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.4q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws Throwable {
                    ViewOnClickListenerC02234q viewOnClickListenerC02234q = this;
                    ViewOnClickListenerC02234q viewOnClickListenerC02234q2 = null;
                    char c2 = C0601Ko.A02(viewOnClickListenerC02234q) ? (char) 2 : (char) 3;
                    while (true) {
                        switch (c2) {
                            case 2:
                                return;
                            case 3:
                                viewOnClickListenerC02234q = viewOnClickListenerC02234q;
                                viewOnClickListenerC02234q2 = viewOnClickListenerC02234q;
                                c2 = 4;
                                break;
                            case 4:
                                try {
                                    viewOnClickListenerC02234q2 = viewOnClickListenerC02234q2;
                                    c1141cRA0J.A1C();
                                    return;
                                } catch (Throwable th) {
                                    C0601Ko.A00(th, viewOnClickListenerC02234q2);
                                    return;
                                }
                        }
                    }
                }
            });
            LW.A04(this.A02, LW.A0B);
        }
    }

    public TL(Context context, NativeAdBase nativeAdBase, @Nullable NativeAdLayout nativeAdLayout, AdOptionsView adOptionsView) {
        this(context, nativeAdBase, nativeAdLayout, AdOptionsView.Orientation.HORIZONTAL, 23, adOptionsView);
    }

    private ImageView A00(M6 m6) {
        ImageView imageView = new ImageView(this.A02.getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int i = A05;
        imageView.setPadding(i, i, i, i);
        imageView.setImageBitmap(M7.A00(m6));
        return imageView;
    }

    public final void A03(M6 m6) {
        this.A01.setImageBitmap(M7.A00(m6));
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final AdComponentViewApi getAdComponentViewApi() {
        return this;
    }

    @Override // com.facebook.ads.internal.api.AdOptionsViewApi
    public final void setIconColor(int i) {
        this.A01.setColorFilter(i);
        this.A00.setColorFilter(i);
    }

    @Override // com.facebook.ads.internal.api.AdOptionsViewApi
    public final void setIconSizeDp(int i) {
        int iMax = Math.max(A04, (int) (C0635Ly.A01 * i));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iMax, iMax);
        this.A01.setLayoutParams(layoutParams);
        this.A00.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass52, com.facebook.ads.internal.api.AdComponentView
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = -2;
        layoutParams.height = -2;
        super.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.internal.api.AdOptionsViewApi
    public final void setSingleIcon(boolean z) {
        int i = 0;
        ImageView imageView = this.A01;
        char c2 = z ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i = 8;
                    c2 = 3;
                    break;
                case 3:
                    C0635Ly.A0Q(imageView, i);
                    return;
                case 4:
                    i = 0;
                    c2 = 3;
                    break;
            }
        }
    }
}
