package com.facebook.ads.internal.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.facebook.ads.redexgen.X.C0434Dw;
import com.facebook.ads.redexgen.X.C0560Iy;
import d.b.a.b.k;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class ApicFrame extends Id3Frame {
    public static byte[] A04;
    public static final Parcelable.Creator<ApicFrame> CREATOR;
    public final int A00;
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 51);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A04 = new byte[]{-27, -12, -19, -25, -32, -58, 19, 15, 19, 11, -6, 31, 22, 11, -29, -46, -58, 10, 11, 25, 9, 24, 15, 22, 26, 15, 21, 20, -29};
    }

    static {
        A01();
        CREATOR = new C0434Dw();
    }

    public ApicFrame(Parcel parcel) {
        super(A00(0, 4, 113));
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A03 = parcel.createByteArray();
    }

    public ApicFrame(String str, String str2, int i, byte[] bArr) {
        super(A00(0, 4, 113));
        this.A02 = str;
        this.A01 = str2;
        this.A00 = i;
        this.A03 = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        ApicFrame apicFrame = this;
        ApicFrame apicFrame2 = null;
        boolean z = true;
        char c2 = apicFrame == obj ? (char) 2 : (char) 3;
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
                    apicFrame = apicFrame;
                    obj = obj;
                    if (apicFrame.getClass() == obj.getClass()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    apicFrame = apicFrame;
                    obj = obj;
                    apicFrame2 = (ApicFrame) obj;
                    if (apicFrame.A00 != apicFrame2.A00) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    apicFrame = apicFrame;
                    apicFrame2 = apicFrame2;
                    if (!C0560Iy.A0j(apicFrame.A02, apicFrame2.A02)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    apicFrame = apicFrame;
                    apicFrame2 = apicFrame2;
                    if (!C0560Iy.A0j(apicFrame.A01, apicFrame2.A01)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    apicFrame = apicFrame;
                    apicFrame2 = apicFrame2;
                    if (!Arrays.equals(apicFrame.A03, apicFrame2.A03)) {
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
        ApicFrame apicFrame = this;
        int result = 0;
        int iHashCode = 0;
        String str = null;
        int i = ((17 * 31) + apicFrame.A00) * 31;
        String str2 = apicFrame.A02;
        int iHashCode2 = 0;
        char c2 = str2 != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    str2 = str2;
                    iHashCode = str2.hashCode();
                    c2 = 3;
                    break;
                case 3:
                    apicFrame = apicFrame;
                    result = (i + iHashCode) * 31;
                    str = apicFrame.A01;
                    if (str == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    str = str;
                    iHashCode2 = str.hashCode();
                    c2 = 5;
                    break;
                case 5:
                    return ((result + iHashCode2) * 31) + Arrays.hashCode(apicFrame.A03);
                case 6:
                    iHashCode = 0;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.internal.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return super.A00 + A00(4, 11, k.AppCompatTheme_windowActionBar) + this.A02 + A00(15, 14, k.AppCompatTheme_windowActionBar) + this.A01;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeByteArray(this.A03);
    }
}
