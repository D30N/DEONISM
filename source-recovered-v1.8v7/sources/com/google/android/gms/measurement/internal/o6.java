package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class o6 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f1823b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ j6 f1824c;

    o6(j6 j6Var, AtomicReference atomicReference) {
        this.f1824c = j6Var;
        this.f1823b = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f1823b) {
            try {
                this.f1823b.set(Boolean.valueOf(this.f1824c.n().K(this.f1824c.r().D())));
            } finally {
                this.f1823b.notify();
            }
        }
    }
}
