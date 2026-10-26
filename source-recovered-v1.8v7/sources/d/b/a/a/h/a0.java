package d.b.a.a.h;

import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
final class a0<TResult> {
    private final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("mLock")
    private Queue<z<TResult>> f2923b;

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    private boolean f2924c;

    a0() {
    }

    public final void a(h<TResult> hVar) {
        z<TResult> zVarPoll;
        synchronized (this.a) {
            if (this.f2923b != null && !this.f2924c) {
                this.f2924c = true;
                while (true) {
                    synchronized (this.a) {
                        zVarPoll = this.f2923b.poll();
                        if (zVarPoll == null) {
                            this.f2924c = false;
                            return;
                        }
                    }
                    zVarPoll.a(hVar);
                }
            }
        }
    }

    public final void b(z<TResult> zVar) {
        synchronized (this.a) {
            if (this.f2923b == null) {
                this.f2923b = new ArrayDeque();
            }
            this.f2923b.add(zVar);
        }
    }
}
