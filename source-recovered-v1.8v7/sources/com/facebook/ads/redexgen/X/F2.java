package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class F2 implements Runnable {
    public final /* synthetic */ C5 A00;

    public F2(C5 c5) {
        this.A00 = c5;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        F2 f2 = this;
        F2 f22 = null;
        char c2 = C0601Ko.A02(f2) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    f2 = f2;
                    f22 = f2;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        f22 = f22;
                        f22.A00.A09();
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, f22);
                        return;
                    }
            }
        }
    }
}
