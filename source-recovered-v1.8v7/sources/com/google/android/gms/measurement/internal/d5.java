package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import d.b.a.a.e.e.ya;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d5 implements a6 {
    private static volatile d5 G;
    private volatile Boolean A;
    private Boolean B;
    private Boolean C;
    private int D;
    final long F;
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1664b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1665c;

    /* renamed from: d, reason: collision with root package name */
    private final String f1666d;
    private final boolean e;
    private final pa f;
    private final qa g;
    private final m4 h;
    private final z3 i;
    private final a5 j;
    private final c9 k;
    private final z9 l;
    private final x3 m;
    private final com.google.android.gms.common.util.e n;
    private final p7 o;
    private final j6 p;
    private final a q;
    private final k7 r;
    private v3 s;
    private y7 t;
    private j u;
    private w3 v;
    private v4 w;
    private Boolean y;
    private long z;
    private boolean x = false;
    private AtomicInteger E = new AtomicInteger(0);

    private d5(k6 k6Var) {
        b4 b4VarJ;
        String str;
        Bundle bundle;
        boolean z = false;
        com.google.android.gms.common.internal.q.k(k6Var);
        pa paVar = new pa(k6Var.a);
        this.f = paVar;
        p3.a = paVar;
        this.a = k6Var.a;
        this.f1664b = k6Var.f1759b;
        this.f1665c = k6Var.f1760c;
        this.f1666d = k6Var.f1761d;
        this.e = k6Var.h;
        this.A = k6Var.e;
        d.b.a.a.e.e.e eVar = k6Var.g;
        if (eVar != null && (bundle = eVar.h) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.B = (Boolean) obj;
            }
            Object obj2 = eVar.h.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.C = (Boolean) obj2;
            }
        }
        d.b.a.a.e.e.z1.h(this.a);
        com.google.android.gms.common.util.e eVarD = com.google.android.gms.common.util.h.d();
        this.n = eVarD;
        Long l = k6Var.i;
        this.F = l != null ? l.longValue() : eVarD.a();
        this.g = new qa(this);
        m4 m4Var = new m4(this);
        m4Var.q();
        this.h = m4Var;
        z3 z3Var = new z3(this);
        z3Var.q();
        this.i = z3Var;
        z9 z9Var = new z9(this);
        z9Var.q();
        this.l = z9Var;
        x3 x3Var = new x3(this);
        x3Var.q();
        this.m = x3Var;
        this.q = new a(this);
        p7 p7Var = new p7(this);
        p7Var.z();
        this.o = p7Var;
        j6 j6Var = new j6(this);
        j6Var.z();
        this.p = j6Var;
        c9 c9Var = new c9(this);
        c9Var.z();
        this.k = c9Var;
        k7 k7Var = new k7(this);
        k7Var.q();
        this.r = k7Var;
        a5 a5Var = new a5(this);
        a5Var.q();
        this.j = a5Var;
        d.b.a.a.e.e.e eVar2 = k6Var.g;
        if (eVar2 != null && eVar2.f2665c != 0) {
            z = true;
        }
        boolean z2 = !z;
        if (this.a.getApplicationContext() instanceof Application) {
            j6 j6VarF = F();
            if (j6VarF.f().getApplicationContext() instanceof Application) {
                Application application = (Application) j6VarF.f().getApplicationContext();
                if (j6VarF.f1744c == null) {
                    j6VarF.f1744c = new e7(j6VarF, null);
                }
                if (z2) {
                    application.unregisterActivityLifecycleCallbacks(j6VarF.f1744c);
                    application.registerActivityLifecycleCallbacks(j6VarF.f1744c);
                    b4VarJ = j6VarF.m().O();
                    str = "Registered activity lifecycle callback";
                }
            }
            this.j.z(new g5(this, k6Var));
        }
        b4VarJ = m().J();
        str = "Application context is not an Application";
        b4VarJ.a(str);
        this.j.z(new g5(this, k6Var));
    }

    public static d5 a(Context context, d.b.a.a.e.e.e eVar, Long l) {
        Bundle bundle;
        if (eVar != null && (eVar.f == null || eVar.g == null)) {
            eVar = new d.b.a.a.e.e.e(eVar.f2664b, eVar.f2665c, eVar.f2666d, eVar.e, null, null, eVar.h);
        }
        com.google.android.gms.common.internal.q.k(context);
        com.google.android.gms.common.internal.q.k(context.getApplicationContext());
        if (G == null) {
            synchronized (d5.class) {
                if (G == null) {
                    G = new d5(new k6(context, eVar, l));
                }
            }
        } else if (eVar != null && (bundle = eVar.h) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            G.n(eVar.h.getBoolean("dataCollectionDefaultEnabled"));
        }
        return G;
    }

    private static void e(y5 y5Var) {
        if (y5Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(k6 k6Var) {
        String strConcat;
        b4 b4VarM;
        j().c();
        j jVar = new j(this);
        jVar.q();
        this.u = jVar;
        w3 w3Var = new w3(this, k6Var.f);
        w3Var.z();
        this.v = w3Var;
        v3 v3Var = new v3(this);
        v3Var.z();
        this.s = v3Var;
        y7 y7Var = new y7(this);
        y7Var.z();
        this.t = y7Var;
        this.l.r();
        this.h.r();
        this.w = new v4(this);
        this.v.A();
        m().M().b("App measurement initialized, version", Long.valueOf(this.g.D()));
        m().M().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String strD = w3Var.D();
        if (TextUtils.isEmpty(this.f1664b)) {
            if (G().D0(strD)) {
                b4VarM = m().M();
                strConcat = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
            } else {
                b4 b4VarM2 = m().M();
                String strValueOf = String.valueOf(strD);
                strConcat = strValueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(strValueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
                b4VarM = b4VarM2;
            }
            b4VarM.a(strConcat);
        }
        m().N().a("Debug-level message logging enabled");
        if (this.D != this.E.get()) {
            m().G().c("Not all components initialized", Integer.valueOf(this.D), Integer.valueOf(this.E.get()));
        }
        this.x = true;
    }

    private final k7 w() {
        z(this.r);
        return this.r;
    }

    private static void y(f5 f5Var) {
        if (f5Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (f5Var.x()) {
            return;
        }
        String strValueOf = String.valueOf(f5Var.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 27);
        sb.append("Component not initialized: ");
        sb.append(strValueOf);
        throw new IllegalStateException(sb.toString());
    }

    private static void z(b6 b6Var) {
        if (b6Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (b6Var.t()) {
            return;
        }
        String strValueOf = String.valueOf(b6Var.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 27);
        sb.append("Component not initialized: ");
        sb.append(strValueOf);
        throw new IllegalStateException(sb.toString());
    }

    public final m4 A() {
        e(this.h);
        return this.h;
    }

    public final z3 B() {
        z3 z3Var = this.i;
        if (z3Var == null || !z3Var.t()) {
            return null;
        }
        return this.i;
    }

    public final c9 C() {
        y(this.k);
        return this.k;
    }

    public final v4 D() {
        return this.w;
    }

    final a5 E() {
        return this.j;
    }

    public final j6 F() {
        y(this.p);
        return this.p;
    }

    public final z9 G() {
        e(this.l);
        return this.l;
    }

    public final x3 H() {
        e(this.m);
        return this.m;
    }

    public final v3 I() {
        y(this.s);
        return this.s;
    }

    public final boolean J() {
        return TextUtils.isEmpty(this.f1664b);
    }

    public final String K() {
        return this.f1664b;
    }

    public final String L() {
        return this.f1665c;
    }

    public final String M() {
        return this.f1666d;
    }

    public final boolean N() {
        return this.e;
    }

    public final p7 O() {
        y(this.o);
        return this.o;
    }

    public final y7 P() {
        y(this.t);
        return this.t;
    }

    public final j Q() {
        z(this.u);
        return this.u;
    }

    public final w3 R() {
        y(this.v);
        return this.v;
    }

    public final a S() {
        a aVar = this.q;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("Component not created");
    }

    protected final void b() {
        j().c();
        if (A().e.a() == 0) {
            A().e.b(this.n.a());
        }
        if (Long.valueOf(A().j.a()).longValue() == 0) {
            m().O().b("Persisting first open", Long.valueOf(this.F));
            A().j.b(this.F);
        }
        if (this.g.t(r.R0)) {
            F().h.c();
        }
        if (u()) {
            if (!TextUtils.isEmpty(R().E()) || !TextUtils.isEmpty(R().F())) {
                G();
                if (z9.j0(R().E(), A().D(), R().F(), A().E())) {
                    m().M().a("Rechecking which service to use due to a GMP App Id change");
                    A().G();
                    I().I();
                    this.t.c0();
                    this.t.a0();
                    A().j.b(this.F);
                    A().l.b(null);
                }
                A().z(R().E());
                A().B(R().F());
            }
            F().N(A().l.a());
            if (d.b.a.a.e.e.n9.b() && this.g.t(r.v0) && !G().O0() && !TextUtils.isEmpty(A().z.a())) {
                m().J().a("Remote config removed with active feature rollouts");
                A().z.b(null);
            }
            if (!TextUtils.isEmpty(R().E()) || !TextUtils.isEmpty(R().F())) {
                boolean zP = p();
                if (!A().J() && !this.g.H()) {
                    A().A(!zP);
                }
                if (zP) {
                    F().f0();
                }
                C().f1657d.a();
                P().T(new AtomicReference<>());
                if (ya.b() && this.g.t(r.N0)) {
                    P().G(A().C.a());
                }
            }
        } else if (p()) {
            if (!G().B0("android.permission.INTERNET")) {
                m().G().a("App is missing INTERNET permission");
            }
            if (!G().B0("android.permission.ACCESS_NETWORK_STATE")) {
                m().G().a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!d.b.a.a.c.n.c.a(this.a).g() && !this.g.R()) {
                if (!w4.b(this.a)) {
                    m().G().a("AppMeasurementReceiver not registered/enabled");
                }
                if (!z9.Y(this.a, false)) {
                    m().G().a("AppMeasurementService not registered/enabled");
                }
            }
            m().G().a("Uploading is not possible. App measurement disabled");
        }
        A().t.a(this.g.t(r.a0));
    }

    final void d(f5 f5Var) {
        this.D++;
    }

    @Override // com.google.android.gms.measurement.internal.a6
    public final Context f() {
        return this.a;
    }

    final void g(b6 b6Var) {
        this.D++;
    }

    @Override // com.google.android.gms.measurement.internal.a6
    public final pa h() {
        return this.f;
    }

    @Override // com.google.android.gms.measurement.internal.a6
    public final a5 j() {
        z(this.j);
        return this.j;
    }

    @Override // com.google.android.gms.measurement.internal.a6
    public final com.google.android.gms.common.util.e k() {
        return this.n;
    }

    final /* synthetic */ void l(String str, int i, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> listQueryIntentActivities;
        boolean z = true;
        if (!((i == 200 || i == 204 || i == 304) && th == null)) {
            m().J().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
            return;
        }
        A().x.a(true);
        if (bArr.length == 0) {
            m().N().a("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String strOptString = jSONObject.optString("deeplink", "");
            String strOptString2 = jSONObject.optString("gclid", "");
            double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
            if (TextUtils.isEmpty(strOptString)) {
                m().N().a("Deferred Deep Link is empty.");
                return;
            }
            z9 z9VarG = G();
            z9VarG.a();
            if (TextUtils.isEmpty(strOptString) || (listQueryIntentActivities = z9VarG.f().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0)) == null || listQueryIntentActivities.isEmpty()) {
                z = false;
            }
            if (!z) {
                m().J().c("Deferred Deep Link validation failed. gclid, deep link", strOptString2, strOptString);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gclid", strOptString2);
            bundle.putString("_cis", "ddp");
            this.p.R("auto", "_cmp", bundle);
            z9 z9VarG2 = G();
            if (TextUtils.isEmpty(strOptString) || !z9VarG2.e0(strOptString, dOptDouble)) {
                return;
            }
            z9VarG2.f().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
        } catch (JSONException e) {
            m().G().b("Failed to parse the Deferred Deep Link response. exception", e);
        }
    }

    @Override // com.google.android.gms.measurement.internal.a6
    public final z3 m() {
        z(this.i);
        return this.i;
    }

    final void n(boolean z) {
        this.A = Boolean.valueOf(z);
    }

    public final boolean o() {
        return this.A != null && this.A.booleanValue();
    }

    public final boolean p() {
        return q() == 0;
    }

    public final int q() {
        j().c();
        if (this.g.H()) {
            return 1;
        }
        Boolean bool = this.C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        Boolean boolH = A().H();
        if (boolH != null) {
            return boolH.booleanValue() ? 0 : 3;
        }
        qa qaVar = this.g;
        qaVar.h();
        Boolean boolB = qaVar.B("firebase_analytics_collection_enabled");
        if (boolB != null) {
            return boolB.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.B;
        if (bool2 != null) {
            return bool2.booleanValue() ? 0 : 5;
        }
        if (com.google.android.gms.common.api.internal.c.d()) {
            return 6;
        }
        return (!this.g.t(r.T) || this.A == null || this.A.booleanValue()) ? 0 : 7;
    }

    final void r() {
    }

    final void s() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    final void t() {
        this.E.incrementAndGet();
    }

    protected final boolean u() {
        if (!this.x) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        j().c();
        Boolean bool = this.y;
        if (bool == null || this.z == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.n.b() - this.z) > 1000)) {
            this.z = this.n.b();
            boolean z = true;
            Boolean boolValueOf = Boolean.valueOf(G().B0("android.permission.INTERNET") && G().B0("android.permission.ACCESS_NETWORK_STATE") && (d.b.a.a.c.n.c.a(this.a).g() || this.g.R() || (w4.b(this.a) && z9.Y(this.a, false))));
            this.y = boolValueOf;
            if (boolValueOf.booleanValue()) {
                if (!G().i0(R().E(), R().F(), R().G()) && TextUtils.isEmpty(R().F())) {
                    z = false;
                }
                this.y = Boolean.valueOf(z);
            }
        }
        return this.y.booleanValue();
    }

    public final void v() {
        j().c();
        z(w());
        String strD = R().D();
        Pair<String, Boolean> pairU = A().u(strD);
        if (!this.g.J().booleanValue() || ((Boolean) pairU.second).booleanValue() || TextUtils.isEmpty((CharSequence) pairU.first)) {
            m().N().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        if (!w().x()) {
            m().J().a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        URL urlI = G().I(R().n().D(), strD, (String) pairU.first, A().y.a() - 1);
        k7 k7VarW = w();
        j7 j7Var = new j7(this) { // from class: com.google.android.gms.measurement.internal.h5
            private final d5 a;

            {
                this.a = this;
            }

            @Override // com.google.android.gms.measurement.internal.j7
            public final void a(String str, int i, Throwable th, byte[] bArr, Map map) {
                this.a.l(str, i, th, bArr, map);
            }
        };
        k7VarW.c();
        k7VarW.p();
        com.google.android.gms.common.internal.q.k(urlI);
        com.google.android.gms.common.internal.q.k(j7Var);
        k7VarW.j().C(new m7(k7VarW, strD, urlI, null, null, j7Var));
    }

    public final qa x() {
        return this.g;
    }
}
