package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class EV implements Runnable {
    public final /* synthetic */ EX A00;
    public final /* synthetic */ Throwable A01;

    public EV(EX ex, Throwable th) {
        this.A00 = ex;
        this.A01 = th;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0601Ko.A02(this)) {
            return;
        }
        try {
            if (!this.A00.A0G(1, this.A01 != null ? 4 : 2, this.A01) && !this.A00.A0F(6, 3) && !this.A00.A0F(7, 0)) {
                throw new IllegalStateException();
            }
        } catch (Throwable th) {
            C0601Ko.A00(th, this);
        }
    }
}
