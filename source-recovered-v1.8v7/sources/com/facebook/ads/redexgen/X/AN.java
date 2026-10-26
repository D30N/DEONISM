package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class AN extends AbstractC0604Ks {
    public static byte[] A01;
    public final /* synthetic */ C03469v A00;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 13);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{-61, -74, -79, -78, -68, -106, -69, -63, -78, -65, -64, -63, -74, -63, -82, -71, -110, -61, -78, -69, -63};
    }

    public AN(C03469v c03469v) {
        this.A00 = c03469v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9C
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(L4 l4) {
        AN an = this;
        char c2 = !an.A00.A07 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    an = an;
                    an.A00.A0Q.A0V();
                    an.A00.A07 = true;
                    c2 = 3;
                    break;
                case 3:
                    an = an;
                    if (an.A00.getAudienceNetworkListener() == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    an = an;
                    l4 = l4;
                    an.A00.getAudienceNetworkListener().A3s(A00(0, 21, 64), l4);
                    c2 = 5;
                    break;
                case 5:
                    an = an;
                    if (an.A00.A01 == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return;
            }
        }
    }
}
