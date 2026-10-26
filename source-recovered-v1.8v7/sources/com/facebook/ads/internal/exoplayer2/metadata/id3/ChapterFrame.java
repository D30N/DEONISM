package com.facebook.ads.internal.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.facebook.ads.redexgen.X.C0436Dy;
import com.facebook.ads.redexgen.X.C0560Iy;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class ChapterFrame extends Id3Frame {
    public static byte[] A06;
    public static final Parcelable.Creator<ChapterFrame> CREATOR;
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final String A04;
    public final Id3Frame[] A05;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 57);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A06 = new byte[]{-119, -114, -121, -106};
    }

    static {
        A01();
        CREATOR = new C0436Dy();
    }

    public ChapterFrame(Parcel parcel) {
        super(A00(0, 4, 13));
        this.A04 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A03 = parcel.readLong();
        this.A02 = parcel.readLong();
        int i = parcel.readInt();
        this.A05 = new Id3Frame[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.A05[i2] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public ChapterFrame(String str, int i, int i2, long j, long j2, Id3Frame[] id3FrameArr) {
        super(A00(0, 4, 13));
        this.A04 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = j;
        this.A02 = j2;
        this.A05 = id3FrameArr;
    }

    @Override // com.facebook.ads.internal.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        ChapterFrame chapterFrame = this;
        ChapterFrame chapterFrame2 = null;
        boolean z = true;
        char c2 = chapterFrame == obj ? (char) 2 : (char) 3;
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
                    chapterFrame = chapterFrame;
                    obj = obj;
                    if (chapterFrame.getClass() == obj.getClass()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    chapterFrame = chapterFrame;
                    obj = obj;
                    chapterFrame2 = (ChapterFrame) obj;
                    if (chapterFrame.A01 != chapterFrame2.A01) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    chapterFrame = chapterFrame;
                    chapterFrame2 = chapterFrame2;
                    if (chapterFrame.A00 != chapterFrame2.A00) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    chapterFrame = chapterFrame;
                    chapterFrame2 = chapterFrame2;
                    if (chapterFrame.A03 != chapterFrame2.A03) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    chapterFrame = chapterFrame;
                    chapterFrame2 = chapterFrame2;
                    if (chapterFrame.A02 != chapterFrame2.A02) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    chapterFrame = chapterFrame;
                    chapterFrame2 = chapterFrame2;
                    if (!C0560Iy.A0j(chapterFrame.A04, chapterFrame2.A04)) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    chapterFrame = chapterFrame;
                    chapterFrame2 = chapterFrame2;
                    if (!Arrays.equals(chapterFrame.A05, chapterFrame2.A05)) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    return z;
                case '\r':
                    z = false;
                    c2 = '\f';
                    break;
            }
        }
    }

    public final int hashCode() {
        int iHashCode = 0;
        int i = ((((((((17 * 31) + this.A01) * 31) + this.A00) * 31) + ((int) this.A03)) * 31) + ((int) this.A02)) * 31;
        String str = this.A04;
        char c2 = str != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    str = str;
                    iHashCode = str.hashCode();
                    c2 = 3;
                    break;
                case 3:
                    return i + iHashCode;
                case 4:
                    iHashCode = 0;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A03);
        parcel.writeLong(this.A02);
        parcel.writeInt(this.A05.length);
        Id3Frame[] id3FrameArr = this.A05;
        int length = id3FrameArr.length;
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
                    id3FrameArr = id3FrameArr;
                    Id3Frame subFrame = id3FrameArr[i2];
                    parcel.writeParcelable(subFrame, 0);
                    i2++;
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }
}
