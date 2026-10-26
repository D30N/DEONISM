package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class EU implements Runnable {
    public final /* synthetic */ EX A00;

    public EU(EX ex) {
        this.A00 = ex;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        EU eu = this;
        EU eu2 = null;
        char c2 = C0601Ko.A02(eu) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    eu = eu;
                    eu2 = eu;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        eu2 = eu2;
                        eu2.A00.A0F(5, 3);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, eu2);
                        return;
                    }
            }
        }
    }
}
