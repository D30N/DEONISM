package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Az, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0376Az implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ B2 A03;

    public RunnableC0376Az(B2 b2, int i, long j, long j2) {
        this.A03 = b2;
        this.A00 = i;
        this.A01 = j;
        this.A02 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        RunnableC0376Az runnableC0376Az = this;
        RunnableC0376Az runnableC0376Az2 = null;
        char c2 = C0601Ko.A02(runnableC0376Az) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    runnableC0376Az = runnableC0376Az;
                    runnableC0376Az2 = runnableC0376Az;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        runnableC0376Az2 = runnableC0376Az2;
                        runnableC0376Az2.A03.A01.A90(runnableC0376Az2.A00, runnableC0376Az2.A01, runnableC0376Az2.A02);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, runnableC0376Az2);
                        return;
                    }
            }
        }
    }
}
