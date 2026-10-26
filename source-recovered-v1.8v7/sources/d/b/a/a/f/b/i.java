package d.b.a.a.f.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;

/* loaded from: classes.dex */
public final class i extends com.google.android.gms.common.internal.v.a {
    public static final Parcelable.Creator<i> CREATOR = new j();

    /* renamed from: b, reason: collision with root package name */
    private final int f2911b;

    /* renamed from: c, reason: collision with root package name */
    private final r f2912c;

    i(int i, r rVar) {
        this.f2911b = i;
        this.f2912c = rVar;
    }

    public i(r rVar) {
        this(1, rVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.v.c.a(parcel);
        com.google.android.gms.common.internal.v.c.j(parcel, 1, this.f2911b);
        com.google.android.gms.common.internal.v.c.m(parcel, 2, this.f2912c, i, false);
        com.google.android.gms.common.internal.v.c.b(parcel, iA);
    }
}
