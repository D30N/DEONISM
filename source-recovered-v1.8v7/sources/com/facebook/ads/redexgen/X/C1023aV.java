package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.aV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1023aV extends AbstractC0352Ab {
    public static final Object A09 = new Object();
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;

    @Nullable
    public final Object A06;
    public final boolean A07;
    public final boolean A08;

    public C1023aV(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, @Nullable Object obj) {
        this.A01 = j;
        this.A05 = j2;
        this.A00 = j3;
        this.A03 = j4;
        this.A04 = j5;
        this.A02 = j6;
        this.A08 = z;
        this.A07 = z2;
        this.A06 = obj;
    }

    public C1023aV(long j, long j2, long j3, long j4, boolean z, boolean z2, @Nullable Object obj) {
        this(-9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, obj);
    }

    public C1023aV(long j, boolean z, boolean z2, @Nullable Object obj) {
        this(j, j, 0L, 0L, z, z2, obj);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0352Ab
    public final int A00() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0352Ab
    public final int A01() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0352Ab
    public final int A04(Object obj) {
        int i = 0;
        char c2 = A09.equals(obj) ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i = 0;
                    c2 = 3;
                    break;
                case 3:
                    return i;
                case 4:
                    i = -1;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0352Ab
    public final AZ A0A(int i, AZ az, boolean z) {
        Object obj = null;
        IJ.A00(i, 0, 1);
        char c2 = z ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    obj = A09;
                    c2 = 3;
                    break;
                case 3:
                    C1023aV c1023aV = this;
                    return az.A0B(null, obj, 0, c1023aV.A00, -c1023aV.A04);
                case 4:
                    obj = null;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0352Ab
    public final C0351Aa A0D(int i, C0351Aa c0351Aa, boolean z, long j) {
        long j2 = 0;
        Object obj = null;
        Object obj2 = null;
        long j3 = 0;
        C1023aV c1023aV = this;
        IJ.A00(i, 0, 1);
        char c2 = z ? (char) 2 : '\n';
        while (true) {
            switch (c2) {
                case 2:
                    c1023aV = c1023aV;
                    obj = c1023aV.A06;
                    c2 = 3;
                    break;
                case 3:
                    c1023aV = c1023aV;
                    obj2 = obj;
                    j3 = c1023aV.A02;
                    if (!c1023aV.A07) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (j == 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c1023aV = c1023aV;
                    j2 = c1023aV.A03;
                    if (j2 != -9223372036854775807L) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    j3 = -9223372036854775807L;
                    c2 = 7;
                    break;
                case 7:
                    C1023aV c1023aV2 = c1023aV;
                    return c0351Aa.A04(obj2, c1023aV2.A01, c1023aV2.A05, c1023aV2.A08, c1023aV2.A07, j3, c1023aV2.A03, 0, 0, c1023aV2.A04);
                case '\b':
                    j3 += j;
                    if (j3 <= j2) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    j3 = -9223372036854775807L;
                    c2 = 7;
                    break;
                case '\n':
                    obj = null;
                    c2 = 3;
                    break;
            }
        }
    }
}
