package com.facebook.ads.internal.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.redexgen.X.C0432Du;
import com.facebook.ads.redexgen.X.C0560Iy;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class EventMessage implements Metadata.Entry {
    public static byte[] A07;
    public static final Parcelable.Creator<EventMessage> CREATOR;
    public int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final String A04;
    public final String A05;
    public final byte[] A06;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 49);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A07 = new byte[]{-56, -68, 18, -3, 8, 17, 1, -39, -101, -113, -40, -45, -84, -113, -105, -99, -111, -124, 106, -67, -83, -78, -81, -73, -81, -121};
    }

    static {
        A01();
        CREATOR = new C0432Du();
    }

    public EventMessage(Parcel parcel) {
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A03 = parcel.readLong();
        this.A01 = parcel.readLong();
        this.A02 = parcel.readLong();
        this.A06 = parcel.createByteArray();
    }

    public EventMessage(String str, String str2, long j, long j2, byte[] bArr, long j3) {
        this.A04 = str;
        this.A05 = str2;
        this.A01 = j;
        this.A02 = j2;
        this.A06 = bArr;
        this.A03 = j3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        EventMessage eventMessage = this;
        EventMessage eventMessage2 = null;
        boolean z = true;
        char c2 = eventMessage == obj ? (char) 2 : (char) 3;
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
                    eventMessage = eventMessage;
                    obj = obj;
                    if (eventMessage.getClass() == obj.getClass()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    eventMessage = eventMessage;
                    obj = obj;
                    eventMessage2 = (EventMessage) obj;
                    if (eventMessage.A03 != eventMessage2.A03) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    eventMessage = eventMessage;
                    eventMessage2 = eventMessage2;
                    if (eventMessage.A01 != eventMessage2.A01) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    eventMessage = eventMessage;
                    eventMessage2 = eventMessage2;
                    if (eventMessage.A02 != eventMessage2.A02) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    eventMessage = eventMessage;
                    eventMessage2 = eventMessage2;
                    if (!C0560Iy.A0j(eventMessage.A04, eventMessage2.A04)) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    eventMessage = eventMessage;
                    eventMessage2 = eventMessage2;
                    if (!C0560Iy.A0j(eventMessage.A05, eventMessage2.A05)) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    eventMessage = eventMessage;
                    eventMessage2 = eventMessage2;
                    if (!Arrays.equals(eventMessage.A06, eventMessage2.A06)) {
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
        EventMessage eventMessage = this;
        int result = 0;
        String str = null;
        int i = 0;
        int iHashCode = 0;
        String str2 = null;
        int iHashCode2 = 0;
        char c2 = eventMessage.A00 == 0 ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    eventMessage = eventMessage;
                    i = 17 * 31;
                    str = eventMessage.A04;
                    iHashCode2 = 0;
                    if (str == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    str = str;
                    iHashCode = str.hashCode();
                    c2 = 4;
                    break;
                case 4:
                    eventMessage = eventMessage;
                    result = (i + iHashCode) * 31;
                    str2 = eventMessage.A05;
                    if (str2 == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    str2 = str2;
                    iHashCode2 = str2.hashCode();
                    c2 = 6;
                    break;
                case 6:
                    eventMessage = eventMessage;
                    long j = eventMessage.A03;
                    int i2 = (((result + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
                    long j2 = eventMessage.A01;
                    int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
                    long j3 = eventMessage.A02;
                    eventMessage.A00 = ((i3 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + Arrays.hashCode(eventMessage.A06);
                    c2 = 7;
                    break;
                case 7:
                    return eventMessage.A00;
                case '\b':
                    iHashCode = 0;
                    c2 = 4;
                    break;
            }
        }
    }

    public final String toString() {
        return A00(13, 13, 25) + this.A04 + A00(8, 5, 62) + this.A02 + A00(0, 8, 107) + this.A05;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeLong(this.A03);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A02);
        parcel.writeByteArray(this.A06);
    }
}
