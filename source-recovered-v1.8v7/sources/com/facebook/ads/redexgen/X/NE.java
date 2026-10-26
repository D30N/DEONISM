package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NE implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass27 A00;
    public final /* synthetic */ N4 A01;
    public final /* synthetic */ C1017aP A02;

    public NE(C1017aP c1017aP, N4 n4, AnonymousClass27 anonymousClass27) {
        this.A02 = c1017aP;
        this.A01 = n4;
        this.A00 = anonymousClass27;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        NE ne = this;
        NE ne2 = null;
        char c2 = C0601Ko.A02(ne) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    ne = ne;
                    ne2 = ne;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        ne2 = ne2;
                        ne2.A01.A01();
                        ne2.A02.A0A.AAP(ne2.A00);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, ne2);
                        return;
                    }
            }
        }
    }
}
