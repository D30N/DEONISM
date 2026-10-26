package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class b7 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f1637b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ j6 f1638c;

    b7(j6 j6Var, AtomicReference atomicReference) {
        this.f1638c = j6Var;
        this.f1637b = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f1637b) {
            try {
                this.f1637b.set(Double.valueOf(this.f1638c.n().w(this.f1638c.r().D(), r.O)));
            } finally {
                this.f1637b.notify();
            }
        }
    }
}
