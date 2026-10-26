package d.a.b.h;

import d.a.b.h.a;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class c<T> extends a<T> {
    c(T t, h<T> hVar, a.c cVar, @Nullable Throwable th) {
        super(t, hVar, cVar, th);
    }

    @Override // d.a.b.h.a
    public /* bridge */ /* synthetic */ Object clone() {
        clone();
        return this;
    }

    @Override // d.a.b.h.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // d.a.b.h.a
    protected void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.f2385b) {
                    return;
                }
                d.a.b.e.a.y("FinalizerCloseableReference", "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f2386c)), this.f2386c.f().getClass().getName());
                this.f2386c.d();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // d.a.b.h.a
    /* renamed from: g */
    public a<T> clone() {
        return this;
    }
}
