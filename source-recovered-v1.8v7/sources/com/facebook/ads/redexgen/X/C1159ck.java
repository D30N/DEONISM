package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ck, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1159ck implements InterfaceC0616Lf {
    public static byte[] A03;
    public int A00;

    @Nullable
    public String A01;
    public final InterfaceC0616Lf A02;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 96);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A03 = new byte[]{-73, -73, -87, -84};
    }

    public C1159ck(InterfaceC0616Lf interfaceC0616Lf) {
        this.A02 = interfaceC0616Lf;
    }

    private void A01() {
        if (this.A01 != null) {
            this.A02.ABs(this.A01 + A00(0, 4, 41) + this.A00);
            this.A01 = null;
            this.A00 = 0;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0616Lf
    public final void ABs(String str) {
        C1159ck c1159ck = this;
        String strA04 = null;
        int i = 0;
        char c2 = C0618Lh.A0A(str) ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c1159ck = c1159ck;
                    str = str;
                    c1159ck.A01();
                    c1159ck.A02.ABs(str);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    c1159ck = c1159ck;
                    str = str;
                    strA04 = C0618Lh.A04(str);
                    i = 1;
                    if (!strA04.equals(c1159ck.A01)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c1159ck = c1159ck;
                    c1159ck.A00 += i;
                    c2 = 3;
                    break;
                case 6:
                    c1159ck = c1159ck;
                    strA04 = strA04;
                    c1159ck.A01();
                    c1159ck.A01 = strA04;
                    c1159ck.A00 = i;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0616Lf
    public final void flush() {
        A01();
        this.A02.flush();
    }
}
