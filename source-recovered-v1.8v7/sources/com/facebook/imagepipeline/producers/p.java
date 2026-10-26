package com.facebook.imagepipeline.producers;

import d.a.e.l.a;

/* loaded from: classes.dex */
public class p implements l0<d.a.e.j.e> {
    private final d.a.e.c.e a;

    /* renamed from: b, reason: collision with root package name */
    private final d.a.e.c.e f1379b;

    /* renamed from: c, reason: collision with root package name */
    private final d.a.e.c.f f1380c;

    /* renamed from: d, reason: collision with root package name */
    private final l0<d.a.e.j.e> f1381d;

    private static class b extends n<d.a.e.j.e, d.a.e.j.e> {

        /* renamed from: c, reason: collision with root package name */
        private final m0 f1382c;

        /* renamed from: d, reason: collision with root package name */
        private final d.a.e.c.e f1383d;
        private final d.a.e.c.e e;
        private final d.a.e.c.f f;

        private b(k<d.a.e.j.e> kVar, m0 m0Var, d.a.e.c.e eVar, d.a.e.c.e eVar2, d.a.e.c.f fVar) {
            super(kVar);
            this.f1382c = m0Var;
            this.f1383d = eVar;
            this.e = eVar2;
            this.f = fVar;
        }

        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(d.a.e.j.e eVar, int i) {
            this.f1382c.l().d(this.f1382c, "DiskCacheWriteProducer");
            if (!com.facebook.imagepipeline.producers.b.f(i) && eVar != null && !com.facebook.imagepipeline.producers.b.m(i, 10) && eVar.o() != com.facebook.imageformat.c.f1245b) {
                d.a.e.l.a aVarC = this.f1382c.c();
                (aVarC.b() == a.EnumC0093a.SMALL ? this.e : this.f1383d).k(this.f.c(aVarC, this.f1382c.a()), eVar);
            }
            this.f1382c.l().k(this.f1382c, "DiskCacheWriteProducer", null);
            p().d(eVar, i);
        }
    }

    public p(d.a.e.c.e eVar, d.a.e.c.e eVar2, d.a.e.c.f fVar, l0<d.a.e.j.e> l0Var) {
        this.a = eVar;
        this.f1379b = eVar2;
        this.f1380c = fVar;
        this.f1381d = l0Var;
    }

    private void c(k<d.a.e.j.e> kVar, m0 m0Var) {
        if (m0Var.h().g() >= a.b.DISK_CACHE.g()) {
            kVar.d(null, 1);
            return;
        }
        if (m0Var.c().s()) {
            kVar = new b(kVar, m0Var, this.a, this.f1379b, this.f1380c);
        }
        this.f1381d.a(kVar, m0Var);
    }

    @Override // com.facebook.imagepipeline.producers.l0
    public void a(k<d.a.e.j.e> kVar, m0 m0Var) {
        c(kVar, m0Var);
    }
}
