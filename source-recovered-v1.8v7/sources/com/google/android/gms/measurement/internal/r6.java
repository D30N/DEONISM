package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class r6 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ long f1874b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ j6 f1875c;

    r6(j6 j6Var, long j) {
        this.f1875c = j6Var;
        this.f1874b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j6 j6Var = this.f1875c;
        long j = this.f1874b;
        j6Var.c();
        j6Var.a();
        j6Var.y();
        j6Var.m().N().a("Resetting analytics data (FE)");
        c9 c9VarV = j6Var.v();
        c9VarV.c();
        c9VarV.e.a();
        boolean zP = j6Var.a.p();
        m4 m4VarL = j6Var.l();
        m4VarL.j.b(j);
        if (!TextUtils.isEmpty(m4VarL.l().z.a())) {
            m4VarL.z.b(null);
        }
        if (d.b.a.a.e.e.ha.b() && m4VarL.n().t(r.w0)) {
            m4VarL.u.b(0L);
        }
        if (!m4VarL.n().H()) {
            m4VarL.A(!zP);
        }
        m4VarL.A.b(null);
        m4VarL.B.b(0L);
        m4VarL.C.b(null);
        j6Var.s().Y();
        if (d.b.a.a.e.e.ha.b() && j6Var.n().t(r.w0)) {
            j6Var.v().f1657d.a();
        }
        j6Var.i = !zP;
        this.f1875c.s().T(new AtomicReference<>());
    }
}
