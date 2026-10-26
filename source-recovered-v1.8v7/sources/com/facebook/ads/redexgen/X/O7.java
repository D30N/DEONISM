package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class O7 {
    public static final int A00 = C0635Ly.A02.heightPixels;
    public static final int A01 = C0635Ly.A02.widthPixels;

    public static float A00(C1A c1a) {
        float f = 0.0f;
        int iA01 = c1a.A0D().A01();
        int iA00 = c1a.A0D().A00();
        char c2 = iA00 > 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    f = iA01 / iA00;
                    c2 = 3;
                    break;
                case 3:
                    return f;
                case 4:
                    f = -1.0f;
                    c2 = 3;
                    break;
            }
        }
    }

    public static int A01(double d2) {
        return (int) ((A01 - (O8.A09 * 2)) / d2);
    }

    public static int A02(int ctaTextHeight) {
        int ctaMargin = C0635Ly.A01(16);
        int i = C0685Nx.A0B * 2;
        int ctaSpacing = O8.A09;
        int ctaMargin2 = ctaMargin + i + (ctaSpacing * 2);
        int bottomMargin = A00;
        return (bottomMargin - ctaTextHeight) - ctaMargin2;
    }

    public static boolean A03(double d2) {
        boolean z = false;
        char c2 = d2 < 0.9d ? (char) 2 : (char) 4;
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

    public static boolean A04(double d2, int i) {
        boolean z = false;
        char c2 = A02(i) < A01(d2) ? (char) 2 : (char) 4;
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

    public static boolean A05(int i, int i2, double d2) {
        boolean z = false;
        char c2 = i != 2 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    if (!A04(d2, i2)) {
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
}
