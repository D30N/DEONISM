package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class S6 extends AbstractRunnableC0608Kw {
    public static byte[] A02;
    public final /* synthetic */ S9 A00;
    public final /* synthetic */ C1152cd A01;

    static {
        A02();
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 102);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A02 = new byte[]{99, 100, 124, 107, 102, 99, 110, 42, 122, 102, 107, 105, 111, 103, 111, 100, 126, 42, 99, 100, 42, 120, 111, 121, 122, 101, 100, 121, 111};
    }

    public S6(S9 s9, C1152cd c1152cd) {
        this.A00 = s9;
        this.A01 = c1152cd;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0608Kw
    public final void A06() {
        C03188s c03188sA00 = this.A01.A00();
        char c2 = c03188sA00 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c03188sA00 = c03188sA00;
                    if (c03188sA00.A05() != null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    S6 s6 = this;
                    String strA00 = A00(0, 29, 108);
                    K5 k5 = new K5(AdErrorType.NO_AD_PLACEMENT, strA00);
                    s6.A00.A0C.A0A().A4Y(k5.A04().getErrorCode(), strA00);
                    s6.A00.A07.A0G(k5);
                    return;
                case 4:
                    S6 s62 = this;
                    s62.A00.A05 = c03188sA00;
                    s62.A00.A0M();
                    return;
            }
        }
    }
}
