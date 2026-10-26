package com.facebook.ads.redexgen.X;

import android.view.View;
import com.facebook.ads.AdError;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class SA implements InterfaceC01280x {
    public static byte[] A01;
    public final /* synthetic */ FY A00;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 50);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{4, 35, 62, 57, 63, 40, 44, 32, 109, 36, 32, 61, 63, 40, 62, 62, 36, 34, 35, 109, 43, 36, 63, 40, 41, 54, 55, 16, 55, 42, 45, 43, 60, 56, 52, 15, 48, 61, 60, 54, 24, 61, 21, 54, 62, 62, 48, 55, 62, 16, 52, 41, 43, 60, 42, 42, 48, 54, 55, 57, 57, 110, 105, 109, 56};
    }

    public SA(FY fy) {
        this.A00 = fy;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01280x
    public final void A9l(AbstractC0775Rk abstractC0775Rk) {
        this.A00.A07.A0C();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01280x
    public final void A9m(AbstractC0775Rk abstractC0775Rk) {
        FY fy = this.A00;
        fy.A02 = abstractC0775Rk;
        fy.A0D = false;
        super/*com.facebook.ads.redexgen.X.S9*/.A0H();
        this.A00.A07.A0F(abstractC0775Rk);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01280x
    public final void A9n(AbstractC0775Rk abstractC0775Rk) {
        KJ.A05(A00(25, 34, 107), A00(0, 25, 127), A00(59, 6, 105));
        this.A00.A07.A0D();
        this.A00.A0K();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01280x
    public final void A9o(AbstractC0775Rk abstractC0775Rk) {
        this.A00.A07.A0B();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01280x
    public final void A9p(AbstractC0775Rk abstractC0775Rk, View view) {
        this.A00.A07.A0E(view);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01280x
    public final void A9q(AbstractC0775Rk abstractC0775Rk, AdError adError) {
        this.A00.A07.A0G(new K5(adError.getErrorCode(), adError.getErrorMessage()));
    }
}
