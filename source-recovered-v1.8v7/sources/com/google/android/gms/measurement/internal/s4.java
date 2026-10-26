package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class s4 {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f1890b;

    /* renamed from: c, reason: collision with root package name */
    private String f1891c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ m4 f1892d;

    public s4(m4 m4Var, String str, String str2) {
        this.f1892d = m4Var;
        com.google.android.gms.common.internal.q.g(str);
        this.a = str;
    }

    public final String a() {
        if (!this.f1890b) {
            this.f1890b = true;
            this.f1891c = this.f1892d.C().getString(this.a, null);
        }
        return this.f1891c;
    }

    public final void b(String str) {
        if (this.f1892d.n().t(r.x0) || !z9.A0(str, this.f1891c)) {
            SharedPreferences.Editor editorEdit = this.f1892d.C().edit();
            editorEdit.putString(this.a, str);
            editorEdit.apply();
            this.f1891c = str;
        }
    }
}
