package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.cK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1134cK extends AbstractC01190o {
    public static byte[] A01;
    public final /* synthetic */ C1141cR A00;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 37);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{-61, -42, -23, -34, -21, -38, -107, -42, -39, -24, -107, -30, -42, -29, -42, -36, -38, -25, -107, -23, -35, -38, -34, -25, -107, -28, -20, -29, -107, -34, -30, -27, -25, -38, -24, -24, -34, -28, -29, -24, -93};
    }

    public C1134cK(C1141cR c1141cR) {
        this.A00 = c1141cR;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01190o
    public final void A0A(C0770Rf c0770Rf) {
        C1134cK c1134cK = this;
        Iterator<C1141cR> it = null;
        C1133cJ c1133cJ = null;
        c1134cK.A00.A0c(c0770Rf, true);
        char c2 = c1134cK.A00.A0F != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    c0770Rf = c0770Rf;
                    if (c0770Rf.A0U() == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c1134cK = c1134cK;
                    c0770Rf = c0770Rf;
                    c1133cJ = new C1133cJ(c1134cK);
                    it = c0770Rf.A0U().iterator();
                    c2 = 4;
                    break;
                case 4:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c1133cJ = c1133cJ;
                    it = it;
                    it.next().A0d(c1133cJ);
                    c2 = 4;
                    break;
                case 6:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01190o
    public final void A0C() {
        if (this.A00.A0F == null) {
            return;
        }
        this.A00.A0F.A8l();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01190o
    public final void A0D() {
        throw new IllegalStateException(A00(0, 41, 80));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01190o
    public final void A0F(InterfaceC01180n interfaceC01180n) {
        if (this.A00.A09 == null) {
            return;
        }
        this.A00.A09.A0I();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01190o
    public final void A0G(K5 k5) {
        this.A00.A0w().A0A().A2c(C0627Lq.A01(this.A00.A00), k5.A04().getErrorCode(), k5.A05());
        if (this.A00.A0F == null) {
            return;
        }
        this.A00.A0F.A9Y(k5);
    }
}
