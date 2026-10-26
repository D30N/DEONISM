package com.google.android.gms.common.internal;

import android.util.Log;

/* loaded from: classes.dex */
public final class i {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1563b;

    public i(String str, String str2) {
        q.l(str, "log tag cannot be null");
        q.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f1563b = null;
        } else {
            this.f1563b = str2;
        }
    }

    private final String f(String str) {
        String str2 = this.f1563b;
        return str2 == null ? str : str2.concat(str);
    }

    public final boolean a(int i) {
        return Log.isLoggable(this.a, i);
    }

    public final void b(String str, String str2) {
        if (a(3)) {
            Log.d(str, f(str2));
        }
    }

    public final void c(String str, String str2) {
        if (a(6)) {
            Log.e(str, f(str2));
        }
    }

    public final void d(String str, String str2, Throwable th) {
        if (a(6)) {
            Log.e(str, f(str2), th);
        }
    }

    public final void e(String str, String str2) {
        if (a(2)) {
            Log.v(str, f(str2));
        }
    }
}
