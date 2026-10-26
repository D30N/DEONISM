package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class U2 extends AbstractRunnableC0608Kw {
    public static byte[] A03;
    public final /* synthetic */ C02535v A00;
    public final /* synthetic */ XJ A01;
    public final /* synthetic */ String A02;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 109);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A03 = new byte[]{15, 13, 6, 13, 26, 1, 11};
    }

    public U2(C02535v c02535v, String str, XJ xj) {
        this.A00 = c02535v;
        this.A02 = str;
        this.A01 = xj;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0608Kw
    public final void A06() {
        try {
            this.A00.A06(this.A02);
        } catch (Throwable th) {
            this.A01.A04().A83(A00(0, 7, 5), C03008a.A0z, new C03018b(th));
        }
    }
}
