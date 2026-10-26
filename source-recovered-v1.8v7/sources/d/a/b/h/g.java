package d.a.b.h;

import d.a.b.h.a;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class g<T> extends a<T> {
    private g(i<T> iVar, a.c cVar, @Nullable Throwable th) {
        super(iVar, cVar, th);
    }

    g(T t, h<T> hVar, a.c cVar, @Nullable Throwable th) {
        super(t, hVar, cVar, th);
    }

    @Override // d.a.b.h.a
    /* renamed from: g */
    public a<T> clone() {
        d.a.b.d.i.i(t());
        return new g(this.f2386c, this.f2387d, this.e);
    }
}
