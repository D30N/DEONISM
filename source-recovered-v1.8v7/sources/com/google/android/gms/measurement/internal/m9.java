package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class m9 extends h {
    private final /* synthetic */ r9 e;
    private final /* synthetic */ n9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m9(n9 n9Var, a6 a6Var, r9 r9Var) {
        super(a6Var);
        this.f = n9Var;
        this.e = r9Var;
    }

    @Override // com.google.android.gms.measurement.internal.h
    public final void b() {
        this.f.w();
        this.f.m().O().a("Starting upload from DelayedRunnable");
        this.e.d0();
    }
}
