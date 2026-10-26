package com.facebook.ads.internal.dynamicloading;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.ads.AdChoicesView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InstreamVideoAdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.NativeAdsManager;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.NativeBannerAdView;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.internal.api.AdChoicesViewApi;
import com.facebook.ads.internal.api.AdOptionsViewApi;
import com.facebook.ads.internal.api.AdSettingsApi;
import com.facebook.ads.internal.api.AdSizeApi;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.api.AudienceNetworkActivityApi;
import com.facebook.ads.internal.api.AudienceNetworkAdsApi;
import com.facebook.ads.internal.api.BidderTokenProviderApi;
import com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi;
import com.facebook.ads.internal.api.InitApi;
import com.facebook.ads.internal.api.InstreamVideoAdViewApi;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.api.MediaViewApi;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.NativeAdImageApi;
import com.facebook.ads.internal.api.NativeAdLayoutApi;
import com.facebook.ads.internal.api.NativeAdScrollViewApi;
import com.facebook.ads.internal.api.NativeAdViewApi;
import com.facebook.ads.internal.api.NativeAdViewAttributesApi;
import com.facebook.ads.internal.api.NativeAdViewTypeApi;
import com.facebook.ads.internal.api.NativeAdsManagerApi;
import com.facebook.ads.internal.api.NativeBannerAdApi;
import com.facebook.ads.internal.api.NativeBannerAdViewApi;
import com.facebook.ads.internal.api.NativeComponentTagApi;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.facebook.ads.redexgen.X.AnonymousClass53;
import com.facebook.ads.redexgen.X.AnonymousClass56;
import com.facebook.ads.redexgen.X.AnonymousClass57;
import com.facebook.ads.redexgen.X.C02164j;
import com.facebook.ads.redexgen.X.C02224p;
import com.facebook.ads.redexgen.X.C02254s;
import com.facebook.ads.redexgen.X.C02304x;
import com.facebook.ads.redexgen.X.C02475p;
import com.facebook.ads.redexgen.X.C03228x;
import com.facebook.ads.redexgen.X.C0580Js;
import com.facebook.ads.redexgen.X.C0581Jt;
import com.facebook.ads.redexgen.X.C0582Ju;
import com.facebook.ads.redexgen.X.C0820Tg;
import com.facebook.ads.redexgen.X.C0821Th;
import com.facebook.ads.redexgen.X.C1131cH;
import com.facebook.ads.redexgen.X.C1141cR;
import com.facebook.ads.redexgen.X.C5A;
import com.facebook.ads.redexgen.X.C5B;
import com.facebook.ads.redexgen.X.C5C;
import com.facebook.ads.redexgen.X.C5F;
import com.facebook.ads.redexgen.X.C5M;
import com.facebook.ads.redexgen.X.K6;
import com.facebook.ads.redexgen.X.KA;
import com.facebook.ads.redexgen.X.TL;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class DynamicLoaderImpl implements DynamicLoader {
    public static AdSettingsApi A00;
    public static AudienceNetworkAdsApi A01;
    public static NativeAdViewApi A02;
    public static NativeBannerAdViewApi A03;
    public static C02475p A04;
    public static final InitApi A05 = new InitApi() { // from class: com.facebook.ads.redexgen.X.54
        @Override // com.facebook.ads.internal.api.InitApi
        public final void initialize(Context context, @Nullable MultithreadedBundleWrapper multithreadedBundleWrapper, @Nullable AudienceNetworkAds.InitListener initListener, int i) {
            C03228x.A0G(AnonymousClass53.A07(context), multithreadedBundleWrapper, initListener, i);
        }

        @Override // com.facebook.ads.internal.api.InitApi
        public final boolean isInitialized() {
            return C03228x.A0I();
        }

        @Override // com.facebook.ads.internal.api.InitApi
        public final void maybeAttachCrashListener(Context context) {
            C03228x.A07(AnonymousClass53.A07(context));
        }

        @Override // com.facebook.ads.internal.api.InitApi
        public final void onAdEventManagerCreated(Context context) {
            C03228x.A08(AnonymousClass53.A07(context));
        }

        @Override // com.facebook.ads.internal.api.InitApi
        public final void onAdLoadInvoked(Context context) {
            C03228x.A09(AnonymousClass53.A07(context));
        }

        @Override // com.facebook.ads.internal.api.InitApi
        public final void onContentProviderCreated(Context context) {
            C03228x.A0A(AnonymousClass53.A07(context));
        }
    };

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdChoicesViewApi createAdChoicesViewApi(AdChoicesView adChoicesView, Context context, NativeAdBase nativeAdBase) {
        return new C02224p(adChoicesView, context, nativeAdBase);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdOptionsViewApi createAdOptionsView(Context context, NativeAdBase nativeAdBase, @Nullable NativeAdLayout nativeAdLayout, AdOptionsView.Orientation orientation, int i, AdOptionsView adOptionsView) {
        return new TL(context, nativeAdBase, nativeAdLayout, orientation, i, adOptionsView);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdOptionsViewApi createAdOptionsView(Context context, NativeAdBase nativeAdBase, @Nullable NativeAdLayout nativeAdLayout, AdOptionsView adOptionsView) {
        return new TL(context, nativeAdBase, nativeAdLayout, adOptionsView);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdSettingsApi createAdSettingsApi() {
        if (A00 == null) {
            A00 = new AdSettingsApi() { // from class: com.facebook.ads.redexgen.X.4r
                public static byte[] A00;
                public static final String A01;
                public static final Collection<String> A02;
                public static volatile boolean A03;

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
                                bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 85);
                                i4++;
                                c2 = 2;
                                break;
                            case 4:
                                return new String(bArrCopyOfRange);
                        }
                    }
                }

                public static void A01() {
                    A00 = new byte[]{17, 25, 25, 17, 26, 19, 41, 5, 18, 29, 57, 8, 30, 25, 77, 0, 2, 9, 8, 77, 9, 8, 27, 4, 14, 8, 77, 5, 12, 30, 5, 87, 77, 48, 39, 40, 58, 59, 40, 55, 61, 59, 23, 58, 22, 63, 45, 54, 116, 115, 117, 120, 99, 98, 113, 110, 100, 98, 120, 110, 99, 120, 111, 102, 116, 111, 120, 108, 98, 126, 108, 104, 107, 78, 122, 88, 79, 76, 89, 59, 48, 34, 39, 51, 62, 41, 105, 103, 33, 90, 101, 104, 99, 45, 121, 104, 126, 121, 100, 99, 106, 45, 116, 98, 120, Byte.MAX_VALUE, 45, 108, 125, 125, 45, 122, 100, 121, 101, 45, 75, 108, 110, 104, 111, 98, 98, 102, 42, 126, 45, 108, 105, 45, 120, 99, 100, 121, 126, 45, 116, 98, 120, 45, 96, 120, 126, 121, 45, 126, 125, 104, 110, 100, 107, 116, 45, 121, 101, 104, 45, 105, 104, 123, 100, 110, 104, 45, 101, 108, 126, 101, 104, 105, 45, 68, 73, 45, 121, 98, 45, 104, 99, 126, 120, Byte.MAX_VALUE, 104, 45, 121, 101, 104, 45, 105, 104, 97, 100, 123, 104, Byte.MAX_VALUE, 116, 45, 98, 107, 45, 121, 104, 126, 121, 45, 108, 105, 126, 33, 45, 108, 105, 105, 45, 121, 101, 104, 45, 107, 98, 97, 97, 98, 122, 100, 99, 106, 45, 110, 98, 105, 104, 45, 111, 104, 107, 98, Byte.MAX_VALUE, 104, 45, 97, 98, 108, 105, 100, 99, 106, 45, 108, 99, 45, 108, 105, 55, 45, 76, 105, 94, 104, 121, 121, 100, 99, 106, 126, 35, 108, 105, 105, 89, 104, 126, 121, 73, 104, 123, 100, 110, 104, 37, 47, 29, 9, 4, 19, 83, 93, 31, 27};
                }

                static {
                    A01();
                    A01 = AdInternalSettings.class.getSimpleName();
                    A02 = new HashSet();
                    A02.add(A00(33, 3, 22));
                    A02.add(A00(0, 10, 35));
                    A02.add(A00(82, 7, 4));
                    A02.add(A00(281, 8, 62));
                    A03 = false;
                }

                public static void A02(String str) {
                    if (A03) {
                        return;
                    }
                    A03 = true;
                    Log.i(A01, A00(10, 23, 56) + str);
                    Log.i(A01, A00(89, 192, 88) + str + A00(79, 3, 76));
                }

                @Override // com.facebook.ads.internal.api.AdSettingsApi
                public final boolean isTestMode(Context context) {
                    String string = null;
                    String strA00 = null;
                    boolean z = false;
                    String str = null;
                    SharedPreferences sharedPreferences = null;
                    String strA002 = null;
                    char c2 = !AdInternalSettings.isDebugBuild() ? (char) 2 : (char) 4;
                    while (true) {
                        switch (c2) {
                            case 2:
                                if (!AdInternalSettings.isExplicitTestMode()) {
                                    c2 = 3;
                                    break;
                                } else {
                                    c2 = 4;
                                    break;
                                }
                            case 3:
                                if (!A02.contains(Build.PRODUCT)) {
                                    c2 = 5;
                                    break;
                                } else {
                                    c2 = 4;
                                    break;
                                }
                            case 4:
                                return true;
                            case 5:
                                MultithreadedBundleWrapper multithreadedBundleWrapper = AdInternalSettings.sSettingsBundle;
                                str = null;
                                strA00 = A00(48, 22, k.AppCompatTheme_viewInflaterClass);
                                string = multithreadedBundleWrapper.getString(strA00, null);
                                z = false;
                                if (string != null) {
                                    c2 = '\t';
                                    break;
                                } else {
                                    c2 = 6;
                                    break;
                                }
                            case 6:
                                context = context;
                                z = false;
                                sharedPreferences = context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A00(70, 9, 127), context), 0);
                                strA002 = A00(36, 12, 11);
                                string = sharedPreferences.getString(strA002, str);
                                if (!TextUtils.isEmpty(string)) {
                                    c2 = '\b';
                                    break;
                                } else {
                                    c2 = 7;
                                    break;
                                }
                            case 7:
                                sharedPreferences = sharedPreferences;
                                strA002 = strA002;
                                string = UUID.randomUUID().toString();
                                sharedPreferences.edit().putString(strA002, string).apply();
                                c2 = '\b';
                                break;
                            case '\b':
                                strA00 = strA00;
                                string = string;
                                AdInternalSettings.sSettingsBundle.putString(strA00, string);
                                c2 = '\t';
                                break;
                            case '\t':
                                string = string;
                                if (!AdInternalSettings.getTestDevicesList().contains(string)) {
                                    c2 = 11;
                                    break;
                                } else {
                                    c2 = '\n';
                                    break;
                                }
                            case '\n':
                                return true;
                            case 11:
                                A02(string);
                                return z;
                        }
                    }
                }

                @Override // com.facebook.ads.internal.api.AdSettingsApi
                public final void turnOnDebugger() {
                    KJ.A02();
                }
            };
        }
        return A00;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdSizeApi createAdSizeApi(int i) {
        return KA.A00(i);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdViewApi createAdViewApi(Context context, String str, AdSize adSize, AdViewParentApi adViewParentApi, AdView adView) {
        return (AdViewApi) C02164j.A00(new C02254s(context, str, adSize, adViewParentApi, adView), AdViewApi.class);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdViewApi createAdViewApi(Context context, String str, String str2, AdViewParentApi adViewParentApi, AdView adView) throws Exception {
        try {
            return (AdViewApi) C02164j.A00(new C02254s(context, str, str2, adViewParentApi, adView), AdViewApi.class);
        } catch (K6 e) {
            throw new Exception(e.A01());
        }
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AudienceNetworkActivityApi createAudienceNetworkActivity(final AudienceNetworkActivity audienceNetworkActivity, final AudienceNetworkActivityApi audienceNetworkActivityApi) {
        final C02304x c02304x = new C02304x(audienceNetworkActivity, audienceNetworkActivityApi);
        return new AudienceNetworkActivityApi(audienceNetworkActivity, audienceNetworkActivityApi, c02304x) { // from class: com.facebook.ads.redexgen.X.4y
            public static byte[] A04;
            public boolean A00;
            public final AudienceNetworkActivity A01;
            public final AudienceNetworkActivityApi A02;
            public final C02304x A03;

            static {
                A01();
            }

            public static String A00(int i, int i2, int i3) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
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
                            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 13);
                            i4++;
                            c2 = 2;
                            break;
                        case 4:
                            return new String(bArrCopyOfRange);
                    }
                }
            }

            public static void A01() {
                A04 = new byte[]{-112, -116, -117, -65, -82, -77, -81, -72, -83, -81, -104, -81, -66, -63, -71, -68, -75, -30, -17, -32, -30, -28, -11, -22, -9, -22, -11, -6, -68, -43, -52, -33, -41, -52, -54, -37, -52, -53, -121, -52, -33, -54, -52, -41, -37, -48, -42, -43, -107};
            }

            {
                this.A01 = audienceNetworkActivity;
                this.A02 = audienceNetworkActivityApi;
                this.A03 = c02304x;
            }

            private void A02(Throwable th) {
                this.A00 = true;
                this.A03.A0J();
                finish(8);
                XI xiA0I = this.A03.A0I();
                char c2 = xiA0I != null ? (char) 2 : (char) 4;
                while (true) {
                    switch (c2) {
                        case 2:
                            th = th;
                            xiA0I = xiA0I;
                            xiA0I.A04().A83(A00(17, 11, k.AppCompatTheme_windowActionBarOverlay), C03008a.A04, new C03018b(th));
                            c2 = 3;
                            break;
                        case 3:
                            return;
                        case 4:
                            th = th;
                            Log.e(A00(0, 17, 61), A00(28, 21, 90), th);
                            c2 = 3;
                            break;
                    }
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final void finish(int i) {
                this.A03.finish(i);
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final void onBackPressed() {
                C02314y c02314y = this;
                char c2 = 2;
                while (true) {
                    switch (c2) {
                        case 2:
                            try {
                                c02314y = c02314y;
                                if (c02314y.A00) {
                                    c2 = 4;
                                } else {
                                    c2 = 5;
                                    continue;
                                }
                            } catch (Throwable th) {
                                c02314y.A02(th);
                                return;
                            }
                        case 4:
                            return;
                        case 5:
                            c02314y = c02314y;
                            c02314y.A03.onBackPressed();
                            return;
                    }
                    c02314y.A02(th);
                    return;
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final void onConfigurationChanged(Configuration configuration) {
                C02314y c02314y = this;
                char c2 = 2;
                while (true) {
                    switch (c2) {
                        case 2:
                            try {
                                c02314y = c02314y;
                                if (c02314y.A00) {
                                    c2 = 4;
                                } else {
                                    c2 = 7;
                                    continue;
                                }
                            } catch (Throwable th) {
                                c02314y.A02(th);
                                c02314y.A02.onConfigurationChanged(configuration);
                                return;
                            }
                        case 4:
                            c02314y.A02.onConfigurationChanged(configuration);
                            return;
                        case 7:
                            c02314y = c02314y;
                            c02314y.A03.onConfigurationChanged(configuration);
                            break;
                    }
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final void onCreate(Bundle bundle) {
                this.A02.onCreate(bundle);
                try {
                    this.A03.onCreate(bundle);
                } catch (Throwable th) {
                    A02(th);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final void onDestroy() {
                C02314y c02314y = this;
                char c2 = 2;
                while (true) {
                    switch (c2) {
                        case 2:
                            try {
                                c02314y = c02314y;
                                if (c02314y.A00) {
                                    c2 = 4;
                                } else {
                                    c2 = 7;
                                    continue;
                                }
                            } catch (Throwable th) {
                                c02314y.A02(th);
                                break;
                            }
                        case 4:
                            c02314y.A02.onDestroy();
                            return;
                        case 7:
                            c02314y = c02314y;
                            c02314y.A03.onDestroy();
                            break;
                    }
                }
                c02314y.A02.onDestroy();
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final void onPause() {
                C02314y c02314y = this;
                char c2 = 2;
                while (true) {
                    switch (c2) {
                        case 2:
                            try {
                                c02314y = c02314y;
                                if (c02314y.A00) {
                                    c2 = 4;
                                } else {
                                    c2 = 7;
                                    continue;
                                }
                            } catch (Throwable th) {
                                c02314y.A02(th);
                                break;
                            }
                        case 4:
                            c02314y.A02.onPause();
                            return;
                        case 7:
                            c02314y = c02314y;
                            c02314y.A03.onPause();
                            break;
                    }
                }
                c02314y.A02.onPause();
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final void onResume() {
                C02314y c02314y = this;
                c02314y.A02.onResume();
                char c2 = 2;
                while (true) {
                    switch (c2) {
                        case 2:
                            try {
                                c02314y = c02314y;
                                if (c02314y.A00) {
                                    c2 = 4;
                                } else {
                                    c2 = 5;
                                    continue;
                                }
                            } catch (Throwable th) {
                                c02314y.A02(th);
                                return;
                            }
                        case 4:
                            return;
                        case 5:
                            c02314y = c02314y;
                            c02314y.A03.onResume();
                            return;
                    }
                    c02314y.A02(th);
                    return;
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final void onSaveInstanceState(Bundle bundle) {
                C02314y c02314y = this;
                c02314y.A02.onSaveInstanceState(bundle);
                char c2 = 2;
                while (true) {
                    switch (c2) {
                        case 2:
                            try {
                                c02314y = c02314y;
                                if (c02314y.A00) {
                                    c2 = 4;
                                } else {
                                    c2 = 5;
                                    continue;
                                }
                            } catch (Throwable th) {
                                c02314y.A02(th);
                                return;
                            }
                        case 4:
                            return;
                        case 5:
                            c02314y = c02314y;
                            c02314y.A03.onSaveInstanceState(bundle);
                            return;
                    }
                    c02314y.A02(th);
                    return;
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final void onStart() {
                C02314y c02314y = this;
                c02314y.A02.onStart();
                char c2 = 2;
                while (true) {
                    switch (c2) {
                        case 2:
                            try {
                                c02314y = c02314y;
                                if (c02314y.A00) {
                                    c2 = 4;
                                } else {
                                    c2 = 5;
                                    continue;
                                }
                            } catch (Throwable th) {
                                c02314y.A02(th);
                                return;
                            }
                        case 4:
                            return;
                        case 5:
                            c02314y = c02314y;
                            c02314y.A03.onStart();
                            return;
                    }
                    c02314y.A02(th);
                    return;
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final void onStop() {
                C02314y c02314y = this;
                c02314y.A02.onStop();
                char c2 = 2;
                while (true) {
                    switch (c2) {
                        case 2:
                            try {
                                c02314y = c02314y;
                                if (c02314y.A00) {
                                    c2 = 4;
                                } else {
                                    c2 = 5;
                                    continue;
                                }
                            } catch (Throwable th) {
                                c02314y.A02(th);
                                return;
                            }
                        case 4:
                            return;
                        case 5:
                            c02314y = c02314y;
                            c02314y.A03.onStop();
                            return;
                    }
                    c02314y.A02(th);
                    return;
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                C02314y c02314y = this;
                char c2 = 2;
                while (true) {
                    switch (c2) {
                        case 2:
                            try {
                                c02314y = c02314y;
                                if (c02314y.A00) {
                                    c2 = 4;
                                } else {
                                    c2 = 7;
                                    continue;
                                }
                            } catch (Throwable th) {
                                c02314y.A02(th);
                                break;
                            }
                        case 4:
                            return c02314y.A02.onTouchEvent(motionEvent);
                        case 7:
                            c02314y = c02314y;
                            c02314y.A03.onTouchEvent(motionEvent);
                            break;
                    }
                }
                return c02314y.A02.onTouchEvent(motionEvent);
            }
        };
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AudienceNetworkAdsApi createAudienceNetworkAdsApi() {
        if (A01 == null) {
            A01 = new AudienceNetworkAdsApi() { // from class: com.facebook.ads.redexgen.X.50
                @Override // com.facebook.ads.internal.api.AudienceNetworkAdsApi
                public final int getAdFormatForPlacement(String str) throws Throwable {
                    AnonymousClass50 anonymousClass50 = this;
                    AnonymousClass50 anonymousClass502 = null;
                    char c2 = C0601Ko.A02(anonymousClass50) ? (char) 2 : (char) 3;
                    while (true) {
                        switch (c2) {
                            case 2:
                                return 0;
                            case 3:
                                anonymousClass50 = anonymousClass50;
                                anonymousClass502 = anonymousClass50;
                                c2 = 4;
                                break;
                            case 4:
                                try {
                                    return AnonymousClass96.A00(str).intValue();
                                } catch (Throwable th) {
                                    C0601Ko.A00(th, anonymousClass502);
                                    return 0;
                                }
                        }
                    }
                }

                @Override // com.facebook.ads.internal.api.AudienceNetworkAdsApi
                public final void initialize(Context context, @Nullable MultithreadedBundleWrapper multithreadedBundleWrapper, @Nullable AudienceNetworkAds.InitListener initListener) throws Throwable {
                    if (C0601Ko.A02(this)) {
                        return;
                    }
                    if (initListener == null) {
                        try {
                            initListener = new AudienceNetworkAds.InitListener() { // from class: com.facebook.ads.redexgen.X.4z
                                @Override // com.facebook.ads.AudienceNetworkAds.InitListener
                                public final void onInitialized(AudienceNetworkAds.InitResult initResult) {
                                }
                            };
                        } catch (Throwable th) {
                            C0601Ko.A00(th, this);
                            return;
                        }
                    }
                    DynamicLoaderFactory.makeLoader(context).getInitApi().initialize(context, multithreadedBundleWrapper, initListener, 1);
                }

                @Override // com.facebook.ads.internal.api.AudienceNetworkAdsApi
                public final boolean isInitialized() throws Throwable {
                    AnonymousClass50 anonymousClass50 = this;
                    AnonymousClass50 anonymousClass502 = null;
                    DynamicLoader dynamicLoader = null;
                    char c2 = C0601Ko.A02(anonymousClass50) ? (char) 2 : (char) 3;
                    while (true) {
                        switch (c2) {
                            case 2:
                                return false;
                            case 3:
                                anonymousClass50 = anonymousClass50;
                                anonymousClass502 = anonymousClass50;
                                c2 = 4;
                            case 4:
                                try {
                                    dynamicLoader = DynamicLoaderFactory.getDynamicLoader();
                                    c2 = dynamicLoader == null ? (char) 6 : (char) 7;
                                } catch (Throwable th) {
                                    C0601Ko.A00(th, anonymousClass502);
                                    return false;
                                }
                            case 6:
                                return false;
                            case 7:
                                return dynamicLoader.getInitApi().isInitialized();
                        }
                        C0601Ko.A00(th, anonymousClass502);
                        return false;
                    }
                }

                @Override // com.facebook.ads.internal.api.AudienceNetworkAdsApi
                public final void onContentProviderCreated(Context context) throws Throwable {
                    AnonymousClass50 anonymousClass50 = this;
                    AnonymousClass50 anonymousClass502 = null;
                    char c2 = C0601Ko.A02(anonymousClass50) ? (char) 2 : (char) 3;
                    while (true) {
                        switch (c2) {
                            case 2:
                                return;
                            case 3:
                                anonymousClass50 = anonymousClass50;
                                anonymousClass502 = anonymousClass50;
                                c2 = 4;
                                break;
                            case 4:
                                try {
                                    Context context2 = context;
                                    DynamicLoaderFactory.makeLoader(context2).getInitApi().onContentProviderCreated(context2);
                                    return;
                                } catch (Throwable th) {
                                    C0601Ko.A00(th, anonymousClass502);
                                    return;
                                }
                        }
                    }
                }
            };
        }
        return A01;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public BidderTokenProviderApi createBidderTokenProviderApi() {
        return getBidderTokenProviderApi();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public DefaultMediaViewVideoRendererApi createDefaultMediaViewVideoRendererApi() {
        return new C1131cH();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public InstreamVideoAdViewApi createInstreamVideoAdViewApi(InstreamVideoAdView instreamVideoAdView, Context context, Bundle bundle) {
        return (InstreamVideoAdViewApi) C02164j.A00(new AnonymousClass56(instreamVideoAdView, context, bundle), InstreamVideoAdViewApi.class);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public InstreamVideoAdViewApi createInstreamVideoAdViewApi(InstreamVideoAdView instreamVideoAdView, Context context, String str, AdSize adSize) {
        return (InstreamVideoAdViewApi) C02164j.A00(new AnonymousClass56(instreamVideoAdView, context, str, adSize), InstreamVideoAdViewApi.class);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public InterstitialAdApi createInterstitialAd(Context context, String str, InterstitialAd interstitialAd) {
        return (InterstitialAdApi) C02164j.A00(new AnonymousClass57(context, str, interstitialAd), InterstitialAdApi.class);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public MediaViewApi createMediaViewApi() {
        return new C0820Tg();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public MediaViewVideoRendererApi createMediaViewVideoRendererApi() {
        return new C5A();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public C5B createNativeAdApi(NativeAd nativeAd, NativeAdBaseApi nativeAdBaseApi) {
        return new C5B(nativeAd, nativeAdBaseApi);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public C5B createNativeAdApi(NativeAdBase nativeAdBase, NativeAd nativeAd, NativeAdBaseApi nativeAdBaseApi) {
        return new C5B(nativeAdBase, nativeAd, nativeAdBaseApi);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdBaseApi createNativeAdBaseApi(Context context, String str) {
        return new C1141cR(context, str, C1141cR.A0I(), false);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdBaseApi createNativeAdBaseApi(NativeAdBaseApi nativeAdBaseApi) {
        return new C1141cR((C1141cR) nativeAdBaseApi);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdBase createNativeAdBaseFromBidPayload(Context context, String str, String str2) throws Exception {
        try {
            return C1141cR.A0A(context, str, str2);
        } catch (K6 e) {
            throw new Exception(e.A01());
        }
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    @Nullable
    public NativeAdImageApi createNativeAdImageApi(JSONObject jSONObject) {
        return C0580Js.A00(jSONObject);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdLayoutApi createNativeAdLayoutApi() {
        return new C0821Th();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    @Nullable
    public C0581Jt createNativeAdRatingApi(JSONObject jSONObject) {
        return C0581Jt.A00(jSONObject);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdScrollViewApi createNativeAdScrollViewApi(NativeAdScrollView nativeAdScrollView, Context context, NativeAdsManager nativeAdsManager, @Nullable NativeAdScrollView.AdViewProvider adViewProvider, int i, @Nullable NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes, int i2) {
        return new C5C(nativeAdScrollView, context, nativeAdsManager, adViewProvider, i, type, nativeAdViewAttributes, i2);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdViewApi createNativeAdViewApi() {
        if (A02 == null) {
            A02 = new NativeAdViewApi() { // from class: com.facebook.ads.redexgen.X.5D
                public static View A00(XI xi, NativeAd nativeAd, NativeAdView.Type type, @Nullable NativeAdViewAttributes nativeAdViewAttributes) {
                    if (nativeAdViewAttributes == null) {
                        nativeAdViewAttributes = new NativeAdViewAttributes();
                    }
                    C0582Ju c0582Ju = (C0582Ju) nativeAdViewAttributes.getInternalAttributes();
                    C1141cR c1141cRA0J = C1141cR.A0J(nativeAd.getInternalNativeAd());
                    c1141cRA0J.A1O(EnumC0583Jv.A00(type.getEnumCode()));
                    c1141cRA0J.A1N(c0582Ju);
                    C0439Eb c0439Eb = new C0439Eb();
                    NativeAdLayout nativeAdLayout = new NativeAdLayout(xi, c0439Eb);
                    c0439Eb.A04(nativeAdLayout, xi, nativeAd, c0582Ju);
                    nativeAdLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) (C0635Ly.A01 * type.getHeight())));
                    return nativeAdLayout;
                }

                public static View A01(XI xi, NativeAd nativeAd, @Nullable NativeAdViewAttributes nativeAdViewAttributes) {
                    if (nativeAdViewAttributes == null) {
                        nativeAdViewAttributes = new NativeAdViewAttributes();
                    }
                    C1141cR c1141cRA0J = C1141cR.A0J(nativeAd.getInternalNativeAd());
                    C0582Ju c0582Ju = (C0582Ju) nativeAdViewAttributes.getInternalAttributes();
                    c1141cRA0J.A1O(EnumC0583Jv.A0B);
                    c1141cRA0J.A1N(c0582Ju);
                    C0439Eb c0439Eb = new C0439Eb();
                    NativeAdLayout nativeAdLayout = new NativeAdLayout(xi, c0439Eb);
                    c0439Eb.A04(nativeAdLayout, xi, nativeAd, c0582Ju);
                    return nativeAdLayout;
                }

                @Override // com.facebook.ads.internal.api.NativeAdViewApi
                public final View render(Context context, NativeAd nativeAd) {
                    return render(context, nativeAd, (NativeAdViewAttributes) null);
                }

                @Override // com.facebook.ads.internal.api.NativeAdViewApi
                public final View render(Context context, NativeAd nativeAd, NativeAdView.Type type) {
                    return render(context, nativeAd, type, null);
                }

                @Override // com.facebook.ads.internal.api.NativeAdViewApi
                @SuppressLint({"CatchGeneralException"})
                public final View render(Context context, NativeAd nativeAd, NativeAdView.Type type, @Nullable NativeAdViewAttributes nativeAdViewAttributes) {
                    try {
                        return A00(AnonymousClass53.A02(context), nativeAd, type, nativeAdViewAttributes);
                    } catch (Throwable th) {
                        return C0637Ma.A00(AnonymousClass53.A02(context), th);
                    }
                }

                @Override // com.facebook.ads.internal.api.NativeAdViewApi
                @SuppressLint({"CatchGeneralException"})
                public final View render(Context context, NativeAd nativeAd, @Nullable NativeAdViewAttributes nativeAdViewAttributes) {
                    try {
                        return A01(AnonymousClass53.A02(context), nativeAd, nativeAdViewAttributes);
                    } catch (Throwable th) {
                        return C0637Ma.A00(AnonymousClass53.A02(context), th);
                    }
                }
            };
        }
        return A02;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdViewAttributesApi createNativeAdViewAttributesApi() {
        return new C0582Ju();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdViewTypeApi createNativeAdViewTypeApi(final int i) {
        return new NativeAdViewTypeApi(i) { // from class: com.facebook.ads.redexgen.X.5E
            public final EnumC0583Jv A00;

            {
                this.A00 = EnumC0583Jv.A00(i);
            }

            @Override // com.facebook.ads.internal.api.NativeAdViewTypeApi
            public final int getHeight() {
                return this.A00.A03();
            }

            @Override // com.facebook.ads.internal.api.NativeAdViewTypeApi
            public final int getValue() {
                return this.A00.A04();
            }

            @Override // com.facebook.ads.internal.api.NativeAdViewTypeApi
            public final int getWidth() {
                return this.A00.A05();
            }
        };
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdsManagerApi createNativeAdsManagerApi(Context context, String str, int i) {
        return (NativeAdsManagerApi) C02164j.A00(new C5F(context, str, i), NativeAdsManagerApi.class);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeBannerAdApi createNativeBannerAdApi(NativeBannerAd nativeBannerAd, NativeAdBaseApi nativeAdBaseApi) {
        return new NativeBannerAdApi(nativeAdBaseApi) { // from class: com.facebook.ads.redexgen.X.5J
            public static byte[] A01;
            public final C1141cR A00;

            static {
                A01();
            }

            public static String A00(int i, int i2, int i3) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
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
                            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 88);
                            i4++;
                            c2 = 2;
                            break;
                        case 4:
                            return new String(bArrCopyOfRange);
                    }
                }
            }

            public static void A01() {
                A01 = new byte[]{-87, -91, -92, -40, -57, -52, -56, -47, -58, -56, -79, -56, -41, -38, -46, -43, -50};
            }

            {
                this.A00 = C1141cR.A0J(nativeAdBaseApi);
                this.A00.A1P(KB.A05);
            }

            private void A02(ImageView imageView, NativeAdBaseApi nativeAdBaseApi2) {
                ImageView imageView2 = imageView;
                C5J c5j = this;
                InterfaceC1142cS interfaceC1142cSA10 = null;
                XI xiA02 = null;
                AdErrorType adErrorType = null;
                Bitmap bitmapA0H = null;
                C1141cR c1141cRA0J = C1141cR.A0J(nativeAdBaseApi2);
                C0828To c0828To = new C0828To(c5j, imageView2, c1141cRA0J);
                C0580Js c0580JsA0z = c1141cRA0J.getAdIcon();
                char c2 = c0580JsA0z != null ? (char) 2 : (char) 6;
                while (true) {
                    switch (c2) {
                        case 2:
                            imageView2 = imageView2;
                            c1141cRA0J = c1141cRA0J;
                            c0580JsA0z = c0580JsA0z;
                            bitmapA0H = c1141cRA0J.A0v().A0H(c0580JsA0z.getUrl());
                            xiA02 = AnonymousClass53.A02(imageView2.getContext());
                            if (bitmapA0H == null) {
                                c2 = 5;
                                break;
                            } else {
                                c2 = 3;
                                break;
                            }
                        case 3:
                            c5j = c5j;
                            imageView2 = imageView2;
                            c1141cRA0J = c1141cRA0J;
                            bitmapA0H = bitmapA0H;
                            xiA02 = xiA02;
                            Drawable drawableA05 = C1141cR.A05(xiA02, bitmapA0H, c1141cRA0J.A1U(), c1141cRA0J.A15());
                            C1141cR.A0Y(drawableA05, imageView2);
                            imageView2.post(new C0829Tp(c5j, c1141cRA0J, drawableA05));
                            c2 = 4;
                            break;
                        case 4:
                            return;
                        case 5:
                            c1141cRA0J = c1141cRA0J;
                            c0828To = c0828To;
                            c0580JsA0z = c0580JsA0z;
                            xiA02 = xiA02;
                            C0828To c0828To2 = null;
                            new C5G(xiA02, c0828To, c1141cRA0J.A1U(), c0828To2).execute(new C5I(c0580JsA0z.getUrl(), c1141cRA0J.A15(), c0828To2));
                            c2 = 4;
                            break;
                        case 6:
                            c1141cRA0J = c1141cRA0J;
                            interfaceC1142cSA10 = c1141cRA0J.A10();
                            adErrorType = AdErrorType.NATIVE_AD_IS_NOT_LOADED;
                            c1141cRA0J.A0w().A0A().A2c(-1L, adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
                            if (interfaceC1142cSA10 == null) {
                                c2 = '\b';
                                break;
                            } else {
                                c2 = 7;
                                break;
                            }
                        case 7:
                            interfaceC1142cSA10 = interfaceC1142cSA10;
                            adErrorType = adErrorType;
                            interfaceC1142cSA10.A9Y(K5.A01(adErrorType));
                            c2 = '\b';
                            break;
                        case '\b':
                            adErrorType = adErrorType;
                            Log.e(A00(0, 17, 11), adErrorType.getDefaultErrorMessage());
                            c2 = 4;
                            break;
                    }
                }
            }

            @Override // com.facebook.ads.internal.api.NativeBannerAdApi
            public final void registerViewForInteraction(View view, ImageView imageView) {
                registerViewForInteraction(view, imageView, (List<View>) null);
            }

            @Override // com.facebook.ads.internal.api.NativeBannerAdApi
            public final void registerViewForInteraction(View view, ImageView imageView, @Nullable List<View> list) {
                C5J c5j = this;
                char c2 = imageView != null ? (char) 2 : (char) 3;
                while (true) {
                    switch (c2) {
                        case 2:
                            c5j = c5j;
                            imageView = imageView;
                            c5j.A02(imageView, c5j.A00);
                            c2 = 3;
                            break;
                        case 3:
                            list = list;
                            if (list == null) {
                                c2 = 6;
                                break;
                            } else {
                                c2 = 4;
                                break;
                            }
                        case 4:
                            c5j = c5j;
                            view = view;
                            imageView = imageView;
                            list = list;
                            c5j.A00.A1F(view, imageView, list);
                            c2 = 5;
                            break;
                        case 5:
                            return;
                        case 6:
                            c5j = c5j;
                            view = view;
                            imageView = imageView;
                            c5j.A00.A1E(view, imageView);
                            c2 = 5;
                            break;
                    }
                }
            }

            @Override // com.facebook.ads.internal.api.NativeBannerAdApi
            public final void registerViewForInteraction(View view, MediaView mediaView) {
                registerViewForInteraction(view, mediaView, (List<View>) null);
            }

            @Override // com.facebook.ads.internal.api.NativeBannerAdApi
            public final void registerViewForInteraction(View view, MediaView mediaView, @Nullable List<View> list) {
                C5J c5j = this;
                char c2 = mediaView != null ? (char) 2 : (char) 3;
                while (true) {
                    switch (c2) {
                        case 2:
                            c5j = c5j;
                            mediaView = mediaView;
                            ((C0820Tg) mediaView.getMediaViewApi()).A0I(c5j.A00, true);
                            c2 = 3;
                            break;
                        case 3:
                            list = list;
                            if (list == null) {
                                c2 = 6;
                                break;
                            } else {
                                c2 = 4;
                                break;
                            }
                        case 4:
                            c5j = c5j;
                            view = view;
                            mediaView = mediaView;
                            list = list;
                            c5j.A00.A1H(view, mediaView, list);
                            c2 = 5;
                            break;
                        case 5:
                            return;
                        case 6:
                            c5j = c5j;
                            view = view;
                            mediaView = mediaView;
                            c5j.A00.A1G(view, mediaView);
                            c2 = 5;
                            break;
                    }
                }
            }
        };
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeBannerAdViewApi createNativeBannerAdViewApi() {
        if (A03 == null) {
            A03 = new NativeBannerAdViewApi() { // from class: com.facebook.ads.redexgen.X.5K
                public static View A00(XI xi, NativeBannerAd nativeBannerAd, NativeBannerAdView.Type type, @Nullable NativeAdViewAttributes nativeAdViewAttributes) {
                    if (nativeAdViewAttributes == null) {
                        nativeAdViewAttributes = new NativeAdViewAttributes();
                    }
                    C1141cR.A0J(nativeBannerAd.getInternalNativeAd()).A1O(EnumC0583Jv.A00(type.getEnumCode()));
                    C0449En c0449En = new C0449En();
                    NativeAdLayout nativeAdLayout = new NativeAdLayout(xi, c0449En);
                    c0449En.A04(xi, nativeBannerAd, (C0582Ju) nativeAdViewAttributes.getInternalAttributes(), nativeAdLayout);
                    nativeAdLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) (C0635Ly.A01 * type.getHeight())));
                    return nativeAdLayout;
                }

                @Override // com.facebook.ads.internal.api.NativeBannerAdViewApi
                public final View render(Context context, NativeBannerAd nativeBannerAd, NativeBannerAdView.Type type) {
                    return render(context, nativeBannerAd, type, null);
                }

                @Override // com.facebook.ads.internal.api.NativeBannerAdViewApi
                @SuppressLint({"CatchGeneralException"})
                public final View render(Context context, NativeBannerAd nativeBannerAd, NativeBannerAdView.Type type, @Nullable NativeAdViewAttributes nativeAdViewAttributes) {
                    try {
                        return A00(AnonymousClass53.A02(context), nativeBannerAd, type, nativeAdViewAttributes);
                    } catch (Throwable th) {
                        return C0637Ma.A00(AnonymousClass53.A02(context), th);
                    }
                }
            };
        }
        return A03;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeComponentTagApi createNativeComponentTagApi() {
        return new NativeComponentTagApi() { // from class: com.facebook.ads.redexgen.X.5L
            @Override // com.facebook.ads.internal.api.NativeComponentTagApi
            public final void tagView(View view, NativeAdBase.NativeComponentTag nativeComponentTag) {
                char c2 = view != null ? (char) 2 : (char) 4;
                while (true) {
                    switch (c2) {
                        case 2:
                            nativeComponentTag = nativeComponentTag;
                            if (nativeComponentTag == null) {
                                c2 = 4;
                                break;
                            } else {
                                c2 = 3;
                                break;
                            }
                        case 3:
                            view = view;
                            nativeComponentTag = nativeComponentTag;
                            LW.A03(view, nativeComponentTag);
                            c2 = 4;
                            break;
                        case 4:
                            return;
                    }
                }
            }
        };
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public RewardedVideoAdApi createRewardedVideoAd(Context context, String str, RewardedVideoAd rewardedVideoAd) {
        return (RewardedVideoAdApi) C02164j.A00(new C5M(context, str, rewardedVideoAd), RewardedVideoAdApi.class);
    }

    public static C02475p getBidderTokenProviderApi() {
        if (A04 == null) {
            A04 = new C02475p();
        }
        return A04;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public InitApi getInitApi() {
        return A05;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public void maybeInitInternally(Context context) {
        C03228x.A0B(AnonymousClass53.A07(context));
    }
}
