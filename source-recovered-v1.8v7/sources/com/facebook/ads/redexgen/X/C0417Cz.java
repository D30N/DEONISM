package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.util.Log;
import d.b.a.b.k;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Cz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0417Cz {
    public static byte[] A05;
    public final int A00;
    public final CN A01;

    @Nullable
    public final String A02;
    public final boolean A03;
    public final byte[] A04;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ k.AppCompatTheme_windowFixedWidthMinor);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A05 = new byte[]{95, 78, 69, 76, 72, 83, 28, 81, 83, 88, 89, 18, 118, 112, 123, 102, 35, 34, 35, 51, 86, 112, 99, 97, 105, 71, 108, 97, 112, 123, 114, 118, 107, 109, 108, 64, 109, 122, 22, 45, 48, 54, 51, 51, 44, 49, 55, 38, 39, 99, 51, 49, 44, 55, 38, 32, 55, 42, 44, 45, 99, 48, 32, 43, 38, 46, 38, 99, 55, 58, 51, 38, 99, 100, 119, 113, 122, 119, 24, 25, 24, 74, 49, 56, 54, 87, 101, 101, 99, 123, Byte.MAX_VALUE, 120, 113, 54, 87, 83, 69, 59, 85, 66, 68, 54};
    }

    public C0417Cz(boolean z, @Nullable String str, int i, byte[] bArr, int i2, int i3, @Nullable byte[] bArr2) {
        IJ.A03((bArr2 == null) ^ (i == 0));
        this.A03 = z;
        this.A02 = str;
        this.A00 = i;
        this.A04 = bArr2;
        this.A01 = new CN(A00(str), bArr, i2, i3);
    }

    public static int A00(@Nullable String str) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        char c2 = str == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return 1;
                case 3:
                    str = str;
                    i3 = -1;
                    i = 3;
                    i2 = 2;
                    switch (str.hashCode()) {
                        case 3046605:
                            c2 = '\t';
                            break;
                        case 3046671:
                            c2 = 11;
                            break;
                        case 3049879:
                            c2 = '\r';
                            break;
                        case 3049895:
                            c2 = 15;
                            break;
                        default:
                            c2 = 4;
                            break;
                    }
                case 4:
                    if (i3 == 0) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i3 == 1) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (i3 == i2) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (i3 == i) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    Log.w(A01(20, 18, k.AppCompatTheme_windowMinWidthMinor), A01(38, 36, 58) + str + A01(82, 20, 111) + A01(0, 12, 69));
                    return 1;
                case '\t':
                    str = str;
                    if (!str.equals(A01(78, 4, 2))) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    i3 = 2;
                    c2 = 4;
                    break;
                case 11:
                    str = str;
                    if (!str.equals(A01(16, 4, 57))) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    i3 = 3;
                    c2 = 4;
                    break;
                case '\r':
                    str = str;
                    if (!str.equals(A01(74, 4, 109))) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    i3 = 0;
                    c2 = 4;
                    break;
                case 15:
                    str = str;
                    if (!str.equals(A01(12, 4, 108))) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    i3 = 1;
                    c2 = 4;
                    break;
                case 17:
                    return i2;
                case 18:
                    return 1;
            }
        }
    }
}
