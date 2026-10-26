package com.facebook.ads.internal.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.facebook.ads.redexgen.X.C0435Dx;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new C0435Dx();
    public final byte[] A00;

    public BinaryFrame(Parcel parcel) {
        super(parcel.readString());
        this.A00 = parcel.createByteArray();
    }

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.A00 = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        BinaryFrame binaryFrame = this;
        BinaryFrame binaryFrame2 = null;
        boolean z = true;
        char c2 = binaryFrame == obj ? (char) 2 : (char) 3;
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
                    binaryFrame = binaryFrame;
                    obj = obj;
                    if (binaryFrame.getClass() == obj.getClass()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    binaryFrame = binaryFrame;
                    obj = obj;
                    binaryFrame2 = (BinaryFrame) obj;
                    if (!((Id3Frame) binaryFrame).A00.equals(((Id3Frame) binaryFrame2).A00)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    binaryFrame = binaryFrame;
                    binaryFrame2 = binaryFrame2;
                    if (!Arrays.equals(binaryFrame.A00, binaryFrame2.A00)) {
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
        int iHashCode = ((17 * 31) + super.A00.hashCode()) * 31;
        int result = Arrays.hashCode(this.A00);
        return iHashCode + result;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(super.A00);
        parcel.writeByteArray(this.A00);
    }
}
