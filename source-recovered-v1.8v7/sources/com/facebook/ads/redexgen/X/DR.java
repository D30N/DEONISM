package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class DR {
    public static byte[] A02;
    public final List<Format> A00;
    public final CO[] A01;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 66);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A02 = new byte[]{5, 20, 20, 16, 13, 7, 5, 24, 13, 19, 18, -45, 7, 9, 5, -47, -37, -44, -36, -58, -21, -13, -34, -23, -26, -31, -99, -32, -23, -20, -16, -30, -31, -99, -32, -34, -19, -15, -26, -20, -21, -99, -22, -26, -22, -30, -99, -15, -10, -19, -30, -99, -19, -17, -20, -13, -26, -31, -30, -31, -73, -99, -77, -62, -62, -66, -69, -75, -77, -58, -69, -63, -64, -127, -75, -73, -77, Byte.MAX_VALUE, -120, -126, -118};
    }

    public DR(List<Format> list) {
        this.A00 = list;
        this.A01 = new CO[list.size()];
    }

    public final void A02(long j, C0544Ii c0544Ii) {
        C0494Gi.A03(j, c0544Ii, this.A01);
    }

    public final void A03(CE ce, DW dw) {
        CE ce2 = ce;
        DW dw2 = dw;
        DR dr = this;
        String formatId = null;
        CO coADd = null;
        boolean z = false;
        String str = null;
        Format format = null;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    dr = dr;
                    if (i >= dr.A01.length) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    dr = dr;
                    ce2 = ce2;
                    dw2 = dw2;
                    dw2.A05();
                    coADd = ce2.ADd(dw2.A03(), 3);
                    format = dr.A00.get(i);
                    str = format.A0O;
                    if (!A00(62, 19, 16).equals(str)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    str = str;
                    if (!A00(0, 19, 98).equals(str)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    z = true;
                    c2 = 6;
                    break;
                case 6:
                    format = format;
                    str = str;
                    IJ.A05(z, A00(19, 43, 59) + str);
                    if (format.A0M == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    format = format;
                    formatId = format.A0M;
                    c2 = '\b';
                    break;
                case '\b':
                    dr = dr;
                    coADd = coADd;
                    format = format;
                    str = str;
                    formatId = formatId;
                    coADd.A5A(Format.A08(formatId, str, null, -1, format.A0D, format.A0N, format.A03, null));
                    dr.A01[i] = coADd;
                    i++;
                    c2 = 2;
                    break;
                case '\t':
                    dw2 = dw2;
                    formatId = dw2.A04();
                    c2 = '\b';
                    break;
                case '\n':
                    z = false;
                    c2 = 6;
                    break;
                case 11:
                    return;
            }
        }
    }
}
