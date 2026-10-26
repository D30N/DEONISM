package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class XM extends AbstractRunnableC0608Kw {
    public static byte[] A02;
    public final /* synthetic */ AnonymousClass85 A00;
    public final /* synthetic */ C02967u A01;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 76);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A02 = new byte[]{-91, -40, -55, -55, -56, -43, -52, -47, -54, -125, -52, -47, -57, -56, -55, -52, -47, -52, -41, -56, -49, -36};
    }

    public XM(AnonymousClass85 anonymousClass85, C02967u c02967u) {
        this.A00 = anonymousClass85;
        this.A01 = c02967u;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0608Kw
    public final void A06() {
        XM xm = this;
        char c2 = xm.A00.A0A.getState() == EnumC0737Py.A02 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    xm = xm;
                    if (xm.A00.A0A.getCurrentPositionInMillis() != xm.A01.A00()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    xm = xm;
                    xm.A00.A0G(A00(0, 22, 23));
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }
}
