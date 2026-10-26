package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ap, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0366Ap extends T2 {
    public float A00;
    public int A01;
    public int A02;
    public C0367Aq A03;
    public int[] A04;
    public final XI A05;
    public final C0691Od A06;
    public final C0692Oe A07;

    public C0366Ap(XI xi, C0692Oe c0692Oe, C0691Od c0691Od) {
        super(xi);
        this.A02 = 0;
        this.A00 = 50.0f;
        this.A05 = xi;
        this.A07 = c0692Oe;
        this.A06 = c0691Od;
        this.A01 = -1;
        this.A03 = new C0367Aq(this, this.A05);
    }

    @Override // com.facebook.ads.redexgen.X.C4G
    public final void A1J(C4O c4o, C4V c4v, int i, int i2) {
        C4V c4v2 = c4v;
        C0366Ap c0366Ap = this;
        int[] iArr = null;
        View viewA1q = null;
        int childCount = 0;
        int[] iArr2 = null;
        int i3 = 0;
        int iA0W = 0;
        int[] iArrA02 = null;
        int size = 0;
        int size2 = 0;
        int i4 = 0;
        C0366Ap c0366Ap2 = c0366Ap;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        char c2 = mode == 1073741824 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0366Ap = c0366Ap;
                    if (c0366Ap.A2A() == 1) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (mode2 != 1073741824) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0366Ap = c0366Ap;
                    if (c0366Ap.A2A() != 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    super.A1J(c4o, c4v2, i, i2);
                    return;
                case 6:
                    c0366Ap2 = c0366Ap2;
                    size = View.MeasureSpec.getSize(i);
                    size2 = View.MeasureSpec.getSize(i2);
                    i3 = 0;
                    if (!c0366Ap2.A06.A01(c0366Ap2.A01)) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0366Ap2 = c0366Ap2;
                    iArrA02 = c0366Ap2.A06.A02(c0366Ap2.A01);
                    c2 = '\b';
                    break;
                case '\b':
                    if (mode != 1073741824) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    iArrA02 = iArrA02;
                    iArrA02[i3] = size;
                    c2 = '\n';
                    break;
                case '\n':
                    if (mode2 != 1073741824) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    iArrA02 = iArrA02;
                    iArrA02[1] = size2;
                    c2 = '\f';
                    break;
                case '\f':
                    int[] iArr3 = iArrA02;
                    c0366Ap.A13(iArr3[i3], iArr3[1]);
                    return;
                case '\r':
                    c4v2 = c4v2;
                    iArrA02 = new int[]{0, 0};
                    if (c4v2.A03() < 1) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    c0366Ap = c0366Ap;
                    if (c0366Ap.A0W() <= 0) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    iA0W = 1;
                    c2 = 16;
                    break;
                case 16:
                    i4 = 0;
                    c2 = 17;
                    break;
                case 17:
                    if (i4 >= iA0W) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    c0366Ap = c0366Ap;
                    viewA1q = c0366Ap.A1q(i4);
                    if (viewA1q != null) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    c0366Ap2 = c0366Ap2;
                    childCount = c0366Ap2.A01;
                    if (childCount == -1) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    c0366Ap2 = c0366Ap2;
                    iArrA02 = iArrA02;
                    c0366Ap2.A06.A00(childCount, iArrA02);
                    c2 = '\b';
                    break;
                case 21:
                    c0366Ap = c0366Ap;
                    c0366Ap2 = c0366Ap2;
                    viewA1q = viewA1q;
                    c0366Ap2.A04 = c0366Ap2.A07.A00(viewA1q, View.MeasureSpec.makeMeasureSpec(i3, i3), View.MeasureSpec.makeMeasureSpec(i3, i3));
                    if (c0366Ap.A2A() != 0) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    c0366Ap2 = c0366Ap2;
                    iArrA02 = iArrA02;
                    int i5 = iArrA02[i3];
                    iArr2 = c0366Ap2.A04;
                    iArrA02[i3] = i5 + iArr2[i3];
                    if (i4 != 0) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    c0366Ap = c0366Ap;
                    iArrA02 = iArrA02;
                    iArr2 = iArr2;
                    iArrA02[1] = iArr2[1] + c0366Ap.A0g() + c0366Ap.A0d();
                    c2 = 24;
                    break;
                case 24:
                    i4++;
                    c2 = 17;
                    break;
                case 25:
                    c0366Ap2 = c0366Ap2;
                    iArrA02 = iArrA02;
                    int i6 = iArrA02[1];
                    iArr = c0366Ap2.A04;
                    iArrA02[1] = i6 + iArr[1];
                    if (i4 != 0) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 26;
                        break;
                    }
                case 26:
                    c0366Ap = c0366Ap;
                    iArrA02 = iArrA02;
                    iArr = iArr;
                    iArrA02[i3] = iArr[i3] + c0366Ap.A0e() + c0366Ap.A0f();
                    c2 = 24;
                    break;
                case 27:
                    c0366Ap = c0366Ap;
                    iA0W = c0366Ap.A0W();
                    c2 = 16;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.T2, com.facebook.ads.redexgen.X.C4G
    public final void A1t(int i) {
        super.A2F(i, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.T2, com.facebook.ads.redexgen.X.C4G
    public final void A21(C0452Eq c0452Eq, C4V c4v, int i) {
        this.A03.A0A(i);
        A1L(this.A03);
    }

    public final void A2K(double d2) {
        double d3 = 0.0d;
        char c2 = d2 <= 0.0d ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    d3 = 1.0d;
                    c2 = 3;
                    break;
                case 3:
                    C0366Ap c0366Ap = this;
                    c0366Ap.A00 = (float) (50.0d / d3);
                    c0366Ap.A03 = new C0367Aq(c0366Ap, c0366Ap.A05);
                    return;
                case 4:
                    d3 = d2;
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A2L(int i) {
        this.A01 = i;
    }

    public final void A2M(int i) {
        this.A02 = i;
    }
}
