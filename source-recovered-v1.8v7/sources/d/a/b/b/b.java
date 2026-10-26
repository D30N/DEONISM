package d.a.b.b;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class b extends AbstractExecutorService {
    private static final Class<?> h = b.class;
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f2362b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f2363c;

    /* renamed from: d, reason: collision with root package name */
    private final BlockingQueue<Runnable> f2364d;
    private final RunnableC0083b e;
    private final AtomicInteger f;
    private final AtomicInteger g;

    /* renamed from: d.a.b.b.b$b, reason: collision with other inner class name */
    private class RunnableC0083b implements Runnable {
        private RunnableC0083b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Runnable runnable = (Runnable) b.this.f2364d.poll();
                if (runnable != null) {
                    runnable.run();
                } else {
                    d.a.b.e.a.o(b.h, "%s: Worker has nothing to run", b.this.a);
                }
                int iDecrementAndGet = b.this.f.decrementAndGet();
                if (b.this.f2364d.isEmpty()) {
                    d.a.b.e.a.p(b.h, "%s: worker finished; %d workers left", b.this.a, Integer.valueOf(iDecrementAndGet));
                } else {
                    b.this.f();
                }
            } catch (Throwable th) {
                int iDecrementAndGet2 = b.this.f.decrementAndGet();
                if (b.this.f2364d.isEmpty()) {
                    d.a.b.e.a.p(b.h, "%s: worker finished; %d workers left", b.this.a, Integer.valueOf(iDecrementAndGet2));
                } else {
                    b.this.f();
                }
                throw th;
            }
        }
    }

    public b(String str, int i, Executor executor, BlockingQueue<Runnable> blockingQueue) {
        if (i <= 0) {
            throw new IllegalArgumentException("max concurrency must be > 0");
        }
        this.a = str;
        this.f2362b = executor;
        this.f2363c = i;
        this.f2364d = blockingQueue;
        this.e = new RunnableC0083b();
        this.f = new AtomicInteger(0);
        this.g = new AtomicInteger(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        while (true) {
            int i = this.f.get();
            if (i >= this.f2363c) {
                return;
            }
            int i2 = i + 1;
            if (this.f.compareAndSet(i, i2)) {
                d.a.b.e.a.q(h, "%s: starting worker %d of %d", this.a, Integer.valueOf(i2), Integer.valueOf(this.f2363c));
                this.f2362b.execute(this.e);
                return;
            }
            d.a.b.e.a.o(h, "%s: race in startWorkerIfNeeded; retrying", this.a);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("runnable parameter is null");
        }
        if (!this.f2364d.offer(runnable)) {
            throw new RejectedExecutionException(this.a + " queue is full, size=" + this.f2364d.size());
        }
        int size = this.f2364d.size();
        int i = this.g.get();
        if (size > i && this.g.compareAndSet(i, size)) {
            d.a.b.e.a.p(h, "%s: max pending work in queue = %d", this.a, Integer.valueOf(size));
        }
        f();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
