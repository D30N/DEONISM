package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class FF implements Runnable {
    public final /* synthetic */ FL A00;
    public final /* synthetic */ FM A01;
    public final /* synthetic */ FN A02;
    public final /* synthetic */ FO A03;

    public FF(FL fl, FO fo, FM fm, FN fn) {
        this.A00 = fl;
        this.A03 = fo;
        this.A01 = fm;
        this.A02 = fn;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        FF ff = this;
        FF ff2 = null;
        char c2 = C0601Ko.A02(ff) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    ff = ff;
                    ff2 = ff;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        ff2 = ff2;
                        ff2.A03.AA3(ff2.A00.A00, ff2.A00.A01, ff2.A01, ff2.A02);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, ff2);
                        return;
                    }
            }
        }
    }
}
