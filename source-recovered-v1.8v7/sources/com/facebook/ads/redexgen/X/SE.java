package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class SE implements AnonymousClass12 {
    public static byte[] A07;
    public final /* synthetic */ long A03;
    public final /* synthetic */ FP A04;
    public final /* synthetic */ C03168q A05;
    public final /* synthetic */ Runnable A06;
    public boolean A02 = false;
    public boolean A01 = false;
    public boolean A00 = false;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 110);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A07 = new byte[]{-17, -4, -4, -7, -4, 0, 6, -6};
    }

    public SE(FP fp, Runnable runnable, long j, C03168q c03168q) {
        this.A04 = fp;
        this.A06 = runnable;
        this.A03 = j;
        this.A05 = c03168q;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass12
    public final void AAK(C0770Rf c0770Rf) {
        SE se = this;
        char c2 = !se.A00 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    se = se;
                    se.A00 = true;
                    se.A04.A05(se.A05.A04(EnumC03208u.A02), null);
                    c2 = 3;
                    break;
                case 3:
                    se = se;
                    if (se.A04.A07 == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    se = se;
                    se.A04.A07.A0C();
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass12
    public final void AAL(C0770Rf c0770Rf) {
        SE se = this;
        char c2 = c0770Rf != se.A04.A01 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    se = se;
                    c0770Rf = c0770Rf;
                    se.A04.A0E().removeCallbacks(se.A06);
                    FP fp = se.A04;
                    fp.A02 = c0770Rf;
                    fp.A07.A0F(c0770Rf);
                    if (!se.A02) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    se = se;
                    se.A02 = true;
                    se.A04.A05(se.A05.A04(EnumC03208u.A04), se.A04.A01(se.A03));
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass12
    public final void AAM(C0770Rf c0770Rf) {
        if (!this.A01) {
            this.A01 = true;
            this.A04.A05(this.A05.A04(EnumC03208u.A03), null);
        }
        this.A04.A0K();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass12
    public final void AAO(C0770Rf c0770Rf, K5 k5) {
        SE se = this;
        char c2 = c0770Rf != se.A04.A01 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    se = se;
                    c0770Rf = c0770Rf;
                    se.A04.A0E().removeCallbacks(se.A06);
                    se.A04.A0N(c0770Rf);
                    if (!se.A02) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    se = se;
                    k5 = k5;
                    se.A02 = true;
                    Map mapA01 = se.A04.A01(se.A03);
                    mapA01.put(A00(0, 5, 28), String.valueOf(k5.A04().getErrorCode()));
                    mapA01.put(A00(5, 3, 37), String.valueOf(k5.A05()));
                    se.A04.A05(se.A05.A04(EnumC03208u.A04), mapA01);
                    c2 = 5;
                    break;
                case 5:
                    se.A04.A0M();
                    return;
            }
        }
    }
}
