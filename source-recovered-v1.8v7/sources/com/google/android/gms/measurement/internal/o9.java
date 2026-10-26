package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
abstract class o9 extends p9 {

    /* renamed from: c, reason: collision with root package name */
    private boolean f1828c;

    o9(r9 r9Var) {
        super(r9Var);
        this.f1845b.s(this);
    }

    final boolean r() {
        return this.f1828c;
    }

    protected final void s() {
        if (!r()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void t() {
        if (this.f1828c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        u();
        this.f1845b.f0();
        this.f1828c = true;
    }

    protected abstract boolean u();
}
