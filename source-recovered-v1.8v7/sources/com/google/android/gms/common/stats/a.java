package com.google.android.gms.common.stats;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class a {
    private static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static volatile a f1584b;

    private a() {
        List list = Collections.EMPTY_LIST;
    }

    public static a b() {
        if (f1584b == null) {
            synchronized (a) {
                if (f1584b == null) {
                    f1584b = new a();
                }
            }
        }
        return f1584b;
    }

    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return d(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    @SuppressLint({"UntrackedBindService"})
    public void c(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        ComponentName component = intent.getComponent();
        if (!(component == null ? false : com.google.android.gms.common.util.d.a(context, component.getPackageName()))) {
            return context.bindService(intent, serviceConnection, i);
        }
        Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
        return false;
    }
}
