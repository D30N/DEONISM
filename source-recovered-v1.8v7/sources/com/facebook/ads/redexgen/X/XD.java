package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class XD extends AbstractRunnableC0608Kw {
    public static byte[] A02;
    public final /* synthetic */ XE A00;
    public final /* synthetic */ AtomicBoolean A01;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 77);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A02 = new byte[]{-108, -78, -76, -71, -74, 113, -73, -78, -70, -67, Byte.MAX_VALUE, -6, 24, 26, 31, 28, -41, 42, 44, 26, 26, 28, 42, 42, -27};
    }

    public XD(XE xe, AtomicBoolean atomicBoolean) {
        this.A00 = xe;
        this.A01 = atomicBoolean;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0608Kw
    public final void A06() {
        XD xd = this;
        char c2 = xd.A00.A00 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    xd = xd;
                    if (!xd.A01.get()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    xd = xd;
                    xd.A00.A02.A0F(EnumC0564Jc.A0G);
                    C7F.A02(xd.A00.A02.A04, xd.A00.A01, C7F.A00, A00(11, 14, 106), xd.A00.A02.A00);
                    xd.A00.A02.A0M();
                    xd.A00.A00.A9F();
                    c2 = 4;
                    break;
                case 4:
                    return;
                case 5:
                    xd = xd;
                    xd.A00.A02.A0F(EnumC0564Jc.A0F);
                    C7F.A02(xd.A00.A02.A04, xd.A00.A01, C7F.A04, A00(0, 11, 4), xd.A00.A02.A00);
                    xd.A00.A02.A0N();
                    xd.A00.A00.A98();
                    c2 = 4;
                    break;
            }
        }
    }
}
