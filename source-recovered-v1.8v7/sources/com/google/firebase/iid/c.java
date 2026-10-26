package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class c implements c0 {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f2216c = new Object();

    /* renamed from: d, reason: collision with root package name */
    @GuardedBy("lock")
    private static k0 f2217d;
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f2218b;

    public c(Context context, ExecutorService executorService) {
        this.a = context;
        this.f2218b = executorService;
    }

    static final /* synthetic */ d.b.a.a.h.h b(Context context, Intent intent, d.b.a.a.h.h hVar) {
        return (com.google.android.gms.common.util.l.i() && ((Integer) hVar.h()).intValue() == 402) ? f(context, intent).e(s0.a(), p0.a) : hVar;
    }

    private static k0 c(Context context, String str) {
        k0 k0Var;
        synchronized (f2216c) {
            if (f2217d == null) {
                f2217d = new k0(context, str);
            }
            k0Var = f2217d;
        }
        return k0Var;
    }

    static final /* synthetic */ Integer e(d.b.a.a.h.h hVar) {
        return -1;
    }

    private static d.b.a.a.h.h<Integer> f(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Binding to service");
        }
        return c(context, "com.google.firebase.MESSAGING_EVENT").a(intent).e(s0.a(), q0.a);
    }

    static final /* synthetic */ Integer g(d.b.a.a.h.h hVar) {
        return 403;
    }

    @Override // com.google.firebase.iid.c0
    public final d.b.a.a.h.h<Integer> a(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = this.a;
        return (!(com.google.android.gms.common.util.l.i() && context.getApplicationInfo().targetSdkVersion >= 26) || ((intent.getFlags() & 268435456) != 0)) ? d.b.a.a.h.k.c(this.f2218b, new Callable(context, intent) { // from class: com.google.firebase.iid.o0
            private final Context a;

            /* renamed from: b, reason: collision with root package name */
            private final Intent f2252b;

            {
                this.a = context;
                this.f2252b = intent;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(y.b().a(this.a, this.f2252b));
            }
        }).f(this.f2218b, new d.b.a.a.h.a(context, intent) { // from class: com.google.firebase.iid.n0
            private final Context a;

            /* renamed from: b, reason: collision with root package name */
            private final Intent f2250b;

            {
                this.a = context;
                this.f2250b = intent;
            }

            @Override // d.b.a.a.h.a
            public final Object a(d.b.a.a.h.h hVar) {
                return c.b(this.a, this.f2250b, hVar);
            }
        }) : f(context, intent);
    }
}
