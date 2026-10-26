package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1103bn extends Q0 {
    public static byte[] A01;
    public final /* synthetic */ C0359Ai A00;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 77);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{-63, -51, -53, -116, -60, -65, -63, -61, -64, -51, -51, -55, -116, -65, -62, -47, -116, -57, -52, -46, -61, -48, -47, -46, -57, -46, -57, -65, -54, -116, -57, -53, -50, -48, -61, -47, -47, -57, -51, -52, -116, -54, -51, -59, -59, -61, -62};
    }

    public C1103bn(C0359Ai c0359Ai) {
        this.A00 = c0359Ai;
    }

    @Override // com.facebook.ads.redexgen.X.Q0
    public final void A03() {
        C1103bn c1103bn = this;
        char c2 = !c1103bn.A00.A03.A07() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c1103bn = c1103bn;
                    c1103bn.A00.A03.A05();
                    c1103bn.A00.A0B.A87(c1103bn.A00.A09.A0P(), new C0676No().A03(c1103bn.A00.A05).A02(c1103bn.A00.A03).A04(c1103bn.A00.A09.A0R()).A05());
                    c1103bn.A00.A0A.A0A().A2Z();
                    if (c1103bn.A00.getAudienceNetworkListener() == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c1103bn = c1103bn;
                    c1103bn.A00.getAudienceNetworkListener().A3r(A00(0, 47, 17));
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }
}
