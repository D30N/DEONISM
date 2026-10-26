package com.facebook.ads.redexgen.X;

import android.os.ConditionVariable;

/* loaded from: assets/audience_network.dex */
public class IG extends Thread {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ C1109bt A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IG(C1109bt c1109bt, String str, ConditionVariable conditionVariable) {
        super(str);
        this.A01 = c1109bt;
        this.A00 = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        if (C0601Ko.A02(this)) {
            return;
        }
        try {
            synchronized (this.A01) {
                try {
                    this.A00.open();
                    this.A01.A04();
                } finally {
                    th = th;
                    while (true) {
                        try {
                        } catch (Throwable th) {
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            C0601Ko.A00(th2, this);
        }
    }
}
