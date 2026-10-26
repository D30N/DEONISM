package com.facebook.ads.redexgen.X;

import android.view.Surface;

/* loaded from: assets/audience_network.dex */
public class JJ implements Runnable {
    public final /* synthetic */ Surface A00;
    public final /* synthetic */ JL A01;

    public JJ(JL jl, Surface surface) {
        this.A01 = jl;
        this.A00 = surface;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        JJ jj = this;
        JJ jj2 = null;
        char c2 = C0601Ko.A02(jj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    jj = jj;
                    jj2 = jj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        jj2 = jj2;
                        jj2.A01.A01.AAp(jj2.A00);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, jj2);
                        return;
                    }
            }
        }
    }
}
