package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class u5 implements Callable<List<aa>> {
    private final /* synthetic */ fa a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ j5 f1915b;

    u5(j5 j5Var, fa faVar) {
        this.f1915b = j5Var;
        this.a = faVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<aa> call() {
        this.f1915b.a.e0();
        return this.f1915b.a.V().H(this.a.f1702b);
    }
}
