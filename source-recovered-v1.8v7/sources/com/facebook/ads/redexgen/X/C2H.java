package com.facebook.ads.redexgen.X;

import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.annotation.FloatRange;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.2H, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2H {
    public static byte[] A00;
    public static final ThreadLocal<double[]> A01;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 124);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A00 = new byte[]{54, 60, 59, 31, 64, 65, -25, 52, 60, 58, 59, -25, 47, 40, 61, 44, -25, 40, -25, 51, 44, 53, 46, 59, 47, -25, 54, 45, -25, -6, -11, 72, 83, 87, 79, 72, 7, 84, 92, 90, 91, 7, 73, 76, 7, 73, 76, 91, 94, 76, 76, 85, 7, 23, 7, 72, 85, 75, 7, 25, 28, 28, 21};
    }

    static {
        A04();
        A01 = new ThreadLocal<>();
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public static double A00(@ColorInt int i) {
        double[] dArrA07 = A07();
        A06(i, dArrA07);
        return dArrA07[1] / 100.0d;
    }

    @ColorInt
    public static int A01(@ColorInt int i, @IntRange(from = 0, to = 255) int i2) {
        char c2 = i2 >= 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    if (i2 > 255) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return (16777215 & i) | (i2 << 24);
                case 4:
                    throw new IllegalArgumentException(A03(31, 32, 107));
            }
        }
    }

    @ColorInt
    public static int A02(@ColorInt int i, @ColorInt int i2, @FloatRange(from = 0.0d, to = 1.0d) float r) {
        float g = 1.0f - r;
        return Color.argb((int) ((Color.alpha(i) * g) + (Color.alpha(i2) * r)), (int) ((Color.red(i) * g) + (Color.red(i2) * r)), (int) ((Color.green(i) * g) + (Color.green(i2) * r)), (int) ((Color.blue(i) * g) + (Color.blue(i2) * r)));
    }

    public static void A05(@IntRange(from = 0, to = 255) int i, @IntRange(from = 0, to = 255) int i2, @IntRange(from = 0, to = 255) int i3, @NonNull double[] dArr) {
        double d2 = 0.0d;
        double sg = 0.0d;
        double sg2 = 0.0d;
        double d3 = 0.0d;
        double d4 = 0.0d;
        double d5 = 0.0d;
        double dPow = 0.0d;
        double d6 = 0.0d;
        double d7 = 0.0d;
        double dPow2 = 0.0d;
        double d8 = 0.0d;
        double dPow3 = 0.0d;
        double d9 = 0.0d;
        char c2 = dArr.length == 3 ? (char) 2 : '\f';
        while (true) {
            switch (c2) {
                case 2:
                    d8 = 255.0d;
                    d5 = i / 255.0d;
                    d4 = 12.92d;
                    d9 = 2.4d;
                    d3 = 1.055d;
                    d2 = 0.055d;
                    sg2 = 0.04045d;
                    if (d5 >= 0.04045d) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    dPow = d5 / d4;
                    c2 = 4;
                    break;
                case 4:
                    sg = dPow;
                    d7 = i2 / d8;
                    if (d7 >= sg2) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    dPow2 = d7 / d4;
                    c2 = 6;
                    break;
                case 6:
                    d6 = i3 / d8;
                    if (d6 >= sg2) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    dPow3 = d6 / 12.92d;
                    c2 = '\b';
                    break;
                case '\b':
                    double[] dArr2 = dArr;
                    double sr = 0.3576d * dPow2;
                    double d10 = (0.4124d * sg) + sr;
                    double sr2 = 0.1805d * dPow3;
                    dArr2[0] = (d10 + sr2) * 100.0d;
                    double sr3 = 0.7152d * dPow2;
                    double d11 = (0.2126d * sg) + sr3;
                    double sr4 = 0.0722d * dPow3;
                    dArr2[1] = (d11 + sr4) * 100.0d;
                    double sr5 = 0.1192d * dPow2;
                    double d12 = (0.0193d * sg) + sr5;
                    double sr6 = 0.9505d * dPow3;
                    dArr2[2] = (d12 + sr6) * 100.0d;
                    return;
                case '\t':
                    double sr7 = 0.055d + d6;
                    dPow3 = Math.pow(sr7 / 1.055d, 2.4d);
                    c2 = '\b';
                    break;
                case '\n':
                    dPow2 = Math.pow((d7 + 0.055d) / d3, 2.4d);
                    c2 = 6;
                    break;
                case 11:
                    dPow = Math.pow((d5 + d2) / d3, d9);
                    c2 = 4;
                    break;
                case '\f':
                    throw new IllegalArgumentException(A03(0, 31, 75));
            }
        }
    }

    public static void A06(@ColorInt int i, @NonNull double[] dArr) {
        A05(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    public static double[] A07() {
        double[] dArr = A01.get();
        if (dArr == null) {
            double[] dArr2 = new double[3];
            A01.set(dArr2);
            return dArr2;
        }
        return dArr;
    }
}
