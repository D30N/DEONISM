package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class FH implements Runnable {
    public final /* synthetic */ FL A00;
    public final /* synthetic */ FO A01;

    public FH(FL fl, FO fo) {
        this.A00 = fl;
        this.A01 = fo;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        FH fh = this;
        FH fh2 = null;
        char c2 = C0601Ko.A02(fh) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    fh = fh;
                    fh2 = fh;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        fh2 = fh2;
                        fh2.A01.AAm(fh2.A00.A00, fh2.A00.A01);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, fh2);
                        return;
                    }
            }
        }
    }
}
