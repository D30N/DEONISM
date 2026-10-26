package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class RP extends AbstractC01100f {
    public static byte[] A02;
    public static final String A03;
    public final Uri A00;
    public final Map<String, String> A01;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 13);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A02 = new byte[]{102, 107, 98, 119, Byte.MAX_VALUE, 125, 102, 96, 125, 102, 123, 118};
    }

    static {
        A01();
        A03 = RP.class.getSimpleName();
    }

    public RP(XI xi, JW jw, String str, Uri uri, Map<String, String> mExtraData) {
        super(xi, jw, str);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01100f
    public final void A0B() {
        JX jx = JX.A04;
        String queryParameter = this.A00.getQueryParameter(A00(4, 8, 2));
        if (!TextUtils.isEmpty(queryParameter)) {
            try {
                jx = JX.values()[Integer.valueOf(queryParameter).intValue()];
            } catch (Exception unused) {
            }
        }
        super.A01.A8D(this.A02, this.A01, this.A00.getQueryParameter(A00(0, 4, 31)), jx);
    }
}
