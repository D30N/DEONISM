package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.util.Log;
import d.b.a.b.k;
import java.io.File;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.0B, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C0B {
    public static byte[] A00;
    public static final String A01;

    public static String A03(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 67);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A00 = new byte[]{88, 90, 88, 83, 94, 28, 51, 57, 47, 50, 52, 57, 78, 24, 76, 75, 28, 2, 7, 7, 75, 9, 14, 75, 30, 24, 14, 15, 69, 86, 83, 70, 83, 63, 115, 113, 115, 120, 117, 63, 19, 49, 62, 119, 36, 112, 52, 53, 54, 57, 62, 53, 112, 35, 41, 35, 36, 53, 61, 112, 51, 49, 51, 56, 53, 112, 52, 57, 34, 53, 51, 36, 63, 34, 41, 113, 112, 119, 59, 112, 117, 96, 117, 59, 112, 117, 96, 117, 59, 19, 22, 28, 5, 95, 20, 27, 30, 23, 95, 17, 19, 17, 26, 23, 31, 29, 7, 28, 6, 23, 22, 41, 18, 29, 30, 16, 25, 92, 8, 19, 92, 31, 14, 25, 29, 8, 25, 92, 25, 4, 8, 25, 14, 18, 29, 16, 92, 31, 29, 31, 20, 25, 92, 24, 21, 14, 25, 31, 8, 19, 14, 5};
    }

    static {
        A04();
        A01 = C0B.class.getSimpleName();
    }

    public static File A00(Context context) {
        File cacheDir = A02(context, true);
        return new File(cacheDir, A03(89, 15, 49));
    }

    @Nullable
    public static File A01(Context context) {
        File file = new File(new File(new File(new File(Environment.getExternalStorageDirectory(), A03(5, 7, 30)), A03(29, 4, 113)), context.getPackageName()), A03(0, 5, k.AppCompatTheme_windowFixedWidthMajor));
        char c2 = !file.exists() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    file = file;
                    if (!file.mkdirs()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    Log.w(A01, A03(111, 41, 63));
                    File appCacheDir = (File) null;
                    return appCacheDir;
                case 4:
                    return file;
            }
        }
    }

    public static File A02(Context context, boolean z) {
        String strA03 = null;
        File cacheDir = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        strA03 = Environment.getExternalStorageState();
                        c2 = 5;
                        break;
                    } catch (NullPointerException unused) {
                        strA03 = A03(12, 0, 23);
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (!z) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    strA03 = strA03;
                    if (!A03(104, 7, 49).equals(strA03)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    context = context;
                    cacheDir = A01(context);
                    c2 = '\b';
                    break;
                case '\b':
                    if (cacheDir != null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    context = context;
                    cacheDir = context.getCacheDir();
                    c2 = '\n';
                    break;
                case '\n':
                    if (cacheDir != null) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    context = context;
                    String str = A03(78, 11, 87) + context.getPackageName() + A03(33, 7, 83);
                    String str2 = A01;
                    StringBuilder sb = new StringBuilder();
                    String cacheDirPath = A03(40, 38, 19);
                    sb.append(cacheDirPath);
                    sb.append(str);
                    String cacheDirPath2 = A03(12, 17, 40);
                    sb.append(cacheDirPath2);
                    String cacheDirPath3 = sb.toString();
                    Log.w(str2, cacheDirPath3);
                    cacheDir = new File(str);
                    c2 = '\f';
                    break;
                case '\f':
                    return cacheDir;
            }
        }
    }
}
