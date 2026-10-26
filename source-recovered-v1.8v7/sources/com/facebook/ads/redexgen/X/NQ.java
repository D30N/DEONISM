package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NQ implements View.OnClickListener {
    public final /* synthetic */ NT A00;

    public NQ(NT nt) {
        this.A00 = nt;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        NQ nq = this;
        NQ nq2 = null;
        char c2 = C0601Ko.A02(nq) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    nq = nq;
                    nq2 = nq;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        nq2 = nq2;
                        if (nq2.A00.A02 == null) {
                            return;
                        }
                        nq2.A00.A02.A9B();
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, nq2);
                        return;
                    }
            }
        }
    }
}
