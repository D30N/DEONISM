package com.facebook.imagepipeline.producers;

/* loaded from: classes.dex */
public class a implements l0<d.a.e.j.e> {
    private final l0<d.a.e.j.e> a;

    private static class b extends n<d.a.e.j.e, d.a.e.j.e> {
        private b(k<d.a.e.j.e> kVar) {
            super(kVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(d.a.e.j.e eVar, int i) {
            if (eVar == null) {
                p().d(null, i);
                return;
            }
            if (!d.a.e.j.e.v(eVar)) {
                eVar.y();
            }
            p().d(eVar, i);
        }
    }

    public a(l0<d.a.e.j.e> l0Var) {
        this.a = l0Var;
    }

    @Override // com.facebook.imagepipeline.producers.l0
    public void a(k<d.a.e.j.e> kVar, m0 m0Var) {
        this.a.a(new b(kVar), m0Var);
    }
}
