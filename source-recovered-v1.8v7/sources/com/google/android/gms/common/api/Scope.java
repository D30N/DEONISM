package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.q;

/* loaded from: classes.dex */
public final class Scope extends com.google.android.gms.common.internal.v.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new m();

    /* renamed from: b, reason: collision with root package name */
    private final int f1479b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1480c;

    Scope(int i, String str) {
        q.h(str, "scopeUri must not be null or empty");
        this.f1479b = i;
        this.f1480c = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f1480c.equals(((Scope) obj).f1480c);
        }
        return false;
    }

    public final String h() {
        return this.f1480c;
    }

    public final int hashCode() {
        return this.f1480c.hashCode();
    }

    public final String toString() {
        return this.f1480c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.v.c.a(parcel);
        com.google.android.gms.common.internal.v.c.j(parcel, 1, this.f1479b);
        com.google.android.gms.common.internal.v.c.n(parcel, 2, h(), false);
        com.google.android.gms.common.internal.v.c.b(parcel, iA);
    }
}
