package d.b.a.a.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p;

/* loaded from: classes.dex */
public class d extends com.google.android.gms.common.internal.v.a {
    public static final Parcelable.Creator<d> CREATOR = new p();

    /* renamed from: b, reason: collision with root package name */
    private final String f2604b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    private final int f2605c;

    /* renamed from: d, reason: collision with root package name */
    private final long f2606d;

    public d(String str, int i, long j) {
        this.f2604b = str;
        this.f2605c = i;
        this.f2606d = j;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (((h() != null && h().equals(dVar.h())) || (h() == null && dVar.h() == null)) && i() == dVar.i()) {
                return true;
            }
        }
        return false;
    }

    public String h() {
        return this.f2604b;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.p.b(h(), Long.valueOf(i()));
    }

    public long i() {
        long j = this.f2606d;
        return j == -1 ? this.f2605c : j;
    }

    public String toString() {
        p.a aVarC = com.google.android.gms.common.internal.p.c(this);
        aVarC.a("name", h());
        aVarC.a("version", Long.valueOf(i()));
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.v.c.a(parcel);
        com.google.android.gms.common.internal.v.c.n(parcel, 1, h(), false);
        com.google.android.gms.common.internal.v.c.j(parcel, 2, this.f2605c);
        com.google.android.gms.common.internal.v.c.k(parcel, 3, i());
        com.google.android.gms.common.internal.v.c.b(parcel, iA);
    }
}
