package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Jv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC0583Jv {
    A06(-1, 100, 1, 0),
    A07(-1, k.AppCompatTheme_windowFixedWidthMajor, 2, 1),
    A08(-1, 300, 3, 2),
    A09(-1, 400, 4, 3),
    A0A(-1, 50, 5, 4),
    A0B(-1, -1, 6, 5);

    public static byte[] A04;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 43);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A04 = new byte[]{-102, -105, -101, -103, -102, -90, -79, -121, -126, -49, -52, -48, -50, -49, -37, -26, -72, -71, -73, -92, -95, -91, -93, -92, -80, -69, -115, -116, -116, -101, -114, -116, -99, -88, -115, -94, -105, -118, -106, -110, -116, -21, -24, -20, -22, -21, -9, 2, -42, -45, -45, -38, -41, -37, -39, -38, -26, -15, -58, -62, -62};
    }

    static {
        A02();
    }

    EnumC0583Jv(int i, int i2, int i3, int i4) {
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A00 = i4;
    }

    public static EnumC0583Jv A00(int i) {
        EnumC0583Jv enumC0583Jv = null;
        EnumC0583Jv[] enumC0583JvArrValues = values();
        int length = enumC0583JvArrValues.length;
        int i2 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i2 >= length) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    enumC0583JvArrValues = enumC0583JvArrValues;
                    enumC0583Jv = enumC0583JvArrValues[i2];
                    if (enumC0583Jv.A00 != i) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return enumC0583Jv;
                case 5:
                    i2++;
                    c2 = 2;
                    break;
                case 6:
                    EnumC0583Jv value = (EnumC0583Jv) null;
                    return value;
            }
        }
    }

    public final int A03() {
        return this.A01;
    }

    public final int A04() {
        return this.A02;
    }

    public final int A05() {
        return this.A03;
    }
}
