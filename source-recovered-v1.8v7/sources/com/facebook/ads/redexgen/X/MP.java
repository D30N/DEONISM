package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class MP implements View.OnClickListener {
    public final /* synthetic */ DialogC1169cu A00;
    public final /* synthetic */ C1171cw A01;
    public final /* synthetic */ InterfaceC0647Mk A02;

    public MP(C1171cw c1171cw, InterfaceC0647Mk interfaceC0647Mk, DialogC1169cu dialogC1169cu) {
        this.A01 = c1171cw;
        this.A02 = interfaceC0647Mk;
        this.A00 = dialogC1169cu;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        MP mp = this;
        MP mp2 = null;
        char c2 = C0601Ko.A02(mp) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    mp = mp;
                    mp2 = mp;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        mp2 = mp2;
                        mp2.A02.A8p();
                        mp2.A00.hide();
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, mp2);
                        return;
                    }
            }
        }
    }
}
