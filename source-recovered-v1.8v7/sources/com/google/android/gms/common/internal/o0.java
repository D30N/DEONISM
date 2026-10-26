package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class o0 {
    private static Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("sLock")
    private static boolean f1567b;

    /* renamed from: c, reason: collision with root package name */
    private static String f1568c;

    /* renamed from: d, reason: collision with root package name */
    private static int f1569d;

    public static String a(Context context) {
        c(context);
        return f1568c;
    }

    public static int b(Context context) {
        c(context);
        return f1569d;
    }

    private static void c(Context context) {
        Bundle bundle;
        synchronized (a) {
            if (f1567b) {
                return;
            }
            f1567b = true;
            try {
                bundle = d.b.a.a.c.n.c.a(context).c(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("MetadataValueReader", "This should never happen.", e);
            }
            if (bundle == null) {
                return;
            }
            f1568c = bundle.getString("com.google.app.id");
            f1569d = bundle.getInt("com.google.android.gms.version");
        }
    }
}
