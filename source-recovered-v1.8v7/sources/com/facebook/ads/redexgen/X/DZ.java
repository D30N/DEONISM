package com.facebook.ads.redexgen.X;

import android.util.Log;
import d.b.a.b.k;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class DZ {
    public static byte[] A00;

    static {
        A02();
    }

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 81);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A00 = new byte[]{-18, 19, 32, 25, 22, -53, 20, 30, -53, 31, 26, 26, -53, 23, 12, 29, 18, 16, -53, -45, 41, -35, -14, -19, -42, -44, -53, 31, 26, -53, 30, 22, 20, 27, -26, -53, 20, 15, -27, -53, -11, -33, -12, -29, -14, -4, 17, -29, 0, -4, -1, 0, 13, -19, 0, -4, -1, 0, 13, -78, -105, -34, -26, -21, -79, -105, -75, -84, -87, -87, -34, 17, 9, -2, -4, 13, -2, -3, -71, -5, 5, 8, -4, 4, -71, -6, 5, 2, 0, 7, 6, -2, 7, 13, -45, -71, -22, -15, -8, -92, -61, -36, -31, -29, -34, -34, -35, -32, -30, -45, -46, -114, -59, -81, -60, -114, -48, -41, -30, -114, -46, -45, -34, -30, -42, -114, 20, 50, 57, 58, 61, 52, 57, 50, -21, 64, 57, 54, 57, 58, 66, 57, -21, 34, 12, 33, -21, 46, 51, 64, 57, 54, 5, -21, 20, 45, 50, 52, 47, 47, 46, 49, 51, 36, 35, -33, 22, 0, 21, -33, 37, 46, 49, 44, 32, 51, -33, 51, 56, 47, 36, -7, -33, -52, -27, -22, -20, -25, -25, -26, -23, -21, -36, -37, -105, -55, -64, -67, -67, -105, -35, -26, -23, -28, -40, -21, -79, -105, 7, 4, 23, 4, -99, -29, -20, -17, -99, -15, -10, -19, -30, -99};
    }

    /* JADX WARN: Incorrect condition in loop: B:11:0x007a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.C0983Zn A00(com.facebook.ads.redexgen.X.CD r19) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.DZ.A00(com.facebook.ads.redexgen.X.CD):com.facebook.ads.redexgen.X.Zn");
    }

    public static void A03(CD cd, C0983Zn c0983Zn) throws InterruptedException, IOException {
        long j = 0;
        IJ.A01(cd);
        IJ.A01(c0983Zn);
        cd.ACg();
        C0544Ii c0544Ii = new C0544Ii(8);
        DY dyA00 = DY.A00(cd, c0544Ii);
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    dyA00 = dyA00;
                    if (dyA00.A00 == C0560Iy.A08(A01(208, 4, 82))) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    dyA00 = dyA00;
                    Log.w(A01(44, 15, 74), A01(126, 28, k.AppCompatTheme_windowMinWidthMajor) + dyA00.A00);
                    j = dyA00.A01 + 8;
                    if (dyA00.A00 != C0560Iy.A08(A01(66, 4, 18))) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    j = 12;
                    c2 = 5;
                    break;
                case 5:
                    if (j > 2147483647L) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    cd = cd;
                    c0544Ii = c0544Ii;
                    cd.ADL((int) j);
                    dyA00 = DY.A00(cd, c0544Ii);
                    c2 = 2;
                    break;
                case 7:
                    throw new AF(A01(0, 40, 90) + dyA00.A00);
                case '\b':
                    CD cd2 = cd;
                    cd2.ADL(8);
                    c0983Zn.A06(cd2.A6n(), dyA00.A01);
                    return;
            }
        }
    }
}
