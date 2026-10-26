package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class JI implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ JL A04;

    public JI(JL jl, int i, int i2, int i3, float f) {
        this.A04 = jl;
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A00 = f;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        JI ji = this;
        JI ji2 = null;
        char c2 = C0601Ko.A02(ji) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    ji = ji;
                    ji2 = ji;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        ji2 = ji2;
                        ji2.A04.A01.ABR(ji2.A03, ji2.A01, ji2.A02, ji2.A00);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, ji2);
                        return;
                    }
            }
        }
    }
}
