package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class m5 implements Callable<List<aa>> {
    private final /* synthetic */ String a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f1789b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f1790c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ j5 f1791d;

    m5(j5 j5Var, String str, String str2, String str3) {
        this.f1791d = j5Var;
        this.a = str;
        this.f1789b = str2;
        this.f1790c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<aa> call() {
        this.f1791d.a.e0();
        return this.f1791d.a.V().J(this.a, this.f1789b, this.f1790c);
    }
}
