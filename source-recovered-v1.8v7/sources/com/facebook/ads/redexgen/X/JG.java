package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;

/* loaded from: assets/audience_network.dex */
public class JG implements Runnable {
    public final /* synthetic */ Format A00;
    public final /* synthetic */ JL A01;

    public JG(JL jl, Format format) {
        this.A01 = jl;
        this.A00 = format;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        JG jg = this;
        JG jg2 = null;
        char c2 = C0601Ko.A02(jg) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    jg = jg;
                    jg2 = jg;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        jg2 = jg2;
                        jg2.A01.A01.ABO(jg2.A00);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, jg2);
                        return;
                    }
            }
        }
    }
}
