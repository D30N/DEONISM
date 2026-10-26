package d.b.a.a.h;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
final class v<TResult> implements z<TResult> {
    private final Executor a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f2949b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    private e<? super TResult> f2950c;

    public v(Executor executor, e<? super TResult> eVar) {
        this.a = executor;
        this.f2950c = eVar;
    }

    @Override // d.b.a.a.h.z
    public final void a(h<TResult> hVar) {
        if (hVar.l()) {
            synchronized (this.f2949b) {
                if (this.f2950c == null) {
                    return;
                }
                this.a.execute(new w(this, hVar));
            }
        }
    }
}
