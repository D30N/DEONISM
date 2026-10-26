package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.os.Build;
import android.os.StrictMode;
import android.os.SystemClock;
import d.b.a.b.k;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.71, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass71 {

    @Nullable
    public static String A00;
    public static byte[] A01;

    public static String A06(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 38);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0A() {
        A01 = new byte[]{-50, -48, -76, -21, -26, -41, -110, -77, -28, -28, -45, -21, -110, -37, -27, -110, -32, -25, -34, -34, 15, -80, -78, 79, 90, 92, -94};
    }

    static {
        A0A();
        A00 = null;
    }

    public static float A00(float f) {
        return new BigDecimal(f).setScale(3, RoundingMode.HALF_UP).floatValue();
    }

    public static long A01() {
        return SystemClock.elapsedRealtime();
    }

    public static long A02(long j) {
        return j - (j % 1048576);
    }

    @SuppressLint({"CatchGeneralException"})
    public static EnumC02626e A03(@Nullable String str) {
        JSONObject bdObject;
        String strA06 = A06(0, 2, 54);
        if (str == null || str.isEmpty()) {
            return EnumC02626e.A04;
        }
        try {
            bdObject = new JSONObject(str).getJSONObject(A06(21, 2, 40));
        } catch (Throwable unused) {
        }
        if (bdObject == null) {
            return EnumC02626e.A04;
        }
        if (bdObject.has(strA06)) {
            return EnumC02626e.A00(bdObject.getInt(strA06));
        }
        return EnumC02626e.A04;
    }

    public static X3 A04(String str, Throwable th) {
        char c2 = th instanceof NullPointerException ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return new X3(A01(), new C02746q(str), new C02736p(EnumC02726o.A06));
                case 3:
                    th = th;
                    if (!(th instanceof SecurityException)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return new X3(A01(), new C02746q(str), new C02736p(EnumC02726o.A05));
                case 5:
                    th = th;
                    if (!(th instanceof UnsupportedOperationException)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 6:
                    th = th;
                    if (!(th instanceof NoSuchAlgorithmException)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return new X3(A01(), new C02746q(str), new C02736p(EnumC02726o.A04));
                case '\b':
                    return new X3(A01(), new C02746q(str), new C02736p(th));
            }
        }
    }

    @SuppressLint({"BadMethodUse-java.util.UUID.randomUUID"})
    public static String A05() {
        StrictMode.ThreadPolicy savedPolicy = null;
        char c2 = A00 == null ? (char) 2 : '\b';
        while (true) {
            switch (c2) {
                case 2:
                    savedPolicy = StrictMode.allowThreadDiskReads();
                    c2 = 3;
                    break;
                case 3:
                    try {
                        A00 = UUID.randomUUID().toString();
                        StrictMode.setThreadPolicy(savedPolicy);
                        c2 = '\b';
                        break;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(savedPolicy);
                        throw th;
                    }
                case '\b':
                    return A00;
            }
        }
    }

    @Nullable
    @SuppressLint({"EmptyCatchBlock"})
    public static String A07(String str) {
        String strA06 = A06(20, 1, k.AppCompatTheme_windowActionModeOverlay);
        String string = null;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has(strA06)) {
                return null;
            }
            string = Integer.toString(jSONObject.getInt(strA06));
            return string;
        } catch (JSONException unused) {
            return string;
        }
    }

    public static String A08(byte[] bArr, AnonymousClass70 anonymousClass70) throws NoSuchAlgorithmException {
        StringBuffer stringBuffer = null;
        int i = 0;
        byte[] bArrDigest = null;
        char c2 = bArr != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    bArr = bArr;
                    anonymousClass70 = anonymousClass70;
                    stringBuffer = new StringBuffer();
                    bArrDigest = MessageDigest.getInstance(anonymousClass70.A02()).digest(bArr);
                    i = 0;
                    c2 = 3;
                    break;
                case 3:
                    bArrDigest = bArrDigest;
                    if (i >= bArrDigest.length) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    stringBuffer = stringBuffer;
                    bArrDigest = bArrDigest;
                    stringBuffer.append(String.format(A06(23, 4, 4), Integer.valueOf(bArrDigest[i] & 255)));
                    i++;
                    c2 = 3;
                    break;
                case 5:
                    return stringBuffer.toString();
                case 6:
                    throw new NullPointerException(A06(2, 18, 76));
            }
        }
    }

    public static Map<String, String> A09(C02525u c02525u) {
        HashMap map = new HashMap();
        map.put(AnonymousClass62.A03.A02(), A05());
        map.put(AnonymousClass62.A09.A02(), Long.toString(TimeUnit.SECONDS.toMillis(c02525u.A0T())));
        map.put(AnonymousClass62.A05.A02(), Long.toString(C02636f.A00()));
        map.put(AnonymousClass62.A06.A02(), Integer.toString(c02525u.A0S()));
        map.put(AnonymousClass62.A08.A02(), Integer.toString(c02525u.A0V()));
        map.put(AnonymousClass62.A04.A02(), Integer.toString(c02525u.A0R()));
        map.put(AnonymousClass62.A07.A02(), A07(c02525u.A0h()));
        return map;
    }

    public static void A0B(C02525u c02525u, String str, @Nullable String str2) {
        AnonymousClass63 anonymousClass63A0X = c02525u.A0X();
        if (anonymousClass63A0X == null) {
            return;
        }
        anonymousClass63A0X.A8C(AnonymousClass60.A04.A02(), str, A09(c02525u), str2, null, null, null);
    }

    public static boolean A0C() {
        boolean z = false;
        char c2 = Build.VERSION.SDK_INT >= 29 ? (char) 2 : (char) 4;
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

    public static boolean A0D() {
        boolean z = false;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        char c2 = runningAppProcessInfo.importance != 100 ? (char) 2 : (char) 4;
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

    public static boolean A0E(EnumC02626e enumC02626e) {
        boolean z = false;
        int iA03 = enumC02626e.A03();
        char c2 = iA03 != EnumC02626e.A05.A03() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    if (iA03 == EnumC02626e.A07.A03()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (iA03 != EnumC02626e.A06.A03()) {
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

    public static boolean A0F(@Nullable String str, @Nullable String str2) {
        char c2 = str == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    str2 = str2;
                    if (str2 != null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return true;
                case 4:
                    str = str;
                    if (str == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    str2 = str2;
                    if (str2 != null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return false;
                case 7:
                    return str.equals(str2);
            }
        }
    }
}
