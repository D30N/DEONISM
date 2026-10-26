package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class q4 {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final long f1846b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f1847c;

    /* renamed from: d, reason: collision with root package name */
    private long f1848d;
    private final /* synthetic */ m4 e;

    public q4(m4 m4Var, String str, long j) {
        this.e = m4Var;
        com.google.android.gms.common.internal.q.g(str);
        this.a = str;
        this.f1846b = j;
    }

    public final long a() {
        if (!this.f1847c) {
            this.f1847c = true;
            this.f1848d = this.e.C().getLong(this.a, this.f1846b);
        }
        return this.f1848d;
    }

    public final void b(long j) {
        SharedPreferences.Editor editorEdit = this.e.C().edit();
        editorEdit.putLong(this.a, j);
        editorEdit.apply();
        this.f1848d = j;
    }
}
