package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class FD implements Runnable {
    public final /* synthetic */ FL A00;
    public final /* synthetic */ FM A01;
    public final /* synthetic */ FN A02;
    public final /* synthetic */ FO A03;

    public FD(FL fl, FO fo, FM fm, FN fn) {
        this.A00 = fl;
        this.A03 = fo;
        this.A01 = fm;
        this.A02 = fn;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        FD fd = this;
        FD fd2 = null;
        char c2 = C0601Ko.A02(fd) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    fd = fd;
                    fd2 = fd;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        fd2 = fd2;
                        fd2.A03.AAA(fd2.A00.A00, fd2.A00.A01, fd2.A01, fd2.A02);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, fd2);
                        return;
                    }
            }
        }
    }
}
