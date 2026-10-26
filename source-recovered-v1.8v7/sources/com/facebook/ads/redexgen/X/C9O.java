package com.facebook.ads.redexgen.X;

import android.content.Context;
import d.b.a.b.k;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.9O, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9O {
    public static byte[] A01;
    public final File A00;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 49);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A01 = new byte[]{0, 39, 47, 42, 35, 34, 102, 50, 41, 102, 37, 52, 35, 39, 50, 35, 102, 34, 47, 52, 35, 37, 50, 41, 52, 63, 102, 97, 99, 53, 97, 53, 49, 32, 55, 56, 12, 63, 60, 52, 114, 80, 95, 95, 94, 69, 17, 84, 95, 66, 68, 67, 84, 17, 22, 20, 66, 22, 17, 88, 66, 17, 80, 17, 85, 88, 67, 84, 82, 69, 94, 67, 72};
    }

    public C9O(File file) {
        this.A00 = file;
    }

    public static C9O A00(String str, Context context) throws IOException {
        File file = new File(context.getFilesDir(), A01(31, 9, 98));
        A03(file);
        File file2 = new File(file, str);
        A03(file2);
        return new C9O(file2);
    }

    public static void A03(File file) throws IOException {
        char c2 = !file.exists() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    file = file;
                    if (!file.mkdir()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    file = file;
                    if (!file.isDirectory()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return;
                case 5:
                    final String str = String.format(Locale.US, A01(40, 33, 0), file.getCanonicalPath());
                    throw new RuntimeException(str) { // from class: com.facebook.ads.redexgen.X.9P
                    };
                case 6:
                    final String str2 = String.format(Locale.US, A01(0, 31, k.AppCompatTheme_windowFixedHeightMinor), file.getCanonicalPath());
                    throw new RuntimeException(str2) { // from class: com.facebook.ads.redexgen.X.9P
                    };
            }
        }
    }

    public final C9O A04(String str) throws IOException {
        File file = new File(this.A00, str);
        A03(file);
        return new C9O(file);
    }

    public final File A05() {
        return this.A00;
    }
}
