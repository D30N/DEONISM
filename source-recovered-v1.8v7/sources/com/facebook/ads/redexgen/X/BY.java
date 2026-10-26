package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class BY extends Thread {
    public final /* synthetic */ YV A00;

    public BY(YV yv) {
        this.A00 = yv;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        BY by = this;
        BY by2 = null;
        char c2 = C0601Ko.A02(by) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    by = by;
                    by2 = by;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        by2 = by2;
                        by2.A00.A0M();
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, by2);
                        return;
                    }
            }
        }
    }
}
