package com.facebook.ads.internal.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.facebook.ads.redexgen.X.C0560Iy;
import com.facebook.ads.redexgen.X.E4;
import com.facebook.ads.redexgen.X.IJ;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class InternalFrame extends Id3Frame {
    public static byte[] A03;
    public static final Parcelable.Creator<InternalFrame> CREATOR;
    public final String A00;
    public final String A01;
    public final String A02;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 117);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A03 = new byte[]{-29, -55, 13, 24, 22, 10, 18, 23, -26, 14, 14, 14, 14, -91, -103, -35, -34, -20, -36, -21, -30, -23, -19, -30, -24, -25, -74};
    }

    static {
        A01();
        CREATOR = new E4();
    }

    public InternalFrame(Parcel parcel) {
        super(A00(9, 4, 108));
        this.A01 = (String) IJ.A01(parcel.readString());
        this.A00 = (String) IJ.A01(parcel.readString());
        this.A02 = (String) IJ.A01(parcel.readString());
    }

    public InternalFrame(String str, String str2, String str3) {
        super(A00(9, 4, 108));
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        InternalFrame internalFrame = this;
        InternalFrame internalFrame2 = null;
        boolean z = true;
        char c2 = internalFrame == obj ? (char) 2 : (char) 3;
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
                    internalFrame = internalFrame;
                    obj = obj;
                    if (internalFrame.getClass() == obj.getClass()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    internalFrame = internalFrame;
                    obj = obj;
                    internalFrame2 = (InternalFrame) obj;
                    if (!C0560Iy.A0j(internalFrame.A00, internalFrame2.A00)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    internalFrame = internalFrame;
                    internalFrame2 = internalFrame2;
                    if (!C0560Iy.A0j(internalFrame.A01, internalFrame2.A01)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    internalFrame = internalFrame;
                    internalFrame2 = internalFrame2;
                    if (!C0560Iy.A0j(internalFrame.A02, internalFrame2.A02)) {
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
        InternalFrame internalFrame = this;
        int result = 0;
        String str = null;
        int iHashCode = 0;
        int i = 0;
        int iHashCode2 = 0;
        String str2 = null;
        int i2 = 17 * 31;
        String str3 = internalFrame.A01;
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
                    internalFrame = internalFrame;
                    i = (i2 + iHashCode2) * 31;
                    str2 = internalFrame.A00;
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
                    internalFrame = internalFrame;
                    result = (i + iHashCode) * 31;
                    str = internalFrame.A02;
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
                    return result + iHashCode3;
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
        return super.A00 + A00(0, 9, 52) + this.A01 + A00(13, 14, 4) + this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(super.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
