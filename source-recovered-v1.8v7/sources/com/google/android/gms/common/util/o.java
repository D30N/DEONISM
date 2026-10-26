package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* loaded from: classes.dex */
public final class o {
    public static boolean a(Context context, int i) throws PackageManager.NameNotFoundException {
        if (!b(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            return d.b.a.a.c.j.a(context).b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    @TargetApi(19)
    public static boolean b(Context context, int i, String str) {
        return d.b.a.a.c.n.c.a(context).i(i, str);
    }
}
