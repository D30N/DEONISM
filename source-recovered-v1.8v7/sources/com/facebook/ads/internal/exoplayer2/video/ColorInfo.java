package com.facebook.ads.internal.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.facebook.ads.redexgen.X.C0560Iy;
import com.facebook.ads.redexgen.X.J1;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class ColorInfo implements Parcelable {
    public static byte[] A05;
    public static final Parcelable.Creator<ColorInfo> CREATOR;
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final byte[] A04;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 100);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A05 = new byte[]{-58, -70, -37, -75, -31, -34, -31, -28, -69, -32, -40, -31, -102};
    }

    static {
        A01();
        CREATOR = new J1();
    }

    public ColorInfo(int i, int i2, int i3, byte[] bArr) {
        this.A02 = i;
        this.A01 = i2;
        this.A03 = i3;
        this.A04 = bArr;
    }

    public ColorInfo(Parcel parcel) {
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A04 = C0560Iy.A0i(parcel) ? parcel.createByteArray() : null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        ColorInfo colorInfo = this;
        ColorInfo colorInfo2 = null;
        boolean z = true;
        char c2 = colorInfo == obj ? (char) 2 : (char) 3;
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
                    colorInfo = colorInfo;
                    obj = obj;
                    if (colorInfo.getClass() == obj.getClass()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    colorInfo = colorInfo;
                    obj = obj;
                    colorInfo2 = (ColorInfo) obj;
                    if (colorInfo.A02 != colorInfo2.A02) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    colorInfo = colorInfo;
                    colorInfo2 = colorInfo2;
                    if (colorInfo.A01 != colorInfo2.A01) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    colorInfo = colorInfo;
                    colorInfo2 = colorInfo2;
                    if (colorInfo.A03 != colorInfo2.A03) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    colorInfo = colorInfo;
                    colorInfo2 = colorInfo2;
                    if (!Arrays.equals(colorInfo.A04, colorInfo2.A04)) {
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
        if (this.A00 == 0) {
            int i = ((17 * 31) + this.A02) * 31;
            int result = this.A01;
            int i2 = (((i + result) * 31) + this.A03) * 31;
            int result2 = Arrays.hashCode(this.A04);
            this.A00 = i2 + result2;
        }
        return this.A00;
    }

    public final String toString() {
        boolean z = false;
        StringBuilder sb = new StringBuilder();
        sb.append(A00(3, 10, 14));
        sb.append(this.A02);
        String strA00 = A00(0, 2, 54);
        sb.append(strA00);
        sb.append(this.A01);
        sb.append(strA00);
        sb.append(this.A03);
        sb.append(strA00);
        char c2 = this.A04 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    StringBuilder sb2 = sb;
                    sb2.append(z);
                    sb2.append(A00(2, 1, 78));
                    return sb2.toString();
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ColorInfo colorInfo = this;
        boolean z = false;
        byte[] bArr = null;
        parcel.writeInt(colorInfo.A02);
        parcel.writeInt(colorInfo.A01);
        parcel.writeInt(colorInfo.A03);
        char c2 = colorInfo.A04 != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    colorInfo = colorInfo;
                    parcel = parcel;
                    C0560Iy.A0Y(parcel, z);
                    bArr = colorInfo.A04;
                    if (bArr == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    parcel = parcel;
                    bArr = bArr;
                    parcel.writeByteArray(bArr);
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }
}
