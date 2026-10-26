package d.b.a.a.h;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class n<TResult, TContinuationResult> implements b, d, e<TContinuationResult>, z<TResult> {
    private final Executor a;

    /* renamed from: b, reason: collision with root package name */
    private final a<TResult, h<TContinuationResult>> f2934b;

    /* renamed from: c, reason: collision with root package name */
    private final c0<TContinuationResult> f2935c;

    public n(Executor executor, a<TResult, h<TContinuationResult>> aVar, c0<TContinuationResult> c0Var) {
        this.a = executor;
        this.f2934b = aVar;
        this.f2935c = c0Var;
    }

    @Override // d.b.a.a.h.z
    public final void a(h<TResult> hVar) {
        this.a.execute(new o(this, hVar));
    }

    @Override // d.b.a.a.h.b
    public final void b() {
        this.f2935c.r();
    }

    @Override // d.b.a.a.h.d
    public final void c(Exception exc) {
        this.f2935c.n(exc);
    }

    @Override // d.b.a.a.h.e
    public final void d(TContinuationResult tcontinuationresult) {
        this.f2935c.o(tcontinuationresult);
    }
}
