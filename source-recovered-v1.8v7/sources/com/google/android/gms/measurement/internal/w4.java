package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;

/* loaded from: classes.dex */
public final class w4 {
    private final z4 a;

    public w4(z4 z4Var) {
        com.google.android.gms.common.internal.q.k(z4Var);
        this.a = z4Var;
    }

    public static boolean b(Context context) {
        ActivityInfo receiverInfo;
        com.google.android.gms.common.internal.q.k(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public final void a(Context context, Intent intent) {
        d5 d5VarA = d5.a(context, null, null);
        z3 z3VarM = d5VarA.m();
        if (intent == null) {
            z3VarM.J().a("Receiver called with null intent");
            return;
        }
        d5VarA.h();
        String action = intent.getAction();
        z3VarM.O().b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                z3VarM.J().a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            z3VarM.O().a("Starting wakeful intent.");
            this.a.a(context, className);
        }
    }
}
