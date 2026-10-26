package c;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
final class b {

    /* renamed from: c, reason: collision with root package name */
    private static final b f1058c = new b();
    private final ExecutorService a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f1059b;

    /* renamed from: c.b$b, reason: collision with other inner class name */
    private static class ExecutorC0046b implements Executor {
        private ThreadLocal<Integer> a;

        private ExecutorC0046b() {
            this.a = new ThreadLocal<>();
        }

        private int a() {
            Integer num = this.a.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() - 1;
            ThreadLocal<Integer> threadLocal = this.a;
            if (iIntValue == 0) {
                threadLocal.remove();
            } else {
                threadLocal.set(Integer.valueOf(iIntValue));
            }
            return iIntValue;
        }

        private int b() {
            Integer num = this.a.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() + 1;
            this.a.set(Integer.valueOf(iIntValue));
            return iIntValue;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                if (b() <= 15) {
                    runnable.run();
                } else {
                    b.a().execute(runnable);
                }
            } finally {
                a();
            }
        }
    }

    private b() {
        this.a = !c() ? Executors.newCachedThreadPool() : c.a.b();
        Executors.newSingleThreadScheduledExecutor();
        this.f1059b = new ExecutorC0046b();
    }

    public static ExecutorService a() {
        return f1058c.a;
    }

    static Executor b() {
        return f1058c.f1059b;
    }

    private static boolean c() {
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains("android");
    }
}
