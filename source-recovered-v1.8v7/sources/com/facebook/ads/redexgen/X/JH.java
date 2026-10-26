package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class JH implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ JL A02;

    public JH(JL jl, int i, long j) {
        this.A02 = jl;
        this.A00 = i;
        this.A01 = j;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        JH jh = this;
        JH jh2 = null;
        char c2 = C0601Ko.A02(jh) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    jh = jh;
                    jh2 = jh;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        jh2 = jh2;
                        jh2.A02.A01.A9U(jh2.A00, jh2.A01);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, jh2);
                        return;
                    }
            }
        }
    }
}
