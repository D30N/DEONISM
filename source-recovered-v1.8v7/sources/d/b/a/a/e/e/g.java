package d.b.a.a.e.e;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class g {
    private static volatile g i = null;
    private static Boolean j = null;
    private static String k = "allow_remote_dynamite";
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    protected final com.google.android.gms.common.util.e f2684b;

    /* renamed from: c, reason: collision with root package name */
    private final ExecutorService f2685c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.measurement.a.a f2686d;
    private List<Pair<com.google.android.gms.measurement.internal.h6, Object>> e;
    private int f;
    private boolean g;
    private dd h;

    abstract class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final long f2687b;

        /* renamed from: c, reason: collision with root package name */
        final long f2688c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f2689d;

        a(g gVar) {
            this(true);
        }

        a(boolean z) {
            this.f2687b = g.this.f2684b.a();
            this.f2688c = g.this.f2684b.b();
            this.f2689d = z;
        }

        abstract void a();

        protected void b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g.this.g) {
                b();
                return;
            }
            try {
                a();
            } catch (Exception e) {
                g.this.n(e, false, this.f2689d);
                b();
            }
        }
    }

    class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            g.this.k(new c0(this, activity, bundle));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            g.this.k(new h0(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            g.this.k(new d0(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            g.this.k(new e0(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            bd bdVar = new bd();
            g.this.k(new f0(this, activity, bdVar));
            Bundle bundleU = bdVar.U(50L);
            if (bundleU != null) {
                bundle.putAll(bundleU);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            g.this.k(new b0(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            g.this.k(new g0(this, activity));
        }
    }

    private g(Context context, String str, String str2, String str3, Bundle bundle) {
        this.a = (str == null || !D(str2, str3)) ? "FA" : str;
        this.f2684b = com.google.android.gms.common.util.h.d();
        this.f2685c = d7.a().a(new n(this), ad.a);
        this.f2686d = new com.google.android.gms.measurement.a.a(this);
        if (!(!I(context) || P())) {
            this.g = true;
            Log.w(this.a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (!D(str2, str3)) {
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null)) {
                    Log.w(this.a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.a, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            }
        }
        k(new j(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean D(String str, String str2) {
        return (str2 == null || str == null || P()) ? false : true;
    }

    private static boolean I(Context context) {
        return new com.google.android.gms.common.internal.u(context).a("google_app_id") != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int J(Context context) {
        return DynamiteModule.b(context, ModuleDescriptor.MODULE_ID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int L(Context context) {
        return DynamiteModule.a(context, ModuleDescriptor.MODULE_ID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void N(Context context) {
        synchronized (g.class) {
            try {
            } catch (Exception e) {
                Log.e("FA", "Exception reading flag from SharedPreferences.", e);
                j = Boolean.FALSE;
            }
            if (j != null) {
                return;
            }
            if (q(context, "app_measurement_internal_disable_startup_flags")) {
                j = Boolean.FALSE;
                return;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
            j = Boolean.valueOf(sharedPreferences.getBoolean(k, false));
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.remove(k);
            editorEdit.apply();
        }
    }

    private static boolean P() throws ClassNotFoundException {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static g a(Context context) {
        return b(context, null, null, null, null);
    }

    public static g b(Context context, String str, String str2, String str3, Bundle bundle) {
        com.google.android.gms.common.internal.q.k(context);
        if (i == null) {
            synchronized (g.class) {
                if (i == null) {
                    i = new g(context, str, str2, str3, bundle);
                }
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(a aVar) {
        this.f2685c.execute(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(Exception exc, boolean z, boolean z2) {
        this.g |= z;
        if (z) {
            Log.w(this.a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            h(5, "Error with data collection. Data lost.", exc, null, null);
        }
        Log.w(this.a, "Error with data collection. Data lost.", exc);
    }

    private final void p(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        k(new a0(this, l, str, str2, bundle, z, z2));
    }

    private static boolean q(Context context, String str) {
        com.google.android.gms.common.internal.q.g(str);
        try {
            ApplicationInfo applicationInfoC = d.b.a.a.c.n.c.a(context).c(context.getPackageName(), 128);
            if (applicationInfoC != null && applicationInfoC.metaData != null) {
                return applicationInfoC.metaData.getBoolean(str);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public final String B() {
        bd bdVar = new bd();
        k(new p(this, bdVar));
        return bdVar.h(500L);
    }

    public final void C(String str) {
        k(new q(this, str));
    }

    public final int F(String str) {
        bd bdVar = new bd();
        k(new y(this, str, bdVar));
        Integer num = (Integer) bd.g(bdVar.U(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final String G() {
        bd bdVar = new bd();
        k(new s(this, bdVar));
        return bdVar.h(50L);
    }

    public final long H() {
        bd bdVar = new bd();
        k(new r(this, bdVar));
        Long l = (Long) bd.g(bdVar.U(500L), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ this.f2684b.a()).nextLong();
        int i2 = this.f + 1;
        this.f = i2;
        return jNextLong + i2;
    }

    public final String K() {
        bd bdVar = new bd();
        k(new u(this, bdVar));
        return bdVar.h(500L);
    }

    public final String M() {
        bd bdVar = new bd();
        k(new t(this, bdVar));
        return bdVar.h(500L);
    }

    protected final dd c(Context context, boolean z) {
        try {
            return cd.asInterface(DynamiteModule.d(context, z ? DynamiteModule.k : DynamiteModule.i, ModuleDescriptor.MODULE_ID).c("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.a e) {
            n(e, true, false);
            return null;
        }
    }

    public final com.google.android.gms.measurement.a.a e() {
        return this.f2686d;
    }

    public final Map<String, Object> g(String str, String str2, boolean z) {
        bd bdVar = new bd();
        k(new x(this, str, str2, z, bdVar));
        Bundle bundleU = bdVar.U(5000L);
        if (bundleU == null || bundleU.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap(bundleU.size());
        for (String str3 : bundleU.keySet()) {
            Object obj = bundleU.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final void h(int i2, String str, Object obj, Object obj2, Object obj3) {
        k(new w(this, false, 5, str, obj, null, null));
    }

    public final void i(Activity activity, String str, String str2) {
        k(new m(this, activity, str, str2));
    }

    public final void j(Bundle bundle) {
        k(new i(this, bundle));
    }

    public final void o(String str, String str2, Bundle bundle) {
        p(str, str2, bundle, true, true, null);
    }

    public final List<Bundle> u(String str, String str2) {
        bd bdVar = new bd();
        k(new k(this, str, str2, bdVar));
        List<Bundle> list = (List) bd.g(bdVar.U(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final void w(String str) {
        k(new o(this, str));
    }

    public final void x(String str, String str2, Bundle bundle) {
        k(new l(this, str, str2, bundle));
    }

    public final void y(boolean z) {
        k(new z(this, z));
    }
}
