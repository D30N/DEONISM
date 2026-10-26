package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.internal.api.AdNativeComponentView;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.NativeAdImageApi;
import com.facebook.ads.internal.api.Repairable;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.proguard.annotations.DoNotStrip;
import d.b.a.b.k;
import java.lang.ref.WeakReference;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.WeakHashMap;

/* renamed from: com.facebook.ads.redexgen.X.cR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1141cR implements com.facebook.ads.Ad, NativeAdBaseApi, Repairable, K0 {
    public static C7C A0g;
    public static byte[] A0h;
    public static final String A0i;
    public static final WeakHashMap<View, WeakReference<C1141cR>> A0j;
    public long A00;

    @Nullable
    public Drawable A01;
    public View.OnTouchListener A02;

    @Nullable
    public View A03;
    public View A04;

    @Nullable
    public View A05;

    @Nullable
    public NativeAdLayout A06;
    public AnonymousClass10 A07;

    @Nullable
    public C0781Rq A08;
    public FP A09;

    @Nullable
    public SG A0A;

    @Nullable
    public C7H A0B;

    @Nullable
    public C03198t A0C;
    public EnumC0575Jn A0D;
    public ViewOnClickListenerC1139cP A0E;

    @Nullable
    public InterfaceC1142cS A0F;
    public C0582Ju A0G;
    public EnumC0583Jv A0H;
    public KB A0I;
    public C0656Mu A0J;

    @Nullable
    public C0674Nm A0K;

    @Nullable
    public C0703Op A0L;

    @DoNotStrip
    public Q0 A0M;
    public Q1 A0N;
    public String A0O;

    @Nullable
    public String A0P;
    public WeakReference<TL> A0Q;
    public WeakReference<Q0> A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;

    @Nullable
    public C0770Rf A0W;
    public final C7C A0X;
    public final XI A0Y;
    public final InterfaceC0579Jr A0Z;
    public final K2 A0a;
    public final C0628Lr A0b;
    public final String A0c;
    public final String A0d;
    public final List<View> A0e;
    public volatile boolean A0f;

    public static String A0S(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0h, i, i + i2);
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

    public static void A0X() {
        A0h = new byte[]{54, 53, 59, 62, 27, 62, 27, 51, 50, 63, 55, 0, 63, 51, 33, 118, 63, 37, 118, 59, 63, 37, 37, 63, 56, 49, 120, 95, 112, 101, 120, 103, 116, 49, 112, 117, 49, 117, 116, 98, 101, 99, 126, 104, 116, 117, 12, 1, 5, 0, 8, 13, 10, 1, 57, 28, 88, 22, 23, 12, 88, 20, 23, 25, 28, 29, 28, 96, 98, 111, 111, 92, 119, 108, 92, 98, 96, 119, 106, 108, 109, 50, 23, 39, 22, 30, 3, 31, 18, 7, 22, 83, 84, 86, 0, 84, 83, 26, 0, 83, 29, 28, 7, 83, 18, 83, 29, 18, 7, 26, 5, 22, 83, 18, 23, 37, 2, 10, 15, 6, 7, 67, 23, 12, 67, 12, 1, 23, 2, 10, 13, 67, 23, 6, 14, 19, 15, 2, 23, 6, 67, 42, 39, 67, 5, 17, 12, 14, 67, 1, 10, 7, 67, 19, 2, 26, 15, 12, 2, 7, 67, 68, 70, 16, 68, 29, 25, 26, 46, 63, 50, 62, 53, 56, 62, 21, 62, 47, 44, 52, 41, 48, 85, 80, 87, 82, 102, 93, 92, 74, 90, 75, 80, 73, 77, 80, 86, 87, 62, 34, 47, 55, 17, 58, 60, 47, 32, 61, 34, 47, 58, 39, 33, 32, 76, 70, 29, 27, 29, 27, 79, 73, 10, 9, 7, 2, 39, 2, 32, 20, 9, 11, 36, 15, 2, 27, 10, 30, 24, 14, 52, 31, 25, 10, 5, 24, 7, 10, 31, 2, 4, 5, 42, 47, 61, 46, 57, 63, 34, 56, 46, 57, 20, 37, 42, 38, 46, 82, 125, 104, 117, 106, 121, 60, 93, 120, 60, 107, 125, 111, 60, 125, 112, 110, 121, 125, 120, 101, 60, 110, 121, 123, 117, 111, 104, 121, 110, 121, 120, 60, 107, 117, 104, 116, 60, 125, 60, 74, 117, 121, 107, 50, 60, 93, 105, 104, 115, 60, 105, 114, 110, 121, 123, 117, 111, 104, 121, 110, 117, 114, 123, 60, 125, 114, 120, 60, 108, 110, 115, Byte.MAX_VALUE, 121, 121, 120, 117, 114, 123, 50, 51, 60, 41, 52, 43, 56, 126, 91, 118, 92, 80, 81, 105, 86, 90, 72, 31, 86, 76, 31, 82, 86, 76, 76, 86, 81, 88, 17, 105, 78, 84, 69, 82, 78, 65, 76, 0, 69, 82, 82, 79, 82, 14, 42, 113, 86, 94, 91, 82, 83, 23, 67, 88, 23, 91, 88, 86, 83, 23, 122, 82, 83, 94, 86, 25, Byte.MAX_VALUE, 64, 76, 94, 9, 71, 70, 93, 9, 91, 76, 78, 64, 90, 93, 76, 91, 76, 77, 9, 94, 64, 93, 65, 9, 93, 65, 64, 90, 9, 103, 72, 93, 64, 95, 76, 104, 77, 54, 59, 48, 45, 116, 76, 74, 77, 25, 73, 75, 86, 79, 80, 93, 92, 25, 88, 25, 111, 80, 92, 78, 39, 120, 34, 113, 117, 36, 120, 100, 104, 98, 106, 103, 84, 104, 100, 101, Byte.MAX_VALUE, 110, 115, Byte.MAX_VALUE, 103, 118, 111, 19, 16, 15, 14, 19, 15, 18, 5, 4, 63, 20, 18, 1, 14, 19, 12, 1, 20, 9, 15, 14, 23, 66, 19, 16, 66, 64, 65, 21, 99, 102, 34, 111, 103, 102, 107, 99, 34, 118, 123, 114, 103, 34, 107, 113, 34, 108, 109, 118, 34, 113, 119, 114, 114, 109, 112, 118, 103, 102, 44, 45, 44, 58, 61, 59, 38, 48, 43, 123, 47, 39, 47, 45, 123, 125, 70, 19, 72, 66, 68, 72, 18, 16, 118, 115, 72, 99, 101, 118, 121, 100, 123, 118, 99, 126, 120, 121, 7, 5, 24, 26, 24, 3, 18, 19, 40, 3, 5, 22, 25, 4, 27, 22, 3, 30, 24, 25, 50, 49, 63, 58, 31, 58, 118, 119, 126, 61, 63, 50, 50, 59, 58, 126, 51, 49, 44, 59, 126, 42, 54, 63, 48, 126, 49, 48, 61, 59, 64, 103, Byte.MAX_VALUE, 104, 101, 96, 109, 41, 122, 108, 125, 41, 102, 111, 41, 106, 101, 96, 106, 98, 104, 107, 101, 108, 41, Byte.MAX_VALUE, 96, 108, 126, 122, 8, 80, 9, 7, 9, 6, 2, 76, 115, Byte.MAX_VALUE, 109, 58, 123, 118, 104, Byte.MAX_VALUE, 123, 126, 99, 58, 104, Byte.MAX_VALUE, 125, 115, 105, 110, Byte.MAX_VALUE, 104, Byte.MAX_VALUE, 126, 58, 109, 115, 110, 114, 58, 123, 58, 84, 123, 110, 115, 108, Byte.MAX_VALUE, 91, 126, 52, 58, 91, 111, 110, 117, 58, 111, 116, 104, Byte.MAX_VALUE, 125, 115, 105, 110, Byte.MAX_VALUE, 104, 115, 116, 125, 58, 123, 116, 126, 58, 106, 104, 117, 121, Byte.MAX_VALUE, Byte.MAX_VALUE, 126, 115, 116, 125, 52, 75, 100, 113, 108, 115, 96, 37, 100, 97, 37, 105, 106, 100, 97, 37, 119, 96, 116, 112, 96, 118, 113, 96, 97};
    }

    static {
        A0X();
        A0i = C1141cR.class.getSimpleName();
        A0j = new WeakHashMap<>();
    }

    public C1141cR(Context context, String str, InterfaceC0579Jr interfaceC0579Jr, boolean z) {
        this.A0d = UUID.randomUUID().toString();
        this.A0I = KB.A06;
        this.A0Q = new WeakReference<>(null);
        this.A0e = new ArrayList();
        this.A0b = new C0628Lr();
        this.A0V = false;
        this.A0U = false;
        this.A0D = EnumC0575Jn.A04;
        this.A07 = AnonymousClass10.A03;
        this.A00 = -1L;
        if (!z) {
            this.A0Y = AnonymousClass53.A04(context);
        } else {
            this.A0Y = AnonymousClass53.A02(context);
        }
        this.A0Y.A0C(this);
        this.A0c = str;
        this.A0Z = interfaceC0579Jr;
        C7C c7c = A0g;
        if (c7c != null) {
            this.A0X = c7c;
        } else {
            this.A0X = new C7C(this.A0Y);
        }
        this.A04 = new View(context);
        this.A0a = new K2(this.A0Y, this);
    }

    public C1141cR(XI xi, C0770Rf c0770Rf, @Nullable C03198t c03198t, InterfaceC0579Jr interfaceC0579Jr) {
        this((Context) xi, (String) null, interfaceC0579Jr, true);
        this.A0W = c0770Rf;
        this.A0C = c03198t;
        this.A0f = true;
        this.A04 = new View(xi);
    }

    public C1141cR(XI xi, C0770Rf c0770Rf, @Nullable C03198t c03198t, InterfaceC0579Jr interfaceC0579Jr, @Nullable SG sg) {
        this(xi, c0770Rf, c03198t, interfaceC0579Jr);
        this.A0A = sg;
    }

    public C1141cR(C1141cR c1141cR) {
        this((Context) c1141cR.A0Y, (String) null, c1141cR.A0Z, true);
        this.A0C = c1141cR.A0C;
        this.A0W = c1141cR.A0W;
        this.A0A = c1141cR.A0A;
        this.A0f = true;
        this.A04 = new View(this.A0Y);
    }

    private int A00() {
        C1141cR c1141cR = this;
        FP fp = null;
        int iA04 = 1;
        C03198t c03198t = c1141cR.A0C;
        char c2 = c03198t != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c03198t = c03198t;
                    iA04 = c03198t.A04();
                    c2 = 3;
                    break;
                case 3:
                    return iA04;
                case 4:
                    c1141cR = c1141cR;
                    fp = c1141cR.A09;
                    if (fp == null) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    fp = fp;
                    if (fp.A0F() == null) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c1141cR = c1141cR;
                    iA04 = c1141cR.A09.A0F().A04();
                    c2 = 3;
                    break;
            }
        }
    }

    private int A01() {
        C1141cR c1141cR = this;
        FP fp = null;
        C0770Rf c0770Rf = null;
        C03198t c03198t = c1141cR.A0C;
        char c2 = c03198t != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return c03198t.A07();
                case 3:
                    c1141cR = c1141cR;
                    c0770Rf = c1141cR.A0W;
                    if (c0770Rf == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return c0770Rf.A0F();
                case 5:
                    c1141cR = c1141cR;
                    fp = c1141cR.A09;
                    if (fp == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    fp = fp;
                    if (fp.A0F() == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return c1141cR.A09.A0F().A07();
                case '\b':
                    return 0;
            }
        }
    }

    private int A02() {
        C1141cR c1141cR = this;
        FP fp = null;
        C0770Rf c0770Rf = null;
        C03198t c03198t = c1141cR.A0C;
        char c2 = c03198t != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return c03198t.A08();
                case 3:
                    c1141cR = c1141cR;
                    c0770Rf = c1141cR.A0W;
                    if (c0770Rf == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return c0770Rf.A0G();
                case 5:
                    c1141cR = c1141cR;
                    fp = c1141cR.A09;
                    if (fp == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    fp = fp;
                    if (fp.A0F() == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return c1141cR.A09.A0F().A08();
                case '\b':
                    return AdError.NETWORK_ERROR_CODE;
            }
        }
    }

    private int A03() {
        C1141cR c1141cR = this;
        FP fp = null;
        int iA09 = 0;
        C03198t c03198t = c1141cR.A0C;
        char c2 = c03198t != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c03198t = c03198t;
                    iA09 = c03198t.A09();
                    c2 = 3;
                    break;
                case 3:
                    return iA09;
                case 4:
                    c1141cR = c1141cR;
                    fp = c1141cR.A09;
                    if (fp == null) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    fp = fp;
                    if (fp.A0F() == null) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c1141cR = c1141cR;
                    iA09 = c1141cR.A09.A0F().A09();
                    c2 = 3;
                    break;
            }
        }
    }

    public static Drawable A05(XI xi, Bitmap bitmap, boolean z, @Nullable String str) {
        BitmapDrawable bitmapDrawableA00 = null;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(xi.getResources(), bitmap);
        char c2 = z ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    xi = xi;
                    str = str;
                    bitmapDrawableA00 = C0702Oo.A00(xi, str);
                    if (bitmapDrawableA00 == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawableA00});
                case 4:
                    return bitmapDrawable;
            }
        }
    }

    public static NativeAdBase A0A(Context context, String str, String str2) throws K6 {
        KB kbA00 = KG.A00(str2);
        char c2 = kbA00 != null ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    kbA00 = kbA00;
                    if (kbA00 != KB.A05) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return new NativeBannerAd(context, str);
                case 4:
                    kbA00 = kbA00;
                    if (kbA00 != KB.A06) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return new NativeAd(context, str);
                case 6:
                    throw new K6(AdErrorType.BID_PAYLOAD_ERROR, String.format(Locale.US, A0S(81, 34, 90), kbA00));
                case 7:
                    throw new K6(AdErrorType.BID_PAYLOAD_ERROR, String.format(Locale.US, A0S(k.AppCompatTheme_windowActionBar, 50, 74), str2));
            }
        }
    }

    @Nullable
    private final C0770Rf A0C() {
        C0770Rf c0770Rf = this.A0W;
        char c2 = c0770Rf != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0770Rf = c0770Rf;
                    if (!c0770Rf.A0f()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return c0770Rf;
                case 4:
                    return (C0770Rf) null;
            }
        }
    }

    public static InterfaceC0579Jr A0I() {
        return new C1138cO();
    }

    public static C1141cR A0J(NativeAdBaseApi nativeAdBaseApi) {
        if (nativeAdBaseApi instanceof Proxy) {
            return (C1141cR) ((C02154i) Proxy.getInvocationHandler(nativeAdBaseApi)).A04();
        }
        return (C1141cR) nativeAdBaseApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    /* renamed from: A0L, reason: merged with bridge method [inline-methods] */
    public final C0581Jt getAdStarRating() {
        if (!isAdLoaded()) {
            return null;
        }
        return this.A0W.A0K();
    }

    private AdPlacementType A0O() {
        AdPlacementType adPlacementType = null;
        char c2 = this.A0I == KB.A06 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    adPlacementType = AdPlacementType.NATIVE;
                    c2 = 3;
                    break;
                case 3:
                    return adPlacementType;
                case 4:
                    adPlacementType = AdPlacementType.NATIVE_BANNER;
                    c2 = 3;
                    break;
            }
        }
    }

    private void A0V() {
        Iterator<View> it = this.A0e.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    it = it;
                    View next = it.next();
                    next.setOnClickListener(null);
                    next.setOnTouchListener(null);
                    next.setOnLongClickListener(null);
                    c2 = 2;
                    break;
                case 4:
                    this.A0e.clear();
                    return;
            }
        }
    }

    private void A0W() {
        if (!TextUtils.isEmpty(getAdChoicesLinkUrl())) {
            LG.A08(new LG(), this.A0Y, Uri.parse(getAdChoicesLinkUrl()), A14());
        }
    }

    public static void A0Y(@Nullable Drawable drawable, ImageView imageView) {
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        char c2 = drawable != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    drawable = drawable;
                    imageView = imageView;
                    imageView.setImageDrawable(drawable);
                    c2 = 3;
                    break;
                case 3:
                    if (Build.VERSION.SDK_INT < 16) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    imageView = imageView;
                    imageView.setBackground(null);
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    imageView = imageView;
                    imageView.setBackgroundDrawable(null);
                    c2 = 5;
                    break;
            }
        }
    }

    private void A0Z(View view) {
        C1141cR c1141cR = this;
        c1141cR.A0e.add(view);
        view.setOnClickListener(c1141cR.A0E);
        view.setOnTouchListener(c1141cR.A0E);
        char c2 = Build.VERSION.SDK_INT >= 18 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    view = view;
                    if (!JQ.A0m(view.getContext())) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c1141cR = c1141cR;
                    view = view;
                    view.setOnLongClickListener(c1141cR.A0E);
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    private void A0a(View view, View view2, List<View> list, boolean z) {
        InterfaceC1142cS interfaceC1142cS;
        View adContentsView = view2;
        if (!A0m()) {
            this.A0Y.A0A().ACI();
        }
        if (view == null) {
            String strA0S = A0S(454, 19, 16);
            if (!A0m()) {
                this.A0Y.A0A().ACH(strA0S);
            }
            throw new IllegalArgumentException(strA0S);
        }
        if (list == null || list.size() == 0) {
            String strA0S2 = A0S(643, 30, 32);
            if (!A0m()) {
                this.A0Y.A0A().ACH(strA0S2);
            }
            throw new IllegalArgumentException(strA0S2);
        }
        C0770Rf c0770RfA0C = A0C();
        if (c0770RfA0C == null) {
            String strA0S3 = A0S(54, 13, 81);
            if (!A0m()) {
                this.A0Y.A0A().ACH(strA0S3);
            }
            Log.e(A0i, strA0S3);
            K5 k5 = new K5(AdErrorType.NATIVE_AD_IS_NOT_LOADED, strA0S3);
            A0w().A0A().A2c(C0627Lq.A01(this.A00), k5.A04().getErrorCode(), k5.A05());
            if (JQ.A1W(this.A0Y) && (interfaceC1142cS = this.A0F) != null) {
                interfaceC1142cS.A9Y(k5);
                return;
            }
            return;
        }
        String str = this.A0P;
        if ((view instanceof FrameLayout) && str != null) {
            A0b((FrameLayout) view, str);
        }
        NativeAdLayout nativeAdLayout = this.A06;
        if (nativeAdLayout != null) {
            ((C0821Th) nativeAdLayout.getNativeAdLayoutApi()).A02();
        }
        TL tl = this.A0Q.get();
        if (tl != null && c0770RfA0C.A0A() == 1) {
            tl.A03(M6.AN_INFO_ICON);
        }
        if (adContentsView == null) {
            if (this.A0I == KB.A06) {
                AdErrorType adErrorType = AdErrorType.NO_MEDIAVIEW_IN_NATIVEAD;
                String strA0S4 = A0S(6, 21, 127);
                K5 k52 = new K5(adErrorType, strA0S4);
                A0w().A0A().A2c(C0627Lq.A01(this.A00), k52.A04().getErrorCode(), k52.A05());
                InterfaceC1142cS interfaceC1142cS2 = this.A0F;
                if (interfaceC1142cS2 != null) {
                    interfaceC1142cS2.A9Y(k52);
                }
                if (AdInternalSettings.isDebugBuild()) {
                    Log.e(A0i, strA0S4);
                    return;
                }
                return;
            }
            AdErrorType adErrorType2 = AdErrorType.NO_ICONVIEW_IN_NATIVEBANNERAD;
            String strA0S5 = A0S(353, 22, 22);
            K5 k53 = new K5(adErrorType2, strA0S5);
            A0w().A0A().A2c(C0627Lq.A01(this.A00), k53.A04().getErrorCode(), k53.A05());
            InterfaceC1142cS interfaceC1142cS3 = this.A0F;
            if (interfaceC1142cS3 != null) {
                interfaceC1142cS3.A9Y(k53);
            }
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            Log.e(A0i, strA0S5);
            return;
        }
        boolean z2 = false;
        boolean z3 = (adContentsView instanceof AdNativeComponentView) && ((AdNativeComponentView) adContentsView).getAdContentsView() != null;
        if (z && (adContentsView instanceof ImageView)) {
            z2 = true;
        }
        if (!z3 && !z2) {
            if (this.A0F != null) {
                K5 k54 = new K5(AdErrorType.UNSUPPORTED_AD_ASSET_NATIVEAD, A0S(525, 31, 43));
                A0w().A0A().A2c(C0627Lq.A01(this.A00), k54.A04().getErrorCode(), k54.A05());
                this.A0F.A9Y(k54);
                return;
            }
            return;
        }
        if (this.A03 != null) {
            Log.w(A0i, A0S(267, 80, 53));
            unregisterView();
        }
        boolean nativeAdBannerViewIsImageView = A0j.containsKey(view);
        if (nativeAdBannerViewIsImageView && A0j.get(view).get() != null) {
            Log.w(A0i, A0S(680, 75, 51));
            A0j.get(view).get().unregisterView();
        }
        this.A0E = new ViewOnClickListenerC1139cP(this, this.A0Y, null);
        this.A03 = view;
        this.A05 = adContentsView;
        boolean nativeAdBannerViewIsImageView2 = view instanceof ViewGroup;
        if (nativeAdBannerViewIsImageView2) {
            this.A0J = new C0656Mu(this.A0Y, new C1136cM(this));
            ((ViewGroup) view).addView(this.A0J);
        }
        ArrayList arrayList = new ArrayList(list);
        View view3 = this.A04;
        if (view3 != null) {
            arrayList.add(view3);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A0Z((View) it.next());
        }
        int iA00 = A00();
        this.A0M = new C1137cN(this, adContentsView, z2, c0770RfA0C);
        if (adContentsView instanceof AdNativeComponentView) {
            adContentsView = ((AdNativeComponentView) adContentsView).getAdContentsView();
        }
        this.A0N = new Q1(adContentsView, iA00, A03(), true, new WeakReference(this.A0M), this.A0Y);
        this.A0N.A0Z(true ^ A0m());
        this.A0N.A0X(A01());
        this.A0N.A0Y(A02());
        this.A08 = new C0781Rq(this.A0Y, new C1140cQ(this, null), this.A0N, this.A0W);
        this.A08.A0D(arrayList);
        A0j.put(view, new WeakReference<>(this));
        if (Build.VERSION.SDK_INT >= 18 && JQ.A0m(this.A0Y)) {
            this.A0K = new C0674Nm();
            this.A0K.A0C(this.A0c);
            this.A0K.A0B(this.A0Y.getPackageName());
            this.A0K.A0A(this.A0N);
            if (this.A0W.A0B() > 0) {
                this.A0K.A08(this.A0W.A0B(), this.A0W.A0C());
            }
            C03198t c03198t = this.A0C;
            if (c03198t != null) {
                this.A0K.A09(c03198t.A0C());
            } else {
                FP fp = this.A09;
                if (fp != null && fp.A0F() != null) {
                    this.A0K.A09(this.A09.A0F().A0C());
                }
            }
            View adContentsView2 = this.A03;
            adContentsView2.getOverlay().add(this.A0K);
        }
    }

    private void A0b(FrameLayout frameLayout, String str) {
        C1141cR c1141cR = this;
        C0703Op c0703Op = null;
        C0703Op c0703Op2 = c1141cR.A0L;
        char c2 = c0703Op2 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    frameLayout = frameLayout;
                    c0703Op2 = c0703Op2;
                    frameLayout.removeView(c0703Op2);
                    c2 = 3;
                    break;
                case 3:
                    c1141cR = c1141cR;
                    str = str;
                    c1141cR.A0L = C0702Oo.A01(AnonymousClass53.A02(c1141cR.A0Y), str);
                    c0703Op = c1141cR.A0L;
                    if (c0703Op == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1141cR = c1141cR;
                    frameLayout = frameLayout;
                    c0703Op = c0703Op;
                    frameLayout.addView(c0703Op, new FrameLayout.LayoutParams(-1, -1));
                    frameLayout.bringChildToFront(c1141cR.A0L);
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0c(@Nullable C0770Rf c0770Rf, boolean z) {
        if (c0770Rf == null) {
            return;
        }
        if (this.A0D.equals(EnumC0575Jn.A04)) {
            String strA5k = c0770Rf.A5k();
            if (!TextUtils.isEmpty(strA5k)) {
                this.A0X.A0W(new C0565Jd(strA5k, this.A0Y.A06()));
            }
            if (c0770Rf.A0J() != null) {
                AnonymousClass79 anonymousClass79 = new AnonymousClass79(c0770Rf.A0J().getUrl(), c0770Rf.A0J().getHeight(), c0770Rf.A0J().getWidth(), c0770Rf.A0Q(), A0S(347, 6, k.AppCompatTheme_windowActionBarOverlay));
                anonymousClass79.A00 = this.A0B;
                this.A0X.A0O();
                this.A0X.A0Q(anonymousClass79);
            }
            if (!this.A0I.equals(KB.A05)) {
                if (c0770Rf.A0I() != null) {
                    this.A0X.A0Q(new AnonymousClass79(c0770Rf.A0I().getUrl(), c0770Rf.A0I().getHeight(), c0770Rf.A0I().getWidth(), c0770Rf.A0Q(), A0S(347, 6, k.AppCompatTheme_windowActionBarOverlay)));
                }
                if (c0770Rf.A0U() != null) {
                    for (C1141cR c1141cR : c0770Rf.A0U()) {
                        if (c1141cR.getAdCoverImage() != null) {
                            this.A0X.A0Q(new AnonymousClass79(c1141cR.getAdCoverImage().getUrl(), c1141cR.getAdCoverImage().getHeight(), c1141cR.getAdCoverImage().getWidth(), c0770Rf.A0Q(), A0S(347, 6, k.AppCompatTheme_windowActionBarOverlay)));
                        }
                    }
                }
                String strA0S = c0770Rf.A0S();
                if (!TextUtils.isEmpty(strA0S)) {
                    this.A0X.A0V(new C7B(strA0S, c0770Rf.A0Q(), A0S(347, 6, k.AppCompatTheme_windowActionBarOverlay), c0770Rf.A0M().longValue()));
                }
            }
        }
        this.A0X.A0P(new C1135cL(this, c0770Rf, z), new AnonymousClass75(c0770Rf.A0Q(), A0S(347, 6, k.AppCompatTheme_windowActionBarOverlay)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0d(AnonymousClass12 anonymousClass12) {
        C0770Rf c0770Rf = this.A0W;
        if (c0770Rf == null) {
            return;
        }
        c0770Rf.A0W(anonymousClass12);
    }

    public static void A0e(NativeAdImageApi nativeAdImageApi, ImageView imageView, XI xi) {
        char c2 = nativeAdImageApi != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    imageView = imageView;
                    if (imageView == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    nativeAdImageApi = nativeAdImageApi;
                    imageView = imageView;
                    xi = xi;
                    new AsyncTaskC1002aA(imageView, xi).A05(nativeAdImageApi.getHeight(), nativeAdImageApi.getWidth()).A07(nativeAdImageApi.getUrl());
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    private final void A0f(EnumC0575Jn enumC0575Jn, @Nullable String str) {
        A1M(enumC0575Jn, str, new C7H(false, -1, -1));
    }

    private final void A0i(InterfaceC1142cS interfaceC1142cS) {
        this.A0F = interfaceC1142cS;
    }

    private final void A0j(String str) {
        this.A0O = str;
    }

    private void A0k(List<View> list, View view) {
        C1141cR c1141cR = this;
        int i = 0;
        ViewGroup viewGroup = null;
        InterfaceC0579Jr interfaceC0579Jr = c1141cR.A0Z;
        char c2 = interfaceC0579Jr != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    view = view;
                    interfaceC0579Jr = interfaceC0579Jr;
                    if (!interfaceC0579Jr.ADF(view)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    view = view;
                    if (!(view instanceof ViewGroup)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    view = view;
                    viewGroup = (ViewGroup) view;
                    i = 0;
                    c2 = 6;
                    break;
                case 6:
                    viewGroup = viewGroup;
                    if (i >= viewGroup.getChildCount()) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c1141cR = c1141cR;
                    list = list;
                    viewGroup = viewGroup;
                    c1141cR.A0k(list, viewGroup.getChildAt(i));
                    i++;
                    c2 = 6;
                    break;
                case '\b':
                    list = list;
                    view = view;
                    list.add(view);
                    c2 = '\t';
                    break;
                case '\t':
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0l() {
        C1141cR c1141cR = this;
        boolean z = false;
        char c2 = c1141cR.A13() != EnumC0585Jx.A04 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c1141cR = c1141cR;
                    if (c1141cR.A13() != EnumC0585Jx.A02) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
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

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0m() {
        boolean z = false;
        C0770Rf c0770Rf = this.A0W;
        char c2 = c0770Rf != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0770Rf = c0770Rf;
                    if (!c0770Rf.A0g()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
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

    public final long A0t() {
        return this.A00;
    }

    @Nullable
    public final C0770Rf A0u() {
        return this.A0W;
    }

    public final C7C A0v() {
        return this.A0X;
    }

    public final XI A0w() {
        return this.A0Y;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    /* renamed from: A0x, reason: merged with bridge method [inline-methods] */
    public final C0580Js getAdChoicesIcon() {
        if (!isAdLoaded()) {
            return null;
        }
        return this.A0W.A0H();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    /* renamed from: A0y, reason: merged with bridge method [inline-methods] */
    public final C0580Js getAdCoverImage() {
        if (!isAdLoaded()) {
            return null;
        }
        return this.A0W.A0I();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    /* renamed from: A0z, reason: merged with bridge method [inline-methods] */
    public final C0580Js getAdIcon() {
        if (!isAdLoaded()) {
            return null;
        }
        return this.A0W.A0J();
    }

    @Nullable
    public final InterfaceC1142cS A10() {
        return this.A0F;
    }

    public final C0582Ju A11() {
        return this.A0G;
    }

    public final EnumC0583Jv A12() {
        return this.A0H;
    }

    public final EnumC0585Jx A13() {
        if (!isAdLoaded()) {
            return EnumC0585Jx.A02;
        }
        return this.A0W.A0L();
    }

    @Nullable
    public final String A14() {
        if (!isAdLoaded()) {
            return null;
        }
        return this.A0W.A5k();
    }

    @Nullable
    public final String A15() {
        return this.A0P;
    }

    @Nullable
    public final String A16() {
        return A1A(A0S(235, 17, 66));
    }

    @Nullable
    public final String A17() {
        return A1A(A0S(198, 16, 103));
    }

    @Nullable
    public final String A18() {
        if (!isAdLoaded()) {
            return null;
        }
        return this.A0W.A0R();
    }

    @Nullable
    public final String A19() {
        C1141cR c1141cR = this;
        char c2 = c1141cR.isAdLoaded() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c1141cR = c1141cR;
                    if (!TextUtils.isEmpty(c1141cR.A0W.A0S())) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return (String) null;
                case 4:
                    C1141cR c1141cR2 = c1141cR;
                    return c1141cR2.A0X.A0L(c1141cR2.A0W.A0S());
            }
        }
    }

    @Nullable
    public final String A1A(String str) {
        if (!isAdLoaded()) {
            return null;
        }
        return this.A0W.A0T(str);
    }

    @Nullable
    public final List<C1141cR> A1B() {
        if (!isAdLoaded()) {
            return null;
        }
        return this.A0W.A0U();
    }

    public final void A1C() {
        C1141cR c1141cR = this;
        N0 n0A01 = null;
        char c2 = !AnonymousClass24.A0P(c1141cR.A0Y.A00(), false) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c1141cR.A0W();
                    return;
                case 3:
                    c1141cR = c1141cR;
                    XI xi = c1141cR.A0Y;
                    n0A01 = N1.A01(xi, xi.A06(), c1141cR.A14(), c1141cR.A06);
                    if (n0A01 != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1141cR.A0W();
                    return;
                case 5:
                    N0 n0 = n0A01;
                    ((C0821Th) c1141cR.A06.getNativeAdLayoutApi()).A03(n0);
                    n0.A0J();
                    return;
            }
        }
    }

    public final void A1D(@Nullable Drawable drawable) {
        boolean z = false;
        this.A01 = drawable;
        char c2 = drawable != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    A1T(z, true);
                    return;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A1E(View view, ImageView imageView) {
        ArrayList arrayList = new ArrayList();
        A0k(arrayList, view);
        A0a(view, imageView, arrayList, true);
    }

    public final void A1F(View view, ImageView imageView, List<View> list) {
        A0a(view, imageView, list, true);
    }

    public final void A1G(View view, AdNativeComponentView adNativeComponentView) {
        ArrayList arrayList = new ArrayList();
        A0k(arrayList, view);
        A0a(view, adNativeComponentView, arrayList, false);
    }

    public final void A1H(View view, AdNativeComponentView adNativeComponentView, List<View> list) {
        A0a(view, adNativeComponentView, list, false);
    }

    public final void A1I(MediaView mediaView) {
        if (mediaView != null) {
            this.A0U = true;
        }
    }

    public final void A1J(MediaView mediaView) {
        if (mediaView != null) {
            this.A0V = true;
        }
    }

    public final void A1K(@Nullable NativeAdLayout nativeAdLayout) {
        this.A06 = nativeAdLayout;
    }

    public final void A1L(@Nullable TL tl) {
        this.A0Q = new WeakReference<>(tl);
    }

    public final void A1M(EnumC0575Jn enumC0575Jn, @Nullable String str, C7H c7h) {
        this.A00 = System.currentTimeMillis();
        if (this.A0f) {
            AdSettings.IntegrationErrorMode integrationErrorModeA00 = C01431m.A00(this.A0Y);
            String strA0S = A0S(613, 30, k.AppCompatTheme_windowFixedHeightMinor);
            if (!AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CRASH_DEBUG_MODE.equals(integrationErrorModeA00)) {
                K5 k5 = new K5(AdErrorType.LOAD_AD_CALLED_MORE_THAN_ONCE, A0S(613, 30, k.AppCompatTheme_windowFixedHeightMinor));
                A0w().A0A().A2c(C0627Lq.A01(this.A00), k5.A04().getErrorCode(), k5.A05());
                InterfaceC1142cS interfaceC1142cS = this.A0F;
                if (interfaceC1142cS != null) {
                    interfaceC1142cS.A9Y(k5);
                } else {
                    Log.e(A0S(165, 17, k.AppCompatTheme_viewInflaterClass), strA0S);
                }
                C03018b c03018b = new C03018b(strA0S);
                A0w().A04().A83(A0S(493, 3, 47), C03008a.A0R, c03018b);
            } else {
                throw new C01481r(strA0S);
            }
        }
        this.A0f = true;
        this.A0D = enumC0575Jn;
        if (enumC0575Jn.equals(EnumC0575Jn.A05)) {
            this.A07 = AnonymousClass10.A05;
        }
        this.A0B = c7h;
        C01421l c01421l = new C01421l(this.A0c, this.A0I, A0O(), null, 1);
        c01421l.A04(enumC0575Jn);
        c01421l.A05(this.A0O);
        c01421l.A06(this.A0P);
        this.A09 = new FP(this.A0Y, c01421l);
        this.A09.A0P(new C1134cK(this));
        this.A09.A0R(str);
    }

    public final void A1N(C0582Ju c0582Ju) {
        this.A0G = c0582Ju;
    }

    public final void A1O(EnumC0583Jv enumC0583Jv) {
        this.A0H = enumC0583Jv;
    }

    public final void A1P(KB kb) {
        C1141cR c1141cR = this;
        char c2 = !c1141cR.A0m() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    kb = kb;
                    if (!KB.A05.equals(kb)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c1141cR = c1141cR;
                    c1141cR.A0Y.A0A().A2i(AdPlacementType.NATIVE_BANNER.toString());
                    c2 = 4;
                    break;
                case 4:
                    c1141cR.A0I = kb;
                    return;
                case 5:
                    c1141cR = c1141cR;
                    c1141cR.A0Y.A0A().A2i(AdPlacementType.NATIVE.toString());
                    c2 = 4;
                    break;
            }
        }
    }

    public final void A1Q(Q0 q0) {
        this.A0R = new WeakReference<>(q0);
    }

    public final void A1R(boolean z) {
        this.A0S = z;
    }

    public final void A1S(boolean z) {
        this.A0T = z;
    }

    public final void A1T(boolean z, boolean z2) {
        C1141cR c1141cR = this;
        String strA0S = null;
        C0770Rf c0770RfA0u = null;
        Q1 q1 = null;
        InterfaceC1142cS interfaceC1142cS = null;
        char c2 = z ? (char) 2 : '\t';
        while (true) {
            switch (c2) {
                case 2:
                    c1141cR = c1141cR;
                    if (!c1141cR.A0D.equals(EnumC0575Jn.A05)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c1141cR = c1141cR;
                    if (!c1141cR.A0m()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 4:
                    c1141cR = c1141cR;
                    interfaceC1142cS = c1141cR.A0F;
                    if (interfaceC1142cS == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    interfaceC1142cS = interfaceC1142cS;
                    interfaceC1142cS.AAE();
                    c2 = 6;
                    break;
                case 6:
                    c1141cR = c1141cR;
                    q1 = c1141cR.A0N;
                    if (q1 == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c1141cR = c1141cR;
                    q1 = q1;
                    q1.A0V();
                    c1141cR.A0a.A0A();
                    c2 = '\b';
                    break;
                case '\b':
                    return;
                case '\t':
                    c1141cR = c1141cR;
                    if (c1141cR.A0N == null) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c1141cR = c1141cR;
                    c0770RfA0u = c1141cR.A0u();
                    if (c0770RfA0u == null) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c0770RfA0u = c0770RfA0u;
                    strA0S = c0770RfA0u.A0Q();
                    c2 = '\f';
                    break;
                case '\f':
                    c1141cR = c1141cR;
                    strA0S = strA0S;
                    c1141cR.A0a.A0D(c1141cR.A0Y, strA0S);
                    c1141cR.A0N.A0W();
                    c2 = '\r';
                    break;
                case '\r':
                    c1141cR = c1141cR;
                    if (c1141cR.A0F == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    if (!z2) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    c1141cR = c1141cR;
                    K5 k5A02 = K5.A02(AdErrorType.BROKEN_MEDIA_ERROR, A0S(391, 21, 30));
                    c1141cR.A0w().A0A().A2c(C0627Lq.A01(c1141cR.A00), k5A02.A04().getErrorCode(), k5A02.A05());
                    c1141cR.A0F.A9Y(k5A02);
                    c2 = '\b';
                    break;
                case 16:
                    strA0S = A0S(214, 0, 27);
                    c2 = '\f';
                    break;
            }
        }
    }

    public final boolean A1U() {
        boolean z = false;
        char c2 = this.A06 == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.K0
    public final int A5t() {
        View videoView = null;
        View view = this.A05;
        char c2 = view instanceof AdNativeComponentView ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    view = view;
                    videoView = ((AdNativeComponentView) view).getAdContentsView();
                    if (!(videoView instanceof PA)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return ((PA) videoView).getCurrentPosition();
                case 4:
                    return -1;
            }
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final NativeAdBase.NativeAdLoadConfigBuilder buildLoadAdConfig(NativeAdBase nativeAdBase) {
        return new C0586Jy(this, nativeAdBase);
    }

    @Override // com.facebook.ads.Ad
    public final void destroy() {
        C1141cR c1141cR = this;
        FP fp = null;
        KJ.A05(A0S(556, 7, 96), A0S(27, 19, 56), A0S(473, 6, 104));
        char c2 = !c1141cR.A0m() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c1141cR = c1141cR;
                    c1141cR.A0Y.A0A().A2j();
                    c2 = 3;
                    break;
                case 3:
                    c1141cR = c1141cR;
                    fp = c1141cR.A09;
                    if (fp == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1141cR = c1141cR;
                    fp = fp;
                    fp.A0U(true);
                    c1141cR.A09 = null;
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void downloadMedia() {
        if (this.A0D.equals(EnumC0575Jn.A05)) {
            this.A07 = AnonymousClass10.A04;
        }
        this.A0D = EnumC0575Jn.A04;
        A0c(this.A0W, false);
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdBodyText() {
        if (!isAdLoaded()) {
            return null;
        }
        return this.A0W.A0N();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdCallToAction() {
        return A1A(A0S(67, 14, 42));
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdChoicesImageUrl() {
        C1141cR c1141cR = this;
        String url = null;
        char c2 = c1141cR.getAdChoicesIcon() == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    url = null;
                    c2 = 3;
                    break;
                case 3:
                    return url;
                case 4:
                    c1141cR = c1141cR;
                    url = c1141cR.getAdChoicesIcon().getUrl();
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdChoicesLinkUrl() {
        if (!isAdLoaded()) {
            return null;
        }
        return this.A0W.A0O();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdChoicesText() {
        if (!isAdLoaded()) {
            return null;
        }
        return this.A0W.A0P();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdHeadline() {
        return A1A(A0S(46, 8, 77));
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdLinkDescription() {
        return A1A(A0S(182, 16, 16));
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdSocialContext() {
        return A1A(A0S(479, 14, 34));
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdTranslation() {
        return A1A(A0S(579, 14, 62));
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdUntrimmedBodyText() {
        return A1A(A0S(450, 4, 125));
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdvertiserName() {
        return A1A(A0S(252, 15, 98));
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final float getAspectRatio() {
        int width = 0;
        int width2 = 0;
        C0770Rf c0770Rf = this.A0W;
        float f = 0.0f;
        int height = c0770Rf != null ? 2 : 5;
        while (true) {
            switch (height) {
                case 2:
                    c0770Rf = c0770Rf;
                    C0580Js c0580JsA0I = c0770Rf.A0I();
                    width2 = c0580JsA0I.getWidth();
                    width = c0580JsA0I.getHeight();
                    if (width <= 0) {
                        height = 4;
                        break;
                    } else {
                        height = 3;
                        break;
                    }
                case 3:
                    f = width2 / width;
                    height = 4;
                    break;
                case 4:
                    return f;
                case 5:
                    return 0.0f;
            }
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getId() {
        if (!isAdLoaded()) {
            return null;
        }
        return this.A0d;
    }

    @Override // com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A0c;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final Drawable getPreloadedIconViewDrawable() {
        C1141cR c1141cR = this;
        Bitmap preloadedBitmap = null;
        C0580Js c0580JsA0J = null;
        C0770Rf c0770Rf = c1141cR.A0W;
        char c2 = c0770Rf != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0770Rf = c0770Rf;
                    c0580JsA0J = c0770Rf.A0J();
                    if (c0580JsA0J == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c1141cR = c1141cR;
                    c0580JsA0J = c0580JsA0J;
                    preloadedBitmap = c1141cR.A0X.A0H(c0580JsA0J.getUrl());
                    if (preloadedBitmap == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    C1141cR c1141cR2 = c1141cR;
                    return A05(c1141cR2.A0w(), preloadedBitmap, c1141cR2.A1U(), c1141cR2.A15());
                case 5:
                    return (Drawable) null;
            }
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getPromotedTranslation() {
        return A1A(A0S(593, 20, 94));
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getSponsoredTranslation() {
        return A1A(A0S(496, 21, 73));
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final boolean hasCallToAction() {
        boolean z = false;
        C0770Rf c0770Rf = this.A0W;
        char c2 = c0770Rf != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0770Rf = c0770Rf;
                    if (!c0770Rf.A0e()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
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

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        C1141cR c1141cR = this;
        SG sg = null;
        boolean zA0A = true;
        FP fp = c1141cR.A09;
        char c2 = fp != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    fp = fp;
                    zA0A = fp.A0V();
                    c2 = 3;
                    break;
                case 3:
                    c1141cR.A0Y.A0A().A4X(zA0A);
                    return zA0A;
                case 4:
                    c1141cR = c1141cR;
                    sg = c1141cR.A0A;
                    if (sg == null) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    sg = sg;
                    zA0A = sg.A0A();
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final boolean isAdLoaded() {
        boolean z = false;
        C0770Rf c0770Rf = this.A0W;
        char c2 = c0770Rf != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0770Rf = c0770Rf;
                    if (!c0770Rf.A0f()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
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

    @Override // com.facebook.ads.Ad
    public final void loadAd() {
        KJ.A05(A0S(0, 6, k.AppCompatTheme_windowActionBar), A0S(755, 24, 44), A0S(517, 8, 10));
        loadAd(NativeAdBase.MediaCacheFlag.ALL);
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void loadAd(NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        KJ.A05(A0S(0, 6, k.AppCompatTheme_windowActionBar), A0S(755, 24, 44), A0S(571, 8, 88));
        A0f(EnumC0575Jn.A00(mediaCacheFlag), null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void loadAd(NativeAdBase.NativeLoadAdConfig nativeLoadAdConfig) {
        KJ.A05(A0S(0, 6, k.AppCompatTheme_windowActionBar), A0S(755, 24, 44), A0S(214, 8, 87));
        ((C0586Jy) nativeLoadAdConfig).loadAd();
    }

    @Override // com.facebook.ads.Ad
    public final void loadAdFromBid(String str) {
        KJ.A05(A0S(222, 13, 79), A0S(755, 24, 44), A0S(673, 7, 24));
        loadAdFromBid(str, NativeAdBase.MediaCacheFlag.ALL);
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void loadAdFromBid(String str, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        KJ.A05(A0S(222, 13, 79), A0S(755, 24, 44), A0S(563, 8, 55));
        A0f(EnumC0575Jn.A00(mediaCacheFlag), str);
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void onCtaBroadcast() {
        this.A04.performClick();
    }

    @Override // com.facebook.ads.internal.api.Repairable
    public final void repair(Throwable th) {
        C1141cR c1141cR = this;
        InterfaceC1142cS interfaceC1142cS = null;
        String str = null;
        int i = 0;
        View view = c1141cR.A03;
        char c2 = view != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c1141cR = c1141cR;
                    view = view;
                    view.post(new C1132cI(c1141cR));
                    c2 = 3;
                    break;
                case 3:
                    c1141cR = c1141cR;
                    th = th;
                    i = AdError.INTERNAL_ERROR_CODE;
                    str = A0S(375, 16, 9) + C0618Lh.A03(c1141cR.A0Y, th);
                    c1141cR.A0w().A0A().A2c(C0627Lq.A01(c1141cR.A00), AdError.INTERNAL_ERROR_CODE, str);
                    interfaceC1142cS = c1141cR.A0F;
                    if (interfaceC1142cS == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    str = str;
                    interfaceC1142cS = interfaceC1142cS;
                    interfaceC1142cS.A9Y(new K5(i, str));
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void setAdListener(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase) {
        if (nativeAdListener == null) {
            return;
        }
        A0i(new C0368Ar(nativeAdListener, nativeAdBase));
    }

    @Override // com.facebook.ads.Ad
    public final void setExtraHints(ExtraHints extraHints) {
        if (extraHints == null) {
            return;
        }
        A0j(extraHints.getHints());
        this.A0P = extraHints.getMediationData();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.A02 = onTouchListener;
    }

    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, com.facebook.ads.redexgen.X.Mu, com.facebook.ads.redexgen.X.Q1, com.facebook.ads.redexgen.X.Rq] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void unregisterView() {
        C1141cR c1141cR = this;
        C0770Rf c0770Rf = null;
        C0656Mu c0656Mu = null;
        Q1 q1 = null;
        ViewParent parent = null;
        View view = null;
        C0703Op c0703Op = c1141cR.A0L;
        ?? r2 = 0;
        char c2 = c0703Op != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0703Op = c0703Op;
                    parent = c0703Op.getParent();
                    if (!(parent instanceof ViewGroup)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0703Op = c0703Op;
                    parent = parent;
                    ((ViewGroup) parent).removeView(c0703Op);
                    c2 = 4;
                    break;
                case 4:
                    c1141cR = c1141cR;
                    r2 = 0;
                    c1141cR.A0L = null;
                    c2 = 5;
                    break;
                case 5:
                    c1141cR = c1141cR;
                    if (c1141cR.A03 == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c1141cR = c1141cR;
                    if (c1141cR.A05 != null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return;
                case '\b':
                    c1141cR = c1141cR;
                    if (!c1141cR.A0m()) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\t':
                    c1141cR = c1141cR;
                    c1141cR.A0Y.A0A().unregisterView();
                    c2 = '\n';
                    break;
                case '\n':
                    c1141cR = c1141cR;
                    if (!A0j.containsKey(c1141cR.A03)) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c1141cR = c1141cR;
                    if (A0j.get(c1141cR.A03).get() != c1141cR) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    c1141cR = c1141cR;
                    view = c1141cR.A03;
                    if (!(view instanceof ViewGroup)) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c1141cR = c1141cR;
                    c0656Mu = c1141cR.A0J;
                    if (c0656Mu == null) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    c1141cR = c1141cR;
                    view = view;
                    c0656Mu = c0656Mu;
                    ((ViewGroup) view).removeView(c0656Mu);
                    c1141cR.A0J = r2;
                    c2 = 15;
                    break;
                case 15:
                    c1141cR = c1141cR;
                    c0770Rf = c1141cR.A0W;
                    if (c0770Rf == null) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    c0770Rf = c0770Rf;
                    c0770Rf.A0V();
                    c2 = 17;
                    break;
                case 17:
                    if (Build.VERSION.SDK_INT < 18) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    c1141cR = c1141cR;
                    if (c1141cR.A0K == null) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    c1141cR = c1141cR;
                    if (!JQ.A0m(c1141cR.A0Y)) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    c1141cR = c1141cR;
                    c1141cR.A0K.A07();
                    c1141cR.A03.getOverlay().remove(c1141cR.A0K);
                    c2 = 21;
                    break;
                case 21:
                    c1141cR = c1141cR;
                    A0j.remove(c1141cR.A03);
                    c1141cR.A0V();
                    c1141cR.A03 = r2;
                    c1141cR.A05 = r2;
                    q1 = c1141cR.A0N;
                    if (q1 == null) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    c1141cR = c1141cR;
                    q1 = q1;
                    q1.A0W();
                    c1141cR.A0N = r2;
                    c2 = 23;
                    break;
                case 23:
                    c1141cR.A08 = r2;
                    return;
                case 24:
                    throw new IllegalStateException(A0S(412, 38, 0));
            }
        }
    }
}
