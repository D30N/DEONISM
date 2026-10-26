package com.facebook.ads.redexgen.X;

import android.util.Log;
import d.b.a.b.k;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public final class KJ {
    public static byte[] A00;
    public static final DateFormat A01;
    public static final AtomicBoolean A02;

    public static String A01(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 45);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A00 = new byte[]{126, 40, 119, 123, 0, 126, 40, 6, 123, 126, 40, 124, 124, 14, 89, 89, 14, 71, 71, 26, 103, 103, 103, 96, 101, 111, 118, 126, 101, 100, 99, 116, 102, 126, 109, 110, 102, 102, 100, 115, 110, 56, 103, 107, 110, 56};
    }

    static {
        A03();
        A01 = new SimpleDateFormat(A01(11, 12, 25), Locale.US);
        A02 = new AtomicBoolean();
    }

    public static String A00() {
        return A01.format(Calendar.getInstance().getTime());
    }

    public static void A02() {
        A02.set(true);
    }

    public static void A04(String str, String str2) {
        if (!A02.get()) {
            return;
        }
        Log.i(A01(23, 17, 12), String.format(Locale.US, A01(40, 6, 102), A00(), str2));
    }

    public static void A05(String str, String str2, String str3) {
        if (!A02.get()) {
            return;
        }
        Log.i(A01(23, 17, 12), String.format(Locale.US, A01(0, 11, k.AppCompatTheme_windowFixedHeightMajor), A00(), str3, str2));
    }
}
