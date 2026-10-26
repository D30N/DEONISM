package d.a.e.f;

import com.facebook.datasource.c;
import com.facebook.imagepipeline.producers.l0;
import com.facebook.imagepipeline.producers.s0;
import d.a.e.k.d;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes.dex */
public class b<T> extends a<d.a.b.h.a<T>> {
    private b(l0<d.a.b.h.a<T>> l0Var, s0 s0Var, d dVar) {
        super(l0Var, s0Var, dVar);
    }

    public static <T> c<d.a.b.h.a<T>> C(l0<d.a.b.h.a<T>> l0Var, s0 s0Var, d dVar) {
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.a("CloseableProducerToDataSourceAdapter#create");
        }
        b bVar = new b(l0Var, s0Var, dVar);
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.b();
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.datasource.a
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public void h(d.a.b.h.a<T> aVar) {
        d.a.b.h.a.o(aVar);
    }

    @Override // com.facebook.datasource.a, com.facebook.datasource.c
    @Nullable
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public d.a.b.h.a<T> b() {
        return d.a.b.h.a.k((d.a.b.h.a) super.b());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // d.a.e.f.a
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void A(d.a.b.h.a<T> aVar, int i) {
        super.A(d.a.b.h.a.k(aVar), i);
    }
}
