package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class F4 {
    public static byte[] A03;
    public CC A00;
    public final CE A01;
    public final CC[] A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 123);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A03 = new byte[]{-29, 4, 3, -6, -75, 4, -5, -75, 9, -3, -6, -75, -10, 11, -10, -2, 1, -10, -9, 1, -6, -75, -6, 13, 9, 7, -10, -8, 9, 4, 7, 8, -75, -67, -64, -73, -6, 6, 12, 3, -5, -73, 9, -4, -8, -5, -73, 11, -1, -4, -73, 10, 11, 9, -4, -8, 4, -59};
    }

    public F4(CC[] ccArr, CE ce) {
        this.A02 = ccArr;
        this.A01 = ce;
    }

    public final CC A02(CD cd, Uri uri) throws InterruptedException, IOException {
        F4 f4 = this;
        CC cc = null;
        CC cc2 = null;
        int length = 0;
        int i = 0;
        CC[] ccArr = null;
        CC cc3 = f4.A00;
        char c2 = cc3 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return cc3;
                case 3:
                    f4 = f4;
                    ccArr = f4.A02;
                    length = ccArr.length;
                    i = 0;
                    c2 = 4;
                    break;
                case 4:
                    if (i >= length) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    ccArr = ccArr;
                    cc2 = ccArr[i];
                    c2 = 6;
                    break;
                case 6:
                    try {
                        cd = cd;
                        cc2 = cc2;
                    } catch (EOFException unused) {
                    } catch (Throwable th) {
                        cd.ACg();
                        throw th;
                    }
                    if (cc2.ADM(cd)) {
                        f4.A00 = cc2;
                        cd.ACg();
                        c2 = '\f';
                        break;
                    } else {
                        cd.ACg();
                        i++;
                        c2 = 4;
                        break;
                    }
                case '\f':
                    f4 = f4;
                    cc = f4.A00;
                    if (cc == null) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    F4 f42 = f4;
                    cc.A7T(f42.A01);
                    return f42.A00;
                case 14:
                    throw new C1026aY(A00(0, 34, 26) + C0560Iy.A0V(f4.A02) + A00(34, 24, 28), uri);
            }
        }
    }

    public final void A03() {
        if (this.A00 != null) {
            this.A00 = null;
        }
    }
}
