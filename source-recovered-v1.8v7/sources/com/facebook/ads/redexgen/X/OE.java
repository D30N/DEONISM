package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class OE implements View.OnClickListener {
    public final /* synthetic */ C03289d A00;

    public OE(C03289d c03289d) {
        this.A00 = c03289d;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        OE oe = this;
        OE oe2 = null;
        char c2 = C0601Ko.A02(oe) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    oe = oe;
                    oe2 = oe;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        oe2 = oe2;
                        oe2.A00.A07 = false;
                        oe2.A00.A0C();
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, oe2);
                        return;
                    }
            }
        }
    }
}
