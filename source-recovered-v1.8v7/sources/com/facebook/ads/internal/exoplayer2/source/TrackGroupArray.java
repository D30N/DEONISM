package com.facebook.ads.internal.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.facebook.ads.redexgen.X.C0466Ff;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class TrackGroupArray implements Parcelable {
    public static final TrackGroupArray A03 = new TrackGroupArray(new TrackGroup[0]);
    public static final Parcelable.Creator<TrackGroupArray> CREATOR = new C0466Ff();
    public int A00;
    public final int A01;
    public final TrackGroup[] A02;

    public TrackGroupArray(Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A02 = new TrackGroup[this.A01];
        for (int i = 0; i < this.A01; i++) {
            this.A02[i] = (TrackGroup) parcel.readParcelable(TrackGroup.class.getClassLoader());
        }
    }

    public TrackGroupArray(TrackGroup... trackGroupArr) {
        this.A02 = trackGroupArr;
        this.A01 = trackGroupArr.length;
    }

    public final int A00(TrackGroup trackGroup) {
        TrackGroupArray trackGroupArray = this;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    trackGroupArray = trackGroupArray;
                    if (i >= trackGroupArray.A01) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    trackGroupArray = trackGroupArray;
                    trackGroup = trackGroup;
                    if (trackGroupArray.A02[i] != trackGroup) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return i;
                case 5:
                    i++;
                    c2 = 2;
                    break;
                case 6:
                    return -1;
            }
        }
    }

    public final TrackGroup A01(int i) {
        return this.A02[i];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        TrackGroupArray trackGroupArray = this;
        TrackGroupArray trackGroupArray2 = null;
        boolean z = true;
        char c2 = trackGroupArray == obj ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return z;
                case 3:
                    obj = obj;
                    if (obj == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    trackGroupArray = trackGroupArray;
                    obj = obj;
                    if (trackGroupArray.getClass() == obj.getClass()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    trackGroupArray = trackGroupArray;
                    obj = obj;
                    trackGroupArray2 = (TrackGroupArray) obj;
                    if (trackGroupArray.A01 != trackGroupArray2.A01) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    trackGroupArray = trackGroupArray;
                    trackGroupArray2 = trackGroupArray2;
                    if (!Arrays.equals(trackGroupArray.A02, trackGroupArray2.A02)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return z;
                case '\t':
                    z = false;
                    c2 = '\b';
                    break;
            }
        }
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = Arrays.hashCode(this.A02);
        }
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TrackGroupArray trackGroupArray = this;
        parcel.writeInt(trackGroupArray.A01);
        int i2 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    trackGroupArray = trackGroupArray;
                    if (i2 >= trackGroupArray.A01) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    trackGroupArray = trackGroupArray;
                    parcel = parcel;
                    parcel.writeParcelable(trackGroupArray.A02[i2], 0);
                    i2++;
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }
}
