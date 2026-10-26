package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class N8 implements View.OnClickListener {
    public final /* synthetic */ C1021aT A00;

    public N8(C1021aT c1021aT) {
        this.A00 = c1021aT;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        N8 n8 = this;
        N8 n82 = null;
        char c2 = C0601Ko.A02(n8) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    n8 = n8;
                    n82 = n8;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        n82 = n82;
                        n82.A00.A0A.A7q();
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, n82);
                        return;
                    }
            }
        }
    }
}
