package d.b.a.a.e.e;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class j2 implements p1 {
    private static final Map<String, j2> f = new b.d.a();
    private final SharedPreferences a;

    /* renamed from: d, reason: collision with root package name */
    private volatile Map<String, ?> f2727d;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences.OnSharedPreferenceChangeListener f2725b = new SharedPreferences.OnSharedPreferenceChangeListener(this) { // from class: d.b.a.a.e.e.i2
        private final j2 a;

        {
            this.a = this;
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            this.a.c(sharedPreferences, str);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private final Object f2726c = new Object();
    private final List<q1> e = new ArrayList();

    private j2(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this.f2725b);
    }

    static j2 a(Context context, String str) {
        j2 j2Var;
        if (!((!m1.a() || str.startsWith("direct_boot:")) ? true : m1.b(context))) {
            return null;
        }
        synchronized (j2.class) {
            j2Var = f.get(str);
            if (j2Var == null) {
                j2Var = new j2(d(context, str));
                f.put(str, j2Var);
            }
        }
        return j2Var;
    }

    static synchronized void b() {
        for (j2 j2Var : f.values()) {
            j2Var.a.unregisterOnSharedPreferenceChangeListener(j2Var.f2725b);
        }
        f.clear();
    }

    private static SharedPreferences d(Context context, String str) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (!str.startsWith("direct_boot:")) {
                return context.getSharedPreferences(str, 0);
            }
            if (m1.a()) {
                context = context.createDeviceProtectedStorageContext();
            }
            return context.getSharedPreferences(str.substring(12), 0);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    final /* synthetic */ void c(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f2726c) {
            this.f2727d = null;
            z1.g();
        }
        synchronized (this) {
            Iterator<q1> it = this.e.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    @Override // d.b.a.a.e.e.p1
    public final Object g(String str) {
        Map<String, ?> map = this.f2727d;
        if (map == null) {
            synchronized (this.f2726c) {
                map = this.f2727d;
                if (map == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        Map<String, ?> all = this.a.getAll();
                        this.f2727d = all;
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        map = all;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th;
                    }
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
