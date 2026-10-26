package d.b.b;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.internal.a;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.util.m;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.f;
import com.google.firebase.components.h;
import com.google.firebase.components.l;
import com.google.firebase.components.s;
import d.b.b.j.g;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public class c {
    private static final Object i = new Object();
    private static final Executor j = new d();

    @GuardedBy("LOCK")
    static final Map<String, c> k = new b.d.a();
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3026b;

    /* renamed from: c, reason: collision with root package name */
    private final d.b.b.e f3027c;

    /* renamed from: d, reason: collision with root package name */
    private final l f3028d;
    private final s<d.b.b.i.a> g;
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final AtomicBoolean f = new AtomicBoolean();
    private final List<b> h = new CopyOnWriteArrayList();

    public interface b {
        void a(boolean z);
    }

    @TargetApi(14)
    /* renamed from: d.b.b.c$c, reason: collision with other inner class name */
    private static class C0104c implements a.InterfaceC0063a {
        private static AtomicReference<C0104c> a = new AtomicReference<>();

        private C0104c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Context context) {
            if (com.google.android.gms.common.util.l.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (a.get() == null) {
                    C0104c c0104c = new C0104c();
                    if (a.compareAndSet(null, c0104c)) {
                        com.google.android.gms.common.api.internal.a.c(application);
                        com.google.android.gms.common.api.internal.a.b().a(c0104c);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.a.InterfaceC0063a
        public void a(boolean z) {
            synchronized (c.i) {
                Iterator it = new ArrayList(c.k.values()).iterator();
                while (it.hasNext()) {
                    c cVar = (c) it.next();
                    if (cVar.e.get()) {
                        cVar.t(z);
                    }
                }
            }
        }
    }

    private static class d implements Executor {
        private static final Handler a = new Handler(Looper.getMainLooper());

        private d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.post(runnable);
        }
    }

    @TargetApi(24)
    private static class e extends BroadcastReceiver {

        /* renamed from: b, reason: collision with root package name */
        private static AtomicReference<e> f3029b = new AtomicReference<>();
        private final Context a;

        public e(Context context) {
            this.a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (f3029b.get() == null) {
                e eVar = new e(context);
                if (f3029b.compareAndSet(null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (c.i) {
                Iterator<c> it = c.k.values().iterator();
                while (it.hasNext()) {
                    it.next().l();
                }
            }
            c();
        }
    }

    protected c(Context context, String str, d.b.b.e eVar) {
        new CopyOnWriteArrayList();
        q.k(context);
        this.a = context;
        q.g(str);
        this.f3026b = str;
        q.k(eVar);
        this.f3027c = eVar;
        List<h> listA = f.b(context, ComponentDiscoveryService.class).a();
        String strA = d.b.b.j.e.a();
        Executor executor = j;
        com.google.firebase.components.d[] dVarArr = new com.google.firebase.components.d[8];
        dVarArr[0] = com.google.firebase.components.d.n(context, Context.class, new Class[0]);
        dVarArr[1] = com.google.firebase.components.d.n(this, c.class, new Class[0]);
        dVarArr[2] = com.google.firebase.components.d.n(eVar, d.b.b.e.class, new Class[0]);
        dVarArr[3] = g.a("fire-android", "");
        dVarArr[4] = g.a("fire-core", "19.3.0");
        dVarArr[5] = strA != null ? g.a("kotlin", strA) : null;
        dVarArr[6] = d.b.b.j.c.b();
        dVarArr[7] = d.b.b.g.b.b();
        this.f3028d = new l(executor, listA, dVarArr);
        this.g = new s<>(d.b.b.b.a(this, context));
    }

    private void e() {
        q.o(!this.f.get(), "FirebaseApp was deleted");
    }

    public static c h() {
        c cVar;
        synchronized (i) {
            cVar = k.get("[DEFAULT]");
            if (cVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + m.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (!b.g.h.b.a(this.a)) {
            e.b(this.a);
        } else {
            this.f3028d.e(q());
        }
    }

    public static c m(Context context) {
        synchronized (i) {
            if (k.containsKey("[DEFAULT]")) {
                return h();
            }
            d.b.b.e eVarA = d.b.b.e.a(context);
            if (eVarA == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return n(context, eVarA);
        }
    }

    public static c n(Context context, d.b.b.e eVar) {
        return o(context, eVar, "[DEFAULT]");
    }

    public static c o(Context context, d.b.b.e eVar, String str) {
        c cVar;
        C0104c.c(context);
        String strS = s(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (i) {
            q.o(!k.containsKey(strS), "FirebaseApp name " + strS + " already exists!");
            q.l(context, "Application context cannot be null.");
            cVar = new c(context, strS, eVar);
            k.put(strS, cVar);
        }
        cVar.l();
        return cVar;
    }

    static /* synthetic */ d.b.b.i.a r(c cVar, Context context) {
        return new d.b.b.i.a(context, cVar.k(), (d.b.b.f.c) cVar.f3028d.a(d.b.b.f.c.class));
    }

    private static String s(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator<b> it = this.h.iterator();
        while (it.hasNext()) {
            it.next().a(z);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f3026b.equals(((c) obj).i());
        }
        return false;
    }

    public <T> T f(Class<T> cls) {
        e();
        return (T) this.f3028d.a(cls);
    }

    public Context g() {
        e();
        return this.a;
    }

    public int hashCode() {
        return this.f3026b.hashCode();
    }

    public String i() {
        e();
        return this.f3026b;
    }

    public d.b.b.e j() {
        e();
        return this.f3027c;
    }

    public String k() {
        return com.google.android.gms.common.util.c.a(i().getBytes(Charset.defaultCharset())) + "+" + com.google.android.gms.common.util.c.a(j().c().getBytes(Charset.defaultCharset()));
    }

    public boolean p() {
        e();
        return this.g.get().b();
    }

    public boolean q() {
        return "[DEFAULT]".equals(i());
    }

    public String toString() {
        p.a aVarC = p.c(this);
        aVarC.a("name", this.f3026b);
        aVarC.a("options", this.f3027c);
        return aVarC.toString();
    }
}
