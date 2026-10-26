package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class Hj implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C1081bR A03;

    public Hj(C1081bR c1081bR, int i, long j, long j2) {
        this.A03 = c1081bR;
        this.A00 = i;
        this.A02 = j;
        this.A01 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Hj hj = this;
        Hj hj2 = null;
        char c2 = C0601Ko.A02(hj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    hj = hj;
                    hj2 = hj;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        hj2 = hj2;
                        hj2.A03.A07.A91(hj2.A00, hj2.A02, hj2.A01);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, hj2);
                        return;
                    }
            }
        }
    }
}
