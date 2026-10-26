package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import d.b.a.b.k;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4V, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C4V {
    public static byte[] A0H;
    public int A01;
    public int A02;
    public int A06;
    public int A07;
    public long A08;
    public SparseArray<Object> A0G;
    public int A0F = -1;
    public int A05 = 0;
    public int A00 = 0;
    public int A04 = 1;
    public int A03 = 0;
    public boolean A0D = false;
    public boolean A09 = false;
    public boolean A0E = false;
    public boolean A0A = false;
    public boolean A0C = false;
    public boolean A0B = false;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0H, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 50);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A0H = new byte[]{109, 97, 44, 8, 47, 17, 51, 36, 13, 32, 56, 46, 52, 53, 124, 101, 105, 36, 25, 59, 44, 63, 32, 38, 60, 58, 5, 40, 48, 38, 60, 61, 0, 61, 44, 36, 10, 38, 60, 39, 61, 116, 118, 122, 55, 8, 47, 52, 9, 51, 55, 42, 54, 63, 27, 52, 51, 55, 59, 46, 51, 53, 52, 41, 103, 43, 39, 106, 85, 114, 105, 87, 117, 98, 99, 110, 100, 115, 110, 113, 98, 70, 105, 110, 106, 102, 115, 110, 104, 105, 116, 58, 118, 122, 55, 30, 63, 54, 63, 46, 63, 62, 19, 52, 44, 51, 41, 51, 56, 54, 63, 19, 46, 63, 55, 25, 53, 47, 52, 46, 9, 51, 52, 57, 63, 10, 40, 63, 44, 51, 53, 47, 41, 22, 59, 35, 53, 47, 46, 103, 78, 12, 27, 26, 78, 7, 26, 78, 7, 29, 78, 68, 105, 113, 103, 125, 124, 40, 123, 124, 105, 124, 109, 40, 123, 96, 103, 125, 100, 108, 40, 106, 109, 40, 103, 102, 109, 40, 103, 110, 40, 43, 39, 106, 78, 115, 98, 106, 68, 104, 114, 105, 115, 58, 85, 89, 20, 42, 13, 11, 12, 26, 13, 12, 11, 28, 58, 17, 24, 23, 30, 28, 29, 68, 44, 11, 30, 11, 26, 4, 18, 43, 30, 13, 24, 26, 11, 47, 16, 12, 22, 11, 22, 16, 17, 66, 75, 71, 10, 35, 6, 19, 6, 90};
    }

    public final int A03() {
        C4V c4v = this;
        int i = 0;
        char c2 = c4v.A09 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c4v = c4v;
                    i = c4v.A05 - c4v.A00;
                    c2 = 3;
                    break;
                case 3:
                    return i;
                case 4:
                    c4v = c4v;
                    i = c4v.A03;
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A04(int i) {
        if ((this.A04 & i) != 0) {
            return;
        }
        throw new IllegalStateException(A01(151, 30, 58) + Integer.toBinaryString(i) + A01(140, 11, 92) + Integer.toBinaryString(this.A04));
    }

    public final void A05(AnonymousClass44 anonymousClass44) {
        this.A04 = 1;
        this.A03 = anonymousClass44.A0D();
        this.A09 = false;
        this.A0E = false;
        this.A0A = false;
    }

    public final boolean A06() {
        boolean z = false;
        char c2 = this.A0F != -1 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    public final boolean A07() {
        return this.A09;
    }

    public final boolean A08() {
        return this.A0B;
    }

    public final String toString() {
        return A01(214, 22, 77) + this.A0F + A01(236, 8, 85) + this.A0G + A01(181, 13, 53) + this.A03 + A01(15, 27, k.AppCompatTheme_windowMinWidthMinor) + this.A05 + A01(92, 48, 104) + this.A00 + A01(194, 20, 75) + this.A0D + A01(0, 15, k.AppCompatTheme_windowActionBar) + this.A09 + A01(42, 23, 104) + this.A0C + A01(65, 27, 53) + this.A0B + '}';
    }
}
