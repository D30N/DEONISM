package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class JK implements Runnable {
    public final /* synthetic */ BW A00;
    public final /* synthetic */ JL A01;

    public JK(JL jl, BW bw) {
        this.A01 = jl;
        this.A00 = bw;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        JK jk = this;
        JK jk2 = null;
        char c2 = C0601Ko.A02(jk) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    jk = jk;
                    jk2 = jk;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        jk2 = jk2;
                        jk2.A00.A00();
                        jk2.A01.A01.ABL(jk2.A00);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, jk2);
                        return;
                    }
            }
        }
    }
}
