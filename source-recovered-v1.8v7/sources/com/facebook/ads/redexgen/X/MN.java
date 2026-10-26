package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class MN implements View.OnClickListener {
    public final /* synthetic */ C1171cw A00;

    public MN(C1171cw c1171cw) {
        this.A00 = c1171cw;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        MN mn = this;
        MN mn2 = null;
        char c2 = C0601Ko.A02(mn) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    mn = mn;
                    mn2 = mn;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        mn2 = mn2;
                        if (mn2.A00.A00 == null || !mn2.A00.A04.A02()) {
                            return;
                        }
                        mn2.A00.A00.A9B();
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, mn2);
                        return;
                    }
            }
        }
    }
}
