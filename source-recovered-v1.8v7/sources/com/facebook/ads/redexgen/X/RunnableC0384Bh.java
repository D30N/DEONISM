package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Bh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0384Bh implements Runnable {
    public final /* synthetic */ C0386Bj A00;
    public final /* synthetic */ InterfaceC0387Bk A01;

    public RunnableC0384Bh(C0386Bj c0386Bj, InterfaceC0387Bk interfaceC0387Bk) {
        this.A00 = c0386Bj;
        this.A01 = interfaceC0387Bk;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        RunnableC0384Bh runnableC0384Bh = this;
        RunnableC0384Bh runnableC0384Bh2 = null;
        char c2 = C0601Ko.A02(runnableC0384Bh) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    runnableC0384Bh = runnableC0384Bh;
                    runnableC0384Bh2 = runnableC0384Bh;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        runnableC0384Bh2 = runnableC0384Bh2;
                        runnableC0384Bh2.A01.A9R();
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, runnableC0384Bh2);
                        return;
                    }
            }
        }
    }
}
