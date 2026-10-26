package d.a.e.e;

import com.facebook.imagepipeline.producers.l0;
import com.facebook.imagepipeline.producers.s0;
import com.facebook.imagepipeline.producers.v0;
import com.facebook.imagepipeline.producers.w;
import d.a.e.c.p;
import d.a.e.l.a;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes.dex */
public class h {
    private final o a;

    /* renamed from: b, reason: collision with root package name */
    private final d.a.e.k.e f2521b;

    /* renamed from: c, reason: collision with root package name */
    private final d.a.e.k.d f2522c;

    /* renamed from: d, reason: collision with root package name */
    private final p<d.a.a.a.d, d.a.e.j.c> f2523d;
    private final d.a.e.c.f e;
    private AtomicLong f = new AtomicLong();

    @Nullable
    private final com.facebook.callercontext.a g;
    private final i h;

    static {
        new CancellationException("Prefetching is not enabled");
    }

    public h(o oVar, Set<d.a.e.k.e> set, Set<d.a.e.k.d> set2, d.a.b.d.k<Boolean> kVar, p<d.a.a.a.d, d.a.e.j.c> pVar, p<d.a.a.a.d, d.a.b.g.g> pVar2, d.a.e.c.e eVar, d.a.e.c.e eVar2, d.a.e.c.f fVar, v0 v0Var, d.a.b.d.k<Boolean> kVar2, d.a.b.d.k<Boolean> kVar3, @Nullable com.facebook.callercontext.a aVar, i iVar) {
        this.a = oVar;
        this.f2521b = new d.a.e.k.c(set);
        this.f2522c = new d.a.e.k.b(set2);
        this.f2523d = pVar;
        this.e = fVar;
        this.g = aVar;
        this.h = iVar;
    }

    private <T> com.facebook.datasource.c<d.a.b.h.a<T>> f(l0<d.a.b.h.a<T>> l0Var, d.a.e.l.a aVar, a.b bVar, Object obj, @Nullable d.a.e.k.e eVar, @Nullable String str) {
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.a("ImagePipeline#submitFetchRequest");
        }
        w wVar = new w(e(aVar, eVar), this.f2522c);
        com.facebook.callercontext.a aVar2 = this.g;
        if (aVar2 != null) {
            aVar2.a(obj, false);
        }
        try {
            try {
                com.facebook.datasource.c<d.a.b.h.a<T>> cVarC = d.a.e.f.b.C(l0Var, new s0(aVar, b(), str, wVar, obj, a.b.f(aVar.e(), bVar), false, aVar.j() || !d.a.b.k.f.l(aVar.p()), aVar.i(), this.h), wVar);
                if (d.a.e.m.b.d()) {
                    d.a.e.m.b.b();
                }
                return cVarC;
            } catch (Exception e) {
                com.facebook.datasource.c<d.a.b.h.a<T>> cVarB = com.facebook.datasource.d.b(e);
                if (d.a.e.m.b.d()) {
                    d.a.e.m.b.b();
                }
                return cVarB;
            }
        } catch (Throwable th) {
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.b();
            }
            throw th;
        }
    }

    public com.facebook.datasource.c<d.a.b.h.a<d.a.e.j.c>> a(d.a.e.l.a aVar, Object obj, a.b bVar, @Nullable d.a.e.k.e eVar, @Nullable String str) {
        try {
            return f(this.a.e(aVar), aVar, bVar, obj, eVar, str);
        } catch (Exception e) {
            return com.facebook.datasource.d.b(e);
        }
    }

    public String b() {
        return String.valueOf(this.f.getAndIncrement());
    }

    public p<d.a.a.a.d, d.a.e.j.c> c() {
        return this.f2523d;
    }

    public d.a.e.c.f d() {
        return this.e;
    }

    public d.a.e.k.e e(d.a.e.l.a aVar, @Nullable d.a.e.k.e eVar) {
        return eVar == null ? aVar.k() == null ? this.f2521b : new d.a.e.k.c(this.f2521b, aVar.k()) : aVar.k() == null ? new d.a.e.k.c(this.f2521b, eVar) : new d.a.e.k.c(this.f2521b, eVar, aVar.k());
    }
}
