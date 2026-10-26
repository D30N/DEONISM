package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class JE implements Runnable {
    public final /* synthetic */ BW A00;
    public final /* synthetic */ JL A01;

    public JE(JL jl, BW bw) {
        this.A01 = jl;
        this.A00 = bw;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        JE je = this;
        JE je2 = null;
        char c2 = C0601Ko.A02(je) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    je = je;
                    je2 = je;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        je2 = je2;
                        je2.A01.A01.ABM(je2.A00);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, je2);
                        return;
                    }
            }
        }
    }
}
