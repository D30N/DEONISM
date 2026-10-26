package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.be, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1094be extends Q0 {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 51);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{23, 27, 25, 90, 18, 21, 23, 17, 22, 27, 27, 31, 90, 21, 16, 7, 90, 29, 26, 0, 17, 6, 7, 0, 29, 0, 29, 21, 24, 90, 29, 25, 4, 6, 17, 7, 7, 29, 27, 26, 90, 24, 27, 19, 19, 17, 16};
    }

    public C1094be(C03469v c03469v) {
        this.A00 = c03469v;
    }

    @Override // com.facebook.ads.redexgen.X.Q0
    public final void A03() {
        C1094be c1094be = this;
        char c2 = !c1094be.A00.A0D.A07() ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c1094be = c1094be;
                    c1094be.A00.A0D.A05();
                    if (!TextUtils.isEmpty(((AbstractC1055b1) c1094be.A00).A09.A0P())) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 3:
                    c1094be = c1094be;
                    ((AbstractC1055b1) c1094be.A00).A0B.A87(((AbstractC1055b1) c1094be.A00).A09.A0P(), new C0676No().A03(c1094be.A00.A0Q).A02(c1094be.A00.A0D).A04(((AbstractC1055b1) c1094be.A00).A09.A0R()).A05());
                    c1094be.A00.A0C.A0A().A2Z();
                    if (c1094be.A00.getAudienceNetworkListener() == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1094be = c1094be;
                    c1094be.A00.getAudienceNetworkListener().A3r(A00(0, 47, 71));
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }
}
