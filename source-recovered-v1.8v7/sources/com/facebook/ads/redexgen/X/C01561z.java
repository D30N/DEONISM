package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.facebook.ads.internal.exoplayer2.video.DummySurface;
import d.b.a.b.k;
import java.nio.ByteBuffer;
import java.util.Arrays;

@TargetApi(16)
/* renamed from: com.facebook.ads.redexgen.X.1z, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01561z extends C3T {
    public static boolean A0b;
    public static boolean A0c;
    public static byte[] A0d;
    public static final int[] A0e;
    public J9 A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public Surface A0N;
    public Surface A0O;
    public J8 A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final int A0T;
    public final long A0U;
    public final Context A0V;
    public final JC A0W;
    public final JL A0X;
    public final boolean A0Y;
    public final long[] A0Z;
    public final long[] A0a;

    public static String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0d, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 67);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0D() {
        A0d = new byte[]{-47, -40, -31, -45, -51, -21, -36, -2, -11, -7, -60, -75, -62, -71, -64, -64, -77, -72, -64, -74, -55, -122, 9, -52, 7, -54, -20, -46, -47, -56, -56, -30, -54, -59, -49, -70, -74, -76, -68, -34, -19, -20, -28, -23, -61, -34, -20, -27, -28, -17, -17, -69, -70, -74, -72, -30, -68, -69, -77, -71, -46, -39, -77, -69, -74, -73, -67, -75, -56, -125, 9, 34, 23, 42, 27, 21, 6, 40, 37, -24, -48, -51, -87, -74, -65, -98, -103, -59, -81, -106, -106, -32, -39, -45, -20, -86, -37, -28, -24, -23, -38, -25, -6, -30, 16, -87, -85, -79, -80, -89, -89, -63, -87, -92, -82, -103, -107, -104, -110, -108, -92, -109, -88, -101, -109, -79, -109, -90, -88, -124, 14, 9, 3, 11, 12, 1, 21, 19, -1, 6, 5, -10, 3, -6, 1, 1, -12, -7, -89, -111, -116, -67, -112, -116, -11, -30, -31, -32, -28, 118, 123, 117, 118, -57, -71, -76, -60, -72, -56, -68, -45, -120, -60, -55, -53, -48, -49, -120, -50, -60, -43, -64, -74, -67, -58, -72, -78, -48, -78, -92, -48, -63, -29, -32, -10, -24, -40, -45, -36, -35, -42, -13, 23, -5, 10, 7, 8, -59, 4, -3, -2, 12, -34, -63, -64, -66, -67, -64, -93, -95, -91, -97, -89, -98, -91, -116, -119, -113, -72, -81, -74, -98, -103, -103, -101, -57, -59, -63, -57, -85, -119, -89, -74, -95, -85, -83, -116, -89, -37, -24, -48, -50, -49, -50, -9, -31, -56, -54, -68, -87, -87, -89, -89, -4, 11, -9, -11, 1, -31, -4, -35, -33, -36, -60, -32, -60, -97, -67, -54, -62, -85, -80, -86, -77, -1, 14, 11, 12, -55, -2, 11, 16, 16, 11, 9, 22, 31, 22, 32, -29, -35, -18, -37, -38, -39, -39, 19, 33, 30, 31, 5, 24, 19, 20, 30, -15, 36, 21, 21, 20, 33, -44, -56, -39, -48, -43, -42, -58, -51, -76, -85, -78, -102, -107, -108, -91, -99, -95, -78, -83, -73, -91, -115, -3, -20, -7, -11, -20, -20, -26, -44, -68, -103, -79, -80, -75, -83, -113, -69, -80, -79, -81, -94, -75, -80, -79, -69, -98, -79, -70, -80, -79, -66, -79, -66, 19, -9, 25, 12, 7, 8, 18, -46, 27, -48, 25, 17, 7, -47, 18, 17, -43, -47, 25, 19, -36, -65, -77, -54, Byte.MAX_VALUE, -70, -73, -69, -71, -70, -58, -52, -69, -60, -73, -67, -51, -62, -25, -33, -30, -25, -30, -15, -90, -47, -82, -80, -85, 23, 10, 17, 10, 6, 24, 10, -12, 26, 25, 21, 26, 25, -25, 26, 11, 11, 10, 23, -46, -45, -52, -52, -61, -54, -61, -62, -117, -50, -54, -65, -41, -64, -65, -63, -55, -15, -23, -23, -34, -19, -39, -32, -24, -115, 122, 120, 120, 122, 7, 17, -18, -16, -20, 3, -95, -124, -126, -121, -75, -50, -35, -50, -102, -110, -106, -107, -60, -103, -84, -59, -10, -27, -14, -45, -12, -31, -14, -33, -45, 5, -60, -40, -57, -52, -46, -112, -42, -56, -42, -42, -52, -46, -47, -112, -52, -57, -50, -48, -57, -51, -48, -57, -46, -41, -82, -80, -74, -75, -84, -84, -58, -70, -66, -66, -104, -99, -103, -98, -71, -44, -33, -26, -40, -74, -37, -40, -42, -34, -109, -50, -33, -40, -38, -44, -42, -20, -71, -27, -44, -32, -40, -58, -36, -19, -40, -97, -109, -48, -106, -115, -110, -43, -115, -114, -107, 38, 26, 49, -26, 48, 34, 29, 45, 33, 12, 9, 13, 11, 12, 24, -40, -38, -32, -33, -42, -42, -16, -28, -24, -24, -62, -57, -60, -62, -10, -66, 4, -8, 0, -15, -11, -6, -1, -73, -71, -65, -66, -75, -75, -49, -61, -57, -57, -95, -90, -96, -87, 8, 15, -24, -45, -60, -43, -50, -63, -64, -96, -65, -74, -95, -67, -58, -60, -122, -91, -23, 29, 26, 9, 7, -10, 23, 28, 13, 7, -38, -16, 11, 11, -68, 9, -3, 10, 21, -68, 15, 16, 14, 1, -3, 9, -68, -1, 4, -3, 10, 3, 1, 15, -56, -68, 15, 11, -68, 0, 14, 11, 12, 12, 5, 10, 3, -68, 11, 2, 2, 15, 1, 16, -42, -68, -122, 124, 117, 117, 117, -75, -79, -70, -72, -10, -28, -43, -49, -38, -41, -46, -17, -63, -78, -65, -74, -67, -67, -80, -75, -59, -5, -24, -25, -26, -24, -37, -30, -21, -35, -41, -11, -24, -9, 15, -11, -18, -31, -34, -29, -48, -29, -40, -34, -35, -100, -45, -44, -42, -31, -44, -44, -30, -70, -68, -62, -63, -72, -72, -46, -54, -75, -65, -88, -86, -93, -85, -44, -57, -62, -61, -51, -115, -65, -44, -63, -80, -98, -121, -111, -122, -120, -112, 114, 118, -99, 28, 29, 26, -3, -36, -36, -25, -34, -37, -37, -34, -29, 22, 9, 4, 5, 15, -49, 13, 16, -44, 22, -51, 5, 19, -18, -13, 1, 0, 22, 37, 34, 35, -32, 37, 28, 26, 27, 39, -89, -107, -122, Byte.MIN_VALUE, -118, -122, -125, -85, -42, -27, -81, -70, -77, -101, -74, 33, 45, 28, 40, 32, -24, 45, 28, 47, 32, -55, -92, -48, -71, -68, -79, -74, -60, -66, -64, -82, -69, -63, -68, -69, -74, -38, -28, -63, -64, -67, -42, -19, -17, -11, -12, -21, -21, 5, -3, -24, -14, -35, -37, -41, -33, 0, -4, -32, -27, 7, -12, 14, 4, -61, -71, -78, -77, -78, -29, -74, -70, -5, -9, -16, -17, -58, -57, -12, -27, -25, -28, -59, -64, -51, -55, -47, -61, -47, -27, -28, -33, -99, -42, -30, -45, -43, -37, -34, -82, -80, -74, -75, -84, -84, -58, -66, -87, -77, -98, -102, -99, -100, 46, 33, 28, 29, 39, -25, -21, 31, 40, 40, -26, -23, -29, -64, -41, -25, -23, -60, -56, -8, -44, -43, -23, -28, -104, -119, -121, -120, -115, -72, -117, -121, -9, -39, -37, -42, -48, -60, -47, -47, -52, -47, -54, 1, -14, -1, 
        -10, -3, -3, -16, -11, 4, 4, -14, -29, -35, -24, -27, -32, -10, -75, -78, -59, -42, -61, -63, -63, -63, -108, -124, -125, Byte.MIN_VALUE, -118, -125, -103, -93, -87, -93, -90, -103, -119, -118, -120, -121, -38, -51, -56, -55, -45, -109, -36, -111, -38, -46, -56, -110, -45, -46, -106, -110, -38, -44, -100, -91, -72, -58, -62, -65, -56, -57, -68, -62, -63, -58, 115, -56, -63, -66, -63, -62, -54, -63, -127, 115, -106, -62, -73, -72, -74, 115, -64, -76, -53, 115, -59, -72, -58, -62, -65, -56, -57, -68, -62, -63, -115, 115, -95, -88, -79, -93, -99, -69, -86, -53, -48, -63, -23, -42, -44, -44, -39, -71, -75, -80, -69, -66, -18, -14, -34, -51, -20, -12, -30, -17, -54, -1, -11, -18, -18, -18, -21, 31, -94, -50, -62, -37, -48, -49, -46, -59, -64, -63, -53, -117, -60, -63, -46, -65, -35, 9, -2, -1, -3, -70, 7, -5, 18, -70, 12, -1, 13, 9, 6, 15, 14, 3, 9, 8, -70, -5, -2, 4, 15, 13, 14, -1, -2, -70, 14, 9, -44, -70, -69, -82, -70, -82, -63, -75, 4, -14, -29, -35, -25, -29, -32, -10, -92, -84, -97, -102, -97, -105, -94, -69, -54, -69, -122, Byte.MAX_VALUE, -119, -79, -123, -103, -21, -31, -38, -36, -38, 11, -34, -30, 30, 45, 42, 43, -24, 47, 42, 43, -65, -73, -73, -84, -69, -89, -82, 123, -127, 123, 125, -6, 5, -29, -92, -94, -83, -125, -68, -60, -60, -68, -63, -70, 22, 17, -56, -44, -61, -65, -59, -107, -106, -51, -52, -65, -60, -44, -43, -52, -73, -89, -84, -90, -89, 3, -16, -8, -13, -2, -18, 1, -2, 6, 6, -56, -57, -56, -74, -78, -74, -82, 3, 19, 2, 23, 10, 2, -31, -11, 12, -31, -13, -15, -14, -10, -21, -16, -2, -21, -49, -68, -87, -49, -80, -69, -84, -77, -90, -102, 123, 120, -88, -92, -127, -122, -122, -125, 50, 42, 40, 47, 21, 40, 35, 36, 46, 1, 52, 37, 37, 36, 49, 1, 25, 18, 31, 37, 32, 30, -25, 15, -7, 12, 11, 7, 6, -12, 22, -4, -5, -14, -14, 12, -16, -17, -7, -28, -30, -34, -32, -69, -103, -111, -18, -44, -42, -49};
    }

    static {
        A0D();
        A0e = new int[]{1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bw != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public C01561z(Context context, Dg dg, long j, @Nullable InterfaceC0397Bw<C0948Ye> interfaceC0397Bw, boolean z, @Nullable Handler handler, @Nullable JM jm, int i) {
        super(2, dg, interfaceC0397Bw, z);
        this.A0U = j;
        this.A0T = i;
        this.A0V = context.getApplicationContext();
        this.A0W = new JC(this.A0V);
        this.A0X = new JL(handler, jm);
        this.A0Y = A0M();
        this.A0Z = new long[10];
        this.A0a = new long[10];
        this.A0M = -9223372036854775807L;
        this.A0K = -9223372036854775807L;
        this.A0J = -9223372036854775807L;
        this.A08 = -1;
        this.A06 = -1;
        this.A01 = -1.0f;
        this.A02 = -1.0f;
        this.A0F = 1;
        A07();
    }

    public static int A00(C0418Da c0418Da, Format format) {
        int i = 0;
        int i2 = 0;
        int size = 0;
        char c2 = format.A09 != -1 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    format = format;
                    i = 0;
                    size = format.A0P.size();
                    i2 = 0;
                    c2 = 3;
                    break;
                case 3:
                    if (i2 >= size) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    format = format;
                    i += format.A0P.get(i2).length;
                    i2++;
                    c2 = 3;
                    break;
                case 5:
                    return format.A09 + i;
                case 6:
                    Format format2 = format;
                    return A01(c0418Da, format2.A0O, format2.A0F, format2.A08);
            }
        }
    }

    public static int A01(C0418Da c0418Da, String str, int i, int i2) {
        char c2 = 0;
        char c3 = 0;
        int i3 = 0;
        char c4 = 0;
        char c5 = 0;
        char c6 = 0;
        int iA04 = 0;
        char c7 = 0;
        char c8 = i != -1 ? (char) 2 : (char) 3;
        while (true) {
            switch (c8) {
                case 2:
                    if (i2 != -1) {
                        c8 = 4;
                        break;
                    } else {
                        c8 = 3;
                        break;
                    }
                case 3:
                    return -1;
                case 4:
                    str = str;
                    c2 = 5;
                    c3 = 4;
                    c7 = 1;
                    c4 = 3;
                    c6 = 2;
                    switch (str.hashCode()) {
                        case -1664118616:
                            c8 = '\r';
                            break;
                        case -1662541442:
                            c8 = 15;
                            break;
                        case 1187890754:
                            c8 = 17;
                            break;
                        case 1331836730:
                            c8 = 19;
                            break;
                        case 1599127256:
                            c8 = 21;
                            break;
                        case 1599127257:
                            c8 = 23;
                            break;
                        default:
                            c8 = 5;
                            break;
                    }
                case 5:
                    c5 = 65535;
                    c8 = 6;
                    break;
                case 6:
                    if (c5 == 0) {
                        c8 = '!';
                        break;
                    } else {
                        c8 = 7;
                        break;
                    }
                case 7:
                    if (c5 == c7) {
                        c8 = '!';
                        break;
                    } else {
                        c8 = '\b';
                        break;
                    }
                case '\b':
                    if (c5 == c6) {
                        c8 = 26;
                        break;
                    } else {
                        c8 = '\t';
                        break;
                    }
                case '\t':
                    if (c5 == c4) {
                        c8 = 25;
                        break;
                    } else {
                        c8 = '\n';
                        break;
                    }
                case '\n':
                    if (c5 == c3) {
                        c8 = '\"';
                        break;
                    } else {
                        c8 = 11;
                        break;
                    }
                case 11:
                    if (c5 == c2) {
                        c8 = '\"';
                        break;
                    } else {
                        c8 = '\f';
                        break;
                    }
                case '\f':
                    return -1;
                case '\r':
                    str = str;
                    if (!str.equals(A05(954, 10, k.AppCompatTheme_windowActionModeOverlay))) {
                        c8 = 5;
                        break;
                    } else {
                        c8 = 14;
                        break;
                    }
                case 14:
                    c5 = 0;
                    c8 = 6;
                    break;
                case 15:
                    str = str;
                    if (!str.equals(A05(1142, 10, 25))) {
                        c8 = 5;
                        break;
                    } else {
                        c8 = 16;
                        break;
                    }
                case 16:
                    c5 = 4;
                    c8 = 6;
                    break;
                case 17:
                    str = str;
                    if (!str.equals(A05(809, 13, 93))) {
                        c8 = 5;
                        break;
                    } else {
                        c8 = 18;
                        break;
                    }
                case 18:
                    c5 = 1;
                    c8 = 6;
                    break;
                case 19:
                    str = str;
                    if (!str.equals(A05(778, 9, 27))) {
                        c8 = 5;
                        break;
                    } else {
                        c8 = 20;
                        break;
                    }
                case 20:
                    c5 = 2;
                    c8 = 6;
                    break;
                case 21:
                    str = str;
                    if (!str.equals(A05(1038, 19, 33))) {
                        c8 = 5;
                        break;
                    } else {
                        c8 = 22;
                        break;
                    }
                case 22:
                    c5 = 3;
                    c8 = 6;
                    break;
                case 23:
                    str = str;
                    if (!str.equals(A05(377, 19, 96))) {
                        c8 = 5;
                        break;
                    } else {
                        c8 = 24;
                        break;
                    }
                case 24:
                    c5 = 5;
                    c8 = 6;
                    break;
                case 25:
                    iA04 = i * i2;
                    i3 = 2;
                    c8 = '#';
                    break;
                case 26:
                    if (!A05(1294, 14, 126).equals(C0560Iy.A05)) {
                        c8 = 27;
                        break;
                    } else {
                        c8 = 31;
                        break;
                    }
                case 27:
                    if (!A05(1136, 6, 30).equals(C0560Iy.A04)) {
                        c8 = ' ';
                        break;
                    } else {
                        c8 = 28;
                        break;
                    }
                case 28:
                    if (!A05(923, 6, 55).equals(C0560Iy.A05)) {
                        c8 = 29;
                        break;
                    } else {
                        c8 = 31;
                        break;
                    }
                case 29:
                    if (!A05(822, 4, 106).equals(C0560Iy.A05)) {
                        c8 = ' ';
                        break;
                    } else {
                        c8 = 30;
                        break;
                    }
                case 30:
                    c0418Da = c0418Da;
                    if (!c0418Da.A05) {
                        c8 = ' ';
                        break;
                    } else {
                        c8 = 31;
                        break;
                    }
                case 31:
                    return -1;
                case ' ':
                    iA04 = C0560Iy.A04(i, 16) * C0560Iy.A04(i2, 16) * 16 * 16;
                    i3 = 2;
                    c8 = '#';
                    break;
                case '!':
                    iA04 = i * i2;
                    i3 = 2;
                    c8 = '#';
                    break;
                case '\"':
                    iA04 = i * i2;
                    i3 = 4;
                    c8 = '#';
                    break;
                case '#':
                    return (iA04 * 3) / (i3 * 2);
            }
        }
    }

    public static Point A02(C0418Da c0418Da, Format format) throws C0424Dj {
        boolean z = format.A08 > format.A0F;
        int i = z ? format.A08 : format.A0F;
        int i2 = z ? format.A0F : format.A08;
        float f = i2 / i;
        for (int i3 : A0e) {
            int i4 = (int) (i3 * f);
            if (i3 <= i || i4 <= i2) {
                return null;
            }
            if (C0560Iy.A01 >= 21) {
                int i5 = z ? i4 : i3;
                if (!z) {
                    i3 = i4;
                }
                Point pointA0E = c0418Da.A0E(i5, i3);
                if (c0418Da.A0H(pointA0E.x, pointA0E.y, format.A01)) {
                    return pointA0E;
                }
            } else {
                int iA04 = C0560Iy.A04(i3, 16) * 16;
                int iA042 = C0560Iy.A04(i4, 16) * 16;
                int formatShortEdgePx = iA04 * iA042;
                int shortEdgePx = C0426Dl.A00();
                if (formatShortEdgePx <= shortEdgePx) {
                    int shortEdgePx2 = z ? iA042 : iA04;
                    if (!z) {
                        iA04 = iA042;
                    }
                    return new Point(shortEdgePx2, iA04);
                }
            }
        }
        return null;
    }

    @SuppressLint({"InlinedApi"})
    private final MediaFormat A03(Format format, J8 j8, boolean z, int i) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(A05(1290, 4, 6), format.A0O);
        mediaFormat.setInteger(A05(163, 5, 13), format.A0F);
        mediaFormat.setInteger(A05(589, 6, 97), format.A08);
        C0427Dm.A06(mediaFormat, format.A0P);
        C0427Dm.A03(mediaFormat, A05(851, 10, k.AppCompatTheme_windowFixedWidthMajor), format.A01);
        C0427Dm.A04(mediaFormat, A05(748, 16, 44), format.A0B);
        C0427Dm.A02(mediaFormat, format.A0J);
        mediaFormat.setInteger(A05(580, 9, k.AppCompatTheme_windowFixedHeightMajor), j8.A02);
        mediaFormat.setInteger(A05(396, 10, 15), j8.A00);
        C0427Dm.A04(mediaFormat, A05(168, 14, 24), j8.A01);
        int i2 = 0;
        char c2 = C0560Iy.A01 >= 23 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    mediaFormat = mediaFormat;
                    i2 = 0;
                    mediaFormat.setInteger(A05(521, 8, 27), 0);
                    c2 = 3;
                    break;
                case 3:
                    if (!z) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    mediaFormat = mediaFormat;
                    mediaFormat.setInteger(A05(929, 8, 45), i2);
                    c2 = 5;
                    break;
                case 5:
                    if (i == 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    mediaFormat = mediaFormat;
                    A0K(mediaFormat, i);
                    c2 = 7;
                    break;
                case 7:
                    return mediaFormat;
            }
        }
    }

    private final J8 A04(C0418Da c0418Da, Format format, Format[] formatArr) throws C0424Dj {
        Format[] formatArr2 = formatArr;
        C0418Da c0418Da2 = c0418Da;
        Format format2 = format;
        int i = 0;
        Point pointA02 = null;
        int i2 = 0;
        int length = 0;
        boolean z = false;
        String strA05 = null;
        Format streamFormat = null;
        boolean z2 = false;
        int iMax = 0;
        int iMax2 = 0;
        int iMax3 = 0;
        String strA052 = null;
        int i3 = format2.A0F;
        int i4 = format2.A08;
        int iA00 = A00(c0418Da2, format2);
        char c2 = formatArr2.length == 1 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return new J8(i3, i4, iA00);
                case 3:
                    formatArr2 = formatArr2;
                    z2 = false;
                    length = formatArr2.length;
                    iMax = iA00;
                    iMax2 = i4;
                    iMax3 = i3;
                    i = 0;
                    c2 = 4;
                    break;
                case 4:
                    if (i >= length) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0418Da2 = c0418Da2;
                    format2 = format2;
                    formatArr2 = formatArr2;
                    streamFormat = formatArr2[i];
                    if (!A0V(c0418Da2.A03, format2, streamFormat)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    streamFormat = streamFormat;
                    i2 = -1;
                    if (streamFormat.A0F == -1) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    streamFormat = streamFormat;
                    if (streamFormat.A08 != i2) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    z = true;
                    c2 = '\t';
                    break;
                case '\t':
                    c0418Da2 = c0418Da2;
                    streamFormat = streamFormat;
                    z2 |= z;
                    iMax3 = Math.max(iMax3, streamFormat.A0F);
                    iMax2 = Math.max(iMax2, streamFormat.A08);
                    iMax = Math.max(iMax, A00(c0418Da2, streamFormat));
                    c2 = '\n';
                    break;
                case '\n':
                    i++;
                    c2 = 4;
                    break;
                case 11:
                    z = false;
                    c2 = '\t';
                    break;
                case '\f':
                    if (!z2) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c0418Da2 = c0418Da2;
                    format2 = format2;
                    StringBuilder sb = new StringBuilder();
                    sb.append(A05(1057, 43, 16));
                    sb.append(iMax3);
                    strA052 = A05(202, 1, 92);
                    sb.append(strA052);
                    sb.append(iMax2);
                    String string = sb.toString();
                    strA05 = A05(352, 23, 9);
                    Log.w(strA05, string);
                    pointA02 = A02(c0418Da2, format2);
                    if (pointA02 == null) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    c0418Da2 = c0418Da2;
                    format2 = format2;
                    strA052 = strA052;
                    strA05 = strA05;
                    pointA02 = pointA02;
                    iMax3 = Math.max(iMax3, pointA02.x);
                    iMax2 = Math.max(iMax2, pointA02.y);
                    iMax = Math.max(iMax, A01(c0418Da2, format2.A0O, iMax3, iMax2));
                    Log.w(strA05, A05(1152, 34, 87) + iMax3 + strA052 + iMax2);
                    c2 = 15;
                    break;
                case 15:
                    return new J8(iMax3, iMax2, iMax);
            }
        }
    }

    private void A06() {
        C01561z c01561z = this;
        MediaCodec mediaCodecA1C = null;
        c01561z.A0R = false;
        char c2 = C0560Iy.A01 >= 23 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c01561z = c01561z;
                    if (!c01561z.A0S) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c01561z = c01561z;
                    mediaCodecA1C = c01561z.A1C();
                    if (mediaCodecA1C == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c01561z = c01561z;
                    mediaCodecA1C = mediaCodecA1C;
                    c01561z.A00 = new J9(c01561z, mediaCodecA1C);
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    private void A07() {
        this.A0E = -1;
        this.A0C = -1;
        this.A03 = -1.0f;
        this.A0D = -1;
    }

    private void A08() {
        if (this.A09 > 0) {
            long elapsedMs = SystemClock.elapsedRealtime();
            this.A0X.A02(this.A09, elapsedMs - this.A0H);
            this.A09 = 0;
            this.A0H = elapsedMs;
        }
    }

    private void A09() {
        C01561z c01561z = this;
        char c2 = c01561z.A08 == -1 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c01561z = c01561z;
                    if (c01561z.A06 == -1) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c01561z = c01561z;
                    if (c01561z.A0E != c01561z.A08) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c01561z = c01561z;
                    if (c01561z.A0C != c01561z.A06) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c01561z = c01561z;
                    if (c01561z.A0D != c01561z.A07) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c01561z = c01561z;
                    if (c01561z.A03 == c01561z.A01) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c01561z = c01561z;
                    c01561z.A0X.A01(c01561z.A08, c01561z.A06, c01561z.A07, c01561z.A01);
                    c01561z.A0E = c01561z.A08;
                    c01561z.A0C = c01561z.A06;
                    c01561z.A0D = c01561z.A07;
                    c01561z.A03 = c01561z.A01;
                    c2 = '\b';
                    break;
                case '\b':
                    return;
            }
        }
    }

    private void A0A() {
        if (this.A0R) {
            this.A0X.A03(this.A0O);
        }
    }

    private void A0B() {
        C01561z c01561z = this;
        char c2 = c01561z.A0E == -1 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c01561z = c01561z;
                    if (c01561z.A0C == -1) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c01561z = c01561z;
                    c01561z.A0X.A01(c01561z.A0E, c01561z.A0C, c01561z.A0D, c01561z.A03);
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    private void A0C() {
        C01561z c01561z = this;
        long jElapsedRealtime = 0;
        char c2 = c01561z.A0U > 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c01561z = c01561z;
                    jElapsedRealtime = SystemClock.elapsedRealtime() + c01561z.A0U;
                    c2 = 3;
                    break;
                case 3:
                    c01561z.A0J = jElapsedRealtime;
                    return;
                case 4:
                    jElapsedRealtime = -9223372036854775807L;
                    c2 = 3;
                    break;
            }
        }
    }

    private final void A0E(int i) {
        super.A0U.A02 += i;
        this.A09 += i;
        this.A05 += i;
        super.A0U.A05 = Math.max(this.A05, super.A0U.A05);
        if (this.A09 >= this.A0T) {
            A08();
        }
    }

    private final void A0F(MediaCodec mediaCodec, int i, long j) {
        C0557Iv.A02(A05(306, 15, 108));
        mediaCodec.releaseOutputBuffer(i, false);
        C0557Iv.A00();
        A0E(1);
    }

    private final void A0G(MediaCodec mediaCodec, int i, long j) {
        A09();
        C0557Iv.A02(A05(424, 19, 98));
        mediaCodec.releaseOutputBuffer(i, true);
        C0557Iv.A00();
        this.A0L = SystemClock.elapsedRealtime() * 1000;
        super.A0U.A06++;
        this.A05 = 0;
        A1R();
    }

    private final void A0H(MediaCodec mediaCodec, int i, long j) {
        C0557Iv.A02(A05(1330, 15, k.AppCompatTheme_windowNoTitle));
        mediaCodec.releaseOutputBuffer(i, false);
        C0557Iv.A00();
        super.A0U.A08++;
    }

    @TargetApi(21)
    private final void A0I(MediaCodec mediaCodec, int i, long j, long j2) {
        A09();
        C0557Iv.A02(A05(424, 19, 98));
        mediaCodec.releaseOutputBuffer(i, j2);
        C0557Iv.A00();
        this.A0L = SystemClock.elapsedRealtime() * 1000;
        super.A0U.A06++;
        this.A05 = 0;
        A1R();
    }

    @TargetApi(23)
    public static void A0J(MediaCodec mediaCodec, Surface surface) {
        mediaCodec.setOutputSurface(surface);
    }

    @TargetApi(21)
    public static void A0K(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled(A05(443, 17, 27), true);
        mediaFormat.setInteger(A05(505, 16, 32), i);
    }

    private void A0L(Surface surface) throws Throwable {
        C01561z c01561z = this;
        C0418Da c0418DaA1D = null;
        int i = 0;
        int iA73 = 0;
        MediaCodec mediaCodecA1C = null;
        char c2 = surface == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c01561z = c01561z;
                    if (c01561z.A0N == null) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c01561z = c01561z;
                    surface = c01561z.A0N;
                    c2 = 4;
                    break;
                case 4:
                    c01561z = c01561z;
                    surface = surface;
                    if (c01561z.A0O == surface) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c01561z = c01561z;
                    surface = surface;
                    c01561z.A0O = surface;
                    iA73 = c01561z.A73();
                    i = 2;
                    if (iA73 == 1) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (iA73 != i) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c01561z = c01561z;
                    mediaCodecA1C = c01561z.A1C();
                    if (C0560Iy.A01 < 23) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    mediaCodecA1C = mediaCodecA1C;
                    if (mediaCodecA1C == null) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    surface = surface;
                    if (surface == null) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c01561z = c01561z;
                    if (!c01561z.A0Q) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 11:
                    surface = surface;
                    mediaCodecA1C = mediaCodecA1C;
                    A0J(mediaCodecA1C, surface);
                    c2 = '\f';
                    break;
                case '\f':
                    surface = surface;
                    if (surface == null) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c01561z = c01561z;
                    surface = surface;
                    if (surface == c01561z.A0N) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    c01561z = c01561z;
                    c01561z.A0B();
                    c01561z.A06();
                    if (iA73 != i) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    c01561z = c01561z;
                    c01561z.A0C();
                    c2 = 16;
                    break;
                case 16:
                    return;
                case 17:
                    c01561z = c01561z;
                    c01561z.A07();
                    c01561z.A06();
                    c2 = 16;
                    break;
                case 18:
                    c01561z = c01561z;
                    c01561z.A1G();
                    c01561z.A1I();
                    c2 = '\f';
                    break;
                case 19:
                    surface = surface;
                    if (surface == null) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    c01561z = c01561z;
                    surface = surface;
                    if (surface == c01561z.A0N) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    c01561z = c01561z;
                    c01561z.A0B();
                    c01561z.A0A();
                    c2 = 16;
                    break;
                case 22:
                    c01561z = c01561z;
                    c0418DaA1D = c01561z.A1D();
                    if (c0418DaA1D == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    c01561z = c01561z;
                    c0418DaA1D = c0418DaA1D;
                    if (!c01561z.A0T(c0418DaA1D)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 24:
                    c01561z = c01561z;
                    c0418DaA1D = c0418DaA1D;
                    c01561z.A0N = DummySurface.A01(c01561z.A0V, c0418DaA1D.A05);
                    surface = c01561z.A0N;
                    c2 = 4;
                    break;
            }
        }
    }

    public static boolean A0M() {
        boolean z = false;
        char c2 = C0560Iy.A01 <= 22 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    if (!A05(96, 6, 50).equals(C0560Iy.A02)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (!A05(1200, 6, 19).equals(C0560Iy.A04)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z = true;
                    c2 = 5;
                    break;
                case 5:
                    return z;
                case 6:
                    z = false;
                    c2 = 5;
                    break;
            }
        }
    }

    public static boolean A0N(long j) {
        boolean z = false;
        char c2 = j < -30000 ? (char) 2 : (char) 4;
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

    public static boolean A0O(long j) {
        boolean z = false;
        char c2 = j < -500000 ? (char) 2 : (char) 4;
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

    private final boolean A0P(long j, long j2) {
        return A0O(j);
    }

    private final boolean A0Q(long j, long j2) {
        return A0N(j);
    }

    private final boolean A0R(long j, long j2) {
        boolean z = false;
        char c2 = A0N(j) ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    if (j2 <= 100000) {
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

    private final boolean A0S(MediaCodec mediaCodec, int i, long j, long j2) throws Throwable {
        int iA0z = A0z(j2);
        if (iA0z == 0) {
            return false;
        }
        super.A0U.A03++;
        A0E(this.A04 + iA0z);
        A1F();
        return true;
    }

    private boolean A0T(C0418Da c0418Da) {
        C01561z c01561z = this;
        boolean z = false;
        char c2 = C0560Iy.A01 >= 23 ? (char) 2 : '\b';
        while (true) {
            switch (c2) {
                case 2:
                    c01561z = c01561z;
                    if (!c01561z.A0S) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 3:
                    c01561z = c01561z;
                    c0418Da = c0418Da;
                    if (!c01561z.A0U(c0418Da.A02)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 4:
                    c0418Da = c0418Da;
                    if (!c0418Da.A05) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c01561z = c01561z;
                    if (!DummySurface.A05(c01561z.A0V)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    z = true;
                    c2 = 7;
                    break;
                case 7:
                    return z;
                case '\b':
                    z = false;
                    c2 = 7;
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:368:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0931  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0948 A[Catch: all -> 0x0950, TryCatch #0 {, blocks: (B:9:0x001b, B:11:0x001f, B:12:0x0026, B:370:0x090a, B:373:0x0910, B:389:0x094a, B:388:0x0948, B:385:0x0937, B:376:0x091c, B:372:0x090e, B:14:0x002b, B:17:0x003e, B:20:0x0051, B:23:0x0065, B:26:0x0078, B:29:0x008b, B:32:0x009f, B:35:0x00b3, B:38:0x00c6, B:41:0x00da, B:44:0x00ed, B:47:0x00ff, B:50:0x0113, B:53:0x0125, B:56:0x0138, B:59:0x014b, B:62:0x015e, B:65:0x0172, B:68:0x0186, B:71:0x0198, B:74:0x01ab, B:77:0x01bf, B:80:0x01d3, B:83:0x01e7, B:86:0x01fb, B:89:0x020f, B:92:0x0223, B:95:0x0237, B:98:0x024b, B:101:0x025f, B:104:0x0273, B:107:0x0287, B:110:0x029a, B:113:0x02ae, B:116:0x02c2, B:119:0x02d5, B:122:0x02e8, B:125:0x02fb, B:128:0x030e, B:131:0x0321, B:134:0x0334, B:137:0x0347, B:140:0x035a, B:143:0x036d, B:146:0x0380, B:149:0x0393, B:152:0x03a6, B:155:0x03b8, B:158:0x03cb, B:161:0x03de, B:164:0x03f0, B:167:0x0404, B:170:0x0418, B:173:0x042b, B:176:0x043e, B:179:0x0451, B:182:0x0464, B:185:0x0477, B:188:0x048a, B:191:0x049c, B:194:0x04ad, B:197:0x04be, B:200:0x04d1, B:203:0x04e4, B:206:0x04f7, B:209:0x050a, B:212:0x051d, B:215:0x0530, B:218:0x0543, B:221:0x0556, B:224:0x0569, B:227:0x057c, B:230:0x058f, B:233:0x05a2, B:236:0x05b5, B:239:0x05c8, B:242:0x05db, B:245:0x05ee, B:248:0x0602, B:251:0x0616, B:254:0x0629, B:257:0x063c, B:260:0x0650, B:263:0x0664, B:266:0x0678, B:269:0x068c, B:272:0x06a0, B:275:0x06b3, B:278:0x06c6, B:281:0x06da, B:284:0x06ec, B:287:0x0700, B:290:0x0713, B:293:0x0727, B:296:0x073b, B:299:0x074d, B:302:0x0760, B:305:0x0774, B:308:0x0787, B:311:0x079b, B:314:0x07af, B:317:0x07c3, B:320:0x07d7, B:323:0x07eb, B:326:0x07ff, B:329:0x0813, B:332:0x0826, B:335:0x0839, B:338:0x084d, B:341:0x0860, B:344:0x0873, B:347:0x0886, B:350:0x0898, B:353:0x08aa, B:356:0x08bd, B:359:0x08cf, B:362:0x08e2, B:365:0x08f5, B:390:0x094c), top: B:396:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A0U(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 3102
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C01561z.A0U(java.lang.String):boolean");
    }

    public static boolean A0V(boolean z, Format format, Format format2) {
        boolean z2 = false;
        char c2 = format.A0O.equals(format2.A0O) ? (char) 2 : '\t';
        while (true) {
            switch (c2) {
                case 2:
                    format = format;
                    format2 = format2;
                    if (format.A0B != format2.A0B) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (!z) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 4:
                    format = format;
                    format2 = format2;
                    if (format.A0F != format2.A0F) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    format = format;
                    format2 = format2;
                    if (format.A08 != format2.A08) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    format = format;
                    format2 = format2;
                    if (!C0560Iy.A0j(format.A0J, format2.A0J)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    z2 = true;
                    c2 = '\b';
                    break;
                case '\b':
                    return z2;
                case '\t':
                    z2 = false;
                    c2 = '\b';
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3T, com.facebook.ads.redexgen.X.EN
    public final void A12() {
        this.A08 = -1;
        this.A06 = -1;
        this.A01 = -1.0f;
        this.A02 = -1.0f;
        this.A0M = -9223372036854775807L;
        this.A0K = -9223372036854775807L;
        this.A0A = 0;
        A07();
        A06();
        this.A0W.A08();
        this.A00 = null;
        this.A0S = false;
        try {
            super.A12();
        } finally {
            super.A0U.A00();
            this.A0X.A05(super.A0U);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3T, com.facebook.ads.redexgen.X.EN
    public final void A13() {
        super.A13();
        this.A09 = 0;
        this.A0H = SystemClock.elapsedRealtime();
        this.A0L = SystemClock.elapsedRealtime() * 1000;
    }

    @Override // com.facebook.ads.redexgen.X.C3T, com.facebook.ads.redexgen.X.EN
    public final void A14() {
        this.A0J = -9223372036854775807L;
        A08();
        super.A14();
    }

    @Override // com.facebook.ads.redexgen.X.C3T, com.facebook.ads.redexgen.X.EN
    public final void A15(long j, boolean z) throws C03479w {
        C01561z c01561z = this;
        super.A15(j, z);
        c01561z.A06();
        c01561z.A0I = -9223372036854775807L;
        c01561z.A05 = 0;
        c01561z.A0K = -9223372036854775807L;
        int i = c01561z.A0A;
        char c2 = i != 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c01561z = c01561z;
                    c01561z.A0M = c01561z.A0Z[i - 1];
                    c01561z.A0A = 0;
                    c2 = 3;
                    break;
                case 3:
                    if (!z) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c01561z = c01561z;
                    c01561z.A0C();
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    c01561z = c01561z;
                    c01561z.A0J = -9223372036854775807L;
                    c2 = 5;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3T, com.facebook.ads.redexgen.X.EN
    public final void A16(boolean z) throws C03479w {
        boolean z2 = false;
        super.A16(z);
        this.A0G = A11().A00;
        char c2 = this.A0G != 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z2 = true;
                    c2 = 3;
                    break;
                case 3:
                    C01561z c01561z = this;
                    c01561z.A0S = z2;
                    c01561z.A0X.A06(((C3T) c01561z).A0U);
                    c01561z.A0W.A09();
                    return;
                case 4:
                    z2 = false;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.EN
    public final void A17(Format[] formatArr, long j) throws C03479w {
        C01561z c01561z = this;
        int i = 0;
        char c2 = c01561z.A0M == -9223372036854775807L ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c01561z = c01561z;
                    c01561z.A0M = j;
                    c2 = 3;
                    break;
                case 3:
                    super.A17(formatArr, j);
                    return;
                case 4:
                    c01561z = c01561z;
                    i = c01561z.A0A;
                    if (i != c01561z.A0Z.length) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c01561z = c01561z;
                    Log.w(A05(352, 23, 9), A05(661, 45, 89) + c01561z.A0Z[c01561z.A0A - 1]);
                    c2 = 6;
                    break;
                case 6:
                    c01561z = c01561z;
                    long[] jArr = c01561z.A0Z;
                    int i2 = c01561z.A0A;
                    jArr[i2 - 1] = j;
                    c01561z.A0a[i2 - 1] = c01561z.A0K;
                    c2 = 3;
                    break;
                case 7:
                    c01561z = c01561z;
                    c01561z.A0A = i + 1;
                    c2 = 6;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3T
    public final int A1A(MediaCodec mediaCodec, C0418Da c0418Da, Format format, Format format2) {
        C01561z c01561z = this;
        int i = 0;
        char c2 = A0V(c0418Da.A03, format, format2) ? (char) 2 : '\t';
        while (true) {
            switch (c2) {
                case 2:
                    c01561z = c01561z;
                    format2 = format2;
                    if (format2.A0F > c01561z.A0P.A02) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c01561z = c01561z;
                    format2 = format2;
                    if (format2.A08 > c01561z.A0P.A00) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c01561z = c01561z;
                    c0418Da = c0418Da;
                    format2 = format2;
                    if (A00(c0418Da, format2) > c01561z.A0P.A01) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    format = format;
                    format2 = format2;
                    if (!format.A0P(format2)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    i = 1;
                    c2 = 7;
                    break;
                case 7:
                    return i;
                case '\b':
                    i = 3;
                    c2 = 7;
                    break;
                case '\t':
                    return 0;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bw != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    @Override // com.facebook.ads.redexgen.X.C3T
    public final int A1B(Dg dg, InterfaceC0397Bw<C0948Ye> interfaceC0397Bw, Format format) throws C0424Dj {
        InterfaceC0397Bw<C0948Ye> interfaceC0397Bw2 = interfaceC0397Bw;
        Format format2 = format;
        Dg dg2 = dg;
        boolean z = false;
        int i = 0;
        int adaptiveSupport = 0;
        C0418Da c0418DaA60 = null;
        boolean zA0H = false;
        int i2 = 0;
        DrmInitData drmInitData = null;
        int i3 = 0;
        boolean z2 = false;
        String str = format2.A0O;
        int i4 = 0;
        char c2 = !C0537Ib.A0D(str) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return 0;
                case 3:
                    format2 = format2;
                    z2 = false;
                    drmInitData = format2.A0H;
                    if (drmInitData == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i3 = 0;
                    c2 = 5;
                    break;
                case 5:
                    drmInitData = drmInitData;
                    if (i3 >= drmInitData.A01) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    drmInitData = drmInitData;
                    z2 |= drmInitData.A03(i3).A03;
                    i3++;
                    c2 = 5;
                    break;
                case 7:
                    dg2 = dg2;
                    str = str;
                    c0418DaA60 = dg2.A60(str, z2);
                    i2 = 2;
                    z = true;
                    if (c0418DaA60 != null) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    if (!z2) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    dg2 = dg2;
                    str = str;
                    i4 = 0;
                    if (dg2.A60(str, false) == null) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    return i2;
                case 11:
                    i2 = 1;
                    c2 = '\n';
                    break;
                case '\f':
                    interfaceC0397Bw2 = interfaceC0397Bw2;
                    drmInitData = drmInitData;
                    if (!EN.A0x(interfaceC0397Bw2, drmInitData)) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case '\r':
                    return i2;
                case 14:
                    format2 = format2;
                    c0418DaA60 = c0418DaA60;
                    zA0H = c0418DaA60.A0I(format2.A0K);
                    if (!zA0H) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    format2 = format2;
                    if (format2.A0F <= 0) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    format2 = format2;
                    if (format2.A08 <= 0) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    if (C0560Iy.A01 < 21) {
                        c2 = 28;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    format2 = format2;
                    c0418DaA60 = c0418DaA60;
                    zA0H = c0418DaA60.A0H(format2.A0F, format2.A08, format2.A01);
                    c2 = 19;
                    break;
                case 19:
                    c0418DaA60 = c0418DaA60;
                    if (!c0418DaA60.A03) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    adaptiveSupport = 16;
                    c2 = 21;
                    break;
                case 21:
                    c0418DaA60 = c0418DaA60;
                    if (!c0418DaA60.A06) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    i4 = 32;
                    c2 = 23;
                    break;
                case 23:
                    if (!zA0H) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 24:
                    i = 4;
                    c2 = 25;
                    break;
                case 25:
                    return adaptiveSupport | i4 | i;
                case 26:
                    i = 3;
                    c2 = 25;
                    break;
                case 27:
                    adaptiveSupport = 8;
                    c2 = 21;
                    break;
                case 28:
                    format2 = format2;
                    if (format2.A0F * format2.A08 > C0426Dl.A00()) {
                        c2 = 31;
                        break;
                    } else {
                        c2 = 29;
                        break;
                    }
                case 29:
                    zA0H = z;
                    if (!zA0H) {
                        c2 = 30;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 30:
                    format2 = format2;
                    String str2 = A05(543, 29, 48) + format2.A0F + A05(202, 1, 92) + format2.A08 + A05(22, 3, 105) + C0560Iy.A03 + A05(504, 1, 101);
                    c2 = 19;
                    break;
                case 31:
                    z = false;
                    c2 = 29;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3T
    @CallSuper
    public final void A1F() throws Throwable {
        super.A1F();
        this.A04 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.C3T
    @CallSuper
    public final void A1G() throws Throwable {
        C01561z c01561z = this;
        Throwable th = null;
        Surface surface = null;
        Surface surface2 = null;
        Surface surface3 = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        c01561z = c01561z;
                        super.A1G();
                        c01561z.A04 = 0;
                        surface = c01561z.A0N;
                        if (surface == null) {
                            c2 = 7;
                            break;
                        } else {
                            c2 = 4;
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        c01561z.A04 = 0;
                        surface2 = c01561z.A0N;
                        if (surface2 == null) {
                            c2 = '\f';
                            break;
                        } else {
                            c2 = '\t';
                            break;
                        }
                    }
                case 4:
                    c01561z = c01561z;
                    surface = surface;
                    if (c01561z.A0O != surface) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c01561z = c01561z;
                    surface3 = null;
                    c01561z.A0O = null;
                    c2 = 6;
                    break;
                case 6:
                    c01561z = c01561z;
                    c01561z.A0N.release();
                    c01561z.A0N = surface3;
                    c2 = 7;
                    break;
                case 7:
                    return;
                case '\t':
                    c01561z = c01561z;
                    surface2 = surface2;
                    if (c01561z.A0O != surface2) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c01561z = c01561z;
                    surface3 = null;
                    c01561z.A0O = null;
                    c2 = 11;
                    break;
                case 11:
                    c01561z = c01561z;
                    c01561z.A0N.release();
                    c01561z.A0N = surface3;
                    c2 = '\f';
                    break;
                case '\f':
                    throw th;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3T
    @CallSuper
    public final void A1J(long j) {
        C01561z c01561z = this;
        int i = 0;
        int i2 = 0;
        c01561z.A04--;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    c01561z = c01561z;
                    i = c01561z.A0A;
                    if (i == 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c01561z = c01561z;
                    i2 = 0;
                    if (j < c01561z.A0a[0]) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c01561z = c01561z;
                    long[] jArr = c01561z.A0Z;
                    c01561z.A0M = jArr[i2];
                    c01561z.A0A = i - 1;
                    System.arraycopy(jArr, 1, jArr, i2, c01561z.A0A);
                    long[] jArr2 = c01561z.A0a;
                    System.arraycopy(jArr2, 1, jArr2, i2, c01561z.A0A);
                    c2 = 2;
                    break;
                case 5:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3T
    public final void A1K(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        C01561z c01561z = this;
        int i = 0;
        int integer = 0;
        int integer2 = 0;
        boolean z = false;
        String strA05 = A05(826, 10, 112);
        boolean zContainsKey = mediaFormat.containsKey(strA05);
        String strA052 = A05(1224, 8, k.AppCompatTheme_windowFixedWidthMajor);
        String strA053 = A05(284, 11, 89);
        String strA054 = A05(203, 9, 85);
        char c2 = zContainsKey ? (char) 2 : (char) 18;
        while (true) {
            switch (c2) {
                case 2:
                    mediaFormat = mediaFormat;
                    strA054 = strA054;
                    if (!mediaFormat.containsKey(strA054)) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    mediaFormat = mediaFormat;
                    strA053 = strA053;
                    if (!mediaFormat.containsKey(strA053)) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    mediaFormat = mediaFormat;
                    strA052 = strA052;
                    if (!mediaFormat.containsKey(strA052)) {
                        c2 = 18;
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
                    if (!z) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    mediaFormat = mediaFormat;
                    strA05 = strA05;
                    strA054 = strA054;
                    integer2 = (mediaFormat.getInteger(strA05) - mediaFormat.getInteger(strA054)) + 1;
                    c2 = '\b';
                    break;
                case '\b':
                    c01561z = c01561z;
                    c01561z.A08 = integer2;
                    if (!z) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    mediaFormat = mediaFormat;
                    strA052 = strA052;
                    strA053 = strA053;
                    integer = (mediaFormat.getInteger(strA053) - mediaFormat.getInteger(strA052)) + 1;
                    c2 = '\n';
                    break;
                case '\n':
                    c01561z = c01561z;
                    c01561z.A06 = integer;
                    c01561z.A01 = c01561z.A02;
                    if (C0560Iy.A01 < 21) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c01561z = c01561z;
                    i = c01561z.A0B;
                    if (i == 90) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    if (i != 270) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c01561z = c01561z;
                    int i2 = c01561z.A08;
                    c01561z.A08 = c01561z.A06;
                    c01561z.A06 = i2;
                    c01561z.A01 = 1.0f / c01561z.A01;
                    c2 = 14;
                    break;
                case 14:
                    mediaCodec.setVideoScalingMode(c01561z.A0F);
                    return;
                case 15:
                    c01561z = c01561z;
                    c01561z.A07 = c01561z.A0B;
                    c2 = 14;
                    break;
                case 16:
                    mediaFormat = mediaFormat;
                    integer = mediaFormat.getInteger(A05(589, 6, 97));
                    c2 = '\n';
                    break;
                case 17:
                    mediaFormat = mediaFormat;
                    integer2 = mediaFormat.getInteger(A05(163, 5, 13));
                    c2 = '\b';
                    break;
                case 18:
                    z = false;
                    c2 = 6;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3T
    public final void A1L(Format format) throws C03479w {
        super.A1L(format);
        this.A0X.A04(format);
        this.A02 = format.A02;
        this.A0B = format.A0B;
    }

    @Override // com.facebook.ads.redexgen.X.C3T
    @CallSuper
    public final void A1M(YT yt) {
        C01561z c01561z = this;
        c01561z.A04++;
        c01561z.A0K = Math.max(yt.A00, c01561z.A0K);
        char c2 = C0560Iy.A01 < 23 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c01561z = c01561z;
                    if (!c01561z.A0S) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c01561z = c01561z;
                    c01561z.A1R();
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3T
    public final void A1N(C0418Da c0418Da, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) throws C0424Dj {
        C01561z c01561z = this;
        c01561z.A0P = c01561z.A04(c0418Da, format, c01561z.A19());
        MediaFormat mediaFormatA03 = c01561z.A03(format, c01561z.A0P, c01561z.A0Y, c01561z.A0G);
        char c2 = c01561z.A0O == null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c01561z = c01561z;
                    c0418Da = c0418Da;
                    IJ.A04(c01561z.A0T(c0418Da));
                    if (c01561z.A0N != null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c01561z = c01561z;
                    c0418Da = c0418Da;
                    c01561z.A0N = DummySurface.A01(c01561z.A0V, c0418Da.A05);
                    c2 = 4;
                    break;
                case 4:
                    c01561z = c01561z;
                    c01561z.A0O = c01561z.A0N;
                    c2 = 5;
                    break;
                case 5:
                    c01561z = c01561z;
                    mediaCodec = mediaCodec;
                    mediaCrypto = mediaCrypto;
                    mediaFormatA03 = mediaFormatA03;
                    mediaCodec.configure(mediaFormatA03, c01561z.A0O, mediaCrypto, 0);
                    if (C0560Iy.A01 < 23) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c01561z = c01561z;
                    if (!c01561z.A0S) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c01561z = c01561z;
                    mediaCodec = mediaCodec;
                    c01561z.A00 = new J9(c01561z, mediaCodec);
                    c2 = '\b';
                    break;
                case '\b':
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3T
    public final void A1O(String str, long j, long j2) {
        this.A0X.A07(str, j, j2);
        this.A0Q = A0U(str);
    }

    @Override // com.facebook.ads.redexgen.X.C3T
    public final boolean A1P(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long unadjustedFrameReleaseTimeNs, boolean z) throws InterruptedException, C03479w {
        MediaCodec mediaCodec2 = mediaCodec;
        C01561z c01561z = this;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long presentationTimeUs = 0;
        long j6 = 0;
        boolean z2 = false;
        long j7 = 0;
        boolean z3 = false;
        long j8 = 0;
        boolean z4 = false;
        long adjustedReleaseTimeNs = 0;
        boolean z5 = false;
        long presentationTimeUs2 = 0;
        long j9 = 0;
        long jElapsedRealtime = 0;
        long jA07 = 0;
        C01561z c01561z2 = c01561z;
        MediaCodec mediaCodec3 = mediaCodec2;
        char c2 = c01561z2.A0I == -9223372036854775807L ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c01561z2 = c01561z2;
                    c01561z2.A0I = j;
                    c2 = 3;
                    continue;
                case 3:
                    c01561z2 = c01561z2;
                    j7 = unadjustedFrameReleaseTimeNs - c01561z2.A0M;
                    z5 = true;
                    if (z) {
                        c2 = 4;
                    } else {
                        c2 = 5;
                        continue;
                    }
                case 4:
                    c01561z2.A0H(mediaCodec3, i, j7);
                    return z5;
                case 5:
                    c01561z2 = c01561z2;
                    presentationTimeUs2 = unadjustedFrameReleaseTimeNs - j;
                    z2 = false;
                    if (c01561z2.A0O == c01561z2.A0N) {
                        c2 = 6;
                    } else {
                        c2 = '\t';
                        continue;
                    }
                case 6:
                    if (A0N(presentationTimeUs2)) {
                        c2 = 7;
                    } else {
                        c2 = '\b';
                        continue;
                    }
                case 7:
                    c01561z2.A0H(mediaCodec3, i, j7);
                    return z5;
                case '\b':
                    return false;
                case '\t':
                    c01561z = c01561z;
                    j5 = 1000;
                    jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                    if (c01561z.A73() == 2) {
                        c2 = '\n';
                    } else {
                        c2 = 20;
                        continue;
                    }
                case '\n':
                    z3 = true;
                    c2 = 11;
                    continue;
                case 11:
                    c01561z2 = c01561z2;
                    z4 = z3;
                    if (c01561z2.A0R) {
                        c2 = '\f';
                    } else {
                        c2 = 19;
                        continue;
                    }
                case '\f':
                    if (z4) {
                        c2 = '\r';
                    } else {
                        c2 = 21;
                        continue;
                    }
                case '\r':
                    c01561z2 = c01561z2;
                    if (c01561z2.A0R(presentationTimeUs2, jElapsedRealtime - c01561z2.A0L)) {
                        c2 = 14;
                    } else {
                        c2 = 21;
                        continue;
                    }
                case 14:
                    presentationTimeUs = j7;
                    c2 = 15;
                    continue;
                case 15:
                    if (C0560Iy.A01 >= 21) {
                        c2 = 16;
                    } else {
                        c2 = 18;
                        continue;
                    }
                case 16:
                    mediaCodec2 = mediaCodec2;
                    c01561z = c01561z;
                    c01561z.A0I(mediaCodec2, i, presentationTimeUs, System.nanoTime());
                    c2 = 17;
                    continue;
                case 17:
                    return true;
                case 18:
                    c01561z2 = c01561z2;
                    mediaCodec3 = mediaCodec3;
                    c01561z2.A0G(mediaCodec3, i, presentationTimeUs);
                    c2 = 17;
                    continue;
                case 19:
                    presentationTimeUs = j7;
                    c2 = 15;
                    continue;
                case 20:
                    z3 = false;
                    c2 = 11;
                    continue;
                case 21:
                    if (z4) {
                        c2 = 22;
                    } else {
                        c2 = 23;
                        continue;
                    }
                case 22:
                    c01561z2 = c01561z2;
                    if (j == c01561z2.A0I) {
                        c2 = 23;
                    } else {
                        c2 = 24;
                        continue;
                    }
                case 23:
                    return false;
                case 24:
                    c01561z2 = c01561z2;
                    long jNanoTime = System.nanoTime();
                    jA07 = c01561z2.A0W.A07(unadjustedFrameReleaseTimeNs, jNanoTime + ((presentationTimeUs2 - (jElapsedRealtime - j2)) * j5));
                    j8 = (jA07 - jNanoTime) / j5;
                    if (c01561z2.A0P(j8, j2)) {
                        c2 = 25;
                    } else {
                        c2 = 27;
                        continue;
                    }
                case 25:
                    c01561z = c01561z;
                    mediaCodec2 = mediaCodec2;
                    adjustedReleaseTimeNs = j8;
                    j6 = j7;
                    if (c01561z.A0S(mediaCodec2, i, j7, j)) {
                        c2 = 26;
                    } else {
                        c2 = 28;
                        continue;
                    }
                case 26:
                    return false;
                case 27:
                    j6 = j7;
                    adjustedReleaseTimeNs = j8;
                    c2 = 28;
                    continue;
                case 28:
                    c01561z2 = c01561z2;
                    if (c01561z2.A0Q(adjustedReleaseTimeNs, j2)) {
                        c2 = 29;
                    } else {
                        c2 = 30;
                        continue;
                    }
                case 29:
                    c01561z2.A0F(mediaCodec3, i, j6);
                    return true;
                case 30:
                    j4 = j6;
                    if (C0560Iy.A01 >= 21) {
                        c2 = 31;
                    } else {
                        c2 = '!';
                        continue;
                    }
                case 31:
                    if (adjustedReleaseTimeNs < 50000) {
                        c2 = ' ';
                    } else {
                        c2 = '(';
                        continue;
                    }
                case ' ':
                    c01561z.A0I(mediaCodec2, i, j4, jA07);
                    return true;
                case '!':
                    j9 = j4;
                    if (adjustedReleaseTimeNs < 30000) {
                        c2 = '\"';
                    } else {
                        c2 = '(';
                        continue;
                    }
                case '\"':
                    if (adjustedReleaseTimeNs <= 11000) {
                        break;
                    } else {
                        j3 = adjustedReleaseTimeNs - 10000;
                        c2 = '$';
                    }
                case '$':
                    try {
                        Thread.sleep(j3 / j5);
                        break;
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return z2;
                    }
                case '(':
                    return false;
            }
        }
        c01561z2.A0G(mediaCodec3, i, j9);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.C3T
    public final boolean A1Q(C0418Da c0418Da) {
        C01561z c01561z = this;
        boolean z = false;
        char c2 = c01561z.A0O == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c01561z = c01561z;
                    c0418Da = c0418Da;
                    if (!c01561z.A0T(c0418Da)) {
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

    public final void A1R() {
        if (!this.A0R) {
            this.A0R = true;
            this.A0X.A03(this.A0O);
        }
    }

    @Override // com.facebook.ads.redexgen.X.EN, com.facebook.ads.redexgen.X.AR
    public final void A7K(int i, Object obj) throws Throwable {
        C01561z c01561z = this;
        MediaCodec mediaCodecA1C = null;
        char c2 = i == 1 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c01561z = c01561z;
                    obj = obj;
                    c01561z.A0L((Surface) obj);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    if (i != 4) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c01561z = c01561z;
                    obj = obj;
                    c01561z.A0F = ((Integer) obj).intValue();
                    mediaCodecA1C = c01561z.A1C();
                    if (mediaCodecA1C == null) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c01561z = c01561z;
                    mediaCodecA1C = mediaCodecA1C;
                    mediaCodecA1C.setVideoScalingMode(c01561z.A0F);
                    c2 = 3;
                    break;
                case 7:
                    c01561z = c01561z;
                    obj = obj;
                    super.A7K(i, obj);
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3T, com.facebook.ads.redexgen.X.YC
    public final boolean A7k() {
        C01561z c01561z = this;
        Surface surface = null;
        char c2 = super.A7k() ? (char) 2 : '\b';
        while (true) {
            switch (c2) {
                case 2:
                    c01561z = c01561z;
                    if (!c01561z.A0R) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 3:
                    c01561z = c01561z;
                    surface = c01561z.A0N;
                    if (surface == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c01561z = c01561z;
                    surface = surface;
                    if (c01561z.A0O == surface) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c01561z = c01561z;
                    if (c01561z.A1C() == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c01561z = c01561z;
                    if (!c01561z.A0S) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c01561z.A0J = -9223372036854775807L;
                    return true;
                case '\b':
                    c01561z = c01561z;
                    if (c01561z.A0J != -9223372036854775807L) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    return false;
                case '\n':
                    c01561z = c01561z;
                    if (SystemClock.elapsedRealtime() >= c01561z.A0J) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    return true;
                case '\f':
                    c01561z.A0J = -9223372036854775807L;
                    return false;
            }
        }
    }
}
