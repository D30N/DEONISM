package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class N7 implements View.OnClickListener {
    public final /* synthetic */ C1021aT A00;

    public N7(C1021aT c1021aT) {
        this.A00 = c1021aT;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        N7 n7 = this;
        N7 n72 = null;
        char c2 = C0601Ko.A02(n7) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    n7 = n7;
                    n72 = n7;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        n72 = n72;
                        n72.A00.A0A.AAH(AnonymousClass25.A05);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, n72);
                        return;
                    }
            }
        }
    }
}
