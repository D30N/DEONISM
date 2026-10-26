package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.RelativeLayout;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: assets/audience_network.dex */
public abstract class O8 extends RelativeLayout {
    public static byte[] A08;
    public static final int A09;
    public static final int A0A;
    public C1I A00;
    public boolean A01;
    public boolean A02;
    public final XI A03;
    public final JW A04;
    public final ViewOnClickListenerC0998a5 A05;
    public final O5 A06;
    public final OC A07;

    public static String A0H(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 23);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0I() {
        A08 = new byte[]{33, 45, 47, 108, 36, 35, 33, 39, 32, 45, 45, 41, 108, 35, 38, 49, 108, 43, 44, 54, 39, 48, 49, 54, 43, 54, 43, 35, 46, 108, 33, 46, 43, 33, 41, 39, 38};
    }

    public abstract boolean A0c();

    static {
        A0I();
        A09 = (int) (C0635Ly.A01 * 16.0f);
        A0A = (int) (C0635Ly.A01 * 28.0f);
    }

    public O8(OC oc, boolean z) {
        C1I c1iA00;
        super(oc.A05());
        this.A01 = false;
        this.A07 = oc;
        this.A03 = oc.A05();
        this.A04 = oc.A06();
        if (oc.A00() == 1) {
            c1iA00 = oc.A04().A0K().A01();
        } else {
            c1iA00 = oc.A04().A0K().A00();
        }
        this.A00 = c1iA00;
        this.A02 = z;
        this.A05 = new ViewOnClickListenerC0998a5(oc.A05(), A0H(0, 37, 85), this.A00, oc.A06(), oc.A09(), oc.A0B(), oc.A07());
        this.A05.setRoundedCornersEnabled(A0N());
        this.A05.setViewShowsOverMedia(A0M());
        C0635Ly.A0J(AdError.NO_FILL_ERROR_CODE, this.A05);
        this.A06 = new O5(this.A03, this.A00, this.A02, A0O(), A0P());
        C0635Ly.A0N(this.A06);
        if (JQ.A1H(this.A03)) {
            this.A06.setDescriptionVisibility(8);
        }
    }

    public void A0J(Bundle bundle) {
    }

    public void A0K(C02987x c02987x) {
        this.A01 = true;
    }

    public void A0L(C02967u c02967u) {
    }

    public boolean A0M() {
        return true;
    }

    public boolean A0N() {
        return true;
    }

    public boolean A0O() {
        return true;
    }

    public boolean A0P() {
        return true;
    }

    public void A0V() {
    }

    public void A0W() {
    }

    public void A0X() {
    }

    public void A0Y() {
    }

    public void A0Z() {
    }

    public void A0a(C1A c1a, String str, double d2, @Nullable Bundle bundle) {
        boolean z = false;
        O5 o5 = this.A06;
        String strA05 = c1a.A0E().A05();
        String strA01 = c1a.A0E().A01();
        char c2 = !A0c() ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    if (d2 <= 0.0d) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (d2 >= 1.0d) {
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
                    o5.A01(strA05, strA01, null, false, z);
                    this.A05.setCta(c1a.A0F(), str, new HashMap());
                    return;
                case 6:
                    z = false;
                    c2 = 5;
                    break;
            }
        }
    }

    public boolean A0b() {
        return false;
    }

    public boolean A0d(boolean z) {
        return false;
    }

    public XI getAdContextWrapper() {
        return this.A03;
    }

    public JW getAdEventManager() {
        return this.A04;
    }

    @ToolbarActionView$ToolbarActionMode
    public int getCloseButtonStyle() {
        return 0;
    }

    public C1I getColors() {
        return this.A00;
    }

    public ViewOnClickListenerC0998a5 getCtaButton() {
        return this.A05;
    }

    public O5 getTitleDescContainer() {
        return this.A06;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        O8 o8 = this;
        C1I c1iA00 = null;
        super.onConfigurationChanged(configuration);
        char c2 = configuration.orientation == 1 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    o8 = o8;
                    c1iA00 = o8.A07.A04().A0K().A01();
                    c2 = 3;
                    break;
                case 3:
                    O8 o82 = o8;
                    o82.A00 = c1iA00;
                    o82.A05.setViewShowsOverMedia(o82.A0M());
                    o82.A05.setUpButtonColors(o82.A00);
                    o82.A06.A00(o82.A00, o82.A02);
                    return;
                case 4:
                    o8 = o8;
                    c1iA00 = o8.A07.A04().A0K().A00();
                    c2 = 3;
                    break;
            }
        }
    }
}
