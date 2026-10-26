package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import d.b.a.a.e.e.zc;

/* loaded from: classes.dex */
public final class c9 extends f5 {

    /* renamed from: c, reason: collision with root package name */
    private Handler f1656c;

    /* renamed from: d, reason: collision with root package name */
    protected final l9 f1657d;
    protected final j9 e;
    private final d9 f;

    c9(d5 d5Var) {
        super(d5Var);
        this.f1657d = new l9(this);
        this.e = new j9(this);
        this.f = new d9(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G() {
        c();
        if (this.f1656c == null) {
            this.f1656c = new zc(Looper.getMainLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(long j) {
        c();
        G();
        m().O().b("Activity resumed, time", Long.valueOf(j));
        if (n().t(r.D0)) {
            if (n().L().booleanValue() || l().w.b()) {
                this.e.b(j);
            }
            this.f.a();
        } else {
            this.f.a();
            if (n().L().booleanValue()) {
                this.e.b(j);
            }
        }
        l9 l9Var = this.f1657d;
        l9Var.a.c();
        if (l9Var.a.a.p()) {
            if (!l9Var.a.n().t(r.D0)) {
                l9Var.a.l().w.a(false);
            }
            l9Var.b(l9Var.a.k().a(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(long j) {
        c();
        G();
        m().O().b("Activity paused, time", Long.valueOf(j));
        this.f.b(j);
        if (n().L().booleanValue()) {
            this.e.f(j);
        }
        l9 l9Var = this.f1657d;
        if (l9Var.a.n().t(r.D0)) {
            return;
        }
        l9Var.a.l().w.a(true);
    }

    @Override // com.google.android.gms.measurement.internal.f5
    protected final boolean B() {
        return false;
    }

    final long C(long j) {
        return this.e.g(j);
    }

    public final boolean F(boolean z, boolean z2, long j) {
        return this.e.d(z, z2, j);
    }
}
