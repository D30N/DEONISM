package com.facebook.datasource;

import android.util.Pair;
import d.a.b.d.i;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public abstract class a<T> implements com.facebook.datasource.c<T> {

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("this")
    @Nullable
    private T f1120c = null;

    /* renamed from: d, reason: collision with root package name */
    @GuardedBy("this")
    private Throwable f1121d = null;

    @GuardedBy("this")
    private float e = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    private boolean f1119b = false;

    @GuardedBy("this")
    private c a = c.IN_PROGRESS;
    private final ConcurrentLinkedQueue<Pair<e<T>, Executor>> f = new ConcurrentLinkedQueue<>();

    /* renamed from: com.facebook.datasource.a$a, reason: collision with other inner class name */
    class RunnableC0047a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f1122b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f1123c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f1124d;

        RunnableC0047a(boolean z, e eVar, boolean z2) {
            this.f1122b = z;
            this.f1123c = eVar;
            this.f1124d = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1122b) {
                this.f1123c.c(a.this);
            } else if (this.f1124d) {
                this.f1123c.a(a.this);
            } else {
                this.f1123c.b(a.this);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f1125b;

        b(e eVar) {
            this.f1125b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1125b.d(a.this);
        }
    }

    private enum c {
        IN_PROGRESS,
        SUCCESS,
        FAILURE
    }

    protected a() {
    }

    private void k(e<T> eVar, Executor executor, boolean z, boolean z2) {
        executor.execute(new RunnableC0047a(z, eVar, z2));
    }

    private void l() {
        boolean zI = i();
        boolean zT = t();
        Iterator<Pair<e<T>, Executor>> it = this.f.iterator();
        while (it.hasNext()) {
            Pair<e<T>, Executor> next = it.next();
            k((e) next.first, (Executor) next.second, zI, zT);
        }
    }

    private synchronized boolean o(Throwable th) {
        boolean z;
        if (this.f1119b || this.a != c.IN_PROGRESS) {
            z = false;
        } else {
            this.a = c.FAILURE;
            this.f1121d = th;
            z = true;
        }
        return z;
    }

    private synchronized boolean q(float f) {
        if (!this.f1119b && this.a == c.IN_PROGRESS) {
            if (f < this.e) {
                return false;
            }
            this.e = f;
            return true;
        }
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:31:0x0039
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    private boolean s(@javax.annotation.Nullable T r4, boolean r5) {
        /*
            r3 = this;
            r0 = 0
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L3c
            boolean r1 = r3.f1119b     // Catch: java.lang.Throwable -> L39
            if (r1 != 0) goto L2d
            com.facebook.datasource.a$c r1 = r3.a     // Catch: java.lang.Throwable -> L39
            com.facebook.datasource.a$c r2 = com.facebook.datasource.a.c.IN_PROGRESS     // Catch: java.lang.Throwable -> L39
            if (r1 == r2) goto Ld
            goto L2d
        Ld:
            if (r5 == 0) goto L17
            com.facebook.datasource.a$c r5 = com.facebook.datasource.a.c.SUCCESS     // Catch: java.lang.Throwable -> L39
            r3.a = r5     // Catch: java.lang.Throwable -> L39
            r5 = 1065353216(0x3f800000, float:1.0)
            r3.e = r5     // Catch: java.lang.Throwable -> L39
        L17:
            T r5 = r3.f1120c     // Catch: java.lang.Throwable -> L39
            if (r5 == r4) goto L24
            T r5 = r3.f1120c     // Catch: java.lang.Throwable -> L39
            r3.f1120c = r4     // Catch: java.lang.Throwable -> L21
            r4 = r5
            goto L25
        L21:
            r4 = move-exception
            r0 = r5
            goto L3a
        L24:
            r4 = r0
        L25:
            r5 = 1
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L35
            if (r4 == 0) goto L2c
            r3.h(r4)
        L2c:
            return r5
        L2d:
            r5 = 0
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L35
            if (r4 == 0) goto L34
            r3.h(r4)
        L34:
            return r5
        L35:
            r5 = move-exception
            r0 = r4
            r4 = r5
            goto L3a
        L39:
            r4 = move-exception
        L3a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L39
            throw r4     // Catch: java.lang.Throwable -> L3c
        L3c:
            r4 = move-exception
            if (r0 == 0) goto L42
            r3.h(r0)
        L42:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.a.s(java.lang.Object, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized boolean t() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.j()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto Lf
            boolean r0 = r1.d()     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            monitor-exit(r1)
            return r0
        L12:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.a.t():boolean");
    }

    @Override // com.facebook.datasource.c
    public boolean a() {
        return false;
    }

    @Override // com.facebook.datasource.c
    @Nullable
    public synchronized T b() {
        return this.f1120c;
    }

    @Override // com.facebook.datasource.c
    public synchronized boolean c() {
        return this.f1120c != null;
    }

    @Override // com.facebook.datasource.c
    public boolean close() {
        synchronized (this) {
            if (this.f1119b) {
                return false;
            }
            this.f1119b = true;
            T t = this.f1120c;
            this.f1120c = null;
            if (t != null) {
                h(t);
            }
            if (!d()) {
                l();
            }
            synchronized (this) {
                this.f.clear();
            }
            return true;
        }
    }

    @Override // com.facebook.datasource.c
    public synchronized boolean d() {
        return this.a != c.IN_PROGRESS;
    }

    @Override // com.facebook.datasource.c
    public void e(e<T> eVar, Executor executor) {
        i.g(eVar);
        i.g(executor);
        synchronized (this) {
            if (this.f1119b) {
                return;
            }
            if (this.a == c.IN_PROGRESS) {
                this.f.add(Pair.create(eVar, executor));
            }
            boolean z = c() || d() || t();
            if (z) {
                k(eVar, executor, i(), t());
            }
        }
    }

    @Override // com.facebook.datasource.c
    @Nullable
    public synchronized Throwable f() {
        return this.f1121d;
    }

    @Override // com.facebook.datasource.c
    public synchronized float g() {
        return this.e;
    }

    protected void h(@Nullable T t) {
    }

    public synchronized boolean i() {
        return this.a == c.FAILURE;
    }

    public synchronized boolean j() {
        return this.f1119b;
    }

    protected void m() {
        Iterator<Pair<e<T>, Executor>> it = this.f.iterator();
        while (it.hasNext()) {
            Pair<e<T>, Executor> next = it.next();
            ((Executor) next.second).execute(new b((e) next.first));
        }
    }

    protected boolean n(Throwable th) {
        boolean zO = o(th);
        if (zO) {
            l();
        }
        return zO;
    }

    protected boolean p(float f) {
        boolean zQ = q(f);
        if (zQ) {
            m();
        }
        return zQ;
    }

    protected boolean r(@Nullable T t, boolean z) {
        boolean zS = s(t, z);
        if (zS) {
            l();
        }
        return zS;
    }
}
