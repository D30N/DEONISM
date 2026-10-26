package com.google.android.gms.measurement.module;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.measurement.internal.d5;

/* loaded from: classes.dex */
public class Analytics {
    private static volatile Analytics a;

    private Analytics(d5 d5Var) {
        q.k(d5Var);
    }

    @Keep
    public static Analytics getInstance(Context context) {
        if (a == null) {
            synchronized (Analytics.class) {
                if (a == null) {
                    a = new Analytics(d5.a(context, null, null));
                }
            }
        }
        return a;
    }
}
