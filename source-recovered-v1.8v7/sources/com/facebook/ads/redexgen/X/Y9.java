package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Locale;

/* loaded from: assets/audience_network.dex */
public class Y9 implements InterfaceC0688Oa {
    public static byte[] A01;
    public final /* synthetic */ Y4 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 16);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{58, 37, 41, 59, 30, 41, 45, 40, 53, 24, 35, 31, 36, 35, 59, 100, 107, 105, 63, 107, 101, 119};
    }

    public Y9(Y4 y4) {
        this.A00 = y4;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0688Oa
    public final void AA0() {
        this.A00.A09.A02(EnumC0564Jc.A0L, null);
        this.A00.A0I(String.format(Locale.US, A00(0, 22, 92), this.A00.A0I));
    }
}
