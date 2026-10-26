package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Zr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0987Zr implements Ds {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 102);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A00 = new byte[]{-7, 8, 8, 4, 1, -5, -7, 12, 1, 7, 6, -57, 1, -4, -53, -14, 37, 37, 22, 30, 33, 37, 22, 21, -47, 37, 32, -47, 20, 35, 22, 18, 37, 22, -47, 21, 22, 20, 32, 21, 22, 35, -47, 23, 32, 35, -47, 38, 31, 36, 38, 33, 33, 32, 35, 37, 22, 21, -47, 23, 32, 35, 30, 18, 37, 35, 50, 50, 46, 43, 37, 35, 54, 43, 49, 48, -15, 58, -17, 53, 37, 54, 39, -11, -9, -13, 2, 2, -2, -5, -11, -13, 6, -5, 1, 0, -63, 10, -65, -9, -1, 5, -7};
    }

    @Override // com.facebook.ads.redexgen.X.Ds
    public final InterfaceC0429Dq A4E(Format format) {
        char c2 = 0;
        String str = format.A0O;
        int iHashCode = str.hashCode();
        char c3 = iHashCode != -1248341703 ? (char) 2 : '\r';
        while (true) {
            switch (c3) {
                case 2:
                    if (iHashCode == 1154383568) {
                        c3 = 11;
                        break;
                    } else {
                        c3 = 3;
                        break;
                    }
                case 3:
                    if (iHashCode == 1652648887) {
                        c3 = '\t';
                        break;
                    } else {
                        c3 = 4;
                        break;
                    }
                case 4:
                    c2 = 65535;
                    c3 = 5;
                    break;
                case 5:
                    if (c2 == 0) {
                        c3 = 17;
                        break;
                    } else {
                        c3 = 6;
                        break;
                    }
                case 6:
                    if (c2 == 1) {
                        c3 = 16;
                        break;
                    } else {
                        c3 = 7;
                        break;
                    }
                case 7:
                    if (c2 != 2) {
                        c3 = 15;
                        break;
                    } else {
                        c3 = '\b';
                        break;
                    }
                case '\b':
                    return new C0992Zz();
                case '\t':
                    str = str;
                    if (!str.equals(A00(65, 20, 92))) {
                        c3 = 4;
                        break;
                    } else {
                        c3 = '\n';
                        break;
                    }
                case '\n':
                    c2 = 2;
                    c3 = 5;
                    break;
                case 11:
                    str = str;
                    if (!str.equals(A00(85, 18, 44))) {
                        c3 = 4;
                        break;
                    } else {
                        c3 = '\f';
                        break;
                    }
                case '\f':
                    c2 = 1;
                    c3 = 5;
                    break;
                case '\r':
                    str = str;
                    if (!str.equals(A00(0, 15, 50))) {
                        c3 = 4;
                        break;
                    } else {
                        c3 = 14;
                        break;
                    }
                case 14:
                    c2 = 0;
                    c3 = 5;
                    break;
                case 15:
                    throw new IllegalArgumentException(A00(15, 50, 75));
                case 16:
                    return new C0989Zu();
                case 17:
                    return new C0991Zw();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.Ds
    public final boolean ADY(Format format) {
        boolean z = false;
        String str = format.A0O;
        char c2 = !A00(0, 15, 50).equals(str) ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    str = str;
                    if (!A00(85, 18, 44).equals(str)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    str = str;
                    if (!A00(65, 20, 92).equals(str)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z = true;
                    c2 = 5;
                    break;
                case 5:
                    return z;
                case 6:
                    z = false;
                    c2 = 5;
                    break;
            }
        }
    }
}
