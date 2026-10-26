package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
final class g9 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    long f1715b;

    /* renamed from: c, reason: collision with root package name */
    long f1716c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ d9 f1717d;

    g9(d9 d9Var, long j, long j2) {
        this.f1717d = d9Var;
        this.f1715b = j;
        this.f1716c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1717d.f1672b.j().z(new Runnable(this) { // from class: com.google.android.gms.measurement.internal.f9

            /* renamed from: b, reason: collision with root package name */
            private final g9 f1701b;

            {
                this.f1701b = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                g9 g9Var = this.f1701b;
                d9 d9Var = g9Var.f1717d;
                long j = g9Var.f1715b;
                long j2 = g9Var.f1716c;
                d9Var.f1672b.c();
                d9Var.f1672b.m().N().a("Application going to the background");
                boolean z = true;
                if (d9Var.f1672b.n().t(r.D0)) {
                    d9Var.f1672b.l().w.a(true);
                }
                Bundle bundle = new Bundle();
                if (!d9Var.f1672b.n().L().booleanValue()) {
                    d9Var.f1672b.e.f(j2);
                    if (d9Var.f1672b.n().t(r.s0)) {
                        bundle.putLong("_et", d9Var.f1672b.C(j2));
                        p7.P(d9Var.f1672b.t().E(true), bundle, true);
                    } else {
                        z = false;
                    }
                    d9Var.f1672b.F(false, z, j2);
                }
                d9Var.f1672b.q().O("auto", "_ab", j, bundle);
            }
        });
    }
}
