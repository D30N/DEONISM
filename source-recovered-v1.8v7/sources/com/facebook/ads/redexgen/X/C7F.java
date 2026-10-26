package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.support.annotation.Nullable;
import d.b.a.b.k;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.7F, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7F {
    public static int A00;
    public static int A01;
    public static int A02;
    public static int A03;
    public static int A04;
    public static int A05;
    public static int A06;
    public static int A07;
    public static byte[] A08;
    public static final String A09;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 33);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A08 = new byte[]{-103, -99, -111, -105, -107, -66, -63, -77, -74, -79, -58, -69, -65, -73, -118, -120, -118, -113, -116, -91, -94, -100, 106, -120, -118, -113, -116, 71, -113, -112, -101, 85, -105, -102, -107, -103, -88, -101, -105, -86, -97, -84, -101, -107, -86, -81, -90, -101, -25, -6, -6, -21, -13, -10, -6, -112, -82, -80, -75, -78, 109, -79, -68, -60, -69, -71, -68, -82, -79, 109, -77, -82, -74, -71, -62, -65, -78, 123, -89, -91, -89, -84, -87, -93, -89, -77, -78, -72, -87, -68, -72, -19, -16, -21, -2, -15, -3, 1, -15, -1, 0, -21, -11, -16, Byte.MIN_VALUE, -98, -96, -91, -94, 93, -86, -90, -80, -80, 107, -110, -107, -112, -108, -93, -106, -110, -91, -102, -89, -106, -112, -92, -102, -85, -106, -112, -109, -86, -91, -106, -92, -91, -61, -59, -54, -57, -126, -58, -53, -43, -51, -126, -43, -41, -59, -59, -57, -43, -43, -112, -93, -90, -95, -88, -79, -76, -81, -93, -74, -95, -74, -69, -78, -89, -118, -88, -86, -81, -84, 103, -85, -80, -70, -78, 103, -83, -88, -80, -77, -68, -71, -84, 117, -85, -90, -82, -79, -70, -73, -86, -92, -73, -86, -90, -72, -76, -77};
    }

    static {
        A01();
        A09 = C7F.class.getSimpleName();
        A05 = C03008a.A0d;
        A06 = C03008a.A0h;
        A02 = C03008a.A0a;
        A01 = C03008a.A0Z;
        A03 = C03008a.A0b;
        A00 = C03008a.A0X;
        A04 = C03008a.A0c;
        A07 = C03008a.A0i;
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A02(C8C c8c, AnonymousClass75 anonymousClass75, int i, String str, long j) {
        if (!A06(c8c)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(156, 14, 33), anonymousClass75.A00);
            jSONObject.put(A00(91, 13, 107), anonymousClass75.A01);
            if (j > 0) {
                jSONObject.put(A00(5, 9, 49), C0627Lq.A06(System.currentTimeMillis() - j));
            }
            C03018b c03018b = new C03018b(str);
            c03018b.A05(jSONObject);
            c03018b.A03(1);
            c8c.A04().A84(A00(14, 5, 6), i, c03018b);
        } catch (Throwable th) {
            c8c.A04().A3R(th);
        }
    }

    public static void A03(C8C c8c, AnonymousClass79 anonymousClass79, String str, int i, @Nullable String str2, @Nullable Integer num, @Nullable Long l) {
        if (A06(c8c)) {
            A05(c8c, anonymousClass79.A05, anonymousClass79.A06, anonymousClass79.A07, A00(0, 5, 15), str, i, str2, num, l, null);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A04(C8C c8c, C7E c7e, boolean z) {
        if (!A06(c8c)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(156, 14, 33), c7e.A00);
            jSONObject.put(A00(91, 13, 107), c7e.A03);
            jSONObject.put(A00(32, 16, 21), c7e.A02);
            jSONObject.put(A00(78, 13, 35), c7e.A01);
            if (JQ.A1E(c8c)) {
                jSONObject.put(A00(19, 3, 15), c7e.A04);
            }
            String strA00 = z ? A00(22, 10, 6) : A00(104, 11, 28);
            int i = z ? A05 : A06;
            C03018b c03018b = new C03018b(strA00);
            c03018b.A05(jSONObject);
            c03018b.A03(1);
            c8c.A04().A84(A00(14, 5, 6), i, c03018b);
        } catch (Throwable th) {
            c8c.A04().A3R(th);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A05(C8C c8c, String str, String str2, String str3, String str4, String str5, int i, @Nullable String str6, @Nullable Integer num, @Nullable Long l, @Nullable Integer num2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(156, 14, 33), str);
            jSONObject.put(A00(91, 13, 107), str2);
            jSONObject.put(A00(32, 16, 21), str4);
            if (str6 != null) {
                jSONObject.put(A00(189, 14, 36), str6);
            }
            if (num != null) {
                jSONObject.put(A00(k.AppCompatTheme_windowActionBar, 22, 16), String.valueOf(num));
            }
            if (l != null) {
                jSONObject.put(A00(5, 9, 49), String.valueOf(l));
            }
            if (num2 != null) {
                jSONObject.put(A00(48, 7, 101), String.valueOf(num2));
            }
            jSONObject.put(A00(78, 13, 35), str5);
            if (JQ.A1E(c8c)) {
                jSONObject.put(A00(19, 3, 15), str3);
            }
            String strA00 = A00(137, 19, 65);
            if (i == A03) {
                strA00 = A00(55, 23, 44);
            } else if (i == A01) {
                strA00 = A00(170, 19, 38);
            }
            C03018b c03018b = new C03018b(strA00);
            c03018b.A05(jSONObject);
            c03018b.A03(1);
            c8c.A04().A84(A00(14, 5, 6), i, c03018b);
        } catch (Throwable th) {
            c8c.A04().A3R(th);
        }
    }

    public static boolean A06(C8C c8c) {
        boolean z = false;
        int iA06 = 0;
        boolean z2 = false;
        char c2 = c8c.A03().A7a() ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    iA06 = 1;
                    c2 = 3;
                    break;
                case 3:
                    z2 = false;
                    if (iA06 != 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return false;
                case 5:
                    c8c = c8c;
                    iA06 = JR.A06(c8c);
                    c2 = 3;
                    break;
                case 6:
                    z = true;
                    if (iA06 <= 0) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c8c = c8c;
                    if (c8c.A05().A00() > 1.0d / iA06) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    z2 = true;
                    c2 = '\t';
                    break;
                case '\t':
                    return z2;
                case '\n':
                    return z;
            }
        }
    }
}
