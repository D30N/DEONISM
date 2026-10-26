package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.ads.AdError;
import com.facebook.ads.InstreamVideoAdListener;
import com.facebook.ads.InstreamVideoAdView;
import com.facebook.ads.internal.api.InstreamVideoAdViewApi;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Rp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0780Rp implements InterfaceC01280x {
    public static byte[] A06;

    @Nullable
    public View A00;

    @Nullable
    public InstreamVideoAdListener A01;

    @Nullable
    public String A02;
    public final InstreamVideoAdView A03;
    public final InstreamVideoAdViewApi A04;
    public final XI A05;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 70);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A06 = new byte[]{25, 59, 52, 52, 53, 46, 122, 42, 40, 63, 41, 63, 52, 46, 122, 52, 47, 54, 54, 122, 44, 51, 63, 45};
    }

    public C0780Rp(InstreamVideoAdViewApi instreamVideoAdViewApi, InstreamVideoAdListener instreamVideoAdListener, InstreamVideoAdView instreamVideoAdView, View view, XI xi, String str) {
        this.A04 = instreamVideoAdViewApi;
        this.A01 = instreamVideoAdListener;
        this.A03 = instreamVideoAdView;
        this.A00 = view;
        this.A05 = xi;
        this.A02 = str;
    }

    private void A04(InstreamVideoAdView instreamVideoAdView) {
        C0703Op c0703OpA01 = C0702Oo.A01(this.A05, this.A02);
        if (c0703OpA01 != null) {
            instreamVideoAdView.addView(c0703OpA01, new RelativeLayout.LayoutParams(-1, -1));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01280x
    public final void A9l(AbstractC0775Rk abstractC0775Rk) {
        C0600Kn.A00(new C0778Rn(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01280x
    public final void A9m(AbstractC0775Rk abstractC0775Rk) {
        this.A04.setIsAdLoaded(true);
        C0600Kn.A00(new C0776Rl(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01280x
    public final void A9n(AbstractC0775Rk abstractC0775Rk) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01280x
    public final void A9o(AbstractC0775Rk abstractC0775Rk) {
        C0600Kn.A00(new C0779Ro(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01280x
    public final void A9p(AbstractC0775Rk abstractC0775Rk, View view) {
        if (view != null) {
            this.A00 = view;
            this.A03.removeAllViews();
            this.A00.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.A03.addView(this.A00);
            A04(this.A03);
            return;
        }
        throw new IllegalStateException(A02(0, 24, 28));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01280x
    public final void A9q(AbstractC0775Rk abstractC0775Rk, AdError adError) {
        C0600Kn.A00(new C0777Rm(this, adError));
    }
}
