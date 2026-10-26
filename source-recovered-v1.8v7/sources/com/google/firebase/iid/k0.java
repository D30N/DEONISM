package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class k0 implements ServiceConnection {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final Intent f2242b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f2243c;

    /* renamed from: d, reason: collision with root package name */
    private final Queue<j0> f2244d;
    private f0 e;
    private boolean f;

    public k0(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new com.google.android.gms.common.util.q.a("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    private k0(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f2244d = new ArrayDeque();
        this.f = false;
        this.a = context.getApplicationContext();
        this.f2242b = new Intent(str).setPackage(this.a.getPackageName());
        this.f2243c = scheduledExecutorService;
    }

    private final synchronized void b() {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "flush queue called");
        }
        while (!this.f2244d.isEmpty()) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "found intent to be delivered");
            }
            if (this.e == null || !this.e.isBinderAlive()) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    boolean z = !this.f;
                    StringBuilder sb = new StringBuilder(39);
                    sb.append("binder is dead. start connection? ");
                    sb.append(z);
                    Log.d("FirebaseInstanceId", sb.toString());
                }
                if (!this.f) {
                    this.f = true;
                    try {
                    } catch (SecurityException e) {
                        Log.e("FirebaseInstanceId", "Exception while binding the service", e);
                    }
                    if (com.google.android.gms.common.stats.a.b().a(this.a, this.f2242b, this, 65)) {
                        return;
                    }
                    Log.e("FirebaseInstanceId", "binding to the service failed");
                    this.f = false;
                    c();
                }
                return;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "binder is alive, sending the intent.");
            }
            this.e.a(this.f2244d.poll());
        }
    }

    private final void c() {
        while (!this.f2244d.isEmpty()) {
            this.f2244d.poll().b();
        }
    }

    public final synchronized d.b.a.a.h.h<Void> a(Intent intent) {
        final j0 j0Var;
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "new intent queued in the bind-strategy delivery");
        }
        j0Var = new j0(intent);
        ScheduledExecutorService scheduledExecutorService = this.f2243c;
        final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable(j0Var) { // from class: com.google.firebase.iid.m0

            /* renamed from: b, reason: collision with root package name */
            private final j0 f2248b;

            {
                this.f2248b = j0Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f2248b.c();
            }
        }, 9000L, TimeUnit.MILLISECONDS);
        j0Var.a().b(scheduledExecutorService, new d.b.a.a.h.c(scheduledFutureSchedule) { // from class: com.google.firebase.iid.l0
            private final ScheduledFuture a;

            {
                this.a = scheduledFutureSchedule;
            }

            @Override // d.b.a.a.h.c
            public final void a(d.b.a.a.h.h hVar) {
                this.a.cancel(false);
            }
        });
        this.f2244d.add(j0Var);
        b();
        return j0Var.a();
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String strValueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 20);
            sb.append("onServiceConnected: ");
            sb.append(strValueOf);
            Log.d("FirebaseInstanceId", sb.toString());
        }
        this.f = false;
        if (iBinder instanceof f0) {
            this.e = (f0) iBinder;
            b();
            return;
        }
        String strValueOf2 = String.valueOf(iBinder);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 28);
        sb2.append("Invalid service connection: ");
        sb2.append(strValueOf2);
        Log.e("FirebaseInstanceId", sb2.toString());
        c();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String strValueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(strValueOf);
            Log.d("FirebaseInstanceId", sb.toString());
        }
        b();
    }
}
