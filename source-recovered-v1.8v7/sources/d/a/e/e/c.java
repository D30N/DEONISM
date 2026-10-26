package d.a.e.e;

import d.a.a.b.e;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class c implements g {
    private d a;

    public c(d dVar) {
        this.a = dVar;
    }

    public static d.a.a.b.e b(d.a.a.b.c cVar, d.a.a.b.d dVar) {
        return c(cVar, dVar, Executors.newSingleThreadExecutor());
    }

    public static d.a.a.b.e c(d.a.a.b.c cVar, d.a.a.b.d dVar, Executor executor) {
        return new d.a.a.b.e(dVar, cVar.h(), new e.c(cVar.k(), cVar.j(), cVar.f()), cVar.d(), cVar.c(), cVar.g(), cVar.e(), executor, cVar.i());
    }

    @Override // d.a.e.e.g
    public d.a.a.b.i a(d.a.a.b.c cVar) {
        return b(cVar, this.a.a(cVar));
    }
}
