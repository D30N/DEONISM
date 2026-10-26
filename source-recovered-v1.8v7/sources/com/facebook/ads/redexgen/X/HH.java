package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$Parameters;

/* loaded from: assets/audience_network.dex */
public final class HH implements Comparable<HH> {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final DefaultTrackSelector$Parameters A06;

    public HH(Format format, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, int i) {
        this.A06 = defaultTrackSelector$Parameters;
        this.A05 = BK.A0H(i, false) ? 1 : 0;
        this.A03 = BK.A0K(format, defaultTrackSelector$Parameters.A07) ? 1 : 0;
        this.A02 = (format.A0D & 1) != 0 ? 1 : 0;
        this.A01 = format.A05;
        this.A04 = format.A0C;
        this.A00 = format.A04;
    }

    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(HH hh) {
        HH hh2 = this;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = hh2.A05;
        int i12 = hh.A05;
        char c2 = i11 != i12 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return BK.A01(i11, i12);
                case 3:
                    hh2 = hh2;
                    hh = hh;
                    i8 = hh2.A03;
                    i10 = hh.A03;
                    if (i8 == i10) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return BK.A01(i8, i10);
                case 5:
                    hh2 = hh2;
                    hh = hh;
                    i3 = hh2.A02;
                    i2 = hh.A02;
                    if (i3 == i2) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return BK.A01(i3, i2);
                case 7:
                    hh2 = hh2;
                    if (!hh2.A06.A0D) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return BK.A01(hh.A00, hh2.A00);
                case '\t':
                    hh2 = hh2;
                    i6 = 1;
                    if (hh2.A05 != 1) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    hh2 = hh2;
                    hh = hh;
                    i7 = i6;
                    i5 = hh2.A01;
                    i4 = hh.A01;
                    if (i5 == i4) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    return BK.A01(i5, i4) * i7;
                case '\f':
                    i6 = -1;
                    c2 = '\n';
                    break;
                case '\r':
                    hh2 = hh2;
                    hh = hh;
                    i9 = hh2.A04;
                    i = hh.A04;
                    if (i9 == i) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    return BK.A01(i9, i) * i7;
                case 15:
                    return BK.A01(hh2.A00, hh.A00) * i7;
            }
        }
    }

    public final boolean equals(@Nullable Object obj) {
        HH hh = this;
        HH hh2 = null;
        boolean z = true;
        char c2 = hh == obj ? (char) 2 : (char) 3;
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
                    hh = hh;
                    obj = obj;
                    if (hh.getClass() == obj.getClass()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    hh = hh;
                    obj = obj;
                    hh2 = (HH) obj;
                    if (hh.A05 != hh2.A05) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    hh = hh;
                    hh2 = hh2;
                    if (hh.A03 != hh2.A03) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    hh = hh;
                    hh2 = hh2;
                    if (hh.A02 != hh2.A02) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    hh = hh;
                    hh2 = hh2;
                    if (hh.A01 != hh2.A01) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    hh = hh;
                    hh2 = hh2;
                    if (hh.A04 != hh2.A04) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    hh = hh;
                    hh2 = hh2;
                    if (hh.A00 != hh2.A00) {
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
        int i = ((this.A05 * 31) + this.A03) * 31;
        int result = this.A02;
        int i2 = (((i + result) * 31) + this.A01) * 31;
        int result2 = this.A04;
        return ((i2 + result2) * 31) + this.A00;
    }
}
