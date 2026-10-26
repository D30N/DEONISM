package com.facebook.imagepipeline.producers;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class s implements v0 {
    private final Executor a;

    public s(Executor executor) {
        d.a.b.d.i.g(executor);
        this.a = executor;
    }

    @Override // com.facebook.imagepipeline.producers.v0
    public void a(Runnable runnable) {
        this.a.execute(runnable);
    }

    @Override // com.facebook.imagepipeline.producers.v0
    public void b(Runnable runnable) {
    }
}
