package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class N9 implements View.OnClickListener {
    public final /* synthetic */ C1017aP A00;

    public N9(C1017aP c1017aP) {
        this.A00 = c1017aP;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        N9 n9 = this;
        N9 n92 = null;
        char c2 = C0601Ko.A02(n9) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    n9 = n9;
                    n92 = n9;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        n92 = n92;
                        n92.A00.A0A.A7G();
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, n92);
                        return;
                    }
            }
        }
    }
}
