package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.It, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0555It {
    public static final Comparator<C0554Is> A07 = new C0552Iq();
    public static final Comparator<C0554Is> A08 = new C0553Ir();
    public int A01;
    public int A02;
    public int A03;
    public final int A04;
    public final C0554Is[] A06 = new C0554Is[5];
    public final ArrayList<C0554Is> A05 = new ArrayList<>();
    public int A00 = -1;

    public C0555It(int i) {
        this.A04 = i;
    }

    private void A00() {
        if (this.A00 != 1) {
            Collections.sort(this.A05, A07);
            this.A00 = 1;
        }
    }

    private void A01() {
        if (this.A00 != 0) {
            Collections.sort(this.A05, A08);
            this.A00 = 0;
        }
    }

    public final float A02(float f) {
        C0555It c0555It = this;
        float f2 = 0.0f;
        C0554Is c0554Is = null;
        c0555It.A01();
        float f3 = c0555It.A03 * f;
        int i = 0;
        int i2 = 0;
        int i3 = 2;
        while (true) {
            switch (i3) {
                case 2:
                    c0555It = c0555It;
                    int i4 = c0555It.A05.size();
                    if (i2 >= i4) {
                        i3 = 6;
                        break;
                    } else {
                        i3 = 3;
                        break;
                    }
                case 3:
                    c0555It = c0555It;
                    c0554Is = c0555It.A05.get(i2);
                    i += c0554Is.A02;
                    if (i < f3) {
                        i3 = 5;
                        break;
                    } else {
                        i3 = 4;
                        break;
                    }
                case 4:
                    return c0554Is.A00;
                case 5:
                    i2++;
                    i3 = 2;
                    break;
                case 6:
                    c0555It = c0555It;
                    if (!c0555It.A05.isEmpty()) {
                        i3 = 9;
                        break;
                    } else {
                        i3 = 7;
                        break;
                    }
                case 7:
                    f2 = Float.NaN;
                    i3 = 8;
                    break;
                case 8:
                    return f2;
                case 9:
                    c0555It = c0555It;
                    ArrayList<C0554Is> arrayList = c0555It.A05;
                    int i5 = arrayList.size();
                    f2 = arrayList.get(i5 - 1).A00;
                    i3 = 8;
                    break;
            }
        }
    }

    public final void A03(int excessWeight, float f) {
        C0555It c0555It = this;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        C0554Is c0554Is = null;
        C0554Is c0554Is2 = null;
        int i5 = 0;
        c0555It.A00();
        int i6 = c0555It.A02;
        char c2 = i6 > 0 ? (char) 2 : '\t';
        while (true) {
            switch (c2) {
                case 2:
                    c0555It = c0555It;
                    C0554Is[] c0554IsArr = c0555It.A06;
                    int i7 = i6 - 1;
                    c0555It.A02 = i7;
                    c0554Is2 = c0554IsArr[i7];
                    c2 = 3;
                    break;
                case 3:
                    c0555It = c0555It;
                    c0554Is2 = c0554Is2;
                    int i8 = c0555It.A01;
                    c0555It.A01 = i8 + 1;
                    c0554Is2.A01 = i8;
                    c0554Is2.A02 = excessWeight;
                    c0554Is2.A00 = f;
                    c0555It.A05.add(c0554Is2);
                    c0555It.A03 += excessWeight;
                    c2 = 4;
                    break;
                case 4:
                    c0555It = c0555It;
                    i5 = c0555It.A03;
                    i4 = c0555It.A04;
                    if (i5 <= i4) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0555It = c0555It;
                    i = i5 - i4;
                    i3 = 0;
                    c0554Is = c0555It.A05.get(0);
                    if (c0554Is.A02 > i) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0555It = c0555It;
                    c0554Is = c0554Is;
                    c0555It.A03 -= c0554Is.A02;
                    c0555It.A05.remove(i3);
                    i2 = c0555It.A02;
                    if (i2 >= 5) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0555It = c0555It;
                    c0554Is = c0554Is;
                    C0554Is[] c0554IsArr2 = c0555It.A06;
                    c0555It.A02 = i2 + 1;
                    c0554IsArr2[i2] = c0554Is;
                    c2 = 4;
                    break;
                case '\b':
                    c0555It = c0555It;
                    c0554Is = c0554Is;
                    c0554Is.A02 -= i;
                    c0555It.A03 -= i;
                    c2 = 4;
                    break;
                case '\t':
                    c0554Is2 = new C0554Is(null);
                    c2 = 3;
                    break;
                case '\n':
                    return;
            }
        }
    }
}
