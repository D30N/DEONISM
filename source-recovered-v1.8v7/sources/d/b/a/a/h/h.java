package d.b.a.a.h;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class h<TResult> {
    public h<TResult> a(Executor executor, b bVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public h<TResult> b(Executor executor, c<TResult> cVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract h<TResult> c(Executor executor, d dVar);

    public abstract h<TResult> d(Executor executor, e<? super TResult> eVar);

    public <TContinuationResult> h<TContinuationResult> e(Executor executor, a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> h<TContinuationResult> f(Executor executor, a<TResult, h<TContinuationResult>> aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception g();

    public abstract TResult h();

    public abstract <X extends Throwable> TResult i(Class<X> cls);

    public abstract boolean j();

    public abstract boolean k();

    public abstract boolean l();

    public <TContinuationResult> h<TContinuationResult> m(Executor executor, g<TResult, TContinuationResult> gVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
