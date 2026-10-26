package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class B1 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ B2 A01;

    public B1(B2 b2, int i) {
        this.A01 = b2;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        B1 b1 = this;
        B1 b12 = null;
        char c2 = C0601Ko.A02(b1) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    b1 = b1;
                    b12 = b1;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        b12 = b12;
                        b12.A01.A01.A8z(b12.A00);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, b12);
                        return;
                    }
            }
        }
    }
}
