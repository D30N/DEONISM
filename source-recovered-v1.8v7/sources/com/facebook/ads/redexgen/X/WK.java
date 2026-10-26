package com.facebook.ads.redexgen.X;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class WK implements InterfaceC02616d {
    public static byte[] A01;
    public final /* synthetic */ WL A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 5);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{104, 105, 104, 122, 17, 4};
    }

    public WK(WL wl) {
        this.A00 = wl;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        WK wk = this;
        StringBuilder sb = null;
        int i = 0;
        char c2 = wk.A00.A04 != null ? (char) 2 : '\b';
        while (true) {
            switch (c2) {
                case 2:
                    sb = new StringBuilder();
                    i = 0;
                    c2 = 3;
                    break;
                case 3:
                    wk = wk;
                    if (i >= wk.A00.A04.length) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    wk = wk;
                    sb = sb;
                    sb.append(wk.A00.A04[i].name);
                    if (i == wk.A00.A04.length - 1) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    sb = sb;
                    sb.append(A00(0, 1, 103));
                    c2 = 6;
                    break;
                case 6:
                    i++;
                    c2 = 3;
                    break;
                case 7:
                    return wk.A00.A08(AnonymousClass71.A08(sb.toString().getBytes(A00(1, 5, 57)), AnonymousClass70.A05));
                case '\b':
                    return wk.A00.A07(EnumC02726o.A06);
            }
        }
    }
}
