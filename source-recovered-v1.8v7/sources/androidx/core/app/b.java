package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes.dex */
final class b {
    private static final Handler g = new Handler(Looper.getMainLooper());
    protected static final Class<?> a = a();

    /* renamed from: b, reason: collision with root package name */
    protected static final Field f373b = b();

    /* renamed from: c, reason: collision with root package name */
    protected static final Field f374c = f();

    /* renamed from: d, reason: collision with root package name */
    protected static final Method f375d = d(a);
    protected static final Method e = c(a);
    protected static final Method f = e(a);

    static class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f376b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f377c;

        a(d dVar, Object obj) {
            this.f376b = dVar;
            this.f377c = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f376b.f382b = this.f377c;
        }
    }

    /* renamed from: androidx.core.app.b$b, reason: collision with other inner class name */
    static class RunnableC0008b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Application f378b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f379c;

        RunnableC0008b(Application application, d dVar) {
            this.f378b = application;
            this.f379c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f378b.unregisterActivityLifecycleCallbacks(this.f379c);
        }
    }

    static class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f380b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f381c;

        c(Object obj, Object obj2) {
            this.f380b = obj;
            this.f381c = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (b.f375d != null) {
                    b.f375d.invoke(this.f380b, this.f381c, Boolean.FALSE, "AppCompat recreation");
                } else {
                    b.e.invoke(this.f380b, this.f381c, Boolean.FALSE);
                }
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    private static final class d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: b, reason: collision with root package name */
        Object f382b;

        /* renamed from: c, reason: collision with root package name */
        private Activity f383c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f384d = false;
        private boolean e = false;
        private boolean f = false;

        d(Activity activity) {
            this.f383c = activity;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f383c == activity) {
                this.f383c = null;
                this.e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.e || this.f || this.f384d || !b.h(this.f382b, activity)) {
                return;
            }
            this.f = true;
            this.f382b = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f383c == activity) {
                this.f384d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, Boolean.TYPE, Configuration.class, Configuration.class, Boolean.TYPE, Boolean.TYPE);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    protected static boolean h(Object obj, Activity activity) {
        try {
            Object obj2 = f374c.get(activity);
            if (obj2 != obj) {
                return false;
            }
            g.postAtFrontOfQueue(new c(f373b.get(activity), obj2));
            return true;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f == null) {
            return false;
        }
        if (e == null && f375d == null) {
            return false;
        }
        try {
            Object obj2 = f374c.get(activity);
            if (obj2 == null || (obj = f373b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            d dVar = new d(activity);
            application.registerActivityLifecycleCallbacks(dVar);
            g.post(new a(dVar, obj2));
            try {
                if (g()) {
                    f.invoke(obj, obj2, null, null, 0, Boolean.FALSE, null, null, Boolean.FALSE, Boolean.FALSE);
                } else {
                    activity.recreate();
                }
                return true;
            } finally {
                g.post(new RunnableC0008b(application, dVar));
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
