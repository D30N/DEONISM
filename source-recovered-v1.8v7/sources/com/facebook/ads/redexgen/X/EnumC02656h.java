package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.6h, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC02656h {
    A04(1),
    A0A(2),
    A07(4),
    A09(8),
    A0M(16),
    A0E(32),
    A05(64),
    A0D(128),
    A0B(256),
    A0C(512),
    A0L(1024),
    A0I(2048),
    A0J(4096),
    A08(8192),
    A0H(16384),
    A0F(32768),
    A0G(65536),
    A0K(131072),
    A06(262144);

    public static byte[] A01;
    public static final Map<Integer, EnumC02656h> A02;
    public int A00;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 85);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A01 = new byte[]{-4, 8, 12, -8, 3, 22, -7, 16, 22, 13, -8, 3, 12, -4, -28, -16, -12, -32, -21, -2, -31, -8, -2, -13, -24, -20, -28, -14, -13, -32, -20, -17, 0, 6, 10, 22, 5, -8, 11, 0, 13, -4, -100, -79, -90, -103, -91, -95, -101, -49, -63, -54, -49, -59, -48, -59, -46, -63, -46, -27, -34, -44, -36, -43, 17, 30, 20, 34, 31, 25, 20, 47, 30, 17, 36, 25, 38, 21, -35, -33, -35, -38, -45, -51, -45, -39, -33, -35, -23, -34, -45, -49, -36, -86, -79, -73, -75, -83, -68, -70, -79, -85, -76, -75, -64, -62, -75, -77, -79, -60, -75, -76, -46, -55, -55, -42, -52, -41, -56, -30, -42, -56, -47, -42, -52, -41, -52, -39, -56, 17, 0, 13, 3, 14, 12, 30, 18, 0, 12, 15, 11, 4, 30, 19, 8, 4, 17, -8, -26, -29, -83, -81, -64, -75, -62, -79, -18, -19, -14, -24, -13, -28, 13, -2, 15, -2, 11, 12, 6, 1, 28, 17, 6, 2, 15, -96, -84, -80, -100, -89, -70, -99, -76, -70, -98, -86, -87, -81, -96, -77, -81, -46, -43, -34, -39, -41, -34, -17, -28, -39, -43, -30, 6, -3, -3, 10, 0, 11, -4};
    }

    static {
        A03();
        A02 = new HashMap();
        for (EnumC02656h type : values()) {
            A02.put(Integer.valueOf(type.A00), type);
        }
    }

    EnumC02656h(int i) {
        this.A00 = i;
    }

    @Nullable
    public static EnumC02656h A00(int i) {
        EnumC02656h enumC02656h = null;
        char c2 = A02.containsKey(Integer.valueOf(i)) ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    enumC02656h = A02.get(Integer.valueOf(i));
                    c2 = 3;
                    break;
                case 3:
                    return enumC02656h;
                case 4:
                    enumC02656h = null;
                    c2 = 3;
                    break;
            }
        }
    }

    @SuppressLint({"BadMethodUse-android.util.Log.e", "CatchGeneralException", "EmptyCatchBlock"})
    public static EnumSet<EnumC02656h> A02(int i) throws Exception {
        int iNumberOfTrailingZeros = 0;
        EnumC02656h[] enumC02656hArrValues = null;
        EnumSet<EnumC02656h> enumSetNoneOf = EnumSet.noneOf(EnumC02656h.class);
        char c2 = i <= 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return enumSetNoneOf;
                case 3:
                    enumC02656hArrValues = values();
                    c2 = 4;
                    break;
                case 4:
                    if (i == 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    enumC02656hArrValues = enumC02656hArrValues;
                    iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
                    i ^= Integer.lowestOneBit(i);
                    if (iNumberOfTrailingZeros >= enumC02656hArrValues.length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    enumSetNoneOf = enumSetNoneOf;
                    enumC02656hArrValues = enumC02656hArrValues;
                    enumSetNoneOf.add(enumC02656hArrValues[iNumberOfTrailingZeros]);
                    c2 = 4;
                    break;
                case 7:
                    return enumSetNoneOf;
            }
        }
    }

    public final int A04() {
        return this.A00;
    }
}
