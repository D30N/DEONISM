package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.8k, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03108k {
    public static byte[] A01;
    public static final String A02;
    public final C8C A00;

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 70);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{47, 55, 48, 49, 58, 51, 60, 54, 32, 61, 59, 54, 124, 34, 55, 32, 63, 59, 33, 33, 59, 61, 60, 124, 16, 27, 28, 22, 13, 19, 17, 17, 23, 1, 1, 27, 16, 27, 30, 27, 6, 11, 13, 1, 23, 0, 4, 27, 17, 23, 111, 109, 102, 109, 122, 97, 107};
    }

    static {
        A01();
        A02 = Build.VERSION.RELEASE;
    }

    public C03108k(C8C c8c) {
        this.A00 = c8c;
    }

    public final int A02() {
        return LL.A01(this.A00);
    }

    @SuppressLint({"CatchGeneralException"})
    public final int A03() {
        try {
            return this.A00.getPackageManager().getPackageInfo(A06(), 0).versionCode;
        } catch (Throwable th) {
            this.A00.A04().A83(A00(50, 7, 78), C03008a.A13, new C03018b(th));
            return 0;
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public final String A04() {
        C03108k c03108k = this;
        CharSequence appLabel = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        c03108k = c03108k;
                        appLabel = c03108k.A00.getPackageManager().getApplicationLabel(c03108k.A00.getPackageManager().getApplicationInfo(c03108k.A06(), 0));
                        if (appLabel != null) {
                            c2 = '\n';
                        } else {
                            c2 = 15;
                            continue;
                        }
                    } catch (Throwable th) {
                        c03108k.A00.A04().A83(A00(50, 7, 78), C03008a.A13, new C03018b(th));
                        c2 = 15;
                    }
                case '\n':
                    appLabel = appLabel;
                    if (appLabel.length() > 0) {
                        c2 = '\f';
                    } else {
                        c2 = 15;
                        continue;
                    }
                case '\f':
                    appLabel = appLabel;
                    return appLabel.toString();
                case 15:
                    return A00(5, 0, 19);
            }
            c03108k.A00.A04().A83(A00(50, 7, 78), C03008a.A13, new C03018b(th));
            c2 = 15;
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public final String A05() {
        C03108k c03108k = this;
        String strA00 = null;
        String str = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        c03108k = c03108k;
                        str = c03108k.A00.getPackageManager().getPackageInfo(c03108k.A06(), 0).versionName;
                        c2 = '\t';
                        break;
                    } catch (Throwable th) {
                        c03108k.A00.A04().A8H(A00(50, 7, 78), C03008a.A13, new C03018b(th));
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    if (!TextUtils.isEmpty(str)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\n':
                    strA00 = str;
                    c2 = 11;
                    break;
                case 11:
                    return strA00;
                case '\f':
                    strA00 = A00(5, 0, 19);
                    c2 = 11;
                    break;
            }
        }
    }

    public final String A06() {
        String creatorPackage = null;
        PendingIntent activity = PendingIntent.getActivity(this.A00, 0, new Intent(), 0);
        char c2 = activity == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return A00(5, 0, 19);
                case 3:
                    if (Build.VERSION.SDK_INT < 17) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    activity = activity;
                    creatorPackage = activity.getCreatorPackage();
                    c2 = 5;
                    break;
                case 5:
                    return creatorPackage;
                case 6:
                    activity = activity;
                    creatorPackage = activity.getTargetPackage();
                    c2 = 5;
                    break;
            }
        }
    }

    public final String A07() {
        String operatorName = null;
        TelephonyManager telephonyManager = (TelephonyManager) this.A00.getSystemService(A00(0, 5, 25));
        char c2 = telephonyManager != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    telephonyManager = telephonyManager;
                    operatorName = telephonyManager.getNetworkOperatorName();
                    if (operatorName == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    operatorName = operatorName;
                    if (operatorName.length() <= 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return operatorName;
                case 5:
                    return A00(5, 0, 19);
            }
        }
    }

    public final String A08() {
        String strA00 = null;
        char c2 = Build.MANUFACTURER != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    if (Build.MANUFACTURER.length() <= 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    strA00 = Build.MANUFACTURER;
                    c2 = 4;
                    break;
                case 4:
                    return strA00;
                case 5:
                    strA00 = A00(5, 0, 19);
                    c2 = 4;
                    break;
            }
        }
    }

    public final String A09() {
        String strA00 = null;
        char c2 = Build.MODEL != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    if (Build.MODEL.length() <= 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    strA00 = Build.MODEL;
                    c2 = 4;
                    break;
                case 4:
                    return strA00;
                case 5:
                    strA00 = A00(5, 0, 19);
                    c2 = 4;
                    break;
            }
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public final String A0A() {
        C03108k c03108k = this;
        String installer_name = null;
        String strA06 = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    c03108k = c03108k;
                    strA06 = c03108k.A06();
                    if (strA06 == null) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    strA06 = strA06;
                    if (strA06.length() < 0) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    try {
                        c03108k = c03108k;
                        installer_name = c03108k.A00.getPackageManager().getInstallerPackageName(strA06);
                        if (installer_name == null) {
                            c2 = 14;
                            break;
                        } else {
                            c2 = '\n';
                            break;
                        }
                    } catch (Throwable th) {
                        c03108k.A00.A04().A8H(A00(50, 7, 78), C03008a.A13, new C03018b(th));
                        c2 = 14;
                        break;
                    }
                case '\n':
                    installer_name = installer_name;
                    if (installer_name.length() <= 0) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    return installer_name;
                case 14:
                    return A00(5, 0, 19);
            }
        }
    }

    public final boolean A0B() {
        boolean z = false;
        char c2 = this.A00.checkCallingOrSelfPermission(A00(5, 45, 20)) == 0 ? (char) 2 : (char) 4;
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
