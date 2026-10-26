package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class ND implements View.OnClickListener {
    public final /* synthetic */ C1017aP A00;

    public ND(C1017aP c1017aP) {
        this.A00 = c1017aP;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        ND nd = this;
        ND nd2 = null;
        char c2 = C0601Ko.A02(nd) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    nd = nd;
                    nd2 = nd;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        nd2 = nd2;
                        nd2.A00.A0A.A7G();
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, nd2);
                        return;
                    }
            }
        }
    }
}
