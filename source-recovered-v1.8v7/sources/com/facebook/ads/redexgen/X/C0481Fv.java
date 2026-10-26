package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Fv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0481Fv extends RM<EnumC01080d> {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 47);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A00 = new byte[]{110, 117, 108, 108};
    }

    public C0481Fv(String str) {
        super(str);
    }

    public final C0X A02(@Nullable EnumC01080d enumC01080d) {
        String strA00;
        if (enumC01080d == null) {
            strA00 = A00(0, 4, 47);
        } else {
            strA00 = A00(0, 0, 52) + enumC01080d.A02();
        }
        return new C0X(this, strA00);
    }
}
