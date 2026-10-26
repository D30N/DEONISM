package com.google.android.gms.common.api.internal;

import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class e0 {
    private final b.d.a<d0<?>, d.b.a.a.c.b> a;

    /* renamed from: b, reason: collision with root package name */
    private final b.d.a<d0<?>, String> f1512b;

    /* renamed from: c, reason: collision with root package name */
    private final d.b.a.a.h.i<Map<d0<?>, String>> f1513c;

    /* renamed from: d, reason: collision with root package name */
    private int f1514d;
    private boolean e;

    public final void a(d0<?> d0Var, d.b.a.a.c.b bVar, String str) {
        this.a.put(d0Var, bVar);
        this.f1512b.put(d0Var, str);
        this.f1514d--;
        if (!bVar.m()) {
            this.e = true;
        }
        if (this.f1514d == 0) {
            if (!this.e) {
                this.f1513c.c(this.f1512b);
            } else {
                this.f1513c.b(new com.google.android.gms.common.api.c(this.a));
            }
        }
    }

    public final Set<d0<?>> b() {
        return this.a.keySet();
    }
}
