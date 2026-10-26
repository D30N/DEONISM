package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.io.Serializable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.1J, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C1J implements Serializable {
    public static byte[] A03 = null;
    public static final long serialVersionUID = -4041915335826065133L;
    public final String A00;
    public final String A01;
    public final String A02;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 49);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A03 = new byte[]{79, 84, 77, 77};
    }

    public C1J(String str, String str2, String str3) {
        this.A02 = A01(str);
        this.A01 = A01(str2);
        this.A00 = A01(str3);
    }

    public static String A01(String str) {
        if (A00(0, 4, 16).equalsIgnoreCase(str)) {
            return A00(0, 0, k.AppCompatTheme_windowMinWidthMinor);
        }
        return str;
    }

    public final String A03() {
        return this.A01;
    }

    public final String A04() {
        return this.A02;
    }
}
