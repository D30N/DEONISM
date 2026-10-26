package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: com.facebook.ads.redexgen.X.9p, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03409p extends C0755Qq {
    public static byte[] A0E;
    public static final String A0F;

    @Nullable
    public Uri A00;

    @Nullable
    public NativeAd A01;
    public JW A02;

    @Nullable
    public MY A03;

    @Nullable
    public C02997y A04;

    @Nullable
    public String A05;

    @Nullable
    public String A06;

    @Nullable
    public String A07;
    public final AnonymousClass15 A08;
    public final XI A09;
    public final AbstractC0644Mh A0A;
    public final LM A0B;
    public final AbstractC0604Ks A0C;
    public final String A0D;

    public static String A01(int i, int i2, int i3) {
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

    public static void A03() {
        A0E = new byte[]{66, 53, 48, 49, 59, 43, 64, 53, 57, 49, 43, 60, 59, 56, 56, 53, 58, 51, 43, 53, 58, 64, 49, 62, 66, 45, 56, -88, -58, -45, -116, -39, -123, -40, -39, -58, -41, -39, -123, -90, -38, -55, -50, -54, -45, -56, -54, -77, -54, -39, -36, -44, -41, -48, -90, -56, -39, -50, -37, -50, -39, -34, -109, -123, -78, -58, -48, -54, -123, -40, -38, -41, -54, -123, -39, -51, -58, -39, -123, -50, -39, -116, -40, -123, -50, -45, -123, -34, -44, -38, -41, -123, -90, -45, -55, -41, -44, -50, -55, -78, -58, -45, -50, -53, -54, -40, -39, -109, -35, -46, -47, -123, -53, -50, -47, -54, -109, -13, -17, -18, 34, 17, 22, 18, 27, 16, 18, -5, 18, 33, 36, 28, 31, 24, 48, 61, 46, 48, 50, 67, 56, 69, 56, 67, 72, -37, -50, -54, -36, -71, -34, -43, -54, 27, 14, 9, 10, 20, -15, 20, 12, 12, 10, 23, 57, 42, 59, 60, 50, 55, 48, -89, -49, -51, -50, 122, -51, -65, -50, -80, -61, -66, -65, -55, -81, -84, -93, 122, -55, -52, 122, -51, -65, -50, -80, -61, -66, -65, -55, -89, -86, -98, 122, -64, -61, -52, -51, -50, 1, 41, 39, 40, -44, 39, 25, 40, -9, 32, 29, 25, 34, 40, 8, 35, 31, 25, 34, -44, 26, 29, 38, 39, 40, -39, -37, -50, -51, -50, -49, -46, -41, -50, -51, -72, -37, -46, -50, -41, -35, -54, -35, -46, -40, -41, -76, -50, -30, -2, -9, -14, -6, -2, -18, -46, -19, 6, -7, -12, -11, -1, -35, -32, -44, -41, -54, -59, -58, -48, -74, -77, -83, -43, 2, 2, -1, 2, -54, -80, -15, -17, -31, -54, -35, -16, -27, -14, -31, -65, -16, -35, -66, -15, -16, -16, -21, -22, -28, -19, -22, -26, -17, -11, -43, -16, -20, -26, -17, -11, -24, -29, -28, -18, -46, -28, -28, -22, -45, -24, -20, -28};
    }

    static {
        A03();
        A0F = C03409p.class.getSimpleName();
    }

    public C03409p(XI xi) {
        super(xi);
        this.A0D = UUID.randomUUID().toString();
        this.A0C = new AbstractC0604Ks() { // from class: com.facebook.ads.redexgen.X.9u
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(L4 l4) {
                if (this.A00.A03 != null) {
                    this.A00.A03.AAV();
                }
            }
        };
        this.A0B = new LM() { // from class: com.facebook.ads.redexgen.X.9s
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C02977v c02977v) {
                if (this.A00.A03 != null) {
                    this.A00.A03.onPause();
                }
            }
        };
        this.A0A = new AbstractC0644Mh() { // from class: com.facebook.ads.redexgen.X.9r
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C02987x c02987x) {
                if (this.A00.A03 != null) {
                    this.A00.A03.A9C();
                }
            }
        };
        this.A08 = new AnonymousClass15(this, xi);
        this.A09 = xi;
        A02();
    }

    public C03409p(XI xi, AttributeSet attributeSet) {
        super(xi, attributeSet);
        this.A0D = UUID.randomUUID().toString();
        this.A0C = new AbstractC0604Ks() { // from class: com.facebook.ads.redexgen.X.9u
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(L4 l4) {
                if (this.A00.A03 != null) {
                    this.A00.A03.AAV();
                }
            }
        };
        this.A0B = new LM() { // from class: com.facebook.ads.redexgen.X.9s
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C02977v c02977v) {
                if (this.A00.A03 != null) {
                    this.A00.A03.onPause();
                }
            }
        };
        this.A0A = new AbstractC0644Mh() { // from class: com.facebook.ads.redexgen.X.9r
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C02987x c02987x) {
                if (this.A00.A03 != null) {
                    this.A00.A03.A9C();
                }
            }
        };
        this.A08 = new AnonymousClass15(this, xi);
        this.A09 = xi;
        A02();
    }

    public C03409p(XI xi, AttributeSet attributeSet, int i) {
        super(xi, attributeSet, i);
        this.A0D = UUID.randomUUID().toString();
        this.A0C = new AbstractC0604Ks() { // from class: com.facebook.ads.redexgen.X.9u
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(L4 l4) {
                if (this.A00.A03 != null) {
                    this.A00.A03.AAV();
                }
            }
        };
        this.A0B = new LM() { // from class: com.facebook.ads.redexgen.X.9s
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C02977v c02977v) {
                if (this.A00.A03 != null) {
                    this.A00.A03.onPause();
                }
            }
        };
        this.A0A = new AbstractC0644Mh() { // from class: com.facebook.ads.redexgen.X.9r
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C02987x c02987x) {
                if (this.A00.A03 != null) {
                    this.A00.A03.A9C();
                }
            }
        };
        this.A08 = new AnonymousClass15(this, xi);
        this.A09 = xi;
        A02();
    }

    private void A02() {
        getEventBus().A03(this.A0C, this.A0B, this.A0A);
    }

    private void A04(Intent intent) {
        C03409p c03409p = this;
        String strA01 = null;
        char c2 = c03409p.A04 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c03409p.A05(A01(208, 25, 99));
                    return;
                case 3:
                    c03409p = c03409p;
                    if (c03409p.A00 != null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c03409p = c03409p;
                    if (c03409p.A07 != null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c03409p.A05(A01(171, 37, 9));
                    return;
                case 6:
                    c03409p = c03409p;
                    intent = intent;
                    intent.putExtra(A01(288, 18, 43), c03409p.A06);
                    intent.putExtra(A01(145, 8, 20), EnumC0592Ke.A05);
                    intent.putExtra(A01(273, 8, 16), c03409p.A00.toString());
                    strA01 = c03409p.A05;
                    if (strA01 != null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    strA01 = A01(153, 0, 82);
                    c2 = '\b';
                    break;
                case '\b':
                    C03409p c03409p2 = c03409p;
                    Intent intent2 = intent;
                    intent2.putExtra(A01(306, 11, 48), strA01);
                    intent2.putExtra(A01(265, 8, 63), c03409p2.A07);
                    intent2.putExtra(A01(233, 24, 24), 13);
                    intent2.putExtra(A01(317, 13, 46), c03409p2.getCurrentPositionInMillis());
                    intent2.putExtra(A01(257, 8, 56), c03409p2.A0D);
                    intent2.putExtra(A01(153, 11, 84), c03409p2.A04.getSaveInstanceState());
                    intent2.putExtra(A01(0, 27, k.AppCompatTheme_windowMinWidthMinor), c03409p2.getVideoProgressReportIntervalMs());
                    intent2.addFlags(268435456);
                    return;
            }
        }
    }

    private void A05(String str) {
        this.A09.A04().A83(A01(164, 7, k.AppCompatTheme_windowFixedWidthMajor), C03008a.A1e, new C03018b(AdErrorType.PARSER_FAILURE.getDefaultErrorMessage(), A01(281, 7, 63) + str));
        if (AdInternalSettings.isDebugBuild()) {
            Log.w(A0F, str);
        }
    }

    public final void A0j() {
        NativeAd nativeAd = this.A01;
        if (nativeAd != null) {
            nativeAd.onCtaBroadcast();
        }
    }

    public final void A0k() {
        AdActivityIntent adActivityIntentA04 = LA.A04(this.A09);
        A04(adActivityIntentA04);
        try {
            A0b(false, 6);
            setVisibility(8);
            LA.A09(this.A09, adActivityIntentA04);
        } catch (Exception e) {
            this.A09.A04().A83(A01(134, 11, 126), C03008a.A05, new C03018b(e));
            Log.e(A01(k.AppCompatTheme_windowActionModeOverlay, 17, 92), A01(27, 90, 20), e);
        }
    }

    @Nullable
    public MY getListener() {
        return this.A03;
    }

    public String getUniqueId() {
        return this.A0D;
    }

    @Override // com.facebook.ads.redexgen.X.C0755Qq, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A08.A02();
    }

    @Override // com.facebook.ads.redexgen.X.C0755Qq, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.A08.A03();
        super.onDetachedFromWindow();
    }

    public void setAdEventManager(JW jw) {
        this.A02 = jw;
    }

    public void setClientToken(@Nullable String str) {
        C03409p c03409p = this;
        C02997y c02997y = null;
        C02997y c02997y2 = c03409p.A04;
        char c2 = c02997y2 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c02997y2 = c02997y2;
                    c02997y2.A0f();
                    c2 = 3;
                    break;
                case 3:
                    c03409p = c03409p;
                    str = str;
                    c03409p.A05 = str;
                    if (str == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c03409p = c03409p;
                    str = str;
                    c02997y = new C02997y(c03409p.A09, c03409p.A02, c03409p, str);
                    c2 = 5;
                    break;
                case 5:
                    c03409p.A04 = c02997y;
                    return;
                case 6:
                    c02997y = null;
                    c2 = 5;
                    break;
            }
        }
    }

    public void setEnableBackgroundVideo(boolean z) {
        super.A0D.setBackgroundPlaybackEnabled(z);
    }

    public void setListener(@Nullable MY my) {
        this.A03 = my;
    }

    public void setNativeAd(@Nullable NativeAd nativeAd) {
        this.A01 = nativeAd;
    }

    public void setVideoCTA(@Nullable String str) {
        this.A06 = str;
    }

    @Override // com.facebook.ads.redexgen.X.C0755Qq
    public void setVideoMPD(@Nullable String str) {
        C03409p c03409p = this;
        char c2 = str != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c03409p = c03409p;
                    if (c03409p.A04 != null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c03409p.A05(A01(208, 25, 99));
                    return;
                case 4:
                    C03409p c03409p2 = c03409p;
                    String str2 = str;
                    c03409p2.A07 = str2;
                    super.setVideoMPD(str2);
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0755Qq
    public void setVideoURI(@Nullable Uri uri) {
        C03409p c03409p = this;
        char c2 = uri != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c03409p = c03409p;
                    if (c03409p.A04 != null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c03409p.A05(A01(208, 25, 99));
                    return;
                case 4:
                    C03409p c03409p2 = c03409p;
                    Uri uri2 = uri;
                    c03409p2.A00 = uri2;
                    super.setVideoURI(uri2);
                    return;
            }
        }
    }
}
