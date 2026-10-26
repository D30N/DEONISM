package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.0p, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC01200p {
    public static byte[] A04;
    public boolean A00;
    public final XI A01;
    public final AbstractC01210q A02;
    public final Q1 A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 100);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A04 = new byte[]{55, 19, 14, 12, 27, 13, 13, 23, 17, 16, 94, 18, 17, 25, 25, 27, 26};
    }

    public abstract void A06(Map<String, String> map);

    public AbstractC01200p(XI xi, AbstractC01210q abstractC01210q, Q1 q1) {
        this.A01 = xi;
        this.A02 = abstractC01210q;
        this.A03 = q1;
    }

    public final void A02() {
        AbstractC01200p abstractC01200p = this;
        AbstractC01210q abstractC01210q = null;
        char c2 = abstractC01200p.A00 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    abstractC01200p = abstractC01200p;
                    abstractC01210q = abstractC01200p.A02;
                    if (abstractC01210q == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    abstractC01210q = abstractC01210q;
                    abstractC01210q.A00();
                    c2 = 5;
                    break;
                case 5:
                    abstractC01200p = abstractC01200p;
                    abstractC01200p.A06(new C0676No().A03(abstractC01200p.A03).A05());
                    abstractC01200p.A00 = true;
                    LJ.A02(abstractC01200p.A01, A00(0, 17, 26));
                    if (abstractC01200p.A02 == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return;
            }
        }
    }
}
