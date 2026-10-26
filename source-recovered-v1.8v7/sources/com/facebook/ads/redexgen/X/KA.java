package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdSize;
import com.facebook.ads.internal.api.AdSizeApi;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum KA implements Serializable, AdSizeApi {
    A04(320, 50),
    A07(0, 0),
    A05(-1, 50),
    A06(-1, 90),
    A08(-1, 250);

    public static byte[] A02 = null;
    public static final long serialVersionUID = 42;
    public final int A00;
    public final int A01;

    public static String A03(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 13);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A02 = new byte[]{-53, -66, -68, -51, -70, -57, -64, -59, -66, -40, -63, -66, -62, -64, -63, -51, -40, -85, -82, -87, 122, 121, -122, -122, 125, -118, -105, Byte.MIN_VALUE, 125, -127, Byte.MAX_VALUE, Byte.MIN_VALUE, -116, -105, 113, 104, 119, 118, -125, -125, 122, -121, -108, 125, 122, 126, 124, 125, -119, -108, 106, 101, 109, 114, 120, 105, 118, 119, 120, 109, 120, 109, 101, 112, 122, 121, -122, -122, 125, -118, -105, 107, 106, 104, -105, 109, 104, -46, -21, -24, -21, -20, -12, -21, -99, -66, -31, -48, -26, -9, -30, -99, -15, -10, -19, -30, -85};
    }

    static {
        A04();
    }

    KA(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public static AdSizeApi A00(int i) {
        char c2 = i != 4 ? (char) 2 : (char) 11;
        while (true) {
            switch (c2) {
                case 2:
                    if (i == 5) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i == 6) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i == 7) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i != 100) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return A07;
                case 7:
                    throw new IllegalArgumentException(A03(77, 20, 112));
                case '\b':
                    return A08;
                case '\t':
                    return A06;
                case '\n':
                    return A05;
                case 11:
                    return A04;
            }
        }
    }

    public static KA A01(int i, int i2) {
        KA ka = null;
        KA ka2 = null;
        KA ka3 = null;
        KA ka4 = null;
        KA ka5 = A07;
        char c2 = ka5.A00 == i2 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    ka5 = ka5;
                    if (ka5.A01 != i) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return ka5;
                case 4:
                    ka3 = A04;
                    if (ka3.A00 != i2) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    ka3 = ka3;
                    if (ka3.A01 != i) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return ka3;
                case 7:
                    ka2 = A05;
                    if (ka2.A00 != i2) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    ka2 = ka2;
                    if (ka2.A01 != i) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    return ka2;
                case '\n':
                    ka4 = A06;
                    if (ka4.A00 != i2) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    ka4 = ka4;
                    if (ka4.A01 != i) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    return ka4;
                case '\r':
                    ka = A08;
                    if (ka.A00 != i2) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    ka = ka;
                    if (ka.A01 != i) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    return ka;
                case 16:
                    return (KA) null;
            }
        }
    }

    public static KA A02(AdSize adSize) {
        return A01(adSize.getWidth(), adSize.getHeight());
    }

    public final AdSize A05() {
        return AdSize.fromWidthAndHeight(this.A01, this.A00);
    }

    @Override // com.facebook.ads.internal.api.AdSizeApi
    public final int getHeight() {
        return this.A00;
    }

    @Override // com.facebook.ads.internal.api.AdSizeApi
    public final int getWidth() {
        return this.A01;
    }
}
