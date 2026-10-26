package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b0 extends com.google.android.gms.common.internal.v.a {
    public static final Parcelable.Creator<b0> CREATOR = new c0();

    /* renamed from: b, reason: collision with root package name */
    Bundle f1541b;

    /* renamed from: c, reason: collision with root package name */
    d.b.a.a.c.d[] f1542c;

    public b0() {
    }

    b0(Bundle bundle, d.b.a.a.c.d[] dVarArr) {
        this.f1541b = bundle;
        this.f1542c = dVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.v.c.a(parcel);
        com.google.android.gms.common.internal.v.c.e(parcel, 1, this.f1541b, false);
        com.google.android.gms.common.internal.v.c.p(parcel, 2, this.f1542c, i, false);
        com.google.android.gms.common.internal.v.c.b(parcel, iA);
    }
}
