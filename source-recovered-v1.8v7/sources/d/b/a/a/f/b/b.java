package d.b.a.a.f.b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class b extends com.google.android.gms.common.internal.v.a implements com.google.android.gms.common.api.j {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: b, reason: collision with root package name */
    private final int f2908b;

    /* renamed from: c, reason: collision with root package name */
    private int f2909c;

    /* renamed from: d, reason: collision with root package name */
    private Intent f2910d;

    public b() {
        this(0, null);
    }

    b(int i, int i2, Intent intent) {
        this.f2908b = i;
        this.f2909c = i2;
        this.f2910d = intent;
    }

    private b(int i, Intent intent) {
        this(2, 0, null);
    }

    @Override // com.google.android.gms.common.api.j
    public final Status c() {
        return this.f2909c == 0 ? Status.f : Status.h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.v.c.a(parcel);
        com.google.android.gms.common.internal.v.c.j(parcel, 1, this.f2908b);
        com.google.android.gms.common.internal.v.c.j(parcel, 2, this.f2909c);
        com.google.android.gms.common.internal.v.c.m(parcel, 3, this.f2910d, i, false);
        com.google.android.gms.common.internal.v.c.b(parcel, iA);
    }
}
