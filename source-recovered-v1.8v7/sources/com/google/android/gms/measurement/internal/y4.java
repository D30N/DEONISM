package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import d.b.a.a.e.e.q0;
import d.b.a.a.e.e.r0;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class y4 extends o9 implements b {
    private static int j = 65535;
    private static int k = 2;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, Map<String, String>> f1956d;
    private final Map<String, Map<String, Boolean>> e;
    private final Map<String, Map<String, Boolean>> f;
    private final Map<String, d.b.a.a.e.e.r0> g;
    private final Map<String, Map<String, Integer>> h;
    private final Map<String, String> i;

    y4(r9 r9Var) {
        super(r9Var);
        this.f1956d = new b.d.a();
        this.e = new b.d.a();
        this.f = new b.d.a();
        this.g = new b.d.a();
        this.i = new b.d.a();
        this.h = new b.d.a();
    }

    private final void K(String str) throws Throwable {
        s();
        c();
        com.google.android.gms.common.internal.q.g(str);
        if (this.g.get(str) == null) {
            byte[] bArrQ0 = p().q0(str);
            if (bArrQ0 != null) {
                r0.a aVarA = w(str, bArrQ0).A();
                y(str, aVarA);
                this.f1956d.put(str, x((d.b.a.a.e.e.r0) ((d.b.a.a.e.e.r4) aVarA.i())));
                this.g.put(str, (d.b.a.a.e.e.r0) ((d.b.a.a.e.e.r4) aVarA.i()));
                this.i.put(str, null);
                return;
            }
            this.f1956d.put(str, null);
            this.e.put(str, null);
            this.f.put(str, null);
            this.g.put(str, null);
            this.i.put(str, null);
            this.h.put(str, null);
        }
    }

    private final d.b.a.a.e.e.r0 w(String str, byte[] bArr) {
        if (bArr == null) {
            return d.b.a.a.e.e.r0.R();
        }
        try {
            r0.a aVarQ = d.b.a.a.e.e.r0.Q();
            v9.A(aVarQ, bArr);
            d.b.a.a.e.e.r0 r0Var = (d.b.a.a.e.e.r0) ((d.b.a.a.e.e.r4) aVarQ.i());
            m().O().c("Parsed config. version, gmp_app_id", r0Var.I() ? Long.valueOf(r0Var.J()) : null, r0Var.K() ? r0Var.L() : null);
            return r0Var;
        } catch (d.b.a.a.e.e.y4 | RuntimeException e) {
            m().J().c("Unable to merge remote config. appId", z3.x(str), e);
            return d.b.a.a.e.e.r0.R();
        }
    }

    private static Map<String, String> x(d.b.a.a.e.e.r0 r0Var) {
        b.d.a aVar = new b.d.a();
        if (r0Var != null) {
            for (d.b.a.a.e.e.s0 s0Var : r0Var.M()) {
                aVar.put(s0Var.E(), s0Var.F());
            }
        }
        return aVar;
    }

    private final void y(String str, r0.a aVar) {
        b.d.a aVar2 = new b.d.a();
        b.d.a aVar3 = new b.d.a();
        b.d.a aVar4 = new b.d.a();
        if (aVar != null) {
            for (int i = 0; i < aVar.w(); i++) {
                q0.a aVarA = aVar.x(i).A();
                if (TextUtils.isEmpty(aVarA.x())) {
                    m().J().a("EventConfig contained null event name");
                } else {
                    String strA = c6.a(aVarA.x());
                    if (!TextUtils.isEmpty(strA)) {
                        aVarA.w(strA);
                        aVar.y(i, aVarA);
                    }
                    aVar2.put(aVarA.x(), Boolean.valueOf(aVarA.y()));
                    aVar3.put(aVarA.x(), Boolean.valueOf(aVarA.z()));
                    if (aVarA.A()) {
                        if (aVarA.B() < k || aVarA.B() > j) {
                            m().J().c("Invalid sampling rate. Event name, sample rate", aVarA.x(), Integer.valueOf(aVarA.B()));
                        } else {
                            aVar4.put(aVarA.x(), Integer.valueOf(aVarA.B()));
                        }
                    }
                }
            }
        }
        this.e.put(str, aVar2);
        this.f.put(str, aVar3);
        this.h.put(str, aVar4);
    }

    protected final String A(String str) {
        c();
        return this.i.get(str);
    }

    final boolean B(String str, String str2) throws Throwable {
        Boolean bool;
        c();
        K(str);
        if (I(str) && z9.C0(str2)) {
            return true;
        }
        if (J(str) && z9.d0(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.e.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    protected final void C(String str) {
        c();
        this.i.put(str, null);
    }

    final boolean D(String str, String str2) throws Throwable {
        Boolean bool;
        c();
        K(str);
        if ("ecommerce_purchase".equals(str2)) {
            return true;
        }
        if (d.b.a.a.e.e.b9.b() && n().t(r.J0) && ("purchase".equals(str2) || "refund".equals(str2))) {
            return true;
        }
        Map<String, Boolean> map = this.f.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final int E(String str, String str2) throws Throwable {
        Integer num;
        c();
        K(str);
        Map<String, Integer> map = this.h.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    final void F(String str) {
        c();
        this.g.remove(str);
    }

    final boolean G(String str) {
        c();
        d.b.a.a.e.e.r0 r0VarV = v(str);
        if (r0VarV == null) {
            return false;
        }
        return r0VarV.P();
    }

    final long H(String str) throws Throwable {
        String strI = i(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(strI)) {
            return 0L;
        }
        try {
            return Long.parseLong(strI);
        } catch (NumberFormatException e) {
            m().J().c("Unable to parse timezone offset. appId", z3.x(str), e);
            return 0L;
        }
    }

    final boolean I(String str) {
        return "1".equals(i(str, "measurement.upload.blacklist_internal"));
    }

    final boolean J(String str) {
        return "1".equals(i(str, "measurement.upload.blacklist_public"));
    }

    @Override // com.google.android.gms.measurement.internal.b
    public final String i(String str, String str2) throws Throwable {
        c();
        K(str);
        Map<String, String> map = this.f1956d.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.o9
    protected final boolean u() {
        return false;
    }

    protected final d.b.a.a.e.e.r0 v(String str) {
        s();
        c();
        com.google.android.gms.common.internal.q.g(str);
        K(str);
        return this.g.get(str);
    }

    protected final boolean z(String str, byte[] bArr, String str2) {
        s();
        c();
        com.google.android.gms.common.internal.q.g(str);
        r0.a aVarA = w(str, bArr).A();
        if (aVarA == null) {
            return false;
        }
        y(str, aVarA);
        this.g.put(str, (d.b.a.a.e.e.r0) ((d.b.a.a.e.e.r4) aVarA.i()));
        this.i.put(str, str2);
        this.f1956d.put(str, x((d.b.a.a.e.e.r0) ((d.b.a.a.e.e.r4) aVarA.i())));
        p().O(str, new ArrayList(aVarA.z()));
        try {
            aVarA.A();
            bArr = ((d.b.a.a.e.e.r0) ((d.b.a.a.e.e.r4) aVarA.i())).n();
        } catch (RuntimeException e) {
            m().J().c("Unable to serialize reduced-size config. Storing full config instead. appId", z3.x(str), e);
        }
        e eVarP = p();
        com.google.android.gms.common.internal.q.g(str);
        eVarP.c();
        eVarP.s();
        new ContentValues().put("remote_config", bArr);
        try {
            if (eVarP.w().update("apps", r2, "app_id = ?", new String[]{str}) == 0) {
                eVarP.m().G().b("Failed to update remote config (got 0). appId", z3.x(str));
            }
        } catch (SQLiteException e2) {
            eVarP.m().G().c("Error storing remote config. appId", z3.x(str), e2);
        }
        this.g.put(str, (d.b.a.a.e.e.r0) ((d.b.a.a.e.e.r4) aVarA.i()));
        return true;
    }
}
