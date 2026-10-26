package com.facebook.imagepipeline.producers;

/* loaded from: classes.dex */
public class y0 implements l0<d.a.e.j.e> {
    private final z0<d.a.e.j.e>[] a;

    private class a extends n<d.a.e.j.e, d.a.e.j.e> {

        /* renamed from: c, reason: collision with root package name */
        private final m0 f1429c;

        /* renamed from: d, reason: collision with root package name */
        private final int f1430d;
        private final d.a.e.d.e e;

        public a(k<d.a.e.j.e> kVar, m0 m0Var, int i) {
            super(kVar);
            this.f1429c = m0Var;
            this.f1430d = i;
            this.e = m0Var.c().l();
        }

        @Override // com.facebook.imagepipeline.producers.n, com.facebook.imagepipeline.producers.b
        protected void h(Throwable th) {
            if (y0.this.e(this.f1430d + 1, p(), this.f1429c)) {
                return;
            }
            p().a(th);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(d.a.e.j.e eVar, int i) {
            if (eVar != null && (b.f(i) || a1.c(eVar, this.e))) {
                p().d(eVar, i);
            } else if (b.e(i)) {
                d.a.e.j.e.g(eVar);
                if (y0.this.e(this.f1430d + 1, p(), this.f1429c)) {
                    return;
                }
                p().d(null, 1);
            }
        }
    }

    public y0(z0<d.a.e.j.e>... z0VarArr) {
        d.a.b.d.i.g(z0VarArr);
        z0<d.a.e.j.e>[] z0VarArr2 = z0VarArr;
        this.a = z0VarArr2;
        d.a.b.d.i.e(0, z0VarArr2.length);
    }

    private int d(int i, d.a.e.d.e eVar) {
        while (true) {
            z0<d.a.e.j.e>[] z0VarArr = this.a;
            if (i >= z0VarArr.length) {
                return -1;
            }
            if (z0VarArr[i].b(eVar)) {
                return i;
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(int i, k<d.a.e.j.e> kVar, m0 m0Var) {
        int iD = d(i, m0Var.c().l());
        if (iD == -1) {
            return false;
        }
        this.a[iD].a(new a(kVar, m0Var, iD), m0Var);
        return true;
    }

    @Override // com.facebook.imagepipeline.producers.l0
    public void a(k<d.a.e.j.e> kVar, m0 m0Var) {
        if (m0Var.c().l() != null && e(0, kVar, m0Var)) {
            return;
        }
        kVar.d(null, 1);
    }
}
