package com.facebook.ads.redexgen.X;

import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.2B, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C2B extends C0452Eq implements View.OnTouchListener {
    public static byte[] A07;
    public int A00;
    public T2 A01;
    public InterfaceC0695Oh A02;
    public boolean A03;
    public boolean A04;
    public int A05;
    public final int A06;

    static {
        A08();
    }

    public static String A07(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 45);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A08() {
        A07 = new byte[]{55, 10, 5, 20, 54, 1, 7, 29, 7, 8, 1, 22, 50, 13, 1, 19, 68, 11, 10, 8, 29, 68, 23, 17, 20, 20, 11, 22, 16, 23, 68, 40, 13, 10, 1, 5, 22, 40, 5, 29, 11, 17, 16, 41, 5, 10, 5, 3, 1, 22};
    }

    public C2B(XI xi) {
        super(xi);
        this.A05 = 0;
        this.A00 = 0;
        this.A03 = true;
        this.A04 = false;
        this.A06 = A03();
        setOnTouchListener(this);
    }

    public C2B(XI xi, AttributeSet attributeSet) {
        super(xi, attributeSet);
        this.A05 = 0;
        this.A00 = 0;
        this.A03 = true;
        this.A04 = false;
        this.A06 = A03();
        setOnTouchListener(this);
    }

    public C2B(XI xi, AttributeSet attributeSet, int i) {
        super(xi, attributeSet, i);
        this.A05 = 0;
        this.A00 = 0;
        this.A03 = true;
        this.A04 = false;
        this.A06 = A03();
        setOnTouchListener(this);
    }

    private int A03() {
        return ((int) getContext().getResources().getDisplayMetrics().density) * 10;
    }

    private int A04(int i) {
        int i2 = this.A00 - i;
        int iA6o = this.A02.A6o(i2);
        int i3 = this.A06;
        char c2 = i2 > i3 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    C2B c2b = this;
                    return c2b.A06(c2b.A05, iA6o);
                case 3:
                    if (i2 >= (-i3)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    C2B c2b2 = this;
                    return c2b2.A05(c2b2.A05, iA6o);
                case 5:
                    return this.A05;
            }
        }
    }

    private int A05(int i, int i2) {
        return Math.max(i - i2, 0);
    }

    private int A06(int i, int i2) {
        return Math.min(i + i2, getItemCount() - 1);
    }

    public void A20(int i, boolean z) {
        C2B c2b = this;
        char c2 = c2b.getAdapter() == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c2b = c2b;
                    c2b.A05 = i;
                    if (!z) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c2b = c2b;
                    c2b.A1U(i);
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    c2b = c2b;
                    c2b.A1T(i);
                    c2 = 5;
                    break;
            }
        }
    }

    public int getCurrentPosition() {
        return this.A05;
    }

    private int getItemCount() {
        C2B c2b = this;
        int iA0D = 0;
        char c2 = c2b.getAdapter() == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    iA0D = 0;
                    c2 = 3;
                    break;
                case 3:
                    return iA0D;
                case 4:
                    c2b = c2b;
                    iA0D = c2b.getAdapter().A0D();
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C2B c2b = this;
        int rawX = (int) motionEvent.getRawX();
        int actionMasked = motionEvent.getActionMasked();
        boolean z = false;
        int newPosition = actionMasked != 1 ? 2 : 5;
        while (true) {
            switch (newPosition) {
                case 2:
                    if (actionMasked == 6) {
                        newPosition = 5;
                        break;
                    } else {
                        newPosition = 3;
                        break;
                    }
                case 3:
                    if (actionMasked == 3) {
                        newPosition = 5;
                        break;
                    } else {
                        newPosition = 4;
                        break;
                    }
                case 4:
                    if (actionMasked != 4) {
                        newPosition = 8;
                        break;
                    } else {
                        newPosition = 5;
                        break;
                    }
                case 5:
                    c2b = c2b;
                    if (!c2b.A04) {
                        newPosition = 7;
                        break;
                    } else {
                        newPosition = 6;
                        break;
                    }
                case 6:
                    c2b = c2b;
                    int newPosition2 = c2b.A04(rawX);
                    c2b.A20(newPosition2, true);
                    newPosition = 7;
                    break;
                case 7:
                    C2B c2b2 = c2b;
                    c2b2.A03 = true;
                    c2b2.A04 = false;
                    return true;
                case 8:
                    if (actionMasked == 0) {
                        newPosition = 12;
                        break;
                    } else {
                        newPosition = 9;
                        break;
                    }
                case 9:
                    if (actionMasked == 5) {
                        newPosition = 12;
                        break;
                    } else {
                        newPosition = 10;
                        break;
                    }
                case 10:
                    c2b = c2b;
                    if (!c2b.A03) {
                        newPosition = 15;
                        break;
                    } else {
                        newPosition = 11;
                        break;
                    }
                case 11:
                    if (actionMasked != 2) {
                        newPosition = 15;
                        break;
                    } else {
                        newPosition = 12;
                        break;
                    }
                case 12:
                    c2b = c2b;
                    c2b.A00 = rawX;
                    if (!c2b.A03) {
                        newPosition = 14;
                        break;
                    } else {
                        newPosition = 13;
                        break;
                    }
                case 13:
                    c2b = c2b;
                    z = false;
                    c2b.A03 = false;
                    newPosition = 14;
                    break;
                case 14:
                    c2b = c2b;
                    c2b.A04 = true;
                    newPosition = 15;
                    break;
                case 15:
                    return z;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0452Eq
    public void setLayoutManager(C4G c4g) {
        if (c4g instanceof T2) {
            super.setLayoutManager(c4g);
            this.A01 = (T2) c4g;
            return;
        }
        throw new IllegalArgumentException(A07(0, 50, 73));
    }

    public void setSnapDelegate(InterfaceC0695Oh interfaceC0695Oh) {
        this.A02 = interfaceC0695Oh;
    }
}
