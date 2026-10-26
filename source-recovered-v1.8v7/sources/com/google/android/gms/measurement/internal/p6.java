package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class p6 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f1838b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f1839c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ Object f1840d;
    private final /* synthetic */ long e;
    private final /* synthetic */ j6 f;

    p6(j6 j6Var, String str, String str2, Object obj, long j) {
        this.f = j6Var;
        this.f1838b = str;
        this.f1839c = str2;
        this.f1840d = obj;
        this.e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.T(this.f1838b, this.f1839c, this.f1840d, this.e);
    }
}
