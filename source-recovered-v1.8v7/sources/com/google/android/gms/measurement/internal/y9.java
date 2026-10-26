package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class y9 extends com.google.android.gms.common.internal.v.a {
    public static final Parcelable.Creator<y9> CREATOR = new x9();

    /* renamed from: b, reason: collision with root package name */
    private final int f1964b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1965c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1966d;
    public final Long e;
    public final String f;
    public final String g;
    public final Double h;

    y9(int i, String str, long j, Long l, Float f, String str2, String str3, Double d2) {
        this.f1964b = i;
        this.f1965c = str;
        this.f1966d = j;
        this.e = l;
        if (i == 1) {
            this.h = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.h = d2;
        }
        this.f = str2;
        this.g = str3;
    }

    y9(aa aaVar) {
        this(aaVar.f1625c, aaVar.f1626d, aaVar.e, aaVar.f1624b);
    }

    y9(String str, long j, Object obj, String str2) {
        com.google.android.gms.common.internal.q.g(str);
        this.f1964b = 2;
        this.f1965c = str;
        this.f1966d = j;
        this.g = str2;
        if (obj == null) {
            this.e = null;
            this.h = null;
            this.f = null;
            return;
        }
        if (obj instanceof Long) {
            this.e = (Long) obj;
            this.h = null;
            this.f = null;
        } else if (obj instanceof String) {
            this.e = null;
            this.h = null;
            this.f = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("User attribute given of un-supported type");
            }
            this.e = null;
            this.h = (Double) obj;
            this.f = null;
        }
    }

    public final Object h() {
        Long l = this.e;
        if (l != null) {
            return l;
        }
        Double d2 = this.h;
        if (d2 != null) {
            return d2;
        }
        String str = this.f;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.v.c.a(parcel);
        com.google.android.gms.common.internal.v.c.j(parcel, 1, this.f1964b);
        com.google.android.gms.common.internal.v.c.n(parcel, 2, this.f1965c, false);
        com.google.android.gms.common.internal.v.c.k(parcel, 3, this.f1966d);
        com.google.android.gms.common.internal.v.c.l(parcel, 4, this.e, false);
        com.google.android.gms.common.internal.v.c.h(parcel, 5, null, false);
        com.google.android.gms.common.internal.v.c.n(parcel, 6, this.f, false);
        com.google.android.gms.common.internal.v.c.n(parcel, 7, this.g, false);
        com.google.android.gms.common.internal.v.c.f(parcel, 8, this.h, false);
        com.google.android.gms.common.internal.v.c.b(parcel, iA);
    }
}
