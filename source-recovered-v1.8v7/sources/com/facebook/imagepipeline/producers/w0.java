package com.facebook.imagepipeline.producers;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class w0 implements v0 {
    private boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    private final Deque<Runnable> f1412b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f1413c;

    public w0(Executor executor) {
        d.a.b.d.i.g(executor);
        this.f1413c = executor;
        this.f1412b = new ArrayDeque();
    }

    @Override // com.facebook.imagepipeline.producers.v0
    public synchronized void a(Runnable runnable) {
        if (this.a) {
            this.f1412b.add(runnable);
        } else {
            this.f1413c.execute(runnable);
        }
    }

    @Override // com.facebook.imagepipeline.producers.v0
    public synchronized void b(Runnable runnable) {
        this.f1412b.remove(runnable);
    }
}
