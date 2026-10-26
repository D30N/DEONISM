package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class l8 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f1778b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f1779c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ String f1780d;
    private final /* synthetic */ String e;
    private final /* synthetic */ fa f;
    private final /* synthetic */ y7 g;

    l8(y7 y7Var, AtomicReference atomicReference, String str, String str2, String str3, fa faVar) {
        this.g = y7Var;
        this.f1778b = atomicReference;
        this.f1779c = str;
        this.f1780d = str2;
        this.e = str3;
        this.f = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        r3 r3Var;
        AtomicReference atomicReference2;
        List<oa> listK;
        synchronized (this.f1778b) {
            try {
                try {
                    r3Var = this.g.f1960d;
                } catch (RemoteException e) {
                    this.g.m().G().d("(legacy) Failed to get conditional properties; remote exception", z3.x(this.f1779c), this.f1780d, e);
                    this.f1778b.set(Collections.emptyList());
                    atomicReference = this.f1778b;
                }
                if (r3Var == null) {
                    this.g.m().G().d("(legacy) Failed to get conditional properties; not connected to service", z3.x(this.f1779c), this.f1780d, this.e);
                    this.f1778b.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(this.f1779c)) {
                    atomicReference2 = this.f1778b;
                    listK = r3Var.M(this.f1780d, this.e, this.f);
                } else {
                    atomicReference2 = this.f1778b;
                    listK = r3Var.K(this.f1779c, this.f1780d, this.e);
                }
                atomicReference2.set(listK);
                this.g.f0();
                atomicReference = this.f1778b;
                atomicReference.notify();
            } finally {
                this.f1778b.notify();
            }
        }
    }
}
