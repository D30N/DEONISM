package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import d.b.a.a.e.e.ed;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class o8 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f1825b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f1826c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ fa f1827d;
    private final /* synthetic */ ed e;
    private final /* synthetic */ y7 f;

    o8(y7 y7Var, String str, String str2, fa faVar, ed edVar) {
        this.f = y7Var;
        this.f1825b = str;
        this.f1826c = str2;
        this.f1827d = faVar;
        this.e = edVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            try {
                r3 r3Var = this.f.f1960d;
                if (r3Var == null) {
                    this.f.m().G().c("Failed to get conditional properties; not connected to service", this.f1825b, this.f1826c);
                } else {
                    arrayList = z9.r0(r3Var.M(this.f1825b, this.f1826c, this.f1827d));
                    this.f.f0();
                }
            } catch (RemoteException e) {
                this.f.m().G().d("Failed to get conditional properties; remote exception", this.f1825b, this.f1826c, e);
            }
        } finally {
            this.f.g().S(this.e, arrayList);
        }
    }
}
