package d.b.a.a.h;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class l<TResult, TContinuationResult> implements z<TResult> {
    private final Executor a;

    /* renamed from: b, reason: collision with root package name */
    private final a<TResult, TContinuationResult> f2930b;

    /* renamed from: c, reason: collision with root package name */
    private final c0<TContinuationResult> f2931c;

    public l(Executor executor, a<TResult, TContinuationResult> aVar, c0<TContinuationResult> c0Var) {
        this.a = executor;
        this.f2930b = aVar;
        this.f2931c = c0Var;
    }

    @Override // d.b.a.a.h.z
    public final void a(h<TResult> hVar) {
        this.a.execute(new m(this, hVar));
    }
}
