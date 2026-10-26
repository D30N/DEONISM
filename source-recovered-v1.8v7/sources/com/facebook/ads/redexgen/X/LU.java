package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.util.Log;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class LU {
    public static byte[] A00;
    public static final String A01;

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 78);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A00 = new byte[]{18, 30, 28, 95, 23, 16, 18, 20, 19, 30, 30, 26, 95, 3, 20, 16, 18, 5, 95, 35, 20, 16, 18, 5, 48, 18, 5, 24, 7, 24, 5, 8, 52, 56, 58, 121, 34, 57, 62, 35, 46, 100, 51, 121, 39, 59, 54, 46, 50, 37, 121, 2, 57, 62, 35, 46, 7, 59, 54, 46, 50, 37, 22, 52, 35, 62, 33, 62, 35, 46, 25, 35, 112, 5, 62, 57, 36, 41, 112, 49, 32, 32, 106, 112, 101, 71, 72, 1, 82, 6, 66, 67, 82, 67, 84, 75, 79, 72, 67, 6, 79, 64, 6, 71, 86, 86, 6, 79, 85, 6, 115, 72, 79, 82, 95, 8};
    }

    static {
        A01();
        A01 = LU.class.getSimpleName();
    }

    @SuppressLint({"CatchGeneralException"})
    public static boolean A02() {
        try {
            Class.forName(A00(0, 32, 63));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean A03() {
        try {
            Class.forName(A00(32, 38, 25));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean A04(int i, int i2) {
        boolean z = false;
        char c2 = i >= 640 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    if (i2 < 640) {
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

    public static boolean A05(Context context) {
        boolean z = false;
        try {
            boolean z2 = true;
            ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities;
            if (activityInfoArr != null) {
                for (ActivityInfo activityInfo : activityInfoArr) {
                    if (A00(32, 38, 25).equals(activityInfo.name)) {
                        z = true;
                    }
                }
            }
            if (!z && !A03()) {
                z2 = false;
            }
            boolean isUnity = BuildConfigApi.isDebug();
            if (isUnity) {
                String str = A00(70, 14, 30) + z2;
            }
            return z2;
        } catch (Throwable th) {
            if (BuildConfigApi.isDebug()) {
                Log.e(A01, A00(84, 32, 104), th);
            }
            return false;
        }
    }
}
