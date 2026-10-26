package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.HandlerThread;
import java.util.Arrays;
import javax.annotation.Nullable;

@SuppressLint({"BadMethodUse-android.os.HandlerThread._Constructor", "BadMethodUse-java.lang.Thread.start"})
/* renamed from: com.facebook.ads.redexgen.X.6y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02826y {

    @Nullable
    public static C02826y A01;
    public static byte[] A02;
    public final HandlerThread A00 = new HandlerThread(A01(0, 17, 35), 10);

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 30);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A02 = new byte[]{95, 89, 98, 85, 92, 83, 89, 81, 88, 79, 98, 73, 85, 79, 88, 92, 89};
    }

    static {
        A02();
        A01 = null;
    }

    public C02826y() {
        this.A00.start();
    }

    public static C02826y A00() {
        if (A01 == null) {
            A01 = new C02826y();
        }
        return A01;
    }

    public final HandlerThread A03() {
        return this.A00;
    }

    public final void A04() {
        this.A00.quit();
        A01 = null;
    }
}
