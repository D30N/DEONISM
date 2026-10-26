package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class t5 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ p f1905b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f1906c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ j5 f1907d;

    t5(j5 j5Var, p pVar, String str) {
        this.f1907d = j5Var;
        this.f1905b = pVar;
        this.f1906c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1907d.a.e0();
        this.f1907d.a.q(this.f1905b, this.f1906c);
    }
}
