package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class SU implements InterfaceC01491s {
    public static byte[] A07;
    public static final String A08;
    public F7 A02;

    @Nullable
    public String A03;
    public final S2SRewardedVideoAdExtendedListener A05;
    public final C01541x A06;
    public int A00 = 0;
    public boolean A04 = false;
    public long A01 = -1;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 51);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A06() {
        A07 = new byte[]{-110, -65, -65, -68, -65, 109, -71, -68, -82, -79, -74, -69, -76, 109, -65, -78, -60, -82, -65, -79, -78, -79, 109, -61, -74, -79, -78, -68, 109, -82, -79, -30, -15, -22, -33, 12, -66, -1, 2, -66, 10, 13, -1, 2, -66, 7, 17, -66, -1, 10, 16, 3, -1, 2, 23, -66, 7, 12, -66, 14, 16, 13, 5, 16, 3, 17, 17, -52, -66, -9, 13, 19, -66, 17, 6, 13, 19, 10, 2, -66, 21, -1, 7, 18, -66, 4, 13, 16, -66, -1, 2, -22, 13, -1, 2, 3, 2, -58, -57, -66, 18, 13, -66, 0, 3, -66, 1, -1, 10, 10, 3, 2};
    }

    static {
        A06();
        A08 = SU.class.getSimpleName();
    }

    public SU(C01541x c01541x, AnonymousClass20 anonymousClass20, String str) {
        this.A06 = c01541x;
        this.A05 = new C0792Sb(str, anonymousClass20, this, c01541x);
    }

    private void A08(@Nullable String str, @Nullable AdExperienceType adExperienceType, boolean z) {
        if (!this.A04 && this.A02 != null) {
            Log.w(A08, A04(34, 78, 107));
        }
        A09(false);
        this.A04 = false;
        C01421l c01421l = new C01421l(this.A06.A0C, KB.A07, AdPlacementType.REWARDED_VIDEO, KA.A07, 1);
        c01421l.A07(z);
        c01421l.A05(this.A06.A06);
        c01421l.A06(this.A06.A07);
        this.A02 = new F7(this.A06.A0B, c01421l);
        this.A02.A0P(new SS(this));
        this.A02.A0S(str, adExperienceType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(boolean z) {
        F7 f7 = this.A02;
        if (f7 != null) {
            f7.A0P(new ST(this));
            this.A02.A0U(z);
            this.A02 = null;
        }
    }

    public final long A0B() {
        F7 f7 = this.A02;
        if (f7 != null) {
            return f7.A0D();
        }
        return -1L;
    }

    public final void A0C() {
        A09(true);
    }

    public final void A0D(RewardData rewardData) {
        this.A06.A03 = rewardData;
        if (this.A04) {
            this.A02.A0W(rewardData);
        }
    }

    public final void A0E(@Nullable String str, @Nullable AdExperienceType adExperienceType, boolean z) {
        this.A01 = System.currentTimeMillis();
        try {
            A08(str, adExperienceType, z);
        } catch (Exception e) {
            Log.e(A08, A04(0, 31, 26), e);
            this.A06.A0B.A04().A83(A04(31, 3, 78), C03008a.A0Q, new C03018b(e));
            AdError adErrorInternalError = AdError.internalError(AdError.INTERNAL_ERROR_2004);
            this.A06.A0B.A0A().A2c(C0627Lq.A01(this.A01), adErrorInternalError.getErrorCode(), adErrorInternalError.getErrorMessage());
            this.A05.onError(this.A06.A00(), adErrorInternalError);
        }
    }

    public final boolean A0F() {
        boolean z = false;
        F7 f7 = this.A02;
        char c2 = f7 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    f7 = f7;
                    if (!f7.A0V()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z = true;
                    c2 = 4;
                    break;
                case 4:
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    public final boolean A0G() {
        return this.A04;
    }

    public final boolean A0H(int i) {
        SU su = this;
        F7 f7 = null;
        char c2 = !su.A04 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    SU su2 = su;
                    su2.A05.onError(su2.A06.A00(), AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
                    return false;
                case 3:
                    su = su;
                    f7 = su.A02;
                    if (f7 == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    SU su3 = su;
                    f7.A08.A02(i);
                    su3.A02.A0I();
                    su3.A04 = false;
                    return true;
                case 5:
                    su.A04 = false;
                    return false;
            }
        }
    }
}
