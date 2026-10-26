package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public class FG implements Runnable {
    public final /* synthetic */ FL A00;
    public final /* synthetic */ FM A01;
    public final /* synthetic */ FN A02;
    public final /* synthetic */ FO A03;
    public final /* synthetic */ IOException A04;
    public final /* synthetic */ boolean A05;

    public FG(FL fl, FO fo, FM fm, FN fn, IOException iOException, boolean z) {
        this.A00 = fl;
        this.A03 = fo;
        this.A01 = fm;
        this.A02 = fn;
        this.A04 = iOException;
        this.A05 = z;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        FG fg = this;
        FG fg2 = null;
        char c2 = C0601Ko.A02(fg) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    fg = fg;
                    fg2 = fg;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        fg2 = fg2;
                        fg2.A03.AA8(fg2.A00.A00, fg2.A00.A01, fg2.A01, fg2.A02, fg2.A04, fg2.A05);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, fg2);
                        return;
                    }
            }
        }
    }
}
