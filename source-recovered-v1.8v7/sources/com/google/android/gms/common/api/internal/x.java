package com.google.android.gms.common.api.internal;

/* loaded from: classes.dex */
final class x implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ d.b.a.a.f.b.k f1530b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ v f1531c;

    x(v vVar, d.b.a.a.f.b.k kVar) {
        this.f1531c = vVar;
        this.f1530b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1531c.Z(this.f1530b);
    }
}
