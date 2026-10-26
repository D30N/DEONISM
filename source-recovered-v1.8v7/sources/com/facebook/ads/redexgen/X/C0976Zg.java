package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Zg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0976Zg implements DQ {
    public static byte[] A03;
    public CO A00;
    public C0556Iu A01;
    public boolean A02;

    static {
        A01();
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 12);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A03 = new byte[]{-64, -49, -49, -53, -56, -62, -64, -45, -56, -50, -51, -114, -41, -116, -46, -62, -45, -60, -110, -108};
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public final void A47(C0544Ii c0544Ii) {
        C0976Zg c0976Zg = this;
        char c2 = !c0976Zg.A02 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0976Zg = c0976Zg;
                    if (c0976Zg.A01.A05() != -9223372036854775807L) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    c0976Zg = c0976Zg;
                    c0976Zg.A00.A5A(Format.A02(null, A00(0, 20, 83), c0976Zg.A01.A05()));
                    c0976Zg.A02 = true;
                    c2 = 5;
                    break;
                case 5:
                    C0976Zg c0976Zg2 = c0976Zg;
                    C0544Ii c0544Ii2 = c0544Ii;
                    int iA04 = c0544Ii2.A04();
                    c0976Zg2.A00.ACk(c0544Ii2, iA04);
                    c0976Zg2.A00.ACl(c0976Zg2.A01.A04(), 1, iA04, 0, null);
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public final void A7V(C0556Iu c0556Iu, CE ce, DW dw) {
        this.A01 = c0556Iu;
        dw.A05();
        this.A00 = ce.ADd(dw.A03(), 4);
        this.A00.A5A(Format.A0B(dw.A04(), A00(0, 20, 83), null, -1, null));
    }
}
