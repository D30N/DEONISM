package d.b.a.a.a.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.q;
import d.b.a.a.c.f;
import d.b.a.a.c.g;
import d.b.a.a.e.a.d;
import d.b.a.a.e.a.e;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class a {

    @GuardedBy("this")
    private d.b.a.a.c.a a;

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    private d f2587b;

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("this")
    private boolean f2588c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f2589d = new Object();

    @GuardedBy("mAutoDisconnectTaskLock")
    private b e;

    @GuardedBy("this")
    private final Context f;
    private final boolean g;
    private final long h;

    /* renamed from: d.b.a.a.a.a.a$a, reason: collision with other inner class name */
    public static final class C0094a {
        private final String a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f2590b;

        public C0094a(String str, boolean z) {
            this.a = str;
            this.f2590b = z;
        }

        public final String a() {
            return this.a;
        }

        public final boolean b() {
            return this.f2590b;
        }

        public final String toString() {
            String str = this.a;
            boolean z = this.f2590b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    static class b extends Thread {

        /* renamed from: b, reason: collision with root package name */
        private WeakReference<a> f2591b;

        /* renamed from: c, reason: collision with root package name */
        private long f2592c;

        /* renamed from: d, reason: collision with root package name */
        CountDownLatch f2593d = new CountDownLatch(1);
        boolean e = false;

        public b(a aVar, long j) {
            this.f2591b = new WeakReference<>(aVar);
            this.f2592c = j;
            start();
        }

        private final void a() {
            a aVar = this.f2591b.get();
            if (aVar != null) {
                aVar.a();
                this.e = true;
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                if (this.f2593d.await(this.f2592c, TimeUnit.MILLISECONDS)) {
                    return;
                }
                a();
            } catch (InterruptedException unused) {
                a();
            }
        }
    }

    private a(Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        q.k(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f = context;
        this.f2588c = false;
        this.h = j;
        this.g = z2;
    }

    public static C0094a b(Context context) {
        c cVar = new c(context);
        boolean zA = cVar.a("gads:ad_id_app_context:enabled", false);
        float fB = cVar.b("gads:ad_id_app_context:ping_ratio", 0.0f);
        String strC = cVar.c("gads:ad_id_use_shared_preference:experiment_id", "");
        a aVar = new a(context, -1L, zA, cVar.a("gads:ad_id_use_persistent_service:enabled", false));
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aVar.h(false);
            C0094a c0094aC = aVar.c();
            aVar.i(c0094aC, zA, fB, SystemClock.elapsedRealtime() - jElapsedRealtime, strC, null);
            return c0094aC;
        } finally {
        }
    }

    public static void d(boolean z) {
    }

    private static d.b.a.a.c.a e(Context context, boolean z) throws g, PackageManager.NameNotFoundException, IOException {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int iH = f.f().h(context, 12451000);
            if (iH != 0 && iH != 2) {
                throw new IOException("Google Play services not available");
            }
            String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
            d.b.a.a.c.a aVar = new d.b.a.a.c.a();
            Intent intent = new Intent(str);
            intent.setPackage("com.google.android.gms");
            try {
                if (com.google.android.gms.common.stats.a.b().a(context, intent, aVar, 1)) {
                    return aVar;
                }
                throw new IOException("Connection failure");
            } catch (Throwable th) {
                throw new IOException(th);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new g(9);
        }
    }

    private static d f(Context context, d.b.a.a.c.a aVar) throws IOException {
        try {
            return e.e(aVar.a(10000L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException unused) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    private final void g() {
        synchronized (this.f2589d) {
            if (this.e != null) {
                this.e.f2593d.countDown();
                try {
                    this.e.join();
                } catch (InterruptedException unused) {
                }
            }
            if (this.h > 0) {
                this.e = new b(this, this.h);
            }
        }
    }

    private final void h(boolean z) {
        q.j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f2588c) {
                a();
            }
            d.b.a.a.c.a aVarE = e(this.f, this.g);
            this.a = aVarE;
            this.f2587b = f(this.f, aVarE);
            this.f2588c = true;
            if (z) {
                g();
            }
        }
    }

    private final boolean i(C0094a c0094a, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > f) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("app_context", z ? "1" : "0");
        if (c0094a != null) {
            map.put("limit_ad_tracking", c0094a.b() ? "1" : "0");
        }
        if (c0094a != null && c0094a.a() != null) {
            map.put("ad_id_size", Integer.toString(c0094a.a().length()));
        }
        if (th != null) {
            map.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            map.put("experiment_id", str);
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j));
        new d.b.a.a.a.a.b(this, map).start();
        return true;
    }

    public final void a() {
        q.j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f == null || this.a == null) {
                return;
            }
            try {
                if (this.f2588c) {
                    com.google.android.gms.common.stats.a.b().c(this.f, this.a);
                }
            } catch (Throwable th) {
                Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
            }
            this.f2588c = false;
            this.f2587b = null;
            this.a = null;
        }
    }

    public C0094a c() {
        C0094a c0094a;
        q.j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f2588c) {
                q.k(this.a);
                q.k(this.f2587b);
                c0094a = new C0094a(this.f2587b.getId(), this.f2587b.s(true));
            } else {
                synchronized (this.f2589d) {
                    if (this.e == null || !this.e.e) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    h(false);
                    if (!this.f2588c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                    q.k(this.a);
                    q.k(this.f2587b);
                    try {
                        c0094a = new C0094a(this.f2587b.getId(), this.f2587b.s(true));
                    } catch (RemoteException e) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                        throw new IOException("Remote exception");
                    }
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
        }
        g();
        return c0094a;
    }

    protected void finalize() throws Throwable {
        a();
        super.finalize();
    }
}
