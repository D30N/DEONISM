package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class FJ implements Runnable {
    public final /* synthetic */ FL A00;
    public final /* synthetic */ FN A01;
    public final /* synthetic */ FO A02;

    public FJ(FL fl, FO fo, FN fn) {
        this.A00 = fl;
        this.A02 = fo;
        this.A01 = fn;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        FJ fj = this;
        FJ fj2 = null;
        char c2 = C0601Ko.A02(fj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    fj = fj;
                    fj2 = fj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        fj2 = fj2;
                        fj2.A02.A9P(fj2.A00.A00, fj2.A00.A01, fj2.A01);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, fj2);
                        return;
                    }
            }
        }
    }
}
