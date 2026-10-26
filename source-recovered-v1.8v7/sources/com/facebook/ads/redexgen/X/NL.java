package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NL implements View.OnClickListener {
    public final /* synthetic */ N4 A00;
    public final /* synthetic */ C1012aK A01;

    public NL(C1012aK c1012aK, N4 n4) {
        this.A01 = c1012aK;
        this.A00 = n4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        NL nl = this;
        NL nl2 = null;
        char c2 = C0601Ko.A02(nl) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    nl = nl;
                    nl2 = nl;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        nl2 = nl2;
                        nl2.A00.A01();
                        nl2.A01.A0A.AAH(AnonymousClass25.A05);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, nl2);
                        return;
                    }
            }
        }
    }
}
