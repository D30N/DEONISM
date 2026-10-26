package com.facebook.ads.internal.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.facebook.ads.redexgen.X.C0560Iy;
import com.facebook.ads.redexgen.X.E6;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class TextInformationFrame extends Id3Frame {
    public static byte[] A02;
    public static final Parcelable.Creator<TextInformationFrame> CREATOR;
    public final String A00;
    public final String A01;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 64);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A02 = new byte[]{-49, -75, 11, -10, 1, 10, -6, -46};
    }

    static {
        A01();
        CREATOR = new E6();
    }

    public TextInformationFrame(Parcel parcel) {
        super(parcel.readString());
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public TextInformationFrame(String str, String str2, String str3) {
        super(str);
        this.A00 = str2;
        this.A01 = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        TextInformationFrame textInformationFrame = this;
        TextInformationFrame textInformationFrame2 = null;
        boolean z = true;
        char c2 = textInformationFrame == obj ? (char) 2 : (char) 3;
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
                    textInformationFrame = textInformationFrame;
                    obj = obj;
                    if (textInformationFrame.getClass() == obj.getClass()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    textInformationFrame = textInformationFrame;
                    obj = obj;
                    textInformationFrame2 = (TextInformationFrame) obj;
                    if (!((Id3Frame) textInformationFrame).A00.equals(((Id3Frame) textInformationFrame2).A00)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    textInformationFrame = textInformationFrame;
                    textInformationFrame2 = textInformationFrame2;
                    if (!C0560Iy.A0j(textInformationFrame.A00, textInformationFrame2.A00)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    textInformationFrame = textInformationFrame;
                    textInformationFrame2 = textInformationFrame2;
                    if (!C0560Iy.A0j(textInformationFrame.A01, textInformationFrame2.A01)) {
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
        TextInformationFrame textInformationFrame = this;
        int result = 0;
        int iHashCode = 0;
        String str = null;
        int iHashCode2 = ((17 * 31) + ((Id3Frame) textInformationFrame).A00.hashCode()) * 31;
        String str2 = textInformationFrame.A00;
        int iHashCode3 = 0;
        char c2 = str2 != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    str2 = str2;
                    iHashCode = str2.hashCode();
                    c2 = 3;
                    break;
                case 3:
                    textInformationFrame = textInformationFrame;
                    result = (iHashCode2 + iHashCode) * 31;
                    str = textInformationFrame.A01;
                    if (str == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    str = str;
                    iHashCode3 = str.hashCode();
                    c2 = 5;
                    break;
                case 5:
                    return result + iHashCode3;
                case 6:
                    iHashCode = 0;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.internal.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return super.A00 + A00(0, 8, 85) + this.A01;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(super.A00);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
