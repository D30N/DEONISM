package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class oa extends com.google.android.gms.common.internal.v.a {
    public static final Parcelable.Creator<oa> CREATOR = new ra();

    /* renamed from: b, reason: collision with root package name */
    public String f1829b;

    /* renamed from: c, reason: collision with root package name */
    public String f1830c;

    /* renamed from: d, reason: collision with root package name */
    public y9 f1831d;
    public long e;
    public boolean f;
    public String g;
    public p h;
    public long i;
    public p j;
    public long k;
    public p l;

    oa(oa oaVar) {
        com.google.android.gms.common.internal.q.k(oaVar);
        this.f1829b = oaVar.f1829b;
        this.f1830c = oaVar.f1830c;
        this.f1831d = oaVar.f1831d;
        this.e = oaVar.e;
        this.f = oaVar.f;
        this.g = oaVar.g;
        this.h = oaVar.h;
        this.i = oaVar.i;
        this.j = oaVar.j;
        this.k = oaVar.k;
        this.l = oaVar.l;
    }

    oa(String str, String str2, y9 y9Var, long j, boolean z, String str3, p pVar, long j2, p pVar2, long j3, p pVar3) {
        this.f1829b = str;
        this.f1830c = str2;
        this.f1831d = y9Var;
        this.e = j;
        this.f = z;
        this.g = str3;
        this.h = pVar;
        this.i = j2;
        this.j = pVar2;
        this.k = j3;
        this.l = pVar3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.v.c.a(parcel);
        com.google.android.gms.common.internal.v.c.n(parcel, 2, this.f1829b, false);
        com.google.android.gms.common.internal.v.c.n(parcel, 3, this.f1830c, false);
        com.google.android.gms.common.internal.v.c.m(parcel, 4, this.f1831d, i, false);
        com.google.android.gms.common.internal.v.c.k(parcel, 5, this.e);
        com.google.android.gms.common.internal.v.c.c(parcel, 6, this.f);
        com.google.android.gms.common.internal.v.c.n(parcel, 7, this.g, false);
        com.google.android.gms.common.internal.v.c.m(parcel, 8, this.h, i, false);
        com.google.android.gms.common.internal.v.c.k(parcel, 9, this.i);
        com.google.android.gms.common.internal.v.c.m(parcel, 10, this.j, i, false);
        com.google.android.gms.common.internal.v.c.k(parcel, 11, this.k);
        com.google.android.gms.common.internal.v.c.m(parcel, 12, this.l, i, false);
        com.google.android.gms.common.internal.v.c.b(parcel, iA);
    }
}
