package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class B0 implements Runnable {
    public final /* synthetic */ B2 A00;
    public final /* synthetic */ BW A01;

    public B0(B2 b2, BW bw) {
        this.A00 = b2;
        this.A01 = bw;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        B0 b0 = this;
        B0 b02 = null;
        char c2 = C0601Ko.A02(b0) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    b0 = b0;
                    b02 = b0;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        b02 = b02;
                        b02.A01.A00();
                        b02.A00.A01.A8w(b02.A01);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, b02);
                        return;
                    }
            }
        }
    }
}
