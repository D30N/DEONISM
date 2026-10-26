package d.a.e.e;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class m implements ThreadFactory {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2539b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f2540c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicInteger f2541d = new AtomicInteger(1);

    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f2542b;

        a(Runnable runnable) {
            this.f2542b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Process.setThreadPriority(m.this.a);
            } catch (Throwable unused) {
            }
            this.f2542b.run();
        }
    }

    public m(int i, String str, boolean z) {
        this.a = i;
        this.f2539b = str;
        this.f2540c = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str;
        a aVar = new a(runnable);
        if (this.f2540c) {
            str = this.f2539b + "-" + this.f2541d.getAndIncrement();
        } else {
            str = this.f2539b;
        }
        return new Thread(aVar, str);
    }
}
