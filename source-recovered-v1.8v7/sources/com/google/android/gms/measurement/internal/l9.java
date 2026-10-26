package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
final class l9 {
    final /* synthetic */ c9 a;

    l9(c9 c9Var) {
        this.a = c9Var;
    }

    private final void c(long j, boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.a.c();
        if (this.a.a.p()) {
            this.a.l().u.b(j);
            this.a.m().O().b("Session started, time", Long.valueOf(this.a.k().b()));
            Long lValueOf = Long.valueOf(j / 1000);
            this.a.q().T("auto", "_sid", lValueOf, j);
            this.a.l().r.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", lValueOf.longValue());
            if (this.a.n().t(r.q0) && z) {
                bundle.putLong("_aib", 1L);
            }
            this.a.q().O("auto", "_s", j, bundle);
            if (d.b.a.a.e.e.n9.b() && this.a.n().t(r.v0)) {
                String strA = this.a.l().z.a();
                if (TextUtils.isEmpty(strA)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", strA);
                this.a.q().O("auto", "_ssr", j, bundle2);
            }
        }
    }

    final void a() {
        this.a.c();
        if (this.a.l().w(this.a.k().a())) {
            this.a.l().r.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.a.m().O().a("Detected application was in foreground");
                c(this.a.k().a(), false);
            }
        }
    }

    final void b(long j, boolean z) {
        this.a.c();
        this.a.G();
        if (this.a.l().w(j)) {
            this.a.l().r.a(true);
        }
        this.a.l().u.b(j);
        if (this.a.l().r.b()) {
            c(j, z);
        }
    }
}
