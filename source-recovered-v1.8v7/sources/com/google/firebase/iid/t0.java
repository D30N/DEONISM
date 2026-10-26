package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class t0 implements Parcelable.Creator<u0> {
    t0() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ u0 createFromParcel(Parcel parcel) {
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder != null) {
            return new u0(strongBinder);
        }
        return null;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ u0[] newArray(int i) {
        return new u0[i];
    }
}
