package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.aX, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1025aX implements InterfaceC0657Mv {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 126);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A00 = new byte[]{69, 73, 75, 8, 64, 71, 69, 67, 68, 73, 73, 77, 8, 71, 66, 85, 8, 79, 72, 82, 67, 84, 85, 82, 79, 82, 79, 71, 74, 8, 79, 75, 86, 84, 67, 85, 85, 79, 73, 72, 8, 74, 73, 65, 65, 67, 66, 19, 31, 29, 94, 22, 17, 19, 21, 18, 31, 31, 27, 94, 17, 20, 3, 94, 25, 30, 4, 21, 2, 3, 4, 25, 4, 25, 17, 28, 94, 21, 2, 2, 31, 2, 53, 57, 59, 120, 48, 55, 53, 51, 52, 57, 57, 61, 120, 55, 50, 37, 120, 63, 56, 34, 51, 36, 37, 34, 63, 34, 63, 55, 58, 120, 36, 51, 33, 55, 36, 50, 9, 37, 51, 36, 32, 51, 36, 9, 48, 55, 63, 58, 35, 36, 51, 80, 92, 94, 29, 85, 82, 80, 86, 81, 92, 92, 88, 29, 82, 87, 64, 29, 90, 93, 71, 86, 65, 64, 71, 90, 71, 90, 82, 95, 29, 65, 86, 68, 82, 65, 87, 85, 89, 91, 24, 80, 87, 85, 83, 84, 89, 89, 93, 24, 87, 82, 69, 24, 95, 88, 66, 83, 68, 69, 66, 95, 66, 95, 87, 90, 24, 68, 83, 65, 87, 68, 82, 105, 69, 83, 68, 64, 83, 68, 105, 69, 67, 85, 85, 83, 69, 69, 99, 111, 109, 46, 102, 97, 99, 101, 98, 111, 111, 107, 46, 97, 100, 115, 46, 105, 110, 116, 101, 114, 115, 116, 105, 116, 105, 97, 108, 46, 102, 105, 110, 105, 115, 104, 95, 97, 99, 116, 105, 118, 105, 116, 121, 53, 57, 59, 120, 48, 55, 53, 51, 52, 57, 57, 61, 120, 55, 50, 37, 120, 63, 56, 34, 51, 36, 37, 34, 63, 34, 63, 55, 58, 120, 53, 58, 63, 53, 61, 51, 50};
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0657Mv
    public final String A5F() {
        return A00(133, 36, 77);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0657Mv
    public final String A5j() {
        return A00(265, 37, 40);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0657Mv
    public final String A67() {
        return A00(220, 45, 126);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0657Mv
    public final String A6C() {
        return A00(47, 35, 14);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0657Mv
    public final String A6O() {
        return A00(0, 47, 88);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0657Mv
    public final String A6k() {
        return AdPlacementType.INTERSTITIAL.toString();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0657Mv
    public final String A6y() {
        return A00(82, 51, 40);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0657Mv
    public final String A6z() {
        return A00(169, 51, 72);
    }
}
