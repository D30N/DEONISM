package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.4d, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02104d {
    public C02074a A00 = new C02074a();
    public final InterfaceC02084b A01;

    public C02104d(InterfaceC02084b interfaceC02084b) {
        this.A01 = interfaceC02084b;
    }

    public final View A00(int end, int i, int i2, int i3) {
        C02104d c02104d = this;
        View view = null;
        int childEnd = 0;
        View viewA5e = null;
        int i4 = 0;
        int iA6g = c02104d.A01.A6g();
        int iA6f = c02104d.A01.A6f();
        char c2 = i > end ? (char) 2 : '\f';
        while (true) {
            switch (c2) {
                case 2:
                    childEnd = 1;
                    c2 = 3;
                    break;
                case 3:
                    view = null;
                    i4 = end;
                    c2 = 4;
                    break;
                case 4:
                    if (i4 == i) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c02104d = c02104d;
                    viewA5e = c02104d.A01.A5e(i4);
                    c02104d.A00.A03(iA6g, iA6f, c02104d.A01.A5h(viewA5e), c02104d.A01.A5g(viewA5e));
                    if (i2 == 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c02104d = c02104d;
                    c02104d.A00.A01();
                    c02104d.A00.A02(i2);
                    if (!c02104d.A00.A04()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return viewA5e;
                case '\b':
                    if (i3 == 0) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c02104d = c02104d;
                    c02104d.A00.A01();
                    c02104d.A00.A02(i3);
                    if (!c02104d.A00.A04()) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    viewA5e = viewA5e;
                    view = viewA5e;
                    c2 = 11;
                    break;
                case 11:
                    i4 += childEnd;
                    c2 = 4;
                    break;
                case '\f':
                    childEnd = -1;
                    c2 = 3;
                    break;
                case '\r':
                    return view;
            }
        }
    }
}
