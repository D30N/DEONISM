package d.b.a.a.h;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class b0 implements Executor {
    b0() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
