package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.1j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01401j {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 32);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A00 = new byte[]{16, 86, 74, 83, 82};
    }

    public static void A02(XI xi, AnonymousClass17 anonymousClass17, boolean z, InterfaceC01381h interfaceC01381h) {
        if (!JQ.A16(xi)) {
            C7C c7c = new C7C(xi);
            C1T playableAdData = anonymousClass17.A0L().A0D().A06();
            C0565Jd funnelLoggingHandler = new C0565Jd(anonymousClass17.A0P(), xi.A06());
            c7c.A0W(funnelLoggingHandler);
            if (playableAdData == null) {
                interfaceC01381h.AAW(AdError.CACHE_ERROR);
                return;
            }
            C7B c7b = new C7B(playableAdData.A0E(), anonymousClass17.A0T(), anonymousClass17.A0S());
            c7b.A04 = true;
            if (JQ.A13(xi)) {
                c7b.A03 = A00(0, 5, 30);
            }
            int i = C01371g.A00[playableAdData.A09().ordinal()];
            if (i == 1 || i == 2) {
                c7c.A0S(c7b);
            }
            c7c.A0Q(new AnonymousClass79(anonymousClass17.A0N().A01(), -1, -1, anonymousClass17.A0T(), anonymousClass17.A0S()));
            c7c.A0Q(new AnonymousClass79(playableAdData.A0D(), -1, -1, anonymousClass17.A0T(), anonymousClass17.A0S()));
            c7c.A0P(new S1(xi, interfaceC01381h, c7c, playableAdData, z, null), new AnonymousClass75(anonymousClass17.A0T(), anonymousClass17.A0S()));
            return;
        }
        interfaceC01381h.AAX();
    }
}
