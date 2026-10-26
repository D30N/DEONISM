package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class SL extends AbstractRunnableC0608Kw {
    public static byte[] A01;
    public final /* synthetic */ SM A00;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 29);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A01 = new byte[]{-67, -71, -72, -20, -37, -32, -36, -27, -38, -36, -59, -36, -21, -18, -26, -23, -30, -126, -111, -118, -108, -86, -80, 91, -97, -92, -97, -87, 98, -81, 91, -98, -100, -89, -89, 91, -97, -96, -82, -81, -83, -86, -76, 99, 100, 91, -95, -86, -83, 91, 124, -97, 91, -118, -99, -91, -96, -98, -81, 105, 91, -113, -93, -92, -82, 91, -88, -100, -76, 91, -89, -96, -100, -97, 91, -81, -86, 91, -89, -96, -100, -90, -92, -87, -94, 91, -88, -96, -88, -86, -83, -76, 105, 91, -117, -89, -96, -100, -82, -96, 103, 91, -100, -89, -78, -100, -76, -82, 91, -98, -100, -89, -89, 91, -97, -96, -82, -81, -83, -86, -76, 99, 100, 91, -78, -93, -96, -87, 91, -76, -86, -80, 91, -97, -86, -87, 98, -81, 91, -87, -96, -96, -97, 91, -81, -93, -92, -82, 91, 124, -97, 91, -118, -99, -91, -96, -98, -81, 91, -100, -87, -76, 91, -88, -86, -83, -96, 105, -53, -20, -6, -5, -7, -10, 0, -89, -2, -24, -6, -89, -11, -10, -5, -89, -22, -24, -13, -13, -20, -21, -75};
    }

    public SL(SM sm) {
        this.A00 = sm;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0608Kw
    public final void A06() {
        SL sl = this;
        sl.A00.A01.A0A().A2k();
        char c2 = sl.A00.A00.A5I() == EnumC01461p.A03 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    if (!BuildConfigApi.isDebug()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    sl = sl;
                    sl.A00.A01.A04().A8H(A00(17, 3, 4), C03008a.A0N, new C03018b(A00(168, 23, 106)));
                    c2 = 5;
                    break;
                case 5:
                    Log.e(A00(0, 17, 90), A00(20, 148, 30));
                    sl.A00.A05();
                    return;
            }
        }
    }
}
