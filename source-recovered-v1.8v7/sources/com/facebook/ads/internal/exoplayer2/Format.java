package com.facebook.ads.internal.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.video.ColorInfo;
import com.facebook.ads.redexgen.X.A7;
import com.facebook.ads.redexgen.X.C0560Iy;
import d.b.a.b.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class Format implements Parcelable {
    public static byte[] A0R;
    public static final Parcelable.Creator<Format> CREATOR;
    public int A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final long A0G;

    @Nullable
    public final DrmInitData A0H;

    @Nullable
    public final Metadata A0I;

    @Nullable
    public final ColorInfo A0J;

    @Nullable
    public final String A0K;

    @Nullable
    public final String A0L;

    @Nullable
    public final String A0M;

    @Nullable
    public final String A0N;

    @Nullable
    public final String A0O;
    public final List<byte[]> A0P;

    @Nullable
    public final byte[] A0Q;

    public static String A0G(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0R, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 27);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0H() {
        A0R = new byte[]{93, 81, -39, 2, 5, 0, -12, 7, -69, -56, -127, 77, -61, -73, -14};
    }

    static {
        A0H();
        CREATOR = new A7();
    }

    public Format(Parcel parcel) {
        this.A0M = parcel.readString();
        this.A0L = parcel.readString();
        this.A0O = parcel.readString();
        this.A0K = parcel.readString();
        this.A04 = parcel.readInt();
        this.A09 = parcel.readInt();
        this.A0F = parcel.readInt();
        this.A08 = parcel.readInt();
        this.A01 = parcel.readFloat();
        this.A0B = parcel.readInt();
        this.A02 = parcel.readFloat();
        this.A0Q = C0560Iy.A0i(parcel) ? parcel.createByteArray() : null;
        this.A0E = parcel.readInt();
        this.A0J = (ColorInfo) parcel.readParcelable(ColorInfo.class.getClassLoader());
        this.A05 = parcel.readInt();
        this.A0C = parcel.readInt();
        this.A0A = parcel.readInt();
        this.A06 = parcel.readInt();
        this.A07 = parcel.readInt();
        this.A0D = parcel.readInt();
        this.A0N = parcel.readString();
        this.A03 = parcel.readInt();
        this.A0G = parcel.readLong();
        int i = parcel.readInt();
        this.A0P = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.A0P.add(parcel.createByteArray());
        }
        this.A0H = (DrmInitData) parcel.readParcelable(DrmInitData.class.getClassLoader());
        this.A0I = (Metadata) parcel.readParcelable(Metadata.class.getClassLoader());
    }

    public Format(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, @Nullable byte[] bArr, int i6, @Nullable ColorInfo colorInfo, int i7, int i8, int i9, int i10, int i11, int i12, @Nullable String str5, int i13, long j, @Nullable List<byte[]> list, @Nullable DrmInitData drmInitData, @Nullable Metadata metadata) {
        int i14 = i5;
        float f3 = f2;
        int i15 = i11;
        int i16 = i10;
        List<byte[]> list2 = list;
        this.A0M = str;
        this.A0L = str2;
        this.A0O = str3;
        this.A0K = str4;
        this.A04 = i;
        this.A09 = i2;
        this.A0F = i3;
        this.A08 = i4;
        this.A01 = f;
        this.A0B = i14 == -1 ? 0 : i14;
        this.A02 = f3 == -1.0f ? 1.0f : f3;
        this.A0Q = bArr;
        this.A0E = i6;
        this.A0J = colorInfo;
        this.A05 = i7;
        this.A0C = i8;
        this.A0A = i9;
        this.A06 = i16 == -1 ? 0 : i16;
        this.A07 = i15 == -1 ? 0 : i15;
        this.A0D = i12;
        this.A0N = str5;
        this.A03 = i13;
        this.A0G = j;
        this.A0P = list2 == null ? Collections.emptyList() : list2;
        this.A0H = drmInitData;
        this.A0I = metadata;
    }

    public static Format A00(@Nullable String str, String str2, int i, @Nullable String str3) {
        return A01(str, str2, i, str3, null);
    }

    public static Format A01(@Nullable String str, String str2, int i, @Nullable String str3, @Nullable DrmInitData drmInitData) {
        return A09(str, str2, null, -1, i, str3, -1, drmInitData, Long.MAX_VALUE, Collections.emptyList());
    }

    public static Format A02(@Nullable String str, @Nullable String str2, long j) {
        return new Format(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j, null, null, null);
    }

    public static Format A03(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, float f, List<byte[]> initializationData, int i5, float f2, @Nullable DrmInitData drmInitData) {
        return A04(str, str2, str3, i, i2, i3, i4, f, initializationData, i5, f2, null, -1, null, drmInitData);
    }

    public static Format A04(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, byte[] bArr, int i6, @Nullable ColorInfo colorInfo, @Nullable DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i, i2, i3, i4, f, i5, f2, bArr, i6, colorInfo, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, drmInitData, null);
    }

    public static Format A05(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, List<byte[]> list, @Nullable DrmInitData drmInitData, int i8, @Nullable String str4, @Nullable Metadata metadata) {
        return new Format(str, null, str2, str3, i, i2, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, i5, i6, i7, i8, str4, -1, Long.MAX_VALUE, list, drmInitData, metadata);
    }

    public static Format A06(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, int i5, List<byte[]> initializationData, @Nullable DrmInitData drmInitData, int i6, @Nullable String str4) {
        return A05(str, str2, str3, i, i2, i3, i4, i5, -1, -1, initializationData, drmInitData, i6, str4, null);
    }

    public static Format A07(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, List<byte[]> initializationData, @Nullable DrmInitData drmInitData, int i5, @Nullable String str4) {
        return A06(str, str2, str3, i, i2, i3, i4, -1, initializationData, drmInitData, i5, str4);
    }

    public static Format A08(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, @Nullable String str4, int i3, @Nullable DrmInitData drmInitData) {
        return A09(str, str2, str3, i, i2, str4, i3, drmInitData, Long.MAX_VALUE, Collections.emptyList());
    }

    public static Format A09(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, @Nullable String str4, int i3, @Nullable DrmInitData drmInitData, long j, List<byte[]> list) {
        return new Format(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str4, i3, j, list, drmInitData, null);
    }

    public static Format A0A(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, List<byte[]> list, @Nullable String str4, @Nullable DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str4, -1, Long.MAX_VALUE, list, drmInitData, null);
    }

    public static Format A0B(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, @Nullable DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, drmInitData, null);
    }

    public static Format A0C(@Nullable String str, @Nullable String str2, String str3, String str4, int i, int i2, int i3, float f, List<byte[]> list, int i4) {
        return new Format(str, str2, str3, str4, i, -1, i2, i3, f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i4, null, -1, Long.MAX_VALUE, list, null, null);
    }

    public static Format A0D(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i, int i2, int i3, List<byte[]> list, int i4, @Nullable String str5) {
        return new Format(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i2, i3, -1, -1, -1, i4, str5, -1, Long.MAX_VALUE, list, null, null);
    }

    public static Format A0E(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i, int i2, @Nullable String str5) {
        return new Format(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str5, -1, Long.MAX_VALUE, null, null, null);
    }

    public static Format A0F(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i, int i2, @Nullable String str5, int i3) {
        return new Format(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str5, i3, Long.MAX_VALUE, null, null, null);
    }

    public final int A0I() {
        Format format = this;
        int i = 0;
        int i2 = format.A0F;
        int i3 = -1;
        char c2 = i2 != -1 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    format = format;
                    i = format.A08;
                    if (i != i3) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return i3;
                case 4:
                    i3 = i2 * i;
                    c2 = 3;
                    break;
            }
        }
    }

    public final Format A0J(int i) {
        return new Format(this.A0M, this.A0L, this.A0O, this.A0K, this.A04, i, this.A0F, this.A08, this.A01, this.A0B, this.A02, this.A0Q, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, this.A06, this.A07, this.A0D, this.A0N, this.A03, this.A0G, this.A0P, this.A0H, this.A0I);
    }

    public final Format A0K(int i, int i2) {
        return new Format(this.A0M, this.A0L, this.A0O, this.A0K, this.A04, this.A09, this.A0F, this.A08, this.A01, this.A0B, this.A02, this.A0Q, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, i, i2, this.A0D, this.A0N, this.A03, this.A0G, this.A0P, this.A0H, this.A0I);
    }

    public final Format A0L(long j) {
        return new Format(this.A0M, this.A0L, this.A0O, this.A0K, this.A04, this.A09, this.A0F, this.A08, this.A01, this.A0B, this.A02, this.A0Q, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, this.A06, this.A07, this.A0D, this.A0N, this.A03, j, this.A0P, this.A0H, this.A0I);
    }

    public final Format A0M(Format format) {
        if (this == format) {
            return this;
        }
        String str = format.A0M;
        String codecs = this.A0K;
        if (codecs == null) {
            codecs = format.A0K;
        }
        int bitrate = this.A04;
        if (bitrate == -1) {
            bitrate = format.A04;
        }
        float f = this.A01;
        if (f == -1.0f) {
            f = format.A01;
        }
        int i = this.A0D | format.A0D;
        String str2 = this.A0N;
        if (str2 == null) {
            str2 = format.A0N;
        }
        DrmInitData drmInitDataA01 = DrmInitData.A01(format.A0H, this.A0H);
        String str3 = this.A0L;
        String str4 = this.A0O;
        int i2 = this.A09;
        int i3 = this.A0F;
        int i4 = this.A08;
        int i5 = this.A0B;
        float frameRate = this.A02;
        return new Format(str, str3, str4, codecs, bitrate, i2, i3, i4, f, i5, frameRate, this.A0Q, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, this.A06, this.A07, i, str2, this.A03, this.A0G, this.A0P, drmInitDataA01, this.A0I);
    }

    public final Format A0N(@Nullable DrmInitData drmInitData) {
        return new Format(this.A0M, this.A0L, this.A0O, this.A0K, this.A04, this.A09, this.A0F, this.A08, this.A01, this.A0B, this.A02, this.A0Q, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, this.A06, this.A07, this.A0D, this.A0N, this.A03, this.A0G, this.A0P, drmInitData, this.A0I);
    }

    public final Format A0O(@Nullable Metadata metadata) {
        return new Format(this.A0M, this.A0L, this.A0O, this.A0K, this.A04, this.A09, this.A0F, this.A08, this.A01, this.A0B, this.A02, this.A0Q, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, this.A06, this.A07, this.A0D, this.A0N, this.A03, this.A0G, this.A0P, this.A0H, metadata);
    }

    public final boolean A0P(Format format) {
        Format format2 = this;
        int i = 0;
        char c2 = format2.A0P.size() != format.A0P.size() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return false;
                case 3:
                    i = 0;
                    c2 = 4;
                    break;
                case 4:
                    format2 = format2;
                    if (i >= format2.A0P.size()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    format2 = format2;
                    format = format;
                    if (!Arrays.equals(format2.A0P.get(i), format.A0P.get(i))) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 6:
                    return false;
                case 7:
                    i++;
                    c2 = 4;
                    break;
                case '\b':
                    return true;
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        Format format = this;
        Format format2 = null;
        boolean z = true;
        char c2 = format == obj ? (char) 2 : (char) 3;
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
                    format = format;
                    obj = obj;
                    if (format.getClass() == obj.getClass()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    format = format;
                    obj = obj;
                    format2 = (Format) obj;
                    if (format.A04 != format2.A04) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    format = format;
                    format2 = format2;
                    if (format.A09 != format2.A09) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    format = format;
                    format2 = format2;
                    if (format.A0F != format2.A0F) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    format = format;
                    format2 = format2;
                    if (format.A08 != format2.A08) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    format = format;
                    format2 = format2;
                    if (format.A01 != format2.A01) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    format = format;
                    format2 = format2;
                    if (format.A0B != format2.A0B) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    format = format;
                    format2 = format2;
                    if (format.A02 != format2.A02) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    format = format;
                    format2 = format2;
                    if (format.A0E != format2.A0E) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    format = format;
                    format2 = format2;
                    if (format.A05 != format2.A05) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    format = format;
                    format2 = format2;
                    if (format.A0C != format2.A0C) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    format = format;
                    format2 = format2;
                    if (format.A0A != format2.A0A) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    format = format;
                    format2 = format2;
                    if (format.A06 != format2.A06) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    format = format;
                    format2 = format2;
                    if (format.A07 != format2.A07) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    format = format;
                    format2 = format2;
                    if (format.A0G != format2.A0G) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    format = format;
                    format2 = format2;
                    if (format.A0D != format2.A0D) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    format = format;
                    format2 = format2;
                    if (!C0560Iy.A0j(format.A0M, format2.A0M)) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    format = format;
                    format2 = format2;
                    if (!C0560Iy.A0j(format.A0N, format2.A0N)) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    format = format;
                    format2 = format2;
                    if (format.A03 != format2.A03) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 24:
                    format = format;
                    format2 = format2;
                    if (!C0560Iy.A0j(format.A0L, format2.A0L)) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = 25;
                        break;
                    }
                case 25:
                    format = format;
                    format2 = format2;
                    if (!C0560Iy.A0j(format.A0O, format2.A0O)) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = 26;
                        break;
                    }
                case 26:
                    format = format;
                    format2 = format2;
                    if (!C0560Iy.A0j(format.A0K, format2.A0K)) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = 27;
                        break;
                    }
                case 27:
                    format = format;
                    format2 = format2;
                    if (!C0560Iy.A0j(format.A0H, format2.A0H)) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = 28;
                        break;
                    }
                case 28:
                    format = format;
                    format2 = format2;
                    if (!C0560Iy.A0j(format.A0I, format2.A0I)) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = 29;
                        break;
                    }
                case 29:
                    format = format;
                    format2 = format2;
                    if (!C0560Iy.A0j(format.A0J, format2.A0J)) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 30:
                    format = format;
                    format2 = format2;
                    if (!Arrays.equals(format.A0Q, format2.A0Q)) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = 31;
                        break;
                    }
                case 31:
                    format = format;
                    format2 = format2;
                    if (!format.A0P(format2)) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = ' ';
                        break;
                    }
                case ' ':
                    return z;
                case '!':
                    z = false;
                    c2 = ' ';
                    break;
            }
        }
    }

    public final int hashCode() {
        Format format = this;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        String str5 = null;
        int i2 = 0;
        int i3 = 0;
        DrmInitData drmInitData = null;
        int iHashCode = 0;
        int iHashCode2 = 0;
        int i4 = 0;
        int iHashCode3 = 0;
        int iHashCode4 = 0;
        int i5 = 0;
        int iHashCode5 = 0;
        int i6 = 0;
        int i7 = 0;
        int iHashCode6 = 0;
        int iHashCode7 = 0;
        Metadata metadata = null;
        char c2 = format.A00 == 0 ? (char) 2 : (char) 16;
        while (true) {
            switch (c2) {
                case 2:
                    format = format;
                    i4 = 17 * 31;
                    str = format.A0M;
                    iHashCode6 = 0;
                    if (str != null) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    iHashCode = 0;
                    c2 = 4;
                    break;
                case 4:
                    format = format;
                    i3 = (i4 + iHashCode) * 31;
                    str5 = format.A0L;
                    if (str5 != null) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    iHashCode7 = 0;
                    c2 = 6;
                    break;
                case 6:
                    format = format;
                    i = (i3 + iHashCode7) * 31;
                    str2 = format.A0O;
                    if (str2 != null) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    iHashCode4 = 0;
                    c2 = '\b';
                    break;
                case '\b':
                    format = format;
                    i5 = (i + iHashCode4) * 31;
                    str3 = format.A0K;
                    if (str3 != null) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    iHashCode5 = 0;
                    c2 = '\n';
                    break;
                case '\n':
                    format = format;
                    i6 = (((((((((((i5 + iHashCode5) * 31) + format.A04) * 31) + format.A0F) * 31) + format.A08) * 31) + format.A05) * 31) + format.A0C) * 31;
                    str4 = format.A0N;
                    if (str4 != null) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    iHashCode3 = 0;
                    c2 = '\f';
                    break;
                case '\f':
                    format = format;
                    i7 = (((i6 + iHashCode3) * 31) + format.A03) * 31;
                    drmInitData = format.A0H;
                    if (drmInitData != null) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    iHashCode2 = 0;
                    c2 = 14;
                    break;
                case 14:
                    format = format;
                    i2 = (i7 + iHashCode2) * 31;
                    metadata = format.A0I;
                    if (metadata != null) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    format = format;
                    format.A00 = i2 + iHashCode6;
                    c2 = 16;
                    break;
                case 16:
                    return format.A00;
                case 17:
                    metadata = metadata;
                    iHashCode6 = metadata.hashCode();
                    c2 = 15;
                    break;
                case 18:
                    drmInitData = drmInitData;
                    iHashCode2 = drmInitData.hashCode();
                    c2 = 14;
                    break;
                case 19:
                    str4 = str4;
                    iHashCode3 = str4.hashCode();
                    c2 = '\f';
                    break;
                case 20:
                    str3 = str3;
                    iHashCode5 = str3.hashCode();
                    c2 = '\n';
                    break;
                case 21:
                    str2 = str2;
                    iHashCode4 = str2.hashCode();
                    c2 = '\b';
                    break;
                case 22:
                    str5 = str5;
                    iHashCode7 = str5.hashCode();
                    c2 = 6;
                    break;
                case 23:
                    str = str;
                    iHashCode = str.hashCode();
                    c2 = 4;
                    break;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(A0G(2, 7, k.AppCompatTheme_windowFixedWidthMajor));
        sb.append(this.A0M);
        String strA0G = A0G(0, 2, 22);
        sb.append(strA0G);
        sb.append(this.A0L);
        sb.append(strA0G);
        sb.append(this.A0O);
        sb.append(strA0G);
        sb.append(this.A04);
        sb.append(strA0G);
        sb.append(this.A0N);
        String strA0G2 = A0G(12, 3, k.AppCompatTheme_windowNoTitle);
        sb.append(strA0G2);
        sb.append(this.A0F);
        sb.append(strA0G);
        sb.append(this.A08);
        sb.append(strA0G);
        sb.append(this.A01);
        sb.append(A0G(9, 1, 80));
        sb.append(strA0G2);
        sb.append(this.A05);
        sb.append(strA0G);
        sb.append(this.A0C);
        sb.append(A0G(10, 2, 9));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Format format = this;
        int i2 = 0;
        boolean z = false;
        byte[] bArr = null;
        int size = 0;
        parcel.writeString(format.A0M);
        parcel.writeString(format.A0L);
        parcel.writeString(format.A0O);
        parcel.writeString(format.A0K);
        parcel.writeInt(format.A04);
        parcel.writeInt(format.A09);
        parcel.writeInt(format.A0F);
        parcel.writeInt(format.A08);
        parcel.writeFloat(format.A01);
        parcel.writeInt(format.A0B);
        parcel.writeFloat(format.A02);
        char c2 = format.A0Q != null ? (char) 2 : '\b';
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    format = format;
                    parcel = parcel;
                    C0560Iy.A0Y(parcel, z);
                    bArr = format.A0Q;
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
                    format = format;
                    parcel = parcel;
                    parcel.writeInt(format.A0E);
                    parcel.writeParcelable(format.A0J, i);
                    parcel.writeInt(format.A05);
                    parcel.writeInt(format.A0C);
                    parcel.writeInt(format.A0A);
                    parcel.writeInt(format.A06);
                    parcel.writeInt(format.A07);
                    parcel.writeInt(format.A0D);
                    parcel.writeString(format.A0N);
                    parcel.writeInt(format.A03);
                    parcel.writeLong(format.A0G);
                    size = format.A0P.size();
                    parcel.writeInt(size);
                    i2 = 0;
                    c2 = 6;
                    break;
                case 6:
                    if (i2 >= size) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    format = format;
                    parcel = parcel;
                    parcel.writeByteArray(format.A0P.get(i2));
                    i2++;
                    c2 = 6;
                    break;
                case '\b':
                    z = false;
                    c2 = 3;
                    break;
                case '\t':
                    Format format2 = format;
                    Parcel parcel2 = parcel;
                    parcel2.writeParcelable(format2.A0H, 0);
                    parcel2.writeParcelable(format2.A0I, 0);
                    return;
            }
        }
    }
}
