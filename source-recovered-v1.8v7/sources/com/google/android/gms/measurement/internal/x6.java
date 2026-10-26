package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class x6 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f1949b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f1950c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ String f1951d;
    private final /* synthetic */ String e;
    private final /* synthetic */ j6 f;

    x6(j6 j6Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f = j6Var;
        this.f1949b = atomicReference;
        this.f1950c = str;
        this.f1951d = str2;
        this.e = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.a.P().U(this.f1949b, this.f1950c, this.f1951d, this.e);
    }
}
