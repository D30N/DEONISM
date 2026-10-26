package d.b.a.a.h;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class k {

    private static final class a implements b {
        private final CountDownLatch a;

        private a() {
            this.a = new CountDownLatch(1);
        }

        /* synthetic */ a(d0 d0Var) {
            this();
        }

        public final void a() throws InterruptedException {
            this.a.await();
        }

        @Override // d.b.a.a.h.b
        public final void b() {
            this.a.countDown();
        }

        @Override // d.b.a.a.h.d
        public final void c(Exception exc) {
            this.a.countDown();
        }

        @Override // d.b.a.a.h.e
        public final void d(Object obj) {
            this.a.countDown();
        }

        public final boolean e(long j, TimeUnit timeUnit) {
            return this.a.await(j, timeUnit);
        }
    }

    interface b extends d.b.a.a.h.b, d, e<Object> {
    }

    public static <TResult> TResult a(h<TResult> hVar) throws InterruptedException {
        com.google.android.gms.common.internal.q.i();
        com.google.android.gms.common.internal.q.l(hVar, "Task must not be null");
        if (hVar.k()) {
            return (TResult) f(hVar);
        }
        a aVar = new a(null);
        e(hVar, aVar);
        aVar.a();
        return (TResult) f(hVar);
    }

    public static <TResult> TResult b(h<TResult> hVar, long j, TimeUnit timeUnit) throws TimeoutException {
        com.google.android.gms.common.internal.q.i();
        com.google.android.gms.common.internal.q.l(hVar, "Task must not be null");
        com.google.android.gms.common.internal.q.l(timeUnit, "TimeUnit must not be null");
        if (hVar.k()) {
            return (TResult) f(hVar);
        }
        a aVar = new a(null);
        e(hVar, aVar);
        if (aVar.e(j, timeUnit)) {
            return (TResult) f(hVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static <TResult> h<TResult> c(Executor executor, Callable<TResult> callable) {
        com.google.android.gms.common.internal.q.l(executor, "Executor must not be null");
        com.google.android.gms.common.internal.q.l(callable, "Callback must not be null");
        c0 c0Var = new c0();
        executor.execute(new d0(c0Var, callable));
        return c0Var;
    }

    public static <TResult> h<TResult> d(TResult tresult) {
        c0 c0Var = new c0();
        c0Var.o(tresult);
        return c0Var;
    }

    private static void e(h<?> hVar, b bVar) {
        hVar.d(j.a, bVar);
        hVar.c(j.a, bVar);
        hVar.a(j.a, bVar);
    }

    private static <TResult> TResult f(h<TResult> hVar) throws ExecutionException {
        if (hVar.l()) {
            return hVar.h();
        }
        if (hVar.j()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(hVar.g());
    }
}
