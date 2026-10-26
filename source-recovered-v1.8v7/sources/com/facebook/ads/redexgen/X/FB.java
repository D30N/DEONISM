package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class FB implements Runnable {
    public final /* synthetic */ FL A00;
    public final /* synthetic */ FO A01;

    public FB(FL fl, FO fo) {
        this.A00 = fl;
        this.A01 = fo;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        FB fb = this;
        FB fb2 = null;
        char c2 = C0601Ko.A02(fb) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    fb = fb;
                    fb2 = fb;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        fb2 = fb2;
                        fb2.A01.AAF(fb2.A00.A00, fb2.A00.A01);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, fb2);
                        return;
                    }
            }
        }
    }
}
