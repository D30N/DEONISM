package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ai, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1036ai extends AbstractRunnableC0608Kw {
    public static byte[] A02;
    public final /* synthetic */ int A00;
    public final /* synthetic */ C03359k A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 57);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A02 = new byte[]{94, 105, 122, 122, 121, 110, 117, 114, 123, 60, 117, 114, 120, 121, 122, 117, 114, 117, 104, 121, 112, 101};
    }

    public C1036ai(C03359k c03359k, int i) {
        this.A01 = c03359k;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0608Kw
    public final void A06() {
        C1036ai c1036ai = this;
        char c2 = c1036ai.A01.A00.A09 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c1036ai = c1036ai;
                    if (c1036ai.A01.A00.A09.getState() != EnumC0737Py.A02) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1036ai = c1036ai;
                    if (c1036ai.A01.A00.A09.getCurrentPositionInMillis() != c1036ai.A00) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c1036ai = c1036ai;
                    c1036ai.A01.A00.A0M.removeCallbacksAndMessages(null);
                    c1036ai.A01.A00.A0d(A00(0, 22, 37));
                    c2 = 6;
                    break;
                case 6:
                    return;
            }
        }
    }
}
