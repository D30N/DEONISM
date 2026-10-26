package com.google.android.gms.measurement.internal;

import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a5 extends b6 {
    private static final AtomicLong l = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c, reason: collision with root package name */
    private e5 f1615c;

    /* renamed from: d, reason: collision with root package name */
    private e5 f1616d;
    private final PriorityBlockingQueue<b5<?>> e;
    private final BlockingQueue<b5<?>> f;
    private final Thread.UncaughtExceptionHandler g;
    private final Thread.UncaughtExceptionHandler h;
    private final Object i;
    private final Semaphore j;
    private volatile boolean k;

    a5(d5 d5Var) {
        super(d5Var);
        this.i = new Object();
        this.j = new Semaphore(2);
        this.e = new PriorityBlockingQueue<>();
        this.f = new LinkedBlockingQueue();
        this.g = new c5(this, "Thread death: Uncaught exception on worker thread");
        this.h = new c5(this, "Thread death: Uncaught exception on network thread");
    }

    static /* synthetic */ e5 A(a5 a5Var, e5 e5Var) {
        a5Var.f1616d = null;
        return null;
    }

    static /* synthetic */ e5 u(a5 a5Var, e5 e5Var) {
        a5Var.f1615c = null;
        return null;
    }

    private final void y(b5<?> b5Var) {
        synchronized (this.i) {
            this.e.add(b5Var);
            if (this.f1615c == null) {
                e5 e5Var = new e5(this, "Measurement Worker", this.e);
                this.f1615c = e5Var;
                e5Var.setUncaughtExceptionHandler(this.g);
                this.f1615c.start();
            } else {
                this.f1615c.a();
            }
        }
    }

    public final <V> Future<V> B(Callable<V> callable) {
        p();
        com.google.android.gms.common.internal.q.k(callable);
        b5<?> b5Var = new b5<>(this, (Callable<?>) callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f1615c) {
            b5Var.run();
        } else {
            y(b5Var);
        }
        return b5Var;
    }

    public final void C(Runnable runnable) {
        p();
        com.google.android.gms.common.internal.q.k(runnable);
        b5<?> b5Var = new b5<>(this, runnable, false, "Task exception on network thread");
        synchronized (this.i) {
            this.f.add(b5Var);
            if (this.f1616d == null) {
                e5 e5Var = new e5(this, "Measurement Network", this.f);
                this.f1616d = e5Var;
                e5Var.setUncaughtExceptionHandler(this.h);
                this.f1616d.start();
            } else {
                this.f1616d.a();
            }
        }
    }

    public final boolean H() {
        return Thread.currentThread() == this.f1615c;
    }

    @Override // com.google.android.gms.measurement.internal.y5
    public final void b() {
        if (Thread.currentThread() != this.f1616d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.y5
    public final void c() {
        if (Thread.currentThread() != this.f1615c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.b6
    protected final boolean s() {
        return false;
    }

    final <T> T v(AtomicReference<T> atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            j().z(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                b4 b4VarJ = m().J();
                String strValueOf = String.valueOf(str);
                b4VarJ.a(strValueOf.length() != 0 ? "Interrupted waiting for ".concat(strValueOf) : new String("Interrupted waiting for "));
                return null;
            }
        }
        T t = atomicReference.get();
        if (t == null) {
            b4 b4VarJ2 = m().J();
            String strValueOf2 = String.valueOf(str);
            b4VarJ2.a(strValueOf2.length() != 0 ? "Timed out waiting for ".concat(strValueOf2) : new String("Timed out waiting for "));
        }
        return t;
    }

    public final <V> Future<V> w(Callable<V> callable) {
        p();
        com.google.android.gms.common.internal.q.k(callable);
        b5<?> b5Var = new b5<>(this, (Callable<?>) callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f1615c) {
            if (!this.e.isEmpty()) {
                m().J().a("Callable skipped the worker queue.");
            }
            b5Var.run();
        } else {
            y(b5Var);
        }
        return b5Var;
    }

    public final void z(Runnable runnable) {
        p();
        com.google.android.gms.common.internal.q.k(runnable);
        y(new b5<>(this, runnable, false, "Task exception on worker thread"));
    }
}
