package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.Format;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: assets/audience_network.dex */
public final class ZW implements DI {
    public static byte[] A0D;
    public static final double[] A0E;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public CO A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final boolean[] A0C = new boolean[4];
    public final DJ A0B = new DJ(128);

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 113);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A0D = new byte[]{69, 90, 87, 86, 92, 28, 94, 67, 86, 84, 1};
    }

    static {
        A02();
        A0E = new double[]{23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    }

    public static Pair<Format, Long> A00(DJ dj, String str) {
        String str2 = str;
        DJ dj2 = dj;
        long j = 0;
        double d2 = 0.0d;
        float f = 0.0f;
        int i = 0;
        double[] dArr = null;
        int i2 = 0;
        int i3 = 0;
        Format formatA03 = null;
        byte[] bArrCopyOf = Arrays.copyOf(dj2.A02, dj2.A00);
        int i4 = bArrCopyOf[4] & 255;
        int i5 = bArrCopyOf[5] & 255;
        int secondByte = bArrCopyOf[6];
        int i6 = secondByte & 255;
        int thirdByte = i5 >> 4;
        int i7 = (i4 << 4) | thirdByte;
        int width = i5 & 15;
        int i8 = (width << 8) | i6;
        int width2 = bArrCopyOf[7];
        int i9 = (width2 & 240) >> 4;
        int aspectRatioCode = i9 != 2 ? 2 : 13;
        while (true) {
            switch (aspectRatioCode) {
                case 2:
                    if (i9 == 3) {
                        aspectRatioCode = 12;
                        break;
                    } else {
                        aspectRatioCode = 3;
                        break;
                    }
                case 3:
                    if (i9 == 4) {
                        aspectRatioCode = 11;
                        break;
                    } else {
                        aspectRatioCode = 4;
                        break;
                    }
                case 4:
                    f = 1.0f;
                    aspectRatioCode = 5;
                    break;
                case 5:
                    bArrCopyOf = bArrCopyOf;
                    str2 = str2;
                    formatA03 = Format.A03(str2, A01(0, 11, 66), null, -1, -1, i7, i8, -1.0f, Collections.singletonList(bArrCopyOf), -1, f, null);
                    j = 0;
                    i = (bArrCopyOf[7] & 15) - 1;
                    if (i < 0) {
                        aspectRatioCode = 10;
                        break;
                    } else {
                        aspectRatioCode = 6;
                        break;
                    }
                case 6:
                    dArr = A0E;
                    int frameRateCodeMinusOne = dArr.length;
                    if (i >= frameRateCodeMinusOne) {
                        aspectRatioCode = 10;
                        break;
                    } else {
                        aspectRatioCode = 7;
                        break;
                    }
                case 7:
                    dj2 = dj2;
                    bArrCopyOf = bArrCopyOf;
                    dArr = dArr;
                    d2 = dArr[i];
                    int i10 = dj2.A01;
                    int frameRateCodeMinusOne2 = i10 + 9;
                    i2 = (bArrCopyOf[frameRateCodeMinusOne2] & 96) >> 5;
                    int frameRateExtensionN = i10 + 9;
                    i3 = bArrCopyOf[frameRateExtensionN] & 31;
                    if (i2 == i3) {
                        aspectRatioCode = 9;
                        break;
                    } else {
                        aspectRatioCode = 8;
                        break;
                    }
                case 8:
                    d2 *= (i2 + 1.0d) / (i3 + 1);
                    aspectRatioCode = 9;
                    break;
                case 9:
                    j = (long) (1000000.0d / d2);
                    aspectRatioCode = 10;
                    break;
                case 10:
                    return Pair.create(formatA03, Long.valueOf(j));
                case 11:
                    int frameRateExtensionN2 = i8 * k.AppCompatTheme_windowFixedWidthMinor;
                    float f2 = frameRateExtensionN2;
                    int frameRateExtensionN3 = i7 * 100;
                    f = f2 / frameRateExtensionN3;
                    aspectRatioCode = 5;
                    break;
                case 12:
                    int frameRateCodeMinusOne3 = i8 * 16;
                    float f3 = frameRateCodeMinusOne3;
                    int frameRateCodeMinusOne4 = i7 * 9;
                    f = f3 / frameRateCodeMinusOne4;
                    aspectRatioCode = 5;
                    break;
                case 13:
                    int frameRateCodeMinusOne5 = i8 * 4;
                    float f4 = frameRateCodeMinusOne5;
                    int frameRateCodeMinusOne6 = i7 * 3;
                    f = f4 / frameRateCodeMinusOne6;
                    aspectRatioCode = 5;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void A47(C0544Ii c0544Ii) {
        C0544Ii c0544Ii2 = c0544Ii;
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        long j = 0;
        long j2 = 0;
        int i4 = 0;
        int iA04 = 0;
        ZW zw = this;
        int iA06 = c0544Ii2.A06();
        int iA07 = c0544Ii2.A07();
        byte[] bArr = c0544Ii2.A00;
        zw.A04 += c0544Ii2.A04();
        zw.A05.ACk(c0544Ii2, c0544Ii2.A04());
        int i5 = 2;
        while (true) {
            switch (i5) {
                case 2:
                    zw = zw;
                    bArr = bArr;
                    iA04 = C0540Ie.A04(bArr, iA06, iA07, zw.A0C);
                    if (iA04 != iA07) {
                        i5 = 6;
                        break;
                    } else {
                        i5 = 3;
                        break;
                    }
                case 3:
                    zw = zw;
                    if (!zw.A07) {
                        i5 = 4;
                        break;
                    } else {
                        i5 = 5;
                        break;
                    }
                case 4:
                    zw = zw;
                    bArr = bArr;
                    zw.A0B.A01(bArr, iA06, iA07);
                    i5 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    zw = zw;
                    c0544Ii2 = c0544Ii2;
                    i4 = c0544Ii2.A00[iA04 + 3] & 255;
                    z = false;
                    z2 = true;
                    if (!zw.A07) {
                        i5 = 7;
                        break;
                    } else {
                        i5 = 13;
                        break;
                    }
                case 7:
                    i3 = iA04 - iA06;
                    if (i3 <= 0) {
                        i5 = 9;
                        break;
                    } else {
                        i5 = 8;
                        break;
                    }
                case 8:
                    zw = zw;
                    bArr = bArr;
                    zw.A0B.A01(bArr, iA06, iA04);
                    i5 = 9;
                    break;
                case 9:
                    if (i3 >= 0) {
                        i5 = 32;
                        break;
                    } else {
                        i5 = 10;
                        break;
                    }
                case 10:
                    i2 = -i3;
                    i5 = 11;
                    break;
                case 11:
                    zw = zw;
                    if (!zw.A0B.A02(i4, i2)) {
                        i5 = 13;
                        break;
                    } else {
                        i5 = 12;
                        break;
                    }
                case 12:
                    zw = zw;
                    Pair<Format, Long> pairA00 = A00(zw.A0B, zw.A06);
                    zw.A05.A5A((Format) pairA00.first);
                    zw.A00 = ((Long) pairA00.second).longValue();
                    zw.A07 = z2;
                    i5 = 13;
                    break;
                case 13:
                    if (i4 == 0) {
                        i5 = 15;
                        break;
                    } else {
                        i5 = 14;
                        break;
                    }
                case 14:
                    if (i4 != 179) {
                        i5 = 30;
                        break;
                    } else {
                        i5 = 15;
                        break;
                    }
                case 15:
                    zw = zw;
                    i = iA07 - iA04;
                    if (!zw.A0A) {
                        i5 = 19;
                        break;
                    } else {
                        i5 = 16;
                        break;
                    }
                case 16:
                    zw = zw;
                    if (!zw.A08) {
                        i5 = 19;
                        break;
                    } else {
                        i5 = 17;
                        break;
                    }
                case 17:
                    zw = zw;
                    if (!zw.A07) {
                        i5 = 19;
                        break;
                    } else {
                        i5 = 18;
                        break;
                    }
                case 18:
                    zw = zw;
                    boolean z3 = zw.A09;
                    zw.A05.ACl(zw.A03, z3 ? 1 : 0, ((int) (zw.A04 - zw.A02)) - i, i, null);
                    i5 = 19;
                    break;
                case 19:
                    zw = zw;
                    if (!zw.A0A) {
                        i5 = 21;
                        break;
                    } else {
                        i5 = 20;
                        break;
                    }
                case 20:
                    zw = zw;
                    if (!zw.A08) {
                        i5 = 23;
                        break;
                    } else {
                        i5 = 21;
                        break;
                    }
                case 21:
                    zw = zw;
                    zw.A02 = zw.A04 - i;
                    j2 = zw.A01;
                    j = -9223372036854775807L;
                    if (j2 == -9223372036854775807L) {
                        i5 = 27;
                        break;
                    } else {
                        i5 = 22;
                        break;
                    }
                case 22:
                    zw = zw;
                    z = false;
                    zw.A03 = j2;
                    zw.A09 = false;
                    zw.A01 = j;
                    zw.A0A = z2;
                    i5 = 23;
                    break;
                case 23:
                    if (i4 != 0) {
                        i5 = 25;
                        break;
                    } else {
                        i5 = 24;
                        break;
                    }
                case 24:
                    z = true;
                    i5 = 25;
                    break;
                case 25:
                    zw = zw;
                    zw.A08 = z;
                    i5 = 26;
                    break;
                case 26:
                    iA06 = iA04 + 3;
                    i5 = 2;
                    break;
                case 27:
                    zw = zw;
                    if (!zw.A0A) {
                        i5 = 29;
                        break;
                    } else {
                        i5 = 28;
                        break;
                    }
                case 28:
                    zw = zw;
                    j2 = zw.A03 + zw.A00;
                    i5 = 22;
                    break;
                case 29:
                    j2 = 0;
                    i5 = 22;
                    break;
                case 30:
                    if (i4 != 184) {
                        i5 = 26;
                        break;
                    } else {
                        i5 = 31;
                        break;
                    }
                case 31:
                    zw = zw;
                    zw.A09 = z2;
                    i5 = 26;
                    break;
                case 32:
                    i2 = 0;
                    i5 = 11;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void A4U(CE ce, DW dw) {
        dw.A05();
        this.A06 = dw.A04();
        this.A05 = ce.ADd(dw.A03(), 2);
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void ABa() {
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void ABb(long j, boolean z) {
        this.A01 = j;
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void ACo() {
        C0540Ie.A0B(this.A0C);
        this.A0B.A00();
        this.A04 = 0L;
        this.A0A = false;
    }
}
