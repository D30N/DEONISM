package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.iid.FirebaseInstanceId;
import d.b.b.f.b;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public class FirebaseInstanceId {
    private static final long i = TimeUnit.HOURS.toSeconds(8);
    private static b0 j;

    @GuardedBy("FirebaseInstanceId.class")
    private static ScheduledExecutorService k;
    private final Executor a;

    /* renamed from: b, reason: collision with root package name */
    private final d.b.b.c f2201b;

    /* renamed from: c, reason: collision with root package name */
    private final q f2202c;

    /* renamed from: d, reason: collision with root package name */
    private final e1 f2203d;
    private final v e;
    private final com.google.firebase.installations.h f;

    @GuardedBy("this")
    private boolean g;
    private final a h;

    /* JADX INFO: Access modifiers changed from: private */
    class a {
        private boolean a;

        /* renamed from: b, reason: collision with root package name */
        private final d.b.b.f.d f2204b;

        /* renamed from: c, reason: collision with root package name */
        @GuardedBy("this")
        private boolean f2205c;

        /* renamed from: d, reason: collision with root package name */
        @GuardedBy("this")
        private b<d.b.b.a> f2206d;

        @GuardedBy("this")
        private Boolean e;

        a(d.b.b.f.d dVar) {
            this.f2204b = dVar;
        }

        private final synchronized void b() {
            if (this.f2205c) {
                return;
            }
            this.a = d();
            Boolean boolC = c();
            this.e = boolC;
            if (boolC == null && this.a) {
                b<d.b.b.a> bVar = new b(this) { // from class: com.google.firebase.iid.b1
                    private final FirebaseInstanceId.a a;

                    {
                        this.a = this;
                    }

                    @Override // d.b.b.f.b
                    public final void a(d.b.b.f.a aVar) {
                        FirebaseInstanceId.a aVar2 = this.a;
                        synchronized (aVar2) {
                            if (aVar2.a()) {
                                FirebaseInstanceId.this.A();
                            }
                        }
                    }
                };
                this.f2206d = bVar;
                this.f2204b.a(d.b.b.a.class, bVar);
            }
            this.f2205c = true;
        }

        private final Boolean c() {
            ApplicationInfo applicationInfo;
            Context contextG = FirebaseInstanceId.this.f2201b.g();
            SharedPreferences sharedPreferences = contextG.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = contextG.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(contextG.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        private final boolean d() throws ClassNotFoundException {
            try {
                Class.forName("com.google.firebase.messaging.FirebaseMessaging");
                return true;
            } catch (ClassNotFoundException unused) {
                Context contextG = FirebaseInstanceId.this.f2201b.g();
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(contextG.getPackageName());
                ResolveInfo resolveInfoResolveService = contextG.getPackageManager().resolveService(intent, 0);
                return (resolveInfoResolveService == null || resolveInfoResolveService.serviceInfo == null) ? false : true;
            }
        }

        final synchronized boolean a() {
            b();
            if (this.e != null) {
                return this.e.booleanValue();
            }
            return this.a && FirebaseInstanceId.this.f2201b.p();
        }
    }

    private FirebaseInstanceId(d.b.b.c cVar, q qVar, Executor executor, Executor executor2, d.b.b.f.d dVar, d.b.b.j.h hVar, d.b.b.g.c cVar2, com.google.firebase.installations.h hVar2) {
        this.g = false;
        if (q.b(cVar) == null) {
            throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
        }
        synchronized (FirebaseInstanceId.class) {
            if (j == null) {
                j = new b0(cVar.g());
            }
        }
        this.f2201b = cVar;
        this.f2202c = qVar;
        this.f2203d = new e1(cVar, qVar, executor, hVar, cVar2, hVar2);
        this.a = executor2;
        this.h = new a(dVar);
        this.e = new v(executor);
        this.f = hVar2;
        executor2.execute(new Runnable(this) { // from class: com.google.firebase.iid.w0

            /* renamed from: b, reason: collision with root package name */
            private final FirebaseInstanceId f2268b;

            {
                this.f2268b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f2268b.z();
            }
        });
    }

    FirebaseInstanceId(d.b.b.c cVar, d.b.b.f.d dVar, d.b.b.j.h hVar, d.b.b.g.c cVar2, com.google.firebase.installations.h hVar2) {
        this(cVar, new q(cVar.g()), s0.b(), s0.b(), dVar, hVar, cVar2, hVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A() {
        if (q(r())) {
            B();
        }
    }

    private final synchronized void B() {
        if (!this.g) {
            l(0L);
        }
    }

    private final String C() throws InterruptedException {
        try {
            j.e(this.f2201b.k());
            d.b.a.a.h.h<String> id = this.f.getId();
            com.google.android.gms.common.internal.q.l(id, "Task must not be null");
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            id.b(y0.a, new d.b.a.a.h.c(countDownLatch) { // from class: com.google.firebase.iid.x0
                private final CountDownLatch a;

                {
                    this.a = countDownLatch;
                }

                @Override // d.b.a.a.h.c
                public final void a(d.b.a.a.h.h hVar) {
                    this.a.countDown();
                }
            });
            countDownLatch.await(30000L, TimeUnit.MILLISECONDS);
            if (id.l()) {
                return id.h();
            }
            if (id.j()) {
                throw new CancellationException("Task is already canceled");
            }
            throw new IllegalStateException(id.g());
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

    private final String D() {
        return "[DEFAULT]".equals(this.f2201b.i()) ? "" : this.f2201b.k();
    }

    public static FirebaseInstanceId b() {
        return getInstance(d.b.b.c.h());
    }

    private final d.b.a.a.h.h<com.google.firebase.iid.a> d(final String str, String str2) {
        final String strK = k(str2);
        return d.b.a.a.h.k.d(null).f(this.a, new d.b.a.a.h.a(this, str, strK) { // from class: com.google.firebase.iid.v0
            private final FirebaseInstanceId a;

            /* renamed from: b, reason: collision with root package name */
            private final String f2263b;

            /* renamed from: c, reason: collision with root package name */
            private final String f2264c;

            {
                this.a = this;
                this.f2263b = str;
                this.f2264c = strK;
            }

            @Override // d.b.a.a.h.a
            public final Object a(d.b.a.a.h.h hVar) {
                return this.a.e(this.f2263b, this.f2264c, hVar);
            }
        });
    }

    @Keep
    public static FirebaseInstanceId getInstance(d.b.b.c cVar) {
        return (FirebaseInstanceId) cVar.f(FirebaseInstanceId.class);
    }

    private final <T> T j(d.b.a.a.h.h<T> hVar) throws IOException {
        try {
            return (T) d.b.a.a.h.k.b(hVar, 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    w();
                }
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e);
        }
    }

    private static String k(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    private static void m(d.b.b.c cVar) {
        com.google.android.gms.common.internal.q.h(cVar.j().e(), "FirebaseApp has to define a valid projectId.");
        com.google.android.gms.common.internal.q.h(cVar.j().c(), "FirebaseApp has to define a valid applicationId.");
        com.google.android.gms.common.internal.q.h(cVar.j().b(), "FirebaseApp has to define a valid apiKey.");
    }

    static void n(Runnable runnable, long j2) {
        synchronized (FirebaseInstanceId.class) {
            if (k == null) {
                k = new ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.q.a("FirebaseInstanceId"));
            }
            k.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    private final a0 s(String str, String str2) {
        return j.a(D(), str, str2);
    }

    static boolean v() {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            return true;
        }
        return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3);
    }

    public String a() {
        m(this.f2201b);
        A();
        return C();
    }

    public String c(String str, String str2) throws IOException {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((com.google.firebase.iid.a) j(d(str, str2))).a();
        }
        throw new IOException("MAIN_THREAD");
    }

    final /* synthetic */ d.b.a.a.h.h e(final String str, final String str2, d.b.a.a.h.h hVar) throws InterruptedException {
        final String strC = C();
        a0 a0VarS = s(str, str2);
        return !q(a0VarS) ? d.b.a.a.h.k.d(new d(strC, a0VarS.a)) : this.e.b(str, str2, new x(this, strC, str, str2) { // from class: com.google.firebase.iid.a1
            private final FirebaseInstanceId a;

            /* renamed from: b, reason: collision with root package name */
            private final String f2211b;

            /* renamed from: c, reason: collision with root package name */
            private final String f2212c;

            /* renamed from: d, reason: collision with root package name */
            private final String f2213d;

            {
                this.a = this;
                this.f2211b = strC;
                this.f2212c = str;
                this.f2213d = str2;
            }

            @Override // com.google.firebase.iid.x
            public final d.b.a.a.h.h a() {
                return this.a.f(this.f2211b, this.f2212c, this.f2213d);
            }
        });
    }

    final /* synthetic */ d.b.a.a.h.h f(final String str, final String str2, final String str3) {
        return this.f2203d.a(str, str2, str3).m(this.a, new d.b.a.a.h.g(this, str2, str3, str) { // from class: com.google.firebase.iid.z0
            private final FirebaseInstanceId a;

            /* renamed from: b, reason: collision with root package name */
            private final String f2272b;

            /* renamed from: c, reason: collision with root package name */
            private final String f2273c;

            /* renamed from: d, reason: collision with root package name */
            private final String f2274d;

            {
                this.a = this;
                this.f2272b = str2;
                this.f2273c = str3;
                this.f2274d = str;
            }

            @Override // d.b.a.a.h.g
            public final d.b.a.a.h.h a(Object obj) {
                return this.a.g(this.f2272b, this.f2273c, this.f2274d, (String) obj);
            }
        });
    }

    final /* synthetic */ d.b.a.a.h.h g(String str, String str2, String str3, String str4) {
        j.d(D(), str, str2, str4, this.f2202c.e());
        return d.b.a.a.h.k.d(new d(str3, str4));
    }

    final d.b.b.c h() {
        return this.f2201b;
    }

    final synchronized void l(long j2) {
        n(new e0(this, Math.min(Math.max(30L, j2 << 1), i)), j2);
        this.g = true;
    }

    final synchronized void p(boolean z) {
        this.g = z;
    }

    final boolean q(a0 a0Var) {
        return a0Var == null || a0Var.c(this.f2202c.e());
    }

    final a0 r() {
        return s(q.b(this.f2201b), "*");
    }

    final String u() {
        return c(q.b(this.f2201b), "*");
    }

    final synchronized void w() {
        j.c();
        if (this.h.a()) {
            B();
        }
    }

    public final boolean x() {
        return this.f2202c.c();
    }

    final void y() {
        j.h(D());
        B();
    }

    final /* synthetic */ void z() {
        if (this.h.a()) {
            A();
        }
    }
}
