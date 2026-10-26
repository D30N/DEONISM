package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import d.b.a.a.e.e.ed;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class y7 extends f5 {

    /* renamed from: c, reason: collision with root package name */
    private final p8 f1959c;

    /* renamed from: d, reason: collision with root package name */
    private r3 f1960d;
    private volatile Boolean e;
    private final h f;
    private final k9 g;
    private final List<Runnable> h;
    private final h i;

    protected y7(d5 d5Var) {
        super(d5Var);
        this.h = new ArrayList();
        this.g = new k9(d5Var.k());
        this.f1959c = new p8(this);
        this.f = new x7(this, d5Var);
        this.i = new h8(this, d5Var);
    }

    static /* synthetic */ r3 C(y7 y7Var, r3 r3Var) {
        y7Var.f1960d = null;
        return null;
    }

    private final fa E(boolean z) {
        h();
        return r().C(z ? m().P() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(ComponentName componentName) {
        c();
        if (this.f1960d != null) {
            this.f1960d = null;
            m().O().b("Disconnected from device MeasurementService", componentName);
            c();
            a0();
        }
    }

    private final void S(Runnable runnable) {
        c();
        if (W()) {
            runnable.run();
        } else {
            if (this.h.size() >= 1000) {
                m().G().a("Discarding data. Max runnable queue size reached");
                return;
            }
            this.h.add(runnable);
            this.i.c(60000L);
            a0();
        }
    }

    private final boolean e0() {
        h();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0() {
        c();
        this.g.a();
        this.f.c(r.J.a(null).longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean g0() {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.y7.g0():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h0() {
        c();
        if (W()) {
            m().O().a("Inactivity, disconnecting from the service");
            c0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0() {
        c();
        m().O().b("Processing queued up service tasks", Integer.valueOf(this.h.size()));
        Iterator<Runnable> it = this.h.iterator();
        while (it.hasNext()) {
            try {
                it.next().run();
            } catch (Exception e) {
                m().G().b("Task exception while flushing queue", e);
            }
        }
        this.h.clear();
        this.i.e();
    }

    @Override // com.google.android.gms.measurement.internal.f5
    protected final boolean B() {
        return false;
    }

    public final void G(Bundle bundle) {
        c();
        y();
        S(new e8(this, bundle, E(false)));
    }

    public final void H(ed edVar) {
        c();
        y();
        S(new d8(this, E(false), edVar));
    }

    public final void I(ed edVar, p pVar, String str) {
        c();
        y();
        if (g().u(12451000) == 0) {
            S(new i8(this, pVar, str, edVar));
        } else {
            m().J().a("Not bundling data. Service unavailable or out of date");
            g().U(edVar, new byte[0]);
        }
    }

    protected final void J(ed edVar, String str, String str2) {
        c();
        y();
        S(new o8(this, str, str2, E(false), edVar));
    }

    protected final void K(ed edVar, String str, String str2, boolean z) {
        c();
        y();
        S(new q8(this, str, str2, z, E(false), edVar));
    }

    protected final void L(p pVar, String str) {
        com.google.android.gms.common.internal.q.k(pVar);
        c();
        y();
        boolean zE0 = e0();
        S(new j8(this, zE0, zE0 && u().F(pVar), pVar, E(true), str));
    }

    protected final void M(r3 r3Var) {
        c();
        com.google.android.gms.common.internal.q.k(r3Var);
        this.f1960d = r3Var;
        f0();
        i0();
    }

    final void N(r3 r3Var, com.google.android.gms.common.internal.v.a aVar, fa faVar) {
        int size;
        b4 b4VarG;
        String str;
        List<com.google.android.gms.common.internal.v.a> listD;
        c();
        a();
        y();
        boolean zE0 = e0();
        int i = 0;
        int i2 = 100;
        while (i < 1001 && i2 == 100) {
            ArrayList arrayList = new ArrayList();
            if (!zE0 || (listD = u().D(100)) == null) {
                size = 0;
            } else {
                arrayList.addAll(listD);
                size = listD.size();
            }
            if (aVar != null && size < 100) {
                arrayList.add(aVar);
            }
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj = arrayList.get(i3);
                i3++;
                com.google.android.gms.common.internal.v.a aVar2 = (com.google.android.gms.common.internal.v.a) obj;
                if (aVar2 instanceof p) {
                    try {
                        r3Var.x((p) aVar2, faVar);
                    } catch (RemoteException e) {
                        e = e;
                        b4VarG = m().G();
                        str = "Failed to send event to the service";
                        b4VarG.b(str, e);
                    }
                } else if (aVar2 instanceof y9) {
                    try {
                        r3Var.Q((y9) aVar2, faVar);
                    } catch (RemoteException e2) {
                        e = e2;
                        b4VarG = m().G();
                        str = "Failed to send user property to the service";
                        b4VarG.b(str, e);
                    }
                } else if (aVar2 instanceof oa) {
                    try {
                        r3Var.l((oa) aVar2, faVar);
                    } catch (RemoteException e3) {
                        e = e3;
                        b4VarG = m().G();
                        str = "Failed to send conditional user property to the service";
                        b4VarG.b(str, e);
                    }
                } else {
                    m().G().a("Discarding data. Unrecognized parcel type.");
                }
            }
            i++;
            i2 = size;
        }
    }

    protected final void O(q7 q7Var) {
        c();
        y();
        S(new f8(this, q7Var));
    }

    protected final void Q(y9 y9Var) {
        c();
        y();
        S(new z7(this, e0() && u().G(y9Var), y9Var, E(true)));
    }

    protected final void R(oa oaVar) {
        com.google.android.gms.common.internal.q.k(oaVar);
        c();
        y();
        h();
        S(new m8(this, true, u().H(oaVar), new oa(oaVar), E(true), oaVar));
    }

    public final void T(AtomicReference<String> atomicReference) {
        c();
        y();
        S(new a8(this, atomicReference, E(false)));
    }

    protected final void U(AtomicReference<List<oa>> atomicReference, String str, String str2, String str3) {
        c();
        y();
        S(new l8(this, atomicReference, str, str2, str3, E(false)));
    }

    protected final void V(AtomicReference<List<y9>> atomicReference, String str, String str2, String str3, boolean z) {
        c();
        y();
        S(new n8(this, atomicReference, str, str2, str3, z, E(false)));
    }

    public final boolean W() {
        c();
        y();
        return this.f1960d != null;
    }

    protected final void X() {
        c();
        y();
        S(new k8(this, E(true)));
    }

    protected final void Y() {
        c();
        a();
        y();
        fa faVarE = E(false);
        if (e0()) {
            u().I();
        }
        S(new b8(this, faVarE));
    }

    protected final void Z() {
        c();
        y();
        fa faVarE = E(true);
        u().J();
        S(new c8(this, faVarE));
    }

    final void a0() {
        c();
        y();
        if (W()) {
            return;
        }
        if (g0()) {
            this.f1959c.d();
            return;
        }
        if (n().R()) {
            return;
        }
        h();
        List<ResolveInfo> listQueryIntentServices = f().getPackageManager().queryIntentServices(new Intent().setClassName(f(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (!(listQueryIntentServices != null && listQueryIntentServices.size() > 0)) {
            m().G().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        Context contextF = f();
        h();
        intent.setComponent(new ComponentName(contextF, "com.google.android.gms.measurement.AppMeasurementService"));
        this.f1959c.b(intent);
    }

    final Boolean b0() {
        return this.e;
    }

    public final void c0() {
        c();
        y();
        this.f1959c.a();
        try {
            com.google.android.gms.common.stats.a.b().c(f(), this.f1959c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f1960d = null;
    }

    final boolean d0() {
        c();
        y();
        return !g0() || g().K0() >= 200900;
    }
}
