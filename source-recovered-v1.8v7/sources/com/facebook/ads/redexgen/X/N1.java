package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import com.facebook.ads.NativeAdLayout;

/* loaded from: assets/audience_network.dex */
public final class N1 {
    public static final int A00 = (int) (C0635Ly.A01 * 200.0f);
    public static final int A02 = (int) (C0635Ly.A01 * 200.0f);
    public static final int A01 = (int) (C0635Ly.A01 * 50.0f);

    public static AnonymousClass11 A00(@Nullable NativeAdLayout nativeAdLayout) {
        char c2 = nativeAdLayout == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return AnonymousClass11.A04;
                case 3:
                    nativeAdLayout = nativeAdLayout;
                    if (!A03(nativeAdLayout)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return AnonymousClass11.A05;
                case 5:
                    return AnonymousClass11.A03;
            }
        }
    }

    @Nullable
    public static N0 A01(XI xi, JW jw, String str, @Nullable NativeAdLayout nativeAdLayout) {
        int width = 0;
        int height = 0;
        int i = 0;
        char c2 = nativeAdLayout == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (N0) null;
                case 3:
                    nativeAdLayout = nativeAdLayout;
                    width = nativeAdLayout.getWidth();
                    height = nativeAdLayout.getHeight();
                    i = A00;
                    if (width < i) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (height < i) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return new C1012aK(xi, jw, str);
                case 6:
                    if (width < A02) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (height < A01) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return new C1017aP(xi, jw, str);
                case '\t':
                    return (N0) null;
            }
        }
    }

    public static N0 A02(XI xi, JW jw, String str, C1R c1r, MR mr, MQ mq) {
        return new C1021aT(xi, jw, str, c1r, mr, mq);
    }

    public static boolean A03(NativeAdLayout nativeAdLayout) {
        boolean z = false;
        int width = nativeAdLayout.getWidth();
        int height = nativeAdLayout.getHeight();
        int i = A00;
        char c2 = width >= i ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    if (height >= i) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (width < A02) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (height >= A01) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    z = true;
                    c2 = 6;
                    break;
                case 6:
                    return z;
                case 7:
                    z = false;
                    c2 = 6;
                    break;
            }
        }
    }
}
