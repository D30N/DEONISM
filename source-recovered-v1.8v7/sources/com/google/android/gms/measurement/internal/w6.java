package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class w6 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f1935b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f1936c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ String f1937d;
    private final /* synthetic */ String e;
    private final /* synthetic */ boolean f;
    private final /* synthetic */ j6 g;

    w6(j6 j6Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.g = j6Var;
        this.f1935b = atomicReference;
        this.f1936c = str;
        this.f1937d = str2;
        this.e = str3;
        this.f = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.a.P().V(this.f1935b, this.f1936c, this.f1937d, this.e, this.f);
    }
}
