package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

@TargetApi(14)
/* loaded from: classes.dex */
final class e7 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ j6 f1683b;

    private e7(j6 j6Var) {
        this.f1683b = j6Var;
    }

    /* synthetic */ e7(j6 j6Var, o6 o6Var) {
        this(j6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(boolean z, Uri uri, String str, String str2) {
        Bundle bundleA;
        Bundle bundleA2;
        this.f1683b.c();
        try {
            if (this.f1683b.n().t(r.i0) || this.f1683b.n().t(r.k0) || this.f1683b.n().t(r.j0)) {
                z9 z9VarG = this.f1683b.g();
                if (!TextUtils.isEmpty(str2)) {
                    if (str2.contains("gclid") || str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium")) {
                        String strValueOf = String.valueOf(str2);
                        bundleA = z9VarG.A(Uri.parse(strValueOf.length() != 0 ? "https://google.com/search?".concat(strValueOf) : new String("https://google.com/search?")));
                        if (bundleA != null) {
                            bundleA.putString("_cis", "referrer");
                        }
                    } else {
                        z9VarG.m().N().a("Activity created with data 'referrer' without required params");
                    }
                }
                bundleA = null;
            } else {
                bundleA = null;
            }
            boolean z2 = false;
            if (z) {
                bundleA2 = this.f1683b.g().A(uri);
                if (bundleA2 != null) {
                    bundleA2.putString("_cis", "intent");
                    if (this.f1683b.n().t(r.i0) && !bundleA2.containsKey("gclid") && bundleA != null && bundleA.containsKey("gclid")) {
                        bundleA2.putString("_cer", String.format("gclid=%s", bundleA.getString("gclid")));
                    }
                    this.f1683b.R(str, "_cmp", bundleA2);
                    if (this.f1683b.n().t(r.R0)) {
                        this.f1683b.h.b(str, bundleA2);
                    }
                }
            } else {
                bundleA2 = null;
            }
            if (this.f1683b.n().t(r.k0) && !this.f1683b.n().t(r.j0) && bundleA != null && bundleA.containsKey("gclid") && (bundleA2 == null || !bundleA2.containsKey("gclid"))) {
                this.f1683b.U("auto", "_lgclid", bundleA.getString("gclid"), true);
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            this.f1683b.m().N().b("Activity created with referrer", str2);
            if (this.f1683b.n().t(r.j0)) {
                if (bundleA != null) {
                    this.f1683b.R(str, "_cmp", bundleA);
                    if (this.f1683b.n().t(r.R0)) {
                        this.f1683b.h.b(str, bundleA);
                    }
                } else {
                    this.f1683b.m().N().b("Referrer does not contain valid parameters", str2);
                }
                this.f1683b.U("auto", "_ldl", null, true);
                return;
            }
            if (str2.contains("gclid") && (str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium") || str2.contains("utm_term") || str2.contains("utm_content"))) {
                z2 = true;
            }
            if (!z2) {
                this.f1683b.m().N().a("Activity created with data 'referrer' without required params");
            } else {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                this.f1683b.U("auto", "_ldl", str2, true);
            }
        } catch (Exception e) {
            this.f1683b.m().G().b("Throwable caught in handleReferrerForOnActivityCreated", e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Uri data;
        try {
            try {
                this.f1683b.m().O().a("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent != null && (data = intent.getData()) != null && data.isHierarchical()) {
                    this.f1683b.g();
                    this.f1683b.j().z(new i7(this, bundle == null, data, z9.Z(intent) ? "gs" : "auto", data.getQueryParameter("referrer")));
                }
            } catch (Exception e) {
                this.f1683b.m().G().b("Throwable caught in onActivityCreated", e);
            }
        } finally {
            this.f1683b.t().H(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f1683b.t().W(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f1683b.t().U(activity);
        c9 c9VarV = this.f1683b.v();
        c9VarV.j().z(new e9(c9VarV, c9VarV.k().b()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        c9 c9VarV = this.f1683b.v();
        c9VarV.j().z(new b9(c9VarV, c9VarV.k().b()));
        this.f1683b.t().G(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f1683b.t().V(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
