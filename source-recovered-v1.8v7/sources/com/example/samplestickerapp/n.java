package com.example.samplestickerapp;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    String f1090b;

    /* renamed from: c, reason: collision with root package name */
    String f1091c;

    /* renamed from: d, reason: collision with root package name */
    String f1092d;
    String e;
    final String f;
    final String g;
    final String h;
    final String i;
    String j;
    private List<m> k;
    private long l;
    String m;
    private boolean n;

    static class a implements Parcelable.Creator<n> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public n createFromParcel(Parcel parcel) {
            return new n(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public n[] newArray(int i) {
            return new n[i];
        }
    }

    protected n(Parcel parcel) {
        this.f1090b = parcel.readString();
        this.f1091c = parcel.readString();
        this.f1092d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.j = parcel.readString();
        this.k = parcel.createTypedArrayList(m.CREATOR);
        this.l = parcel.readLong();
        this.m = parcel.readString();
        this.n = parcel.readByte() != 0;
    }

    n(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f1090b = str;
        this.f1091c = str2;
        this.f1092d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
    }

    boolean a() {
        return this.n;
    }

    public List<m> b() {
        return this.k;
    }

    public long c() {
        return this.l;
    }

    public void d(String str) {
        this.m = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void e(String str) {
        this.j = str;
    }

    void f(boolean z) {
        this.n = z;
    }

    void g(List<m> list) {
        this.k = list;
        this.l = 0L;
        Iterator<m> it = list.iterator();
        while (it.hasNext()) {
            this.l += it.next().f1089d;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1090b);
        parcel.writeString(this.f1091c);
        parcel.writeString(this.f1092d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeTypedList(this.k);
        parcel.writeLong(this.l);
        parcel.writeString(this.m);
        parcel.writeByte(this.n ? (byte) 1 : (byte) 0);
    }
}
