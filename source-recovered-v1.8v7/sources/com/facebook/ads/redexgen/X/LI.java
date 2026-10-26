package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONArray;

/* loaded from: assets/audience_network.dex */
public enum LI {
    A06(0),
    A0F(1),
    A07(2),
    A0G(3),
    A08(4),
    A05(5),
    A0D(6),
    A0E(7),
    A0J(8),
    A0C(9),
    A09(10),
    A0H(11),
    A0I(16),
    A0B(17),
    A0A(18);

    public static byte[] A01;
    public static final LI[] A02;
    public static final String A03;
    public final int A00;

    public static String A02(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 42);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A01 = new byte[]{89, 77, 90, 78, 74, 90, 81, 92, 70, 64, 92, 94, 79, 79, 86, 81, 88, 90, 89, 86, 86, 93, 74, 71, 76, 87, 71, 81, 86, 76, 93, 74, 75, 76, 81, 76, 81, 89, 84, 112, 117, 114, 119, 99, 125, 120, 89, 64, 76, 71, 65, 90, 84, 84, 86, 65, 11, 20, 25, 24, 18, 2, 28, 25, 57, 60, 39, 59, 48, 55, 49, 59, 61, 43, 113, 96, 96, 111, 113, 116, 111, 102, 2, 67, 95, 95, 91, 84, 71, 66, 69, 64, 88, 63, 56, 58, 63, 56, 51, 41, 32, 63, 50, 51, 57, 41, 55, 50, 91, 64, 71, 72, 71, 75, 74, 81, 66, 65, 73, 73, 71, 64, 73, 70, 95, 83, 88, 94, 69, 75, 75, 73, 94, 83, 66, 67, 83, 77, 89, 88, 67, 83, 69, 65, 92, 83, 64, 67, 75, 75, 69, 66, 75, 76, 73, 78, 75, 95, 65, 68, 95, 86, 50, 6, 9, 28, 1, 30, 13, 23, 11, 4, 7, 27, 13, 23, 10, 29, 28, 28, 7, 6, 90, 75, 75, 68, 94, 85, 92, 90, 92, 94, 86, 94, 85, 79, 68, 90, 95, 81, 64, 64, 79, 81, 84};
    }

    static {
        A03();
        A02 = new LI[]{A0G, A08, A05, A0E, A0H, A0I, A0B, A0A};
        JSONArray array = new JSONArray();
        for (LI supportedCapability : A02) {
            array.put(supportedCapability.A00());
        }
        A03 = array.toString();
    }

    LI(int i) {
        this.A00 = i;
    }

    private final int A00() {
        return this.A00;
    }

    public static String A01() {
        return A03;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return String.valueOf(this.A00);
    }
}
