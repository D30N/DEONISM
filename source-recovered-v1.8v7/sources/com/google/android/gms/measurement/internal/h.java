package com.google.android.gms.measurement.internal;

import android.os.Handler;
import d.b.a.a.e.e.zc;

/* loaded from: classes.dex */
abstract class h {

    /* renamed from: d, reason: collision with root package name */
    private static volatile Handler f1719d;
    private final a6 a;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f1720b;

    /* renamed from: c, reason: collision with root package name */
    private volatile long f1721c;

    h(a6 a6Var) {
        com.google.android.gms.common.internal.q.k(a6Var);
        this.a = a6Var;
        this.f1720b = new k(this, a6Var);
    }

    static /* synthetic */ long a(h hVar, long j) {
        hVar.f1721c = 0L;
        return 0L;
    }

    private final Handler f() {
        Handler handler;
        if (f1719d != null) {
            return f1719d;
        }
        synchronized (h.class) {
            if (f1719d == null) {
                f1719d = new zc(this.a.f().getMainLooper());
            }
            handler = f1719d;
        }
        return handler;
    }

    public abstract void b();

    public final void c(long j) {
        e();
        if (j >= 0) {
            this.f1721c = this.a.k().a();
            if (f().postDelayed(this.f1720b, j)) {
                return;
            }
            this.a.m().G().b("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    public final boolean d() {
        return this.f1721c != 0;
    }

    final void e() {
        this.f1721c = 0L;
        f().removeCallbacks(this.f1720b);
    }
}
