package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;

/* loaded from: classes.dex */
public final class d0<O extends a.d> {
    private final boolean a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1509b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.common.api.a<O> f1510c;

    /* renamed from: d, reason: collision with root package name */
    private final O f1511d;

    public final String a() {
        return this.f1510c.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return !this.a && !d0Var.a && com.google.android.gms.common.internal.p.a(this.f1510c, d0Var.f1510c) && com.google.android.gms.common.internal.p.a(this.f1511d, d0Var.f1511d);
    }

    public final int hashCode() {
        return this.f1509b;
    }
}
