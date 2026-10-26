package com.facebook.imagepipeline.producers;

import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class u0<T> implements l0<T> {
    private final l0<T> a;

    /* renamed from: b, reason: collision with root package name */
    private final v0 f1407b;

    class a extends t0<T> {
        final /* synthetic */ o0 g;
        final /* synthetic */ m0 h;
        final /* synthetic */ k i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k kVar, o0 o0Var, m0 m0Var, String str, o0 o0Var2, m0 m0Var2, k kVar2) {
            super(kVar, o0Var, m0Var, str);
            this.g = o0Var2;
            this.h = m0Var2;
            this.i = kVar2;
        }

        @Override // d.a.b.b.f
        protected void b(T t) {
        }

        @Override // d.a.b.b.f
        @Nullable
        protected T c() {
            return null;
        }

        @Override // com.facebook.imagepipeline.producers.t0, d.a.b.b.f
        protected void f(T t) {
            this.g.k(this.h, "BackgroundThreadHandoffProducer", null);
            u0.this.a.a(this.i, this.h);
        }
    }

    class b extends e {
        final /* synthetic */ t0 a;

        b(t0 t0Var) {
            this.a = t0Var;
        }

        @Override // com.facebook.imagepipeline.producers.n0
        public void b() {
            this.a.a();
            u0.this.f1407b.b(this.a);
        }
    }

    public u0(l0<T> l0Var, v0 v0Var) {
        d.a.b.d.i.g(l0Var);
        this.a = l0Var;
        this.f1407b = v0Var;
    }

    @Override // com.facebook.imagepipeline.producers.l0
    public void a(k<T> kVar, m0 m0Var) {
        try {
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.a("ThreadHandoffProducer#produceResults");
            }
            o0 o0VarL = m0Var.l();
            a aVar = new a(kVar, o0VarL, m0Var, "BackgroundThreadHandoffProducer", o0VarL, m0Var, kVar);
            m0Var.f(new b(aVar));
            this.f1407b.a(aVar);
        } finally {
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.b();
            }
        }
    }
}
