package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.View;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class TS extends AbstractC01190o {
    public static byte[] A03;
    public View A00;
    public final C02254s A01;
    public final EY A02;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 57);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A03 = new byte[]{-122, -92, -79, -79, -78, -73, 99, -77, -75, -88, -74, -88, -79, -73, 99, -79, -72, -81, -81, 99, -92, -89, -103, -84, -88, -70};
    }

    public TS(C02254s c02254s) {
        this.A02 = c02254s.A09();
        this.A01 = c02254s;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01190o
    public final void A0C() {
        this.A02.A0A().A3d();
        C0600Kn.A00(new TQ(this));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01190o
    public final void A0D() {
        this.A02.A0A().A3g();
        C0600Kn.A00(new TR(this));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01190o
    public final void A0E(View view) {
        final TS ts = this;
        View view2 = null;
        FZ fzA08 = null;
        final C0674Nm c0674Nm = null;
        char c2 = view != null ? (char) 2 : (char) 15;
        while (true) {
            switch (c2) {
                case 2:
                    ts = ts;
                    view = view;
                    ts.A02.A0A().A3f();
                    ts.A00 = view;
                    ts.A01.A07().removeAllViews();
                    ts.A01.A07().addView(ts.A00);
                    if (!(ts.A00 instanceof C1004aC)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    ts = ts;
                    KD.A03(ts.A01.A05(), ts.A00, ts.A01.A0A());
                    c2 = 4;
                    break;
                case 4:
                    ts = ts;
                    fzA08 = ts.A01.A08();
                    if (fzA08 == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    fzA08 = fzA08;
                    fzA08.A0H();
                    c2 = 6;
                    break;
                case 6:
                    ts = ts;
                    C0600Kn.A00(new TP(ts));
                    C02254s c02254s = ts.A01;
                    c02254s.A0B(c02254s.A07(), ts.A00);
                    if (Build.VERSION.SDK_INT < 18) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    ts = ts;
                    if (!JQ.A0m(ts.A01.A07().getContext())) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    ts = ts;
                    c0674Nm = new C0674Nm();
                    ts.A01.A0C(c0674Nm);
                    c0674Nm.A0C(ts.A01.getPlacementId());
                    c0674Nm.A0B(ts.A01.A07().getContext().getPackageName());
                    if (ts.A01.A08() == null) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    ts = ts;
                    if (ts.A01.A08().A0F() == null) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    ts = ts;
                    c0674Nm = c0674Nm;
                    c0674Nm.A09(ts.A01.A08().A0F().A0C());
                    c2 = 11;
                    break;
                case 11:
                    ts = ts;
                    view2 = ts.A00;
                    if (!(view2 instanceof C1004aC)) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    c0674Nm = c0674Nm;
                    view2 = view2;
                    c0674Nm.A0A(((C1004aC) view2).getViewabilityChecker());
                    c2 = '\r';
                    break;
                case '\r':
                    ts = ts;
                    c0674Nm = c0674Nm;
                    ts.A00.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.facebook.ads.redexgen.X.51
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view3) {
                            if (this.A00.A00 != null) {
                                c0674Nm.setBounds(0, 0, this.A00.A00.getWidth(), this.A00.A00.getHeight());
                                c0674Nm.A0D(!r1.A0E());
                            }
                            return true;
                        }
                    });
                    ts.A00.getOverlay().add(c0674Nm);
                    c2 = 14;
                    break;
                case 14:
                    return;
                case 15:
                    throw new IllegalStateException(A02(0, 26, 10));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01190o
    public final void A0F(InterfaceC01180n interfaceC01180n) {
        TS ts = this;
        boolean z = false;
        RI riA0A = ts.A02.A0A();
        char c2 = ts.A01.A08() != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    ts = ts;
                    riA0A = riA0A;
                    riA0A.A3e(z);
                    if (ts.A01.A08() == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    ts = ts;
                    ts.A01.A08().A0I();
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01190o
    public final void A0G(K5 k5) {
        this.A02.A0A().A2c(C0627Lq.A01(this.A01.A04()), k5.A04().getErrorCode(), k5.A05());
        C0600Kn.A00(new TO(this, k5));
    }
}
