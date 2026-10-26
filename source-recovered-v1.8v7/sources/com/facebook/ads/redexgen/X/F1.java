package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import java.util.EnumSet;

/* loaded from: assets/audience_network.dex */
public final class F1 extends SM {

    @VisibleForTesting
    public static final InterfaceC01511u A03 = new SW();

    @Nullable
    public SR A00;
    public final C01501t A01;
    public final XI A02;

    public F1(C01501t c01501t) {
        super(c01501t.A05(), A03.A4M(c01501t));
        this.A01 = c01501t;
        this.A02 = c01501t.A05();
    }

    @Override // com.facebook.ads.redexgen.X.SM
    public final void A05() {
        SR sr = this.A00;
        if (sr != null) {
            sr.A0A();
        }
        super.A00.ACz(EnumC01461p.A03);
    }

    public final void A07() {
        this.A00 = new SR(this.A01, this, super.A02);
        this.A00.A0B(this.A01.A0A(), this.A01.A06());
    }

    public final void A08(InterstitialAd interstitialAd, EnumSet<CacheFlag> enumSet, @Nullable String str) {
        F1 f1 = this;
        SR sr = null;
        char c2 = ((SM) f1).A00.A51() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    f1 = f1;
                    interstitialAd = interstitialAd;
                    f1.A01.A0C(interstitialAd);
                    sr = f1.A00;
                    if (sr == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    sr.A0B(enumSet, str);
                    return;
                case 5:
                    F1 f12 = f1;
                    f12.A01.A0J(enumSet);
                    f12.A01.A0G(str);
                    f12.A07();
                    return;
            }
        }
    }

    public final boolean A09() {
        F1 f1 = this;
        boolean z = false;
        SR sr = f1.A00;
        char c2 = sr != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return sr.A0C();
                case 3:
                    f1 = f1;
                    if (f1.A01.A00() <= 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    f1 = f1;
                    if (C0627Lq.A00() <= f1.A01.A00()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    z = true;
                    c2 = 6;
                    break;
                case 6:
                    return z;
                case 7:
                    z = false;
                    c2 = 6;
                    break;
            }
        }
    }

    public final boolean A0A() {
        F1 f1 = this;
        boolean z = false;
        SR sr = f1.A00;
        char c2 = sr != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return sr.A0D();
                case 3:
                    f1 = f1;
                    if (((SM) f1).A00.A5I() != EnumC01461p.A05) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z = true;
                    c2 = 5;
                    break;
                case 5:
                    return z;
                case 6:
                    z = false;
                    c2 = 5;
                    break;
            }
        }
    }

    public final boolean A0B(InterstitialAd interstitialAd, InterstitialAd.InterstitialShowAdConfig interstitialShowAdConfig) {
        F1 f1 = this;
        SR sr = null;
        char c2 = ((SM) f1).A00.A52() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return false;
                case 3:
                    f1 = f1;
                    interstitialAd = interstitialAd;
                    f1.A01.A0C(interstitialAd);
                    sr = f1.A00;
                    if (sr == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return sr.A0E();
                case 5:
                    F1 f12 = f1;
                    f12.A00 = new SR(f12.A01, f12, ((SM) f12).A02);
                    f12.A00.A0E();
                    return false;
            }
        }
    }
}
