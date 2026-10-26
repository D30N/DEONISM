package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class d7 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ boolean f1667b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ j6 f1668c;

    d7(j6 j6Var, boolean z) {
        this.f1668c = j6Var;
        this.f1667b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zP = this.f1668c.a.p();
        boolean zO = this.f1668c.a.o();
        this.f1668c.a.n(this.f1667b);
        if (zO == this.f1667b) {
            this.f1668c.a.m().O().b("Default data collection state already set to", Boolean.valueOf(this.f1667b));
        }
        if (this.f1668c.a.p() == zP || this.f1668c.a.p() != this.f1668c.a.o()) {
            this.f1668c.a.m().L().c("Default data collection is different than actual status", Boolean.valueOf(this.f1667b), Boolean.valueOf(zP));
        }
        this.f1668c.j0();
    }
}
