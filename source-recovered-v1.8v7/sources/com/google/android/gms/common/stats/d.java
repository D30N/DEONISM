package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.r;
import java.util.List;

/* loaded from: classes.dex */
public class d {
    private static d a = new d();

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f1585b;

    public static d a() {
        return a;
    }

    private static void c(Context context, WakeLockEvent wakeLockEvent) {
        try {
            context.startService(new Intent().setComponent(b.a).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", wakeLockEvent));
        } catch (Exception e) {
            Log.wtf("WakeLockTracker", e);
        }
    }

    private static boolean d() {
        if (f1585b == null) {
            f1585b = Boolean.FALSE;
        }
        return f1585b.booleanValue();
    }

    public void b(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list, long j) {
        if (d()) {
            if (TextUtils.isEmpty(str)) {
                String strValueOf = String.valueOf(str);
                Log.e("WakeLockTracker", strValueOf.length() != 0 ? "missing wakeLock key. ".concat(strValueOf) : new String("missing wakeLock key. "));
            } else if (7 == i || 8 == i || 10 == i || 11 == i) {
                c(context, new WakeLockEvent(System.currentTimeMillis(), i, str2, i2, c.b(list), str, SystemClock.elapsedRealtime(), r.a(context), str3, c.c(context.getPackageName()), r.b(context), j, str4, false));
            }
        }
    }
}
