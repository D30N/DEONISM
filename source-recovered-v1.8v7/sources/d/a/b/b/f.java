package d.a.b.b;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class f<T> implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    protected final AtomicInteger f2367b = new AtomicInteger(0);

    public void a() {
        if (this.f2367b.compareAndSet(0, 2)) {
            d();
        }
    }

    protected abstract void b(T t);

    protected abstract T c();

    protected abstract void d();

    protected abstract void e(Exception exc);

    protected abstract void f(T t);

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f2367b.compareAndSet(0, 1)) {
            try {
                T tC = c();
                this.f2367b.set(3);
                try {
                    f(tC);
                } finally {
                    b(tC);
                }
            } catch (Exception e) {
                this.f2367b.set(4);
                e(e);
            }
        }
    }
}
