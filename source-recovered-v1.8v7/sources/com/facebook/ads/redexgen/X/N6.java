package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class N6 implements View.OnClickListener {
    public final /* synthetic */ C1021aT A00;

    public N6(C1021aT c1021aT) {
        this.A00 = c1021aT;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        N6 n6 = this;
        N6 n62 = null;
        char c2 = C0601Ko.A02(n6) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    n6 = n6;
                    n62 = n6;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        n62 = n62;
                        n62.A00.A0A.AAH(AnonymousClass25.A03);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, n62);
                        return;
                    }
            }
        }
    }
}
