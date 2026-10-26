package d.b.a.b.a0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import b.d.g;

/* loaded from: classes.dex */
public class a extends b.i.a.a {
    public static final Parcelable.Creator<a> CREATOR = new C0098a();

    /* renamed from: d, reason: collision with root package name */
    public final g<String, Bundle> f2957d;

    /* renamed from: d.b.a.b.a0.a$a, reason: collision with other inner class name */
    static class C0098a implements Parcelable.ClassLoaderCreator<a> {
        C0098a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i) {
            return new a[i];
        }
    }

    private a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        String[] strArr = new String[i];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f2957d = new g<>(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f2957d.put(strArr[i2], bundleArr[i2]);
        }
    }

    /* synthetic */ a(Parcel parcel, ClassLoader classLoader, C0098a c0098a) {
        this(parcel, classLoader);
    }

    public a(Parcelable parcelable) {
        super(parcelable);
        this.f2957d = new g<>();
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f2957d + "}";
    }

    @Override // b.i.a.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.f2957d.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = this.f2957d.i(i2);
            bundleArr[i2] = this.f2957d.m(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
