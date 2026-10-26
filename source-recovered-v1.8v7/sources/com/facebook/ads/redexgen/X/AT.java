package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class AT extends AbstractC0633Lw {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 94);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{Byte.MAX_VALUE, 96, 109, 108, 102, 64, 103, 125, 108, 123, 122, 125, 96, 125, 104, 101, 76, Byte.MAX_VALUE, 108, 103, 125};
    }

    public AT(C03469v c03469v) {
        this.A00 = c03469v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9C
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(C0643Mg c0643Mg) {
        AT at = this;
        char c2 = at.A00.getAudienceNetworkListener() != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    at = at;
                    c0643Mg = c0643Mg;
                    at.A00.getAudienceNetworkListener().A3s(A00(0, 21, 87), c0643Mg);
                    c2 = 3;
                    break;
                case 3:
                    at = at;
                    if (at.A00.A01 == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    at = at;
                    if (!at.A00.A03) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    at = at;
                    at.A00.A0F.A0V(3);
                    at.A00.A0F.A0R();
                    at.A00.A03 = true;
                    c2 = 6;
                    break;
                case 6:
                    at = at;
                    if (at.A00.A00 == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    at = at;
                    at.A00.A00.finish(2);
                    c2 = '\b';
                    break;
                case '\b':
                    return;
            }
        }
    }
}
