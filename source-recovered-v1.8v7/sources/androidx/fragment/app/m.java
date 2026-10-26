package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.d;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    final String f476b;

    /* renamed from: c, reason: collision with root package name */
    final String f477c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f478d;
    final int e;
    final int f;
    final String g;
    final boolean h;
    final boolean i;
    final boolean j;
    final Bundle k;
    final boolean l;
    final int m;
    Bundle n;
    Fragment o;

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

    m(Parcel parcel) {
        this.f476b = parcel.readString();
        this.f477c = parcel.readString();
        this.f478d = parcel.readInt() != 0;
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readString();
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.j = parcel.readInt() != 0;
        this.k = parcel.readBundle();
        this.l = parcel.readInt() != 0;
        this.n = parcel.readBundle();
        this.m = parcel.readInt();
    }

    m(Fragment fragment) {
        this.f476b = fragment.getClass().getName();
        this.f477c = fragment.f;
        this.f478d = fragment.n;
        this.e = fragment.w;
        this.f = fragment.x;
        this.g = fragment.y;
        this.h = fragment.B;
        this.i = fragment.m;
        this.j = fragment.A;
        this.k = fragment.g;
        this.l = fragment.z;
        this.m = fragment.R.ordinal();
    }

    public Fragment a(ClassLoader classLoader, g gVar) {
        Fragment fragment;
        Bundle bundle;
        if (this.o == null) {
            Bundle bundle2 = this.k;
            if (bundle2 != null) {
                bundle2.setClassLoader(classLoader);
            }
            Fragment fragmentA = gVar.a(classLoader, this.f476b);
            this.o = fragmentA;
            fragmentA.f1(this.k);
            Bundle bundle3 = this.n;
            if (bundle3 != null) {
                bundle3.setClassLoader(classLoader);
                fragment = this.o;
                bundle = this.n;
            } else {
                fragment = this.o;
                bundle = new Bundle();
            }
            fragment.f433c = bundle;
            Fragment fragment2 = this.o;
            fragment2.f = this.f477c;
            fragment2.n = this.f478d;
            fragment2.p = true;
            fragment2.w = this.e;
            fragment2.x = this.f;
            fragment2.y = this.g;
            fragment2.B = this.h;
            fragment2.m = this.i;
            fragment2.A = this.j;
            fragment2.z = this.l;
            fragment2.R = d.b.values()[this.m];
            if (j.I) {
                Log.v("FragmentManager", "Instantiated fragment " + this.o);
            }
        }
        return this.o;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f476b);
        sb.append(" (");
        sb.append(this.f477c);
        sb.append(")}:");
        if (this.f478d) {
            sb.append(" fromLayout");
        }
        if (this.f != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f));
        }
        String str = this.g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.g);
        }
        if (this.h) {
            sb.append(" retainInstance");
        }
        if (this.i) {
            sb.append(" removing");
        }
        if (this.j) {
            sb.append(" detached");
        }
        if (this.l) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f476b);
        parcel.writeString(this.f477c);
        parcel.writeInt(this.f478d ? 1 : 0);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeBundle(this.k);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeBundle(this.n);
        parcel.writeInt(this.m);
    }
}
