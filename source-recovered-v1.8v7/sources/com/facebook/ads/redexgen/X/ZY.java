package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.Format;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: assets/audience_network.dex */
public final class ZY implements DI {
    public static byte[] A0E;
    public long A00;
    public long A01;
    public CO A02;
    public DN A03;
    public String A04;
    public boolean A05;
    public final DR A0B;
    public final boolean[] A0D = new boolean[3];
    public final DO A0A = new DO(32, 128);
    public final DO A08 = new DO(33, 128);
    public final DO A06 = new DO(34, 128);
    public final DO A07 = new DO(39, 128);
    public final DO A09 = new DO(40, 128);
    public final C0544Ii A0C = new C0544Ii();

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 59);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A0E = new byte[]{-7, -29, -25, -26, 3, 22, 18, 21, 22, 35, -92, -67, -76, -57, -65, -76, -78, -61, -76, -77, 111, -80, -62, -65, -76, -78, -61, -82, -63, -80, -61, -72, -66, -82, -72, -77, -78, 111, -59, -80, -69, -60, -76, -119, 111, -53, -66, -71, -70, -60, -124, -67, -70, -53, -72};
    }

    public ZY(DR dr) {
        this.A0B = dr;
    }

    public static Format A00(String str, DO r36, DO r37, DO r38) {
        int log2MaxPicOrderCntLsbMinus4 = 0;
        int maxSubLayersMinus1 = 0;
        int toSkip = 0;
        float f = 0.0f;
        int picHeightInLumaSamples = 0;
        int confWinLeftOffset = 0;
        int confWinRightOffset = 0;
        int i = 0;
        int iA04 = 0;
        int iA042 = 0;
        int iA05 = 0;
        int i2 = 0;
        int i3 = 0;
        int iA043 = 0;
        int iA044 = 0;
        int iA045 = 0;
        int i4 = 0;
        int i5 = 0;
        byte[] bArr = new byte[r36.A00 + r37.A00 + r38.A00];
        System.arraycopy(r36.A01, 0, bArr, 0, r36.A00);
        System.arraycopy(r37.A01, 0, bArr, r36.A00, r37.A00);
        System.arraycopy(r38.A01, 0, bArr, r36.A00 + r37.A00, r38.A00);
        byte[] csd = r37.A01;
        C0545Ij c0545Ij = new C0545Ij(csd, 0, r37.A00);
        c0545Ij.A07(44);
        int iA052 = c0545Ij.A05(3);
        c0545Ij.A06();
        c0545Ij.A07(88);
        c0545Ij.A07(8);
        int i6 = 0;
        int i7 = 0;
        float pixelWidthHeightRatio = 2.8E-45f;
        while (true) {
            switch (pixelWidthHeightRatio) {
                case 2.8E-45f:
                    if (i7 >= iA052) {
                        pixelWidthHeightRatio = 1.1E-44f;
                        break;
                    } else {
                        pixelWidthHeightRatio = 4.2E-45f;
                        break;
                    }
                case 4.2E-45f:
                    c0545Ij = c0545Ij;
                    if (!c0545Ij.A0A()) {
                        pixelWidthHeightRatio = 7.0E-45f;
                        break;
                    } else {
                        pixelWidthHeightRatio = 5.6E-45f;
                        break;
                    }
                case 5.6E-45f:
                    i6 += 89;
                    pixelWidthHeightRatio = 7.0E-45f;
                    break;
                case 7.0E-45f:
                    c0545Ij = c0545Ij;
                    if (!c0545Ij.A0A()) {
                        pixelWidthHeightRatio = 9.8E-45f;
                        break;
                    } else {
                        pixelWidthHeightRatio = 8.4E-45f;
                        break;
                    }
                case 8.4E-45f:
                    i6 += 8;
                    pixelWidthHeightRatio = 9.8E-45f;
                    break;
                case 9.8E-45f:
                    i7++;
                    pixelWidthHeightRatio = 2.8E-45f;
                    break;
                case 1.1E-44f:
                    c0545Ij = c0545Ij;
                    c0545Ij.A07(i6);
                    i2 = 2;
                    if (iA052 <= 0) {
                        pixelWidthHeightRatio = 1.4E-44f;
                        break;
                    } else {
                        pixelWidthHeightRatio = 1.3E-44f;
                        break;
                    }
                case 1.3E-44f:
                    c0545Ij = c0545Ij;
                    int ltRefPicPocLsbSpsLength = 8 - iA052;
                    c0545Ij.A07(ltRefPicPocLsbSpsLength * 2);
                    pixelWidthHeightRatio = 1.4E-44f;
                    break;
                case 1.4E-44f:
                    c0545Ij = c0545Ij;
                    c0545Ij.A04();
                    confWinLeftOffset = c0545Ij.A04();
                    if (confWinLeftOffset != 3) {
                        pixelWidthHeightRatio = 1.7E-44f;
                        break;
                    } else {
                        pixelWidthHeightRatio = 1.5E-44f;
                        break;
                    }
                case 1.5E-44f:
                    c0545Ij = c0545Ij;
                    c0545Ij.A06();
                    pixelWidthHeightRatio = 1.7E-44f;
                    break;
                case 1.7E-44f:
                    c0545Ij = c0545Ij;
                    iA043 = c0545Ij.A04();
                    iA04 = c0545Ij.A04();
                    if (!c0545Ij.A0A()) {
                        pixelWidthHeightRatio = 2.7E-44f;
                        break;
                    } else {
                        pixelWidthHeightRatio = 1.8E-44f;
                        break;
                    }
                case 1.8E-44f:
                    c0545Ij = c0545Ij;
                    iA044 = c0545Ij.A04();
                    iA045 = c0545Ij.A04();
                    picHeightInLumaSamples = c0545Ij.A04();
                    iA042 = c0545Ij.A04();
                    i3 = 1;
                    if (confWinLeftOffset == 1) {
                        pixelWidthHeightRatio = 2.1E-44f;
                        break;
                    } else {
                        pixelWidthHeightRatio = 2.0E-44f;
                        break;
                    }
                case 2.0E-44f:
                    if (confWinLeftOffset != i2) {
                        pixelWidthHeightRatio = 3.5E-44f;
                        break;
                    } else {
                        pixelWidthHeightRatio = 2.1E-44f;
                        break;
                    }
                case 2.1E-44f:
                    i4 = 2;
                    pixelWidthHeightRatio = 2.24E-44f;
                    break;
                case 2.24E-44f:
                    if (confWinLeftOffset != i3) {
                        pixelWidthHeightRatio = 2.5E-44f;
                        break;
                    } else {
                        pixelWidthHeightRatio = 2.4E-44f;
                        break;
                    }
                case 2.4E-44f:
                    i3 = 2;
                    pixelWidthHeightRatio = 2.5E-44f;
                    break;
                case 2.5E-44f:
                    iA043 -= (iA044 + iA045) * i4;
                    iA04 -= (picHeightInLumaSamples + iA042) * i3;
                    pixelWidthHeightRatio = 2.7E-44f;
                    break;
                case 2.7E-44f:
                    c0545Ij = c0545Ij;
                    c0545Ij.A04();
                    c0545Ij.A04();
                    maxSubLayersMinus1 = c0545Ij.A04();
                    if (!c0545Ij.A0A()) {
                        pixelWidthHeightRatio = 3.4E-44f;
                        break;
                    } else {
                        pixelWidthHeightRatio = 2.8E-44f;
                        break;
                    }
                case 2.8E-44f:
                    i5 = 0;
                    pixelWidthHeightRatio = 2.9E-44f;
                    break;
                case 2.9E-44f:
                    toSkip = i5;
                    pixelWidthHeightRatio = 3.1E-44f;
                    break;
                case 3.1E-44f:
                    if (toSkip > iA052) {
                        pixelWidthHeightRatio = 3.6E-44f;
                        break;
                    } else {
                        pixelWidthHeightRatio = 3.2E-44f;
                        break;
                    }
                case 3.2E-44f:
                    c0545Ij = c0545Ij;
                    c0545Ij.A04();
                    c0545Ij.A04();
                    c0545Ij.A04();
                    toSkip++;
                    pixelWidthHeightRatio = 3.1E-44f;
                    break;
                case 3.4E-44f:
                    i5 = iA052;
                    pixelWidthHeightRatio = 2.9E-44f;
                    break;
                case 3.5E-44f:
                    i4 = 1;
                    pixelWidthHeightRatio = 2.24E-44f;
                    break;
                case 3.6E-44f:
                    c0545Ij = c0545Ij;
                    c0545Ij.A04();
                    c0545Ij.A04();
                    c0545Ij.A04();
                    c0545Ij.A04();
                    c0545Ij.A04();
                    c0545Ij.A04();
                    if (!c0545Ij.A0A()) {
                        pixelWidthHeightRatio = 4.1E-44f;
                        break;
                    } else {
                        pixelWidthHeightRatio = 3.8E-44f;
                        break;
                    }
                case 3.8E-44f:
                    c0545Ij = c0545Ij;
                    if (!c0545Ij.A0A()) {
                        pixelWidthHeightRatio = 4.1E-44f;
                        break;
                    } else {
                        pixelWidthHeightRatio = 3.9E-44f;
                        break;
                    }
                case 3.9E-44f:
                    c0545Ij = c0545Ij;
                    A05(c0545Ij);
                    pixelWidthHeightRatio = 4.1E-44f;
                    break;
                case 4.1E-44f:
                    c0545Ij = c0545Ij;
                    c0545Ij.A07(i2);
                    if (!c0545Ij.A0A()) {
                        pixelWidthHeightRatio = 4.3E-44f;
                        break;
                    } else {
                        pixelWidthHeightRatio = 4.2E-44f;
                        break;
                    }
                case 4.2E-44f:
                    c0545Ij = c0545Ij;
                    c0545Ij.A07(8);
                    c0545Ij.A04();
                    c0545Ij.A04();
                    c0545Ij.A06();
                    pixelWidthHeightRatio = 4.3E-44f;
                    break;
                case 4.3E-44f:
                    c0545Ij = c0545Ij;
                    A06(c0545Ij);
                    if (!c0545Ij.A0A()) {
                        pixelWidthHeightRatio = 4.9E-44f;
                        break;
                    } else {
                        pixelWidthHeightRatio = 4.5E-44f;
                        break;
                    }
                case 4.5E-44f:
                    i = 0;
                    pixelWidthHeightRatio = 4.6E-44f;
                    break;
                case 4.6E-44f:
                    c0545Ij = c0545Ij;
                    if (i >= c0545Ij.A04()) {
                        pixelWidthHeightRatio = 4.9E-44f;
                        break;
                    } else {
                        pixelWidthHeightRatio = 4.8E-44f;
                        break;
                    }
                case 4.8E-44f:
                    c0545Ij = c0545Ij;
                    int sarWidth = maxSubLayersMinus1 + 4;
                    int ltRefPicPocLsbSpsLength2 = sarWidth + 1;
                    c0545Ij.A07(ltRefPicPocLsbSpsLength2);
                    i++;
                    pixelWidthHeightRatio = 4.6E-44f;
                    break;
                case 4.9E-44f:
                    c0545Ij = c0545Ij;
                    c0545Ij.A07(i2);
                    f = 1.0f;
                    if (!c0545Ij.A0A()) {
                        pixelWidthHeightRatio = 5.7E-44f;
                        break;
                    } else {
                        pixelWidthHeightRatio = 5.0E-44f;
                        break;
                    }
                case 5.0E-44f:
                    c0545Ij = c0545Ij;
                    if (!c0545Ij.A0A()) {
                        pixelWidthHeightRatio = 5.7E-44f;
                        break;
                    } else {
                        pixelWidthHeightRatio = 5.2E-44f;
                        break;
                    }
                case 5.2E-44f:
                    c0545Ij = c0545Ij;
                    confWinRightOffset = c0545Ij.A05(8);
                    if (confWinRightOffset != 255) {
                        pixelWidthHeightRatio = 5.9E-44f;
                        break;
                    } else {
                        pixelWidthHeightRatio = 5.3E-44f;
                        break;
                    }
                case 5.3E-44f:
                    c0545Ij = c0545Ij;
                    log2MaxPicOrderCntLsbMinus4 = c0545Ij.A05(16);
                    iA05 = c0545Ij.A05(16);
                    if (log2MaxPicOrderCntLsbMinus4 == 0) {
                        pixelWidthHeightRatio = 5.7E-44f;
                        break;
                    } else {
                        pixelWidthHeightRatio = 5.5E-44f;
                        break;
                    }
                case 5.5E-44f:
                    if (iA05 == 0) {
                        pixelWidthHeightRatio = 5.7E-44f;
                        break;
                    } else {
                        pixelWidthHeightRatio = 5.6E-44f;
                        break;
                    }
                case 5.6E-44f:
                    int subWidthC = log2MaxPicOrderCntLsbMinus4;
                    f = subWidthC / iA05;
                    pixelWidthHeightRatio = 5.7E-44f;
                    break;
                case 5.7E-44f:
                    return Format.A03(str, A01(45, 10, 26), null, -1, -1, iA043, iA04, -1.0f, Collections.singletonList(bArr), -1, f, null);
                case 5.9E-44f:
                    int subWidthC2 = C0540Ie.A03.length;
                    if (confWinRightOffset >= subWidthC2) {
                        pixelWidthHeightRatio = 6.2E-44f;
                        break;
                    } else {
                        pixelWidthHeightRatio = 6.0E-44f;
                        break;
                    }
                case 6.0E-44f:
                    f = C0540Ie.A03[confWinRightOffset];
                    pixelWidthHeightRatio = 5.7E-44f;
                    break;
                case 6.2E-44f:
                    Log.w(A01(0, 10, k.AppCompatTheme_windowFixedHeightMajor), A01(10, 35, 20) + confWinRightOffset);
                    pixelWidthHeightRatio = 5.7E-44f;
                    break;
            }
        }
    }

    private void A03(long j, int i, int i2, long j2) {
        ZY zy = this;
        int i3 = 0;
        char c2 = zy.A05 ? (char) 2 : '\b';
        while (true) {
            switch (c2) {
                case 2:
                    zy = zy;
                    zy.A03.A02(j, i);
                    c2 = 3;
                    break;
                case 3:
                    zy = zy;
                    i3 = 5;
                    if (!zy.A07.A04(i2)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    zy = zy;
                    zy.A0C.A0b(zy.A07.A01, C0540Ie.A02(zy.A07.A01, zy.A07.A00));
                    zy.A0C.A0Z(i3);
                    zy.A0B.A02(j2, zy.A0C);
                    c2 = 5;
                    break;
                case 5:
                    zy = zy;
                    if (!zy.A09.A04(i2)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    zy = zy;
                    zy.A0C.A0b(zy.A09.A01, C0540Ie.A02(zy.A09.A01, zy.A09.A00));
                    zy.A0C.A0Z(i3);
                    zy.A0B.A02(j2, zy.A0C);
                    c2 = 7;
                    break;
                case 7:
                    return;
                case '\b':
                    zy = zy;
                    zy.A0A.A04(i2);
                    zy.A08.A04(i2);
                    zy.A06.A04(i2);
                    if (!zy.A0A.A03()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    zy = zy;
                    if (!zy.A08.A03()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    zy = zy;
                    if (!zy.A06.A03()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    zy = zy;
                    zy.A02.A5A(A00(zy.A04, zy.A0A, zy.A08, zy.A06));
                    zy.A05 = true;
                    c2 = 3;
                    break;
            }
        }
    }

    private void A04(long j, int i, int i2, long j2) {
        ZY zy = this;
        char c2 = zy.A05 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    zy = zy;
                    zy.A03.A03(j, i, i2, j2);
                    c2 = 3;
                    break;
                case 3:
                    ZY zy2 = zy;
                    zy2.A07.A01(i2);
                    zy2.A09.A01(i2);
                    return;
                case 4:
                    zy = zy;
                    zy.A0A.A01(i2);
                    zy.A08.A01(i2);
                    zy.A06.A01(i2);
                    c2 = 3;
                    break;
            }
        }
    }

    public static void A05(C0545Ij c0545Ij) {
        int i = 0;
        int matrixId = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    i4 = 4;
                    if (i6 >= 4) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    i2 = 0;
                    c2 = 4;
                    break;
                case 4:
                    if (i2 >= 6) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0545Ij = c0545Ij;
                    i5 = 1;
                    if (!c0545Ij.A0A()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case 6:
                    c0545Ij = c0545Ij;
                    c0545Ij.A04();
                    c2 = 7;
                    break;
                case 7:
                    i3 = 3;
                    if (i6 != 3) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    i2 += i3;
                    c2 = 4;
                    break;
                case '\t':
                    i3 = 1;
                    c2 = '\b';
                    break;
                case '\n':
                    matrixId = Math.min(64, i5 << ((i6 << 1) + i4));
                    if (i6 <= i5) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c0545Ij = c0545Ij;
                    c0545Ij.A03();
                    c2 = '\f';
                    break;
                case '\f':
                    i = 0;
                    c2 = '\r';
                    break;
                case '\r':
                    if (i >= matrixId) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    c0545Ij = c0545Ij;
                    c0545Ij.A03();
                    i++;
                    c2 = '\r';
                    break;
                case 15:
                    i6++;
                    c2 = 2;
                    break;
                case 16:
                    return;
            }
        }
    }

    public static void A06(C0545Ij c0545Ij) {
        int i = 0;
        int previousNumDeltaPocs = 0;
        int stRpsIdx = 0;
        int j = 0;
        int i2 = 0;
        int iA04 = c0545Ij.A04();
        boolean zA0A = false;
        int i3 = 0;
        int i4 = 0;
        int numPositivePics = 2;
        while (true) {
            switch (numPositivePics) {
                case 2:
                    if (i4 >= iA04) {
                        numPositivePics = 18;
                        break;
                    } else {
                        numPositivePics = 3;
                        break;
                    }
                case 3:
                    if (i4 == 0) {
                        numPositivePics = 5;
                        break;
                    } else {
                        numPositivePics = 4;
                        break;
                    }
                case 4:
                    c0545Ij = c0545Ij;
                    zA0A = c0545Ij.A0A();
                    numPositivePics = 5;
                    break;
                case 5:
                    if (!zA0A) {
                        numPositivePics = 11;
                        break;
                    } else {
                        numPositivePics = 6;
                        break;
                    }
                case 6:
                    c0545Ij = c0545Ij;
                    c0545Ij.A06();
                    c0545Ij.A04();
                    i2 = 0;
                    numPositivePics = 7;
                    break;
                case 7:
                    if (i2 > i3) {
                        numPositivePics = 17;
                        break;
                    } else {
                        numPositivePics = 8;
                        break;
                    }
                case 8:
                    c0545Ij = c0545Ij;
                    if (!c0545Ij.A0A()) {
                        numPositivePics = 10;
                        break;
                    } else {
                        numPositivePics = 9;
                        break;
                    }
                case 9:
                    c0545Ij = c0545Ij;
                    c0545Ij.A06();
                    numPositivePics = 10;
                    break;
                case 10:
                    i2++;
                    numPositivePics = 7;
                    break;
                case 11:
                    c0545Ij = c0545Ij;
                    j = c0545Ij.A04();
                    previousNumDeltaPocs = c0545Ij.A04();
                    i3 = j + previousNumDeltaPocs;
                    stRpsIdx = 0;
                    numPositivePics = 12;
                    break;
                case 12:
                    if (stRpsIdx >= j) {
                        numPositivePics = 14;
                        break;
                    } else {
                        numPositivePics = 13;
                        break;
                    }
                case 13:
                    c0545Ij = c0545Ij;
                    c0545Ij.A04();
                    c0545Ij.A06();
                    stRpsIdx++;
                    numPositivePics = 12;
                    break;
                case 14:
                    i = 0;
                    numPositivePics = 15;
                    break;
                case 15:
                    if (i >= previousNumDeltaPocs) {
                        numPositivePics = 17;
                        break;
                    } else {
                        numPositivePics = 16;
                        break;
                    }
                case 16:
                    c0545Ij = c0545Ij;
                    c0545Ij.A04();
                    c0545Ij.A06();
                    i++;
                    numPositivePics = 15;
                    break;
                case 17:
                    i4++;
                    numPositivePics = 2;
                    break;
                case 18:
                    return;
            }
        }
    }

    private void A07(byte[] bArr, int i, int i2) {
        ZY zy = this;
        char c2 = zy.A05 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    zy = zy;
                    bArr = bArr;
                    zy.A03.A04(bArr, i, i2);
                    c2 = 3;
                    break;
                case 3:
                    ZY zy2 = zy;
                    byte[] bArr2 = bArr;
                    zy2.A07.A02(bArr2, i, i2);
                    zy2.A09.A02(bArr2, i, i2);
                    return;
                case 4:
                    zy = zy;
                    bArr = bArr;
                    zy.A0A.A02(bArr, i, i2);
                    zy.A08.A02(bArr, i, i2);
                    zy.A06.A02(bArr, i, i2);
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void A47(C0544Ii c0544Ii) {
        C0544Ii c0544Ii2 = c0544Ii;
        ZY zy = this;
        int i = 0;
        long j = 0;
        int i2 = 0;
        int i3 = 0;
        int iA04 = 0;
        int iA00 = 0;
        int nalUnitType = 0;
        int lengthToNalUnit = 0;
        byte[] bArr = null;
        ZY zy2 = zy;
        C0544Ii c0544Ii3 = c0544Ii2;
        int nalUnitOffset = 2;
        while (true) {
            switch (nalUnitOffset) {
                case 2:
                    c0544Ii2 = c0544Ii2;
                    int offset = c0544Ii2.A04();
                    if (offset <= 0) {
                        nalUnitOffset = 13;
                        break;
                    } else {
                        nalUnitOffset = 3;
                        break;
                    }
                case 3:
                    c0544Ii2 = c0544Ii2;
                    zy2 = zy2;
                    c0544Ii3 = c0544Ii3;
                    nalUnitType = c0544Ii2.A06();
                    lengthToNalUnit = c0544Ii2.A07();
                    bArr = c0544Ii3.A00;
                    zy2.A01 += c0544Ii2.A04();
                    CO co = zy2.A02;
                    int limit = c0544Ii2.A04();
                    co.ACk(c0544Ii3, limit);
                    nalUnitOffset = 4;
                    break;
                case 4:
                    if (nalUnitType >= lengthToNalUnit) {
                        nalUnitOffset = 2;
                        break;
                    } else {
                        nalUnitOffset = 5;
                        break;
                    }
                case 5:
                    zy2 = zy2;
                    bArr = bArr;
                    iA04 = C0540Ie.A04(bArr, nalUnitType, lengthToNalUnit, zy2.A0D);
                    if (iA04 != lengthToNalUnit) {
                        nalUnitOffset = 7;
                        break;
                    } else {
                        nalUnitOffset = 6;
                        break;
                    }
                case 6:
                    zy2.A07(bArr, nalUnitType, lengthToNalUnit);
                    return;
                case 7:
                    bArr = bArr;
                    iA00 = C0540Ie.A00(bArr, iA04);
                    i3 = iA04 - nalUnitType;
                    if (i3 <= 0) {
                        nalUnitOffset = 9;
                        break;
                    } else {
                        nalUnitOffset = 8;
                        break;
                    }
                case 8:
                    zy2 = zy2;
                    bArr = bArr;
                    zy2.A07(bArr, nalUnitType, iA04);
                    nalUnitOffset = 9;
                    break;
                case 9:
                    zy2 = zy2;
                    i2 = lengthToNalUnit - iA04;
                    j = zy2.A01 - i2;
                    if (i3 >= 0) {
                        nalUnitOffset = 12;
                        break;
                    } else {
                        nalUnitOffset = 10;
                        break;
                    }
                case 10:
                    i = -i3;
                    nalUnitOffset = 11;
                    break;
                case 11:
                    zy = zy;
                    zy2 = zy2;
                    zy.A03(j, i2, i, zy2.A00);
                    zy.A04(j, i2, iA00, zy2.A00);
                    nalUnitType = iA04 + 3;
                    nalUnitOffset = 4;
                    break;
                case 12:
                    i = 0;
                    nalUnitOffset = 11;
                    break;
                case 13:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void A4U(CE ce, DW dw) {
        dw.A05();
        this.A04 = dw.A04();
        this.A02 = ce.ADd(dw.A03(), 2);
        this.A03 = new DN(this.A02);
        this.A0B.A03(ce, dw);
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void ABa() {
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void ABb(long j, boolean z) {
        this.A00 = j;
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void ACo() {
        C0540Ie.A0B(this.A0D);
        this.A0A.A00();
        this.A08.A00();
        this.A06.A00();
        this.A07.A00();
        this.A09.A00();
        this.A03.A01();
        this.A01 = 0L;
    }
}
