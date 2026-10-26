package d.b.a.a.h;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
final class t<TResult> implements z<TResult> {
    private final Executor a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f2945b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    private d f2946c;

    public t(Executor executor, d dVar) {
        this.a = executor;
        this.f2946c = dVar;
    }

    @Override // d.b.a.a.h.z
    public final void a(h<TResult> hVar) {
        if (hVar.l() || hVar.j()) {
            return;
        }
        synchronized (this.f2945b) {
            if (this.f2946c == null) {
                return;
            }
            this.a.execute(new u(this, hVar));
        }
    }
}
