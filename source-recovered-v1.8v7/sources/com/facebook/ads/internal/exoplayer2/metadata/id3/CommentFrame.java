package com.facebook.ads.internal.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.facebook.ads.redexgen.X.C0560Iy;
import com.facebook.ads.redexgen.X.E0;
import d.b.a.b.k;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class CommentFrame extends Id3Frame {
    public static byte[] A03;
    public static final Parcelable.Creator<CommentFrame> CREATOR;
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 109);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A03 = new byte[]{87, 91, 89, 89, 124, 112, 52, 53, 35, 51, 34, 57, 32, 36, 57, 63, 62, 109, 96, 122, 54, 59, 52, 61, 47, 59, 61, 63, 103};
    }

    static {
        A01();
        CREATOR = new E0();
    }

    public CommentFrame(Parcel parcel) {
        super(A00(0, 4, k.AppCompatTheme_windowFixedWidthMinor));
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A02 = parcel.readString();
    }

    public CommentFrame(String str, String str2, String str3) {
        super(A00(0, 4, k.AppCompatTheme_windowFixedWidthMinor));
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        CommentFrame commentFrame = this;
        CommentFrame commentFrame2 = null;
        boolean z = true;
        char c2 = commentFrame == obj ? (char) 2 : (char) 3;
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
                    commentFrame = commentFrame;
                    obj = obj;
                    if (commentFrame.getClass() == obj.getClass()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    commentFrame = commentFrame;
                    obj = obj;
                    commentFrame2 = (CommentFrame) obj;
                    if (!C0560Iy.A0j(commentFrame.A00, commentFrame2.A00)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    commentFrame = commentFrame;
                    commentFrame2 = commentFrame2;
                    if (!C0560Iy.A0j(commentFrame.A01, commentFrame2.A01)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    commentFrame = commentFrame;
                    commentFrame2 = commentFrame2;
                    if (!C0560Iy.A0j(commentFrame.A02, commentFrame2.A02)) {
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
        CommentFrame commentFrame = this;
        int result = 0;
        String str = null;
        int iHashCode = 0;
        int i = 0;
        int iHashCode2 = 0;
        String str2 = null;
        int i2 = 17 * 31;
        String str3 = commentFrame.A01;
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
                    commentFrame = commentFrame;
                    i = (i2 + iHashCode2) * 31;
                    str2 = commentFrame.A00;
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
                    commentFrame = commentFrame;
                    result = (i + iHashCode) * 31;
                    str = commentFrame.A02;
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
        return super.A00 + A00(18, 11, 55) + this.A01 + A00(4, 14, 61) + this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(super.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
