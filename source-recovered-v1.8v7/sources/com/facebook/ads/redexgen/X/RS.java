package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class RS extends AbstractRunnableC0608Kw {
    public static byte[] A01;
    public final /* synthetic */ JSONObject A00;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 2);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A01 = new byte[]{121, -123, 120, -124, -120, 120, -127, 118, -116, 114, 118, 116, -125, -125, 124, -127, 122};
    }

    public RS(JSONObject jSONObject) {
        this.A00 = jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0608Kw
    public final void A06() throws InterruptedException {
        try {
            C01250u.A03.await();
            synchronized (C01250u.A00) {
                C01250u.A00.A09(this.A00);
                C01250u.A04.countDown();
            }
        } catch (InterruptedException e) {
            C01250u.A01.A04().A83(A00(0, 17, 17), C03008a.A0w, new C03018b(e));
        } catch (JSONException e2) {
            C01250u.A07();
            C01250u.A01.A04().A83(A00(0, 17, 17), C03008a.A0v, new C03018b(e2));
        }
    }
}
