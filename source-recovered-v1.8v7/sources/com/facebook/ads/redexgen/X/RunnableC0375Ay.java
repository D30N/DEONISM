package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;

/* renamed from: com.facebook.ads.redexgen.X.Ay, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0375Ay implements Runnable {
    public final /* synthetic */ Format A00;
    public final /* synthetic */ B2 A01;

    public RunnableC0375Ay(B2 b2, Format format) {
        this.A01 = b2;
        this.A00 = format;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        RunnableC0375Ay runnableC0375Ay = this;
        RunnableC0375Ay runnableC0375Ay2 = null;
        char c2 = C0601Ko.A02(runnableC0375Ay) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    runnableC0375Ay = runnableC0375Ay;
                    runnableC0375Ay2 = runnableC0375Ay;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        runnableC0375Ay2 = runnableC0375Ay2;
                        runnableC0375Ay2.A01.A01.A8y(runnableC0375Ay2.A00);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, runnableC0375Ay2);
                        return;
                    }
            }
        }
    }
}
