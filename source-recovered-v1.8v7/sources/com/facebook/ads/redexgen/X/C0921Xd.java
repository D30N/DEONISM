package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0921Xd implements L2 {
    public static byte[] A01;
    public final /* synthetic */ XJ A00;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 65);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{-63, -67, -68, -16, -33, -28, -32, -23, -34, -32, -55, -32, -17, -14, -22, -19, -26, -16, -1, -18, 0, -11, -20, 0, -11, -10, -14, -7, -15, -53, -28, -37, -18, -26, -37, -39, -22, -37, -38, -106, -37, -24, -24, -27, -24, -92};
    }

    public C0921Xd(XJ xj) {
        this.A00 = xj;
    }

    @Override // com.facebook.ads.redexgen.X.L2
    public final void A7u(int i, Throwable th) {
        Log.e(A00(0, 17, 58), A00(29, 17, 53), th);
        this.A00.A04().A83(A00(17, 12, 76), i, new C03018b(th));
    }
}
