package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0070a();

    /* renamed from: b, reason: collision with root package name */
    private final i f2033b;

    /* renamed from: c, reason: collision with root package name */
    private final i f2034c;

    /* renamed from: d, reason: collision with root package name */
    private final i f2035d;
    private final b e;
    private final int f;
    private final int g;

    /* renamed from: com.google.android.material.datepicker.a$a, reason: collision with other inner class name */
    static class C0070a implements Parcelable.Creator<a> {
        C0070a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a((i) parcel.readParcelable(i.class.getClassLoader()), (i) parcel.readParcelable(i.class.getClassLoader()), (i) parcel.readParcelable(i.class.getClassLoader()), (b) parcel.readParcelable(b.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i) {
            return new a[i];
        }
    }

    public interface b extends Parcelable {
        boolean o(long j);
    }

    private a(i iVar, i iVar2, i iVar3, b bVar) {
        this.f2033b = iVar;
        this.f2034c = iVar2;
        this.f2035d = iVar3;
        this.e = bVar;
        if (iVar.compareTo(iVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (iVar3.compareTo(iVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.g = iVar.q(iVar2) + 1;
        this.f = (iVar2.e - iVar.e) + 1;
    }

    /* synthetic */ a(i iVar, i iVar2, i iVar3, b bVar, C0070a c0070a) {
        this(iVar, iVar2, iVar3, bVar);
    }

    public b a() {
        return this.e;
    }

    i b() {
        return this.f2034c;
    }

    int c() {
        return this.g;
    }

    i d() {
        return this.f2035d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    i e() {
        return this.f2033b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f2033b.equals(aVar.f2033b) && this.f2034c.equals(aVar.f2034c) && this.f2035d.equals(aVar.f2035d) && this.e.equals(aVar.e);
    }

    int f() {
        return this.f;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2033b, this.f2034c, this.f2035d, this.e});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f2033b, 0);
        parcel.writeParcelable(this.f2034c, 0);
        parcel.writeParcelable(this.f2035d, 0);
        parcel.writeParcelable(this.e, 0);
    }
}
