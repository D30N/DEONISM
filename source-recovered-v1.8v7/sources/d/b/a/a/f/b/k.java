package d.b.a.a.f.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;

/* loaded from: classes.dex */
public final class k extends com.google.android.gms.common.internal.v.a {
    public static final Parcelable.Creator<k> CREATOR = new l();

    /* renamed from: b, reason: collision with root package name */
    private final int f2913b;

    /* renamed from: c, reason: collision with root package name */
    private final d.b.a.a.c.b f2914c;

    /* renamed from: d, reason: collision with root package name */
    private final s f2915d;

    public k(int i) {
        this(new d.b.a.a.c.b(8, null), null);
    }

    k(int i, d.b.a.a.c.b bVar, s sVar) {
        this.f2913b = i;
        this.f2914c = bVar;
        this.f2915d = sVar;
    }

    private k(d.b.a.a.c.b bVar, s sVar) {
        this(1, bVar, null);
    }

    public final d.b.a.a.c.b h() {
        return this.f2914c;
    }

    public final s i() {
        return this.f2915d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.v.c.a(parcel);
        com.google.android.gms.common.internal.v.c.j(parcel, 1, this.f2913b);
        com.google.android.gms.common.internal.v.c.m(parcel, 2, this.f2914c, i, false);
        com.google.android.gms.common.internal.v.c.m(parcel, 3, this.f2915d, i, false);
        com.google.android.gms.common.internal.v.c.b(parcel, iA);
    }
}
