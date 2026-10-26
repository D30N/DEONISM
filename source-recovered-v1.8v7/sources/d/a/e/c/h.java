package d.a.e.c;

import android.os.SystemClock;
import d.a.e.c.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes.dex */
public class h<K, V> implements p<K, V>, d.a.b.g.b {

    @GuardedBy("this")
    final g<K, c<K, V>> a;

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    final g<K, c<K, V>> f2489b;

    /* renamed from: c, reason: collision with root package name */
    private final v<V> f2490c;

    /* renamed from: d, reason: collision with root package name */
    private final d.a.b.d.k<q> f2491d;

    @GuardedBy("this")
    protected q e;

    @GuardedBy("this")
    private long f;

    class a implements v<c<K, V>> {
        final /* synthetic */ v a;

        a(h hVar, v vVar) {
            this.a = vVar;
        }

        @Override // d.a.e.c.v
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(c<K, V> cVar) {
            return this.a.a(cVar.f2493b.r());
        }
    }

    class b implements d.a.b.h.h<V> {
        final /* synthetic */ c a;

        b(c cVar) {
            this.a = cVar;
        }

        @Override // d.a.b.h.h
        public void a(V v) {
            h.this.v(this.a);
        }
    }

    static class c<K, V> {
        public final K a;

        /* renamed from: b, reason: collision with root package name */
        public final d.a.b.h.a<V> f2493b;

        /* renamed from: c, reason: collision with root package name */
        public int f2494c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f2495d;

        @Nullable
        public final d<K> e;

        private c(K k, d.a.b.h.a<V> aVar, @Nullable d<K> dVar) {
            d.a.b.d.i.g(k);
            this.a = k;
            d.a.b.h.a<V> aVarK = d.a.b.h.a.k(aVar);
            d.a.b.d.i.g(aVarK);
            this.f2493b = aVarK;
            this.f2494c = 0;
            this.f2495d = false;
            this.e = dVar;
        }

        static <K, V> c<K, V> a(K k, d.a.b.h.a<V> aVar, @Nullable d<K> dVar) {
            return new c<>(k, aVar, dVar);
        }
    }

    public interface d<K> {
        void a(K k, boolean z);
    }

    public h(v<V> vVar, p.a aVar, d.a.b.d.k<q> kVar) {
        new WeakHashMap();
        this.f2490c = vVar;
        this.a = new g<>(y(vVar));
        this.f2489b = new g<>(y(vVar));
        this.f2491d = kVar;
        this.e = kVar.get();
        this.f = SystemClock.uptimeMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized boolean e(V r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            d.a.e.c.v<V> r0 = r3.f2490c     // Catch: java.lang.Throwable -> L28
            int r4 = r0.a(r4)     // Catch: java.lang.Throwable -> L28
            d.a.e.c.q r0 = r3.e     // Catch: java.lang.Throwable -> L28
            int r0 = r0.e     // Catch: java.lang.Throwable -> L28
            r1 = 1
            if (r4 > r0) goto L25
            int r0 = r3.h()     // Catch: java.lang.Throwable -> L28
            d.a.e.c.q r2 = r3.e     // Catch: java.lang.Throwable -> L28
            int r2 = r2.f2498b     // Catch: java.lang.Throwable -> L28
            int r2 = r2 - r1
            if (r0 > r2) goto L25
            int r0 = r3.i()     // Catch: java.lang.Throwable -> L28
            d.a.e.c.q r2 = r3.e     // Catch: java.lang.Throwable -> L28
            int r2 = r2.a     // Catch: java.lang.Throwable -> L28
            int r2 = r2 - r4
            if (r0 > r2) goto L25
            goto L26
        L25:
            r1 = 0
        L26:
            monitor-exit(r3)
            return r1
        L28:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.e.c.h.e(java.lang.Object):boolean");
    }

    private synchronized void g(c<K, V> cVar) {
        d.a.b.d.i.g(cVar);
        d.a.b.d.i.i(cVar.f2494c > 0);
        cVar.f2494c--;
    }

    private synchronized void j(c<K, V> cVar) {
        d.a.b.d.i.g(cVar);
        d.a.b.d.i.i(!cVar.f2495d);
        cVar.f2494c++;
    }

    private synchronized void k(c<K, V> cVar) {
        d.a.b.d.i.g(cVar);
        d.a.b.d.i.i(!cVar.f2495d);
        cVar.f2495d = true;
    }

    private synchronized void l(@Nullable ArrayList<c<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<c<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                k(it.next());
            }
        }
    }

    private synchronized boolean m(c<K, V> cVar) {
        boolean z;
        if (cVar.f2495d || cVar.f2494c != 0) {
            z = false;
        } else {
            this.a.g(cVar.a, cVar);
            z = true;
        }
        return z;
    }

    private void n(@Nullable ArrayList<c<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<c<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                d.a.b.h.a.o(u(it.next()));
            }
        }
    }

    private void o() {
        ArrayList<c<K, V>> arrayListX;
        synchronized (this) {
            arrayListX = x(Math.min(this.e.f2500d, this.e.f2498b - h()), Math.min(this.e.f2499c, this.e.a - i()));
            l(arrayListX);
        }
        n(arrayListX);
        r(arrayListX);
    }

    private static <K, V> void p(@Nullable c<K, V> cVar) {
        d<K> dVar;
        if (cVar == null || (dVar = cVar.e) == null) {
            return;
        }
        dVar.a(cVar.a, true);
    }

    private static <K, V> void q(@Nullable c<K, V> cVar) {
        d<K> dVar;
        if (cVar == null || (dVar = cVar.e) == null) {
            return;
        }
        dVar.a(cVar.a, false);
    }

    private void r(@Nullable ArrayList<c<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<c<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                q(it.next());
            }
        }
    }

    private synchronized void s() {
        if (this.f + this.e.f > SystemClock.uptimeMillis()) {
            return;
        }
        this.f = SystemClock.uptimeMillis();
        this.e = this.f2491d.get();
    }

    private synchronized d.a.b.h.a<V> t(c<K, V> cVar) {
        j(cVar);
        return d.a.b.h.a.x(cVar.f2493b.r(), new b(cVar));
    }

    @Nullable
    private synchronized d.a.b.h.a<V> u(c<K, V> cVar) {
        d.a.b.d.i.g(cVar);
        return (cVar.f2495d && cVar.f2494c == 0) ? cVar.f2493b : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(c<K, V> cVar) {
        boolean zM;
        d.a.b.h.a<V> aVarU;
        d.a.b.d.i.g(cVar);
        synchronized (this) {
            g(cVar);
            zM = m(cVar);
            aVarU = u(cVar);
        }
        d.a.b.h.a.o(aVarU);
        if (!zM) {
            cVar = null;
        }
        p(cVar);
        s();
        o();
    }

    @Nullable
    private synchronized ArrayList<c<K, V>> x(int i, int i2) {
        int iMax = Math.max(i, 0);
        int iMax2 = Math.max(i2, 0);
        if (this.a.c() <= iMax && this.a.e() <= iMax2) {
            return null;
        }
        ArrayList<c<K, V>> arrayList = new ArrayList<>();
        while (true) {
            if (this.a.c() <= iMax && this.a.e() <= iMax2) {
                return arrayList;
            }
            K kD = this.a.d();
            this.a.h(kD);
            arrayList.add(this.f2489b.h(kD));
        }
    }

    private v<c<K, V>> y(v<V> vVar) {
        return new a(this, vVar);
    }

    @Override // d.a.e.c.p
    public d.a.b.h.a<V> b(K k, d.a.b.h.a<V> aVar) {
        return d(k, aVar, null);
    }

    @Nullable
    public d.a.b.h.a<V> d(K k, d.a.b.h.a<V> aVar, d<K> dVar) {
        c<K, V> cVarH;
        d.a.b.h.a<V> aVarT;
        d.a.b.h.a<V> aVarU;
        d.a.b.d.i.g(k);
        d.a.b.d.i.g(aVar);
        s();
        synchronized (this) {
            cVarH = this.a.h(k);
            c<K, V> cVarH2 = this.f2489b.h(k);
            aVarT = null;
            if (cVarH2 != null) {
                k(cVarH2);
                aVarU = u(cVarH2);
            } else {
                aVarU = null;
            }
            if (e(aVar.r())) {
                c<K, V> cVarA = c.a(k, aVar, dVar);
                this.f2489b.g(k, cVarA);
                aVarT = t(cVarA);
            }
        }
        d.a.b.h.a.o(aVarU);
        q(cVarH);
        o();
        return aVarT;
    }

    public synchronized boolean f(K k) {
        return this.f2489b.a(k);
    }

    @Override // d.a.e.c.p
    @Nullable
    public d.a.b.h.a<V> get(K k) {
        c<K, V> cVarH;
        d.a.b.h.a<V> aVarT;
        d.a.b.d.i.g(k);
        synchronized (this) {
            cVarH = this.a.h(k);
            c<K, V> cVarB = this.f2489b.b(k);
            aVarT = cVarB != null ? t(cVarB) : null;
        }
        q(cVarH);
        s();
        o();
        return aVarT;
    }

    public synchronized int h() {
        return this.f2489b.c() - this.a.c();
    }

    public synchronized int i() {
        return this.f2489b.e() - this.a.e();
    }

    @Nullable
    public d.a.b.h.a<V> w(K k) {
        c<K, V> cVarH;
        boolean z;
        d.a.b.h.a<V> aVar;
        d.a.b.d.i.g(k);
        synchronized (this) {
            cVarH = this.a.h(k);
            z = true;
            if (cVarH != null) {
                c<K, V> cVarH2 = this.f2489b.h(k);
                d.a.b.d.i.g(cVarH2);
                d.a.b.d.i.i(cVarH2.f2494c == 0);
                aVar = cVarH2.f2493b;
            } else {
                aVar = null;
                z = false;
            }
        }
        if (z) {
            q(cVarH);
        }
        return aVar;
    }
}
