package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.util.Log;
import d.b.a.b.k;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class RQ extends AbstractC01100f {
    public static byte[] A01;
    public static final String A02;
    public final Uri A00;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 127);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{49, 22, 30, 27, 18, 19, 87, 3, 24, 87, 24, 7, 18, 25, 87, 27, 30, 25, 28, 87, 2, 5, 27, 77, 87, 90, 77, 76, 65, 90, 77, 75, 92, 73, 75, 92, 65, 71, 70, 50, 40};
    }

    static {
        A01();
        A02 = RQ.class.getSimpleName();
    }

    public RQ(XI xi, JW jw, String str, Uri uri) {
        super(xi, jw, str);
        this.A00 = uri;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01100f
    public final void A0B() {
        try {
            Log.w(A00(25, 16, k.AppCompatTheme_windowFixedHeightMinor), this.A00.toString());
            LG.A08(new LG(), super.A00, this.A00, this.A02);
        } catch (Exception unused) {
            String str = A00(0, 25, 8) + this.A00.toString();
        }
    }
}
