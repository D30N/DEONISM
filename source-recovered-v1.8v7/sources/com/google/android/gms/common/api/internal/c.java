package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.o0;
import javax.annotation.concurrent.GuardedBy;

@Deprecated
/* loaded from: classes.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    private static final Object f1505d = new Object();

    @GuardedBy("sLock")
    private static c e;
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final Status f1506b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f1507c;

    c(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(d.b.a.a.c.k.common_google_play_services_unknown_issue));
        if (identifier != 0) {
            this.f1507c = !(resources.getInteger(identifier) != 0);
        } else {
            this.f1507c = false;
        }
        String strA = o0.a(context);
        strA = strA == null ? new com.google.android.gms.common.internal.u(context).a("google_app_id") : strA;
        if (TextUtils.isEmpty(strA)) {
            this.f1506b = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.a = null;
        } else {
            this.a = strA;
            this.f1506b = Status.f;
        }
    }

    private static c a(String str) {
        c cVar;
        synchronized (f1505d) {
            if (e == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
            cVar = e;
        }
        return cVar;
    }

    public static String b() {
        return a("getGoogleAppId").a;
    }

    public static Status c(Context context) {
        Status status;
        com.google.android.gms.common.internal.q.l(context, "Context must not be null.");
        synchronized (f1505d) {
            if (e == null) {
                e = new c(context);
            }
            status = e.f1506b;
        }
        return status;
    }

    public static boolean d() {
        return a("isMeasurementExplicitlyDisabled").f1507c;
    }
}
