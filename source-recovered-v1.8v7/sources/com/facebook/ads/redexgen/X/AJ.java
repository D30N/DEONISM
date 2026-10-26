package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class AJ extends LM {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 64);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{77, 82, 95, 94, 84, 114, 85, 79, 94, 73, 72, 79, 82, 79, 90, 87, 126, 77, 94, 85, 79};
    }

    public AJ(C03469v c03469v) {
        this.A00 = c03469v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9C
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(C02977v c02977v) {
        AJ aj = this;
        char c2 = aj.A00.getAudienceNetworkListener() != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    aj = aj;
                    c02977v = c02977v;
                    aj.A00.getAudienceNetworkListener().A3s(A00(0, 21, k.AppCompatTheme_windowMinWidthMinor), c02977v);
                    c2 = 3;
                    break;
                case 3:
                    aj = aj;
                    if (aj.A00.A01 == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return;
            }
        }
    }
}
