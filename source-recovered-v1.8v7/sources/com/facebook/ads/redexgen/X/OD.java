package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class OD implements View.OnClickListener {
    public final /* synthetic */ C03289d A00;

    public OD(C03289d c03289d) {
        this.A00 = c03289d;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        OD od = this;
        OD od2 = null;
        char c2 = C0601Ko.A02(od) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    od = od;
                    od2 = od;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        od2 = od2;
                        od2.A00.A07 = false;
                        if (od2.A00.A04 != null) {
                            C0635Ly.A0O(od2.A00.A04);
                        }
                        C0635Ly.A0Q(od2.A00.A0A, 0);
                        C0635Ly.A0Q(od2.A00.A0B, 0);
                        C0635Ly.A0Q(od2.A00.getAdDetailsView(), 0);
                        C0635Ly.A0M(od2.A00.A08);
                        od2.A00.A0A.A0Y(PC.A03, 14);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, od2);
                        return;
                    }
            }
        }
    }
}
