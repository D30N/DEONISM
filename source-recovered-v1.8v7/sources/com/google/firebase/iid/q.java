package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class q {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    private String f2256b;

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("this")
    private String f2257c;

    /* renamed from: d, reason: collision with root package name */
    @GuardedBy("this")
    private int f2258d;

    @GuardedBy("this")
    private int e = 0;

    public q(Context context) {
        this.a = context;
    }

    private final PackageInfo a(String str) {
        try {
            return this.a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String strValueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 23);
            sb.append("Failed to find package ");
            sb.append(strValueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    public static String b(d.b.b.c cVar) {
        String strD = cVar.j().d();
        if (strD != null) {
            return strD;
        }
        String strC = cVar.j().c();
        if (!strC.startsWith("1:")) {
            return strC;
        }
        String[] strArrSplit = strC.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private final synchronized void h() {
        PackageInfo packageInfoA = a(this.a.getPackageName());
        if (packageInfoA != null) {
            this.f2256b = Integer.toString(packageInfoA.versionCode);
            this.f2257c = packageInfoA.versionName;
        }
    }

    public final boolean c() {
        return d() != 0;
    }

    public final synchronized int d() {
        if (this.e != 0) {
            return this.e;
        }
        PackageManager packageManager = this.a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!com.google.android.gms.common.util.l.i()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.e = 2;
            return 2;
        }
        Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
        if (com.google.android.gms.common.util.l.i()) {
            this.e = 2;
        } else {
            this.e = 1;
        }
        return this.e;
    }

    public final synchronized String e() {
        if (this.f2256b == null) {
            h();
        }
        return this.f2256b;
    }

    public final synchronized String f() {
        if (this.f2257c == null) {
            h();
        }
        return this.f2257c;
    }

    public final synchronized int g() {
        PackageInfo packageInfoA;
        if (this.f2258d == 0 && (packageInfoA = a("com.google.android.gms")) != null) {
            this.f2258d = packageInfoA.versionCode;
        }
        return this.f2258d;
    }
}
