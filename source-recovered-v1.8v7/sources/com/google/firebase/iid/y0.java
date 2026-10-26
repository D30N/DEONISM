package com.google.firebase.iid;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final /* synthetic */ class y0 implements Executor {
    static final Executor a = new y0();

    private y0() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
