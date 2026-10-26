package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class u9 implements Callable<String> {
    private final /* synthetic */ fa a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ r9 f1921b;

    u9(r9 r9Var, fa faVar) {
        this.f1921b = r9Var;
        this.a = faVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        f4 f4VarQ = this.f1921b.Q(this.a);
        if (f4VarQ != null) {
            return f4VarQ.x();
        }
        this.f1921b.m().J().a("App info was null when attempting to get app instance id");
        return null;
    }
}
