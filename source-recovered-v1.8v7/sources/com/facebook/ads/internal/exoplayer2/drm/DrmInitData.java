package com.facebook.ads.internal.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.facebook.ads.redexgen.X.C03419q;
import com.facebook.ads.redexgen.X.C0392Bp;
import com.facebook.ads.redexgen.X.C0393Bq;
import com.facebook.ads.redexgen.X.C0560Iy;
import com.facebook.ads.redexgen.X.IJ;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* loaded from: assets/audience_network.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new C0392Bp();
    public int A00;
    public final int A01;

    @Nullable
    public final String A02;
    public final SchemeData[] A03;

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new C0393Bq();
        public int A00;

        @Nullable
        public final String A01;
        public final String A02;
        public final boolean A03;
        public final byte[] A04;
        public final UUID A05;

        public SchemeData(Parcel parcel) {
            this.A05 = new UUID(parcel.readLong(), parcel.readLong());
            this.A01 = parcel.readString();
            this.A02 = parcel.readString();
            this.A04 = parcel.createByteArray();
            this.A03 = parcel.readByte() != 0;
        }

        public SchemeData(UUID uuid, @Nullable String str, String str2, byte[] bArr, boolean z) {
            this.A05 = (UUID) IJ.A01(uuid);
            this.A01 = str;
            this.A02 = (String) IJ.A01(str2);
            this.A04 = bArr;
            this.A03 = z;
        }

        public SchemeData(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, false);
        }

        public SchemeData(UUID uuid, String str, byte[] bArr, boolean z) {
            this(uuid, null, str, bArr, z);
        }

        public final boolean A01() {
            boolean z = false;
            char c2 = this.A04 != null ? (char) 2 : (char) 4;
            while (true) {
                switch (c2) {
                    case 2:
                        z = true;
                        c2 = 3;
                        break;
                    case 3:
                        return z;
                    case 4:
                        z = false;
                        c2 = 3;
                        break;
                }
            }
        }

        public final boolean A02(SchemeData schemeData) {
            SchemeData schemeData2 = this;
            boolean z = false;
            char c2 = schemeData2.A01() ? (char) 2 : (char) 6;
            while (true) {
                switch (c2) {
                    case 2:
                        schemeData = schemeData;
                        if (!schemeData.A01()) {
                            c2 = 3;
                            break;
                        } else {
                            c2 = 6;
                            break;
                        }
                    case 3:
                        schemeData2 = schemeData2;
                        schemeData = schemeData;
                        if (!schemeData2.A03(schemeData.A05)) {
                            c2 = 6;
                            break;
                        } else {
                            c2 = 4;
                            break;
                        }
                    case 4:
                        z = true;
                        c2 = 5;
                        break;
                    case 5:
                        return z;
                    case 6:
                        z = false;
                        c2 = 5;
                        break;
                }
            }
        }

        public final boolean A03(UUID uuid) {
            SchemeData schemeData = this;
            boolean z = false;
            char c2 = !C03419q.A04.equals(schemeData.A05) ? (char) 2 : (char) 3;
            while (true) {
                switch (c2) {
                    case 2:
                        schemeData = schemeData;
                        uuid = uuid;
                        if (!uuid.equals(schemeData.A05)) {
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
            SchemeData schemeData = this;
            SchemeData other = null;
            boolean z = false;
            char c2 = !(obj instanceof SchemeData) ? (char) 2 : (char) 3;
            while (true) {
                switch (c2) {
                    case 2:
                        return false;
                    case 3:
                        schemeData = schemeData;
                        obj = obj;
                        z = true;
                        if (obj != schemeData) {
                            c2 = 5;
                            break;
                        } else {
                            c2 = 4;
                            break;
                        }
                    case 4:
                        return z;
                    case 5:
                        schemeData = schemeData;
                        obj = obj;
                        other = (SchemeData) obj;
                        if (!C0560Iy.A0j(schemeData.A01, other.A01)) {
                            c2 = '\n';
                            break;
                        } else {
                            c2 = 6;
                            break;
                        }
                    case 6:
                        schemeData = schemeData;
                        other = other;
                        if (!C0560Iy.A0j(schemeData.A02, other.A02)) {
                            c2 = '\n';
                            break;
                        } else {
                            c2 = 7;
                            break;
                        }
                    case 7:
                        schemeData = schemeData;
                        other = other;
                        if (!C0560Iy.A0j(schemeData.A05, other.A05)) {
                            c2 = '\n';
                            break;
                        } else {
                            c2 = '\b';
                            break;
                        }
                    case '\b':
                        schemeData = schemeData;
                        other = other;
                        if (!Arrays.equals(schemeData.A04, other.A04)) {
                            c2 = '\n';
                            break;
                        } else {
                            c2 = '\t';
                            break;
                        }
                    case '\t':
                        return z;
                    case '\n':
                        z = false;
                        c2 = '\t';
                        break;
                }
            }
        }

        public final int hashCode() {
            SchemeData schemeData = this;
            String str = null;
            int iHashCode = 0;
            int iHashCode2 = 0;
            char c2 = schemeData.A00 == 0 ? (char) 2 : (char) 5;
            while (true) {
                switch (c2) {
                    case 2:
                        schemeData = schemeData;
                        iHashCode2 = schemeData.A05.hashCode() * 31;
                        str = schemeData.A01;
                        if (str != null) {
                            c2 = 6;
                            break;
                        } else {
                            c2 = 3;
                            break;
                        }
                    case 3:
                        iHashCode = 0;
                        c2 = 4;
                        break;
                    case 4:
                        schemeData = schemeData;
                        schemeData.A00 = ((((iHashCode2 + iHashCode) * 31) + schemeData.A02.hashCode()) * 31) + Arrays.hashCode(schemeData.A04);
                        c2 = 5;
                        break;
                    case 5:
                        return schemeData.A00;
                    case 6:
                        str = str;
                        iHashCode = str.hashCode();
                        c2 = 4;
                        break;
                }
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.A05.getMostSignificantBits());
            parcel.writeLong(this.A05.getLeastSignificantBits());
            parcel.writeString(this.A01);
            parcel.writeString(this.A02);
            parcel.writeByteArray(this.A04);
            parcel.writeByte(this.A03 ? (byte) 1 : (byte) 0);
        }
    }

    public DrmInitData(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A03 = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        this.A01 = this.A03.length;
    }

    public DrmInitData(String str, List<SchemeData> list) {
        this(str, false, (SchemeData[]) list.toArray(new SchemeData[list.size()]));
    }

    public DrmInitData(@Nullable String str, boolean z, SchemeData... schemeDataArr) {
        this.A02 = str;
        schemeDataArr = z ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        Arrays.sort(schemeDataArr, this);
        this.A03 = schemeDataArr;
        this.A01 = schemeDataArr.length;
    }

    public DrmInitData(@Nullable String str, SchemeData... schemeDataArr) {
        this(str, true, schemeDataArr);
    }

    public DrmInitData(List<SchemeData> list) {
        this(null, false, (SchemeData[]) list.toArray(new SchemeData[list.size()]));
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this((String) null, schemeDataArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(SchemeData schemeData, SchemeData schemeData2) {
        int iCompareTo = 0;
        char c2 = C03419q.A04.equals(schemeData.A05) ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    schemeData2 = schemeData2;
                    if (!C03419q.A04.equals(schemeData2.A05)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    iCompareTo = 0;
                    c2 = 4;
                    break;
                case 4:
                    return iCompareTo;
                case 5:
                    iCompareTo = 1;
                    c2 = 4;
                    break;
                case 6:
                    schemeData = schemeData;
                    schemeData2 = schemeData2;
                    iCompareTo = schemeData.A05.compareTo(schemeData2.A05);
                    c2 = 4;
                    break;
            }
        }
    }

    @Nullable
    public static DrmInitData A01(@Nullable DrmInitData drmInitData, @Nullable DrmInitData drmInitData2) {
        SchemeData schemeData = null;
        int size = 0;
        SchemeData[] schemeDataArr = null;
        int length = 0;
        DrmInitData drmInitData3 = null;
        int length2 = 0;
        int i = 0;
        SchemeData[] schemeDataArr2 = null;
        SchemeData schemeData2 = null;
        ArrayList arrayList = new ArrayList();
        String str = null;
        int i2 = 0;
        char c2 = drmInitData != null ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    drmInitData = drmInitData;
                    str = drmInitData.A02;
                    schemeDataArr2 = drmInitData.A03;
                    length2 = schemeDataArr2.length;
                    i = 0;
                    c2 = 3;
                    break;
                case 3:
                    if (i >= length2) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    schemeDataArr2 = schemeDataArr2;
                    schemeData2 = schemeDataArr2[i];
                    if (!schemeData2.A01()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    arrayList = arrayList;
                    schemeData2 = schemeData2;
                    arrayList.add(schemeData2);
                    c2 = 6;
                    break;
                case 6:
                    i++;
                    c2 = 3;
                    break;
                case 7:
                    drmInitData2 = drmInitData2;
                    if (drmInitData2 == null) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    if (str != null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    drmInitData2 = drmInitData2;
                    str = drmInitData2.A02;
                    c2 = '\n';
                    break;
                case '\n':
                    drmInitData2 = drmInitData2;
                    arrayList = arrayList;
                    size = arrayList.size();
                    schemeDataArr = drmInitData2.A03;
                    length = schemeDataArr.length;
                    c2 = 11;
                    break;
                case 11:
                    if (i2 >= length) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    schemeDataArr = schemeDataArr;
                    schemeData = schemeDataArr[i2];
                    if (!schemeData.A01()) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    arrayList = arrayList;
                    schemeData = schemeData;
                    if (!A02(arrayList, size, schemeData.A05)) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 14:
                    arrayList = arrayList;
                    schemeData = schemeData;
                    arrayList.add(schemeData);
                    c2 = 15;
                    break;
                case 15:
                    i2++;
                    c2 = 11;
                    break;
                case 16:
                    arrayList = arrayList;
                    if (!arrayList.isEmpty()) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    drmInitData3 = null;
                    c2 = 18;
                    break;
                case 18:
                    return drmInitData3;
                case 19:
                    arrayList = arrayList;
                    drmInitData3 = new DrmInitData(str, arrayList);
                    c2 = 18;
                    break;
            }
        }
    }

    public static boolean A02(ArrayList<SchemeData> arrayList, int i, UUID uuid) {
        int i2 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i2 >= i) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    arrayList = arrayList;
                    uuid = uuid;
                    if (!arrayList.get(i2).A05.equals(uuid)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return true;
                case 5:
                    i2++;
                    c2 = 2;
                    break;
                case 6:
                    return false;
            }
        }
    }

    public final SchemeData A03(int i) {
        return this.A03[i];
    }

    public final DrmInitData A04(@Nullable String str) {
        if (C0560Iy.A0j(this.A02, str)) {
            return this;
        }
        return new DrmInitData(str, false, this.A03);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(@Nullable Object obj) {
        DrmInitData drmInitData = this;
        DrmInitData drmInitData2 = null;
        boolean z = true;
        char c2 = drmInitData == obj ? (char) 2 : (char) 3;
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
                    drmInitData = drmInitData;
                    obj = obj;
                    if (drmInitData.getClass() == obj.getClass()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    drmInitData = drmInitData;
                    obj = obj;
                    drmInitData2 = (DrmInitData) obj;
                    if (!C0560Iy.A0j(drmInitData.A02, drmInitData2.A02)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    drmInitData = drmInitData;
                    drmInitData2 = drmInitData2;
                    if (!Arrays.equals(drmInitData.A03, drmInitData2.A03)) {
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
        DrmInitData drmInitData = this;
        String str = null;
        int iHashCode = 0;
        char c2 = drmInitData.A00 == 0 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    drmInitData = drmInitData;
                    str = drmInitData.A02;
                    if (str != null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    iHashCode = 0;
                    c2 = 4;
                    break;
                case 4:
                    drmInitData = drmInitData;
                    drmInitData.A00 = (iHashCode * 31) + Arrays.hashCode(drmInitData.A03);
                    c2 = 5;
                    break;
                case 5:
                    return drmInitData.A00;
                case 6:
                    str = str;
                    iHashCode = str.hashCode();
                    c2 = 4;
                    break;
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeTypedArray(this.A03, 0);
    }
}
