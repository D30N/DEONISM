package com.google.android.material.datepicker;

import android.os.Build;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
class e {
    static String a(long j) {
        return b(j, Locale.getDefault());
    }

    static String b(long j, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? o.b(locale).format(new Date(j)) : o.f(locale).format(new Date(j));
    }

    static String c(long j) {
        return d(j, Locale.getDefault());
    }

    static String d(long j, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? o.m(locale).format(new Date(j)) : o.f(locale).format(new Date(j));
    }
}
