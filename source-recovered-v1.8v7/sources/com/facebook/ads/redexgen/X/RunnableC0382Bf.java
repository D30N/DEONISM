package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Bf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0382Bf implements Runnable {
    public final /* synthetic */ C0386Bj A00;
    public final /* synthetic */ InterfaceC0387Bk A01;
    public final /* synthetic */ Exception A02;

    public RunnableC0382Bf(C0386Bj c0386Bj, InterfaceC0387Bk interfaceC0387Bk, Exception exc) {
        this.A00 = c0386Bj;
        this.A01 = interfaceC0387Bk;
        this.A02 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        RunnableC0382Bf runnableC0382Bf = this;
        RunnableC0382Bf runnableC0382Bf2 = null;
        char c2 = C0601Ko.A02(runnableC0382Bf) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    runnableC0382Bf = runnableC0382Bf;
                    runnableC0382Bf2 = runnableC0382Bf;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        runnableC0382Bf2 = runnableC0382Bf2;
                        runnableC0382Bf2.A01.A9T(runnableC0382Bf2.A02);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, runnableC0382Bf2);
                        return;
                    }
            }
        }
    }
}
