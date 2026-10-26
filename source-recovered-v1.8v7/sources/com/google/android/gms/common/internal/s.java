package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.k;

/* loaded from: classes.dex */
public class s extends com.google.android.gms.common.internal.v.a {
    public static final Parcelable.Creator<s> CREATOR = new a0();

    /* renamed from: b, reason: collision with root package name */
    private final int f1574b;

    /* renamed from: c, reason: collision with root package name */
    private IBinder f1575c;

    /* renamed from: d, reason: collision with root package name */
    private d.b.a.a.c.b f1576d;
    private boolean e;
    private boolean f;

    s(int i, IBinder iBinder, d.b.a.a.c.b bVar, boolean z, boolean z2) {
        this.f1574b = i;
        this.f1575c = iBinder;
        this.f1576d = bVar;
        this.e = z;
        this.f = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f1576d.equals(sVar.f1576d) && h().equals(sVar.h());
    }

    public k h() {
        return k.a.g(this.f1575c);
    }

    public d.b.a.a.c.b i() {
        return this.f1576d;
    }

    public boolean k() {
        return this.e;
    }

    public boolean l() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.v.c.a(parcel);
        com.google.android.gms.common.internal.v.c.j(parcel, 1, this.f1574b);
        com.google.android.gms.common.internal.v.c.i(parcel, 2, this.f1575c, false);
        com.google.android.gms.common.internal.v.c.m(parcel, 3, i(), i, false);
        com.google.android.gms.common.internal.v.c.c(parcel, 4, k());
        com.google.android.gms.common.internal.v.c.c(parcel, 5, l());
        com.google.android.gms.common.internal.v.c.b(parcel, iA);
    }
}
