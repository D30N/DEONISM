package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class MO implements View.OnClickListener {
    public final /* synthetic */ DialogC1169cu A00;
    public final /* synthetic */ C1171cw A01;
    public final /* synthetic */ InterfaceC0647Mk A02;

    public MO(C1171cw c1171cw, InterfaceC0647Mk interfaceC0647Mk, DialogC1169cu dialogC1169cu) {
        this.A01 = c1171cw;
        this.A02 = interfaceC0647Mk;
        this.A00 = dialogC1169cu;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        MO mo = this;
        MO mo2 = null;
        char c2 = C0601Ko.A02(mo) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    mo = mo;
                    mo2 = mo;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        mo2 = mo2;
                        mo2.A02.A8q();
                        mo2.A00.hide();
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, mo2);
                        return;
                    }
            }
        }
    }
}
