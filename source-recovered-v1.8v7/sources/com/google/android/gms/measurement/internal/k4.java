package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes.dex */
class k4 extends BroadcastReceiver {
    private final r9 a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f1755b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f1756c;

    k4(r9 r9Var) {
        com.google.android.gms.common.internal.q.k(r9Var);
        this.a = r9Var;
    }

    public final void b() {
        this.a.c0();
        this.a.j().c();
        if (this.f1755b) {
            return;
        }
        this.a.f().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f1756c = this.a.T().y();
        this.a.m().O().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f1756c));
        this.f1755b = true;
    }

    public final void c() {
        this.a.c0();
        this.a.j().c();
        this.a.j().c();
        if (this.f1755b) {
            this.a.m().O().a("Unregistering connectivity change receiver");
            this.f1755b = false;
            this.f1756c = false;
            try {
                this.a.f().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.a.m().G().b("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.a.c0();
        String action = intent.getAction();
        this.a.m().O().b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.a.m().J().b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zY = this.a.T().y();
        if (this.f1756c != zY) {
            this.f1756c = zY;
            this.a.j().z(new n4(this, zY));
        }
    }
}
