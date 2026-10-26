package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.a;

/* loaded from: classes.dex */
public class t<T extends IInterface> extends g<T> {
    private final a.h<T> y;

    @Override // com.google.android.gms.common.internal.b
    protected void H(int i, T t) {
        this.y.p(i, t);
    }

    @Override // com.google.android.gms.common.internal.b
    protected String g() {
        return this.y.g();
    }

    @Override // com.google.android.gms.common.internal.b
    protected T i(IBinder iBinder) {
        return (T) this.y.i(iBinder);
    }

    public a.h<T> k0() {
        return this.y;
    }

    @Override // com.google.android.gms.common.internal.b
    protected String n() {
        return this.y.n();
    }

    @Override // com.google.android.gms.common.internal.g, com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public int q() {
        return super.q();
    }
}
