package com.facebook.ads.redexgen.X;

import android.text.Layout;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class H6 {
    public static byte[] A0G;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public Layout.Alignment A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public List<String> A0D;
    public boolean A0E;
    public boolean A0F;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0G, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 90);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A0G = new byte[]{114, 91, 90, 64, 20, 87, 91, 88, 91, 70, 20, 90, 91, 64, 20, 80, 81, 82, 93, 90, 81, 80, 89, 122, 120, 112, 124, 105, 116, 110, 117, Byte.MAX_VALUE, 59, 120, 116, 119, 116, 105, 59, 117, 116, 111, 59, Byte.MAX_VALUE, 126, 125, 114, 117, 126, Byte.MAX_VALUE, 53};
    }

    public H6() {
        A03();
    }

    public static int A00(int i, String str, String str2, int i2) {
        int i3 = 0;
        char c2 = !str.isEmpty() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    i3 = -1;
                    if (i != -1) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return i;
                case 4:
                    str = str;
                    str2 = str2;
                    if (!str.equals(str2)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    i3 = i + i2;
                    c2 = 6;
                    break;
                case 6:
                    return i3;
            }
        }
    }

    private final void A03() {
        String strA01 = A01(22, 0, 9);
        this.A0A = strA01;
        this.A0B = strA01;
        this.A0D = Collections.emptyList();
        this.A0C = strA01;
        this.A09 = null;
        this.A0F = false;
        this.A0E = false;
        this.A06 = -1;
        this.A07 = -1;
        this.A02 = -1;
        this.A05 = -1;
        this.A04 = -1;
        this.A08 = null;
    }

    public final float A04() {
        return this.A00;
    }

    public final int A05() {
        if (this.A0E) {
            return this.A01;
        }
        throw new IllegalStateException(A01(22, 29, 65));
    }

    public final int A06() {
        if (this.A0F) {
            return this.A03;
        }
        throw new IllegalStateException(A01(0, 22, 110));
    }

    public final int A07() {
        return this.A04;
    }

    public final int A08() {
        H6 h6 = this;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        char c2 = h6.A02 == -1 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    h6 = h6;
                    if (h6.A05 != -1) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return -1;
                case 4:
                    h6 = h6;
                    i = 0;
                    i2 = 1;
                    if (h6.A02 != 1) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    i3 = 1;
                    c2 = 6;
                    break;
                case 6:
                    h6 = h6;
                    if (h6.A05 != i2) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    i = 2;
                    c2 = '\b';
                    break;
                case '\b':
                    return i3 | i;
                case '\t':
                    i3 = 0;
                    c2 = 6;
                    break;
            }
        }
    }

    public final int A09(String str, String str2, String[] strArr, String str3) {
        H6 h6 = this;
        int iA00 = 0;
        char c2 = h6.A0A.isEmpty() ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    h6 = h6;
                    if (!h6.A0B.isEmpty()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    h6 = h6;
                    if (!h6.A0D.isEmpty()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    h6 = h6;
                    if (!h6.A0C.isEmpty()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return str2.isEmpty() ? 1 : 0;
                case 6:
                    h6 = h6;
                    str = str;
                    str2 = str2;
                    str3 = str3;
                    iA00 = A00(A00(A00(0, h6.A0A, str, 1073741824), h6.A0B, str2, 2), h6.A0C, str3, 4);
                    if (iA00 == -1) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    h6 = h6;
                    strArr = strArr;
                    if (!Arrays.asList(strArr).containsAll(h6.A0D)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\b':
                    return 0;
                case '\t':
                    return iA00 + (h6.A0D.size() * 4);
            }
        }
    }

    public final Layout.Alignment A0A() {
        return this.A08;
    }

    public final H6 A0B(int i) {
        this.A01 = i;
        this.A0E = true;
        return this;
    }

    public final H6 A0C(int i) {
        this.A03 = i;
        this.A0F = true;
        return this;
    }

    public final H6 A0D(String str) {
        this.A09 = C0560Iy.A0P(str);
        return this;
    }

    public final H6 A0E(boolean z) {
        this.A02 = z ? 1 : 0;
        return this;
    }

    public final H6 A0F(boolean z) {
        this.A05 = z ? 1 : 0;
        return this;
    }

    public final H6 A0G(boolean z) {
        this.A07 = z ? 1 : 0;
        return this;
    }

    public final String A0H() {
        return this.A09;
    }

    public final void A0I(String str) {
        this.A0A = str;
    }

    public final void A0J(String str) {
        this.A0B = str;
    }

    public final void A0K(String str) {
        this.A0C = str;
    }

    public final void A0L(String[] strArr) {
        this.A0D = Arrays.asList(strArr);
    }

    public final boolean A0M() {
        return this.A0E;
    }

    public final boolean A0N() {
        return this.A0F;
    }

    public final boolean A0O() {
        return this.A06 == 1;
    }

    public final boolean A0P() {
        return this.A07 == 1;
    }
}
