package d.a.e.a.c;

import d.a.b.d.h;
import d.a.e.c.h;
import java.util.Iterator;
import java.util.LinkedHashSet;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public class c {
    private final d.a.a.a.d a;

    /* renamed from: b, reason: collision with root package name */
    private final h<d.a.a.a.d, d.a.e.j.c> f2458b;

    /* renamed from: d, reason: collision with root package name */
    @GuardedBy("this")
    private final LinkedHashSet<d.a.a.a.d> f2460d = new LinkedHashSet<>();

    /* renamed from: c, reason: collision with root package name */
    private final h.d<d.a.a.a.d> f2459c = new a();

    class a implements h.d<d.a.a.a.d> {
        a() {
        }

        @Override // d.a.e.c.h.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(d.a.a.a.d dVar, boolean z) {
            c.this.f(dVar, z);
        }
    }

    static class b implements d.a.a.a.d {
        private final d.a.a.a.d a;

        /* renamed from: b, reason: collision with root package name */
        private final int f2461b;

        public b(d.a.a.a.d dVar, int i) {
            this.a = dVar;
            this.f2461b = i;
        }

        @Override // d.a.a.a.d
        @Nullable
        public String a() {
            return null;
        }

        @Override // d.a.a.a.d
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f2461b == bVar.f2461b && this.a.equals(bVar.a);
        }

        @Override // d.a.a.a.d
        public int hashCode() {
            return (this.a.hashCode() * 1013) + this.f2461b;
        }

        public String toString() {
            h.b bVarD = d.a.b.d.h.d(this);
            bVarD.b("imageCacheKey", this.a);
            bVarD.a("frameIndex", this.f2461b);
            return bVarD.toString();
        }
    }

    public c(d.a.a.a.d dVar, d.a.e.c.h<d.a.a.a.d, d.a.e.j.c> hVar) {
        this.a = dVar;
        this.f2458b = hVar;
    }

    private b e(int i) {
        return new b(this.a, i);
    }

    @Nullable
    private synchronized d.a.a.a.d g() {
        d.a.a.a.d next;
        next = null;
        Iterator<d.a.a.a.d> it = this.f2460d.iterator();
        if (it.hasNext()) {
            next = it.next();
            it.remove();
        }
        return next;
    }

    @Nullable
    public d.a.b.h.a<d.a.e.j.c> a(int i, d.a.b.h.a<d.a.e.j.c> aVar) {
        return this.f2458b.d(e(i), aVar, this.f2459c);
    }

    public boolean b(int i) {
        return this.f2458b.f(e(i));
    }

    @Nullable
    public d.a.b.h.a<d.a.e.j.c> c(int i) {
        return this.f2458b.get(e(i));
    }

    @Nullable
    public d.a.b.h.a<d.a.e.j.c> d() {
        d.a.b.h.a<d.a.e.j.c> aVarW;
        do {
            d.a.a.a.d dVarG = g();
            if (dVarG == null) {
                return null;
            }
            aVarW = this.f2458b.w(dVarG);
        } while (aVarW == null);
        return aVarW;
    }

    public synchronized void f(d.a.a.a.d dVar, boolean z) {
        if (z) {
            this.f2460d.add(dVar);
        } else {
            this.f2460d.remove(dVar);
        }
    }
}
