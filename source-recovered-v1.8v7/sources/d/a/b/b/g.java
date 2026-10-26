package d.a.b.b;

import android.os.Handler;
import android.os.Looper;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class g extends d {

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private static g f2368b;

    private g() {
        super(new Handler(Looper.getMainLooper()));
    }

    public static g g() {
        if (f2368b == null) {
            f2368b = new g();
        }
        return f2368b;
    }

    @Override // d.a.b.b.d, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (a()) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
