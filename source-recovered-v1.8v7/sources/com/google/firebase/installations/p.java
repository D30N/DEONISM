package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
class p {
    public static final long a = TimeUnit.HOURS.toSeconds(1);

    p() {
    }

    public long a() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    public boolean b(com.google.firebase.installations.q.d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < a() + a;
    }
}
