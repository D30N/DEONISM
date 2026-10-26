package com.facebook.drawee.b.a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.drawee.f.o;
import com.facebook.drawee.f.p;
import d.a.b.d.h;
import d.a.b.d.i;
import d.a.b.d.k;
import d.a.e.c.p;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public class d extends com.facebook.drawee.d.a<d.a.b.h.a<d.a.e.j.c>, d.a.e.j.g> {
    private static final Class<?> F = d.class;

    @Nullable
    private d.a.b.d.e<d.a.e.i.a> A;

    @Nullable
    private com.facebook.drawee.b.a.i.g B;

    @GuardedBy("this")
    @Nullable
    private Set<d.a.e.k.e> C;

    @GuardedBy("this")
    @Nullable
    private com.facebook.drawee.b.a.i.b D;
    private com.facebook.drawee.b.a.h.a E;
    private final d.a.e.i.a u;

    @Nullable
    private final d.a.b.d.e<d.a.e.i.a> v;

    @Nullable
    private final p<d.a.a.a.d, d.a.e.j.c> w;
    private d.a.a.a.d x;
    private k<com.facebook.datasource.c<d.a.b.h.a<d.a.e.j.c>>> y;
    private boolean z;

    public d(Resources resources, com.facebook.drawee.c.a aVar, d.a.e.i.a aVar2, Executor executor, @Nullable p<d.a.a.a.d, d.a.e.j.c> pVar, @Nullable d.a.b.d.e<d.a.e.i.a> eVar) {
        super(aVar, executor, null, null);
        this.u = new a(resources, aVar2);
        this.v = eVar;
        this.w = pVar;
    }

    private void Z(k<com.facebook.datasource.c<d.a.b.h.a<d.a.e.j.c>>> kVar) {
        this.y = kVar;
        d0(null);
    }

    @Nullable
    private Drawable c0(@Nullable d.a.b.d.e<d.a.e.i.a> eVar, d.a.e.j.c cVar) {
        Drawable drawableB;
        if (eVar == null) {
            return null;
        }
        Iterator<d.a.e.i.a> it = eVar.iterator();
        while (it.hasNext()) {
            d.a.e.i.a next = it.next();
            if (next.a(cVar) && (drawableB = next.b(cVar)) != null) {
                return drawableB;
            }
        }
        return null;
    }

    private void d0(@Nullable d.a.e.j.c cVar) {
        if (this.z) {
            if (o() == null) {
                com.facebook.drawee.e.a aVar = new com.facebook.drawee.e.a();
                com.facebook.drawee.e.b.a aVar2 = new com.facebook.drawee.e.b.a(aVar);
                this.E = new com.facebook.drawee.b.a.h.a();
                j(aVar2);
                K(aVar);
            }
            if (this.D == null) {
                R(this.E);
            }
            if (o() instanceof com.facebook.drawee.e.a) {
                k0(cVar, (com.facebook.drawee.e.a) o());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.drawee.d.a
    protected void F(@Nullable Drawable drawable) {
        if (drawable instanceof d.a.c.a.a) {
            ((d.a.c.a.a) drawable).a();
        }
    }

    public synchronized void R(com.facebook.drawee.b.a.i.b bVar) {
        if (this.D instanceof com.facebook.drawee.b.a.i.a) {
            ((com.facebook.drawee.b.a.i.a) this.D).b(bVar);
        } else if (this.D != null) {
            this.D = new com.facebook.drawee.b.a.i.a(this.D, bVar);
        } else {
            this.D = bVar;
        }
    }

    public synchronized void S(d.a.e.k.e eVar) {
        if (this.C == null) {
            this.C = new HashSet();
        }
        this.C.add(eVar);
    }

    protected void T() {
        synchronized (this) {
            this.D = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.drawee.d.a
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public Drawable k(d.a.b.h.a<d.a.e.j.c> aVar) {
        try {
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.a("PipelineDraweeController#createDrawable");
            }
            i.i(d.a.b.h.a.u(aVar));
            d.a.e.j.c cVarR = aVar.r();
            d0(cVarR);
            Drawable drawableC0 = c0(this.A, cVarR);
            if (drawableC0 != null) {
                return drawableC0;
            }
            Drawable drawableC02 = c0(this.v, cVarR);
            if (drawableC02 != null) {
                if (d.a.e.m.b.d()) {
                    d.a.e.m.b.b();
                }
                return drawableC02;
            }
            Drawable drawableB = this.u.b(cVarR);
            if (drawableB != null) {
                if (d.a.e.m.b.d()) {
                    d.a.e.m.b.b();
                }
                return drawableB;
            }
            throw new UnsupportedOperationException("Unrecognized image class: " + cVarR);
        } finally {
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.drawee.d.a
    @Nullable
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public d.a.b.h.a<d.a.e.j.c> m() {
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.a("PipelineDraweeController#getCachedImage");
        }
        try {
            if (this.w != null && this.x != null) {
                d.a.b.h.a<d.a.e.j.c> aVar = this.w.get(this.x);
                if (aVar != null && !aVar.r().a().a()) {
                    aVar.close();
                    return null;
                }
                if (d.a.e.m.b.d()) {
                    d.a.e.m.b.b();
                }
                return aVar;
            }
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.b();
            }
            return null;
        } finally {
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.drawee.d.a
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public int t(@Nullable d.a.b.h.a<d.a.e.j.c> aVar) {
        if (aVar != null) {
            return aVar.s();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.drawee.d.a
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public d.a.e.j.g u(d.a.b.h.a<d.a.e.j.c> aVar) {
        i.i(d.a.b.h.a.u(aVar));
        return aVar.r();
    }

    @Nullable
    public synchronized d.a.e.k.e Y() {
        com.facebook.drawee.b.a.i.c cVar = this.D != null ? new com.facebook.drawee.b.a.i.c(r(), this.D) : null;
        if (this.C == null) {
            return cVar;
        }
        d.a.e.k.c cVar2 = new d.a.e.k.c(this.C);
        if (cVar != null) {
            cVar2.l(cVar);
        }
        return cVar2;
    }

    public void a0(k<com.facebook.datasource.c<d.a.b.h.a<d.a.e.j.c>>> kVar, String str, d.a.a.a.d dVar, Object obj, @Nullable d.a.b.d.e<d.a.e.i.a> eVar, @Nullable com.facebook.drawee.b.a.i.b bVar) {
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.a("PipelineDraweeController#initialize");
        }
        super.x(str, obj);
        Z(kVar);
        this.x = dVar;
        i0(eVar);
        T();
        d0(null);
        R(bVar);
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.b();
        }
    }

    protected synchronized void b0(@Nullable com.facebook.drawee.b.a.i.f fVar, com.facebook.drawee.d.b<e, d.a.e.l.a, d.a.b.h.a<d.a.e.j.c>, d.a.e.j.g> bVar) {
        if (this.B != null) {
            this.B.f();
        }
        if (fVar != null) {
            if (this.B == null) {
                this.B = new com.facebook.drawee.b.a.i.g(AwakeTimeSinceBootClock.get(), this);
            }
            this.B.a(fVar);
            this.B.g(true);
            this.B.i(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.drawee.d.a
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public void C(String str, d.a.b.h.a<d.a.e.j.c> aVar) {
        super.C(str, aVar);
        synchronized (this) {
            if (this.D != null) {
                this.D.a(str, 5, true, "PipelineDraweeController");
            }
        }
    }

    @Override // com.facebook.drawee.d.a, com.facebook.drawee.i.a
    public void f(@Nullable com.facebook.drawee.i.b bVar) {
        super.f(bVar);
        d0(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.drawee.d.a
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public void H(@Nullable d.a.b.h.a<d.a.e.j.c> aVar) {
        d.a.b.h.a.o(aVar);
    }

    public synchronized void g0(com.facebook.drawee.b.a.i.b bVar) {
        if (this.D instanceof com.facebook.drawee.b.a.i.a) {
            ((com.facebook.drawee.b.a.i.a) this.D).c(bVar);
        } else if (this.D != null) {
            this.D = new com.facebook.drawee.b.a.i.a(this.D, bVar);
        } else {
            this.D = bVar;
        }
    }

    public synchronized void h0(d.a.e.k.e eVar) {
        if (this.C == null) {
            return;
        }
        this.C.remove(eVar);
    }

    public void i0(@Nullable d.a.b.d.e<d.a.e.i.a> eVar) {
        this.A = eVar;
    }

    public void j0(boolean z) {
        this.z = z;
    }

    protected void k0(@Nullable d.a.e.j.c cVar, com.facebook.drawee.e.a aVar) {
        o oVarA;
        aVar.f(r());
        com.facebook.drawee.i.b bVarC = c();
        p.b bVarR = null;
        if (bVarC != null && (oVarA = com.facebook.drawee.f.p.a(bVarC.c())) != null) {
            bVarR = oVarA.r();
        }
        aVar.j(bVarR);
        aVar.i(this.E.b());
        if (cVar == null) {
            aVar.e();
        } else {
            aVar.g(cVar.getWidth(), cVar.getHeight());
            aVar.h(cVar.f());
        }
    }

    @Override // com.facebook.drawee.d.a
    protected com.facebook.datasource.c<d.a.b.h.a<d.a.e.j.c>> p() {
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.a("PipelineDraweeController#getDataSource");
        }
        if (d.a.b.e.a.m(2)) {
            d.a.b.e.a.o(F, "controller %x: getDataSource", Integer.valueOf(System.identityHashCode(this)));
        }
        com.facebook.datasource.c<d.a.b.h.a<d.a.e.j.c>> cVar = this.y.get();
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.b();
        }
        return cVar;
    }

    @Override // com.facebook.drawee.d.a
    public String toString() {
        h.b bVarD = h.d(this);
        bVarD.b("super", super.toString());
        bVarD.b("dataSourceSupplier", this.y);
        return bVarD.toString();
    }
}
