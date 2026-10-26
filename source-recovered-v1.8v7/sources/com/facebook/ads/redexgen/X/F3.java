package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class F3 implements Runnable {
    public final /* synthetic */ C5 A00;

    public F3(C5 c5) {
        this.A00 = c5;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        F3 f3 = this;
        F3 f32 = null;
        char c2 = C0601Ko.A02(f3) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    f3 = f3;
                    f32 = f3;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        f32 = f32;
                        if (!f32.A00.A0G) {
                            f32.A00.A08.A9G(f32.A00);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, f32);
                        return;
                    }
            }
        }
    }
}
