package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class HU {
    public final int A00;
    public final HR A01;
    public final Object A02;
    public final AV[] A03;

    public HU(AV[] avArr, HQ[] hqArr, Object obj) {
        this.A03 = avArr;
        this.A01 = new HR(hqArr);
        this.A02 = obj;
        this.A00 = avArr.length;
    }

    public final boolean A00(int i) {
        boolean z = false;
        char c2 = this.A03[i] != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    public final boolean A01(HU hu) {
        HU hu2 = this;
        int i = 0;
        char c2 = hu != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    hu2 = hu2;
                    hu = hu;
                    if (hu.A01.A01 == hu2.A01.A01) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return false;
                case 4:
                    i = 0;
                    c2 = 5;
                    break;
                case 5:
                    hu2 = hu2;
                    if (i >= hu2.A01.A01) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    hu2 = hu2;
                    hu = hu;
                    if (!hu2.A02(hu, i)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 7:
                    return false;
                case '\b':
                    i++;
                    c2 = 5;
                    break;
                case '\t':
                    return true;
            }
        }
    }

    public final boolean A02(HU hu, int i) {
        HU hu2 = this;
        boolean z = false;
        char c2 = hu == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return false;
                case 3:
                    hu2 = hu2;
                    hu = hu;
                    if (!C0560Iy.A0j(hu2.A03[i], hu.A03[i])) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    hu2 = hu2;
                    hu = hu;
                    if (!C0560Iy.A0j(hu2.A01.A00(i), hu.A01.A00(i))) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    z = true;
                    c2 = 6;
                    break;
                case 6:
                    return z;
            }
        }
    }
}
