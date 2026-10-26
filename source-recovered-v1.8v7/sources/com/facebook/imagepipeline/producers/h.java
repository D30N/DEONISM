package com.facebook.imagepipeline.producers;

import d.a.e.l.a;

/* loaded from: classes.dex */
public class h implements l0<d.a.b.h.a<d.a.e.j.c>> {
    private final d.a.e.c.p<d.a.a.a.d, d.a.e.j.c> a;

    /* renamed from: b, reason: collision with root package name */
    private final d.a.e.c.f f1333b;

    /* renamed from: c, reason: collision with root package name */
    private final l0<d.a.b.h.a<d.a.e.j.c>> f1334c;

    class a extends n<d.a.b.h.a<d.a.e.j.c>, d.a.b.h.a<d.a.e.j.c>> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d.a.a.a.d f1335c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f1336d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k kVar, d.a.a.a.d dVar, boolean z) {
            super(kVar);
            this.f1335c = dVar;
            this.f1336d = z;
        }

        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(d.a.b.h.a<d.a.e.j.c> aVar, int i) {
            d.a.b.h.a<d.a.e.j.c> aVar2;
            boolean zD;
            try {
                if (d.a.e.m.b.d()) {
                    d.a.e.m.b.a("BitmapMemoryCacheProducer#onNewResultImpl");
                }
                boolean zE = b.e(i);
                if (aVar == null) {
                    if (zE) {
                        p().d(null, i);
                    }
                    if (zD) {
                        return;
                    } else {
                        return;
                    }
                }
                if (!aVar.r().g() && !b.n(i, 8)) {
                    if (!zE && (aVar2 = h.this.a.get(this.f1335c)) != null) {
                        try {
                            d.a.e.j.j jVarA = aVar.r().a();
                            d.a.e.j.j jVarA2 = aVar2.r().a();
                            if (jVarA2.a() || jVarA2.c() >= jVarA.c()) {
                                p().d(aVar2, i);
                                if (d.a.e.m.b.d()) {
                                    d.a.e.m.b.b();
                                    return;
                                }
                                return;
                            }
                        } finally {
                            d.a.b.h.a.o(aVar2);
                        }
                    }
                    d.a.b.h.a<d.a.e.j.c> aVarB = this.f1336d ? h.this.a.b(this.f1335c, aVar) : null;
                    if (zE) {
                        try {
                            p().c(1.0f);
                        } finally {
                            d.a.b.h.a.o(aVarB);
                        }
                    }
                    k<d.a.b.h.a<d.a.e.j.c>> kVarP = p();
                    if (aVarB != null) {
                        aVar = aVarB;
                    }
                    kVarP.d(aVar, i);
                    if (d.a.e.m.b.d()) {
                        d.a.e.m.b.b();
                        return;
                    }
                    return;
                }
                p().d(aVar, i);
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

    public h(d.a.e.c.p<d.a.a.a.d, d.a.e.j.c> pVar, d.a.e.c.f fVar, l0<d.a.b.h.a<d.a.e.j.c>> l0Var) {
        this.a = pVar;
        this.f1333b = fVar;
        this.f1334c = l0Var;
    }

    @Override // com.facebook.imagepipeline.producers.l0
    public void a(k<d.a.b.h.a<d.a.e.j.c>> kVar, m0 m0Var) {
        boolean zD;
        try {
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.a("BitmapMemoryCacheProducer#produceResults");
            }
            o0 o0VarL = m0Var.l();
            o0VarL.d(m0Var, d());
            d.a.a.a.d dVarB = this.f1333b.b(m0Var.c(), m0Var.a());
            d.a.b.h.a<d.a.e.j.c> aVar = this.a.get(dVarB);
            if (aVar != null) {
                boolean zA = aVar.r().a().a();
                if (zA) {
                    o0VarL.k(m0Var, d(), o0VarL.i(m0Var, d()) ? d.a.b.d.f.c("cached_value_found", "true") : null);
                    o0VarL.b(m0Var, d(), true);
                    kVar.c(1.0f);
                }
                b.l(zA);
                kVar.d(aVar, zA ? 1 : 0);
                aVar.close();
                if (zA) {
                    if (zD) {
                        return;
                    } else {
                        return;
                    }
                }
            }
            if (m0Var.h().g() >= a.b.BITMAP_MEMORY_CACHE.g()) {
                o0VarL.k(m0Var, d(), o0VarL.i(m0Var, d()) ? d.a.b.d.f.c("cached_value_found", "false") : null);
                o0VarL.b(m0Var, d(), false);
                kVar.d(null, 1);
                if (d.a.e.m.b.d()) {
                    d.a.e.m.b.b();
                    return;
                }
                return;
            }
            k<d.a.b.h.a<d.a.e.j.c>> kVarE = e(kVar, dVarB, m0Var.c().t());
            o0VarL.k(m0Var, d(), o0VarL.i(m0Var, d()) ? d.a.b.d.f.c("cached_value_found", "false") : null);
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.a("mInputProducer.produceResult");
            }
            this.f1334c.a(kVarE, m0Var);
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.b();
            }
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.b();
            }
        } finally {
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.b();
            }
        }
    }

    protected String d() {
        return "BitmapMemoryCacheProducer";
    }

    protected k<d.a.b.h.a<d.a.e.j.c>> e(k<d.a.b.h.a<d.a.e.j.c>> kVar, d.a.a.a.d dVar, boolean z) {
        return new a(kVar, dVar, z);
    }
}
