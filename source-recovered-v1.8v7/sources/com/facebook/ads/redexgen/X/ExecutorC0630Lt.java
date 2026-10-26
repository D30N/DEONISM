package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.redexgen.X.Lt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class ExecutorC0630Lt implements Executor {
    public static final ExecutorC0630Lt A01 = new ExecutorC0630Lt();
    public final Handler A00 = new Handler(Looper.getMainLooper());

    public static void A00(Runnable runnable) {
        char c2 = Looper.myLooper() == Looper.getMainLooper() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    runnable = runnable;
                    runnable.run();
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    runnable = runnable;
                    A01.execute(runnable);
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.A00.post(runnable);
    }
}
