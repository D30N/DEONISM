package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Oc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0690Oc implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ AnonymousClass88 A00;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 12);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{-47, -28, -33, -32, -22, -53, -25, -36, -12, -35, -36, -34, -26, -64, -19, -19, -22, -19};
    }

    public RunnableC0690Oc(AnonymousClass88 anonymousClass88) {
        this.A00 = anonymousClass88;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        RunnableC0690Oc runnableC0690Oc = this;
        RunnableC0690Oc runnableC0690Oc2 = null;
        char c2 = C0601Ko.A02(runnableC0690Oc) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    runnableC0690Oc = runnableC0690Oc;
                    runnableC0690Oc2 = runnableC0690Oc;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        runnableC0690Oc2 = runnableC0690Oc2;
                        runnableC0690Oc2.A00.A00.A0G(A00(0, 18, 111));
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, runnableC0690Oc2);
                        return;
                    }
            }
        }
    }
}
