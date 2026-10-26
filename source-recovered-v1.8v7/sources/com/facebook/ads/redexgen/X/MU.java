package com.facebook.ads.redexgen.X;

import android.view.View;
import com.facebook.ads.internal.view.FullScreenAdToolbar;

/* loaded from: assets/audience_network.dex */
public class MU implements View.OnClickListener {
    public final /* synthetic */ FullScreenAdToolbar A00;

    public MU(FullScreenAdToolbar fullScreenAdToolbar) {
        this.A00 = fullScreenAdToolbar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        MU mu = this;
        MU mu2 = null;
        char c2 = C0601Ko.A02(mu) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    mu = mu;
                    mu2 = mu;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        mu2 = mu2;
                        if (mu2.A00.A00 != null && mu2.A00.A05.A02()) {
                            mu2.A00.A00.A9B();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, mu2);
                        return;
                    }
            }
        }
    }
}
