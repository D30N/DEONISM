package com.facebook.ads.redexgen.X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class DW {
    public static byte[] A05;
    public int A00;
    public String A01;
    public final int A02;
    public final int A03;
    public final String A04;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 126);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A05 = new byte[]{122, 120, 115, 120, 111, 124, 105, 120, 83, 120, 106, 84, 121, 53, 52, 61, 112, 104, 110, 105, 61, Byte.MAX_VALUE, 120, 61, 126, 124, 113, 113, 120, 121, 61, Byte.MAX_VALUE, 120, 123, 114, 111, 120, 61, 111, 120, 105, 111, 116, 120, 107, 116, 115, 122, 61, 116, 121, 110, 51, 18};
    }

    public DW(int i, int i2) {
        this(RecyclerView.UNDEFINED_DURATION, i, i2);
    }

    public DW(int i, int i2, int i3) {
        String strA00;
        if (i != Integer.MIN_VALUE) {
            strA00 = i + A00(53, 1, 67);
        } else {
            strA00 = A00(53, 0, 0);
        }
        this.A04 = strA00;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = RecyclerView.UNDEFINED_DURATION;
    }

    private void A01() {
        if (this.A00 != Integer.MIN_VALUE) {
        } else {
            throw new IllegalStateException(A00(0, 53, 99));
        }
    }

    public final int A03() {
        A01();
        return this.A00;
    }

    public final String A04() {
        A01();
        return this.A01;
    }

    public final void A05() {
        DW dw = this;
        int i = 0;
        int i2 = dw.A00;
        char c2 = i2 == Integer.MIN_VALUE ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    dw = dw;
                    i = dw.A02;
                    c2 = 3;
                    break;
                case 3:
                    DW dw2 = dw;
                    dw2.A00 = i;
                    dw2.A01 = dw2.A04 + dw2.A00;
                    return;
                case 4:
                    dw = dw;
                    i = i2 + dw.A03;
                    c2 = 3;
                    break;
            }
        }
    }
}
