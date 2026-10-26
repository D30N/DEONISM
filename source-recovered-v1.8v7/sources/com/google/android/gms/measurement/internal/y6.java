package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class y6 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f1957b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ j6 f1958c;

    y6(j6 j6Var, AtomicReference atomicReference) {
        this.f1958c = j6Var;
        this.f1957b = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f1957b) {
            try {
                this.f1957b.set(Integer.valueOf(this.f1958c.n().v(this.f1958c.r().D(), r.N)));
            } finally {
                this.f1957b.notify();
            }
        }
    }
}
