package com.facebook.ads.internal.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.facebook.ads.redexgen.X.C0428Dn;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new C0428Dn();
    public final Entry[] A00;

    public interface Entry extends Parcelable {
    }

    public Metadata(Parcel parcel) {
        this.A00 = new Entry[parcel.readInt()];
        int i = 0;
        while (true) {
            Entry[] entryArr = this.A00;
            if (i < entryArr.length) {
                entryArr[i] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }

    public Metadata(List<? extends Entry> list) {
        if (list != null) {
            this.A00 = new Entry[list.size()];
            list.toArray(this.A00);
        } else {
            this.A00 = new Entry[0];
        }
    }

    public Metadata(Entry... entryArr) {
        this.A00 = entryArr == null ? new Entry[0] : entryArr;
    }

    public final int A00() {
        return this.A00.length;
    }

    public final Entry A01(int i) {
        return this.A00[i];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        Metadata metadata = this;
        char c2 = metadata == obj ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return true;
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
                    metadata = metadata;
                    obj = obj;
                    if (metadata.getClass() == obj.getClass()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    Metadata other = metadata;
                    return Arrays.equals(other.A00, ((Metadata) obj).A00);
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00.length);
        Entry[] entryArr = this.A00;
        int length = entryArr.length;
        int i2 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i2 >= length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    parcel = parcel;
                    entryArr = entryArr;
                    Entry entry = entryArr[i2];
                    parcel.writeParcelable(entry, 0);
                    i2++;
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }
}
