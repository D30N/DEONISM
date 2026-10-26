package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
abstract class f5 extends d2 {

    /* renamed from: b, reason: collision with root package name */
    private boolean f1693b;

    f5(d5 d5Var) {
        super(d5Var);
        this.a.d(this);
    }

    public final void A() {
        if (this.f1693b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        w();
        this.a.t();
        this.f1693b = true;
    }

    protected abstract boolean B();

    protected void w() {
    }

    final boolean x() {
        return this.f1693b;
    }

    protected final void y() {
        if (!x()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void z() {
        if (this.f1693b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (B()) {
            return;
        }
        this.a.t();
        this.f1693b = true;
    }
}
