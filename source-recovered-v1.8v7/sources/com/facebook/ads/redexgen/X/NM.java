package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NM implements View.OnClickListener {
    public final /* synthetic */ N4 A00;
    public final /* synthetic */ C1012aK A01;

    public NM(C1012aK c1012aK, N4 n4) {
        this.A01 = c1012aK;
        this.A00 = n4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        NM nm = this;
        NM nm2 = null;
        char c2 = C0601Ko.A02(nm) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    nm = nm;
                    nm2 = nm;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        nm2 = nm2;
                        nm2.A00.A01();
                        nm2.A01.A0A.A7q();
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, nm2);
                        return;
                    }
            }
        }
    }
}
