package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class o4 {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f1817b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f1818c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1819d;
    private final /* synthetic */ m4 e;

    public o4(m4 m4Var, String str, boolean z) {
        this.e = m4Var;
        com.google.android.gms.common.internal.q.g(str);
        this.a = str;
        this.f1817b = z;
    }

    public final void a(boolean z) {
        SharedPreferences.Editor editorEdit = this.e.C().edit();
        editorEdit.putBoolean(this.a, z);
        editorEdit.apply();
        this.f1819d = z;
    }

    public final boolean b() {
        if (!this.f1818c) {
            this.f1818c = true;
            this.f1819d = this.e.C().getBoolean(this.a, this.f1817b);
        }
        return this.f1819d;
    }
}
