package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.3v, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C02033v {
    public int A00;
    public int A01;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public boolean A09;
    public boolean A0B = true;
    public int A02 = 0;
    public boolean A0A = false;
    public List<C4Y> A08 = null;

    private View A00() {
        C02033v c02033v = this;
        View view = null;
        C4H lp = null;
        int size = c02033v.A08.size();
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= size) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c02033v = c02033v;
                    view = c02033v.A08.get(i).A0H;
                    lp = (C4H) view.getLayoutParams();
                    if (!lp.A02()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i++;
                    c2 = 2;
                    break;
                case 5:
                    c02033v = c02033v;
                    lp = lp;
                    if (c02033v.A01 != lp.A00()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    View view2 = view;
                    c02033v.A02(view2);
                    return view2;
                case 7:
                    return (View) null;
            }
        }
    }

    private final View A01(View closest) {
        C02033v c02033v = this;
        View view = null;
        int iA00 = 0;
        C4H c4h = null;
        int size = c02033v.A08.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        int closestDistance = 2;
        while (true) {
            switch (closestDistance) {
                case 2:
                    if (i2 >= size) {
                        closestDistance = 9;
                        break;
                    } else {
                        closestDistance = 3;
                        break;
                    }
                case 3:
                    c02033v = c02033v;
                    closest = closest;
                    view = c02033v.A08.get(i2).A0H;
                    c4h = (C4H) view.getLayoutParams();
                    if (view == closest) {
                        closestDistance = 5;
                        break;
                    } else {
                        closestDistance = 4;
                        break;
                    }
                case 4:
                    c4h = c4h;
                    if (!c4h.A02()) {
                        closestDistance = 6;
                        break;
                    } else {
                        closestDistance = 5;
                        break;
                    }
                case 5:
                    i2++;
                    closestDistance = 2;
                    break;
                case 6:
                    c02033v = c02033v;
                    c4h = c4h;
                    iA00 = (c4h.A00() - c02033v.A01) * c02033v.A03;
                    if (iA00 >= 0) {
                        closestDistance = 7;
                        break;
                    } else {
                        closestDistance = 5;
                        break;
                    }
                case 7:
                    if (iA00 >= i) {
                        closestDistance = 5;
                        break;
                    } else {
                        closestDistance = 8;
                        break;
                    }
                case 8:
                    view = view;
                    view2 = view;
                    i = iA00;
                    if (iA00 != 0) {
                        closestDistance = 5;
                        break;
                    } else {
                        closestDistance = 9;
                        break;
                    }
                case 9:
                    return view2;
            }
        }
    }

    private final void A02(View view) {
        C02033v c02033v = this;
        View viewA01 = c02033v.A01(view);
        char c2 = viewA01 == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c02033v = c02033v;
                    c02033v.A01 = -1;
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    c02033v = c02033v;
                    viewA01 = viewA01;
                    c02033v.A01 = ((C4H) viewA01.getLayoutParams()).A00();
                    c2 = 3;
                    break;
            }
        }
    }

    public final View A03(C4O c4o) {
        if (this.A08 != null) {
            return A00();
        }
        View viewA0G = c4o.A0G(this.A01);
        this.A01 += this.A03;
        return viewA0G;
    }

    public final void A04() {
        A02(null);
    }

    public final boolean A05(C4V c4v) {
        boolean z = false;
        int i = this.A01;
        char c2 = i >= 0 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c4v = c4v;
                    if (i >= c4v.A03()) {
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
}
