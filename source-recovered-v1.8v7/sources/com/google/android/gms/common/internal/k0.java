package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import d.b.a.a.d.a;

/* loaded from: classes.dex */
public final class k0 extends d.b.a.a.e.c.a implements i0 {
    k0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.i0
    public final d.b.a.a.d.a b() {
        Parcel parcelG = g(1, e());
        d.b.a.a.d.a aVarG = a.AbstractBinderC0096a.g(parcelG.readStrongBinder());
        parcelG.recycle();
        return aVarG;
    }

    @Override // com.google.android.gms.common.internal.i0
    public final int c() {
        Parcel parcelG = g(2, e());
        int i = parcelG.readInt();
        parcelG.recycle();
        return i;
    }
}
