package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NJ implements View.OnClickListener {
    public final /* synthetic */ C1012aK A00;

    public NJ(C1012aK c1012aK) {
        this.A00 = c1012aK;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        NJ nj = this;
        NJ nj2 = null;
        char c2 = C0601Ko.A02(nj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    nj = nj;
                    nj2 = nj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        nj2 = nj2;
                        nj2.A00.A0A.A7G();
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, nj2);
                        return;
                    }
            }
        }
    }
}
