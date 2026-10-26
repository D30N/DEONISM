package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class R7 extends Q0 {
    public static byte[] A01;
    public final /* synthetic */ AnonymousClass83 A00;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 82);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{-69, -57, -59, -122, -66, -71, -69, -67, -70, -57, -57, -61, -122, -71, -68, -53, -122, -63, -58, -52, -67, -54, -53, -52, -63, -52, -63, -71, -60, -122, -63, -59, -56, -54, -67, -53, -53, -63, -57, -58, -122, -60, -57, -65, -65, -67, -68};
    }

    public R7(AnonymousClass83 anonymousClass83) {
        this.A00 = anonymousClass83;
    }

    @Override // com.facebook.ads.redexgen.X.Q0
    public final void A03() {
        R7 r7 = this;
        char c2 = !r7.A00.A0D.A07() ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    r7 = r7;
                    r7.A00.A0D.A05();
                    if (r7.A00.getAudienceNetworkListener() == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    r7 = r7;
                    r7.A00.getAudienceNetworkListener().A3r(A00(0, 47, 6));
                    c2 = 4;
                    break;
                case 4:
                    r7 = r7;
                    if (!TextUtils.isEmpty(r7.A00.A0A)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    r7 = r7;
                    ((AbstractC1055b1) ((AbstractC1055b1) r7.A00)).A0B.A87(r7.A00.A0A, new C0676No().A03(r7.A00.A09).A02(r7.A00.A0D).A04(((AbstractC1055b1) ((AbstractC1055b1) r7.A00)).A09.A0R()).A05());
                    r7.A00.A0C.A0A().A2Z();
                    c2 = 6;
                    break;
                case 6:
                    return;
            }
        }
    }
}
