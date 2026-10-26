package com.facebook.imagepipeline.producers;

/* loaded from: classes.dex */
public class j0 implements l0<d.a.b.h.a<d.a.e.j.c>> {
    private final d.a.e.c.p<d.a.a.a.d, d.a.e.j.c> a;

    /* renamed from: b, reason: collision with root package name */
    private final d.a.e.c.f f1353b;

    /* renamed from: c, reason: collision with root package name */
    private final l0<d.a.b.h.a<d.a.e.j.c>> f1354c;

    public static class a extends n<d.a.b.h.a<d.a.e.j.c>, d.a.b.h.a<d.a.e.j.c>> {

        /* renamed from: c, reason: collision with root package name */
        private final d.a.a.a.d f1355c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f1356d;
        private final d.a.e.c.p<d.a.a.a.d, d.a.e.j.c> e;
        private final boolean f;

        public a(k<d.a.b.h.a<d.a.e.j.c>> kVar, d.a.a.a.d dVar, boolean z, d.a.e.c.p<d.a.a.a.d, d.a.e.j.c> pVar, boolean z2) {
            super(kVar);
            this.f1355c = dVar;
            this.f1356d = z;
            this.e = pVar;
            this.f = z2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(d.a.b.h.a<d.a.e.j.c> aVar, int i) {
            if (aVar == null) {
                if (b.e(i)) {
                    p().d(null, i);
                }
            } else if (!b.f(i) || this.f1356d) {
                d.a.b.h.a<d.a.e.j.c> aVarB = this.f ? this.e.b(this.f1355c, aVar) : null;
                try {
                    p().c(1.0f);
                    k<d.a.b.h.a<d.a.e.j.c>> kVarP = p();
                    if (aVarB != null) {
                        aVar = aVarB;
                    }
                    kVarP.d(aVar, i);
                } finally {
                    d.a.b.h.a.o(aVarB);
                }
            }
        }
    }

    public j0(d.a.e.c.p<d.a.a.a.d, d.a.e.j.c> pVar, d.a.e.c.f fVar, l0<d.a.b.h.a<d.a.e.j.c>> l0Var) {
        this.a = pVar;
        this.f1353b = fVar;
        this.f1354c = l0Var;
    }

    @Override // com.facebook.imagepipeline.producers.l0
    public void a(k<d.a.b.h.a<d.a.e.j.c>> kVar, m0 m0Var) {
        o0 o0VarL = m0Var.l();
        d.a.e.l.a aVarC = m0Var.c();
        Object objA = m0Var.a();
        d.a.e.l.c cVarF = aVarC.f();
        if (cVarF == null || cVarF.b() == null) {
            this.f1354c.a(kVar, m0Var);
            return;
        }
        o0VarL.d(m0Var, c());
        d.a.a.a.d dVarA = this.f1353b.a(aVarC, objA);
        d.a.b.h.a<d.a.e.j.c> aVar = this.a.get(dVarA);
        if (aVar == null) {
            a aVar2 = new a(kVar, dVarA, cVarF instanceof d.a.e.l.d, this.a, m0Var.c().t());
            o0VarL.k(m0Var, c(), o0VarL.i(m0Var, c()) ? d.a.b.d.f.c("cached_value_found", "false") : null);
            this.f1354c.a(aVar2, m0Var);
        } else {
            o0VarL.k(m0Var, c(), o0VarL.i(m0Var, c()) ? d.a.b.d.f.c("cached_value_found", "true") : null);
            o0VarL.b(m0Var, "PostprocessedBitmapMemoryCacheProducer", true);
            kVar.c(1.0f);
            kVar.d(aVar, 1);
            aVar.close();
        }
    }

    protected String c() {
        return "PostprocessedBitmapMemoryCacheProducer";
    }
}
