package d.b.a.a.h;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
final class r<TResult> implements z<TResult> {
    private final Executor a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f2941b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    private c<TResult> f2942c;

    public r(Executor executor, c<TResult> cVar) {
        this.a = executor;
        this.f2942c = cVar;
    }

    @Override // d.b.a.a.h.z
    public final void a(h<TResult> hVar) {
        synchronized (this.f2941b) {
            if (this.f2942c == null) {
                return;
            }
            this.a.execute(new s(this, hVar));
        }
    }
}
