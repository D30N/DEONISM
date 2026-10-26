package com.facebook.imagepipeline.producers;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class b1 implements l0<d.a.e.j.e> {
    private final Executor a;

    /* renamed from: b, reason: collision with root package name */
    private final d.a.b.g.h f1313b;

    /* renamed from: c, reason: collision with root package name */
    private final l0<d.a.e.j.e> f1314c;

    class a extends t0<d.a.e.j.e> {
        final /* synthetic */ d.a.e.j.e g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k kVar, o0 o0Var, m0 m0Var, String str, d.a.e.j.e eVar) {
            super(kVar, o0Var, m0Var, str);
            this.g = eVar;
        }

        @Override // com.facebook.imagepipeline.producers.t0, d.a.b.b.f
        protected void d() {
            d.a.e.j.e.g(this.g);
            super.d();
        }

        @Override // com.facebook.imagepipeline.producers.t0, d.a.b.b.f
        protected void e(Exception exc) {
            d.a.e.j.e.g(this.g);
            super.e(exc);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // d.a.b.b.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(d.a.e.j.e eVar) {
            d.a.e.j.e.g(eVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // d.a.b.b.f
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public d.a.e.j.e c() throws X, IOException {
            d.a.b.g.j jVarB = b1.this.f1313b.b();
            try {
                b1.g(this.g, jVarB);
                d.a.b.h.a aVarV = d.a.b.h.a.v(jVarB.a());
                try {
                    d.a.e.j.e eVar = new d.a.e.j.e((d.a.b.h.a<d.a.b.g.g>) aVarV);
                    eVar.h(this.g);
                    return eVar;
                } finally {
                    d.a.b.h.a.o(aVarV);
                }
            } finally {
                jVarB.close();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.t0, d.a.b.b.f
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void f(d.a.e.j.e eVar) {
            d.a.e.j.e.g(this.g);
            super.f(eVar);
        }
    }

    private class b extends n<d.a.e.j.e, d.a.e.j.e> {

        /* renamed from: c, reason: collision with root package name */
        private final m0 f1315c;

        /* renamed from: d, reason: collision with root package name */
        private d.a.b.k.e f1316d;

        public b(k<d.a.e.j.e> kVar, m0 m0Var) {
            super(kVar);
            this.f1315c = m0Var;
            this.f1316d = d.a.b.k.e.UNSET;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(@Nullable d.a.e.j.e eVar, int i) {
            if (this.f1316d == d.a.b.k.e.UNSET && eVar != null) {
                this.f1316d = b1.h(eVar);
            }
            if (this.f1316d == d.a.b.k.e.NO) {
                p().d(eVar, i);
                return;
            }
            if (com.facebook.imagepipeline.producers.b.e(i)) {
                if (this.f1316d != d.a.b.k.e.YES || eVar == null) {
                    p().d(eVar, i);
                } else {
                    b1.this.i(eVar, p(), this.f1315c);
                }
            }
        }
    }

    public b1(Executor executor, d.a.b.g.h hVar, l0<d.a.e.j.e> l0Var) {
        d.a.b.d.i.g(executor);
        this.a = executor;
        d.a.b.d.i.g(hVar);
        this.f1313b = hVar;
        d.a.b.d.i.g(l0Var);
        this.f1314c = l0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(d.a.e.j.e eVar, d.a.b.g.j jVar) {
        com.facebook.imageformat.c cVar;
        InputStream inputStreamP = eVar.p();
        com.facebook.imageformat.c cVarC = com.facebook.imageformat.d.c(inputStreamP);
        if (cVarC == com.facebook.imageformat.b.f || cVarC == com.facebook.imageformat.b.h) {
            com.facebook.imagepipeline.nativecode.g.a().c(inputStreamP, jVar, 80);
            cVar = com.facebook.imageformat.b.a;
        } else {
            if (cVarC != com.facebook.imageformat.b.g && cVarC != com.facebook.imageformat.b.i) {
                throw new IllegalArgumentException("Wrong image format");
            }
            com.facebook.imagepipeline.nativecode.g.a().a(inputStreamP, jVar);
            cVar = com.facebook.imageformat.b.f1242b;
        }
        eVar.F(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d.a.b.k.e h(d.a.e.j.e eVar) {
        d.a.b.d.i.g(eVar);
        com.facebook.imageformat.c cVarC = com.facebook.imageformat.d.c(eVar.p());
        if (!com.facebook.imageformat.b.a(cVarC)) {
            return cVarC == com.facebook.imageformat.c.f1245b ? d.a.b.k.e.UNSET : d.a.b.k.e.NO;
        }
        return com.facebook.imagepipeline.nativecode.g.a() == null ? d.a.b.k.e.NO : d.a.b.k.e.f(!r0.b(cVarC));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(d.a.e.j.e eVar, k<d.a.e.j.e> kVar, m0 m0Var) {
        d.a.b.d.i.g(eVar);
        this.a.execute(new a(kVar, m0Var.l(), m0Var, "WebpTranscodeProducer", d.a.e.j.e.f(eVar)));
    }

    @Override // com.facebook.imagepipeline.producers.l0
    public void a(k<d.a.e.j.e> kVar, m0 m0Var) {
        this.f1314c.a(new b(kVar, m0Var), m0Var);
    }
}
