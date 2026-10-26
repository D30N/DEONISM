package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.h;
import java.util.HashMap;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
final class e0 extends h implements Handler.Callback {

    /* renamed from: d, reason: collision with root package name */
    private final Context f1550d;
    private final Handler e;

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("mConnectionStatus")
    private final HashMap<h.a, f0> f1549c = new HashMap<>();
    private final com.google.android.gms.common.stats.a f = com.google.android.gms.common.stats.a.b();
    private final long g = 5000;
    private final long h = 300000;

    e0(Context context) {
        this.f1550d = context.getApplicationContext();
        this.e = new d.b.a.a.e.c.d(context.getMainLooper(), this);
    }

    @Override // com.google.android.gms.common.internal.h
    protected final boolean c(h.a aVar, ServiceConnection serviceConnection, String str) {
        boolean zD;
        q.l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f1549c) {
            f0 f0Var = this.f1549c.get(aVar);
            if (f0Var == null) {
                f0Var = new f0(this, aVar);
                f0Var.e(serviceConnection, str);
                f0Var.h(str);
                this.f1549c.put(aVar, f0Var);
            } else {
                this.e.removeMessages(0, aVar);
                if (f0Var.f(serviceConnection)) {
                    String strValueOf = String.valueOf(aVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(strValueOf);
                    throw new IllegalStateException(sb.toString());
                }
                f0Var.e(serviceConnection, str);
                int iC = f0Var.c();
                if (iC == 1) {
                    serviceConnection.onServiceConnected(f0Var.b(), f0Var.a());
                } else if (iC == 2) {
                    f0Var.h(str);
                }
            }
            zD = f0Var.d();
        }
        return zD;
    }

    @Override // com.google.android.gms.common.internal.h
    protected final void d(h.a aVar, ServiceConnection serviceConnection, String str) {
        q.l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f1549c) {
            f0 f0Var = this.f1549c.get(aVar);
            if (f0Var == null) {
                String strValueOf = String.valueOf(aVar);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(strValueOf);
                throw new IllegalStateException(sb.toString());
            }
            if (!f0Var.f(serviceConnection)) {
                String strValueOf2 = String.valueOf(aVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(strValueOf2);
                throw new IllegalStateException(sb2.toString());
            }
            f0Var.g(serviceConnection, str);
            if (f0Var.j()) {
                this.e.sendMessageDelayed(this.e.obtainMessage(0, aVar), this.g);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f1549c) {
                h.a aVar = (h.a) message.obj;
                f0 f0Var = this.f1549c.get(aVar);
                if (f0Var != null && f0Var.j()) {
                    if (f0Var.d()) {
                        f0Var.i("GmsClientSupervisor");
                    }
                    this.f1549c.remove(aVar);
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        synchronized (this.f1549c) {
            h.a aVar2 = (h.a) message.obj;
            f0 f0Var2 = this.f1549c.get(aVar2);
            if (f0Var2 != null && f0Var2.c() == 3) {
                String strValueOf = String.valueOf(aVar2);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 47);
                sb.append("Timeout waiting for ServiceConnection callback ");
                sb.append(strValueOf);
                Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                ComponentName componentNameB = f0Var2.b();
                if (componentNameB == null) {
                    componentNameB = aVar2.a();
                }
                if (componentNameB == null) {
                    componentNameB = new ComponentName(aVar2.b(), "unknown");
                }
                f0Var2.onServiceDisconnected(componentNameB);
            }
        }
        return true;
    }
}
