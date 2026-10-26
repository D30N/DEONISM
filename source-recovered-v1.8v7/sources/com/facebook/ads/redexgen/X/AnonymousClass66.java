package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.util.Log;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.66, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass66 {
    public static AnonymousClass65 A00;
    public static byte[] A01;
    public static final String A02;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 108);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{126, 67, 88, 94, 75, 79, 82, 84, 85, 27, 95, 78, 73, 82, 85, 92, 27, 94, 67, 94, 88, 78, 79, 82, 84, 85, 21};
    }

    static {
        A01();
        A02 = AnonymousClass66.class.getSimpleName();
    }

    public static void A02(AnonymousClass65 anonymousClass65) {
        A00 = anonymousClass65;
    }

    @SuppressLint({"BadMethodUse-android.util.Log.e"})
    public static void A03(Throwable th) {
        AnonymousClass65 anonymousClass65 = A00;
        char c2 = anonymousClass65 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    th = th;
                    anonymousClass65 = anonymousClass65;
                    anonymousClass65.ACa(th);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    th = th;
                    Log.e(A02, A00(0, 27, 87), th);
                    c2 = 3;
                    break;
            }
        }
    }
}
