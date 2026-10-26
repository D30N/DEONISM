package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class PQ implements View.OnClickListener {
    public final /* synthetic */ C0549In A00;

    public PQ(C0549In c0549In) {
        this.A00 = c0549In;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        PQ pq = this;
        PQ pq2 = null;
        char c2 = C0601Ko.A02(pq) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    break;
                case 3:
                    pq = pq;
                    pq2 = pq;
                    c2 = 4;
                case 4:
                    pq2 = pq2;
                    pq2.A00.A03.A02(EnumC0564Jc.A0Y, null);
                    pq2.A00.A02.A0A().A32();
                    c2 = pq2.A00.A00 == null ? (char) 15 : (char) 16;
                case 15:
                    break;
                case 16:
                    try {
                        pq2 = pq2;
                        c2 = pq2.A00.A07() ? (char) 19 : (char) 24;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, pq2);
                        return;
                    }
                case 19:
                    pq2 = pq2;
                    pq2.A00.A00.setVolume(1.0f);
                    break;
                case 24:
                    pq2 = pq2;
                    pq2.A00.A00.setVolume(0.0f);
                    break;
            }
            return;
        }
        pq2.A00.A09();
    }
}
