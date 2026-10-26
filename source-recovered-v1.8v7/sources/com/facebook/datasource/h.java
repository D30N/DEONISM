package com.facebook.datasource;

import d.a.b.d.i;

/* loaded from: classes.dex */
public class h<T> extends a<T> {
    private h() {
    }

    public static <T> h<T> u() {
        return new h<>();
    }

    @Override // com.facebook.datasource.a
    public boolean n(Throwable th) {
        i.g(th);
        return super.n(th);
    }

    @Override // com.facebook.datasource.a
    public boolean p(float f) {
        return super.p(f);
    }

    @Override // com.facebook.datasource.a
    public boolean r(T t, boolean z) {
        i.g(t);
        return super.r(t, z);
    }
}
