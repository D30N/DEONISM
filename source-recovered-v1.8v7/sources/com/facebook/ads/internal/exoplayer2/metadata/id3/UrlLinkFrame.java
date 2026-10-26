package com.facebook.ads.internal.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.facebook.ads.redexgen.X.C0560Iy;
import com.facebook.ads.redexgen.X.E7;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class UrlLinkFrame extends Id3Frame {
    public static byte[] A02;
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR;
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 24);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A02 = new byte[]{44, 54, 99, 100, 122, 43};
    }

    static {
        A01();
        CREATOR = new E7();
    }

    public UrlLinkFrame(Parcel parcel) {
        super(parcel.readString());
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public UrlLinkFrame(String str, String str2, String str3) {
        super(str);
        this.A00 = str2;
        this.A01 = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        UrlLinkFrame urlLinkFrame = this;
        UrlLinkFrame urlLinkFrame2 = null;
        boolean z = true;
        char c2 = urlLinkFrame == obj ? (char) 2 : (char) 3;
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
                    urlLinkFrame = urlLinkFrame;
                    obj = obj;
                    if (urlLinkFrame.getClass() == obj.getClass()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    urlLinkFrame = urlLinkFrame;
                    obj = obj;
                    urlLinkFrame2 = (UrlLinkFrame) obj;
                    if (!((Id3Frame) urlLinkFrame).A00.equals(((Id3Frame) urlLinkFrame2).A00)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    urlLinkFrame = urlLinkFrame;
                    urlLinkFrame2 = urlLinkFrame2;
                    if (!C0560Iy.A0j(urlLinkFrame.A00, urlLinkFrame2.A00)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    urlLinkFrame = urlLinkFrame;
                    urlLinkFrame2 = urlLinkFrame2;
                    if (!C0560Iy.A0j(urlLinkFrame.A01, urlLinkFrame2.A01)) {
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
        UrlLinkFrame urlLinkFrame = this;
        int result = 0;
        int iHashCode = 0;
        String str = null;
        int iHashCode2 = ((17 * 31) + ((Id3Frame) urlLinkFrame).A00.hashCode()) * 31;
        String str2 = urlLinkFrame.A00;
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
                    urlLinkFrame = urlLinkFrame;
                    result = (iHashCode2 + iHashCode) * 31;
                    str = urlLinkFrame.A01;
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
        return super.A00 + A00(0, 6, 14) + this.A01;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(super.A00);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
