package d.a.d.a.b.d;

import android.graphics.Bitmap;
import android.util.SparseArray;
import d.a.b.d.i;
import d.a.e.j.h;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public class b implements d.a.d.a.b.b {
    private static final Class<?> e = b.class;
    private final d.a.e.a.c.c a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f2417b;

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("this")
    private final SparseArray<d.a.b.h.a<d.a.e.j.c>> f2418c = new SparseArray<>();

    /* renamed from: d, reason: collision with root package name */
    @GuardedBy("this")
    @Nullable
    private d.a.b.h.a<d.a.e.j.c> f2419d;

    public b(d.a.e.a.c.c cVar, boolean z) {
        this.a = cVar;
        this.f2417b = z;
    }

    @Nullable
    static d.a.b.h.a<Bitmap> g(@Nullable d.a.b.h.a<d.a.e.j.c> aVar) {
        d.a.e.j.d dVar;
        try {
            if (d.a.b.h.a.u(aVar) && (aVar.r() instanceof d.a.e.j.d) && (dVar = (d.a.e.j.d) aVar.r()) != null) {
                return dVar.i();
            }
            return null;
        } finally {
            d.a.b.h.a.o(aVar);
        }
    }

    @Nullable
    private static d.a.b.h.a<d.a.e.j.c> h(d.a.b.h.a<Bitmap> aVar) {
        return d.a.b.h.a.v(new d.a.e.j.d(aVar, h.f2568d, 0));
    }

    private synchronized void i(int i) {
        d.a.b.h.a<d.a.e.j.c> aVar = this.f2418c.get(i);
        if (aVar != null) {
            this.f2418c.delete(i);
            d.a.b.h.a.o(aVar);
            d.a.b.e.a.p(e, "removePreparedReference(%d) removed. Pending frames: %s", Integer.valueOf(i), this.f2418c);
        }
    }

    @Override // d.a.d.a.b.b
    @Nullable
    public synchronized d.a.b.h.a<Bitmap> a(int i) {
        return g(this.a.c(i));
    }

    @Override // d.a.d.a.b.b
    @Nullable
    public synchronized d.a.b.h.a<Bitmap> b(int i, int i2, int i3) {
        if (!this.f2417b) {
            return null;
        }
        return g(this.a.d());
    }

    @Override // d.a.d.a.b.b
    public synchronized void c(int i, d.a.b.h.a<Bitmap> aVar, int i2) {
        i.g(aVar);
        i(i);
        d.a.b.h.a<d.a.e.j.c> aVarH = null;
        try {
            aVarH = h(aVar);
            if (aVarH != null) {
                d.a.b.h.a.o(this.f2419d);
                this.f2419d = this.a.a(i, aVarH);
            }
        } finally {
            d.a.b.h.a.o(aVarH);
        }
    }

    @Override // d.a.d.a.b.b
    public synchronized void clear() {
        d.a.b.h.a.o(this.f2419d);
        this.f2419d = null;
        for (int i = 0; i < this.f2418c.size(); i++) {
            d.a.b.h.a.o(this.f2418c.valueAt(i));
        }
        this.f2418c.clear();
    }

    @Override // d.a.d.a.b.b
    @Nullable
    public synchronized d.a.b.h.a<Bitmap> d(int i) {
        return g(d.a.b.h.a.k(this.f2419d));
    }

    @Override // d.a.d.a.b.b
    public synchronized boolean e(int i) {
        return this.a.b(i);
    }

    @Override // d.a.d.a.b.b
    public synchronized void f(int i, d.a.b.h.a<Bitmap> aVar, int i2) {
        i.g(aVar);
        try {
            d.a.b.h.a<d.a.e.j.c> aVarH = h(aVar);
            if (aVarH == null) {
                d.a.b.h.a.o(aVarH);
                return;
            }
            d.a.b.h.a<d.a.e.j.c> aVarA = this.a.a(i, aVarH);
            if (d.a.b.h.a.u(aVarA)) {
                d.a.b.h.a.o(this.f2418c.get(i));
                this.f2418c.put(i, aVarA);
                d.a.b.e.a.p(e, "cachePreparedFrame(%d) cached. Pending frames: %s", Integer.valueOf(i), this.f2418c);
            }
            d.a.b.h.a.o(aVarH);
        } catch (Throwable th) {
            d.a.b.h.a.o(null);
            throw th;
        }
    }
}
