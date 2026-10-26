package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.1V, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C1V extends C2B implements InterfaceC0695Oh {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public MV A04;
    public boolean A05;
    public final C0366Ap A06;

    public C1V(XI xi) {
        super(xi);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new C0366Ap(xi, new C0692Oe(), new C0691Od());
        A01();
    }

    public C1V(XI xi, AttributeSet attributeSet) {
        super(xi, attributeSet);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new C0366Ap(xi, new C0692Oe(), new C0691Od());
        A01();
    }

    public C1V(XI xi, AttributeSet attributeSet, int i) {
        super(xi, attributeSet, i);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new C0366Ap(xi, new C0692Oe(), new C0691Od());
        A01();
    }

    private int A00(int availableWidth) {
        int i = this.A00 * 2;
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - i;
        int iA0D = getAdapter().A0D();
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        int itemSize = 2;
        while (true) {
            switch (itemSize) {
                case 2:
                    if (i3 <= availableWidth) {
                        itemSize = 6;
                        break;
                    } else {
                        itemSize = 3;
                        break;
                    }
                case 3:
                    i2++;
                    if (i2 < iA0D) {
                        itemSize = 5;
                        break;
                    } else {
                        itemSize = 4;
                        break;
                    }
                case 4:
                    return availableWidth;
                case 5:
                    int itemSize2 = i2 * i;
                    i3 = (int) ((measuredWidth - itemSize2) / (i2 + 0.333f));
                    itemSize = 2;
                    break;
                case 6:
                    return i3;
            }
        }
    }

    private void A01() {
        this.A06.A2E(0);
        setLayoutManager(this.A06);
        setSaveEnabled(false);
        setSnapDelegate(this);
        C0635Ly.A0N(this);
    }

    private void A02(int i, int i2) {
        C1V c1v = this;
        char c2 = i == c1v.A03 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c1v = c1v;
                    if (i2 != c1v.A02) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    c1v = c1v;
                    c1v.A03 = i;
                    c1v.A02 = i2;
                    if (c1v.A04 == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C2B
    public final void A20(int i, boolean z) {
        super.A20(i, z);
        A02(i, 0);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0695Oh
    public final int A6o(int i) {
        C1V c1v = this;
        int i2 = 0;
        int i3 = 0;
        int iAbs = Math.abs(i);
        char c2 = iAbs <= ((C2B) c1v).A06 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return 0;
                case 3:
                    c1v = c1v;
                    i2 = c1v.A01;
                    i3 = 1;
                    if (i2 != 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return i3;
                case 5:
                    i3 += iAbs / i2;
                    c2 = 4;
                    break;
            }
        }
    }

    public int getChildSpacing() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.C0452Eq, android.view.View
    public final void onMeasure(int i, int itemSize) {
        C1V c1v = this;
        int size = 0;
        int iA00 = 0;
        int i2 = 0;
        int mode = 0;
        super.onMeasure(i, itemSize);
        int paddingTop = c1v.getPaddingTop() + c1v.getPaddingBottom();
        char c2 = c1v.A05 ? (char) 2 : '\r';
        while (true) {
            switch (c2) {
                case 2:
                    c1v = c1v;
                    size = (((int) C0635Ly.A01) * JQ.A0B(c1v.getContext())) + paddingTop;
                    c2 = 3;
                    break;
                case 3:
                    mode = View.MeasureSpec.getMode(itemSize);
                    if (mode == Integer.MIN_VALUE) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (mode == 1073741824) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c1v = c1v;
                    i2 = size - paddingTop;
                    if (!c1v.A05) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    iA00 = Math.min(MS.A08, i2);
                    c2 = 7;
                    break;
                case 7:
                    c1v = c1v;
                    c1v.setMeasuredDimension(c1v.getMeasuredWidth(), iA00 + paddingTop);
                    if (!c1v.A05) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\b':
                    c1v = c1v;
                    c1v.setChildWidth((c1v.A00 * 2) + iA00);
                    c2 = '\t';
                    break;
                case '\t':
                    return;
                case '\n':
                    c1v = c1v;
                    iA00 = c1v.A00(i2);
                    c2 = 7;
                    break;
                case 11:
                    size = View.MeasureSpec.getSize(itemSize);
                    c2 = 5;
                    break;
                case '\f':
                    size = Math.min(View.MeasureSpec.getSize(itemSize), size);
                    c2 = 5;
                    break;
                case '\r':
                    c1v = c1v;
                    size = Math.round(c1v.getMeasuredWidth() / 1.91f);
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0452Eq
    public void setAdapter(@Nullable AnonymousClass44 anonymousClass44) {
        int iHashCode = 0;
        C0366Ap c0366Ap = this.A06;
        char c2 = anonymousClass44 == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    iHashCode = -1;
                    c2 = 3;
                    break;
                case 3:
                    c0366Ap.A2L(iHashCode);
                    super.setAdapter(anonymousClass44);
                    return;
                case 4:
                    anonymousClass44 = anonymousClass44;
                    iHashCode = anonymousClass44.hashCode();
                    c2 = 3;
                    break;
            }
        }
    }

    public void setChildSpacing(int i) {
        this.A00 = i;
    }

    public void setChildWidth(int i) {
        this.A01 = i;
        int measuredWidth = getMeasuredWidth();
        this.A06.A2M((((measuredWidth - getPaddingLeft()) - getPaddingRight()) - this.A01) / 2);
        this.A06.A2K(this.A01 / measuredWidth);
    }

    public void setCurrentPosition(int i) {
        A20(i, false);
    }

    public void setOnPageChangedListener(MV mv) {
        this.A04 = mv;
    }

    public void setShowTextInCarousel(boolean z) {
        this.A05 = z;
    }
}
