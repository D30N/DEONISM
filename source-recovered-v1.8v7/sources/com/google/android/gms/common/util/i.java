package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class i {
    private static Boolean a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f1586b;

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f1587c;

    @TargetApi(21)
    public static boolean a(Context context) {
        if (f1586b == null) {
            f1586b = Boolean.valueOf(l.g() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f1586b.booleanValue();
    }

    public static boolean b() {
        return "user".equals(Build.TYPE);
    }

    @TargetApi(20)
    public static boolean c(Context context) {
        if (a == null) {
            a = Boolean.valueOf(l.f() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return a.booleanValue();
    }

    @TargetApi(26)
    public static boolean d(Context context) {
        if (!c(context)) {
            return false;
        }
        if (l.h()) {
            return a(context) && !l.i();
        }
        return true;
    }

    public static boolean e(Context context) {
        if (f1587c == null) {
            f1587c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        return f1587c.booleanValue();
    }
}
