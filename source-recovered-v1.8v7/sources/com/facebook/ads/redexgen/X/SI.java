package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class SI implements AnonymousClass13 {
    public static byte[] A02;
    public final /* synthetic */ F7 A00;
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 58);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A02 = new byte[]{-56, -57, -85, -66, -48, -70, -53, -67, -66, -67, -81, -62, -67, -66, -56, -102, -67, -91, -56, -64, -64, -62, -57, -64, -94, -58, -55, -53, -66, -52, -52, -62, -56, -57, 121, 122, 122, -86, 123, -87, 123, 119, -54, -35, -17, -39, -22, -36, -35, -36, -104, -50, -31, -36, -35, -25, -104, -31, -27, -24, -22, -35, -21, -21, -31, -25, -26, -104, -34, -31, -22, -35, -36};
    }

    public SI(F7 f7, Runnable runnable) {
        this.A00 = f7;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass13
    public final void AAr(AbstractC0782Rr abstractC0782Rr) {
        this.A00.A07.A05();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass13
    public final void AAs(AbstractC0782Rr abstractC0782Rr) {
        this.A00.A07.A06();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass13
    public final void AAt(AbstractC0782Rr abstractC0782Rr) {
        this.A00.A07.A0C();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass13
    public final void AAu(AbstractC0782Rr abstractC0782Rr) {
        this.A00.A0E().removeCallbacks(this.A01);
        F7 f7 = this.A00;
        f7.A02 = abstractC0782Rr;
        super/*com.facebook.ads.redexgen.X.S9*/.A0H();
        this.A00.A07.A0F(abstractC0782Rr);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass13
    public final void AAv(AbstractC0782Rr abstractC0782Rr) {
        KJ.A05(A00(0, 34, 31), A00(42, 31, 62), A00(34, 8, 13));
        this.A00.A07.A0D();
        this.A00.A0K();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass13
    public final void AAw(AbstractC0782Rr abstractC0782Rr) {
        this.A00.A07.A07();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass13
    public final void AAx(AbstractC0782Rr abstractC0782Rr, AdError adError) {
        SI si = this;
        si.A00.A0E().removeCallbacks(si.A01);
        si.A00.A0C.A0A().A4Y(adError.getErrorCode(), adError.getErrorMessage());
        char c2 = AdError.AD_PRESENTATION_ERROR.equals(adError) ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    si = si;
                    if (!JQ.A12(si.A00.A0C)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    si = si;
                    si.A00.A07.A0G(K5.A01(AdErrorType.AD_PRESENTATION_ERROR));
                    c2 = 4;
                    break;
                case 4:
                    SI si2 = si;
                    si2.A00.A0N(abstractC0782Rr);
                    si2.A00.A0M();
                    return;
                case 5:
                    si = si;
                    si.A00.A07.A0G(K5.A01(AdErrorType.INTERNAL_ERROR));
                    c2 = 4;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass13
    public final void onRewardedVideoActivityDestroyed() {
        this.A00.A07.A08();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass13
    public final void onRewardedVideoClosed() {
        this.A00.A07.A09();
    }
}
