package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class FC implements Runnable {
    public final /* synthetic */ FL A00;
    public final /* synthetic */ FO A01;

    public FC(FL fl, FO fo) {
        this.A00 = fl;
        this.A01 = fo;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        FC fc = this;
        FC fc2 = null;
        char c2 = C0601Ko.A02(fc) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    fc = fc;
                    fc2 = fc;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        fc2 = fc2;
                        fc2.A01.AAG(fc2.A00.A00, fc2.A00.A01);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, fc2);
                        return;
                    }
            }
        }
    }
}
