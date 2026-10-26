package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.facebook.ads.internal.api.BuildConfigApi;
import d.b.a.b.k;
import java.io.File;
import java.util.Arrays;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.8y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03238y {
    public static byte[] A00;
    public static final String A01;
    public static final AtomicBoolean A02;

    public static String A02(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 41);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A06() {
        A00 = new byte[]{-114, -70, -64, -73, -81, 107, -71, -70, -65, 107, -84, -81, -81, 107, -69, -84, -67, -84, -72, -80, -65, -80, -67, -123, -92, -91, -94, -75, -89, -97, -74, -95, -84, -75, -91, -59, -51, -51, -59, -54, -61, -67, -47, -62, -55, 10, 29, 17, 20, 12, 7, 28, 33, 24, 13, -69, -76, -79, -76, -75, -67, -76, -127, -97, -88, -77, -89, -87, -82, -93, -87, -88, -57, -47, -67, -61, -53, -45, -94, -79, -84, -96, -76, -86, -69, -90, -105, -90, -90, -107, -87, -86, -105, -88, -86, -101, -102, -107, -88, -101, -105, -87, -91, -92, -106, -87, -99, -96, -104, -77, -88, -83, -92, -103, -57, -59, -50, -59, -46, -55, -61, -59, -19, -11, -20, -31, -12, -17, -14, -78, -109, -91, -71, -61, -81, -76, -75, -78, -59, -73, -73, -79, -78, -68, -75, -89, -69, -18, -30, -27, -35, -68, -24, -25, -33, -30, -32, -50, -61, -57, -65, -44, -55, -56, -65, -71, -55, -64, -64, -51, -65, -50, -50, -49, -52, -33, -47, -90, -45, -55, -41, -44, -50, -55, -123, -72, -87, -80, -123, -57, -38, -50, -47, -39, -123, -53, -44, -41, -123, -35, -99, -101};
    }

    static {
        A06();
        A01 = C03238y.class.getSimpleName();
        A02 = new AtomicBoolean();
    }

    public static int A00() {
        return TimeZone.getDefault().getRawOffset();
    }

    public static long A01(C8C c8c) {
        try {
            return new File(c8c.getPackageManager().getApplicationInfo(c8c.getPackageName(), 0).publicSourceDir).length();
        } catch (Exception e) {
            if (A02.compareAndSet(false, true)) {
                c8c.A04().A83(A02(k.AppCompatTheme_viewInflaterClass, 7, 55), C03008a.A0y, new C03018b(e));
                return -1L;
            }
            return -1L;
        }
    }

    public static String A03(Context context) {
        try {
            return (String) Class.forName(context.getPackageName() + A02(145, 12, 80)).getDeclaredField(A02(104, 10, 43)).get(null);
        } catch (Exception unused) {
            return A02(129, 3, 59);
        }
    }

    public static String A04(Context context) {
        try {
            return String.valueOf(Class.forName(context.getPackageName() + A02(145, 12, 80)).getDeclaredField(A02(172, 5, 97)).getBoolean(null));
        } catch (Exception unused) {
            return A02(129, 3, 59);
        }
    }

    public static String A05(C8C c8c) {
        JSONObject jSONObject = new JSONObject();
        A07(jSONObject, A02(72, 6, 53), String.valueOf(A08()));
        A07(jSONObject, A02(78, 8, 24), String.valueOf(A01(c8c)));
        A07(jSONObject, A02(157, 15, 49), String.valueOf(A00()));
        A07(jSONObject, A02(86, 18, 13), String.valueOf(L6.A01(c8c)));
        A07(jSONObject, A02(132, 13, 39), String.valueOf(A09(c8c)));
        A07(jSONObject, A02(24, 11, 23), A04(c8c));
        A07(jSONObject, A02(45, 10, 127), A03(c8c));
        return jSONObject.toString();
    }

    public static void A07(JSONObject jSONObject, String str, String str2) throws JSONException {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            if (BuildConfigApi.isDebug()) {
                Log.e(A01, A02(0, 24, 34), e);
            }
        }
    }

    public static boolean A08() {
        boolean z = false;
        String strA02 = null;
        String str = Build.FINGERPRINT;
        String strA022 = A02(k.AppCompatTheme_viewInflaterClass, 7, 55);
        char c2 = !str.contains(strA022) ? (char) 2 : '\n';
        while (true) {
            switch (c2) {
                case 2:
                    if (!Build.FINGERPRINT.startsWith(A02(55, 7, 29))) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case 3:
                    String str2 = Build.MODEL;
                    strA02 = A02(35, 10, 53);
                    if (!str2.contains(strA02)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case 4:
                    if (!Build.MODEL.contains(A02(k.AppCompatTheme_windowFixedWidthMinor, 8, 87))) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case 5:
                    if (!Build.MODEL.contains(A02(177, 25, 60))) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case 6:
                    if (!Build.MANUFACTURER.contains(A02(62, 10, 17))) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case 7:
                    strA022 = strA022;
                    if (!Build.BRAND.startsWith(strA022)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    strA022 = strA022;
                    if (!Build.DEVICE.startsWith(strA022)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\t':
                    strA02 = strA02;
                    if (!strA02.equals(Build.PRODUCT)) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    z = true;
                    c2 = 11;
                    break;
                case 11:
                    return z;
                case '\f':
                    z = false;
                    c2 = 11;
                    break;
            }
        }
    }

    public static boolean A09(Context context) {
        boolean z = false;
        char c2 = (context.getApplicationInfo().flags & 2) != 0 ? (char) 2 : (char) 4;
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
}
