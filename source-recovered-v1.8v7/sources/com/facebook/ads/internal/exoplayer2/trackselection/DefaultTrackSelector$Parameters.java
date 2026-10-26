package com.facebook.ads.internal.exoplayer2.trackselection;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import com.facebook.ads.redexgen.X.C0560Iy;
import com.facebook.ads.redexgen.X.HI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class DefaultTrackSelector$Parameters implements Parcelable {
    public static final DefaultTrackSelector$Parameters A0I = new DefaultTrackSelector$Parameters();
    public static final Parcelable.Creator<DefaultTrackSelector$Parameters> CREATOR = new HI();
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;

    @Nullable
    public final String A07;

    @Nullable
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> A0G;
    public final SparseBooleanArray A0H;

    public DefaultTrackSelector$Parameters() {
        this(new SparseArray(), new SparseBooleanArray(), null, null, false, 0, false, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true, 0);
    }

    public DefaultTrackSelector$Parameters(Parcel parcel) {
        this.A0G = A00(parcel);
        this.A0H = parcel.readSparseBooleanArray();
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        this.A0E = C0560Iy.A0i(parcel);
        this.A00 = parcel.readInt();
        this.A0D = C0560Iy.A0i(parcel);
        this.A09 = C0560Iy.A0i(parcel);
        this.A0A = C0560Iy.A0i(parcel);
        this.A03 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A0C = C0560Iy.A0i(parcel);
        this.A0B = C0560Iy.A0i(parcel);
        this.A06 = parcel.readInt();
        this.A05 = parcel.readInt();
        this.A0F = C0560Iy.A0i(parcel);
        this.A04 = parcel.readInt();
    }

    public DefaultTrackSelector$Parameters(SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> sparseArray, SparseBooleanArray sparseBooleanArray, @Nullable String str, @Nullable String str2, boolean z, int i, boolean z2, boolean z3, boolean z4, int i2, int i3, int i4, boolean z5, boolean z6, int i5, int i6, boolean z7, int i7) {
        this.A0G = sparseArray;
        this.A0H = sparseBooleanArray;
        this.A07 = C0560Iy.A0O(str);
        this.A08 = C0560Iy.A0O(str2);
        this.A0E = z;
        this.A00 = i;
        this.A0D = z2;
        this.A09 = z3;
        this.A0A = z4;
        this.A03 = i2;
        this.A02 = i3;
        this.A01 = i4;
        this.A0C = z5;
        this.A0B = z6;
        this.A06 = i5;
        this.A05 = i6;
        this.A0F = z7;
        this.A04 = i7;
    }

    public static SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> A00(Parcel parcel) {
        int i = 0;
        int j = 0;
        int i2 = 0;
        HashMap map = null;
        int i3 = parcel.readInt();
        SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> sparseArray = new SparseArray<>(i3);
        int i4 = 0;
        int i5 = 2;
        while (true) {
            switch (i5) {
                case 2:
                    if (i4 >= i3) {
                        i5 = 7;
                        break;
                    } else {
                        i5 = 3;
                        break;
                    }
                case 3:
                    parcel = parcel;
                    i = parcel.readInt();
                    i2 = parcel.readInt();
                    map = new HashMap(i2);
                    j = 0;
                    i5 = 4;
                    break;
                case 4:
                    if (j >= i2) {
                        i5 = 6;
                        break;
                    } else {
                        i5 = 5;
                        break;
                    }
                case 5:
                    parcel = parcel;
                    map = map;
                    map.put((TrackGroupArray) parcel.readParcelable(TrackGroupArray.class.getClassLoader()), (DefaultTrackSelector$SelectionOverride) parcel.readParcelable(DefaultTrackSelector$SelectionOverride.class.getClassLoader()));
                    j++;
                    i5 = 4;
                    break;
                case 6:
                    sparseArray = sparseArray;
                    map = map;
                    sparseArray.put(i, map);
                    i4++;
                    i5 = 2;
                    break;
                case 7:
                    return sparseArray;
            }
        }
    }

    public static void A01(Parcel parcel, SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> sparseArray) {
        Iterator<Map.Entry<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> it = null;
        int size = sparseArray.size();
        parcel.writeInt(size);
        int i = 0;
        int overrideCount = 2;
        while (true) {
            switch (overrideCount) {
                case 2:
                    if (i >= size) {
                        overrideCount = 7;
                        break;
                    } else {
                        overrideCount = 3;
                        break;
                    }
                case 3:
                    parcel = parcel;
                    sparseArray = sparseArray;
                    int iKeyAt = sparseArray.keyAt(i);
                    Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride> mapValueAt = sparseArray.valueAt(i);
                    int overrideCount2 = mapValueAt.size();
                    parcel.writeInt(iKeyAt);
                    parcel.writeInt(overrideCount2);
                    it = mapValueAt.entrySet().iterator();
                    overrideCount = 4;
                    break;
                case 4:
                    it = it;
                    if (!it.hasNext()) {
                        overrideCount = 6;
                        break;
                    } else {
                        overrideCount = 5;
                        break;
                    }
                case 5:
                    parcel = parcel;
                    it = it;
                    Map.Entry<TrackGroupArray, DefaultTrackSelector$SelectionOverride> next = it.next();
                    parcel.writeParcelable(next.getKey(), 0);
                    parcel.writeParcelable(next.getValue(), 0);
                    overrideCount = 4;
                    break;
                case 6:
                    i++;
                    overrideCount = 2;
                    break;
                case 7:
                    return;
            }
        }
    }

    public static boolean A02(SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> sparseArray, SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> sparseArray2) {
        int iIndexOfKey = 0;
        int indexInSecond = 0;
        int size = sparseArray.size();
        char c2 = sparseArray2.size() != size ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return false;
                case 3:
                    indexInSecond = 0;
                    c2 = 4;
                    break;
                case 4:
                    if (indexInSecond >= size) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    sparseArray = sparseArray;
                    sparseArray2 = sparseArray2;
                    iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(indexInSecond));
                    if (iIndexOfKey < 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    sparseArray = sparseArray;
                    sparseArray2 = sparseArray2;
                    if (!A04(sparseArray.valueAt(indexInSecond), sparseArray2.valueAt(iIndexOfKey))) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 7:
                    return false;
                case '\b':
                    indexInSecond++;
                    c2 = 4;
                    break;
                case '\t':
                    return true;
            }
        }
    }

    public static boolean A03(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
        int i = 0;
        int size = sparseBooleanArray.size();
        char c2 = sparseBooleanArray2.size() != size ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return false;
                case 3:
                    i = 0;
                    c2 = 4;
                    break;
                case 4:
                    if (i >= size) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    sparseBooleanArray = sparseBooleanArray;
                    sparseBooleanArray2 = sparseBooleanArray2;
                    if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) >= 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return false;
                case 7:
                    i++;
                    c2 = 4;
                    break;
                case '\b':
                    return true;
            }
        }
    }

    public static boolean A04(Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride> map, Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride> map2) {
        Map.Entry<TrackGroupArray, DefaultTrackSelector$SelectionOverride> firstEntry = null;
        Iterator<Map.Entry<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> it = null;
        TrackGroupArray key = null;
        char c2 = map2.size() != map.size() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return false;
                case 3:
                    map = map;
                    it = map.entrySet().iterator();
                    c2 = 4;
                    break;
                case 4:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    map2 = map2;
                    it = it;
                    firstEntry = it.next();
                    key = firstEntry.getKey();
                    if (!map2.containsKey(key)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    map2 = map2;
                    firstEntry = firstEntry;
                    key = key;
                    if (!C0560Iy.A0j(firstEntry.getValue(), map2.get(key))) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 7:
                    return false;
                case '\b':
                    return true;
            }
        }
    }

    @Nullable
    public final DefaultTrackSelector$SelectionOverride A05(int i, TrackGroupArray trackGroupArray) {
        DefaultTrackSelector$SelectionOverride defaultTrackSelector$SelectionOverride = null;
        Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride> map = this.A0G.get(i);
        char c2 = map != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    trackGroupArray = trackGroupArray;
                    map = map;
                    defaultTrackSelector$SelectionOverride = map.get(trackGroupArray);
                    c2 = 3;
                    break;
                case 3:
                    return defaultTrackSelector$SelectionOverride;
                case 4:
                    defaultTrackSelector$SelectionOverride = null;
                    c2 = 3;
                    break;
            }
        }
    }

    public final boolean A06(int i) {
        return this.A0H.get(i);
    }

    public final boolean A07(int i, TrackGroupArray trackGroupArray) {
        boolean z = false;
        Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride> map = this.A0G.get(i);
        char c2 = map != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    trackGroupArray = trackGroupArray;
                    map = map;
                    if (!map.containsKey(trackGroupArray)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z = true;
                    c2 = 4;
                    break;
                case 4:
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        DefaultTrackSelector$Parameters defaultTrackSelector$Parameters = this;
        DefaultTrackSelector$Parameters defaultTrackSelector$Parameters2 = null;
        boolean z = true;
        char c2 = defaultTrackSelector$Parameters == obj ? (char) 2 : (char) 3;
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
                    defaultTrackSelector$Parameters = defaultTrackSelector$Parameters;
                    obj = obj;
                    if (defaultTrackSelector$Parameters.getClass() == obj.getClass()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    defaultTrackSelector$Parameters = defaultTrackSelector$Parameters;
                    obj = obj;
                    defaultTrackSelector$Parameters2 = (DefaultTrackSelector$Parameters) obj;
                    if (defaultTrackSelector$Parameters.A0E != defaultTrackSelector$Parameters2.A0E) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    defaultTrackSelector$Parameters = defaultTrackSelector$Parameters;
                    defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters2;
                    if (defaultTrackSelector$Parameters.A00 != defaultTrackSelector$Parameters2.A00) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    defaultTrackSelector$Parameters = defaultTrackSelector$Parameters;
                    defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters2;
                    if (defaultTrackSelector$Parameters.A0D != defaultTrackSelector$Parameters2.A0D) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    defaultTrackSelector$Parameters = defaultTrackSelector$Parameters;
                    defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters2;
                    if (defaultTrackSelector$Parameters.A09 != defaultTrackSelector$Parameters2.A09) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    defaultTrackSelector$Parameters = defaultTrackSelector$Parameters;
                    defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters2;
                    if (defaultTrackSelector$Parameters.A0A != defaultTrackSelector$Parameters2.A0A) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    defaultTrackSelector$Parameters = defaultTrackSelector$Parameters;
                    defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters2;
                    if (defaultTrackSelector$Parameters.A03 != defaultTrackSelector$Parameters2.A03) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    defaultTrackSelector$Parameters = defaultTrackSelector$Parameters;
                    defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters2;
                    if (defaultTrackSelector$Parameters.A02 != defaultTrackSelector$Parameters2.A02) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    defaultTrackSelector$Parameters = defaultTrackSelector$Parameters;
                    defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters2;
                    if (defaultTrackSelector$Parameters.A0C != defaultTrackSelector$Parameters2.A0C) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    defaultTrackSelector$Parameters = defaultTrackSelector$Parameters;
                    defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters2;
                    if (defaultTrackSelector$Parameters.A0B != defaultTrackSelector$Parameters2.A0B) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    defaultTrackSelector$Parameters = defaultTrackSelector$Parameters;
                    defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters2;
                    if (defaultTrackSelector$Parameters.A0F != defaultTrackSelector$Parameters2.A0F) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    defaultTrackSelector$Parameters = defaultTrackSelector$Parameters;
                    defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters2;
                    if (defaultTrackSelector$Parameters.A06 != defaultTrackSelector$Parameters2.A06) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    defaultTrackSelector$Parameters = defaultTrackSelector$Parameters;
                    defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters2;
                    if (defaultTrackSelector$Parameters.A05 != defaultTrackSelector$Parameters2.A05) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    defaultTrackSelector$Parameters = defaultTrackSelector$Parameters;
                    defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters2;
                    if (defaultTrackSelector$Parameters.A01 != defaultTrackSelector$Parameters2.A01) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    defaultTrackSelector$Parameters = defaultTrackSelector$Parameters;
                    defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters2;
                    if (defaultTrackSelector$Parameters.A04 != defaultTrackSelector$Parameters2.A04) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    defaultTrackSelector$Parameters = defaultTrackSelector$Parameters;
                    defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters2;
                    if (!TextUtils.equals(defaultTrackSelector$Parameters.A07, defaultTrackSelector$Parameters2.A07)) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    defaultTrackSelector$Parameters = defaultTrackSelector$Parameters;
                    defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters2;
                    if (!TextUtils.equals(defaultTrackSelector$Parameters.A08, defaultTrackSelector$Parameters2.A08)) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    defaultTrackSelector$Parameters = defaultTrackSelector$Parameters;
                    defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters2;
                    if (!A03(defaultTrackSelector$Parameters.A0H, defaultTrackSelector$Parameters2.A0H)) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    defaultTrackSelector$Parameters = defaultTrackSelector$Parameters;
                    defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters2;
                    if (!A02(defaultTrackSelector$Parameters.A0G, defaultTrackSelector$Parameters2.A0G)) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 24:
                    return z;
                case 25:
                    z = false;
                    c2 = 24;
                    break;
            }
        }
    }

    public final int hashCode() {
        DefaultTrackSelector$Parameters defaultTrackSelector$Parameters = this;
        int iHashCode = 0;
        int i = 0;
        String str = null;
        int i2 = (((((((((((((((((((((((((((defaultTrackSelector$Parameters.A0E ? 1 : 0) * 31) + defaultTrackSelector$Parameters.A00) * 31) + (defaultTrackSelector$Parameters.A0D ? 1 : 0)) * 31) + (defaultTrackSelector$Parameters.A09 ? 1 : 0)) * 31) + (defaultTrackSelector$Parameters.A0A ? 1 : 0)) * 31) + defaultTrackSelector$Parameters.A03) * 31) + defaultTrackSelector$Parameters.A02) * 31) + (defaultTrackSelector$Parameters.A0C ? 1 : 0)) * 31) + (defaultTrackSelector$Parameters.A0B ? 1 : 0)) * 31) + (defaultTrackSelector$Parameters.A0F ? 1 : 0)) * 31) + defaultTrackSelector$Parameters.A06) * 31) + defaultTrackSelector$Parameters.A05) * 31) + defaultTrackSelector$Parameters.A01) * 31) + defaultTrackSelector$Parameters.A04) * 31;
        String str2 = defaultTrackSelector$Parameters.A07;
        int iHashCode2 = 0;
        int i3 = str2 == null ? 2 : 6;
        while (true) {
            switch (i3) {
                case 2:
                    iHashCode = 0;
                    i3 = 3;
                    break;
                case 3:
                    defaultTrackSelector$Parameters = defaultTrackSelector$Parameters;
                    i = (i2 + iHashCode) * 31;
                    str = defaultTrackSelector$Parameters.A08;
                    if (str != null) {
                        i3 = 5;
                        break;
                    } else {
                        i3 = 4;
                        break;
                    }
                case 4:
                    return i + iHashCode2;
                case 5:
                    str = str;
                    iHashCode2 = str.hashCode();
                    i3 = 4;
                    break;
                case 6:
                    str2 = str2;
                    iHashCode = str2.hashCode();
                    i3 = 3;
                    break;
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        A01(parcel, this.A0G);
        parcel.writeSparseBooleanArray(this.A0H);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        C0560Iy.A0Y(parcel, this.A0E);
        parcel.writeInt(this.A00);
        C0560Iy.A0Y(parcel, this.A0D);
        C0560Iy.A0Y(parcel, this.A09);
        C0560Iy.A0Y(parcel, this.A0A);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        C0560Iy.A0Y(parcel, this.A0C);
        C0560Iy.A0Y(parcel, this.A0B);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A05);
        C0560Iy.A0Y(parcel, this.A0F);
        parcel.writeInt(this.A04);
    }
}
