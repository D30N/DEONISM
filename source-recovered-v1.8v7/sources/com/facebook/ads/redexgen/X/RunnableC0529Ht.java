package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Ht, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class RunnableC0529Ht implements Runnable {
    public final InterfaceC0528Hs A00;

    public RunnableC0529Ht(InterfaceC0528Hs interfaceC0528Hs) {
        this.A00 = interfaceC0528Hs;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        RunnableC0529Ht runnableC0529Ht = this;
        RunnableC0529Ht runnableC0529Ht2 = null;
        char c2 = C0601Ko.A02(runnableC0529Ht) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    runnableC0529Ht = runnableC0529Ht;
                    runnableC0529Ht2 = runnableC0529Ht;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        runnableC0529Ht2 = runnableC0529Ht2;
                        runnableC0529Ht2.A00.AAB();
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, runnableC0529Ht2);
                        return;
                    }
            }
        }
    }
}
