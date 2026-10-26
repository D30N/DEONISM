package com.facebook.ads.internal.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.facebook.ads.redexgen.X.C0560Iy;
import com.facebook.ads.redexgen.X.E1;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class GeobFrame extends Id3Frame {
    public static byte[] A04;
    public static final Parcelable.Creator<GeobFrame> CREATOR;
    public final String A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        int i4 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    bArrCopyOfRange = bArrCopyOfRange;
                    if (i4 >= bArrCopyOfRange.length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    bArrCopyOfRange = bArrCopyOfRange;
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 115);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A04 = new byte[]{-10, -22, 48, 51, 54, 47, 56, 43, 55, 47, 7, -63, -89, -12, -16, -12, -20, -37, 0, -9, -20, -60, -37, -49, 19, 20, 34, 18, 33, 24, 31, 35, 24, 30, 29, -20, 10, 8, 18, 5};
    }

    static {
        A01();
        CREATOR = new E1();
    }

    public GeobFrame(Parcel parcel) {
        super(A00(36, 4, 80));
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A03 = parcel.createByteArray();
    }

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super(A00(36, 4, 80));
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
        this.A03 = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        GeobFrame geobFrame = this;
        GeobFrame geobFrame2 = null;
        boolean z = true;
        char c2 = geobFrame == obj ? (char) 2 : (char) 3;
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
                    geobFrame = geobFrame;
                    obj = obj;
                    if (geobFrame.getClass() == obj.getClass()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    geobFrame = geobFrame;
                    obj = obj;
                    geobFrame2 = (GeobFrame) obj;
                    if (!C0560Iy.A0j(geobFrame.A02, geobFrame2.A02)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    geobFrame = geobFrame;
                    geobFrame2 = geobFrame2;
                    if (!C0560Iy.A0j(geobFrame.A01, geobFrame2.A01)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    geobFrame = geobFrame;
                    geobFrame2 = geobFrame2;
                    if (!C0560Iy.A0j(geobFrame.A00, geobFrame2.A00)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    geobFrame = geobFrame;
                    geobFrame2 = geobFrame2;
                    if (!Arrays.equals(geobFrame.A03, geobFrame2.A03)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    return z;
                case 11:
                    z = false;
                    c2 = '\n';
                    break;
            }
        }
    }

    public final int hashCode() {
        GeobFrame geobFrame = this;
        int result = 0;
        String str = null;
        int iHashCode = 0;
        int i = 0;
        int iHashCode2 = 0;
        String str2 = null;
        int i2 = 17 * 31;
        String str3 = geobFrame.A02;
        int iHashCode3 = 0;
        char c2 = str3 != null ? (char) 2 : '\t';
        while (true) {
            switch (c2) {
                case 2:
                    str3 = str3;
                    iHashCode2 = str3.hashCode();
                    c2 = 3;
                    break;
                case 3:
                    geobFrame = geobFrame;
                    i = (i2 + iHashCode2) * 31;
                    str2 = geobFrame.A01;
                    if (str2 == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    str2 = str2;
                    iHashCode = str2.hashCode();
                    c2 = 5;
                    break;
                case 5:
                    geobFrame = geobFrame;
                    result = (i + iHashCode) * 31;
                    str = geobFrame.A00;
                    if (str == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    str = str;
                    iHashCode3 = str.hashCode();
                    c2 = 7;
                    break;
                case 7:
                    return ((result + iHashCode3) * 31) + Arrays.hashCode(geobFrame.A03);
                case '\b':
                    iHashCode = 0;
                    c2 = 5;
                    break;
                case '\t':
                    iHashCode2 = 0;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.internal.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return super.A00 + A00(11, 11, 20) + this.A02 + A00(0, 11, 87) + this.A01 + A00(22, 14, 60) + this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeByteArray(this.A03);
    }
}
