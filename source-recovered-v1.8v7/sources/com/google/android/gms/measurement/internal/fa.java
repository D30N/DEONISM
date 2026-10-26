package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class fa extends com.google.android.gms.common.internal.v.a {
    public static final Parcelable.Creator<fa> CREATOR = new ea();

    /* renamed from: b, reason: collision with root package name */
    public final String f1702b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1703c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1704d;
    public final String e;
    public final long f;
    public final long g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final long k;
    public final String l;
    public final long m;
    public final long n;
    public final int o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final String s;
    public final Boolean t;
    public final long u;
    public final List<String> v;
    public final String w;

    fa(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, String str7, Boolean bool, long j6, List<String> list, String str8) {
        com.google.android.gms.common.internal.q.g(str);
        this.f1702b = str;
        this.f1703c = TextUtils.isEmpty(str2) ? null : str2;
        this.f1704d = str3;
        this.k = j;
        this.e = str4;
        this.f = j2;
        this.g = j3;
        this.h = str5;
        this.i = z;
        this.j = z2;
        this.l = str6;
        this.m = j4;
        this.n = j5;
        this.o = i;
        this.p = z3;
        this.q = z4;
        this.r = z5;
        this.s = str7;
        this.t = bool;
        this.u = j6;
        this.v = list;
        this.w = str8;
    }

    fa(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, String str7, Boolean bool, long j6, List<String> list, String str8) {
        this.f1702b = str;
        this.f1703c = str2;
        this.f1704d = str3;
        this.k = j3;
        this.e = str4;
        this.f = j;
        this.g = j2;
        this.h = str5;
        this.i = z;
        this.j = z2;
        this.l = str6;
        this.m = j4;
        this.n = j5;
        this.o = i;
        this.p = z3;
        this.q = z4;
        this.r = z5;
        this.s = str7;
        this.t = bool;
        this.u = j6;
        this.v = list;
        this.w = str8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.v.c.a(parcel);
        com.google.android.gms.common.internal.v.c.n(parcel, 2, this.f1702b, false);
        com.google.android.gms.common.internal.v.c.n(parcel, 3, this.f1703c, false);
        com.google.android.gms.common.internal.v.c.n(parcel, 4, this.f1704d, false);
        com.google.android.gms.common.internal.v.c.n(parcel, 5, this.e, false);
        com.google.android.gms.common.internal.v.c.k(parcel, 6, this.f);
        com.google.android.gms.common.internal.v.c.k(parcel, 7, this.g);
        com.google.android.gms.common.internal.v.c.n(parcel, 8, this.h, false);
        com.google.android.gms.common.internal.v.c.c(parcel, 9, this.i);
        com.google.android.gms.common.internal.v.c.c(parcel, 10, this.j);
        com.google.android.gms.common.internal.v.c.k(parcel, 11, this.k);
        com.google.android.gms.common.internal.v.c.n(parcel, 12, this.l, false);
        com.google.android.gms.common.internal.v.c.k(parcel, 13, this.m);
        com.google.android.gms.common.internal.v.c.k(parcel, 14, this.n);
        com.google.android.gms.common.internal.v.c.j(parcel, 15, this.o);
        com.google.android.gms.common.internal.v.c.c(parcel, 16, this.p);
        com.google.android.gms.common.internal.v.c.c(parcel, 17, this.q);
        com.google.android.gms.common.internal.v.c.c(parcel, 18, this.r);
        com.google.android.gms.common.internal.v.c.n(parcel, 19, this.s, false);
        com.google.android.gms.common.internal.v.c.d(parcel, 21, this.t, false);
        com.google.android.gms.common.internal.v.c.k(parcel, 22, this.u);
        com.google.android.gms.common.internal.v.c.o(parcel, 23, this.v, false);
        com.google.android.gms.common.internal.v.c.n(parcel, 24, this.w, false);
        com.google.android.gms.common.internal.v.c.b(parcel, iA);
    }
}
