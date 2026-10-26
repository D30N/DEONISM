package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public class x {
    private final Executor a;

    /* renamed from: b, reason: collision with root package name */
    private final d f1414b;
    private final int e;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f1415c = new a();

    /* renamed from: d, reason: collision with root package name */
    private final Runnable f1416d = new b();

    @GuardedBy("this")
    d.a.e.j.e f = null;

    @GuardedBy("this")
    int g = 0;

    @GuardedBy("this")
    f h = f.IDLE;

    @GuardedBy("this")
    long i = 0;

    @GuardedBy("this")
    long j = 0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            x.this.d();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            x.this.j();
        }
    }

    static /* synthetic */ class c {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[f.values().length];
            a = iArr;
            try {
                iArr[f.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[f.QUEUED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[f.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[f.RUNNING_AND_PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface d {
        void a(d.a.e.j.e eVar, int i);
    }

    static class e {
        private static ScheduledExecutorService a;

        static ScheduledExecutorService a() {
            if (a == null) {
                a = Executors.newSingleThreadScheduledExecutor();
            }
            return a;
        }
    }

    enum f {
        IDLE,
        QUEUED,
        RUNNING,
        RUNNING_AND_PENDING
    }

    public x(Executor executor, d dVar, int i) {
        this.a = executor;
        this.f1414b = dVar;
        this.e = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        d.a.e.j.e eVar;
        int i;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            eVar = this.f;
            i = this.g;
            this.f = null;
            this.g = 0;
            this.h = f.RUNNING;
            this.j = jUptimeMillis;
        }
        try {
            if (i(eVar, i)) {
                this.f1414b.a(eVar, i);
            }
        } finally {
            d.a.e.j.e.g(eVar);
            g();
        }
    }

    private void e(long j) {
        if (j > 0) {
            e.a().schedule(this.f1416d, j, TimeUnit.MILLISECONDS);
        } else {
            this.f1416d.run();
        }
    }

    private void g() {
        long jMax;
        boolean z;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            if (this.h == f.RUNNING_AND_PENDING) {
                jMax = Math.max(this.j + this.e, jUptimeMillis);
                z = true;
                this.i = jUptimeMillis;
                this.h = f.QUEUED;
            } else {
                this.h = f.IDLE;
                jMax = 0;
                z = false;
            }
        }
        if (z) {
            e(jMax - jUptimeMillis);
        }
    }

    private static boolean i(d.a.e.j.e eVar, int i) {
        return com.facebook.imagepipeline.producers.b.e(i) || com.facebook.imagepipeline.producers.b.n(i, 4) || d.a.e.j.e.x(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.a.execute(this.f1415c);
    }

    public void c() {
        d.a.e.j.e eVar;
        synchronized (this) {
            eVar = this.f;
            this.f = null;
            this.g = 0;
        }
        d.a.e.j.e.g(eVar);
    }

    public synchronized long f() {
        return this.j - this.i;
    }

    public boolean h() {
        long jMax;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            boolean z = false;
            if (!i(this.f, this.g)) {
                return false;
            }
            int i = c.a[this.h.ordinal()];
            if (i != 1) {
                if (i == 3) {
                    this.h = f.RUNNING_AND_PENDING;
                }
                jMax = 0;
            } else {
                jMax = Math.max(this.j + this.e, jUptimeMillis);
                this.i = jUptimeMillis;
                this.h = f.QUEUED;
                z = true;
            }
            if (z) {
                e(jMax - jUptimeMillis);
            }
            return true;
        }
    }

    public boolean k(d.a.e.j.e eVar, int i) {
        d.a.e.j.e eVar2;
        if (!i(eVar, i)) {
            return false;
        }
        synchronized (this) {
            eVar2 = this.f;
            this.f = d.a.e.j.e.f(eVar);
            this.g = i;
        }
        d.a.e.j.e.g(eVar2);
        return true;
    }
}
