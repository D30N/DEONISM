package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.4a, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C02074a {
    public int A00 = 0;
    public int A01;
    public int A02;
    public int A03;
    public int A04;

    private final int A00(int i, int i2) {
        char c2 = i > i2 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return 1;
                case 3:
                    if (i != i2) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return 2;
                case 5:
                    return 4;
            }
        }
    }

    public final void A01() {
        this.A00 = 0;
    }

    public final void A02(int i) {
        this.A00 |= i;
    }

    public final void A03(int i, int i2, int i3, int i4) {
        this.A04 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A01 = i4;
    }

    public final boolean A04() {
        C02074a c02074a = this;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = c02074a.A00;
        boolean z = false;
        char c2 = (i4 & 7) != 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c02074a = c02074a;
                    z = false;
                    if (((c02074a.A00(c02074a.A02, c02074a.A04) << 0) & i4) != 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return z;
                case 4:
                    c02074a = c02074a;
                    i3 = c02074a.A00;
                    if ((i3 & 112) == 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c02074a = c02074a;
                    if (((c02074a.A00(c02074a.A02, c02074a.A03) << 4) & i3) != 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return z;
                case 7:
                    c02074a = c02074a;
                    i2 = c02074a.A00;
                    if ((i2 & 1792) == 0) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c02074a = c02074a;
                    if (((c02074a.A00(c02074a.A01, c02074a.A04) << 8) & i2) != 0) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    return z;
                case '\n':
                    c02074a = c02074a;
                    i = c02074a.A00;
                    if ((i & 28672) == 0) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c02074a = c02074a;
                    if (((c02074a.A00(c02074a.A01, c02074a.A03) << 12) & i) != 0) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    return z;
                case '\r':
                    return true;
            }
        }
    }
}
