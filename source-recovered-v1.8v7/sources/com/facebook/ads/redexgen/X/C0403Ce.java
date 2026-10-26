package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ce, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0403Ce {
    public static byte[] A09;
    public int A00;
    public int A01;
    public long A02;
    public int A03;
    public int A04;
    public final int A05;
    public final C0544Ii A06;
    public final C0544Ii A07;
    public final boolean A08;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 58);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A09 = new byte[]{62, 49, 42, 43, 44, 7, 59, 48, 45, 54, 51, 120, 53, 45, 43, 44, 120, 58, 61, 120, 105};
    }

    public C0403Ce(C0544Ii c0544Ii, C0544Ii c0544Ii2, boolean z) {
        this.A07 = c0544Ii;
        this.A06 = c0544Ii2;
        this.A08 = z;
        c0544Ii2.A0Y(12);
        this.A05 = c0544Ii2.A0H();
        c0544Ii.A0Y(12);
        this.A04 = c0544Ii.A0H();
        IJ.A06(c0544Ii.A08() == 1, A00(0, 21, 98));
        this.A00 = -1;
    }

    public final boolean A02() {
        C0403Ce c0403Ce = this;
        int iA0H = 0;
        long jA0M = 0;
        int i = c0403Ce.A00 + 1;
        c0403Ce.A00 = i;
        char c2 = i == c0403Ce.A05 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return false;
                case 3:
                    c0403Ce = c0403Ce;
                    if (!c0403Ce.A08) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0403Ce = c0403Ce;
                    jA0M = c0403Ce.A06.A0N();
                    c2 = 5;
                    break;
                case 5:
                    c0403Ce = c0403Ce;
                    c0403Ce.A02 = jA0M;
                    if (c0403Ce.A00 != c0403Ce.A03) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0403Ce = c0403Ce;
                    c0403Ce.A01 = c0403Ce.A07.A0H();
                    c0403Ce.A07.A0Z(4);
                    int i2 = c0403Ce.A04 - 1;
                    c0403Ce.A04 = i2;
                    if (i2 <= 0) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0403Ce = c0403Ce;
                    iA0H = c0403Ce.A07.A0H() - 1;
                    c2 = '\b';
                    break;
                case '\b':
                    c0403Ce = c0403Ce;
                    c0403Ce.A03 = iA0H;
                    c2 = '\t';
                    break;
                case '\t':
                    return true;
                case '\n':
                    iA0H = -1;
                    c2 = '\b';
                    break;
                case 11:
                    c0403Ce = c0403Ce;
                    jA0M = c0403Ce.A06.A0M();
                    c2 = 5;
                    break;
            }
        }
    }
}
