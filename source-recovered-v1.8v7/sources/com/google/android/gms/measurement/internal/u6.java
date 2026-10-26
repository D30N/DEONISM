package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class u6 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f1916b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ j6 f1917c;

    u6(j6 j6Var, AtomicReference atomicReference) {
        this.f1917c = j6Var;
        this.f1916b = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f1916b) {
            try {
                this.f1916b.set(this.f1917c.n().M(this.f1917c.r().D()));
            } finally {
                this.f1916b.notify();
            }
        }
    }
}
