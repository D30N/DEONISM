package com.facebook.imagepipeline.memory;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.Set;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.NotThreadSafe;

/* loaded from: classes.dex */
public abstract class b<V> implements d.a.b.g.e<V> {
    private final Class<?> a = getClass();

    /* renamed from: b, reason: collision with root package name */
    final d.a.b.g.c f1255b;

    /* renamed from: c, reason: collision with root package name */
    final f0 f1256c;

    /* renamed from: d, reason: collision with root package name */
    final SparseArray<g<V>> f1257d;
    final Set<V> e;
    private boolean f;

    @GuardedBy("this")
    final a g;

    @GuardedBy("this")
    final a h;
    private final g0 i;

    @NotThreadSafe
    static class a {
        int a;

        /* renamed from: b, reason: collision with root package name */
        int f1258b;

        a() {
        }

        public void a(int i) {
            int i2;
            int i3 = this.f1258b;
            if (i3 < i || (i2 = this.a) <= 0) {
                d.a.b.e.a.B("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i), Integer.valueOf(this.f1258b), Integer.valueOf(this.a));
            } else {
                this.a = i2 - 1;
                this.f1258b = i3 - i;
            }
        }

        public void b(int i) {
            this.a++;
            this.f1258b += i;
        }
    }

    /* renamed from: com.facebook.imagepipeline.memory.b$b, reason: collision with other inner class name */
    public static class C0054b extends RuntimeException {
        public C0054b(Object obj) {
            super("Invalid size: " + obj.toString());
        }
    }

    public static class c extends RuntimeException {
        public c(int i, int i2, int i3, int i4) {
            super("Pool hard cap violation? Hard cap = " + i + " Used size = " + i2 + " Free size = " + i3 + " Request size = " + i4);
        }
    }

    public b(d.a.b.g.c cVar, f0 f0Var, g0 g0Var) {
        d.a.b.d.i.g(cVar);
        this.f1255b = cVar;
        d.a.b.d.i.g(f0Var);
        this.f1256c = f0Var;
        d.a.b.d.i.g(g0Var);
        this.i = g0Var;
        this.f1257d = new SparseArray<>();
        if (this.f1256c.f1275d) {
            m();
        } else {
            q(new SparseIntArray(0));
        }
        this.e = d.a.b.d.j.b();
        this.h = new a();
        this.g = new a();
    }

    private synchronized void d() {
        d.a.b.d.i.i(!o() || this.h.f1258b == 0);
    }

    private void e(SparseIntArray sparseIntArray) {
        this.f1257d.clear();
        for (int i = 0; i < sparseIntArray.size(); i++) {
            int iKeyAt = sparseIntArray.keyAt(i);
            this.f1257d.put(iKeyAt, new g<>(k(iKeyAt), sparseIntArray.valueAt(i), 0, this.f1256c.f1275d));
        }
    }

    private synchronized g<V> h(int i) {
        return this.f1257d.get(i);
    }

    private synchronized void m() {
        SparseIntArray sparseIntArray = this.f1256c.f1274c;
        if (sparseIntArray != null) {
            e(sparseIntArray);
            this.f = false;
        } else {
            this.f = true;
        }
    }

    private synchronized void q(SparseIntArray sparseIntArray) {
        d.a.b.d.i.g(sparseIntArray);
        this.f1257d.clear();
        SparseIntArray sparseIntArray2 = this.f1256c.f1274c;
        if (sparseIntArray2 != null) {
            for (int i = 0; i < sparseIntArray2.size(); i++) {
                int iKeyAt = sparseIntArray2.keyAt(i);
                this.f1257d.put(iKeyAt, new g<>(k(iKeyAt), sparseIntArray2.valueAt(i), sparseIntArray.get(iKeyAt, 0), this.f1256c.f1275d));
            }
            this.f = false;
        } else {
            this.f = true;
        }
    }

    @SuppressLint({"InvalidAccessToGuardedField"})
    private void r() {
        if (d.a.b.e.a.m(2)) {
            d.a.b.e.a.r(this.a, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(this.g.a), Integer.valueOf(this.g.f1258b), Integer.valueOf(this.h.a), Integer.valueOf(this.h.f1258b));
        }
    }

    @Override // d.a.b.g.e, d.a.b.h.h
    public void a(V v) {
        g0 g0Var;
        d.a.b.d.i.g(v);
        int iJ = j(v);
        int iK = k(iJ);
        synchronized (this) {
            g<V> gVarH = h(iJ);
            if (this.e.remove(v)) {
                if (gVarH != null && !gVarH.f() && !o() && p(v)) {
                    gVarH.h(v);
                    this.h.b(iK);
                    this.g.a(iK);
                    this.i.a(iK);
                    if (d.a.b.e.a.m(2)) {
                        d.a.b.e.a.p(this.a, "release (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(iJ));
                    }
                    r();
                }
                if (gVarH != null) {
                    gVarH.b();
                }
                if (d.a.b.e.a.m(2)) {
                    d.a.b.e.a.p(this.a, "release (free) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(iJ));
                }
                f(v);
                this.g.a(iK);
                g0Var = this.i;
            } else {
                d.a.b.e.a.f(this.a, "release (free, value unrecognized) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(iJ));
                f(v);
                g0Var = this.i;
            }
            g0Var.d(iK);
            r();
        }
    }

    protected abstract V b(int i);

    synchronized boolean c(int i) {
        int i2 = this.f1256c.a;
        if (i > i2 - this.g.f1258b) {
            this.i.e();
            return false;
        }
        int i3 = this.f1256c.f1273b;
        if (i > i3 - (this.g.f1258b + this.h.f1258b)) {
            t(i3 - i);
        }
        if (i <= i2 - (this.g.f1258b + this.h.f1258b)) {
            return true;
        }
        this.i.e();
        return false;
    }

    protected abstract void f(V v);

    synchronized g<V> g(int i) {
        g<V> gVar = this.f1257d.get(i);
        if (gVar == null && this.f) {
            if (d.a.b.e.a.m(2)) {
                d.a.b.e.a.o(this.a, "creating new bucket %s", Integer.valueOf(i));
            }
            g<V> gVarS = s(i);
            this.f1257d.put(i, gVarS);
            return gVarS;
        }
        return gVar;
    }

    @Override // d.a.b.g.e
    public V get(int i) throws X {
        V vL;
        d();
        int i2 = i(i);
        synchronized (this) {
            g<V> gVarG = g(i2);
            if (gVarG != null && (vL = l(gVarG)) != null) {
                d.a.b.d.i.i(this.e.add(vL));
                int iJ = j(vL);
                int iK = k(iJ);
                this.g.b(iK);
                this.h.a(iK);
                this.i.c(iK);
                r();
                if (d.a.b.e.a.m(2)) {
                    d.a.b.e.a.p(this.a, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(vL)), Integer.valueOf(iJ));
                }
                return vL;
            }
            int iK2 = k(i2);
            if (!c(iK2)) {
                throw new c(this.f1256c.a, this.g.f1258b, this.h.f1258b, iK2);
            }
            this.g.b(iK2);
            if (gVarG != null) {
                gVarG.e();
            }
            V vB = null;
            try {
                vB = b(i2);
            } catch (Throwable th) {
                synchronized (this) {
                    this.g.a(iK2);
                    g<V> gVarG2 = g(i2);
                    if (gVarG2 != null) {
                        gVarG2.b();
                    }
                    d.a.b.d.m.c(th);
                }
            }
            synchronized (this) {
                d.a.b.d.i.i(this.e.add(vB));
                u();
                this.i.b(iK2);
                r();
                if (d.a.b.e.a.m(2)) {
                    d.a.b.e.a.p(this.a, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(vB)), Integer.valueOf(i2));
                }
            }
            return vB;
        }
    }

    protected abstract int i(int i);

    protected abstract int j(V v);

    protected abstract int k(int i);

    @Nullable
    protected synchronized V l(g<V> gVar) {
        return gVar.c();
    }

    protected void n() {
        this.f1255b.a(this);
        this.i.f(this);
    }

    synchronized boolean o() {
        boolean z;
        z = this.g.f1258b + this.h.f1258b > this.f1256c.f1273b;
        if (z) {
            this.i.g();
        }
        return z;
    }

    protected boolean p(V v) {
        d.a.b.d.i.g(v);
        return true;
    }

    g<V> s(int i) {
        return new g<>(k(i), Integer.MAX_VALUE, 0, this.f1256c.f1275d);
    }

    synchronized void t(int i) {
        int iMin = Math.min((this.g.f1258b + this.h.f1258b) - i, this.h.f1258b);
        if (iMin <= 0) {
            return;
        }
        if (d.a.b.e.a.m(2)) {
            d.a.b.e.a.q(this.a, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i), Integer.valueOf(this.g.f1258b + this.h.f1258b), Integer.valueOf(iMin));
        }
        r();
        for (int i2 = 0; i2 < this.f1257d.size() && iMin > 0; i2++) {
            g<V> gVarValueAt = this.f1257d.valueAt(i2);
            while (iMin > 0) {
                V vG = gVarValueAt.g();
                if (vG == null) {
                    break;
                }
                f(vG);
                iMin -= gVarValueAt.a;
                this.h.a(gVarValueAt.a);
            }
        }
        r();
        if (d.a.b.e.a.m(2)) {
            d.a.b.e.a.p(this.a, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i), Integer.valueOf(this.g.f1258b + this.h.f1258b));
        }
    }

    synchronized void u() {
        if (o()) {
            t(this.f1256c.f1273b);
        }
    }
}
