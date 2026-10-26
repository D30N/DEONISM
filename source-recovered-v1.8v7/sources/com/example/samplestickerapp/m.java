package com.example.samplestickerapp;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    String f1087b;

    /* renamed from: c, reason: collision with root package name */
    List<String> f1088c;

    /* renamed from: d, reason: collision with root package name */
    long f1089d;

    static class a implements Parcelable.Creator<m> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i) {
            return new m[i];
        }
    }

    protected m(Parcel parcel) {
        this.f1087b = parcel.readString();
        this.f1088c = parcel.createStringArrayList();
        this.f1089d = parcel.readLong();
    }

    m(String str, List<String> list) {
        this.f1087b = str;
        this.f1088c = list;
    }

    public void a(long j) {
        this.f1089d = j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1087b);
        parcel.writeStringList(this.f1088c);
        parcel.writeLong(this.f1089d);
    }
}
