package com.facebook.ads.redexgen.X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import d.b.a.b.k;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.3t, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C02013t {
    public static byte[] A05;
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final /* synthetic */ T2 A04;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 15);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A05 = new byte[]{77, 65, -114, 119, -126, -115, -118, -123, 94, -120, 124, -55, -97, -53, -53, -50, -64, -59, -54, -67, -48, -63, -103, 80, 125, 114, 119, 126, -127, 88, 125, 117, 126, -118, 124, 95, 126, -126, 120, -125, 120, 126, 125, 76, -80, -92, -15, -48, -27, -3, -13, -7, -8, -54, -10, -13, -15, -55, -14, -24, -63};
    }

    public C02013t(T2 t2) {
        this.A04 = t2;
        A03();
    }

    public final void A02() {
        C02013t c02013t = this;
        int iA0A = 0;
        char c2 = c02013t.A02 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c02013t = c02013t;
                    iA0A = c02013t.A04.A04.A07();
                    c2 = 3;
                    break;
                case 3:
                    c02013t.A00 = iA0A;
                    return;
                case 4:
                    c02013t = c02013t;
                    iA0A = c02013t.A04.A04.A0A();
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A03() {
        this.A01 = -1;
        this.A00 = RecyclerView.UNDEFINED_DURATION;
        this.A02 = false;
        this.A03 = false;
    }

    public final void A04(View view) {
        C02013t c02013t = this;
        char c2 = c02013t.A02 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c02013t = c02013t;
                    view = view;
                    c02013t.A00 = c02013t.A04.A04.A0C(view) + c02013t.A04.A04.A05();
                    c2 = 3;
                    break;
                case 3:
                    C02013t c02013t2 = c02013t;
                    c02013t2.A01 = c02013t2.A04.A0p(view);
                    return;
                case 4:
                    c02013t = c02013t;
                    view = view;
                    c02013t.A00 = c02013t.A04.A04.A0F(view);
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A05(View view) {
        C02013t c02013t = this;
        int endMargin = 0;
        int childEnd = 0;
        int estimatedEnd = 0;
        int estimatedChildStart = 0;
        int iA07 = 0;
        int iA05 = c02013t.A04.A04.A05();
        int endReference = iA05 >= 0 ? 2 : 3;
        while (true) {
            switch (endReference) {
                case 2:
                    c02013t.A04(view);
                    return;
                case 3:
                    c02013t = c02013t;
                    view = view;
                    c02013t.A01 = c02013t.A04.A0p(view);
                    if (!c02013t.A02) {
                        endReference = 8;
                        break;
                    } else {
                        endReference = 4;
                        break;
                    }
                case 4:
                    c02013t = c02013t;
                    view = view;
                    iA07 = (c02013t.A04.A04.A07() - iA05) - c02013t.A04.A04.A0C(view);
                    c02013t.A00 = c02013t.A04.A04.A07() - iA07;
                    if (iA07 <= 0) {
                        endReference = 7;
                        break;
                    } else {
                        endReference = 5;
                        break;
                    }
                case 5:
                    c02013t = c02013t;
                    view = view;
                    int endReference2 = c02013t.A04.A04.A0D(view);
                    int previousEndMargin = c02013t.A00;
                    int estimatedChildStart2 = previousEndMargin - endReference2;
                    int iA0A = c02013t.A04.A04.A0A();
                    int layoutStart = c02013t.A04.A04.A0F(view);
                    estimatedChildStart = estimatedChildStart2 - (Math.min(layoutStart - iA0A, 0) + iA0A);
                    if (estimatedChildStart >= 0) {
                        endReference = 7;
                        break;
                    } else {
                        endReference = 6;
                        break;
                    }
                case 6:
                    c02013t = c02013t;
                    c02013t.A00 += Math.min(iA07, -estimatedChildStart);
                    endReference = 7;
                    break;
                case 7:
                    return;
                case 8:
                    c02013t = c02013t;
                    view = view;
                    estimatedEnd = c02013t.A04.A04.A0F(view);
                    int startMargin = c02013t.A04.A04.A0A();
                    childEnd = estimatedEnd - startMargin;
                    c02013t.A00 = estimatedEnd;
                    if (childEnd <= 0) {
                        endReference = 7;
                        break;
                    } else {
                        endReference = 9;
                        break;
                    }
                case 9:
                    c02013t = c02013t;
                    view = view;
                    int iA0D = c02013t.A04.A04.A0D(view) + estimatedEnd;
                    int iA072 = c02013t.A04.A04.A07() - iA05;
                    int previousLayoutEnd = c02013t.A04.A04.A0C(view);
                    endMargin = (c02013t.A04.A04.A07() - Math.min(0, iA072 - previousLayoutEnd)) - iA0D;
                    if (endMargin >= 0) {
                        endReference = 7;
                        break;
                    } else {
                        endReference = 10;
                        break;
                    }
                case 10:
                    c02013t = c02013t;
                    int startMargin2 = -endMargin;
                    c02013t.A00 -= Math.min(childEnd, startMargin2);
                    endReference = 7;
                    break;
            }
        }
    }

    public final boolean A06(View view, C4V c4v) {
        boolean z = false;
        C4H c4h = (C4H) view.getLayoutParams();
        char c2 = !c4h.A02() ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    c4h = c4h;
                    if (c4h.A00() < 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c4v = c4v;
                    c4h = c4h;
                    if (c4h.A00() >= c4v.A03()) {
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

    public final String toString() {
        return A00(23, 21, 0) + this.A01 + A00(9, 14, 77) + this.A00 + A00(44, 17, k.AppCompatTheme_windowActionModeOverlay) + this.A02 + A00(0, 9, 18) + this.A03 + '}';
    }
}
