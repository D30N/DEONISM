package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.metadata.id3.ApicFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.CommentFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.Id3Frame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.InternalFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.TextInformationFrame;
import d.b.a.b.k;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Cq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0413Cq {
    public static byte[] A00;
    public static final int A01;
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
    public static final String[] A0U;

    public static String A09(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 66);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0A() {
        A00 = new byte[]{-95, -57, -69, -66, -74, -67, -68, -73, -79, 110, -96, -67, -79, -71, -20, 7, 15, 18, 11, 10, -58, 26, 21, -58, 22, 7, 24, 25, 11, -58, 15, 20, 10, 11, 30, -43, 9, 21, 27, 20, 26, -58, 7, 26, 26, 24, 15, 8, 27, 26, 11, -32, -58, -97, -47, -56, -48, -17, 0, 2, -75, -76, -80, -92, -1, 47, 44, 41, -25, 14, 31, 29, 34, 40, 41, -86, -87, -91, -86, -120, -93, -85, -82, -89, -90, 98, -74, -79, 98, -78, -93, -76, -75, -89, 98, -91, -79, -72, -89, -76, 98, -93, -76, -74, 98, -93, -74, -74, -76, -85, -92, -73, -74, -89, 15, -1, 13, -2, -41, -7, -24, -11, -14, -6, 0, 41, 38, 37, -90, -67, -49, 120, -81, -71, -50, -67, -17, -21, -32, -52, -13, -2, -1, -8, -17, -3, -21, -18, 0, -13, -3, -7, -4, 3, -102, -103, -107, -121, -110, -69, -60, -79, -14, 14, 13, 0, 19, 0, -97, -76, -57, -68, -63, -36, -24, -17, -21, -70, -75, -75, -113, -65, -74, -63, -99, -68, -67, -50, -19, -22, -23, -33, 5, 42, 47, 48, 46, 49, 41, 33, 42, 48, 29, 40, -36, 14, 43, 31, 39, -40, 0, 4, 1, -10, -3, 27, 23, 11, 23, -96, -72, -82, 8, 45, 50, 51, 49, 52, 44, 36, 45, 51, 32, 43, 19, 15, 4, -15, -58, -76, -62, -65, -34, -38, -39, -40, 41, 37, 23, 34, -21, 12, 8, 27, 15, -57, -12, 12, 27, 8, 19, 19, 34, 49, -68, -75, -85, -41, -18, -16, -18, -5, -7, -2, -9, -12, 41, 36, 38, -57, -53, -65, -59, -61, -115, -56, -50, -61, -59, -102, -53, -69, -54, -71, -30, -41, -23, -23, -33, -39, -41, -30, -71, -57, -46, -39, -57, 2, 47, 42, 46, 38, -60, -31, -35, -14, -11, -100, -55, -31, -16, -35, -24, -87, -119, -102, -100, -35, -12, 13, 13, -66, -39, 8, 1, -2, -37, -41, -55, -38, 24, 22, 31, -89, -70, -68, -68, -74, -70, -4, -23, -12, -22, -89, -61, -43, -37, -126, -82, -53, -43, -42, -57, -48, -53, -48, -55, -99, -54, -62, -60, -54, -57, -55, -31, -33, -26, -26, -37, -38, -106, -21, -28, -31, -28, -27, -19, -28, -106, -29, -37, -22, -41, -38, -41, -22, -41, -106, -37, -28, -22, -24, -17, -80, -106, -23, -19, -31, -25, -27, -81, -16, -18, -25, -103, -70, -63, 126, -103, -64, -63, 30, 42, 40, -94, -46, -49, -52, -63, -66, -53, -64, -62, -65, -27, -28, -27, -72, -35, -25, -34, -24, -23, -34, -42, -29, -107, -57, -42, -27, -60, -41, -24, -37, -24, -45, -34, -70, -81, -70, -104, -72, -43, -30, -41, -39, -108, -68, -43, -32, -32, -12, -14, -29, -21, -62, -27, -31, -12, -17, 23, 9, -46, -17, -4, -15, -13, -74, -118, -90, -103, -60, -52, -67, -54, -58, -86, -57, -69, -61, -21, 14, -52, -27, 8, -20, 17, 27, 18, 28, 29, 18, 10, 23, -55, -5, 24, 12, 20, -45, -16, -28, -20, -95, -89, -95, -45, -16, -19, -19, -21, 19, 24, 12, 13, 7, -60, -10, 19, 7, 15, -91, -71, -61, -78, -60, -71, 113, -98, -74, -59, -78, -67, -73, -36, -26, -35, -25, -24, -35, -43, -30, -108, -69, -43, -30, -37, -25, -24, -43, -108, -58, -43, -28, -94, -95, -99, Byte.MIN_VALUE, -63, -29, -32, -40, -29, -42, -28, -28, -38, -25, -42, -111, -61, -32, -44, -36, -101, -75, -63, -71, -104, -75, -58, -65, -53, -75, -54, -71, -88, -92, -93, -89, 15, 40, 44, 31, 29, 41, 33, 40, 35, 52, 31, 30, -38, 29, 41, 48, 31, 44, -38, 27, 44, 46, -38, 32, 38, 27, 33, 45, -12, -38, -15, 26, 35, 16, -37, -10, 29, 35, 33, 19, -27, 1, 7, 6, -6, -9, 4, 0, -78, -28, 1, -11, -3, -72, -27, -27, -22, -17, -106, -72, -41, -23, -23, 5, 29, 44, 25, 28, 25, 44, 25, 13, 44, 33, 36, -7, -8, -12, -11, -109, -82, -64, -63, 109, -109, -62, -64, -74, -68, -69, -23, -12, -22, -20, 17, 7, 24, 22, 23, 21, 12, 4, 15, -6, -4, -7, -18, -41, -14, -6, -3, -10, -11, -79, 5, 0, -79, 1, -14, 3, 4, -10, -79, 6, -6, -1, 5, -55, -79, -14, 5, 5, 3, -6, -13, 6, 5, -10, -53, -79, -17, 12, 0, 8, -98, -74, -59, -78, -67, -12, 27, 33, 31, 17, -34, -51, -39, -40, -91, -72, -53, -64, -51, -68, 119, -104, -60, -68, -55, -64, -70, -72, -59, -64, -62, -65, -76, -69, -61, -45, -18, -10, -7, -14, -15, -83, 1, -4, -83, -3, -18, -1, 0, -14, -83, 0, 1, -18, -5, -15, -18, -1, -15, -83, -12, -14, -5, -1, -14, -83, -16, -4, -15, -14, -96, -54, -65, -63, -55, 126, -85, -61, -46, -65, -54, -82, -51, -54, -47, -55, 126, -82, -45, -52, -55, -93, -56, -63, -51, -62, -59, -46, Byte.MIN_VALUE, -83, -43, -45, -55, -61, -88, -67, -60, -52, -55, -54, -61, -70, -56, -20, 26, 13, 9, 21, -34, -11, 14, 14, -21, -4, -6, -1, 5, 6, -60, -32, 5, -5, 12, 10, 11, 9, 0, -8, 3, 8, 4, -10, -10, -14, 23, 11, 8, 21, -24, 19, 27, 12, 25, 21, 8, 27, 16, 29, 12, -99, -55, -66, -59, -63, -54, -48, -33, -66, 1, -1, 14, 3, 10, 10, -1, -117, -86, -75, -75, -86, -83, -89, -65, -66, -61, -50, -69, -50, -61, -48, -65, -80, -49, -46, -50, Byte.MIN_VALUE, -89, -46, -49, -49, -42, -59, -37, -10, -2, 1, -6, -7, -75, 9, 4, -75, 5, -10, 7, 8, -6, -75, 9, -6, 13, 9, -75, -10, 9, 9, 7, -2, -9, 10, 9, -6, -49, -75, -48, -15, -26, -13, -30, -99, -85, -66, -77, -68, -81, -24, 
        15, 13, -58, -24, 7, 20, 10, -68, -70, -77, -74, -32, -25, -21, -34, -18, 25, 28, 21, 14, 12, 4, 27, 45, -42, -9, 29, 27, -56, -15, -18, -19, -81, -44, -15, -27, -19, 11, 9, 2, 10, -82, -71, -70, -77, -86, -72, -84, -90, -75, -79, -86, -72, -72, 20, 49, 38, 38, 36, 41, -74, -63, -65, -32, -22, -15, -93, -78, -57, -74, 26, 28, 22, 15, -78, -50, -44, -51, -61, Byte.MAX_VALUE, -94, -53, -56, -49, -106, -69, -76, -79, -47, -3, -4, 2, -13, -5, -2, -3, 0, -17, 0, 7, -82, -47, -10, 0, -9, 1, 2, -9, -17, -4, -71, -49, -32, -37, -49, -44, -48, -54, -121, -70, -42, -36, -45, -50, -17, -23, -13, -27, -23, 2, 19, 5, 4, 16, 19, 6, -92, -58, -67, -63, -55, -57, -11, -28, -16, -18, -22, -39, -29, -26, -27, 10, 0, 5, 1, -54, -17, -10, -7, -4, -6, -42, -17, -29, -31, -20, -78, -42, -56, -51, -58, -43, -24, -9, -11, -14, -27, -30, -6, -55, -24, -23, -90, -65, -24, -27, -28, -47, -22, -5, -19, -87, -37, -8, -20, -12, -66, -53, -40, -47, -39, -106, -63, -70, -77, -72, -79, -112, -68, -62, -69, -63, -65, -58, -71, -45, -32, -39, -27, -26, -45, -43, -4, -11, -13, 4, 2, -1, -2, -7, -13, -88, -60, -54, -63, -2, 36, 24, 27, 19, 26, 25, 36, -119, -85, -79, -84, 104, -110, -87, -62, -62, -99, -65, -59, -64, 124, -84, -47, -54, -57, -81, -40, -51, -33, -33, -43, -49, -116, -66, -37, -49, -41, -38, 4, 13, -3, -1, 10, -7, 11, 11, 8, 25, 23, 28, 34, 35, -71, -34, -29, -28, -30, -27, -35, -43, -34, -28, -47, -36, -112, -64, -33, -32, -9, 8, 21, 21, 18, 21, -92, -62, -79, -71, -68, -75, -62, -64, -36, -30, -37, -47, -31, -33, -50, -48, -40, -100, -69, -68, -70, -41, -56, -54, -52, -18, 20, 9, 15, 3, 11, 10, 11, 1, 48, 41, 38, -28, -30, -37, -105, -74, -56, -56, -113, -69, -71, -79, -80, -59, -44, 2, 5, -3, -80, -29, -1, -4, -1, 6, 25, 44, 33, 39, 38, 25, 36, -40, -2, 39, 36, 35, -85, -58, -50, -47, -54, -55, -123, -39, -44, -123, -43, -58, -41, -40, -54, -123, -38, -50, -45, -39, -99, -123, -58, -39, -39, -41, -50, -57, -38, -39, -54, -123, -37, -58, -47, -38, -54, -95, -106, -95, 126, -46, -41, -31, -39, -44, -31, -38, -50, -21, -29, -24, -28, -14, -101, -70, -69, 122, -111, -64, -71, -74, -103, -68, -62, -84, -79, -86, -83, -82, -75, -78, -84, 2, 36, 43, 51, 40, 34, -3, 43, 46, 38, -39, -33, -39, -5, 26, 44, 44, -33, 14, 2, 8, 3, -3, 14, 45, 53, 35, 48, -34, 0, 31, 42, 42, 31, 34, 8, -5, 7, 19, 15, 19, 14, -84, -60, -47, -60, -51, -58, -44, -60, -14, -23, -29, -14, -91, -91, -91, -91, -22, 15, 25, 9, 21, -46, -2, -15, -15, -1, 0, 5, -8, -15, -18, 24, 33, 17, 31, -42, -1, -4, -5, -4, -1, 2, -11, -73, -46, -45, -125, -105, -109, -81, -47, -35, -29, -31, -30, -41, -47, -58, -28, -27, -28, -11, -24, -9, -41, -28, -35, -32, -82, -45, -52, -55, 126, -80, -51, -63, -55, -93, -53, -48, -60, -59, -65, -103, -14, -15, -15, -29, -119, -72, -75, -71, -71, -75, -68, -85, -72, -107, -80, -72, -69, -76, -77, 111, -61, -66, 111, -65, -80, -63, -62, -76, 111, -78, -66, -68, -68, -76, -67, -61, 111, -80, -61, -61, -63, -72, -79, -60, -61, -76, -119, 111, -86, -72, -60, -71, -72, -30, 5, 2, 15, 2, -45, -15, -24, -17, -84, -57, -18, -17, -56, -16, -18, -28, -34, -36, -25, -95, -93, -96, -107, -100, -92, -96, -100, -97, -95, -9, 38, 36, 26, 32, 31, -14, -21, -18, -19, -107, -72, -66, -88, -83, -86, -87, -86, -79, -82, -88, 101, -105, -76, -88, -80, -40, -15, -12, -4, -91, -49, -26, -14, 11, 41, 24, 37, 26, 28, -20, 17, 10, 23, 28, 24, 23, -57, -32, -29, -21, -108, -58, -29, -41, -33, -96, -48, -51, -54, -120, -93, -54, -48, -50, -64, -56, -22, -16, -21, -91, -38, -59, -46, -40, -53, -59, -42, -56, -55, -33, -3, -12, -19, -20, -9};
    }

    static {
        A0A();
        A09 = C0560Iy.A08(A09(1490, 3, 88));
        A0A = C0560Iy.A08(A09(1347, 3, 46));
        A03 = C0560Iy.A08(A09(1063, 3, 59));
        A0B = C0560Iy.A08(A09(1176, 3, 63));
        A02 = C0560Iy.A08(A09(57, 3, 108));
        A06 = C0560Iy.A08(A09(177, 3, 4));
        A01 = C0560Iy.A08(A09(700, 3, 70));
        A04 = C0560Iy.A08(A09(421, 3, k.AppCompatTheme_windowFixedWidthMinor));
        A05 = C0560Iy.A08(A09(276, 3, 112));
        A08 = C0560Iy.A08(A09(1427, 3, 38));
        A07 = C0560Iy.A08(A09(340, 3, 111));
        A0E = C0560Iy.A08(A09(173, 4, 55));
        A0H = C0560Iy.A08(A09(1011, 4, 55));
        A0I = C0560Iy.A08(A09(1060, 3, 13));
        A0F = C0560Iy.A08(A09(1423, 4, 44));
        A0R = C0560Iy.A08(A09(1007, 4, 6));
        A0Q = C0560Iy.A08(A09(1670, 4, 60));
        A0D = C0560Iy.A08(A09(1561, 4, 50));
        A0C = C0560Iy.A08(A09(323, 4, 6));
        A0P = C0560Iy.A08(A09(242, 4, 41));
        A0L = C0560Iy.A08(A09(246, 4, k.AppCompatTheme_windowActionBarOverlay));
        A0N = C0560Iy.A08(A09(336, 4, 38));
        A0M = C0560Iy.A08(A09(893, 4, 83));
        A0O = C0560Iy.A08(A09(215, 4, 102));
        A0K = C0560Iy.A08(A09(1070, 4, 102));
        A0G = C0560Iy.A08(A09(1505, 4, 64));
        A0T = C0560Iy.A08(A09(1493, 4, 94));
        A0S = C0560Iy.A08(A09(713, 4, 68));
        A0J = C0560Iy.A08(A09(1509, 4, 54));
        A0U = new String[]{A09(1527, 5, 106), A09(1261, 12, 42), A09(1207, 7, 11), A09(482, 5, 76), A09(1513, 5, 100), A09(1343, 4, k.AppCompatTheme_windowFixedWidthMinor), A09(1015, 6, 101), A09(414, 7, 15), A09(872, 4, 82), A09(754, 5, 15), A09(1021, 7, k.AppCompatTheme_windowActionBarOverlay), A09(1430, 6, 61), A09(897, 5, 97), A09(1327, 3, 10), A09(487, 3, 34), A09(261, 3, 127), A09(343, 6, 19), A09(750, 4, 91), A09(1282, 6, k.AppCompatTheme_viewInflaterClass), A09(703, 10, 97), A09(902, 11, 101), A09(219, 3, 11), A09(250, 11, 101), A09(k.AppCompatTheme_windowFixedHeightMajor, 6, 69), A09(1317, 10, 43), A09(64, 11, k.AppCompatTheme_windowFixedWidthMajor), A09(913, 7, 26), A09(1639, 8, 61), A09(1161, 5, 62), A09(327, 9, 81), A09(1664, 6, 111), A09(1698, 6, k.AppCompatTheme_windowActionModeOverlay), A09(293, 9, 52), A09(222, 12, 125), A09(1730, 4, 69), A09(759, 5, 106), A09(594, 4, 18), A09(1074, 10, 29), A09(209, 6, 79), A09(1123, 5, 62), A09(490, 10, 22), A09(1350, 4, 19), A09(1231, 4, 19), A09(1084, 4, 4), A09(1330, 5, 37), A09(935, 10, 24), A09(1288, 16, 46), A09(192, 17, k.AppCompatTheme_windowMinWidthMajor), A09(1472, 6, 88), A09(1574, 6, 26), A09(598, 8, 18), A09(876, 17, 85), A09(1221, 10, 78), A09(1179, 8, 55), A09(424, 9, 27), A09(867, 5, 102), A09(650, 13, 80), A09(1354, 6, 10), A09(53, 4, 26), A09(1214, 7, 48), A09(1540, 6, 33), A09(437, 13, 51), A09(1436, 8, 9), A09(1201, 6, 10), A09(768, 15, 21), A09(1554, 7, 65), A09(128, 8, 22), A09(1444, 11, 7), A09(1066, 4, 15), A09(858, 9, 19), A09(1310, 7, 14), A09(500, 5, 93), A09(1744, 6, 73), A09(1252, 9, 26), A09(1243, 9, 6), A09(187, 5, 60), A09(1171, 5, 65), A09(1647, 7, 57), A09(519, 11, 63), A09(1187, 9, 71), A09(k.AppCompatTheme_windowNoTitle, 4, k.AppCompatTheme_windowFixedWidthMajor), A09(1028, 9, 64), A09(1369, 13, k.AppCompatTheme_windowFixedHeightMajor), A09(1166, 5, 29), A09(689, 11, 11), A09(1634, 5, 94), A09(168, 5, 17), A09(450, 7, 48), A09(1455, 6, 125), A09(1273, 9, 86), A09(1734, 10, 34), A09(530, 11, 98), A09(578, 16, 47), A09(1674, 16, 3), A09(0, 14, 12), A09(1711, 9, 50), A09(999, 8, 100), A09(1155, 6, 69), A09(353, 14, 32), A09(1546, 8, 44), A09(367, 6, 19), A09(1054, 6, 127), A09(1704, 7, 103), A09(988, 5, 63), A09(845, 13, 30), A09(162, 6, 93), A09(1235, 8, 105), A09(663, 10, 52), A09(1136, 6, 18), A09(945, 11, 30), A09(993, 6, 8), A09(1690, 8, 67), A09(158, 4, 13), A09(1196, 5, 40), A09(1629, 5, 21), A09(1532, 8, 78), A09(929, 6, 7), A09(1478, 12, k.AppCompatTheme_windowNoTitle), A09(1110, 13, 37), A09(1518, 9, 74), A09(289, 4, 20), A09(1565, 9, 28), A09(1360, 9, 78), A09(920, 9, 92), A09(1720, 10, 25), A09(461, 10, 50), A09(479, 3, 102), A09(1461, 11, k.AppCompatTheme_windowFixedHeightMinor), A09(640, 10, 108), A09(1128, 8, 95), A09(1304, 6, 97), A09(1150, 5, 90), A09(180, 7, 11), A09(267, 9, 71), A09(835, 10, 28), A09(475, 4, 62), A09(553, 21, 50), A09(312, 11, 58), A09(824, 11, 28), A09(1585, 9, 4), A09(1088, 22, 76), A09(505, 14, 103), A09(1497, 8, 29), A09(302, 5, 36), A09(541, 12, 15), A09(307, 5, 127), A09(433, 4, 51), A09(1335, 8, 89)};
    }

    public static int A00(C0544Ii c0544Ii) {
        c0544Ii.A0Z(4);
        if (c0544Ii.A08() == AbstractC0402Cd.A0F) {
            c0544Ii.A0Z(8);
            return c0544Ii.A0E();
        }
        Log.w(A09(673, 12, k.AppCompatTheme_windowFixedHeightMajor), A09(1382, 37, 35));
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x015e A[Catch: all -> 0x0225, TryCatch #0 {all -> 0x0225, blocks: (B:7:0x001c, B:9:0x0020, B:10:0x0026, B:12:0x002a, B:13:0x0039, B:15:0x003d, B:16:0x004c, B:18:0x0052, B:19:0x0061, B:21:0x0065, B:22:0x0074, B:24:0x0078, B:25:0x007e, B:27:0x0082, B:28:0x0091, B:30:0x0095, B:31:0x00a4, B:33:0x00a8, B:34:0x00b7, B:36:0x00bb, B:37:0x00c9, B:39:0x00cd, B:40:0x00dc, B:42:0x00e0, B:43:0x00ef, B:45:0x00f3, B:46:0x0103, B:48:0x0107, B:49:0x0117, B:51:0x011b, B:52:0x012b, B:54:0x012f, B:55:0x013e, B:57:0x0142, B:94:0x0204, B:58:0x0148, B:60:0x0150, B:61:0x0156, B:63:0x015a, B:66:0x016d, B:68:0x0171, B:71:0x0183, B:73:0x0187, B:74:0x0195, B:76:0x0199, B:77:0x01a7, B:79:0x01ab, B:80:0x01b9, B:82:0x01bd, B:83:0x01cb, B:85:0x01cf, B:86:0x01dd, B:88:0x01e1, B:89:0x01ef, B:91:0x01f3, B:70:0x0175, B:65:0x015e), top: B:100:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0175 A[Catch: all -> 0x0225, TryCatch #0 {all -> 0x0225, blocks: (B:7:0x001c, B:9:0x0020, B:10:0x0026, B:12:0x002a, B:13:0x0039, B:15:0x003d, B:16:0x004c, B:18:0x0052, B:19:0x0061, B:21:0x0065, B:22:0x0074, B:24:0x0078, B:25:0x007e, B:27:0x0082, B:28:0x0091, B:30:0x0095, B:31:0x00a4, B:33:0x00a8, B:34:0x00b7, B:36:0x00bb, B:37:0x00c9, B:39:0x00cd, B:40:0x00dc, B:42:0x00e0, B:43:0x00ef, B:45:0x00f3, B:46:0x0103, B:48:0x0107, B:49:0x0117, B:51:0x011b, B:52:0x012b, B:54:0x012f, B:55:0x013e, B:57:0x0142, B:94:0x0204, B:58:0x0148, B:60:0x0150, B:61:0x0156, B:63:0x015a, B:66:0x016d, B:68:0x0171, B:71:0x0183, B:73:0x0187, B:74:0x0195, B:76:0x0199, B:77:0x01a7, B:79:0x01ab, B:80:0x01b9, B:82:0x01bd, B:83:0x01cb, B:85:0x01cf, B:86:0x01dd, B:88:0x01e1, B:89:0x01ef, B:91:0x01f3, B:70:0x0175, B:65:0x015e), top: B:100:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.internal.exoplayer2.metadata.Metadata.Entry A01(com.facebook.ads.redexgen.X.C0544Ii r7) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0413Cq.A01(com.facebook.ads.redexgen.X.Ii):com.facebook.ads.internal.exoplayer2.metadata.Metadata$Entry");
    }

    public static ApicFrame A02(C0544Ii c0544Ii) {
        String strA09;
        int atomType = c0544Ii.A08();
        int iA08 = c0544Ii.A08();
        int i = AbstractC0402Cd.A0F;
        String strA092 = A09(673, 12, k.AppCompatTheme_windowFixedHeightMajor);
        if (iA08 == i) {
            int fullVersionInt = AbstractC0402Cd.A00(c0544Ii.A08());
            if (fullVersionInt == 13) {
                strA09 = A09(279, 10, 28);
            } else {
                strA09 = fullVersionInt == 14 ? A09(405, 9, 62) : null;
            }
            if (strA09 == null) {
                StringBuilder sb = new StringBuilder();
                String mimeType = A09(610, 30, k.AppCompatTheme_windowFixedWidthMajor);
                sb.append(mimeType);
                sb.append(fullVersionInt);
                String mimeType2 = sb.toString();
                Log.w(strA092, mimeType2);
                return null;
            }
            c0544Ii.A0Z(4);
            byte[] bArr = new byte[atomType - 16];
            c0544Ii.A0c(bArr, 0, bArr.length);
            return new ApicFrame(strA09, null, 3, bArr);
        }
        Log.w(strA092, A09(79, 35, 0));
        return null;
    }

    public static CommentFrame A03(int atomSize, C0544Ii c0544Ii) {
        int iA08 = c0544Ii.A08();
        if (c0544Ii.A08() == AbstractC0402Cd.A0F) {
            c0544Ii.A0Z(8);
            String strA0R = c0544Ii.A0R(iA08 - 16);
            return new CommentFrame(A09(264, 3, 5), strA0R, strA0R);
        }
        Log.w(A09(673, 12, k.AppCompatTheme_windowFixedHeightMajor), A09(1594, 35, 13) + AbstractC0402Cd.A02(atomSize));
        return null;
    }

    public static Id3Frame A04(int value, String str, C0544Ii c0544Ii, boolean z, boolean z2) {
        Id3Frame commentFrame = null;
        int iA00 = A00(c0544Ii);
        char c2 = z2 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    iA00 = Math.min(1, iA00);
                    c2 = 3;
                    break;
                case 3:
                    if (iA00 < 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (!z) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    str = str;
                    commentFrame = new TextInformationFrame(str, null, Integer.toString(iA00));
                    c2 = 6;
                    break;
                case 6:
                    return commentFrame;
                case 7:
                    str = str;
                    commentFrame = new CommentFrame(A09(264, 3, 5), str, Integer.toString(iA00));
                    c2 = 6;
                    break;
                case '\b':
                    Log.w(A09(673, 12, k.AppCompatTheme_windowFixedHeightMajor), A09(717, 33, 79) + AbstractC0402Cd.A02(value));
                    return (Id3Frame) null;
            }
        }
    }

    public static Id3Frame A05(C0544Ii c0544Ii, int i) {
        int atomType = 0;
        int iA06 = 0;
        int iA08 = 0;
        String strA0R = null;
        String strA0R2 = null;
        int i2 = -1;
        int i3 = -1;
        int dataAtomPosition = 2;
        while (true) {
            switch (dataAtomPosition) {
                case 2:
                    c0544Ii = c0544Ii;
                    int dataAtomSize = c0544Ii.A06();
                    if (dataAtomSize >= i) {
                        dataAtomPosition = 10;
                        break;
                    } else {
                        dataAtomPosition = 3;
                        break;
                    }
                case 3:
                    c0544Ii = c0544Ii;
                    iA06 = c0544Ii.A06();
                    atomType = c0544Ii.A08();
                    iA08 = c0544Ii.A08();
                    c0544Ii.A0Z(4);
                    int atomSize = AbstractC0402Cd.A0e;
                    if (iA08 != atomSize) {
                        dataAtomPosition = 5;
                        break;
                    } else {
                        dataAtomPosition = 4;
                        break;
                    }
                case 4:
                    c0544Ii = c0544Ii;
                    int dataAtomPosition2 = atomType - 12;
                    strA0R = c0544Ii.A0R(dataAtomPosition2);
                    dataAtomPosition = 2;
                    break;
                case 5:
                    int dataAtomPosition3 = AbstractC0402Cd.A0o;
                    if (iA08 != dataAtomPosition3) {
                        dataAtomPosition = 7;
                        break;
                    } else {
                        dataAtomPosition = 6;
                        break;
                    }
                case 6:
                    c0544Ii = c0544Ii;
                    int dataAtomPosition4 = atomType - 12;
                    strA0R2 = c0544Ii.A0R(dataAtomPosition4);
                    dataAtomPosition = 2;
                    break;
                case 7:
                    int dataAtomSize2 = AbstractC0402Cd.A0F;
                    if (iA08 != dataAtomSize2) {
                        dataAtomPosition = 9;
                        break;
                    } else {
                        dataAtomPosition = 8;
                        break;
                    }
                case 8:
                    i2 = iA06;
                    i3 = atomType;
                    dataAtomPosition = 9;
                    break;
                case 9:
                    c0544Ii = c0544Ii;
                    int dataAtomPosition5 = atomType - 12;
                    c0544Ii.A0Z(dataAtomPosition5);
                    dataAtomPosition = 2;
                    break;
                case 10:
                    if (strA0R == null) {
                        dataAtomPosition = 13;
                        break;
                    } else {
                        dataAtomPosition = 11;
                        break;
                    }
                case 11:
                    if (strA0R2 == null) {
                        dataAtomPosition = 13;
                        break;
                    } else {
                        dataAtomPosition = 12;
                        break;
                    }
                case 12:
                    if (i2 != -1) {
                        dataAtomPosition = 14;
                        break;
                    } else {
                        dataAtomPosition = 13;
                        break;
                    }
                case 13:
                    return (Id3Frame) null;
                case 14:
                    C0544Ii c0544Ii2 = c0544Ii;
                    c0544Ii2.A0Y(i2);
                    c0544Ii2.A0Z(16);
                    return new InternalFrame(strA0R, strA0R2, c0544Ii2.A0R(i3 - 16));
            }
        }
    }

    public static TextInformationFrame A06(int atomSize, String str, C0544Ii c0544Ii) {
        int iA0I = 0;
        int count = 0;
        String str2 = null;
        int iA08 = c0544Ii.A08();
        char c2 = c0544Ii.A08() == AbstractC0402Cd.A0F ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    if (iA08 < 22) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0544Ii = c0544Ii;
                    c0544Ii.A0Z(10);
                    iA0I = c0544Ii.A0I();
                    if (iA0I <= 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0544Ii = c0544Ii;
                    str2 = A09(336, 0, 28) + iA0I;
                    count = c0544Ii.A0I();
                    if (count <= 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    str2 = str2 + A09(1580, 1, 40) + count;
                    c2 = 6;
                    break;
                case 6:
                    return new TextInformationFrame(str, null, str2);
                case 7:
                    Log.w(A09(673, 12, k.AppCompatTheme_windowFixedHeightMajor), A09(14, 39, 100) + AbstractC0402Cd.A02(atomSize));
                    return (TextInformationFrame) null;
            }
        }
    }

    public static TextInformationFrame A07(int atomSize, String str, C0544Ii c0544Ii) {
        int iA08 = c0544Ii.A08();
        if (c0544Ii.A08() == AbstractC0402Cd.A0F) {
            c0544Ii.A0Z(8);
            return new TextInformationFrame(str, null, c0544Ii.A0R(iA08 - 16));
        }
        Log.w(A09(673, 12, k.AppCompatTheme_windowFixedHeightMajor), A09(956, 32, 83) + AbstractC0402Cd.A02(atomSize));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static TextInformationFrame A08(C0544Ii c0544Ii) {
        String str = null;
        String[] strArr = null;
        int iA00 = A00(c0544Ii);
        String str2 = 0;
        char c2 = iA00 > 0 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    strArr = A0U;
                    if (iA00 > strArr.length) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    strArr = strArr;
                    str = strArr[iA00 - 1];
                    c2 = 4;
                    break;
                case 4:
                    if (str == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    String genreString = A09(764, 4, 72);
                    return new TextInformationFrame(genreString, str2, str);
                case 6:
                    str2 = 0;
                    str = null;
                    c2 = 4;
                    break;
                case 7:
                    String strA09 = A09(673, 12, k.AppCompatTheme_windowFixedHeightMajor);
                    String genreString2 = A09(789, 35, 75);
                    Log.w(strA09, genreString2);
                    return (TextInformationFrame) str2;
            }
        }
    }
}
