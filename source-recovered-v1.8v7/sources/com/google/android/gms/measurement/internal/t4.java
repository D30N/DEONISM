package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;

/* loaded from: classes.dex */
public final class t4 {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1902b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1903c;

    /* renamed from: d, reason: collision with root package name */
    private final long f1904d;
    private final /* synthetic */ m4 e;

    private t4(m4 m4Var, String str, long j) {
        this.e = m4Var;
        com.google.android.gms.common.internal.q.g(str);
        com.google.android.gms.common.internal.q.a(j > 0);
        this.a = String.valueOf(str).concat(":start");
        this.f1902b = String.valueOf(str).concat(":count");
        this.f1903c = String.valueOf(str).concat(":value");
        this.f1904d = j;
    }

    private final void c() {
        this.e.c();
        long jA = this.e.k().a();
        SharedPreferences.Editor editorEdit = this.e.C().edit();
        editorEdit.remove(this.f1902b);
        editorEdit.remove(this.f1903c);
        editorEdit.putLong(this.a, jA);
        editorEdit.apply();
    }

    private final long d() {
        return this.e.C().getLong(this.a, 0L);
    }

    public final Pair<String, Long> a() {
        long jAbs;
        this.e.c();
        this.e.c();
        long jD = d();
        if (jD == 0) {
            c();
            jAbs = 0;
        } else {
            jAbs = Math.abs(jD - this.e.k().a());
        }
        long j = this.f1904d;
        if (jAbs < j) {
            return null;
        }
        if (jAbs > (j << 1)) {
            c();
            return null;
        }
        String string = this.e.C().getString(this.f1903c, null);
        long j2 = this.e.C().getLong(this.f1902b, 0L);
        c();
        return (string == null || j2 <= 0) ? m4.D : new Pair<>(string, Long.valueOf(j2));
    }

    public final void b(String str, long j) {
        this.e.c();
        if (d() == 0) {
            c();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.e.C().getLong(this.f1902b, 0L);
        if (j2 <= 0) {
            SharedPreferences.Editor editorEdit = this.e.C().edit();
            editorEdit.putString(this.f1903c, str);
            editorEdit.putLong(this.f1902b, 1L);
            editorEdit.apply();
            return;
        }
        long j3 = j2 + 1;
        boolean z = (this.e.g().H0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3;
        SharedPreferences.Editor editorEdit2 = this.e.C().edit();
        if (z) {
            editorEdit2.putString(this.f1903c, str);
        }
        editorEdit2.putLong(this.f1902b, j3);
        editorEdit2.apply();
    }
}
