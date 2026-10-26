package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class u4 implements ServiceConnection {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ v4 f1914b;

    u4(v4 v4Var, String str) {
        this.f1914b = v4Var;
        this.a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f1914b.a.m().J().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            d.b.a.a.e.e.e2 e2VarG = d.b.a.a.e.e.c5.g(iBinder);
            if (e2VarG == null) {
                this.f1914b.a.m().J().a("Install Referrer Service implementation was not found");
            } else {
                this.f1914b.a.m().O().a("Install Referrer Service connected");
                this.f1914b.a.j().z(new x4(this, e2VarG, this));
            }
        } catch (Exception e) {
            this.f1914b.a.m().J().b("Exception occurred while calling Install Referrer API", e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f1914b.a.m().O().a("Install Referrer Service disconnected");
    }
}
