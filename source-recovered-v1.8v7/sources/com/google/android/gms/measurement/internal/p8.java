package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.internal.b;

/* loaded from: classes.dex */
public final class p8 implements ServiceConnection, b.a, b.InterfaceC0065b {
    private volatile boolean a;

    /* renamed from: b, reason: collision with root package name */
    private volatile a4 f1843b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ y7 f1844c;

    protected p8(y7 y7Var) {
        this.f1844c = y7Var;
    }

    static /* synthetic */ boolean c(p8 p8Var, boolean z) {
        p8Var.a = false;
        return false;
    }

    public final void a() {
        if (this.f1843b != null && (this.f1843b.e() || this.f1843b.c())) {
            this.f1843b.k();
        }
        this.f1843b = null;
    }

    public final void b(Intent intent) {
        this.f1844c.c();
        Context contextF = this.f1844c.f();
        com.google.android.gms.common.stats.a aVarB = com.google.android.gms.common.stats.a.b();
        synchronized (this) {
            if (this.a) {
                this.f1844c.m().O().a("Connection attempt already in progress");
                return;
            }
            this.f1844c.m().O().a("Using local app measurement service");
            this.a = true;
            aVarB.a(contextF, intent, this.f1844c.f1959c, 129);
        }
    }

    public final void d() {
        this.f1844c.c();
        Context contextF = this.f1844c.f();
        synchronized (this) {
            if (this.a) {
                this.f1844c.m().O().a("Connection attempt already in progress");
                return;
            }
            if (this.f1843b != null && (this.f1843b.c() || this.f1843b.e())) {
                this.f1844c.m().O().a("Already awaiting connection attempt");
                return;
            }
            this.f1843b = new a4(contextF, Looper.getMainLooper(), this, this);
            this.f1844c.m().O().a("Connecting to remote service");
            this.a = true;
            this.f1843b.r();
        }
    }

    @Override // com.google.android.gms.common.internal.b.InterfaceC0065b
    public final void e(d.b.a.a.c.b bVar) {
        com.google.android.gms.common.internal.q.f("MeasurementServiceConnection.onConnectionFailed");
        z3 z3VarB = this.f1844c.a.B();
        if (z3VarB != null) {
            z3VarB.J().b("Service connection failed", bVar);
        }
        synchronized (this) {
            this.a = false;
            this.f1843b = null;
        }
        this.f1844c.j().z(new w8(this));
    }

    @Override // com.google.android.gms.common.internal.b.a
    public final void g(int i) {
        com.google.android.gms.common.internal.q.f("MeasurementServiceConnection.onConnectionSuspended");
        this.f1844c.m().N().a("Service connection suspended");
        this.f1844c.j().z(new t8(this));
    }

    @Override // com.google.android.gms.common.internal.b.a
    public final void h(Bundle bundle) {
        com.google.android.gms.common.internal.q.f("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                this.f1844c.j().z(new u8(this, this.f1843b.B()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f1843b = null;
                this.a = false;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.common.internal.q.f("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.a = false;
                this.f1844c.m().G().a("Service connected with null binder");
                return;
            }
            r3 t3Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    if (iBinder != null) {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                        t3Var = iInterfaceQueryLocalInterface instanceof r3 ? (r3) iInterfaceQueryLocalInterface : new t3(iBinder);
                    }
                    this.f1844c.m().O().a("Bound to IMeasurementService interface");
                } else {
                    this.f1844c.m().G().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f1844c.m().G().a("Service connect failed to get IMeasurementService");
            }
            if (t3Var == null) {
                this.a = false;
                try {
                    com.google.android.gms.common.stats.a.b().c(this.f1844c.f(), this.f1844c.f1959c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f1844c.j().z(new s8(this, t3Var));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.common.internal.q.f("MeasurementServiceConnection.onServiceDisconnected");
        this.f1844c.m().N().a("Service disconnected");
        this.f1844c.j().z(new r8(this, componentName));
    }
}
