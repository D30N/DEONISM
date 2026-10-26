package com.facebook.ads.redexgen.X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Oo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0702Oo {
    public static boolean A00;
    public static byte[] A01;

    public static String A02(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 31);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A01 = new byte[]{115, 94, 68, 71, 91, 86, 78, 122, 82, 67, 69, 94, 84, 68, 23, 94, 68, 23, 89, 66, 91, 91, 25, 78, 121, 111, 115, 105, 110, Byte.MAX_VALUE, 121, 111, 60, 117, 111, 60, 114, 105, 112, 112, 50, 28, 30, 29, 78, 121, 116, 113, 124, 121, 108, 113, 119, 118, 56, 126, 121, 113, 116, 125, 124, 54};
    }

    static {
        A03();
        A00 = true;
    }

    @Nullable
    public static BitmapDrawable A00(XI xi, @Nullable String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            byte[] bArrDecode = Base64.decode(str, 0);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
            if (bitmapDecodeByteArray != null && (!A00 || A05(xi, bitmapDecodeByteArray))) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmapDecodeByteArray);
                bitmapDrawable.setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
                Resources resources = xi.getResources();
                if (resources != null) {
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    if (displayMetrics != null) {
                        bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                    } else {
                        A04(xi, A02(0, 23, 40));
                    }
                } else {
                    A04(xi, A02(23, 18, 3));
                }
                return bitmapDrawable;
            }
            return null;
        } catch (Throwable th) {
            xi.A04().A83(A02(41, 3, 110), C03008a.A1T, new C03018b(th));
            return null;
        }
    }

    @Nullable
    public static C0703Op A01(XI xi, @Nullable String str) {
        BitmapDrawable bitmapDrawableA00;
        try {
            if (TextUtils.isEmpty(str) || (bitmapDrawableA00 = A00(xi, str)) == null) {
                return null;
            }
            C0703Op c0703Op = new C0703Op(xi);
            if (Build.VERSION.SDK_INT >= 16) {
                c0703Op.setBackground(bitmapDrawableA00);
            } else {
                c0703Op.setBackgroundDrawable(bitmapDrawableA00);
            }
            c0703Op.setClickable(false);
            c0703Op.setFocusable(false);
            return c0703Op;
        } catch (Throwable th) {
            xi.A04().A83(A02(41, 3, 110), C03008a.A1T, new C03018b(th));
            return null;
        }
    }

    public static void A04(XI xi, String str) {
        xi.A04().A83(A02(41, 3, 110), C03008a.A1T, new C03018b(str));
    }

    @VisibleForTesting
    public static boolean A05(XI xi, Bitmap bitmap) {
        int pixel = 0;
        int i = 0;
        float alpha = 2.8E-45f;
        while (true) {
            switch (alpha) {
                case 2.8E-45f:
                    bitmap = bitmap;
                    if (i >= bitmap.getWidth()) {
                        alpha = 1.3E-44f;
                        break;
                    } else {
                        alpha = 4.2E-45f;
                        break;
                    }
                case 4.2E-45f:
                    pixel = 0;
                    alpha = 5.6E-45f;
                    break;
                case 5.6E-45f:
                    bitmap = bitmap;
                    if (pixel >= bitmap.getHeight()) {
                        alpha = 1.1E-44f;
                        break;
                    } else {
                        alpha = 7.0E-45f;
                        break;
                    }
                case 7.0E-45f:
                    bitmap = bitmap;
                    if (Color.alpha(bitmap.getPixel(i, pixel)) / 255.0f <= 0.03f) {
                        alpha = 9.8E-45f;
                        break;
                    } else {
                        alpha = 8.4E-45f;
                        break;
                    }
                case 8.4E-45f:
                    A04(xi, A02(44, 18, 7));
                    return false;
                case 9.8E-45f:
                    pixel++;
                    alpha = 5.6E-45f;
                    break;
                case 1.1E-44f:
                    i++;
                    alpha = 2.8E-45f;
                    break;
                case 1.3E-44f:
                    return true;
            }
        }
    }
}
