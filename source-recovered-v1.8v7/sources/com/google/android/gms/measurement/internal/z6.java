package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class z6 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f1972b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ j6 f1973c;

    z6(j6 j6Var, AtomicReference atomicReference) {
        this.f1973c = j6Var;
        this.f1972b = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f1972b) {
            try {
                this.f1972b.set(Long.valueOf(this.f1973c.n().q(this.f1973c.r().D(), r.M)));
            } finally {
                this.f1972b.notify();
            }
        }
    }
}
