package com.facebook.ads.internal.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.facebook.ads.redexgen.X.C0437Dz;
import com.facebook.ads.redexgen.X.C0560Iy;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static byte[] A05;
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR;
    public final String A00;
    public final boolean A01;
    public final boolean A02;
    public final String[] A03;
    public final Id3Frame[] A04;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 66);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A05 = new byte[]{-68, -51, -56, -68};
    }

    static {
        A01();
        CREATOR = new C0437Dz();
    }

    public ChapterTocFrame(Parcel parcel) {
        super(A00(0, 4, 55));
        this.A00 = parcel.readString();
        this.A02 = parcel.readByte() != 0;
        this.A01 = parcel.readByte() != 0;
        this.A03 = parcel.createStringArray();
        int i = parcel.readInt();
        this.A04 = new Id3Frame[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.A04[i2] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public ChapterTocFrame(String str, boolean z, boolean z2, String[] strArr, Id3Frame[] id3FrameArr) {
        super(A00(0, 4, 55));
        this.A00 = str;
        this.A02 = z;
        this.A01 = z2;
        this.A03 = strArr;
        this.A04 = id3FrameArr;
    }

    public final boolean equals(@Nullable Object obj) {
        ChapterTocFrame chapterTocFrame = this;
        ChapterTocFrame chapterTocFrame2 = null;
        boolean z = true;
        char c2 = chapterTocFrame == obj ? (char) 2 : (char) 3;
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
                    chapterTocFrame = chapterTocFrame;
                    obj = obj;
                    if (chapterTocFrame.getClass() == obj.getClass()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    chapterTocFrame = chapterTocFrame;
                    obj = obj;
                    chapterTocFrame2 = (ChapterTocFrame) obj;
                    if (chapterTocFrame.A02 != chapterTocFrame2.A02) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    chapterTocFrame = chapterTocFrame;
                    chapterTocFrame2 = chapterTocFrame2;
                    if (chapterTocFrame.A01 != chapterTocFrame2.A01) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    chapterTocFrame = chapterTocFrame;
                    chapterTocFrame2 = chapterTocFrame2;
                    if (!C0560Iy.A0j(chapterTocFrame.A00, chapterTocFrame2.A00)) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    chapterTocFrame = chapterTocFrame;
                    chapterTocFrame2 = chapterTocFrame2;
                    if (!Arrays.equals(chapterTocFrame.A03, chapterTocFrame2.A03)) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    chapterTocFrame = chapterTocFrame;
                    chapterTocFrame2 = chapterTocFrame2;
                    if (!Arrays.equals(chapterTocFrame.A04, chapterTocFrame2.A04)) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    return z;
                case '\f':
                    z = false;
                    c2 = 11;
                    break;
            }
        }
    }

    public final int hashCode() {
        int iHashCode = 0;
        int i = ((((17 * 31) + (this.A02 ? 1 : 0)) * 31) + (this.A01 ? 1 : 0)) * 31;
        String str = this.A00;
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
        parcel.writeString(this.A00);
        parcel.writeByte(this.A02 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A01 ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.A03);
        parcel.writeInt(this.A04.length);
        Id3Frame[] id3FrameArr = this.A04;
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
                    parcel.writeParcelable(id3FrameArr[i2], 0);
                    i2++;
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }
}
