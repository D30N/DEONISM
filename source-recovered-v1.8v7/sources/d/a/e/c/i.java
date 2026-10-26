package d.a.e.c;

import android.app.ActivityManager;
import android.os.Build;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class i implements d.a.b.d.k<q> {

    /* renamed from: b, reason: collision with root package name */
    private static final long f2496b = TimeUnit.MINUTES.toMillis(5);
    private final ActivityManager a;

    public i(ActivityManager activityManager) {
        this.a = activityManager;
    }

    private int b() {
        int iMin = Math.min(this.a.getMemoryClass() * 1048576, Integer.MAX_VALUE);
        if (iMin < 33554432) {
            return 4194304;
        }
        if (iMin < 67108864) {
            return 6291456;
        }
        if (Build.VERSION.SDK_INT < 11) {
            return 8388608;
        }
        return iMin / 4;
    }

    @Override // d.a.b.d.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public q get() {
        return new q(b(), 256, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, f2496b);
    }
}
