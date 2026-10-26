package com.google.firebase.analytics.a;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final /* synthetic */ class c implements Executor {
    static final Executor a = new c();

    private c() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
