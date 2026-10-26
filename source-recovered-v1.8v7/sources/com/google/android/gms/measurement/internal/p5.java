package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class p5 implements Callable<List<oa>> {
    private final /* synthetic */ fa a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f1835b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f1836c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ j5 f1837d;

    p5(j5 j5Var, fa faVar, String str, String str2) {
        this.f1837d = j5Var;
        this.a = faVar;
        this.f1835b = str;
        this.f1836c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<oa> call() {
        this.f1837d.a.e0();
        return this.f1837d.a.V().k0(this.a.f1702b, this.f1835b, this.f1836c);
    }
}
