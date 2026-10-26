package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public abstract class b<T extends IInterface> {
    private static final d.b.a.a.c.d[] v = new d.b.a.a.c.d[0];
    private h0 a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f1533b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.common.internal.h f1534c;

    /* renamed from: d, reason: collision with root package name */
    private final d.b.a.a.c.f f1535d;
    final Handler e;
    private final Object f;
    private final Object g;

    @GuardedBy("mServiceBrokerLock")
    private n h;
    protected c i;

    @GuardedBy("mLock")
    private T j;
    private final ArrayList<h<?>> k;

    @GuardedBy("mLock")
    private j l;

    @GuardedBy("mLock")
    private int m;
    private final a n;
    private final InterfaceC0065b o;
    private final int p;
    private final String q;
    private d.b.a.a.c.b r;
    private boolean s;
    private volatile b0 t;
    protected AtomicInteger u;

    public interface a {
        void g(int i);

        void h(Bundle bundle);
    }

    /* renamed from: com.google.android.gms.common.internal.b$b, reason: collision with other inner class name */
    public interface InterfaceC0065b {
        void e(d.b.a.a.c.b bVar);
    }

    public interface c {
        void a(d.b.a.a.c.b bVar);
    }

    protected class d implements c {
        public d() {
        }

        @Override // com.google.android.gms.common.internal.b.c
        public void a(d.b.a.a.c.b bVar) {
            if (bVar.m()) {
                b bVar2 = b.this;
                bVar2.h(null, bVar2.A());
            } else if (b.this.o != null) {
                b.this.o.e(bVar);
            }
        }
    }

    public interface e {
        void a();
    }

    private abstract class f extends h<Boolean> {

        /* renamed from: d, reason: collision with root package name */
        private final int f1536d;
        private final Bundle e;

        protected f(int i, Bundle bundle) {
            super(Boolean.TRUE);
            this.f1536d = i;
            this.e = bundle;
        }

        @Override // com.google.android.gms.common.internal.b.h
        protected final /* synthetic */ void c(Boolean bool) {
            if (bool == null) {
                b.this.P(1, null);
                return;
            }
            int i = this.f1536d;
            if (i == 0) {
                if (g()) {
                    return;
                }
                b.this.P(1, null);
                f(new d.b.a.a.c.b(8, null));
                return;
            }
            if (i == 10) {
                b.this.P(1, null);
                throw new IllegalStateException(String.format("A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. ", getClass().getSimpleName(), b.this.n(), b.this.g()));
            }
            b.this.P(1, null);
            Bundle bundle = this.e;
            f(new d.b.a.a.c.b(this.f1536d, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        }

        @Override // com.google.android.gms.common.internal.b.h
        protected final void d() {
        }

        protected abstract void f(d.b.a.a.c.b bVar);

        protected abstract boolean g();
    }

    final class g extends d.b.a.a.e.c.d {
        public g(Looper looper) {
            super(looper);
        }

        private static void a(Message message) {
            h hVar = (h) message.obj;
            hVar.d();
            hVar.b();
        }

        private static boolean b(Message message) {
            int i = message.what;
            return i == 2 || i == 1 || i == 7;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (b.this.u.get() != message.arg1) {
                if (b(message)) {
                    a(message);
                    return;
                }
                return;
            }
            int i = message.what;
            if ((i == 1 || i == 7 || ((i == 4 && !b.this.t()) || message.what == 5)) && !b.this.c()) {
                a(message);
                return;
            }
            int i2 = message.what;
            if (i2 == 4) {
                b.this.r = new d.b.a.a.c.b(message.arg2);
                if (b.this.f0() && !b.this.s) {
                    b.this.P(3, null);
                    return;
                }
                d.b.a.a.c.b bVar = b.this.r != null ? b.this.r : new d.b.a.a.c.b(8);
                b.this.i.a(bVar);
                b.this.E(bVar);
                return;
            }
            if (i2 == 5) {
                d.b.a.a.c.b bVar2 = b.this.r != null ? b.this.r : new d.b.a.a.c.b(8);
                b.this.i.a(bVar2);
                b.this.E(bVar2);
                return;
            }
            if (i2 == 3) {
                Object obj = message.obj;
                d.b.a.a.c.b bVar3 = new d.b.a.a.c.b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
                b.this.i.a(bVar3);
                b.this.E(bVar3);
                return;
            }
            if (i2 == 6) {
                b.this.P(5, null);
                if (b.this.n != null) {
                    b.this.n.g(message.arg2);
                }
                b.this.F(message.arg2);
                b.this.U(5, 1, null);
                return;
            }
            if (i2 == 2 && !b.this.e()) {
                a(message);
                return;
            }
            if (b(message)) {
                ((h) message.obj).e();
                return;
            }
            int i3 = message.what;
            StringBuilder sb = new StringBuilder(45);
            sb.append("Don't know how to handle message: ");
            sb.append(i3);
            Log.wtf("GmsClient", sb.toString(), new Exception());
        }
    }

    protected abstract class h<TListener> {
        private TListener a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f1537b = false;

        public h(TListener tlistener) {
            this.a = tlistener;
        }

        public final void a() {
            synchronized (this) {
                this.a = null;
            }
        }

        public final void b() {
            a();
            synchronized (b.this.k) {
                b.this.k.remove(this);
            }
        }

        protected abstract void c(TListener tlistener);

        protected abstract void d();

        public final void e() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.a;
                if (this.f1537b) {
                    String strValueOf = String.valueOf(this);
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(strValueOf);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            }
            if (tlistener != null) {
                try {
                    c(tlistener);
                } catch (RuntimeException e) {
                    d();
                    throw e;
                }
            } else {
                d();
            }
            synchronized (this) {
                this.f1537b = true;
            }
            b();
        }
    }

    public static final class i extends l.a {
        private b a;

        /* renamed from: b, reason: collision with root package name */
        private final int f1539b;

        public i(b bVar, int i) {
            this.a = bVar;
            this.f1539b = i;
        }

        @Override // com.google.android.gms.common.internal.l
        public final void A(int i, IBinder iBinder, b0 b0Var) {
            q.l(this.a, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            q.k(b0Var);
            this.a.T(b0Var);
            T(i, iBinder, b0Var.f1541b);
        }

        @Override // com.google.android.gms.common.internal.l
        public final void N(int i, Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }

        @Override // com.google.android.gms.common.internal.l
        public final void T(int i, IBinder iBinder, Bundle bundle) {
            q.l(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.a.G(i, iBinder, bundle, this.f1539b);
            this.a = null;
        }
    }

    public final class j implements ServiceConnection {
        private final int a;

        public j(int i) {
            this.a = i;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            n mVar;
            b bVar = b.this;
            if (iBinder == null) {
                bVar.W(16);
                return;
            }
            synchronized (bVar.g) {
                b bVar2 = b.this;
                if (iBinder == null) {
                    mVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    mVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof n)) ? new m(iBinder) : (n) iInterfaceQueryLocalInterface;
                }
                bVar2.h = mVar;
            }
            b.this.O(0, null, this.a);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            synchronized (b.this.g) {
                b.this.h = null;
            }
            Handler handler = b.this.e;
            handler.sendMessage(handler.obtainMessage(6, this.a, 1));
        }
    }

    protected final class k extends f {
        private final IBinder g;

        public k(int i, IBinder iBinder, Bundle bundle) {
            super(i, bundle);
            this.g = iBinder;
        }

        @Override // com.google.android.gms.common.internal.b.f
        protected final void f(d.b.a.a.c.b bVar) {
            if (b.this.o != null) {
                b.this.o.e(bVar);
            }
            b.this.E(bVar);
        }

        @Override // com.google.android.gms.common.internal.b.f
        protected final boolean g() throws RemoteException {
            try {
                String interfaceDescriptor = this.g.getInterfaceDescriptor();
                if (!b.this.g().equals(interfaceDescriptor)) {
                    String strG = b.this.g();
                    StringBuilder sb = new StringBuilder(String.valueOf(strG).length() + 34 + String.valueOf(interfaceDescriptor).length());
                    sb.append("service descriptor mismatch: ");
                    sb.append(strG);
                    sb.append(" vs. ");
                    sb.append(interfaceDescriptor);
                    Log.e("GmsClient", sb.toString());
                    return false;
                }
                IInterface iInterfaceI = b.this.i(this.g);
                if (iInterfaceI == null || !(b.this.U(2, 4, iInterfaceI) || b.this.U(3, 4, iInterfaceI))) {
                    return false;
                }
                b.this.r = null;
                Bundle bundleW = b.this.w();
                if (b.this.n == null) {
                    return true;
                }
                b.this.n.h(bundleW);
                return true;
            } catch (RemoteException unused) {
                Log.w("GmsClient", "service probably died");
                return false;
            }
        }
    }

    protected final class l extends f {
        public l(int i, Bundle bundle) {
            super(i, null);
        }

        @Override // com.google.android.gms.common.internal.b.f
        protected final void f(d.b.a.a.c.b bVar) {
            if (b.this.t() && b.this.f0()) {
                b.this.W(16);
            } else {
                b.this.i.a(bVar);
                b.this.E(bVar);
            }
        }

        @Override // com.google.android.gms.common.internal.b.f
        protected final boolean g() {
            b.this.i.a(d.b.a.a.c.b.f);
            return true;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    protected b(Context context, Looper looper, int i2, a aVar, InterfaceC0065b interfaceC0065b, String str) {
        com.google.android.gms.common.internal.h hVarA = com.google.android.gms.common.internal.h.a(context);
        d.b.a.a.c.f fVarF = d.b.a.a.c.f.f();
        q.k(aVar);
        q.k(interfaceC0065b);
        this(context, looper, hVarA, fVarF, i2, aVar, interfaceC0065b, str);
    }

    protected b(Context context, Looper looper, com.google.android.gms.common.internal.h hVar, d.b.a.a.c.f fVar, int i2, a aVar, InterfaceC0065b interfaceC0065b, String str) {
        this.f = new Object();
        this.g = new Object();
        this.k = new ArrayList<>();
        this.m = 1;
        this.r = null;
        this.s = false;
        this.t = null;
        this.u = new AtomicInteger(0);
        q.l(context, "Context must not be null");
        this.f1533b = context;
        q.l(looper, "Looper must not be null");
        q.l(hVar, "Supervisor must not be null");
        this.f1534c = hVar;
        q.l(fVar, "API availability must not be null");
        this.f1535d = fVar;
        this.e = new g(looper);
        this.p = i2;
        this.n = aVar;
        this.o = interfaceC0065b;
        this.q = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(int i2, T t) {
        q.a((i2 == 4) == (t != null));
        synchronized (this.f) {
            this.m = i2;
            this.j = t;
            H(i2, t);
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3) {
                    if (this.l != null && this.a != null) {
                        String strC = this.a.c();
                        String strA = this.a.a();
                        StringBuilder sb = new StringBuilder(String.valueOf(strC).length() + 70 + String.valueOf(strA).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(strC);
                        sb.append(" on ");
                        sb.append(strA);
                        Log.e("GmsClient", sb.toString());
                        this.f1534c.b(this.a.c(), this.a.a(), this.a.b(), this.l, d0());
                        this.u.incrementAndGet();
                    }
                    this.l = new j(this.u.get());
                    h0 h0Var = (this.m != 3 || z() == null) ? new h0(C(), n(), false, 129) : new h0(x().getPackageName(), z(), true, 129);
                    this.a = h0Var;
                    if (!this.f1534c.c(new h.a(h0Var.c(), this.a.a(), this.a.b()), this.l, d0())) {
                        String strC2 = this.a.c();
                        String strA2 = this.a.a();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(strC2).length() + 34 + String.valueOf(strA2).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(strC2);
                        sb2.append(" on ");
                        sb2.append(strA2);
                        Log.e("GmsClient", sb2.toString());
                        O(16, null, this.u.get());
                    }
                } else if (i2 == 4) {
                    D(t);
                }
            } else if (this.l != null) {
                this.f1534c.b(this.a.c(), this.a.a(), this.a.b(), this.l, d0());
                this.l = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(b0 b0Var) {
        this.t = b0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean U(int i2, int i3, T t) {
        synchronized (this.f) {
            if (this.m != i2) {
                return false;
            }
            P(i3, t);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W(int i2) {
        int i3;
        if (e0()) {
            i3 = 5;
            this.s = true;
        } else {
            i3 = 4;
        }
        Handler handler = this.e;
        handler.sendMessage(handler.obtainMessage(i3, this.u.get(), 16));
    }

    private final String d0() {
        String str = this.q;
        return str == null ? this.f1533b.getClass().getName() : str;
    }

    private final boolean e0() {
        boolean z;
        synchronized (this.f) {
            z = this.m == 3;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean f0() throws ClassNotFoundException {
        if (this.s || TextUtils.isEmpty(g()) || TextUtils.isEmpty(z())) {
            return false;
        }
        try {
            Class.forName(g());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    protected Set<Scope> A() {
        return Collections.EMPTY_SET;
    }

    public final T B() {
        T t;
        synchronized (this.f) {
            if (this.m == 5) {
                throw new DeadObjectException();
            }
            s();
            q.o(this.j != null, "Client is connected but service is null");
            t = this.j;
        }
        return t;
    }

    protected String C() {
        return "com.google.android.gms";
    }

    protected void D(T t) {
        System.currentTimeMillis();
    }

    protected void E(d.b.a.a.c.b bVar) {
        bVar.h();
        System.currentTimeMillis();
    }

    protected void F(int i2) {
        System.currentTimeMillis();
    }

    protected void G(int i2, IBinder iBinder, Bundle bundle, int i3) {
        Handler handler = this.e;
        handler.sendMessage(handler.obtainMessage(1, i3, -1, new k(i2, iBinder, bundle)));
    }

    void H(int i2, T t) {
    }

    public boolean I() {
        return false;
    }

    public void J(int i2) {
        Handler handler = this.e;
        handler.sendMessage(handler.obtainMessage(6, this.u.get(), i2));
    }

    protected void K(c cVar, int i2, PendingIntent pendingIntent) {
        q.l(cVar, "Connection progress callbacks cannot be null.");
        this.i = cVar;
        Handler handler = this.e;
        handler.sendMessage(handler.obtainMessage(3, this.u.get(), i2, pendingIntent));
    }

    protected final void O(int i2, Bundle bundle, int i3) {
        Handler handler = this.e;
        handler.sendMessage(handler.obtainMessage(7, i3, -1, new l(i2, null)));
    }

    public void a(e eVar) {
        eVar.a();
    }

    public boolean c() {
        boolean z;
        synchronized (this.f) {
            z = this.m == 2 || this.m == 3;
        }
        return z;
    }

    public final d.b.a.a.c.d[] d() {
        b0 b0Var = this.t;
        if (b0Var == null) {
            return null;
        }
        return b0Var.f1542c;
    }

    public boolean e() {
        boolean z;
        synchronized (this.f) {
            z = this.m == 4;
        }
        return z;
    }

    public String f() {
        h0 h0Var;
        if (!e() || (h0Var = this.a) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return h0Var.a();
    }

    protected abstract String g();

    public void h(com.google.android.gms.common.internal.k kVar, Set<Scope> set) {
        Bundle bundleY = y();
        com.google.android.gms.common.internal.f fVar = new com.google.android.gms.common.internal.f(this.p);
        fVar.e = this.f1533b.getPackageName();
        fVar.h = bundleY;
        if (set != null) {
            fVar.g = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (m()) {
            fVar.i = u() != null ? u() : new Account("<<default account>>", "com.google");
            if (kVar != null) {
                fVar.f = kVar.asBinder();
            }
        } else if (I()) {
            fVar.i = u();
        }
        fVar.j = v;
        fVar.k = v();
        try {
            synchronized (this.g) {
                if (this.h != null) {
                    this.h.P(new i(this, this.u.get()), fVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            J(1);
        } catch (RemoteException e3) {
            e = e3;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            G(8, null, null, this.u.get());
        } catch (SecurityException e4) {
            throw e4;
        } catch (RuntimeException e5) {
            e = e5;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            G(8, null, null, this.u.get());
        }
    }

    protected abstract T i(IBinder iBinder);

    public void j(c cVar) {
        q.l(cVar, "Connection progress callbacks cannot be null.");
        this.i = cVar;
        P(2, null);
    }

    public void k() {
        this.u.incrementAndGet();
        synchronized (this.k) {
            int size = this.k.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.k.get(i2).a();
            }
            this.k.clear();
        }
        synchronized (this.g) {
            this.h = null;
        }
        P(1, null);
    }

    public boolean m() {
        return false;
    }

    protected abstract String n();

    public boolean o() {
        return true;
    }

    public int q() {
        return d.b.a.a.c.f.a;
    }

    public void r() {
        int iH = this.f1535d.h(this.f1533b, q());
        if (iH == 0) {
            j(new d());
        } else {
            P(1, null);
            K(new d(), iH, null);
        }
    }

    protected final void s() {
        if (!e()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    protected boolean t() {
        return false;
    }

    public Account u() {
        return null;
    }

    public d.b.a.a.c.d[] v() {
        return v;
    }

    public Bundle w() {
        return null;
    }

    public final Context x() {
        return this.f1533b;
    }

    protected Bundle y() {
        return new Bundle();
    }

    protected String z() {
        return null;
    }
}
