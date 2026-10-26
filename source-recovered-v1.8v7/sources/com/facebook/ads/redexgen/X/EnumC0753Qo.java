package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Qo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC0753Qo {
    A03(A01(4, 4, k.AppCompatTheme_windowActionBar)),
    A04(A01(35, 4, 42));

    public static byte[] A01;
    public String A00;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 122);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A01 = new byte[]{-17, -23, -23, -12, 83, 98, 89, 89, 65, 102, 110, 89, 100, 97, 92, 24, 107, 93, 106, 110, 93, 106, 24, 106, 93, 107, 104, 103, 102, 107, 93, 50, 24, 29, 107, 15, 9, 9, 20, 7, 22, 13, 13};
    }

    static {
        A02();
    }

    EnumC0753Qo(String str) {
        this.A00 = str;
    }

    public static EnumC0753Qo A00(String str) {
        EnumC0753Qo enumC0753Qo = null;
        EnumC0753Qo[] enumC0753QoArrValues = values();
        int length = enumC0753QoArrValues.length;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= length) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    str = str;
                    enumC0753QoArrValues = enumC0753QoArrValues;
                    enumC0753Qo = enumC0753QoArrValues[i];
                    if (!enumC0753Qo.A00.equals(str)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return enumC0753Qo;
                case 5:
                    i++;
                    c2 = 2;
                    break;
                case 6:
                    throw new IllegalArgumentException(String.format(Locale.US, A01(8, 27, 126), str));
            }
        }
    }
}
