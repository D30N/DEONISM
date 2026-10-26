package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class JF implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ JL A02;
    public final /* synthetic */ String A03;

    public JF(JL jl, String str, long j, long j2) {
        this.A02 = jl;
        this.A03 = str;
        this.A01 = j;
        this.A00 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        JF jf = this;
        JF jf2 = null;
        char c2 = C0601Ko.A02(jf) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    jf = jf;
                    jf2 = jf;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        jf2 = jf2;
                        jf2.A02.A01.ABK(jf2.A03, jf2.A01, jf2.A00);
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, jf2);
                        return;
                    }
            }
        }
    }
}
