package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NG implements View.OnClickListener {
    public final /* synthetic */ NI A00;

    public NG(NI ni) {
        this.A00 = ni;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        NG ng = this;
        NG ng2 = null;
        char c2 = C0601Ko.A02(ng) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    ng = ng;
                    ng2 = ng;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        ng2 = ng2;
                        ng2.A00.A02.A7G();
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, ng2);
                        return;
                    }
            }
        }
    }
}
