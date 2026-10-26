package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import d.b.a.a.e.e.ya;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class j5 extends u3 {
    private final r9 a;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f1742b;

    /* renamed from: c, reason: collision with root package name */
    private String f1743c;

    public j5(r9 r9Var) {
        this(r9Var, null);
    }

    private j5(r9 r9Var, String str) {
        com.google.android.gms.common.internal.q.k(r9Var);
        this.a = r9Var;
        this.f1743c = null;
    }

    private final void U(Runnable runnable) {
        com.google.android.gms.common.internal.q.k(runnable);
        if (this.a.j().H()) {
            runnable.run();
        } else {
            this.a.j().z(runnable);
        }
    }

    private final void V(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            this.a.m().G().a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.f1742b == null) {
                    this.f1742b = Boolean.valueOf("com.google.android.gms".equals(this.f1743c) || com.google.android.gms.common.util.o.a(this.a.f(), Binder.getCallingUid()) || d.b.a.a.c.j.a(this.a.f()).c(Binder.getCallingUid()));
                }
                if (this.f1742b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                this.a.m().G().b("Measurement Service called with invalid calling package. appId", z3.x(str));
                throw e;
            }
        }
        if (this.f1743c == null && d.b.a.a.c.i.k(this.a.f(), Binder.getCallingUid(), str)) {
            this.f1743c = str;
        }
        if (str.equals(this.f1743c)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    private final void X(fa faVar, boolean z) {
        com.google.android.gms.common.internal.q.k(faVar);
        V(faVar.f1702b, false);
        this.a.b0().i0(faVar.f1703c, faVar.s, faVar.w);
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void C(p pVar, String str, String str2) {
        com.google.android.gms.common.internal.q.k(pVar);
        com.google.android.gms.common.internal.q.g(str);
        V(str, true);
        U(new t5(this, pVar, str));
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void F(fa faVar) {
        X(faVar, false);
        U(new l5(this, faVar));
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void G(long j, String str, String str2, String str3) {
        U(new w5(this, str2, str3, str, j));
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final List<y9> H(String str, String str2, String str3, boolean z) {
        V(str, true);
        try {
            List<aa> list = (List) this.a.j().w(new m5(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (aa aaVar : list) {
                if (z || !z9.C0(aaVar.f1625c)) {
                    arrayList.add(new y9(aaVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.m().G().c("Failed to get user properties as. appId", z3.x(str), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void J(fa faVar) {
        V(faVar.f1702b, false);
        U(new r5(this, faVar));
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final List<oa> K(String str, String str2, String str3) {
        V(str, true);
        try {
            return (List) this.a.j().w(new o5(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.m().G().b("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final List<oa> M(String str, String str2, fa faVar) {
        X(faVar, false);
        try {
            return (List) this.a.j().w(new p5(this, faVar, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.m().G().b("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void Q(y9 y9Var, fa faVar) {
        com.google.android.gms.common.internal.q.k(y9Var);
        X(faVar, false);
        U(new v5(this, y9Var, faVar));
    }

    final p W(p pVar, fa faVar) {
        o oVar;
        boolean z = false;
        if ("_cmp".equals(pVar.f1832b) && (oVar = pVar.f1833c) != null && oVar.h() != 0) {
            String strR = pVar.f1833c.r("_cis");
            if (!TextUtils.isEmpty(strR) && (("referrer broadcast".equals(strR) || "referrer API".equals(strR)) && this.a.H().C(faVar.f1702b, r.S))) {
                z = true;
            }
        }
        if (!z) {
            return pVar;
        }
        this.a.m().M().b("Event has been filtered ", pVar.toString());
        return new p("_cmpx", pVar.f1833c, pVar.f1834d, pVar.e);
    }

    final /* synthetic */ void h(fa faVar, Bundle bundle) {
        this.a.V().W(faVar.f1702b, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final List<y9> j(String str, String str2, boolean z, fa faVar) {
        X(faVar, false);
        try {
            List<aa> list = (List) this.a.j().w(new n5(this, faVar, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (aa aaVar : list) {
                if (z || !z9.C0(aaVar.f1625c)) {
                    arrayList.add(new y9(aaVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.m().G().c("Failed to query user properties. appId", z3.x(faVar.f1702b), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final List<y9> k(fa faVar, boolean z) {
        X(faVar, false);
        try {
            List<aa> list = (List) this.a.j().w(new u5(this, faVar)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (aa aaVar : list) {
                if (z || !z9.C0(aaVar.f1625c)) {
                    arrayList.add(new y9(aaVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.m().G().c("Failed to get user properties. appId", z3.x(faVar.f1702b), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void l(oa oaVar, fa faVar) {
        com.google.android.gms.common.internal.q.k(oaVar);
        com.google.android.gms.common.internal.q.k(oaVar.f1831d);
        X(faVar, false);
        oa oaVar2 = new oa(oaVar);
        oaVar2.f1829b = faVar.f1702b;
        U(new z5(this, oaVar2, faVar));
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void m(fa faVar) {
        X(faVar, false);
        U(new x5(this, faVar));
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final String o(fa faVar) {
        X(faVar, false);
        return this.a.U(faVar);
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void q(final Bundle bundle, final fa faVar) {
        if (ya.b() && this.a.H().t(r.O0)) {
            X(faVar, false);
            U(new Runnable(this, faVar, bundle) { // from class: com.google.android.gms.measurement.internal.i5

                /* renamed from: b, reason: collision with root package name */
                private final j5 f1728b;

                /* renamed from: c, reason: collision with root package name */
                private final fa f1729c;

                /* renamed from: d, reason: collision with root package name */
                private final Bundle f1730d;

                {
                    this.f1728b = this;
                    this.f1729c = faVar;
                    this.f1730d = bundle;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f1728b.h(this.f1729c, this.f1730d);
                }
            });
        }
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final byte[] t(p pVar, String str) {
        com.google.android.gms.common.internal.q.g(str);
        com.google.android.gms.common.internal.q.k(pVar);
        V(str, true);
        this.a.m().N().b("Log and bundle. event", this.a.a0().w(pVar.f1832b));
        long jC = this.a.k().c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.a.j().B(new s5(this, pVar, str)).get();
            if (bArr == null) {
                this.a.m().G().b("Log and bundle returned null. appId", z3.x(str));
                bArr = new byte[0];
            }
            this.a.m().N().d("Log and bundle processed. event, size, time_ms", this.a.a0().w(pVar.f1832b), Integer.valueOf(bArr.length), Long.valueOf((this.a.k().c() / 1000000) - jC));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.a.m().G().d("Failed to log and bundle. appId, event, error", z3.x(str), this.a.a0().w(pVar.f1832b), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void w(oa oaVar) {
        com.google.android.gms.common.internal.q.k(oaVar);
        com.google.android.gms.common.internal.q.k(oaVar.f1831d);
        V(oaVar.f1829b, true);
        U(new k5(this, new oa(oaVar)));
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void x(p pVar, fa faVar) {
        com.google.android.gms.common.internal.q.k(pVar);
        X(faVar, false);
        U(new q5(this, pVar, faVar));
    }
}
