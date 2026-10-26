package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONException;

/* loaded from: assets/audience_network.dex */
public class RU extends AbstractRunnableC0608Kw {
    public static byte[] A01;
    public final /* synthetic */ String A00;

    static {
        A02();
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 66);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A01 = new byte[]{-87, -75, -88, -76, -72, -88, -79, -90, -68, -94, -90, -92, -77, -77, -84, -79, -86};
    }

    public RU(String str) {
        this.A00 = str;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0608Kw
    public final void A06() throws InterruptedException {
        String strA00 = A00(0, 17, 1);
        try {
            C01250u.A04.await();
            if (C01250u.A0I(this.A00)) {
                ((C1L) C01250u.A00.A03().get(this.A00)).A03((int) (System.currentTimeMillis() / 1000));
                C01250u.A00.A06(this.A00);
                C01250u.A00.A04();
                C01250u.A09();
            }
        } catch (InterruptedException e) {
            C01250u.A01.A04().A83(strA00, C03008a.A0w, new C03018b(e));
        } catch (JSONException e2) {
            C01250u.A07();
            C01250u.A01.A04().A83(strA00, C03008a.A0v, new C03018b(e2));
        }
    }
}
