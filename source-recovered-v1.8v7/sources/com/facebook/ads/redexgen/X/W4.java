package com.facebook.ads.redexgen.X;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class W4 implements InterfaceC02616d {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 56);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{113, -107, -108, -122, 109, 120};
    }

    public W4(WL wl) {
        this.A00 = wl;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        W4 w4 = this;
        StringBuilder sb = null;
        int i = 0;
        char c2 = w4.A00.A05 != null ? (char) 2 : '\b';
        while (true) {
            switch (c2) {
                case 2:
                    sb = new StringBuilder();
                    i = 0;
                    c2 = 3;
                    break;
                case 3:
                    w4 = w4;
                    if (i >= w4.A00.A05.length) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    w4 = w4;
                    sb = sb;
                    sb.append(w4.A00.A05[i].name);
                    if (i == w4.A00.A05.length - 1) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    sb = sb;
                    sb.append(A00(0, 1, 47));
                    c2 = 6;
                    break;
                case 6:
                    i++;
                    c2 = 3;
                    break;
                case 7:
                    return w4.A00.A08(AnonymousClass71.A08(sb.toString().getBytes(A00(1, 5, 8)), AnonymousClass70.A05));
                case '\b':
                    return w4.A00.A07(EnumC02726o.A06);
            }
        }
    }
}
