package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: assets/audience_network.dex */
public final class HC {
    public static byte[] A00;
    public static final Pattern A01;
    public static final Pattern A02;

    public static String A02(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 44);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A00 = new byte[]{108, 89, 78, 95, 89, 82, 72, 93, 91, 89, 79, 28, 81, 73, 79, 72, 28, 89, 82, 88, 28, 75, 85, 72, 84, 28, 25, 17, -96, -12, -16, 112, 24, 10, 13, 25, 27, 27, 103, 103, 111, 51, 70, 102, 97, 101, 102, 112, 107, 104, 108, 124, 125, 102, 119, 26, 26, 18, 78, 59, 27, 28, 24, 27, 13, 22, 69, 85, 39, 15, 50, 58, 47, 41, 62, 47, 46, 106, 29, 15, 8, 28, 30, 30, 100, 106, 13, 37, 62, 106};
    }

    static {
        A03();
        A01 = Pattern.compile(A02(50, 16, 30));
        A02 = Pattern.compile(A02(27, 22, 99));
    }

    public static float A00(String str) throws NumberFormatException {
        if (str.endsWith(A02(49, 1, 97))) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException(A02(0, 27, 16));
    }

    public static long A01(String str) throws NumberFormatException {
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String[] strArrA0p = C0560Iy.A0p(str, A02(67, 2, 37));
        int i = 0;
        String[] strArrA0o = C0560Iy.A0o(strArrA0p[0], A02(66, 1, 83));
        int length = strArrA0o.length;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    strArrA0o = strArrA0o;
                    String subpart = strArrA0o[i];
                    j3 = (60 * j3) + Long.parseLong(subpart);
                    i++;
                    c2 = 2;
                    break;
                case 4:
                    strArrA0p = strArrA0p;
                    j = 1000;
                    j2 = j3 * 1000;
                    if (strArrA0p.length != 2) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    strArrA0p = strArrA0p;
                    j2 += Long.parseLong(strArrA0p[1]);
                    c2 = 6;
                    break;
                case 6:
                    return j * j2;
            }
        }
    }

    public static void A04(C0544Ii c0544Ii) throws GZ {
        String line = c0544Ii.A0P();
        char c2 = line != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    line = line;
                    if (!A02.matcher(line).matches()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    throw new GZ(A02(69, 21, 102) + line);
            }
        }
    }
}
