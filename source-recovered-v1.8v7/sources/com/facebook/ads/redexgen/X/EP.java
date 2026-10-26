package com.facebook.ads.redexgen.X;

import android.os.ConditionVariable;

/* loaded from: assets/audience_network.dex */
public class EP implements Runnable {
    public final /* synthetic */ ConditionVariable A00;

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        EP ep = this;
        EP ep2 = null;
        char c2 = C0601Ko.A02(ep) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    ep = ep;
                    ep2 = ep;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        ep2 = ep2;
                        ep2.A00.open();
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, ep2);
                        return;
                    }
            }
        }
    }
}
