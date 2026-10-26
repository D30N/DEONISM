package com.facebook.ads.internal.exoplayer2.trackselection;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.facebook.ads.redexgen.X.HL;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class DefaultTrackSelector$SelectionOverride implements Parcelable {
    public static final Parcelable.Creator<DefaultTrackSelector$SelectionOverride> CREATOR = new HL();
    public final int A00;
    public final int A01;
    public final int[] A02;

    public DefaultTrackSelector$SelectionOverride(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = parcel.readByte();
        this.A02 = new int[this.A01];
        parcel.readIntArray(this.A02);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        DefaultTrackSelector$SelectionOverride defaultTrackSelector$SelectionOverride = this;
        DefaultTrackSelector$SelectionOverride defaultTrackSelector$SelectionOverride2 = null;
        boolean z = true;
        char c2 = defaultTrackSelector$SelectionOverride == obj ? (char) 2 : (char) 3;
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
                    defaultTrackSelector$SelectionOverride = defaultTrackSelector$SelectionOverride;
                    obj = obj;
                    if (defaultTrackSelector$SelectionOverride.getClass() == obj.getClass()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    defaultTrackSelector$SelectionOverride = defaultTrackSelector$SelectionOverride;
                    obj = obj;
                    defaultTrackSelector$SelectionOverride2 = (DefaultTrackSelector$SelectionOverride) obj;
                    if (defaultTrackSelector$SelectionOverride.A00 != defaultTrackSelector$SelectionOverride2.A00) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    defaultTrackSelector$SelectionOverride = defaultTrackSelector$SelectionOverride;
                    defaultTrackSelector$SelectionOverride2 = defaultTrackSelector$SelectionOverride2;
                    if (!Arrays.equals(defaultTrackSelector$SelectionOverride.A02, defaultTrackSelector$SelectionOverride2.A02)) {
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
        return (this.A00 * 31) + Arrays.hashCode(this.A02);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02.length);
        parcel.writeIntArray(this.A02);
    }
}
