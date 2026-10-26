package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class t3 extends d.b.a.a.e.e.a implements r3 {
    t3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void C(p pVar, String str, String str2) {
        Parcel parcelE = e();
        d.b.a.a.e.e.v.c(parcelE, pVar);
        parcelE.writeString(str);
        parcelE.writeString(str2);
        h(5, parcelE);
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void F(fa faVar) {
        Parcel parcelE = e();
        d.b.a.a.e.e.v.c(parcelE, faVar);
        h(6, parcelE);
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void G(long j, String str, String str2, String str3) {
        Parcel parcelE = e();
        parcelE.writeLong(j);
        parcelE.writeString(str);
        parcelE.writeString(str2);
        parcelE.writeString(str3);
        h(10, parcelE);
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final List<y9> H(String str, String str2, String str3, boolean z) {
        Parcel parcelE = e();
        parcelE.writeString(str);
        parcelE.writeString(str2);
        parcelE.writeString(str3);
        d.b.a.a.e.e.v.d(parcelE, z);
        Parcel parcelG = g(15, parcelE);
        ArrayList arrayListCreateTypedArrayList = parcelG.createTypedArrayList(y9.CREATOR);
        parcelG.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void J(fa faVar) {
        Parcel parcelE = e();
        d.b.a.a.e.e.v.c(parcelE, faVar);
        h(18, parcelE);
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final List<oa> K(String str, String str2, String str3) {
        Parcel parcelE = e();
        parcelE.writeString(str);
        parcelE.writeString(str2);
        parcelE.writeString(str3);
        Parcel parcelG = g(17, parcelE);
        ArrayList arrayListCreateTypedArrayList = parcelG.createTypedArrayList(oa.CREATOR);
        parcelG.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final List<oa> M(String str, String str2, fa faVar) {
        Parcel parcelE = e();
        parcelE.writeString(str);
        parcelE.writeString(str2);
        d.b.a.a.e.e.v.c(parcelE, faVar);
        Parcel parcelG = g(16, parcelE);
        ArrayList arrayListCreateTypedArrayList = parcelG.createTypedArrayList(oa.CREATOR);
        parcelG.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void Q(y9 y9Var, fa faVar) {
        Parcel parcelE = e();
        d.b.a.a.e.e.v.c(parcelE, y9Var);
        d.b.a.a.e.e.v.c(parcelE, faVar);
        h(2, parcelE);
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final List<y9> j(String str, String str2, boolean z, fa faVar) {
        Parcel parcelE = e();
        parcelE.writeString(str);
        parcelE.writeString(str2);
        d.b.a.a.e.e.v.d(parcelE, z);
        d.b.a.a.e.e.v.c(parcelE, faVar);
        Parcel parcelG = g(14, parcelE);
        ArrayList arrayListCreateTypedArrayList = parcelG.createTypedArrayList(y9.CREATOR);
        parcelG.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final List<y9> k(fa faVar, boolean z) {
        Parcel parcelE = e();
        d.b.a.a.e.e.v.c(parcelE, faVar);
        d.b.a.a.e.e.v.d(parcelE, z);
        Parcel parcelG = g(7, parcelE);
        ArrayList arrayListCreateTypedArrayList = parcelG.createTypedArrayList(y9.CREATOR);
        parcelG.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void l(oa oaVar, fa faVar) {
        Parcel parcelE = e();
        d.b.a.a.e.e.v.c(parcelE, oaVar);
        d.b.a.a.e.e.v.c(parcelE, faVar);
        h(12, parcelE);
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void m(fa faVar) {
        Parcel parcelE = e();
        d.b.a.a.e.e.v.c(parcelE, faVar);
        h(4, parcelE);
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final String o(fa faVar) {
        Parcel parcelE = e();
        d.b.a.a.e.e.v.c(parcelE, faVar);
        Parcel parcelG = g(11, parcelE);
        String string = parcelG.readString();
        parcelG.recycle();
        return string;
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void q(Bundle bundle, fa faVar) {
        Parcel parcelE = e();
        d.b.a.a.e.e.v.c(parcelE, bundle);
        d.b.a.a.e.e.v.c(parcelE, faVar);
        h(19, parcelE);
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final byte[] t(p pVar, String str) {
        Parcel parcelE = e();
        d.b.a.a.e.e.v.c(parcelE, pVar);
        parcelE.writeString(str);
        Parcel parcelG = g(9, parcelE);
        byte[] bArrCreateByteArray = parcelG.createByteArray();
        parcelG.recycle();
        return bArrCreateByteArray;
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void w(oa oaVar) {
        Parcel parcelE = e();
        d.b.a.a.e.e.v.c(parcelE, oaVar);
        h(13, parcelE);
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void x(p pVar, fa faVar) {
        Parcel parcelE = e();
        d.b.a.a.e.e.v.c(parcelE, pVar);
        d.b.a.a.e.e.v.c(parcelE, faVar);
        h(1, parcelE);
    }
}
