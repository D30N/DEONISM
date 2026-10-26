package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import java.util.concurrent.Executor;

/* loaded from: assets/audience_network.dex */
public final class MC {

    @Nullable
    public static MC A02;
    public final C1168ct A00;
    public final ME A01;

    public MC(XI xi, Executor executor, C03188s c03188s) {
        this.A01 = new ME(xi);
        this.A00 = new C1168ct(executor, c03188s, xi);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(XI xi, Executor executor, C03188s c03188s) {
        MC mc = null;
        char c2 = !JQ.A0r(xi) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    mc = A02;
                    if (mc != null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    xi = xi;
                    executor = executor;
                    c03188s = c03188s;
                    A02 = new MC(xi, executor, c03188s);
                    A02.A00();
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    c03188s = c03188s;
                    mc = mc;
                    mc.A02(c03188s);
                    c2 = 5;
                    break;
            }
        }
    }

    private void A02(C03188s c03188s) {
        this.A00.A06(c03188s);
    }
}
