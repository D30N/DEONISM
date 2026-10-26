package com.facebook.imagepipeline.producers;

import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes.dex */
public abstract class b<T> implements k<T> {
    private boolean a = false;

    public static boolean e(int i) {
        return (i & 1) == 1;
    }

    public static boolean f(int i) {
        return !e(i);
    }

    public static int l(boolean z) {
        return z ? 1 : 0;
    }

    public static boolean m(int i, int i2) {
        return (i & i2) != 0;
    }

    public static boolean n(int i, int i2) {
        return (i & i2) == i2;
    }

    public static int o(int i, int i2) {
        return i & (i2 ^ (-1));
    }

    @Override // com.facebook.imagepipeline.producers.k
    public synchronized void a(Throwable th) {
        if (this.a) {
            return;
        }
        this.a = true;
        try {
            h(th);
        } catch (Exception e) {
            k(e);
        }
    }

    @Override // com.facebook.imagepipeline.producers.k
    public synchronized void b() {
        if (this.a) {
            return;
        }
        this.a = true;
        try {
            g();
        } catch (Exception e) {
            k(e);
        }
    }

    @Override // com.facebook.imagepipeline.producers.k
    public synchronized void c(float f) {
        if (this.a) {
            return;
        }
        try {
            j(f);
        } catch (Exception e) {
            k(e);
        }
    }

    @Override // com.facebook.imagepipeline.producers.k
    public synchronized void d(@Nullable T t, int i) {
        if (this.a) {
            return;
        }
        this.a = e(i);
        try {
            i(t, i);
        } catch (Exception e) {
            k(e);
        }
    }

    protected abstract void g();

    protected abstract void h(Throwable th);

    protected abstract void i(T t, int i);

    protected abstract void j(float f);

    protected void k(Exception exc) {
        d.a.b.e.a.z(getClass(), "unhandled exception", exc);
    }
}
