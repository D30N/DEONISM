package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.ads.InstreamVideoAdView;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class TZ extends AbstractC01190o {
    public static byte[] A01;
    public final /* synthetic */ AnonymousClass56 A00;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 83);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{-103, -73, -60, -60, -59, -54, 118, -58, -56, -69, -55, -69, -60, -54, 118, -60, -53, -62, -62, 118, -52, -65, -69, -51};
    }

    public TZ(AnonymousClass56 anonymousClass56) {
        this.A00 = anonymousClass56;
    }

    private void A02(InstreamVideoAdView instreamVideoAdView) {
        C0703Op c0703OpA01 = C0702Oo.A01(this.A00.A0C, this.A00.A08);
        if (c0703OpA01 != null) {
            instreamVideoAdView.addView(c0703OpA01, new RelativeLayout.LayoutParams(-1, -1));
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01190o
    public final void A0B() {
        C0600Kn.A00(new TY(this));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01190o
    public final void A0C() {
        C0600Kn.A00(new TW(this));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01190o
    public final void A0D() {
        C0600Kn.A00(new TX(this));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01190o
    public final void A0E(View view) {
        final TZ tz = this;
        char c2 = view != null ? (char) 2 : '\t';
        while (true) {
            switch (c2) {
                case 2:
                    tz = tz;
                    view = view;
                    tz.A00.A01 = view;
                    tz.A00.A0B.removeAllViews();
                    tz.A00.A01.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                    tz.A00.A0B.addView(tz.A00.A01);
                    tz.A02(tz.A00.A0B);
                    if (Build.VERSION.SDK_INT < 18) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    tz = tz;
                    if (!JQ.A0m(tz.A00.A0C)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    tz = tz;
                    tz.A00.A06 = new C0674Nm();
                    tz.A00.A06.A0C(tz.A00.A0D);
                    tz.A00.A06.A0B(tz.A00.A0C.getPackageName());
                    if (tz.A00.A04 == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    tz = tz;
                    if (tz.A00.A04.A0F() == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    tz = tz;
                    tz.A00.A06.A09(tz.A00.A04.A0F().A0C());
                    c2 = 7;
                    break;
                case 7:
                    tz = tz;
                    tz.A00.A01.getOverlay().add(tz.A00.A06);
                    tz.A00.A01.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.facebook.ads.redexgen.X.55
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view2) {
                            AnonymousClass55 anonymousClass55 = this;
                            char c3 = anonymousClass55.A00.A00.A01 != null ? (char) 2 : (char) 3;
                            while (true) {
                                switch (c3) {
                                    case 2:
                                        anonymousClass55 = anonymousClass55;
                                        if (anonymousClass55.A00.A00.A06 != null) {
                                            c3 = 4;
                                            break;
                                        } else {
                                            c3 = 3;
                                            break;
                                        }
                                    case 3:
                                        return false;
                                    case 4:
                                        AnonymousClass55 anonymousClass552 = anonymousClass55;
                                        anonymousClass552.A00.A00.A06.setBounds(0, 0, anonymousClass552.A00.A00.A01.getWidth(), anonymousClass552.A00.A00.A01.getHeight());
                                        anonymousClass552.A00.A00.A06.A0D(!anonymousClass552.A00.A00.A06.A0E());
                                        return true;
                                }
                            }
                        }
                    });
                    c2 = '\b';
                    break;
                case '\b':
                    return;
                case '\t':
                    throw new IllegalStateException(A00(0, 24, 3));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01190o
    public final void A0F(InterfaceC01180n interfaceC01180n) {
        if (this.A00.A04 != null) {
            this.A00.A09 = true;
            C0600Kn.A00(new TV(this));
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01190o
    public final void A0G(K5 k5) {
        C0600Kn.A00(new TU(this, k5));
    }
}
