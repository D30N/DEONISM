package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class o5 implements Callable<List<oa>> {
    private final /* synthetic */ String a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f1820b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f1821c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ j5 f1822d;

    o5(j5 j5Var, String str, String str2, String str3) {
        this.f1822d = j5Var;
        this.a = str;
        this.f1820b = str2;
        this.f1821c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<oa> call() {
        this.f1822d.a.e0();
        return this.f1822d.a.V().k0(this.a, this.f1820b, this.f1821c);
    }
}
