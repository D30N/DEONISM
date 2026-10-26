package com.facebook.ads.internal.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.redexgen.X.C0465Fd;
import com.facebook.ads.redexgen.X.IJ;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class TrackGroup implements Parcelable {
    public static final Parcelable.Creator<TrackGroup> CREATOR = new C0465Fd();
    public int A00;
    public final int A01;
    public final Format[] A02;

    public TrackGroup(Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A02 = new Format[this.A01];
        for (int i = 0; i < this.A01; i++) {
            this.A02[i] = (Format) parcel.readParcelable(Format.class.getClassLoader());
        }
    }

    public TrackGroup(Format... formatArr) {
        IJ.A04(formatArr.length > 0);
        this.A02 = formatArr;
        this.A01 = formatArr.length;
    }

    public final int A00(Format format) {
        TrackGroup trackGroup = this;
        Format[] formatArr = null;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    trackGroup = trackGroup;
                    formatArr = trackGroup.A02;
                    if (i >= formatArr.length) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    format = format;
                    formatArr = formatArr;
                    if (format != formatArr[i]) {
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

    public final Format A01(int i) {
        return this.A02[i];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        TrackGroup trackGroup = this;
        TrackGroup trackGroup2 = null;
        boolean z = true;
        char c2 = trackGroup == obj ? (char) 2 : (char) 3;
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
                    trackGroup = trackGroup;
                    obj = obj;
                    if (trackGroup.getClass() == obj.getClass()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    trackGroup = trackGroup;
                    obj = obj;
                    trackGroup2 = (TrackGroup) obj;
                    if (trackGroup.A01 != trackGroup2.A01) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    trackGroup = trackGroup;
                    trackGroup2 = trackGroup2;
                    if (!Arrays.equals(trackGroup.A02, trackGroup2.A02)) {
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
            this.A00 = (17 * 31) + Arrays.hashCode(this.A02);
        }
        int result = this.A00;
        return result;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TrackGroup trackGroup = this;
        parcel.writeInt(trackGroup.A01);
        int i2 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    trackGroup = trackGroup;
                    if (i2 >= trackGroup.A01) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    trackGroup = trackGroup;
                    parcel = parcel;
                    parcel.writeParcelable(trackGroup.A02[i2], 0);
                    i2++;
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }
}
