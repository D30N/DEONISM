package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.h;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
final class f0 implements ServiceConnection {
    private final Set<ServiceConnection> a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private int f1554b = 2;

    /* renamed from: c, reason: collision with root package name */
    private boolean f1555c;

    /* renamed from: d, reason: collision with root package name */
    private IBinder f1556d;
    private final h.a e;
    private ComponentName f;
    private final /* synthetic */ e0 g;

    public f0(e0 e0Var, h.a aVar) {
        this.g = e0Var;
        this.e = aVar;
    }

    public final IBinder a() {
        return this.f1556d;
    }

    public final ComponentName b() {
        return this.f;
    }

    public final int c() {
        return this.f1554b;
    }

    public final boolean d() {
        return this.f1555c;
    }

    public final void e(ServiceConnection serviceConnection, String str) {
        com.google.android.gms.common.stats.a unused = this.g.f;
        Context unused2 = this.g.f1550d;
        this.e.c(this.g.f1550d);
        this.a.add(serviceConnection);
    }

    public final boolean f(ServiceConnection serviceConnection) {
        return this.a.contains(serviceConnection);
    }

    public final void g(ServiceConnection serviceConnection, String str) {
        com.google.android.gms.common.stats.a unused = this.g.f;
        Context unused2 = this.g.f1550d;
        this.a.remove(serviceConnection);
    }

    public final void h(String str) {
        this.f1554b = 3;
        boolean zD = this.g.f.d(this.g.f1550d, str, this.e.c(this.g.f1550d), this, this.e.d());
        this.f1555c = zD;
        if (zD) {
            this.g.e.sendMessageDelayed(this.g.e.obtainMessage(1, this.e), this.g.h);
        } else {
            this.f1554b = 2;
            try {
                this.g.f.c(this.g.f1550d, this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public final void i(String str) {
        this.g.e.removeMessages(1, this.e);
        this.g.f.c(this.g.f1550d, this);
        this.f1555c = false;
        this.f1554b = 2;
    }

    public final boolean j() {
        return this.a.isEmpty();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.g.f1549c) {
            this.g.e.removeMessages(1, this.e);
            this.f1556d = iBinder;
            this.f = componentName;
            Iterator<ServiceConnection> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().onServiceConnected(componentName, iBinder);
            }
            this.f1554b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.g.f1549c) {
            this.g.e.removeMessages(1, this.e);
            this.f1556d = null;
            this.f = componentName;
            Iterator<ServiceConnection> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().onServiceDisconnected(componentName);
            }
            this.f1554b = 2;
        }
    }
}
