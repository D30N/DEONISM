package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class h8 extends h {
    private final /* synthetic */ y7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h8(y7 y7Var, a6 a6Var) {
        super(a6Var);
        this.e = y7Var;
    }

    @Override // com.google.android.gms.measurement.internal.h
    public final void b() {
        this.e.m().J().a("Tasks have been queued for a long time");
    }
}
