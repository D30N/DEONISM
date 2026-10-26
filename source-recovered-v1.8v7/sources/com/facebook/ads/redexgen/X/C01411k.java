package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.1k, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01411k {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 88);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A00 = new byte[]{56, 43, 61, 39, 56, 42, 43, 42, 37, 60, 47, 42, 43, 53};
    }

    public static void A02(C7C c7c, C0787Rw c0787Rw) {
        c7c.A0R(new AnonymousClass79(c0787Rw.A0N().A01(), C0697Oj.A04, C0697Oj.A04, c0787Rw.A0T(), A00(0, 14, 110)));
        c7c.A0V(new C7B(c0787Rw.A0L().A0D().A08(), c0787Rw.A0T(), A00(0, 14, 110), c0787Rw.A0L().A0D().A05()));
        c7c.A0R(new AnonymousClass79(c0787Rw.A0L().A0D().A07(), C01361f.A00(c0787Rw.A0L().A0D()), C01361f.A01(c0787Rw.A0L().A0D()), c0787Rw.A0T(), A00(0, 14, 110)));
        Iterator<String> it = c0787Rw.A0L().A0G().A00().iterator();
        while (it.hasNext()) {
            c7c.A0R(new AnonymousClass79(it.next(), -1, -1, c0787Rw.A0T(), A00(0, 14, 110)));
        }
    }
}
