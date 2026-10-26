package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.VideoAutoplayBehavior;
import com.facebook.ads.internal.api.NativeAdApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.5B, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C5B implements NativeAdApi {
    public final NativeAd A00;
    public final NativeAdBaseApi A01;

    public C5B(NativeAd nativeAd, NativeAdBaseApi nativeAdBaseApi) {
        this.A00 = nativeAd;
        this.A01 = nativeAdBaseApi;
        C1141cR.A0J(nativeAdBaseApi).A1P(KB.A06);
    }

    public C5B(NativeAdBase nativeAdBase, NativeAd nativeAd, NativeAdBaseApi nativeAdBaseApi) {
        this.A00 = nativeAd;
        this.A01 = nativeAdBaseApi;
    }

    private C1141cR A00() {
        return C1141cR.A0J(this.A01);
    }

    @Nullable
    public final String A01() {
        return A00().A18();
    }

    @Nullable
    public final String A02() {
        return A00().A19();
    }

    @Nullable
    public final List<NativeAd> A03() {
        C5B c5b = this;
        ArrayList arrayList = null;
        Iterator<C1141cR> it = null;
        char c2 = c5b.A00().A1B() == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (List) null;
                case 3:
                    c5b = c5b;
                    arrayList = new ArrayList();
                    it = c5b.A00().A1B().iterator();
                    c2 = 4;
                    break;
                case 4:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    arrayList = arrayList;
                    it = it;
                    C1141cR next = it.next();
                    arrayList.add(new NativeAd(next.A0w(), next));
                    c2 = 4;
                    break;
                case 6:
                    return arrayList;
            }
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final NativeAd.AdCreativeType getAdCreativeType() {
        C5B c5b = this;
        char c2 = !TextUtils.isEmpty(c5b.A00().A19()) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return NativeAd.AdCreativeType.VIDEO;
                case 3:
                    c5b = c5b;
                    if (c5b.A00().A1B() == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c5b = c5b;
                    if (!c5b.A00().A1B().isEmpty()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    return NativeAd.AdCreativeType.CAROUSEL;
                case 6:
                    c5b = c5b;
                    if (c5b.A00().getAdCoverImage() == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c5b = c5b;
                    if (!TextUtils.isEmpty(c5b.A00().getAdCoverImage().getUrl())) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\b':
                    return NativeAd.AdCreativeType.IMAGE;
                case '\t':
                    return NativeAd.AdCreativeType.UNKNOWN;
            }
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final VideoAutoplayBehavior getVideoAutoplayBehavior() {
        return EnumC0585Jx.A00(A00().A13());
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(View view, MediaView mediaView) {
        registerViewForInteraction(view, mediaView, (MediaView) null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(View view, MediaView mediaView, @Nullable ImageView imageView) {
        registerViewForInteraction(view, mediaView, imageView, (List<View>) null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(View view, MediaView mediaView, @Nullable ImageView imageView, @Nullable List<View> list) {
        if (imageView != null) {
            XI xiA0w = A00().A0w();
            XI xiA02 = AnonymousClass53.A02(imageView.getContext());
            xiA02.A0D(xiA0w);
            C1141cR.A0e(A00().getAdIcon(), imageView, xiA02);
        }
        registerViewForInteraction(view, mediaView, (MediaView) null, list);
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(View view, MediaView mediaView, @Nullable MediaView mediaView2) {
        registerViewForInteraction(view, mediaView, mediaView2, (List<View>) null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(View view, MediaView mediaView, @Nullable MediaView mediaView2, @Nullable List<View> list) {
        C5B c5b = this;
        char c2 = mediaView != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c5b = c5b;
                    mediaView = mediaView;
                    ((C0820Tg) mediaView.getMediaViewApi()).A0H(c5b.A00);
                    c2 = 3;
                    break;
                case 3:
                    mediaView2 = mediaView2;
                    if (mediaView2 == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c5b = c5b;
                    mediaView2 = mediaView2;
                    ((C0820Tg) mediaView2.getMediaViewApi()).A0I(c5b.A01, false);
                    c2 = 5;
                    break;
                case 5:
                    list = list;
                    if (list == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c5b = c5b;
                    view = view;
                    mediaView = mediaView;
                    list = list;
                    c5b.A00().A1H(view, mediaView, list);
                    c2 = 7;
                    break;
                case 7:
                    return;
                case '\b':
                    c5b = c5b;
                    view = view;
                    mediaView = mediaView;
                    c5b.A00().A1G(view, mediaView);
                    c2 = 7;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(View view, MediaView mediaView, @Nullable List<View> list) {
        registerViewForInteraction(view, mediaView, (MediaView) null, list);
    }
}
