package com.facebook.ads.redexgen.X;

import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class F7 extends S9 {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 13);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A00 = new byte[]{-36, -35, -114, -49, -46, -49, -34, -30, -45, -32, -114, -32, -45, -49, -46, -25, -114, -30, -35, -114, -31, -45, -30, -114, -32, -45, -27, -49, -32, -46, -114, -35, -36, -17, -19, -6, -84, -5, -6, -8, 5, -84, -1, -15, 0, -84, -5, -6, -84, -2, -15, 3, -19, -2, -16, -15, -16, -84, 2, -11, -16, -15, -5, -84, -19, -16, -1};
    }

    public F7(XI xi, C01421l c01421l) {
        super(xi, c01421l);
    }

    private AnonymousClass13 A00(Runnable runnable) {
        return new SI(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.X.S9
    public final void A0L() {
        AbstractC0782Rr abstractC0782Rr = (AbstractC0782Rr) this.A02;
        abstractC0782Rr.A00(this.A08.A00);
        abstractC0782Rr.A0B();
    }

    @Override // com.facebook.ads.redexgen.X.S9
    public final void A0O(InterfaceC01180n interfaceC01180n, C03188s c03188s, C03168q c03168q, Map<String, Object> map) {
        C0464Fc c0464Fc = (C0464Fc) interfaceC01180n;
        Runnable rewardedVideoTimeout = new SH(this, map, c0464Fc);
        if (JQ.A1N(this.A0C)) {
            A0E().postDelayed(rewardedVideoTimeout, c03188s.A05().A05());
        }
        c0464Fc.A0C(this.A0C, A00(rewardedVideoTimeout), map, this.A08.A05, this.A08.A03, this.A08.A04);
    }

    public final void A0W(RewardData rewardData) {
        F7 f7 = this;
        char c2 = f7.A02 != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    f7 = f7;
                    if (f7.A02.A6j() != AdPlacementType.REWARDED_VIDEO) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    ((AbstractC0782Rr) f7.A02).A01(rewardData);
                    return;
                case 4:
                    throw new IllegalStateException(A01(33, 34, 127));
                case 5:
                    throw new IllegalStateException(A01(0, 33, 97));
            }
        }
    }
}
