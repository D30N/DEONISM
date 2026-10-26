package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NC implements View.OnClickListener {
    public final /* synthetic */ N4 A00;
    public final /* synthetic */ C1017aP A01;

    public NC(C1017aP c1017aP, N4 n4) {
        this.A01 = c1017aP;
        this.A00 = n4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        NC nc = this;
        NC nc2 = null;
        char c2 = C0601Ko.A02(nc) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    nc = nc;
                    nc2 = nc;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        nc2 = nc2;
                        nc2.A00.A01();
                        nc2.A01.A0A.A7q();
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, nc2);
                        return;
                    }
            }
        }
    }
}
