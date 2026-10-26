package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.measurement.internal.h7;
import com.google.firebase.iid.FirebaseInstanceId;
import d.b.a.a.e.e.g;

/* loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* renamed from: b, reason: collision with root package name */
    private static volatile FirebaseAnalytics f2174b;
    private final g a;

    private FirebaseAnalytics(g gVar) {
        q.k(gVar);
        this.a = gVar;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f2174b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f2174b == null) {
                    f2174b = new FirebaseAnalytics(g.a(context));
                }
            }
        }
        return f2174b;
    }

    @Keep
    public static h7 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        g gVarB = g.b(context, null, null, null, bundle);
        if (gVarB == null) {
            return null;
        }
        return new b(gVarB);
    }

    @Keep
    public final String getFirebaseInstanceId() {
        return FirebaseInstanceId.b().a();
    }

    @Keep
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        this.a.i(activity, str, str2);
    }
}
