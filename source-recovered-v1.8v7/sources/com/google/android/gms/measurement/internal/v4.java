package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import java.util.List;

/* loaded from: classes.dex */
public final class v4 {
    final d5 a;

    v4(d5 d5Var) {
        this.a = d5Var;
    }

    private final boolean c() {
        try {
            d.b.a.a.c.n.b bVarA = d.b.a.a.c.n.c.a(this.a.f());
            if (bVarA != null) {
                return bVarA.e("com.android.vending", 128).versionCode >= 80837300;
            }
            this.a.m().O().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            this.a.m().O().b("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }

    final Bundle a(String str, d.b.a.a.e.e.e2 e2Var) {
        this.a.j().c();
        if (e2Var == null) {
            this.a.m().J().a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle bundleF = e2Var.f(bundle);
            if (bundleF != null) {
                return bundleF;
            }
            this.a.m().G().a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e) {
            this.a.m().G().b("Exception occurred while retrieving the Install Referrer", e.getMessage());
            return null;
        }
    }

    protected final void b(String str) {
        if (str == null || str.isEmpty()) {
            this.a.m().K().a("Install Referrer Reporter was called with invalid app package name");
            return;
        }
        this.a.j().c();
        if (!c()) {
            this.a.m().M().a("Install Referrer Reporter is not available");
            return;
        }
        u4 u4Var = new u4(this, str);
        this.a.j().c();
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        PackageManager packageManager = this.a.f().getPackageManager();
        if (packageManager == null) {
            this.a.m().K().a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
            return;
        }
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            this.a.m().M().a("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
        if (serviceInfo != null) {
            String str2 = serviceInfo.packageName;
            if (serviceInfo.name == null || !"com.android.vending".equals(str2) || !c()) {
                this.a.m().J().a("Play Store version 8.3.73 or higher required for Install Referrer");
                return;
            }
            try {
                this.a.m().O().b("Install Referrer Service is", com.google.android.gms.common.stats.a.b().a(this.a.f(), new Intent(intent), u4Var, 1) ? "available" : "not available");
            } catch (Exception e) {
                this.a.m().G().b("Exception occurred while binding to Install Referrer Service", e.getMessage());
            }
        }
    }
}
