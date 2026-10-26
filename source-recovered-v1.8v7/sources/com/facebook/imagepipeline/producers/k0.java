package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public class k0 implements l0<d.a.b.h.a<d.a.e.j.c>> {
    private final l0<d.a.b.h.a<d.a.e.j.c>> a;

    /* renamed from: b, reason: collision with root package name */
    private final d.a.e.b.f f1357b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f1358c;

    private class b extends n<d.a.b.h.a<d.a.e.j.c>, d.a.b.h.a<d.a.e.j.c>> {

        /* renamed from: c, reason: collision with root package name */
        private final o0 f1359c;

        /* renamed from: d, reason: collision with root package name */
        private final m0 f1360d;
        private final d.a.e.l.c e;

        @GuardedBy("PostprocessorConsumer.this")
        private boolean f;

        @GuardedBy("PostprocessorConsumer.this")
        @Nullable
        private d.a.b.h.a<d.a.e.j.c> g;

        @GuardedBy("PostprocessorConsumer.this")
        private int h;

        @GuardedBy("PostprocessorConsumer.this")
        private boolean i;

        @GuardedBy("PostprocessorConsumer.this")
        private boolean j;

        class a extends e {
            a(k0 k0Var) {
            }

            @Override // com.facebook.imagepipeline.producers.n0
            public void b() {
                b.this.C();
            }
        }

        /* renamed from: com.facebook.imagepipeline.producers.k0$b$b, reason: collision with other inner class name */
        class RunnableC0057b implements Runnable {
            RunnableC0057b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.a.b.h.a aVar;
                int i;
                synchronized (b.this) {
                    aVar = b.this.g;
                    i = b.this.h;
                    b.this.g = null;
                    b.this.i = false;
                }
                if (d.a.b.h.a.u(aVar)) {
                    try {
                        b.this.z(aVar, i);
                    } finally {
                        d.a.b.h.a.o(aVar);
                    }
                }
                b.this.x();
            }
        }

        public b(k<d.a.b.h.a<d.a.e.j.c>> kVar, o0 o0Var, d.a.e.l.c cVar, m0 m0Var) {
            super(kVar);
            this.g = null;
            this.h = 0;
            this.i = false;
            this.j = false;
            this.f1359c = o0Var;
            this.e = cVar;
            this.f1360d = m0Var;
            m0Var.f(new a(k0.this));
        }

        @Nullable
        private Map<String, String> A(o0 o0Var, m0 m0Var, d.a.e.l.c cVar) {
            if (o0Var.i(m0Var, "PostprocessorProducer")) {
                return d.a.b.d.f.c("Postprocessor", cVar.d());
            }
            return null;
        }

        private synchronized boolean B() {
            return this.f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C() {
            if (y()) {
                p().b();
            }
        }

        private void D(Throwable th) {
            if (y()) {
                p().a(th);
            }
        }

        private void E(d.a.b.h.a<d.a.e.j.c> aVar, int i) {
            boolean zE = com.facebook.imagepipeline.producers.b.e(i);
            if ((zE || B()) && !(zE && y())) {
                return;
            }
            p().d(aVar, i);
        }

        private d.a.b.h.a<d.a.e.j.c> G(d.a.e.j.c cVar) {
            d.a.e.j.d dVar = (d.a.e.j.d) cVar;
            d.a.b.h.a<Bitmap> aVarC = this.e.c(dVar.o(), k0.this.f1357b);
            try {
                return d.a.b.h.a.v(new d.a.e.j.d(aVarC, cVar.a(), dVar.n(), dVar.m()));
            } finally {
                d.a.b.h.a.o(aVarC);
            }
        }

        private synchronized boolean H() {
            if (this.f || !this.i || this.j || !d.a.b.h.a.u(this.g)) {
                return false;
            }
            this.j = true;
            return true;
        }

        private boolean I(d.a.e.j.c cVar) {
            return cVar instanceof d.a.e.j.d;
        }

        private void J() {
            k0.this.f1358c.execute(new RunnableC0057b());
        }

        private void K(@Nullable d.a.b.h.a<d.a.e.j.c> aVar, int i) {
            synchronized (this) {
                if (this.f) {
                    return;
                }
                d.a.b.h.a<d.a.e.j.c> aVar2 = this.g;
                this.g = d.a.b.h.a.k(aVar);
                this.h = i;
                this.i = true;
                boolean zH = H();
                d.a.b.h.a.o(aVar2);
                if (zH) {
                    J();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void x() {
            boolean zH;
            synchronized (this) {
                this.j = false;
                zH = H();
            }
            if (zH) {
                J();
            }
        }

        private boolean y() {
            synchronized (this) {
                if (this.f) {
                    return false;
                }
                d.a.b.h.a<d.a.e.j.c> aVar = this.g;
                this.g = null;
                this.f = true;
                d.a.b.h.a.o(aVar);
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void z(d.a.b.h.a<d.a.e.j.c> aVar, int i) {
            d.a.b.d.i.b(d.a.b.h.a.u(aVar));
            if (!I(aVar.r())) {
                E(aVar, i);
                return;
            }
            this.f1359c.d(this.f1360d, "PostprocessorProducer");
            try {
                try {
                    d.a.b.h.a<d.a.e.j.c> aVarG = G(aVar.r());
                    this.f1359c.k(this.f1360d, "PostprocessorProducer", A(this.f1359c, this.f1360d, this.e));
                    E(aVarG, i);
                    d.a.b.h.a.o(aVarG);
                } catch (Exception e) {
                    this.f1359c.h(this.f1360d, "PostprocessorProducer", e, A(this.f1359c, this.f1360d, this.e));
                    D(e);
                    d.a.b.h.a.o(null);
                }
            } catch (Throwable th) {
                d.a.b.h.a.o(null);
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public void i(d.a.b.h.a<d.a.e.j.c> aVar, int i) {
            if (d.a.b.h.a.u(aVar)) {
                K(aVar, i);
            } else if (com.facebook.imagepipeline.producers.b.e(i)) {
                E(null, i);
            }
        }

        @Override // com.facebook.imagepipeline.producers.n, com.facebook.imagepipeline.producers.b
        protected void g() {
            C();
        }

        @Override // com.facebook.imagepipeline.producers.n, com.facebook.imagepipeline.producers.b
        protected void h(Throwable th) {
            D(th);
        }
    }

    class c extends n<d.a.b.h.a<d.a.e.j.c>, d.a.b.h.a<d.a.e.j.c>> implements d.a.e.l.e {

        /* renamed from: c, reason: collision with root package name */
        @GuardedBy("RepeatedPostprocessorConsumer.this")
        private boolean f1362c;

        /* renamed from: d, reason: collision with root package name */
        @GuardedBy("RepeatedPostprocessorConsumer.this")
        @Nullable
        private d.a.b.h.a<d.a.e.j.c> f1363d;

        class a extends e {
            a(k0 k0Var) {
            }

            @Override // com.facebook.imagepipeline.producers.n0
            public void b() {
                if (c.this.r()) {
                    c.this.p().b();
                }
            }
        }

        private c(k0 k0Var, b bVar, d.a.e.l.d dVar, m0 m0Var) {
            super(bVar);
            this.f1362c = false;
            this.f1363d = null;
            dVar.a(this);
            m0Var.f(new a(k0Var));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean r() {
            synchronized (this) {
                if (this.f1362c) {
                    return false;
                }
                d.a.b.h.a<d.a.e.j.c> aVar = this.f1363d;
                this.f1363d = null;
                this.f1362c = true;
                d.a.b.h.a.o(aVar);
                return true;
            }
        }

        private void t(d.a.b.h.a<d.a.e.j.c> aVar) {
            synchronized (this) {
                if (this.f1362c) {
                    return;
                }
                d.a.b.h.a<d.a.e.j.c> aVar2 = this.f1363d;
                this.f1363d = d.a.b.h.a.k(aVar);
                d.a.b.h.a.o(aVar2);
            }
        }

        private void u() {
            synchronized (this) {
                if (this.f1362c) {
                    return;
                }
                d.a.b.h.a<d.a.e.j.c> aVarK = d.a.b.h.a.k(this.f1363d);
                try {
                    p().d(aVarK, 0);
                } finally {
                    d.a.b.h.a.o(aVarK);
                }
            }
        }

        @Override // com.facebook.imagepipeline.producers.n, com.facebook.imagepipeline.producers.b
        protected void g() {
            if (r()) {
                p().b();
            }
        }

        @Override // com.facebook.imagepipeline.producers.n, com.facebook.imagepipeline.producers.b
        protected void h(Throwable th) {
            if (r()) {
                p().a(th);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public void i(d.a.b.h.a<d.a.e.j.c> aVar, int i) {
            if (com.facebook.imagepipeline.producers.b.f(i)) {
                return;
            }
            t(aVar);
            u();
        }
    }

    class d extends n<d.a.b.h.a<d.a.e.j.c>, d.a.b.h.a<d.a.e.j.c>> {
        private d(k0 k0Var, b bVar) {
            super(bVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(d.a.b.h.a<d.a.e.j.c> aVar, int i) {
            if (com.facebook.imagepipeline.producers.b.f(i)) {
                return;
            }
            p().d(aVar, i);
        }
    }

    public k0(l0<d.a.b.h.a<d.a.e.j.c>> l0Var, d.a.e.b.f fVar, Executor executor) {
        d.a.b.d.i.g(l0Var);
        this.a = l0Var;
        this.f1357b = fVar;
        d.a.b.d.i.g(executor);
        this.f1358c = executor;
    }

    @Override // com.facebook.imagepipeline.producers.l0
    public void a(k<d.a.b.h.a<d.a.e.j.c>> kVar, m0 m0Var) {
        o0 o0VarL = m0Var.l();
        d.a.e.l.c cVarF = m0Var.c().f();
        b bVar = new b(kVar, o0VarL, cVarF, m0Var);
        this.a.a(cVarF instanceof d.a.e.l.d ? new c(bVar, (d.a.e.l.d) cVarF, m0Var) : new d(bVar), m0Var);
    }
}
