package com.google.firebase.iid;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class e {

    @GuardedBy("MessengerIpcClient.class")
    private static e e;
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f2223b;

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("this")
    private f f2224c = new f(this);

    /* renamed from: d, reason: collision with root package name */
    @GuardedBy("this")
    private int f2225d = 1;

    private e(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f2223b = scheduledExecutorService;
        this.a = context.getApplicationContext();
    }

    private final synchronized int a() {
        int i;
        i = this.f2225d;
        this.f2225d = i + 1;
        return i;
    }

    private final synchronized <T> d.b.a.a.h.h<T> c(p<T> pVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(pVar);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 9);
            sb.append("Queueing ");
            sb.append(strValueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f2224c.e(pVar)) {
            f fVar = new f(this);
            this.f2224c = fVar;
            fVar.e(pVar);
        }
        return pVar.f2253b.a();
    }

    public static synchronized e d(Context context) {
        if (e == null) {
            e = new e(context, d.b.a.a.e.d.a.a().a(1, new com.google.android.gms.common.util.q.a("MessengerIpcClient"), d.b.a.a.e.d.f.a));
        }
        return e;
    }

    public final d.b.a.a.h.h<Bundle> e(int i, Bundle bundle) {
        return c(new r(a(), 1, bundle));
    }
}
