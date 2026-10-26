package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.AdError;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p;

/* loaded from: classes.dex */
public final class Status extends com.google.android.gms.common.internal.v.a implements j, ReflectedParcelable {

    /* renamed from: b, reason: collision with root package name */
    private final int f1481b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1482c;

    /* renamed from: d, reason: collision with root package name */
    private final String f1483d;
    private final PendingIntent e;
    public static final Status f = new Status(0);
    public static final Status g = new Status(15);
    public static final Status h = new Status(16);
    public static final Parcelable.Creator<Status> CREATOR = new n();

    public Status(int i) {
        this(i, null);
    }

    Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.f1481b = i;
        this.f1482c = i2;
        this.f1483d = str;
        this.e = pendingIntent;
    }

    public Status(int i, String str) {
        this(1, i, str, null);
    }

    @Override // com.google.android.gms.common.api.j
    public final Status c() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f1481b == status.f1481b && this.f1482c == status.f1482c && p.a(this.f1483d, status.f1483d) && p.a(this.e, status.e);
    }

    public final int h() {
        return this.f1482c;
    }

    public final int hashCode() {
        return p.b(Integer.valueOf(this.f1481b), Integer.valueOf(this.f1482c), this.f1483d, this.e);
    }

    public final String i() {
        return this.f1483d;
    }

    public final boolean k() {
        return this.f1482c <= 0;
    }

    public final String l() {
        String str = this.f1483d;
        return str != null ? str : d.a(this.f1482c);
    }

    public final String toString() {
        p.a aVarC = p.c(this);
        aVarC.a("statusCode", l());
        aVarC.a("resolution", this.e);
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.v.c.a(parcel);
        com.google.android.gms.common.internal.v.c.j(parcel, 1, h());
        com.google.android.gms.common.internal.v.c.n(parcel, 2, i(), false);
        com.google.android.gms.common.internal.v.c.m(parcel, 3, this.e, i, false);
        com.google.android.gms.common.internal.v.c.j(parcel, AdError.NETWORK_ERROR_CODE, this.f1481b);
        com.google.android.gms.common.internal.v.c.b(parcel, iA);
    }
}
