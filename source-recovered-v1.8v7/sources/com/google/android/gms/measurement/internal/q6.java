package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
final class q6 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f1852b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f1853c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ long f1854d;
    private final /* synthetic */ Bundle e;
    private final /* synthetic */ boolean f;
    private final /* synthetic */ boolean g;
    private final /* synthetic */ boolean h;
    private final /* synthetic */ String i;
    private final /* synthetic */ j6 j;

    q6(j6 j6Var, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.j = j6Var;
        this.f1852b = str;
        this.f1853c = str2;
        this.f1854d = j;
        this.e = bundle;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = str3;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.j.P(this.f1852b, this.f1853c, this.f1854d, this.e, this.f, this.g, this.h, this.i);
    }
}
