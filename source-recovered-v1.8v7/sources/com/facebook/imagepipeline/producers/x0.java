package com.facebook.imagepipeline.producers;

import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public class x0<T> implements l0<T> {
    private final l0<T> a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1422b;

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("this")
    private int f1423c;

    /* renamed from: d, reason: collision with root package name */
    @GuardedBy("this")
    private final ConcurrentLinkedQueue<Pair<k<T>, m0>> f1424d;
    private final Executor e;

    private class b extends n<T, T> {

        class a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Pair f1426b;

            a(Pair pair) {
                this.f1426b = pair;
            }

            @Override // java.lang.Runnable
            public void run() {
                x0 x0Var = x0.this;
                Pair pair = this.f1426b;
                x0Var.f((k) pair.first, (m0) pair.second);
            }
        }

        private b(k<T> kVar) {
            super(kVar);
        }

        private void q() {
            Pair pair;
            synchronized (x0.this) {
                pair = (Pair) x0.this.f1424d.poll();
                if (pair == null) {
                    x0.d(x0.this);
                }
            }
            if (pair != null) {
                x0.this.e.execute(new a(pair));
            }
        }

        @Override // com.facebook.imagepipeline.producers.n, com.facebook.imagepipeline.producers.b
        protected void g() {
            p().b();
            q();
        }

        @Override // com.facebook.imagepipeline.producers.n, com.facebook.imagepipeline.producers.b
        protected void h(Throwable th) {
            p().a(th);
            q();
        }

        @Override // com.facebook.imagepipeline.producers.b
        protected void i(T t, int i) {
            p().d(t, i);
            if (com.facebook.imagepipeline.producers.b.e(i)) {
                q();
            }
        }
    }

    public x0(int i, Executor executor, l0<T> l0Var) {
        this.f1422b = i;
        d.a.b.d.i.g(executor);
        this.e = executor;
        d.a.b.d.i.g(l0Var);
        this.a = l0Var;
        this.f1424d = new ConcurrentLinkedQueue<>();
        this.f1423c = 0;
    }

    static /* synthetic */ int d(x0 x0Var) {
        int i = x0Var.f1423c;
        x0Var.f1423c = i - 1;
        return i;
    }

    @Override // com.facebook.imagepipeline.producers.l0
    public void a(k<T> kVar, m0 m0Var) {
        boolean z;
        m0Var.l().d(m0Var, "ThrottlingProducer");
        synchronized (this) {
            z = true;
            if (this.f1423c >= this.f1422b) {
                this.f1424d.add(Pair.create(kVar, m0Var));
            } else {
                this.f1423c++;
                z = false;
            }
        }
        if (z) {
            return;
        }
        f(kVar, m0Var);
    }

    void f(k<T> kVar, m0 m0Var) {
        m0Var.l().k(m0Var, "ThrottlingProducer", null);
        this.a.a(new b(kVar), m0Var);
    }
}
