package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class o extends com.google.android.gms.common.internal.v.a implements Iterable<String> {
    public static final Parcelable.Creator<o> CREATOR = new q();

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f1816b;

    o(Bundle bundle) {
        this.f1816b = bundle;
    }

    public final int h() {
        return this.f1816b.size();
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new n(this);
    }

    final Object k(String str) {
        return this.f1816b.get(str);
    }

    public final Bundle l() {
        return new Bundle(this.f1816b);
    }

    final Long m(String str) {
        return Long.valueOf(this.f1816b.getLong(str));
    }

    final Double p(String str) {
        return Double.valueOf(this.f1816b.getDouble(str));
    }

    final String r(String str) {
        return this.f1816b.getString(str);
    }

    public final String toString() {
        return this.f1816b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.v.c.a(parcel);
        com.google.android.gms.common.internal.v.c.e(parcel, 2, l(), false);
        com.google.android.gms.common.internal.v.c.b(parcel, iA);
    }
}
