package com.facebook.imagepipeline.producers;

import java.io.InputStream;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class b0 implements l0<d.a.e.j.e> {
    private final Executor a;

    /* renamed from: b, reason: collision with root package name */
    private final d.a.b.g.h f1312b;

    class a extends t0<d.a.e.j.e> {
        final /* synthetic */ d.a.e.l.a g;
        final /* synthetic */ o0 h;
        final /* synthetic */ m0 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k kVar, o0 o0Var, m0 m0Var, String str, d.a.e.l.a aVar, o0 o0Var2, m0 m0Var2) {
            super(kVar, o0Var, m0Var, str);
            this.g = aVar;
            this.h = o0Var2;
            this.i = m0Var2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // d.a.b.b.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(d.a.e.j.e eVar) {
            d.a.e.j.e.g(eVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // d.a.b.b.f
        @Nullable
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public d.a.e.j.e c() {
            d.a.e.j.e eVarD = b0.this.d(this.g);
            if (eVarD == null) {
                this.h.b(this.i, b0.this.f(), false);
                return null;
            }
            eVarD.y();
            this.h.b(this.i, b0.this.f(), true);
            return eVarD;
        }
    }

    class b extends e {
        final /* synthetic */ t0 a;

        b(b0 b0Var, t0 t0Var) {
            this.a = t0Var;
        }

        @Override // com.facebook.imagepipeline.producers.n0
        public void b() {
            this.a.a();
        }
    }

    protected b0(Executor executor, d.a.b.g.h hVar) {
        this.a = executor;
        this.f1312b = hVar;
    }

    @Override // com.facebook.imagepipeline.producers.l0
    public void a(k<d.a.e.j.e> kVar, m0 m0Var) {
        o0 o0VarL = m0Var.l();
        a aVar = new a(kVar, o0VarL, m0Var, f(), m0Var.c(), o0VarL, m0Var);
        m0Var.f(new b(this, aVar));
        this.a.execute(aVar);
    }

    protected d.a.e.j.e c(InputStream inputStream, int i) {
        d.a.b.h.a aVarV = null;
        try {
            aVarV = d.a.b.h.a.v(i <= 0 ? this.f1312b.d(inputStream) : this.f1312b.a(inputStream, i));
            return new d.a.e.j.e((d.a.b.h.a<d.a.b.g.g>) aVarV);
        } finally {
            d.a.b.d.b.b(inputStream);
            d.a.b.h.a.o(aVarV);
        }
    }

    protected abstract d.a.e.j.e d(d.a.e.l.a aVar);

    protected d.a.e.j.e e(InputStream inputStream, int i) {
        return c(inputStream, i);
    }

    protected abstract String f();
}
