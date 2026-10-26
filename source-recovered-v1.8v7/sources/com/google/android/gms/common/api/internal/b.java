package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public class b implements Handler.Callback {
    public static final Status m = new Status(4, "Sign-out occurred while this API call was in progress.");
    private static final Status n = new Status(4, "The user must be signed in to make this API call.");
    private static final Object o = new Object();

    @GuardedBy("lock")
    private static b p;
    private long a = 5000;

    /* renamed from: b, reason: collision with root package name */
    private long f1495b = 120000;

    /* renamed from: c, reason: collision with root package name */
    private long f1496c = 10000;

    /* renamed from: d, reason: collision with root package name */
    private final Context f1497d;
    private final d.b.a.a.c.e e;
    private final com.google.android.gms.common.internal.j f;
    private final AtomicInteger g;
    private final Map<d0<?>, a<?>> h;

    @GuardedBy("lock")
    private j i;

    @GuardedBy("lock")
    private final Set<d0<?>> j;
    private final Set<d0<?>> k;
    private final Handler l;

    /* JADX WARN: Unexpected interfaces in signature: [java.lang.Object] */
    public class a<O extends a.d> implements com.google.android.gms.common.api.f, com.google.android.gms.common.api.g {

        /* renamed from: b, reason: collision with root package name */
        private final a.f f1498b;

        /* renamed from: c, reason: collision with root package name */
        private final a.b f1499c;

        /* renamed from: d, reason: collision with root package name */
        private final d0<O> f1500d;
        private final i e;
        private final int h;
        private final v i;
        private boolean j;
        private final Queue<l> a = new LinkedList();
        private final Set<e0> f = new HashSet();
        private final Map<f<?>, t> g = new HashMap();
        private final List<C0064b> k = new ArrayList();
        private d.b.a.a.c.b l = null;

        public a(com.google.android.gms.common.api.e<O> eVar) {
            a.f fVarC = eVar.c(b.this.l.getLooper(), this);
            this.f1498b = fVarC;
            this.f1499c = fVarC instanceof com.google.android.gms.common.internal.t ? ((com.google.android.gms.common.internal.t) fVarC).k0() : fVarC;
            this.f1500d = eVar.e();
            this.e = new i();
            this.h = eVar.b();
            if (this.f1498b.m()) {
                this.i = eVar.d(b.this.f1497d, b.this.l);
            } else {
                this.i = null;
            }
        }

        private final void A() {
            if (this.j) {
                b.this.l.removeMessages(11, this.f1500d);
                b.this.l.removeMessages(9, this.f1500d);
                this.j = false;
            }
        }

        private final void B() {
            b.this.l.removeMessages(12, this.f1500d);
            b.this.l.sendMessageDelayed(b.this.l.obtainMessage(12, this.f1500d), b.this.f1496c);
        }

        private final void E(l lVar) {
            lVar.d(this.e, d());
            try {
                lVar.c(this);
            } catch (DeadObjectException unused) {
                g(1);
                this.f1498b.k();
            }
        }

        private final boolean F(boolean z) {
            com.google.android.gms.common.internal.q.d(b.this.l);
            if (!this.f1498b.e() || this.g.size() != 0) {
                return false;
            }
            if (!this.e.b()) {
                this.f1498b.k();
                return true;
            }
            if (z) {
                B();
            }
            return false;
        }

        private final boolean K(d.b.a.a.c.b bVar) {
            synchronized (b.o) {
                if (b.this.i != null && b.this.j.contains(this.f1500d)) {
                    b.this.i.a(bVar, this.h);
                    throw null;
                }
            }
            return false;
        }

        private final void L(d.b.a.a.c.b bVar) {
            for (e0 e0Var : this.f) {
                String strF = null;
                if (com.google.android.gms.common.internal.p.a(bVar, d.b.a.a.c.b.f)) {
                    strF = this.f1498b.f();
                }
                e0Var.a(this.f1500d, bVar, strF);
            }
            this.f.clear();
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final d.b.a.a.c.d i(d.b.a.a.c.d[] dVarArr) {
            if (dVarArr != null && dVarArr.length != 0) {
                d.b.a.a.c.d[] dVarArrD = this.f1498b.d();
                if (dVarArrD == null) {
                    dVarArrD = new d.b.a.a.c.d[0];
                }
                b.d.a aVar = new b.d.a(dVarArrD.length);
                for (d.b.a.a.c.d dVar : dVarArrD) {
                    aVar.put(dVar.h(), Long.valueOf(dVar.i()));
                }
                for (d.b.a.a.c.d dVar2 : dVarArr) {
                    if (!aVar.containsKey(dVar2.h()) || ((Long) aVar.get(dVar2.h())).longValue() < dVar2.i()) {
                        return dVar2;
                    }
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void k(C0064b c0064b) {
            if (this.k.contains(c0064b) && !this.j) {
                if (this.f1498b.e()) {
                    v();
                } else {
                    a();
                }
            }
        }

        static /* synthetic */ boolean n(a aVar, boolean z) {
            return aVar.F(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void r(C0064b c0064b) {
            d.b.a.a.c.d[] dVarArrG;
            if (this.k.remove(c0064b)) {
                b.this.l.removeMessages(15, c0064b);
                b.this.l.removeMessages(16, c0064b);
                d.b.a.a.c.d dVar = c0064b.f1501b;
                ArrayList arrayList = new ArrayList(this.a.size());
                for (l lVar : this.a) {
                    if ((lVar instanceof u) && (dVarArrG = ((u) lVar).g(this)) != null && com.google.android.gms.common.util.b.a(dVarArrG, dVar)) {
                        arrayList.add(lVar);
                    }
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    l lVar2 = (l) obj;
                    this.a.remove(lVar2);
                    lVar2.e(new com.google.android.gms.common.api.l(dVar));
                }
            }
        }

        private final boolean s(l lVar) {
            if (!(lVar instanceof u)) {
                E(lVar);
                return true;
            }
            u uVar = (u) lVar;
            d.b.a.a.c.d dVarI = i(uVar.g(this));
            if (dVarI == null) {
                E(lVar);
                return true;
            }
            if (!uVar.h(this)) {
                uVar.e(new com.google.android.gms.common.api.l(dVarI));
                return false;
            }
            C0064b c0064b = new C0064b(this.f1500d, dVarI, null);
            int iIndexOf = this.k.indexOf(c0064b);
            if (iIndexOf >= 0) {
                C0064b c0064b2 = this.k.get(iIndexOf);
                b.this.l.removeMessages(15, c0064b2);
                b.this.l.sendMessageDelayed(Message.obtain(b.this.l, 15, c0064b2), b.this.a);
                return false;
            }
            this.k.add(c0064b);
            b.this.l.sendMessageDelayed(Message.obtain(b.this.l, 15, c0064b), b.this.a);
            b.this.l.sendMessageDelayed(Message.obtain(b.this.l, 16, c0064b), b.this.f1495b);
            d.b.a.a.c.b bVar = new d.b.a.a.c.b(2, null);
            if (K(bVar)) {
                return false;
            }
            b.this.i(bVar, this.h);
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void t() {
            y();
            L(d.b.a.a.c.b.f);
            A();
            Iterator<t> it = this.g.values().iterator();
            while (it.hasNext()) {
                t next = it.next();
                if (i(next.a.b()) == null) {
                    try {
                        next.a.c(this.f1499c, new d.b.a.a.h.i<>());
                    } catch (DeadObjectException unused) {
                        g(1);
                        this.f1498b.k();
                    } catch (RemoteException unused2) {
                    }
                }
                it.remove();
            }
            v();
            B();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void u() {
            y();
            this.j = true;
            this.e.d();
            b.this.l.sendMessageDelayed(Message.obtain(b.this.l, 9, this.f1500d), b.this.a);
            b.this.l.sendMessageDelayed(Message.obtain(b.this.l, 11, this.f1500d), b.this.f1495b);
            b.this.f.a();
        }

        private final void v() {
            ArrayList arrayList = new ArrayList(this.a);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                l lVar = (l) obj;
                if (!this.f1498b.e()) {
                    return;
                }
                if (s(lVar)) {
                    this.a.remove(lVar);
                }
            }
        }

        public final boolean C() {
            return F(true);
        }

        public final void D(Status status) {
            com.google.android.gms.common.internal.q.d(b.this.l);
            Iterator<l> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().b(status);
            }
            this.a.clear();
        }

        public final void J(d.b.a.a.c.b bVar) {
            com.google.android.gms.common.internal.q.d(b.this.l);
            this.f1498b.k();
            e(bVar);
        }

        public final void a() {
            com.google.android.gms.common.internal.q.d(b.this.l);
            if (this.f1498b.e() || this.f1498b.c()) {
                return;
            }
            int iB = b.this.f.b(b.this.f1497d, this.f1498b);
            if (iB != 0) {
                e(new d.b.a.a.c.b(iB, null));
                return;
            }
            c cVar = b.this.new c(this.f1498b, this.f1500d);
            if (this.f1498b.m()) {
                this.i.X(cVar);
            }
            this.f1498b.j(cVar);
        }

        public final int b() {
            return this.h;
        }

        final boolean c() {
            return this.f1498b.e();
        }

        public final boolean d() {
            return this.f1498b.m();
        }

        @Override // com.google.android.gms.common.api.g
        public final void e(d.b.a.a.c.b bVar) {
            com.google.android.gms.common.internal.q.d(b.this.l);
            v vVar = this.i;
            if (vVar != null) {
                vVar.Y();
            }
            y();
            b.this.f.a();
            L(bVar);
            if (bVar.h() == 4) {
                D(b.n);
                return;
            }
            if (this.a.isEmpty()) {
                this.l = bVar;
                return;
            }
            if (K(bVar) || b.this.i(bVar, this.h)) {
                return;
            }
            if (bVar.h() == 18) {
                this.j = true;
            }
            if (this.j) {
                b.this.l.sendMessageDelayed(Message.obtain(b.this.l, 9, this.f1500d), b.this.a);
                return;
            }
            String strA = this.f1500d.a();
            StringBuilder sb = new StringBuilder(String.valueOf(strA).length() + 38);
            sb.append("API: ");
            sb.append(strA);
            sb.append(" is not available on this device.");
            D(new Status(17, sb.toString()));
        }

        public final void f() {
            com.google.android.gms.common.internal.q.d(b.this.l);
            if (this.j) {
                a();
            }
        }

        @Override // com.google.android.gms.common.api.f
        public final void g(int i) {
            if (Looper.myLooper() == b.this.l.getLooper()) {
                u();
            } else {
                b.this.l.post(new o(this));
            }
        }

        @Override // com.google.android.gms.common.api.f
        public final void h(Bundle bundle) {
            if (Looper.myLooper() == b.this.l.getLooper()) {
                t();
            } else {
                b.this.l.post(new n(this));
            }
        }

        public final void l(l lVar) {
            com.google.android.gms.common.internal.q.d(b.this.l);
            if (this.f1498b.e()) {
                if (s(lVar)) {
                    B();
                    return;
                } else {
                    this.a.add(lVar);
                    return;
                }
            }
            this.a.add(lVar);
            d.b.a.a.c.b bVar = this.l;
            if (bVar == null || !bVar.l()) {
                a();
            } else {
                e(this.l);
            }
        }

        public final void m(e0 e0Var) {
            com.google.android.gms.common.internal.q.d(b.this.l);
            this.f.add(e0Var);
        }

        public final a.f o() {
            return this.f1498b;
        }

        public final void p() {
            com.google.android.gms.common.internal.q.d(b.this.l);
            if (this.j) {
                A();
                D(b.this.e.g(b.this.f1497d) == 18 ? new Status(8, "Connection timed out while waiting for Google Play services update to complete.") : new Status(8, "API failed to connect while resuming due to an unknown error."));
                this.f1498b.k();
            }
        }

        public final void w() {
            com.google.android.gms.common.internal.q.d(b.this.l);
            D(b.m);
            this.e.c();
            for (f fVar : (f[]) this.g.keySet().toArray(new f[this.g.size()])) {
                l(new c0(fVar, new d.b.a.a.h.i()));
            }
            L(new d.b.a.a.c.b(4));
            if (this.f1498b.e()) {
                this.f1498b.a(new p(this));
            }
        }

        public final Map<f<?>, t> x() {
            return this.g;
        }

        public final void y() {
            com.google.android.gms.common.internal.q.d(b.this.l);
            this.l = null;
        }

        public final d.b.a.a.c.b z() {
            com.google.android.gms.common.internal.q.d(b.this.l);
            return this.l;
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.b$b, reason: collision with other inner class name */
    private static class C0064b {
        private final d0<?> a;

        /* renamed from: b, reason: collision with root package name */
        private final d.b.a.a.c.d f1501b;

        private C0064b(d0<?> d0Var, d.b.a.a.c.d dVar) {
            this.a = d0Var;
            this.f1501b = dVar;
        }

        /* synthetic */ C0064b(d0 d0Var, d.b.a.a.c.d dVar, m mVar) {
            this(d0Var, dVar);
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof C0064b)) {
                C0064b c0064b = (C0064b) obj;
                if (com.google.android.gms.common.internal.p.a(this.a, c0064b.a) && com.google.android.gms.common.internal.p.a(this.f1501b, c0064b.f1501b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return com.google.android.gms.common.internal.p.b(this.a, this.f1501b);
        }

        public final String toString() {
            p.a aVarC = com.google.android.gms.common.internal.p.c(this);
            aVarC.a("key", this.a);
            aVarC.a("feature", this.f1501b);
            return aVarC.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class c implements y, b.c {
        private final a.f a;

        /* renamed from: b, reason: collision with root package name */
        private final d0<?> f1502b;

        /* renamed from: c, reason: collision with root package name */
        private com.google.android.gms.common.internal.k f1503c = null;

        /* renamed from: d, reason: collision with root package name */
        private Set<Scope> f1504d = null;
        private boolean e = false;

        public c(a.f fVar, d0<?> d0Var) {
            this.a = fVar;
            this.f1502b = d0Var;
        }

        static /* synthetic */ boolean e(c cVar, boolean z) {
            cVar.e = true;
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g() {
            com.google.android.gms.common.internal.k kVar;
            if (!this.e || (kVar = this.f1503c) == null) {
                return;
            }
            this.a.h(kVar, this.f1504d);
        }

        @Override // com.google.android.gms.common.internal.b.c
        public final void a(d.b.a.a.c.b bVar) {
            b.this.l.post(new r(this, bVar));
        }

        @Override // com.google.android.gms.common.api.internal.y
        public final void b(d.b.a.a.c.b bVar) {
            ((a) b.this.h.get(this.f1502b)).J(bVar);
        }

        @Override // com.google.android.gms.common.api.internal.y
        public final void c(com.google.android.gms.common.internal.k kVar, Set<Scope> set) {
            if (kVar == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                b(new d.b.a.a.c.b(4));
            } else {
                this.f1503c = kVar;
                this.f1504d = set;
                g();
            }
        }
    }

    private b(Context context, Looper looper, d.b.a.a.c.e eVar) {
        new AtomicInteger(1);
        this.g = new AtomicInteger(0);
        this.h = new ConcurrentHashMap(5, 0.75f, 1);
        this.i = null;
        this.j = new b.d.b();
        this.k = new b.d.b();
        this.f1497d = context;
        this.l = new d.b.a.a.e.b.d(looper, this);
        this.e = eVar;
        this.f = new com.google.android.gms.common.internal.j(eVar);
        Handler handler = this.l;
        handler.sendMessage(handler.obtainMessage(6));
    }

    public static b d(Context context) {
        b bVar;
        synchronized (o) {
            if (p == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                p = new b(context.getApplicationContext(), handlerThread.getLooper(), d.b.a.a.c.e.m());
            }
            bVar = p;
        }
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void e(com.google.android.gms.common.api.e<?> eVar) {
        Object objE = eVar.e();
        a<?> aVar = this.h.get(objE);
        if (aVar == null) {
            aVar = new a<>(eVar);
            this.h.put(objE, aVar);
        }
        if (aVar.d()) {
            this.k.add(objE);
        }
        aVar.a();
    }

    public final void b(d.b.a.a.c.b bVar, int i) {
        if (i(bVar, i)) {
            return;
        }
        Handler handler = this.l;
        handler.sendMessage(handler.obtainMessage(5, i, 0, bVar));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        d.b.a.a.h.i<Boolean> iVarA;
        Boolean boolValueOf;
        int i = message.what;
        a<?> aVar = null;
        switch (i) {
            case 1:
                this.f1496c = ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.l.removeMessages(12);
                for (d0<?> d0Var : this.h.keySet()) {
                    Handler handler = this.l;
                    handler.sendMessageDelayed(handler.obtainMessage(12, d0Var), this.f1496c);
                }
                return true;
            case 2:
                e0 e0Var = (e0) message.obj;
                Iterator<d0<?>> it = e0Var.b().iterator();
                while (true) {
                    if (it.hasNext()) {
                        d0<?> next = it.next();
                        a<?> aVar2 = this.h.get(next);
                        if (aVar2 == null) {
                            e0Var.a(next, new d.b.a.a.c.b(13), null);
                        } else if (aVar2.c()) {
                            e0Var.a(next, d.b.a.a.c.b.f, aVar2.o().f());
                        } else if (aVar2.z() != null) {
                            e0Var.a(next, aVar2.z(), null);
                        } else {
                            aVar2.m(e0Var);
                            aVar2.a();
                        }
                    }
                }
                return true;
            case 3:
                for (a<?> aVar3 : this.h.values()) {
                    aVar3.y();
                    aVar3.a();
                }
                return true;
            case 4:
            case 8:
            case 13:
                s sVar = (s) message.obj;
                a<?> aVar4 = this.h.get(sVar.f1524c.e());
                if (aVar4 == null) {
                    e(sVar.f1524c);
                    aVar4 = this.h.get(sVar.f1524c.e());
                }
                if (!aVar4.d() || this.g.get() == sVar.f1523b) {
                    aVar4.l(sVar.a);
                } else {
                    sVar.a.b(m);
                    aVar4.w();
                }
                return true;
            case 5:
                int i2 = message.arg1;
                d.b.a.a.c.b bVar = (d.b.a.a.c.b) message.obj;
                Iterator<a<?>> it2 = this.h.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        a<?> next2 = it2.next();
                        if (next2.b() == i2) {
                            aVar = next2;
                        }
                    }
                }
                if (aVar != null) {
                    String strE = this.e.e(bVar.h());
                    String strI = bVar.i();
                    StringBuilder sb = new StringBuilder(String.valueOf(strE).length() + 69 + String.valueOf(strI).length());
                    sb.append("Error resolution was canceled by the user, original error message: ");
                    sb.append(strE);
                    sb.append(": ");
                    sb.append(strI);
                    aVar.D(new Status(17, sb.toString()));
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i2);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                }
                return true;
            case 6:
                if (com.google.android.gms.common.util.l.a() && (this.f1497d.getApplicationContext() instanceof Application)) {
                    com.google.android.gms.common.api.internal.a.c((Application) this.f1497d.getApplicationContext());
                    com.google.android.gms.common.api.internal.a.b().a(new m(this));
                    if (!com.google.android.gms.common.api.internal.a.b().f(true)) {
                        this.f1496c = 300000L;
                    }
                }
                return true;
            case 7:
                e((com.google.android.gms.common.api.e) message.obj);
                return true;
            case 9:
                if (this.h.containsKey(message.obj)) {
                    this.h.get(message.obj).f();
                }
                return true;
            case 10:
                Iterator<d0<?>> it3 = this.k.iterator();
                while (it3.hasNext()) {
                    this.h.remove(it3.next()).w();
                }
                this.k.clear();
                return true;
            case 11:
                if (this.h.containsKey(message.obj)) {
                    this.h.get(message.obj).p();
                }
                return true;
            case 12:
                if (this.h.containsKey(message.obj)) {
                    this.h.get(message.obj).C();
                }
                return true;
            case 14:
                k kVar = (k) message.obj;
                d0<?> d0VarB = kVar.b();
                if (this.h.containsKey(d0VarB)) {
                    boolean zN = a.n(this.h.get(d0VarB), false);
                    iVarA = kVar.a();
                    boolValueOf = Boolean.valueOf(zN);
                } else {
                    iVarA = kVar.a();
                    boolValueOf = Boolean.FALSE;
                }
                iVarA.c(boolValueOf);
                return true;
            case 15:
                C0064b c0064b = (C0064b) message.obj;
                if (this.h.containsKey(c0064b.a)) {
                    this.h.get(c0064b.a).k(c0064b);
                }
                return true;
            case 16:
                C0064b c0064b2 = (C0064b) message.obj;
                if (this.h.containsKey(c0064b2.a)) {
                    this.h.get(c0064b2.a).r(c0064b2);
                }
                return true;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
    }

    final boolean i(d.b.a.a.c.b bVar, int i) {
        return this.e.t(this.f1497d, bVar, i);
    }

    public final void q() {
        Handler handler = this.l;
        handler.sendMessage(handler.obtainMessage(3));
    }
}
