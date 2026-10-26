package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Cd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0402Cd {
    public static byte[] A01;
    public static final int A02;
    public static final int A03;
    public static final int A04;
    public static final int A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public static final int A0L;
    public static final int A0M;
    public static final int A0N;
    public static final int A0O;
    public static final int A0P;
    public static final int A0Q;
    public static final int A0R;
    public static final int A0S;
    public static final int A0T;
    public static final int A0U;
    public static final int A0V;
    public static final int A0W;
    public static final int A0X;
    public static final int A0Y;
    public static final int A0Z;
    public static final int A0a;
    public static final int A0b;
    public static final int A0c;
    public static final int A0d;
    public static final int A0e;
    public static final int A0f;
    public static final int A0g;
    public static final int A0h;
    public static final int A0i;
    public static final int A0j;
    public static final int A0k;
    public static final int A0l;
    public static final int A0m;
    public static final int A0n;
    public static final int A0o;
    public static final int A0p;
    public static final int A0q;
    public static final int A0r;
    public static final int A0s;
    public static final int A0t;
    public static final int A0u;
    public static final int A0v;
    public static final int A0w;
    public static final int A0x;
    public static final int A0y;
    public static final int A0z;
    public static final int A10;
    public static final int A11;
    public static final int A12;
    public static final int A13;
    public static final int A14;
    public static final int A15;
    public static final int A16;
    public static final int A17;
    public static final int A18;
    public static final int A19;
    public static final int A1A;
    public static final int A1B;
    public static final int A1C;
    public static final int A1D;
    public static final int A1E;
    public static final int A1F;
    public static final int A1G;
    public static final int A1H;
    public static final int A1I;
    public static final int A1J;
    public static final int A1K;
    public static final int A1L;
    public static final int A1M;
    public static final int A1N;
    public static final int A1O;
    public static final int A1P;
    public static final int A1Q;
    public static final int A1R;
    public static final int A1S;
    public static final int A1T;
    public static final int A1U;
    public static final int A1V;
    public static final int A1W;
    public final int A00;

    public static String A03(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 71);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A01 = new byte[]{17, 1, 6, 7, -78, -57, -76, -108, 7, 23, 22, 6, -32, -42, -47, -27, -21, -18, -78, -12, 42, 51, 40, 59, -9, -8, -12, -12, -72, -56, -57, -68, 29, 41, -16, -18, -1, -9, 6, -13, -29, -74, -80, -72, 34, 38, -31, 21, -54, -71, -66, -57, 40, 36, 44, 41, -48, -47, -49, -97, -19, 2, -17, -67, -44, -43, -108, -59, 5, 8, 15, 16, 40, 41, 41, 40, 46, 47, 46, 30, -81, -84, -67, 120, 35, 36, 18, 28, -65, -74, -70, -74, 33, 17, 22, 27, -8, -10, -7, -14, 58, 56, 43, 62, -65, -63, -117, -111, 6, -3, 2, -6, 28, 42, 47, 38, -5, -70, -66, -69, -60, -57, -124, -75, -14, -32, -10, -31, 7, 7, 0, -1, -34, -30, -43, -33, 18, 14, 19, 11, -40, -54, -52, -56, -30, 33, 36, -25, -84, -85, -69, -70, -74, -60, -79, Byte.MAX_VALUE, -52, -41, -52, -50, 21, 6, 24, 21, 1, -1, 11, 11, 27, 19, 15, 28, -44, -50, -63, -95, 1, -17, -9, -3, 20, 10, 15, 7, -53, -71, -63, -46, -21, -34, -22, -30, -7, -11, -3, 3, 53, 38, 47, 36, -45, -43, -43, -36, 19, 22, 22, 11, 11, 27, 26, 19, 10, 24, 5, -27, -71, -54, -54, -55, 10, 13, -47, -2, 54, 55, 54, 39, 8, -6, -8, 8, 27, 18, 15, 11, -66, -64, -64, -73, 33, 27, -37, -28, -68, -71, -52, -71, -75, -61, -76, -61, -42, -26, -27, -41, 10, 2, 5, 1, 16, 16, 4, -1, -41, -59, -47, -42, -49, -48, -49, -42, -9, -10, -12, -12, 26, 47, 28, -20, 28, 26, 9, 14, -1, -10, -13, 6, -42, -44, -61, -51, -8, -6, -9, -14, 20, 21, 27, -45, -76, -67, -84, -65, -26, -40, -31, -42, -2, 5, 12, 13, -63, -69, 123, -125, -79, -67, -72, -84, 16, 25, 14, 12, 22, 19, 21, -27, 18, 27, 13, 9, -9, -1, 5, -7, -41, -63, -42, -59, 10, 11, 10, 10, -4, -16, -7, -19, -72, -74, Byte.MIN_VALUE, -122, 1, 2, -15, -3, -35, -44, -49, -53, -54, -71, -55, -74, 16, -34, -30, -33, 26, 26, 42, 41};
    }

    static {
        A04();
        A0U = C0560Iy.A08(A03(112, 4, 111));
        A06 = C0560Iy.A08(A03(60, 4, 69));
        A07 = C0560Iy.A08(A03(276, 4, k.AppCompatTheme_viewInflaterClass));
        A0X = C0560Iy.A08(A03(152, 4, 7));
        A0W = C0560Iy.A08(A03(80, 4, 0));
        A0s = C0560Iy.A08(A03(k.AppCompatTheme_windowActionBarOverlay, 4, 65));
        A0D = C0560Iy.A08(A03(364, 4, 101));
        A0b = C0560Iy.A08(A03(284, 4, 75));
        A0k = C0560Iy.A08(A03(220, 4, 86));
        A03 = C0560Iy.A08(A03(144, 4, 109));
        A1V = C0560Iy.A08(A03(336, 4, 25));
        A0a = C0560Iy.A08(A03(132, 4, 43));
        A14 = C0560Iy.A08(A03(52, 4, 110));
        A04 = C0560Iy.A08(A03(104, 4, 23));
        A0E = C0560Iy.A08(A03(324, 4, 107));
        A0M = C0560Iy.A08(A03(348, 4, 12));
        A0H = C0560Iy.A08(A03(56, 4, 37));
        A0I = C0560Iy.A08(A03(8, 4, 92));
        A0K = C0560Iy.A08(A03(28, 4, 13));
        A0L = C0560Iy.A08(A03(208, 4, 96));
        A0J = C0560Iy.A08(A03(252, 4, 43));
        A0G = C0560Iy.A08(A03(368, 4, 111));
        A1H = C0560Iy.A08(A03(228, 4, 77));
        A1I = C0560Iy.A08(A03(140, 4, 29));
        A1M = C0560Iy.A08(A03(100, 4, 127));
        A1N = C0560Iy.A08(A03(96, 4, 61));
        A12 = C0560Iy.A08(A03(12, 4, 38));
        A0j = C0560Iy.A08(A03(200, 4, 31));
        A0n = C0560Iy.A08(A03(328, 4, 94));
        A1L = C0560Iy.A08(A03(288, 4, 27));
        A0d = C0560Iy.A08(A03(108, 4, 82));
        A0h = C0560Iy.A08(A03(136, 4, 94));
        A16 = C0560Iy.A08(A03(84, 4, 105));
        A08 = C0560Iy.A08(A03(4, 4, 10));
        A0Y = C0560Iy.A08(A03(212, 4, 91));
        A0S = C0560Iy.A08(A03(248, 4, 9));
        A0i = C0560Iy.A08(A03(236, 4, 10));
        A1K = C0560Iy.A08(A03(280, 4, 97));
        A0m = C0560Iy.A08(A03(300, 4, 0));
        A0f = C0560Iy.A08(A03(256, 4, 86));
        A1J = C0560Iy.A08(A03(232, 4, 96));
        A0N = C0560Iy.A08(A03(148, 4, 0));
        A0O = C0560Iy.A08(A03(308, 4, 82));
        A0c = C0560Iy.A08(A03(88, 4, 11));
        A0V = C0560Iy.A08(A03(192, 4, 74));
        A1A = C0560Iy.A08(A03(224, 4, k.AppCompatTheme_windowNoTitle));
        A0r = C0560Iy.A08(A03(204, 4, 92));
        A13 = C0560Iy.A08(A03(180, 4, 90));
        A0z = C0560Iy.A08(A03(92, 4, 103));
        A0y = C0560Iy.A08(A03(0, 4, 87));
        A1G = C0560Iy.A08(A03(196, 4, k.AppCompatTheme_windowMinWidthMajor));
        A0R = C0560Iy.A08(A03(20, 4, 126));
        A0Q = C0560Iy.A08(A03(320, 4, 100));
        A0T = C0560Iy.A08(A03(316, 4, 4));
        A0u = C0560Iy.A08(A03(184, 4, 17));
        A0t = C0560Iy.A08(A03(176, 4, 71));
        A0x = C0560Iy.A08(A03(48, 4, 16));
        A11 = C0560Iy.A08(A03(344, 4, 66));
        A1Q = C0560Iy.A08(A03(260, 4, 84));
        A10 = C0560Iy.A08(A03(304, 4, 44));
        A0p = C0560Iy.A08(A03(160, 4, 94));
        A02 = C0560Iy.A08(A03(128, 4, 108));
        A1R = C0560Iy.A08(A03(356, 4, 32));
        A0l = C0560Iy.A08(A03(16, 4, 55));
        A1D = C0560Iy.A08(A03(72, 4, 110));
        A1B = C0560Iy.A08(A03(340, 4, 80));
        A0C = C0560Iy.A08(A03(216, 4, 15));
        A19 = C0560Iy.A08(A03(76, 4, k.AppCompatTheme_windowActionBarOverlay));
        A1C = C0560Iy.A08(A03(268, 4, 21));
        A1E = C0560Iy.A08(A03(296, 4, 90));
        A17 = C0560Iy.A08(A03(352, 4, 71));
        A0B = C0560Iy.A08(A03(32, 4, k.AppCompatTheme_windowActionBar));
        A1O = C0560Iy.A08(A03(44, 4, 103));
        A1W = C0560Iy.A08(A03(272, 4, 57));
        A18 = C0560Iy.A08(A03(24, 4, 61));
        A09 = C0560Iy.A08(A03(40, 4, 57));
        A0v = C0560Iy.A08(A03(264, 4, 29));
        A0w = C0560Iy.A08(A03(k.AppCompatTheme_windowNoTitle, 4, 56));
        A1P = C0560Iy.A08(A03(360, 4, 14));
        A0g = C0560Iy.A08(A03(36, 4, 75));
        A0Z = C0560Iy.A08(A03(68, 4, 85));
        A0e = C0560Iy.A08(A03(168, 4, 103));
        A0o = C0560Iy.A08(A03(188, 4, 54));
        A0F = C0560Iy.A08(A03(244, 4, 17));
        A0P = C0560Iy.A08(A03(332, 4, 75));
        A15 = C0560Iy.A08(A03(64, 4, 26));
        A1F = C0560Iy.A08(A03(k.AppCompatTheme_windowFixedWidthMajor, 4, 10));
        A0q = C0560Iy.A08(A03(292, 4, 65));
        A1S = C0560Iy.A08(A03(312, 4, 4));
        A1T = C0560Iy.A08(A03(240, 4, 100));
        A1U = C0560Iy.A08(A03(172, 4, 23));
        A0A = C0560Iy.A08(A03(164, 4, 87));
        A05 = C0560Iy.A08(A03(156, 4, 36));
    }

    public AbstractC0402Cd(int i) {
        this.A00 = i;
    }

    public static int A00(int i) {
        return 16777215 & i;
    }

    public static int A01(int i) {
        return (i >> 24) & 255;
    }

    public static String A02(int i) {
        return A03(88, 0, 107) + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public String toString() {
        return A02(this.A00);
    }
}
