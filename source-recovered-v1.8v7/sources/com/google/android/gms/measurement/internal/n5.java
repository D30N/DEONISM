package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class n5 implements Callable<List<aa>> {
    private final /* synthetic */ fa a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f1804b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f1805c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ j5 f1806d;

    n5(j5 j5Var, fa faVar, String str, String str2) {
        this.f1806d = j5Var;
        this.a = faVar;
        this.f1804b = str;
        this.f1805c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<aa> call() {
        this.f1806d.a.e0();
        return this.f1806d.a.V().J(this.a.f1702b, this.f1804b, this.f1805c);
    }
}
