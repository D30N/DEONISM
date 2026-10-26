package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    private static long f1596b;
    private static final IntentFilter a = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: c, reason: collision with root package name */
    private static float f1597c = Float.NaN;

    @TargetApi(20)
    public static int a(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return -1;
        }
        Intent intentRegisterReceiver = context.getApplicationContext().registerReceiver(null, a);
        int i = ((intentRegisterReceiver == null ? 0 : intentRegisterReceiver.getIntExtra("plugged", 0)) & 7) != 0 ? 1 : 0;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return -1;
        }
        return (l.f() ? powerManager.isInteractive() : powerManager.isScreenOn() ? 2 : 0) | i;
    }

    public static synchronized float b(Context context) {
        if (SystemClock.elapsedRealtime() - f1596b < 60000 && !Float.isNaN(f1597c)) {
            return f1597c;
        }
        if (context.getApplicationContext().registerReceiver(null, a) != null) {
            f1597c = r6.getIntExtra("level", -1) / r6.getIntExtra("scale", -1);
        }
        f1596b = SystemClock.elapsedRealtime();
        return f1597c;
    }
}
