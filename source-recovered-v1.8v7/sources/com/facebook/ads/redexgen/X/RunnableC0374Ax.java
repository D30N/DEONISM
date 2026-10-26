package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Ax, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0374Ax implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ B2 A02;
    public final /* synthetic */ String A03;

    public RunnableC0374Ax(B2 b2, String str, long j, long j2) {
        this.A02 = b2;
        this.A03 = str;
        this.A01 = j;
        this.A00 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        RunnableC0374Ax runnableC0374Ax = this;
        RunnableC0374Ax runnableC0374Ax2 = null;
        char c2 = C0601Ko.A02(runnableC0374Ax) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    runnableC0374Ax = runnableC0374Ax;
                    runnableC0374Ax2 = runnableC0374Ax;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        runnableC0374Ax2 = runnableC0374Ax2;
                        runnableC0374Ax2.A02.A01.A8v(runnableC0374Ax2.A03, runnableC0374Ax2.A01, runnableC0374Ax2.A00);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, runnableC0374Ax2);
                        return;
                    }
            }
        }
    }
}
