package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import d.b.a.a.d.a;

/* loaded from: classes.dex */
public final class g extends d.b.a.a.e.c.a implements f {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    @Override // com.google.android.gms.dynamite.f
    public final int D(d.b.a.a.d.a aVar, String str, boolean z) {
        Parcel parcelE = e();
        d.b.a.a.e.c.c.c(parcelE, aVar);
        parcelE.writeString(str);
        d.b.a.a.e.c.c.a(parcelE, z);
        Parcel parcelG = g(3, parcelE);
        int i = parcelG.readInt();
        parcelG.recycle();
        return i;
    }

    @Override // com.google.android.gms.dynamite.f
    public final int E() {
        Parcel parcelG = g(6, e());
        int i = parcelG.readInt();
        parcelG.recycle();
        return i;
    }

    @Override // com.google.android.gms.dynamite.f
    public final d.b.a.a.d.a O(d.b.a.a.d.a aVar, String str, int i) {
        Parcel parcelE = e();
        d.b.a.a.e.c.c.c(parcelE, aVar);
        parcelE.writeString(str);
        parcelE.writeInt(i);
        Parcel parcelG = g(4, parcelE);
        d.b.a.a.d.a aVarG = a.AbstractBinderC0096a.g(parcelG.readStrongBinder());
        parcelG.recycle();
        return aVarG;
    }

    @Override // com.google.android.gms.dynamite.f
    public final int i(d.b.a.a.d.a aVar, String str, boolean z) {
        Parcel parcelE = e();
        d.b.a.a.e.c.c.c(parcelE, aVar);
        parcelE.writeString(str);
        d.b.a.a.e.c.c.a(parcelE, z);
        Parcel parcelG = g(5, parcelE);
        int i = parcelG.readInt();
        parcelG.recycle();
        return i;
    }

    @Override // com.google.android.gms.dynamite.f
    public final d.b.a.a.d.a r(d.b.a.a.d.a aVar, String str, int i) {
        Parcel parcelE = e();
        d.b.a.a.e.c.c.c(parcelE, aVar);
        parcelE.writeString(str);
        parcelE.writeInt(i);
        Parcel parcelG = g(2, parcelE);
        d.b.a.a.d.a aVarG = a.AbstractBinderC0096a.g(parcelG.readStrongBinder());
        parcelG.recycle();
        return aVarG;
    }
}
