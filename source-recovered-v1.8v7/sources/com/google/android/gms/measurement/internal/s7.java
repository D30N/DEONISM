package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
final class s7 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Bundle f1897b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ q7 f1898c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ q7 f1899d;
    private final /* synthetic */ long e;
    private final /* synthetic */ p7 f;

    s7(p7 p7Var, Bundle bundle, q7 q7Var, q7 q7Var2, long j) {
        this.f = p7Var;
        this.f1897b = bundle;
        this.f1898c = q7Var;
        this.f1899d = q7Var2;
        this.e = j;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f.L(this.f1897b, this.f1898c, this.f1899d, this.e);
    }
}
