package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.NativeAdLayoutApi;

/* renamed from: com.facebook.ads.redexgen.X.Th, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0821Th extends AnonymousClass52 implements NativeAdLayoutApi {

    @Nullable
    public View A02;
    public NativeAdLayout A03;
    public int A01 = 0;
    public int A00 = 0;

    public final void A02() {
        C0635Ly.A0X(this.A03);
        this.A03.removeView(this.A02);
        this.A02 = null;
    }

    public final void A03(N0 n0) {
        this.A02 = n0;
        n0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        C0635Ly.A0X(this.A03);
        this.A03.addView(this.A02);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final AdComponentViewApi getAdComponentViewApi() {
        return this;
    }

    @Override // com.facebook.ads.internal.api.NativeAdLayoutApi
    public final void initialize(NativeAdLayout nativeAdLayout) {
        this.A03 = nativeAdLayout;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass52, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onMeasure(int i, int i2) {
        C0821Th c0821Th = this;
        int i3 = 0;
        int i4 = 0;
        super.onMeasure(i, i2);
        char c2 = c0821Th.A00 > 0 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0821Th = c0821Th;
                    int measuredWidth = c0821Th.A03.getMeasuredWidth();
                    i4 = c0821Th.A00;
                    if (measuredWidth <= i4) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0821Th = c0821Th;
                    c0821Th.setMeasuredDimension(i4, c0821Th.A03.getMeasuredHeight());
                    c2 = 4;
                    break;
                case 4:
                    return;
                case 5:
                    c0821Th = c0821Th;
                    int measuredWidth2 = c0821Th.A03.getMeasuredWidth();
                    i3 = c0821Th.A01;
                    if (measuredWidth2 >= i3) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0821Th = c0821Th;
                    c0821Th.setMeasuredDimension(i3, c0821Th.A03.getMeasuredHeight());
                    c2 = 4;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdLayoutApi
    public final void setMaxWidth(int i) {
        this.A00 = i;
    }

    @Override // com.facebook.ads.internal.api.NativeAdLayoutApi
    public final void setMinWidth(int i) {
        this.A01 = i;
    }
}
