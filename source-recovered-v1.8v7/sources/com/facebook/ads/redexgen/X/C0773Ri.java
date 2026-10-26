package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ri, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0773Ri extends AbstractRunnableC0608Kw {
    public static byte[] A01;
    public final /* synthetic */ C0774Rj A00;

    static {
        A02();
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 86);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A01 = new byte[]{62, 53, 34, 53, 39, 55, 38, 61, 36, 32, 110};
    }

    public C0773Ri(C0774Rj c0774Rj) {
        this.A00 = c0774Rj;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0608Kw
    public final void A06() {
        this.A00.A02.A0A().ADr();
        this.A00.A04.loadUrl(A00(0, 11, 2) + this.A00.A00.A03());
    }
}
