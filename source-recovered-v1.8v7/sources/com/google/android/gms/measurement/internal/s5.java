package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class s5 implements Callable<byte[]> {
    private final /* synthetic */ p a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f1893b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ j5 f1894c;

    s5(j5 j5Var, p pVar, String str) {
        this.f1894c = j5Var;
        this.a = pVar;
        this.f1893b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ byte[] call() {
        this.f1894c.a.e0();
        this.f1894c.a.Y().v(this.a, this.f1893b);
        throw null;
    }
}
