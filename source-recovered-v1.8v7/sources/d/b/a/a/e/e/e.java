package d.b.a.a.e.e;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class e extends com.google.android.gms.common.internal.v.a {
    public static final Parcelable.Creator<e> CREATOR = new h();

    /* renamed from: b, reason: collision with root package name */
    public final long f2664b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2665c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2666d;
    public final String e;
    public final String f;
    public final String g;
    public final Bundle h;

    public e(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle) {
        this.f2664b = j;
        this.f2665c = j2;
        this.f2666d = z;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.v.c.a(parcel);
        com.google.android.gms.common.internal.v.c.k(parcel, 1, this.f2664b);
        com.google.android.gms.common.internal.v.c.k(parcel, 2, this.f2665c);
        com.google.android.gms.common.internal.v.c.c(parcel, 3, this.f2666d);
        com.google.android.gms.common.internal.v.c.n(parcel, 4, this.e, false);
        com.google.android.gms.common.internal.v.c.n(parcel, 5, this.f, false);
        com.google.android.gms.common.internal.v.c.n(parcel, 6, this.g, false);
        com.google.android.gms.common.internal.v.c.e(parcel, 7, this.h, false);
        com.google.android.gms.common.internal.v.c.b(parcel, iA);
    }
}
