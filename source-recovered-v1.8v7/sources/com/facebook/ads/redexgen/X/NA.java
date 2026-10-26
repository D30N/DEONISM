package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NA implements View.OnClickListener {
    public final /* synthetic */ N4 A00;
    public final /* synthetic */ C1017aP A01;

    public NA(C1017aP c1017aP, N4 n4) {
        this.A01 = c1017aP;
        this.A00 = n4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        NA na = this;
        NA na2 = null;
        char c2 = C0601Ko.A02(na) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    na = na;
                    na2 = na;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        na2 = na2;
                        na2.A00.A01();
                        na2.A01.A0A.AAH(AnonymousClass25.A03);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, na2);
                        return;
                    }
            }
        }
    }
}
