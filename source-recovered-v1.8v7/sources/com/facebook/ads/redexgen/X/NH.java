package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NH implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass27 A00;
    public final /* synthetic */ N4 A01;
    public final /* synthetic */ NI A02;

    public NH(NI ni, N4 n4, AnonymousClass27 anonymousClass27) {
        this.A02 = ni;
        this.A01 = n4;
        this.A00 = anonymousClass27;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        NH nh = this;
        NH nh2 = null;
        char c2 = C0601Ko.A02(nh) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    nh = nh;
                    nh2 = nh;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        nh2 = nh2;
                        nh2.A01.A01();
                        nh2.A02.A02.AAP(nh2.A00);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, nh2);
                        return;
                    }
            }
        }
    }
}
