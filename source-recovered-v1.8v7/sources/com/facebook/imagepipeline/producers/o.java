package com.facebook.imagepipeline.producers;

import d.a.e.l.a;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class o implements l0<d.a.e.j.e> {
    private final d.a.e.c.e a;

    /* renamed from: b, reason: collision with root package name */
    private final d.a.e.c.e f1373b;

    /* renamed from: c, reason: collision with root package name */
    private final d.a.e.c.f f1374c;

    /* renamed from: d, reason: collision with root package name */
    private final l0<d.a.e.j.e> f1375d;

    class a implements c.d<d.a.e.j.e, Void> {
        final /* synthetic */ o0 a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0 f1376b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f1377c;

        a(o0 o0Var, m0 m0Var, k kVar) {
            this.a = o0Var;
            this.f1376b = m0Var;
            this.f1377c = kVar;
        }

        @Override // c.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(c.f<d.a.e.j.e> fVar) {
            if (o.f(fVar)) {
                this.a.c(this.f1376b, "DiskCacheProducer", null);
                this.f1377c.b();
            } else {
                if (fVar.n()) {
                    this.a.h(this.f1376b, "DiskCacheProducer", fVar.i(), null);
                } else {
                    d.a.e.j.e eVarJ = fVar.j();
                    if (eVarJ != null) {
                        o0 o0Var = this.a;
                        m0 m0Var = this.f1376b;
                        o0Var.k(m0Var, "DiskCacheProducer", o.e(o0Var, m0Var, true, eVarJ.s()));
                        this.a.b(this.f1376b, "DiskCacheProducer", true);
                        this.f1377c.c(1.0f);
                        this.f1377c.d(eVarJ, 1);
                        eVarJ.close();
                    } else {
                        o0 o0Var2 = this.a;
                        m0 m0Var2 = this.f1376b;
                        o0Var2.k(m0Var2, "DiskCacheProducer", o.e(o0Var2, m0Var2, false, 0));
                    }
                }
                o.this.f1375d.a(this.f1377c, this.f1376b);
            }
            return null;
        }
    }

    class b extends e {
        final /* synthetic */ AtomicBoolean a;

        b(o oVar, AtomicBoolean atomicBoolean) {
            this.a = atomicBoolean;
        }

        @Override // com.facebook.imagepipeline.producers.n0
        public void b() {
            this.a.set(true);
        }
    }

    public o(d.a.e.c.e eVar, d.a.e.c.e eVar2, d.a.e.c.f fVar, l0<d.a.e.j.e> l0Var) {
        this.a = eVar;
        this.f1373b = eVar2;
        this.f1374c = fVar;
        this.f1375d = l0Var;
    }

    @Nullable
    static Map<String, String> e(o0 o0Var, m0 m0Var, boolean z, int i) {
        if (!o0Var.i(m0Var, "DiskCacheProducer")) {
            return null;
        }
        String strValueOf = String.valueOf(z);
        return z ? d.a.b.d.f.d("cached_value_found", strValueOf, "encodedImageSize", String.valueOf(i)) : d.a.b.d.f.c("cached_value_found", strValueOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean f(c.f<?> fVar) {
        return fVar.l() || (fVar.n() && (fVar.i() instanceof CancellationException));
    }

    private void g(k<d.a.e.j.e> kVar, m0 m0Var) {
        if (m0Var.h().g() >= a.b.DISK_CACHE.g()) {
            kVar.d(null, 1);
        } else {
            this.f1375d.a(kVar, m0Var);
        }
    }

    private c.d<d.a.e.j.e, Void> h(k<d.a.e.j.e> kVar, m0 m0Var) {
        return new a(m0Var.l(), m0Var, kVar);
    }

    private void i(AtomicBoolean atomicBoolean, m0 m0Var) {
        m0Var.f(new b(this, atomicBoolean));
    }

    @Override // com.facebook.imagepipeline.producers.l0
    public void a(k<d.a.e.j.e> kVar, m0 m0Var) {
        d.a.e.l.a aVarC = m0Var.c();
        if (!aVarC.s()) {
            g(kVar, m0Var);
            return;
        }
        m0Var.l().d(m0Var, "DiskCacheProducer");
        d.a.a.a.d dVarC = this.f1374c.c(aVarC, m0Var.a());
        d.a.e.c.e eVar = aVarC.b() == a.EnumC0093a.SMALL ? this.f1373b : this.a;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        eVar.i(dVarC, atomicBoolean).e(h(kVar, m0Var));
        i(atomicBoolean, m0Var);
    }
}
