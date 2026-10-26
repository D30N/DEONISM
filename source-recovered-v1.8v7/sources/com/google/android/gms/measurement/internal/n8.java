package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class n8 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f1809b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f1810c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ String f1811d;
    private final /* synthetic */ String e;
    private final /* synthetic */ boolean f;
    private final /* synthetic */ fa g;
    private final /* synthetic */ y7 h;

    n8(y7 y7Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z, fa faVar) {
        this.h = y7Var;
        this.f1809b = atomicReference;
        this.f1810c = str;
        this.f1811d = str2;
        this.e = str3;
        this.f = z;
        this.g = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        r3 r3Var;
        AtomicReference atomicReference2;
        List<y9> listH;
        synchronized (this.f1809b) {
            try {
                try {
                    r3Var = this.h.f1960d;
                } catch (RemoteException e) {
                    this.h.m().G().d("(legacy) Failed to get user properties; remote exception", z3.x(this.f1810c), this.f1811d, e);
                    this.f1809b.set(Collections.emptyList());
                    atomicReference = this.f1809b;
                }
                if (r3Var == null) {
                    this.h.m().G().d("(legacy) Failed to get user properties; not connected to service", z3.x(this.f1810c), this.f1811d, this.e);
                    this.f1809b.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(this.f1810c)) {
                    atomicReference2 = this.f1809b;
                    listH = r3Var.j(this.f1811d, this.e, this.f, this.g);
                } else {
                    atomicReference2 = this.f1809b;
                    listH = r3Var.H(this.f1810c, this.f1811d, this.e, this.f);
                }
                atomicReference2.set(listH);
                this.h.f0();
                atomicReference = this.f1809b;
                atomicReference.notify();
            } finally {
                this.f1809b.notify();
            }
        }
    }
}
