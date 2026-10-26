package d.b.a.a.h;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
final class c0<TResult> extends h<TResult> {
    private final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final a0<TResult> f2925b = new a0<>();

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    private boolean f2926c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f2927d;

    @GuardedBy("mLock")
    private TResult e;

    @GuardedBy("mLock")
    private Exception f;

    c0() {
    }

    @GuardedBy("mLock")
    private final void s() {
        com.google.android.gms.common.internal.q.o(this.f2926c, "Task is not yet complete");
    }

    @GuardedBy("mLock")
    private final void t() {
        com.google.android.gms.common.internal.q.o(!this.f2926c, "Task is already complete");
    }

    @GuardedBy("mLock")
    private final void u() {
        if (this.f2927d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void v() {
        synchronized (this.a) {
            if (this.f2926c) {
                this.f2925b.a(this);
            }
        }
    }

    @Override // d.b.a.a.h.h
    public final h<TResult> a(Executor executor, b bVar) {
        this.f2925b.b(new p(executor, bVar));
        v();
        return this;
    }

    @Override // d.b.a.a.h.h
    public final h<TResult> b(Executor executor, c<TResult> cVar) {
        this.f2925b.b(new r(executor, cVar));
        v();
        return this;
    }

    @Override // d.b.a.a.h.h
    public final h<TResult> c(Executor executor, d dVar) {
        this.f2925b.b(new t(executor, dVar));
        v();
        return this;
    }

    @Override // d.b.a.a.h.h
    public final h<TResult> d(Executor executor, e<? super TResult> eVar) {
        this.f2925b.b(new v(executor, eVar));
        v();
        return this;
    }

    @Override // d.b.a.a.h.h
    public final <TContinuationResult> h<TContinuationResult> e(Executor executor, a<TResult, TContinuationResult> aVar) {
        c0 c0Var = new c0();
        this.f2925b.b(new l(executor, aVar, c0Var));
        v();
        return c0Var;
    }

    @Override // d.b.a.a.h.h
    public final <TContinuationResult> h<TContinuationResult> f(Executor executor, a<TResult, h<TContinuationResult>> aVar) {
        c0 c0Var = new c0();
        this.f2925b.b(new n(executor, aVar, c0Var));
        v();
        return c0Var;
    }

    @Override // d.b.a.a.h.h
    public final Exception g() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // d.b.a.a.h.h
    public final TResult h() {
        TResult tresult;
        synchronized (this.a) {
            s();
            u();
            if (this.f != null) {
                throw new f(this.f);
            }
            tresult = this.e;
        }
        return tresult;
    }

    @Override // d.b.a.a.h.h
    public final <X extends Throwable> TResult i(Class<X> cls) {
        TResult tresult;
        synchronized (this.a) {
            s();
            u();
            if (cls.isInstance(this.f)) {
                throw cls.cast(this.f);
            }
            if (this.f != null) {
                throw new f(this.f);
            }
            tresult = this.e;
        }
        return tresult;
    }

    @Override // d.b.a.a.h.h
    public final boolean j() {
        return this.f2927d;
    }

    @Override // d.b.a.a.h.h
    public final boolean k() {
        boolean z;
        synchronized (this.a) {
            z = this.f2926c;
        }
        return z;
    }

    @Override // d.b.a.a.h.h
    public final boolean l() {
        boolean z;
        synchronized (this.a) {
            z = this.f2926c && !this.f2927d && this.f == null;
        }
        return z;
    }

    @Override // d.b.a.a.h.h
    public final <TContinuationResult> h<TContinuationResult> m(Executor executor, g<TResult, TContinuationResult> gVar) {
        c0 c0Var = new c0();
        this.f2925b.b(new x(executor, gVar, c0Var));
        v();
        return c0Var;
    }

    public final void n(Exception exc) {
        com.google.android.gms.common.internal.q.l(exc, "Exception must not be null");
        synchronized (this.a) {
            t();
            this.f2926c = true;
            this.f = exc;
        }
        this.f2925b.a(this);
    }

    public final void o(TResult tresult) {
        synchronized (this.a) {
            t();
            this.f2926c = true;
            this.e = tresult;
        }
        this.f2925b.a(this);
    }

    public final boolean p(Exception exc) {
        com.google.android.gms.common.internal.q.l(exc, "Exception must not be null");
        synchronized (this.a) {
            if (this.f2926c) {
                return false;
            }
            this.f2926c = true;
            this.f = exc;
            this.f2925b.a(this);
            return true;
        }
    }

    public final boolean q(TResult tresult) {
        synchronized (this.a) {
            if (this.f2926c) {
                return false;
            }
            this.f2926c = true;
            this.e = tresult;
            this.f2925b.a(this);
            return true;
        }
    }

    public final boolean r() {
        synchronized (this.a) {
            if (this.f2926c) {
                return false;
            }
            this.f2926c = true;
            this.f2927d = true;
            this.f2925b.a(this);
            return true;
        }
    }
}
