package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class g0 {
    private static final long a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    private static final Object f2235b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("WakeLockHolder.syncObject")
    private static d.b.a.a.g.a f2236c;

    public static ComponentName a(Context context, Intent intent) {
        synchronized (f2235b) {
            if (f2236c == null) {
                d.b.a.a.g.a aVar = new d.b.a.a.g.a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                f2236c = aVar;
                aVar.b(true);
            }
            boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
            b(intent, true);
            ComponentName componentNameStartService = context.startService(intent);
            if (componentNameStartService == null) {
                return null;
            }
            if (!booleanExtra) {
                f2236c.a(a);
            }
            return componentNameStartService;
        }
    }

    private static void b(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }
}
