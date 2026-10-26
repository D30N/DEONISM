package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    ArrayList<m> f470b;

    /* renamed from: c, reason: collision with root package name */
    ArrayList<String> f471c;

    /* renamed from: d, reason: collision with root package name */
    b[] f472d;
    String e;
    int f;

    static class a implements Parcelable.Creator<k> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public k[] newArray(int i) {
            return new k[i];
        }
    }

    public k() {
        this.e = null;
    }

    public k(Parcel parcel) {
        this.e = null;
        this.f470b = parcel.createTypedArrayList(m.CREATOR);
        this.f471c = parcel.createStringArrayList();
        this.f472d = (b[]) parcel.createTypedArray(b.CREATOR);
        this.e = parcel.readString();
        this.f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f470b);
        parcel.writeStringList(this.f471c);
        parcel.writeTypedArray(this.f472d, i);
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
    }
}
