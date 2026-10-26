package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class SD extends AbstractRunnableC0608Kw {
    public static byte[] A05;
    public final /* synthetic */ long A00;
    public final /* synthetic */ C0770Rf A01;
    public final /* synthetic */ FP A02;
    public final /* synthetic */ C03168q A03;
    public final /* synthetic */ Map A04;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 11);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A05 = new byte[]{60, 43, 43, 54, 43, 76, 80, 19, 13, 25, 29, 0, 4, 12, 6, 28, 29};
    }

    public SD(FP fp, Map map, C0770Rf c0770Rf, long j, C03168q c03168q) {
        this.A02 = fp;
        this.A04 = map;
        this.A01 = c0770Rf;
        this.A00 = j;
        this.A03 = c03168q;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0608Kw
    public final void A06() {
        this.A02.A0T(this.A04);
        this.A02.A0N(this.A01);
        Map mapA01 = this.A02.A01(this.A00);
        mapA01.put(A00(0, 5, 82), A00(5, 2, 106));
        mapA01.put(A00(7, 3, k.AppCompatTheme_windowActionModeOverlay), A00(10, 7, 98));
        this.A02.A05(this.A03.A04(EnumC03208u.A04), mapA01);
        this.A02.A0M();
    }
}
