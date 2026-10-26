package d.b.a.a.h;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
final class p<TResult> implements z<TResult> {
    private final Executor a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f2938b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    private b f2939c;

    public p(Executor executor, b bVar) {
        this.a = executor;
        this.f2939c = bVar;
    }

    @Override // d.b.a.a.h.z
    public final void a(h hVar) {
        if (hVar.j()) {
            synchronized (this.f2938b) {
                if (this.f2939c == null) {
                    return;
                }
                this.a.execute(new q(this));
            }
        }
    }
}
