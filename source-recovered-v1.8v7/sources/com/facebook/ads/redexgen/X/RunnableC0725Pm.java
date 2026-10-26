package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Pm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0725Pm implements Runnable {
    public final /* synthetic */ C0728Pp A00;

    public RunnableC0725Pm(C0728Pp c0728Pp) {
        this.A00 = c0728Pp;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        RunnableC0725Pm runnableC0725Pm = this;
        RunnableC0725Pm runnableC0725Pm2 = null;
        char c2 = C0601Ko.A02(runnableC0725Pm) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    runnableC0725Pm = runnableC0725Pm;
                    runnableC0725Pm2 = runnableC0725Pm;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        runnableC0725Pm2 = runnableC0725Pm2;
                        runnableC0725Pm2.A00.A08();
                        runnableC0725Pm2.A00.A05.removeCallbacks(runnableC0725Pm2);
                        runnableC0725Pm2.A00.A05.postDelayed(runnableC0725Pm2, 250L);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, runnableC0725Pm2);
                        return;
                    }
            }
        }
    }
}
