package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Nf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0667Nf implements Runnable {
    public final /* synthetic */ C0668Ng A00;
    public final /* synthetic */ InterfaceC0669Nh A01;

    public RunnableC0667Nf(C0668Ng c0668Ng, InterfaceC0669Nh interfaceC0669Nh) {
        this.A00 = c0668Ng;
        this.A01 = interfaceC0669Nh;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        RunnableC0667Nf runnableC0667Nf = this;
        RunnableC0667Nf runnableC0667Nf2 = null;
        char c2 = C0601Ko.A02(runnableC0667Nf) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    runnableC0667Nf = runnableC0667Nf;
                    runnableC0667Nf2 = runnableC0667Nf;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        runnableC0667Nf2 = runnableC0667Nf2;
                        runnableC0667Nf2.A01.A8u();
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, runnableC0667Nf2);
                        return;
                    }
            }
        }
    }
}
