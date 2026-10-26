package d.a.b.h;

import d.a.b.h.a;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class b<T> extends a<T> {
    private b(i<T> iVar, a.c cVar, @Nullable Throwable th) {
        super(iVar, cVar, th);
    }

    b(T t, h<T> hVar, a.c cVar, @Nullable Throwable th) {
        super(t, hVar, cVar, th);
    }

    @Override // d.a.b.h.a
    protected void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.f2385b) {
                    return;
                }
                d.a.b.e.a.y("DefaultCloseableReference", "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f2386c)), this.f2386c.f().getClass().getName());
                this.f2387d.b(this.f2386c, this.e);
                close();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // d.a.b.h.a
    /* renamed from: g */
    public a<T> clone() {
        d.a.b.d.i.i(t());
        return new b(this.f2386c, this.f2387d, this.e);
    }
}
