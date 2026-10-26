package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Aw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0373Aw implements Runnable {
    public final /* synthetic */ B2 A00;
    public final /* synthetic */ BW A01;

    public RunnableC0373Aw(B2 b2, BW bw) {
        this.A00 = b2;
        this.A01 = bw;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        RunnableC0373Aw runnableC0373Aw = this;
        RunnableC0373Aw runnableC0373Aw2 = null;
        char c2 = C0601Ko.A02(runnableC0373Aw) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    runnableC0373Aw = runnableC0373Aw;
                    runnableC0373Aw2 = runnableC0373Aw;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        runnableC0373Aw2 = runnableC0373Aw2;
                        runnableC0373Aw2.A00.A01.A8x(runnableC0373Aw2.A01);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, runnableC0373Aw2);
                        return;
                    }
            }
        }
    }
}
