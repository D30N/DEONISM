package d.b.a.a.h;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class d0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ c0 f2928b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Callable f2929c;

    d0(c0 c0Var, Callable callable) {
        this.f2928b = c0Var;
        this.f2929c = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f2928b.o(this.f2929c.call());
        } catch (Exception e) {
            this.f2928b.n(e);
        }
    }
}
