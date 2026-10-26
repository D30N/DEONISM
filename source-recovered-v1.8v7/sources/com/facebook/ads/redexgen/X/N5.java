package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class N5 implements View.OnClickListener {
    public final /* synthetic */ C1021aT A00;

    public N5(C1021aT c1021aT) {
        this.A00 = c1021aT;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        N5 n5 = this;
        N5 n52 = null;
        char c2 = C0601Ko.A02(n5) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    n5 = n5;
                    n52 = n5;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        n52 = n52;
                        n52.A00.A0A.A42();
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, n52);
                        return;
                    }
            }
        }
    }
}
