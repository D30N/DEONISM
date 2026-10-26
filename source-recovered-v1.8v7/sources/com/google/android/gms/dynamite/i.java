package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import d.b.a.a.d.a;

/* loaded from: classes.dex */
public final class i extends d.b.a.a.e.c.a implements h {
    i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    @Override // com.google.android.gms.dynamite.h
    public final d.b.a.a.d.a B(d.b.a.a.d.a aVar, String str, int i, d.b.a.a.d.a aVar2) {
        Parcel parcelE = e();
        d.b.a.a.e.c.c.c(parcelE, aVar);
        parcelE.writeString(str);
        parcelE.writeInt(i);
        d.b.a.a.e.c.c.c(parcelE, aVar2);
        Parcel parcelG = g(3, parcelE);
        d.b.a.a.d.a aVarG = a.AbstractBinderC0096a.g(parcelG.readStrongBinder());
        parcelG.recycle();
        return aVarG;
    }

    @Override // com.google.android.gms.dynamite.h
    public final d.b.a.a.d.a z(d.b.a.a.d.a aVar, String str, int i, d.b.a.a.d.a aVar2) {
        Parcel parcelE = e();
        d.b.a.a.e.c.c.c(parcelE, aVar);
        parcelE.writeString(str);
        parcelE.writeInt(i);
        d.b.a.a.e.c.c.c(parcelE, aVar2);
        Parcel parcelG = g(2, parcelE);
        d.b.a.a.d.a aVarG = a.AbstractBinderC0096a.g(parcelG.readStrongBinder());
        parcelG.recycle();
        return aVarG;
    }
}
