package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Yn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0957Yn implements E2 {
    @Override // com.facebook.ads.redexgen.X.E2
    public final boolean A4x(int i, int i2, int i3, int i4, int i5) {
        int i6 = 0;
        boolean z = false;
        char c2 = i2 == 67 ? (char) 2 : '\b';
        while (true) {
            switch (c2) {
                case 2:
                    if (i3 != 79) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    i6 = 77;
                    if (i4 != 77) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i5 == i6) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i != 2) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    z = true;
                    c2 = 7;
                    break;
                case 7:
                    return z;
                case '\b':
                    z = false;
                    c2 = 7;
                    break;
            }
        }
    }
}
