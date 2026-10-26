package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class j6 extends f5 {

    /* renamed from: c, reason: collision with root package name */
    protected e7 f1744c;

    /* renamed from: d, reason: collision with root package name */
    private i6 f1745d;
    private final Set<h6> e;
    private boolean f;
    private final AtomicReference<String> g;
    final ha h;
    protected boolean i;

    protected j6(d5 d5Var) {
        super(d5Var);
        this.e = new CopyOnWriteArraySet();
        this.i = true;
        this.g = new AtomicReference<>();
        this.h = new ha(d5Var);
    }

    private final void Q(String str, String str2, long j, Object obj) {
        j().z(new p6(this, str, str2, obj, j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0() {
        c();
        String strA = l().s.a();
        if (strA != null) {
            if ("unset".equals(strA)) {
                T("app", "_npa", null, k().a());
            } else {
                T("app", "_npa", Long.valueOf("true".equals(strA) ? 1L : 0L), k().a());
            }
        }
        if (!this.a.p() || !this.i) {
            m().N().a("Updating Scion state (FE)");
            s().X();
            return;
        }
        m().N().a("Recording app launch after enabling measurement for the first time (FE)");
        f0();
        if (d.b.a.a.e.e.ha.b() && n().t(r.w0)) {
            v().f1657d.a();
        }
        if (d.b.a.a.e.e.u9.b() && n().t(r.B0)) {
            if (!(this.a.D().a.A().k.a() > 0)) {
                v4 v4VarD = this.a.D();
                v4VarD.a.r();
                v4VarD.b(v4VarD.a.f().getPackageName());
            }
        }
        if (n().t(r.R0)) {
            j().z(new c7(this));
        }
    }

    private final ArrayList<Bundle> k0(String str, String str2, String str3) {
        if (j().H()) {
            m().G().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        }
        if (pa.a()) {
            m().G().a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.a.j().v(atomicReference, 5000L, "get conditional user properties", new x6(this, atomicReference, str, str2, str3));
        List list = (List) atomicReference.get();
        if (list != null) {
            return z9.r0(list);
        }
        m().G().b("Timed out waiting for get conditional user properties", str);
        return new ArrayList<>();
    }

    private final Map<String, Object> l0(String str, String str2, String str3, boolean z) {
        b4 b4VarG;
        String str4;
        if (j().H()) {
            b4VarG = m().G();
            str4 = "Cannot get user properties from analytics worker thread";
        } else {
            if (!pa.a()) {
                AtomicReference atomicReference = new AtomicReference();
                this.a.j().v(atomicReference, 5000L, "get user properties", new w6(this, atomicReference, str, str2, str3, z));
                List<y9> list = (List) atomicReference.get();
                if (list == null) {
                    m().G().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
                    return Collections.emptyMap();
                }
                b.d.a aVar = new b.d.a(list.size());
                for (y9 y9Var : list) {
                    aVar.put(y9Var.f1965c, y9Var.h());
                }
                return aVar;
            }
            b4VarG = m().G();
            str4 = "Cannot get user properties from main thread";
        }
        b4VarG.a(str4);
        return Collections.emptyMap();
    }

    private final void n0(Bundle bundle, long j) {
        com.google.android.gms.common.internal.q.k(bundle);
        d6.a(bundle, "app_id", String.class, null);
        d6.a(bundle, "origin", String.class, null);
        d6.a(bundle, "name", String.class, null);
        d6.a(bundle, "value", Object.class, null);
        d6.a(bundle, "trigger_event_name", String.class, null);
        d6.a(bundle, "trigger_timeout", Long.class, 0L);
        d6.a(bundle, "timed_out_event_name", String.class, null);
        d6.a(bundle, "timed_out_event_params", Bundle.class, null);
        d6.a(bundle, "triggered_event_name", String.class, null);
        d6.a(bundle, "triggered_event_params", Bundle.class, null);
        d6.a(bundle, "time_to_live", Long.class, 0L);
        d6.a(bundle, "expired_event_name", String.class, null);
        d6.a(bundle, "expired_event_params", Bundle.class, null);
        com.google.android.gms.common.internal.q.g(bundle.getString("name"));
        com.google.android.gms.common.internal.q.g(bundle.getString("origin"));
        com.google.android.gms.common.internal.q.k(bundle.get("value"));
        bundle.putLong("creation_timestamp", j);
        String string = bundle.getString("name");
        Object obj = bundle.get("value");
        if (g().x0(string) != 0) {
            m().G().b("Invalid conditional user property name", e().A(string));
            return;
        }
        if (g().p0(string, obj) != 0) {
            m().G().c("Invalid conditional user property value", e().A(string), obj);
            return;
        }
        Object objY0 = g().y0(string, obj);
        if (objY0 == null) {
            m().G().c("Unable to normalize conditional user property value", e().A(string), obj);
            return;
        }
        d6.b(bundle, objY0);
        long j2 = bundle.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
            m().G().c("Invalid conditional user property timeout", e().A(string), Long.valueOf(j2));
            return;
        }
        long j3 = bundle.getLong("time_to_live");
        if (j3 > 15552000000L || j3 < 1) {
            m().G().c("Invalid conditional user property time to live", e().A(string), Long.valueOf(j3));
        } else {
            j().z(new s6(this, bundle));
        }
    }

    private final void q0(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        j().z(new q6(this, str, str2, j, z9.q0(bundle), z, z2, z3, str3));
    }

    private final void s0(String str, String str2, String str3, Bundle bundle) {
        long jA = k().a();
        com.google.android.gms.common.internal.q.g(str2);
        Bundle bundle2 = new Bundle();
        if (str != null) {
            bundle2.putString("app_id", str);
        }
        bundle2.putString("name", str2);
        bundle2.putLong("creation_timestamp", jA);
        if (str3 != null) {
            bundle2.putString("expired_event_name", str3);
            bundle2.putBundle("expired_event_params", bundle);
        }
        j().z(new v6(this, bundle2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t0(Bundle bundle) {
        c();
        y();
        com.google.android.gms.common.internal.q.k(bundle);
        com.google.android.gms.common.internal.q.g(bundle.getString("name"));
        com.google.android.gms.common.internal.q.g(bundle.getString("origin"));
        com.google.android.gms.common.internal.q.k(bundle.get("value"));
        if (!this.a.p()) {
            m().O().a("Conditional property not set since app measurement is disabled");
            return;
        }
        y9 y9Var = new y9(bundle.getString("name"), bundle.getLong("triggered_timestamp"), bundle.get("value"), bundle.getString("origin"));
        try {
            p pVarE = g().E(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), bundle.getString("origin"), 0L, true, false);
            s().R(new oa(bundle.getString("app_id"), bundle.getString("origin"), y9Var, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), g().E(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), bundle.getString("origin"), 0L, true, false), bundle.getLong("trigger_timeout"), pVarE, bundle.getLong("time_to_live"), g().E(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), bundle.getString("origin"), 0L, true, false)));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0(boolean z) {
        c();
        a();
        y();
        m().N().b("Setting app measurement enabled (FE)", Boolean.valueOf(z));
        l().y(z);
        j0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w0(Bundle bundle) {
        c();
        y();
        com.google.android.gms.common.internal.q.k(bundle);
        com.google.android.gms.common.internal.q.g(bundle.getString("name"));
        if (!this.a.p()) {
            m().O().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            s().R(new oa(bundle.getString("app_id"), bundle.getString("origin"), new y9(bundle.getString("name"), 0L, null, null), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), g().E(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), bundle.getString("origin"), bundle.getLong("creation_timestamp"), true, false)));
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // com.google.android.gms.measurement.internal.f5
    protected final boolean B() {
        return false;
    }

    public final ArrayList<Bundle> C(String str, String str2) {
        a();
        return k0(null, str, str2);
    }

    public final ArrayList<Bundle> D(String str, String str2, String str3) {
        com.google.android.gms.common.internal.q.g(str);
        o();
        throw null;
    }

    public final Map<String, Object> E(String str, String str2, String str3, boolean z) {
        com.google.android.gms.common.internal.q.g(str);
        o();
        throw null;
    }

    public final Map<String, Object> F(String str, String str2, boolean z) {
        a();
        return l0(null, str, str2, z);
    }

    public final void G(Bundle bundle) {
        H(bundle, k().a());
    }

    public final void H(Bundle bundle, long j) {
        com.google.android.gms.common.internal.q.k(bundle);
        a();
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            m().J().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        n0(bundle2, j);
    }

    public final void I(h6 h6Var) {
        a();
        y();
        com.google.android.gms.common.internal.q.k(h6Var);
        if (this.e.add(h6Var)) {
            return;
        }
        m().J().a("OnEventListener already registered");
    }

    public final void J(i6 i6Var) {
        i6 i6Var2;
        c();
        a();
        y();
        if (i6Var != null && i6Var != (i6Var2 = this.f1745d)) {
            com.google.android.gms.common.internal.q.o(i6Var2 == null, "EventInterceptor already set.");
        }
        this.f1745d = i6Var;
    }

    final void N(String str) {
        this.g.set(str);
    }

    final void O(String str, String str2, long j, Bundle bundle) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        a();
        c();
        P(str, str2, j, bundle, true, this.f1745d == null || z9.C0(str2), false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void P(java.lang.String r26, java.lang.String r27, long r28, android.os.Bundle r30, boolean r31, boolean r32, boolean r33, java.lang.String r34) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 1442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.j6.P(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    public final void R(String str, String str2, Bundle bundle) {
        S(str, str2, bundle, true, true, k().a());
    }

    public final void S(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        a();
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (n().t(r.D0) && z9.A0(str2, "screen_view")) {
            t().K(bundle2);
            return;
        }
        q0(str3, str2, j, bundle2, z2, !z2 || this.f1745d == null || z9.C0(str2), !z, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void T(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.q.g(r9)
            com.google.android.gms.common.internal.q.g(r10)
            r8.c()
            r8.a()
            r8.y()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L63
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L53
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L53
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            java.lang.String r11 = "false"
            boolean r10 = r11.equals(r10)
            r2 = 1
            if (r10 == 0) goto L38
            r4 = r2
            goto L3a
        L38:
            r4 = 0
        L3a:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            com.google.android.gms.measurement.internal.m4 r0 = r8.l()
            com.google.android.gms.measurement.internal.s4 r0 = r0.s
            long r4 = r10.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L4e
            java.lang.String r11 = "true"
        L4e:
            r0.b(r11)
            r6 = r10
            goto L61
        L53:
            if (r11 != 0) goto L63
            com.google.android.gms.measurement.internal.m4 r10 = r8.l()
            com.google.android.gms.measurement.internal.s4 r10 = r10.s
            java.lang.String r0 = "unset"
            r10.b(r0)
            r6 = r11
        L61:
            r3 = r1
            goto L65
        L63:
            r3 = r10
            r6 = r11
        L65:
            com.google.android.gms.measurement.internal.d5 r10 = r8.a
            boolean r10 = r10.p()
            if (r10 != 0) goto L7b
            com.google.android.gms.measurement.internal.z3 r9 = r8.m()
            com.google.android.gms.measurement.internal.b4 r9 = r9.O()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.a(r10)
            return
        L7b:
            com.google.android.gms.measurement.internal.d5 r10 = r8.a
            boolean r10 = r10.u()
            if (r10 != 0) goto L84
            return
        L84:
            com.google.android.gms.measurement.internal.y9 r10 = new com.google.android.gms.measurement.internal.y9
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.y7 r9 = r8.s()
            r9.Q(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.j6.T(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void U(String str, String str2, Object obj, boolean z) {
        V(str, str2, obj, true, k().a());
    }

    public final void V(String str, String str2, Object obj, boolean z, long j) {
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        int iX0 = 6;
        if (z) {
            iX0 = g().x0(str2);
        } else {
            z9 z9VarG = g();
            if (z9VarG.g0("user property", str2)) {
                if (!z9VarG.l0("user property", e6.a, str2)) {
                    iX0 = 15;
                } else if (z9VarG.f0("user property", 24, str2)) {
                    iX0 = 0;
                }
            }
        }
        if (iX0 != 0) {
            g();
            this.a.G().J(iX0, "_ev", z9.H(str2, 24, true), str2 != null ? str2.length() : 0);
            return;
        }
        if (obj == null) {
            Q(str3, str2, j, null);
            return;
        }
        int iP0 = g().p0(str2, obj);
        if (iP0 != 0) {
            g();
            this.a.G().J(iP0, "_ev", z9.H(str2, 24, true), ((obj instanceof String) || (obj instanceof CharSequence)) ? String.valueOf(obj).length() : 0);
        } else {
            Object objY0 = g().y0(str2, obj);
            if (objY0 != null) {
                Q(str3, str2, j, objY0);
            }
        }
    }

    public final void W(String str, String str2, String str3, Bundle bundle) {
        com.google.android.gms.common.internal.q.g(str);
        o();
        throw null;
    }

    public final void X(boolean z) {
        y();
        a();
        j().z(new a7(this, z));
    }

    public final void Y() {
        if (f().getApplicationContext() instanceof Application) {
            ((Application) f().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f1744c);
        }
    }

    public final Boolean Z() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) j().v(atomicReference, 15000L, "boolean test flag value", new o6(this, atomicReference));
    }

    public final String a0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) j().v(atomicReference, 15000L, "String test flag value", new u6(this, atomicReference));
    }

    public final Long b0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) j().v(atomicReference, 15000L, "long test flag value", new z6(this, atomicReference));
    }

    public final Integer c0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) j().v(atomicReference, 15000L, "int test flag value", new y6(this, atomicReference));
    }

    public final Double d0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) j().v(atomicReference, 15000L, "double test flag value", new b7(this, atomicReference));
    }

    public final String e0() {
        a();
        return this.g.get();
    }

    public final void f0() {
        c();
        a();
        y();
        if (this.a.u()) {
            if (n().t(r.h0)) {
                qa qaVarN = n();
                qaVarN.h();
                Boolean boolB = qaVarN.B("google_analytics_deferred_deep_link_enabled");
                if (boolB != null && boolB.booleanValue()) {
                    m().N().a("Deferred Deep Link feature enabled.");
                    j().z(new Runnable(this) { // from class: com.google.android.gms.measurement.internal.l6

                        /* renamed from: b, reason: collision with root package name */
                        private final j6 f1774b;

                        {
                            this.f1774b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            j6 j6Var = this.f1774b;
                            j6Var.c();
                            if (j6Var.l().x.b()) {
                                j6Var.m().N().a("Deferred Deep Link already retrieved. Not fetching again.");
                                return;
                            }
                            long jA = j6Var.l().y.a();
                            j6Var.l().y.b(1 + jA);
                            if (jA < 5) {
                                j6Var.a.v();
                            } else {
                                j6Var.m().J().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                j6Var.l().x.a(true);
                            }
                        }
                    });
                }
            }
            s().Z();
            this.i = false;
            String strI = l().I();
            if (TextUtils.isEmpty(strI)) {
                return;
            }
            d().p();
            if (strI.equals(Build.VERSION.RELEASE)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", strI);
            R("auto", "_ou", bundle);
        }
    }

    public final String g0() {
        q7 q7VarT = this.a.O().T();
        if (q7VarT != null) {
            return q7VarT.a;
        }
        return null;
    }

    public final String h0() {
        q7 q7VarT = this.a.O().T();
        if (q7VarT != null) {
            return q7VarT.f1855b;
        }
        return null;
    }

    public final String i0() {
        if (this.a.K() != null) {
            return this.a.K();
        }
        try {
            return new com.google.android.gms.common.internal.u(f()).a("google_app_id");
        } catch (IllegalStateException e) {
            this.a.m().G().b("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    public final void m0(Bundle bundle) {
        com.google.android.gms.common.internal.q.k(bundle);
        com.google.android.gms.common.internal.q.g(bundle.getString("app_id"));
        o();
        throw null;
    }

    public final void o0(h6 h6Var) {
        a();
        y();
        com.google.android.gms.common.internal.q.k(h6Var);
        if (this.e.remove(h6Var)) {
            return;
        }
        m().J().a("OnEventListener had not been registered");
    }

    final void r0(String str, String str2, Bundle bundle) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        a();
        c();
        O(str, str2, k().a(), bundle);
    }

    public final void u0(String str, String str2, Bundle bundle) {
        a();
        s0(null, str, str2, bundle);
    }
}
