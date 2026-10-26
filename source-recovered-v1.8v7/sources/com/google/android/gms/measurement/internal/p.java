package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class p extends com.google.android.gms.common.internal.v.a {
    public static final Parcelable.Creator<p> CREATOR = new s();

    /* renamed from: b, reason: collision with root package name */
    public final String f1832b;

    /* renamed from: c, reason: collision with root package name */
    public final o f1833c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1834d;
    public final long e;

    p(p pVar, long j) {
        com.google.android.gms.common.internal.q.k(pVar);
        this.f1832b = pVar.f1832b;
        this.f1833c = pVar.f1833c;
        this.f1834d = pVar.f1834d;
        this.e = j;
    }

    public p(String str, o oVar, String str2, long j) {
        this.f1832b = str;
        this.f1833c = oVar;
        this.f1834d = str2;
        this.e = j;
    }

    public final String toString() {
        String str = this.f1834d;
        String str2 = this.f1832b;
        String strValueOf = String.valueOf(this.f1833c);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(strValueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(strValueOf);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.v.c.a(parcel);
        com.google.android.gms.common.internal.v.c.n(parcel, 2, this.f1832b, false);
        com.google.android.gms.common.internal.v.c.m(parcel, 3, this.f1833c, i, false);
        com.google.android.gms.common.internal.v.c.n(parcel, 4, this.f1834d, false);
        com.google.android.gms.common.internal.v.c.k(parcel, 5, this.e);
        com.google.android.gms.common.internal.v.c.b(parcel, iA);
    }
}
