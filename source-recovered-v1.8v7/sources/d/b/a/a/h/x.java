package d.b.a.a.h;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class x<TResult, TContinuationResult> implements b, d, e<TContinuationResult>, z<TResult> {
    private final Executor a;

    /* renamed from: b, reason: collision with root package name */
    private final g<TResult, TContinuationResult> f2953b;

    /* renamed from: c, reason: collision with root package name */
    private final c0<TContinuationResult> f2954c;

    public x(Executor executor, g<TResult, TContinuationResult> gVar, c0<TContinuationResult> c0Var) {
        this.a = executor;
        this.f2953b = gVar;
        this.f2954c = c0Var;
    }

    @Override // d.b.a.a.h.z
    public final void a(h<TResult> hVar) {
        this.a.execute(new y(this, hVar));
    }

    @Override // d.b.a.a.h.b
    public final void b() {
        this.f2954c.r();
    }

    @Override // d.b.a.a.h.d
    public final void c(Exception exc) {
        this.f2954c.n(exc);
    }

    @Override // d.b.a.a.h.e
    public final void d(TContinuationResult tcontinuationresult) {
        this.f2954c.o(tcontinuationresult);
    }
}
