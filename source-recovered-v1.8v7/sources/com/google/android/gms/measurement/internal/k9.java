package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class k9 {
    private final com.google.android.gms.common.util.e a;

    /* renamed from: b, reason: collision with root package name */
    private long f1765b;

    public k9(com.google.android.gms.common.util.e eVar) {
        com.google.android.gms.common.internal.q.k(eVar);
        this.a = eVar;
    }

    public final void a() {
        this.f1765b = this.a.b();
    }

    public final boolean b(long j) {
        return this.f1765b == 0 || this.a.b() - this.f1765b >= 3600000;
    }

    public final void c() {
        this.f1765b = 0L;
    }
}
