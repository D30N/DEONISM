package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class a8 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f1619b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ fa f1620c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ y7 f1621d;

    a8(y7 y7Var, AtomicReference atomicReference, fa faVar) {
        this.f1621d = y7Var;
        this.f1619b = atomicReference;
        this.f1620c = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        r3 r3Var;
        synchronized (this.f1619b) {
            try {
                try {
                    r3Var = this.f1621d.f1960d;
                } catch (RemoteException e) {
                    this.f1621d.m().G().b("Failed to get app instance id", e);
                    atomicReference = this.f1619b;
                }
                if (r3Var == null) {
                    this.f1621d.m().G().a("Failed to get app instance id");
                    return;
                }
                this.f1619b.set(r3Var.o(this.f1620c));
                String str = (String) this.f1619b.get();
                if (str != null) {
                    this.f1621d.q().N(str);
                    this.f1621d.l().l.b(str);
                }
                this.f1621d.f0();
                atomicReference = this.f1619b;
                atomicReference.notify();
            } finally {
                this.f1619b.notify();
            }
        }
    }
}
