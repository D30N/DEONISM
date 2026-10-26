package com.google.android.gms.measurement.internal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
final class r7 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ q7 f1876b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ q7 f1877c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ long f1878d;
    private final /* synthetic */ boolean e;
    private final /* synthetic */ p7 f;

    r7(p7 p7Var, q7 q7Var, q7 q7Var2, long j, boolean z) {
        this.f = p7Var;
        this.f1876b = q7Var;
        this.f1877c = q7Var2;
        this.f1878d = j;
        this.e = z;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f.Q(this.f1876b, this.f1877c, this.f1878d, this.e, null);
    }
}
