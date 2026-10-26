package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Be, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0381Be implements Runnable {
    public final /* synthetic */ C0386Bj A00;
    public final /* synthetic */ InterfaceC0387Bk A01;

    public RunnableC0381Be(C0386Bj c0386Bj, InterfaceC0387Bk interfaceC0387Bk) {
        this.A00 = c0386Bj;
        this.A01 = interfaceC0387Bk;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        RunnableC0381Be runnableC0381Be = this;
        RunnableC0381Be runnableC0381Be2 = null;
        char c2 = C0601Ko.A02(runnableC0381Be) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    runnableC0381Be = runnableC0381Be;
                    runnableC0381Be2 = runnableC0381Be;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        runnableC0381Be2 = runnableC0381Be2;
                        runnableC0381Be2.A01.A9Q();
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, runnableC0381Be2);
                        return;
                    }
            }
        }
    }
}
