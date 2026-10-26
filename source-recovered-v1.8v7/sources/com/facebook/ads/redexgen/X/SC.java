package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import d.b.a.b.k;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class SC implements InterfaceC01290y {
    public static byte[] A02;
    public final /* synthetic */ FQ A00;
    public final /* synthetic */ Runnable A01;

    static {
        A01();
    }

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ k.AppCompatTheme_windowActionModeOverlay);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A02 = new byte[]{65, 64, 103, 64, 90, 75, 92, 93, 90, 71, 90, 71, 79, 66, 98, 65, 73, 73, 71, 64, 73, 103, 67, 94, 92, 75, 93, 93, 71, 65, 64, 124, 125, 121, 46, 122, 126, 88, 73, 80, 37, 2, 24, 9, 30, 31, 24, 5, 24, 5, 13, 0, 76, 5, 1, 28, 30, 9, 31, 31, 5, 3, 2, 76, 10, 5, 30, 9, 8, 35, 44, 38, 48, 45, 43, 38, 108, 43, 44, 54, 39, 44, 54, 108, 35, 33, 54, 43, 45, 44, 108, 20, 11, 7, 21, 24, 61, 56, 41, 45, 60, 43, 121, 48, 42, 121, 55, 44, 53, 53, 121, 54, 55, 121, 53, 54, 56, 61, 16, 55, 45, 60, 43, 42, 45, 48, 45, 48, 56, 53, 24, 61};
    }

    public SC(FQ fq, Runnable runnable) {
        this.A00 = fq;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01290y
    public final void A9r(C0768Rd c0768Rd, String str, boolean z) {
        SC sc = this;
        sc.A00.A07.A0C();
        boolean z2 = !TextUtils.isEmpty(str);
        char c2 = z ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    if (!z2) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    sc = sc;
                    str = str;
                    Intent intent = new Intent(A00(69, 26, 55));
                    intent.setData(Uri.parse(str));
                    LA.A0B(sc.A00.A0C, intent);
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01290y
    public final void A9s(C0768Rd c0768Rd) {
        this.A00.A07.A02();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01290y
    public final void A9t(C0768Rd c0768Rd) {
        this.A00.A07.A04();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01290y
    public final void A9u(C0768Rd c0768Rd) {
        char c2 = c0768Rd != this.A00.A01 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c0768Rd = c0768Rd;
                    if (c0768Rd != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    SC sc = this;
                    sc.A00.A0C.A04().A83(A00(37, 3, 76), C03008a.A0M, new C03018b(A00(95, 37, 44)));
                    sc.A9v(c0768Rd, AdError.internalError(AdError.INTERNAL_ERROR_2004));
                    return;
                case 5:
                    SC sc2 = this;
                    C0768Rd c0768Rd2 = c0768Rd;
                    sc2.A00.A0E().removeCallbacks(sc2.A01);
                    FQ fq = sc2.A00;
                    fq.A02 = c0768Rd2;
                    super/*com.facebook.ads.redexgen.X.S9*/.A0H();
                    sc2.A00.A07.A0F(c0768Rd2);
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01290y
    public final void A9v(C0768Rd c0768Rd, AdError adError) {
        SC sc = this;
        char c2 = c0768Rd != sc.A00.A01 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    sc = sc;
                    c0768Rd = c0768Rd;
                    sc.A00.A0E().removeCallbacks(sc.A01);
                    sc.A00.A0N(c0768Rd);
                    if (!JQ.A0g(sc.A00.A0C)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    sc = sc;
                    sc.A00.A0M();
                    c2 = 5;
                    break;
                case 5:
                    SC sc2 = sc;
                    AdError adError2 = adError;
                    sc2.A00.A0C.A0A().A4Y(adError2.getErrorCode(), adError2.getErrorMessage());
                    sc2.A00.A07.A0G(new K5(adError2.getErrorCode(), adError2.getErrorMessage()));
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01290y
    public final void A9w(C0768Rd c0768Rd) {
        KJ.A05(A00(0, 31, 91), A00(40, 29, 25), A00(31, 6, 56));
        this.A00.A07.A0D();
        this.A00.A0K();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01290y
    public final void A9x() {
        this.A00.A07.A07();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01290y
    public final void A9y() {
        this.A00.A07.A05();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01290y
    public final void A9z() {
        this.A00.A07.A06();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01290y
    public final void onInterstitialActivityDestroyed() {
        this.A00.A07.A00();
    }
}
