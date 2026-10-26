package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class CK {
    public static byte[] A02;
    public final CM A00;
    public final CM A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 125);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A02 = new byte[]{73, 69, 94, 63};
    }

    public CK(CM cm) {
        this(cm, cm);
    }

    public CK(CM cm, CM cm2) {
        this.A00 = (CM) IJ.A01(cm);
        this.A01 = (CM) IJ.A01(cm2);
    }

    public final boolean equals(@Nullable Object obj) {
        CK ck = this;
        CK ck2 = null;
        boolean z = true;
        char c2 = ck == obj ? (char) 2 : (char) 3;
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
                    ck = ck;
                    obj = obj;
                    if (ck.getClass() == obj.getClass()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    ck = ck;
                    obj = obj;
                    ck2 = (CK) obj;
                    if (!ck.A00.equals(ck2.A00)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    ck = ck;
                    ck2 = ck2;
                    if (!ck.A01.equals(ck2.A01)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return z;
                case '\t':
                    z = false;
                    c2 = '\b';
                    break;
            }
        }
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final String toString() {
        CK ck = this;
        String strA00 = null;
        StringBuilder sb = new StringBuilder();
        sb.append(A00(3, 1, 25));
        sb.append(ck.A00);
        char c2 = ck.A00.equals(ck.A01) ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    strA00 = A00(2, 0, 78);
                    c2 = 3;
                    break;
                case 3:
                    StringBuilder sb2 = sb;
                    sb2.append(strA00);
                    sb2.append(A00(2, 1, 126));
                    return sb2.toString();
                case 4:
                    ck = ck;
                    strA00 = A00(0, 2, 24) + ck.A01;
                    c2 = 3;
                    break;
            }
        }
    }
}
