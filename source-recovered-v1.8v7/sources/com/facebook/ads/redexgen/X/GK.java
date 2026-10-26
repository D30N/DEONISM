package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.support.annotation.Nullable;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class GK {
    public static byte[] A04;
    public int A00;
    public final long A01;
    public final long A02;
    public final String A03;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
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

    public static void A02() {
        A04 = new byte[]{-121, -57, -69, 7, 0, 9, 2, 15, 3, -40, 117, 105, -68, -67, -86, -69, -67, -122, -110, -95, -82, -89, -91, -92, -107, -78, -87, 104, -78, -91, -90, -91, -78, -91, -82, -93, -91, -107, -78, -87, 125};
    }

    public GK(@Nullable String str, long j, long j2) {
        this.A03 = str == null ? A00(0, 0, 38) : str;
        this.A02 = j;
        this.A01 = j2;
    }

    private final String A01(String str) {
        return C0558Iw.A02(str, this.A03);
    }

    public final Uri A03(String str) {
        return C0558Iw.A00(str, this.A03);
    }

    @Nullable
    public final GK A04(@Nullable GK gk, String str) {
        String strA01 = A01(str);
        if (gk != null) {
            String resolvedUri = gk.A01(str);
            if (strA01.equals(resolvedUri)) {
                long j = this.A01;
                if (j != -1) {
                    long j2 = this.A02;
                    if (j2 + j == gk.A02) {
                        long j3 = gk.A01;
                        return new GK(strA01, j2, j3 != -1 ? j + j3 : -1L);
                    }
                }
                long j4 = gk.A01;
                if (j4 != -1) {
                    long j5 = gk.A02;
                    if (j5 + j4 == this.A02) {
                        long j6 = this.A01;
                        return new GK(strA01, j5, j6 != -1 ? j4 + j6 : -1L);
                    }
                }
                return null;
            }
        }
        return null;
    }

    public final boolean equals(@Nullable Object obj) {
        GK gk = this;
        GK gk2 = null;
        boolean z = true;
        char c2 = gk == obj ? (char) 2 : (char) 3;
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
                    gk = gk;
                    obj = obj;
                    if (gk.getClass() == obj.getClass()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    gk = gk;
                    obj = obj;
                    gk2 = (GK) obj;
                    if (gk.A02 != gk2.A02) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    gk = gk;
                    gk2 = gk2;
                    if (gk.A01 != gk2.A01) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    gk = gk;
                    gk2 = gk2;
                    if (!gk.A03.equals(gk2.A03)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    return z;
                case '\n':
                    z = false;
                    c2 = '\t';
                    break;
            }
        }
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int i = ((17 * 31) + ((int) this.A02)) * 31;
            int result = (int) this.A01;
            this.A00 = ((i + result) * 31) + this.A03.hashCode();
        }
        int result2 = this.A00;
        return result2;
    }

    public final String toString() {
        return A00(18, 23, 15) + this.A03 + A00(10, 8, 24) + this.A02 + A00(1, 9, 106) + this.A01 + A00(0, 1, 45);
    }
}
