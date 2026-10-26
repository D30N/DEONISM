package com.facebook.imagepipeline.producers;

import d.a.e.l.a;

/* loaded from: classes.dex */
public class r implements l0<d.a.e.j.e> {
    private final d.a.e.c.p<d.a.a.a.d, d.a.b.g.g> a;

    /* renamed from: b, reason: collision with root package name */
    private final d.a.e.c.f f1386b;

    /* renamed from: c, reason: collision with root package name */
    private final l0<d.a.e.j.e> f1387c;

    private static class a extends n<d.a.e.j.e, d.a.e.j.e> {

        /* renamed from: c, reason: collision with root package name */
        private final d.a.e.c.p<d.a.a.a.d, d.a.b.g.g> f1388c;

        /* renamed from: d, reason: collision with root package name */
        private final d.a.a.a.d f1389d;
        private final boolean e;

        public a(k<d.a.e.j.e> kVar, d.a.e.c.p<d.a.a.a.d, d.a.b.g.g> pVar, d.a.a.a.d dVar, boolean z) {
            super(kVar);
            this.f1388c = pVar;
            this.f1389d = dVar;
            this.e = z;
        }

        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(d.a.e.j.e eVar, int i) {
            boolean zD;
            try {
                if (d.a.e.m.b.d()) {
                    d.a.e.m.b.a("EncodedMemoryCacheProducer#onNewResultImpl");
                }
                if (!b.f(i) && eVar != null && !b.m(i, 10) && eVar.o() != com.facebook.imageformat.c.f1245b) {
                    d.a.b.h.a<d.a.b.g.g> aVarI = eVar.i();
                    if (aVarI != null) {
                        try {
                            d.a.b.h.a<d.a.b.g.g> aVarB = this.e ? this.f1388c.b(this.f1389d, aVarI) : null;
                            if (aVarB != null) {
                                try {
                                    d.a.e.j.e eVar2 = new d.a.e.j.e(aVarB);
                                    eVar2.h(eVar);
                                    try {
                                        p().c(1.0f);
                                        p().d(eVar2, i);
                                        if (zD) {
                                            return;
                                        } else {
                                            return;
                                        }
                                    } finally {
                                        d.a.e.j.e.g(eVar2);
                                    }
                                } finally {
                                    d.a.b.h.a.o(aVarB);
                                }
                            }
                        } finally {
                            d.a.b.h.a.o(aVarI);
                        }
                    }
                    p().d(eVar, i);
                    if (d.a.e.m.b.d()) {
                        d.a.e.m.b.b();
                        return;
                    }
                    return;
                }
                p().d(eVar, i);
                if (d.a.e.m.b.d()) {
                    d.a.e.m.b.b();
                }
            } finally {
                if (d.a.e.m.b.d()) {
                    d.a.e.m.b.b();
                }
            }
        }
    }

    public r(d.a.e.c.p<d.a.a.a.d, d.a.b.g.g> pVar, d.a.e.c.f fVar, l0<d.a.e.j.e> l0Var) {
        this.a = pVar;
        this.f1386b = fVar;
        this.f1387c = l0Var;
    }

    @Override // com.facebook.imagepipeline.producers.l0
    public void a(k<d.a.e.j.e> kVar, m0 m0Var) {
        boolean zD;
        try {
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.a("EncodedMemoryCacheProducer#produceResults");
            }
            o0 o0VarL = m0Var.l();
            o0VarL.d(m0Var, "EncodedMemoryCacheProducer");
            d.a.a.a.d dVarC = this.f1386b.c(m0Var.c(), m0Var.a());
            d.a.b.h.a<d.a.b.g.g> aVar = this.a.get(dVarC);
            try {
                if (aVar != null) {
                    d.a.e.j.e eVar = new d.a.e.j.e(aVar);
                    try {
                        o0VarL.k(m0Var, "EncodedMemoryCacheProducer", o0VarL.i(m0Var, "EncodedMemoryCacheProducer") ? d.a.b.d.f.c("cached_value_found", "true") : null);
                        o0VarL.b(m0Var, "EncodedMemoryCacheProducer", true);
                        kVar.c(1.0f);
                        kVar.d(eVar, 1);
                        if (zD) {
                            return;
                        } else {
                            return;
                        }
                    } finally {
                        d.a.e.j.e.g(eVar);
                    }
                }
                if (m0Var.h().g() >= a.b.ENCODED_MEMORY_CACHE.g()) {
                    o0VarL.k(m0Var, "EncodedMemoryCacheProducer", o0VarL.i(m0Var, "EncodedMemoryCacheProducer") ? d.a.b.d.f.c("cached_value_found", "false") : null);
                    o0VarL.b(m0Var, "EncodedMemoryCacheProducer", false);
                    kVar.d(null, 1);
                    if (d.a.e.m.b.d()) {
                        d.a.e.m.b.b();
                        return;
                    }
                    return;
                }
                a aVar2 = new a(kVar, this.a, dVarC, m0Var.c().t());
                o0VarL.k(m0Var, "EncodedMemoryCacheProducer", o0VarL.i(m0Var, "EncodedMemoryCacheProducer") ? d.a.b.d.f.c("cached_value_found", "false") : null);
                this.f1387c.a(aVar2, m0Var);
                if (d.a.e.m.b.d()) {
                    d.a.e.m.b.b();
                }
            } finally {
                d.a.b.h.a.o(aVar);
            }
        } finally {
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.b();
            }
        }
    }
}
