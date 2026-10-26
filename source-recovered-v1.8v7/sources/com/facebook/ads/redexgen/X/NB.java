package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NB implements View.OnClickListener {
    public final /* synthetic */ N4 A00;
    public final /* synthetic */ C1017aP A01;

    public NB(C1017aP c1017aP, N4 n4) {
        this.A01 = c1017aP;
        this.A00 = n4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        NB nb = this;
        NB nb2 = null;
        char c2 = C0601Ko.A02(nb) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    nb = nb;
                    nb2 = nb;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        nb2 = nb2;
                        nb2.A00.A01();
                        nb2.A01.A0A.AAH(AnonymousClass25.A05);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, nb2);
                        return;
                    }
            }
        }
    }
}
