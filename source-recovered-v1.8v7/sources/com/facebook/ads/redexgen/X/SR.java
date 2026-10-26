package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.EnumSet;

/* loaded from: assets/audience_network.dex */
public final class SR implements InterfaceC01491s {
    public static byte[] A07;
    public static final String A08;
    public long A00 = -1;
    public FQ A01;
    public boolean A02;
    public boolean A03;
    public final XI A04;
    public final InterstitialAdExtendedListener A05;
    public final C01501t A06;

    public static String A05(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 41);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A06() {
        A07 = new byte[]{74, 91, 66, 4, 43, 101, 36, 33, 101, 41, 42, 36, 33, 101, 44, 54, 101, 36, 41, 55, 32, 36, 33, 60, 101, 44, 43, 101, 53, 55, 42, 34, 55, 32, 54, 54, 107, 101, 28, 42, 48, 101, 54, 45, 42, 48, 41, 33, 101, 50, 36, 44, 49, 101, 35, 42, 55, 101, 36, 33, 9, 42, 36, 33, 32, 33, 109, 108, 101, 49, 42, 101, 39, 32, 101, 38, 36, 41, 41, 32, 33, 119, 80, 74, 91, 76, 77, 74, 87, 74, 87, 95, 82, 30, 82, 81, 95, 90, 30, 93, 95, 82, 82, 91, 90, 30, 73, 86, 87, 82, 91, 30, 77, 86, 81, 73, 87, 80, 89, 30, 87, 80, 74, 91, 76, 77, 74, 87, 74, 87, 95, 82, 16};
    }

    static {
        A06();
        A08 = SR.class.getSimpleName();
    }

    public SR(C01501t c01501t, AnonymousClass20 anonymousClass20, String str) {
        this.A06 = c01501t;
        this.A04 = c01501t.A05();
        this.A05 = new C0791Sa(str, anonymousClass20, this);
    }

    public final long A09() {
        FQ fq = this.A01;
        if (fq != null) {
            return fq.A0D();
        }
        return -1L;
    }

    public final void A0A() {
        FQ fq = this.A01;
        if (fq != null) {
            fq.A0P(new SQ(this));
            this.A01.A0U(true);
            this.A01 = null;
            this.A03 = false;
            this.A02 = false;
        }
    }

    public final void A0B(@Nullable EnumSet<CacheFlag> enumSet, @Nullable String str) {
        this.A00 = System.currentTimeMillis();
        if (!this.A03 && this.A01 != null) {
            Log.w(A08, A05(3, 78, 108));
        }
        this.A03 = false;
        if (this.A02 && !JQ.A0a(this.A04)) {
            this.A04.A04().A83(A05(0, 3, 2), C03008a.A0B, new C03018b(A05(81, 52, 23)));
            AdErrorType adErrorType = AdErrorType.LOAD_CALLED_WHILE_SHOWING_AD;
            this.A04.A0A().A2c(C0627Lq.A01(this.A00), adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
            this.A05.onError(this.A06.A01(), new AdError(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage()));
            return;
        }
        FQ fq = this.A01;
        if (fq != null) {
            fq.A0P(new SN(this));
            this.A01.A0J();
            this.A01 = null;
        }
        C01421l c01421l = new C01421l(this.A06.A09(), KD.A01(this.A04.getResources().getDisplayMetrics()), AdPlacementType.INTERSTITIAL, KA.A07, 1, enumSet);
        c01421l.A05(this.A06.A07());
        c01421l.A06(this.A06.A08());
        c01421l.A03(this.A06.A03());
        this.A01 = new FQ(this.A04, c01421l);
        this.A01.A0P(new SP(this));
        this.A01.A0R(str);
    }

    public final boolean A0C() {
        boolean z = false;
        FQ fq = this.A01;
        char c2 = fq != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    fq = fq;
                    if (!fq.A0V()) {
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

    public final boolean A0D() {
        return this.A03;
    }

    public final boolean A0E() {
        SR sr = this;
        FQ fq = null;
        AdError adError = AdError.SHOW_CALLED_BEFORE_LOAD_ERROR;
        char c2 = !sr.A03 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    SR sr2 = sr;
                    AdError adError2 = adError;
                    sr2.A04.A0A().A2c(C0627Lq.A01(sr2.A00), adError2.getErrorCode(), adError2.getErrorMessage());
                    sr2.A05.onError(sr2.A06.A01(), adError2);
                    return false;
                case 3:
                    sr = sr;
                    fq = sr.A01;
                    if (fq != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    SR sr3 = sr;
                    AdError adError3 = adError;
                    sr3.A04.A04().A83(A05(0, 3, 2), C03008a.A0H, new C03018b(AdErrorType.INTERSTITIAL_CONTROLLER_IS_NULL.getDefaultErrorMessage()));
                    sr3.A04.A0A().A2c(C0627Lq.A01(sr3.A00), adError3.getErrorCode(), adError3.getErrorMessage());
                    sr3.A05.onError(sr3.A06.A01(), adError3);
                    return false;
                case 5:
                    SR sr4 = sr;
                    fq.A0I();
                    sr4.A02 = true;
                    sr4.A03 = false;
                    return true;
            }
        }
    }
}
