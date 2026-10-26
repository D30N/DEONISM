package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NN implements View.OnClickListener {
    public final /* synthetic */ C1012aK A00;

    public NN(C1012aK c1012aK) {
        this.A00 = c1012aK;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        NN nn = this;
        NN nn2 = null;
        char c2 = C0601Ko.A02(nn) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    nn = nn;
                    nn2 = nn;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        nn2 = nn2;
                        nn2.A00.A0A.A7G();
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, nn2);
                        return;
                    }
            }
        }
    }
}
