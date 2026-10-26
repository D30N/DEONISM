package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
abstract class b6 extends y5 {

    /* renamed from: b, reason: collision with root package name */
    private boolean f1636b;

    b6(d5 d5Var) {
        super(d5Var);
        this.a.g(this);
    }

    protected void o() {
    }

    protected final void p() {
        if (!t()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void q() {
        if (this.f1636b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (s()) {
            return;
        }
        this.a.t();
        this.f1636b = true;
    }

    public final void r() {
        if (this.f1636b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        o();
        this.a.t();
        this.f1636b = true;
    }

    protected abstract boolean s();

    final boolean t() {
        return this.f1636b;
    }
}
