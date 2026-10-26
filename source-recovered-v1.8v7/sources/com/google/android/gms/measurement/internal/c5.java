package com.google.android.gms.measurement.internal;

import java.lang.Thread;

/* loaded from: classes.dex */
final class c5 implements Thread.UncaughtExceptionHandler {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ a5 f1650b;

    public c5(a5 a5Var, String str) {
        this.f1650b = a5Var;
        com.google.android.gms.common.internal.q.k(str);
        this.a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f1650b.m().G().b(this.a, th);
    }
}
