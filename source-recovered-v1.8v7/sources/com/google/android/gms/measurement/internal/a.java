package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class a extends d2 {

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, Long> f1612b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Integer> f1613c;

    /* renamed from: d, reason: collision with root package name */
    private long f1614d;

    public a(d5 d5Var) {
        super(d5Var);
        this.f1613c = new b.d.a();
        this.f1612b = new b.d.a();
    }

    private final void B(String str, long j, q7 q7Var) {
        if (q7Var == null) {
            m().O().a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j < 1000) {
            m().O().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j);
        p7.P(q7Var, bundle, true);
        q().R("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(long j) {
        Iterator<String> it = this.f1612b.keySet().iterator();
        while (it.hasNext()) {
            this.f1612b.put(it.next(), Long.valueOf(j));
        }
        if (this.f1612b.isEmpty()) {
            return;
        }
        this.f1614d = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(String str, long j) {
        a();
        c();
        com.google.android.gms.common.internal.q.g(str);
        if (this.f1613c.isEmpty()) {
            this.f1614d = j;
        }
        Integer num = this.f1613c.get(str);
        if (num != null) {
            this.f1613c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (this.f1613c.size() >= 100) {
            m().J().a("Too many ads visible");
        } else {
            this.f1613c.put(str, 1);
            this.f1612b.put(str, Long.valueOf(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(String str, long j) {
        a();
        c();
        com.google.android.gms.common.internal.q.g(str);
        Integer num = this.f1613c.get(str);
        if (num == null) {
            m().G().b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        q7 q7VarE = t().E(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            this.f1613c.put(str, Integer.valueOf(iIntValue));
            return;
        }
        this.f1613c.remove(str);
        Long l = this.f1612b.get(str);
        if (l == null) {
            m().G().a("First ad unit exposure time was never set");
        } else {
            long jLongValue = j - l.longValue();
            this.f1612b.remove(str);
            B(str, jLongValue, q7VarE);
        }
        if (this.f1613c.isEmpty()) {
            long j2 = this.f1614d;
            if (j2 == 0) {
                m().G().a("First ad exposure time was never set");
            } else {
                x(j - j2, q7VarE);
                this.f1614d = 0L;
            }
        }
    }

    private final void x(long j, q7 q7Var) {
        if (q7Var == null) {
            m().O().a("Not logging ad exposure. No active activity");
            return;
        }
        if (j < 1000) {
            m().O().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j);
        p7.P(q7Var, bundle, true);
        q().R("am", "_xa", bundle);
    }

    public final void A(String str, long j) {
        if (str == null || str.length() == 0) {
            m().G().a("Ad unit id must be a non-empty string");
        } else {
            j().z(new c1(this, str, j));
        }
    }

    public final void E(String str, long j) {
        if (str == null || str.length() == 0) {
            m().G().a("Ad unit id must be a non-empty string");
        } else {
            j().z(new b0(this, str, j));
        }
    }

    public final void w(long j) {
        q7 q7VarE = t().E(false);
        for (String str : this.f1612b.keySet()) {
            B(str, j - this.f1612b.get(str).longValue(), q7VarE);
        }
        if (!this.f1612b.isEmpty()) {
            x(j - this.f1614d, q7VarE);
        }
        C(j);
    }
}
