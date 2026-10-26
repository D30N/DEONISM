package com.facebook.imagepipeline.producers;

/* loaded from: classes.dex */
public class j implements l0<d.a.e.j.e> {
    private final l0<d.a.e.j.e> a;

    /* renamed from: b, reason: collision with root package name */
    private final l0<d.a.e.j.e> f1350b;

    private class b extends n<d.a.e.j.e, d.a.e.j.e> {

        /* renamed from: c, reason: collision with root package name */
        private m0 f1351c;

        private b(k<d.a.e.j.e> kVar, m0 m0Var) {
            super(kVar);
            this.f1351c = m0Var;
        }

        @Override // com.facebook.imagepipeline.producers.n, com.facebook.imagepipeline.producers.b
        protected void h(Throwable th) {
            j.this.f1350b.a(p(), this.f1351c);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(d.a.e.j.e eVar, int i) {
            d.a.e.l.a aVarC = this.f1351c.c();
            boolean zE = com.facebook.imagepipeline.producers.b.e(i);
            boolean zC = a1.c(eVar, aVarC.l());
            if (eVar != null && (zC || aVarC.d())) {
                if (!zE || !zC) {
                    i = com.facebook.imagepipeline.producers.b.o(i, 1);
                }
                p().d(eVar, i);
            }
            if (!zE || zC) {
                return;
            }
            d.a.e.j.e.g(eVar);
            j.this.f1350b.a(p(), this.f1351c);
        }
    }

    public j(l0<d.a.e.j.e> l0Var, l0<d.a.e.j.e> l0Var2) {
        this.a = l0Var;
        this.f1350b = l0Var2;
    }

    @Override // com.facebook.imagepipeline.producers.l0
    public void a(k<d.a.e.j.e> kVar, m0 m0Var) {
        this.a.a(new b(kVar, m0Var), m0Var);
    }
}
