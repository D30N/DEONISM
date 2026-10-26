package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class Ca {
    public int A00;
    public final C0544Ii A01 = new C0544Ii(8);

    private long A00(CD cd) throws InterruptedException, IOException {
        Ca ca = this;
        int i = 0;
        int length = 0;
        int i2 = 0;
        int i3 = 0;
        cd.ABf(ca.A01.A00, 0, 1);
        int i4 = ca.A01.A00[0] & 255;
        char c2 = i4 == 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return Long.MIN_VALUE;
                case 3:
                    i2 = 128;
                    i3 = 0;
                    c2 = 4;
                    break;
                case 4:
                    if ((i4 & i2) != 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    i2 >>= 1;
                    i3++;
                    c2 = 4;
                    break;
                case 6:
                    ca = ca;
                    cd = cd;
                    i = i4 & (i2 ^ (-1));
                    cd.ABf(ca.A01.A00, 1, i3);
                    length = 0;
                    c2 = 7;
                    break;
                case 7:
                    if (length >= i3) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    ca = ca;
                    i = (i << 8) + (ca.A01.A00[length + 1] & 255);
                    length++;
                    c2 = 7;
                    break;
                case '\t':
                    ca.A00 += i3 + 1;
                    return i;
            }
        }
    }

    public final boolean A01(CD cd) throws InterruptedException, IOException {
        CD cd2 = cd;
        Ca ca = this;
        int i = 0;
        int i2 = 0;
        long j = 0;
        long jA00 = 0;
        long jA0M = 0;
        int i3 = 0;
        boolean z = false;
        long jA002 = 0;
        boolean z2 = false;
        long j2 = 0;
        long j3 = 0;
        Ca ca2 = ca;
        CD cd3 = cd2;
        long jA6U = cd2.A6U();
        long j4 = 1024;
        int i4 = jA6U != -1 ? 2 : 3;
        while (true) {
            switch (i4) {
                case 2:
                    if (jA6U <= j4) {
                        i4 = 8;
                        break;
                    } else {
                        i4 = 3;
                        break;
                    }
                case 3:
                    ca2 = ca2;
                    cd3 = cd3;
                    i2 = (int) j4;
                    z = false;
                    cd3.ABf(ca2.A01.A00, 0, 4);
                    jA0M = ca2.A01.A0M();
                    ca2.A00 = 4;
                    i4 = 4;
                    break;
                case 4:
                    i3 = 1;
                    if (jA0M == 440786851) {
                        i4 = 9;
                        break;
                    } else {
                        i4 = 5;
                        break;
                    }
                case 5:
                    ca2 = ca2;
                    int i5 = ca2.A00 + i3;
                    ca2.A00 = i5;
                    if (i5 != i2) {
                        i4 = 7;
                        break;
                    } else {
                        i4 = 6;
                        break;
                    }
                case 6:
                    return z;
                case 7:
                    ca2 = ca2;
                    cd3 = cd3;
                    cd3.ABf(ca2.A01.A00, z ? 1 : 0, i3);
                    jA0M = ((jA0M << 8) & (-256)) | (ca2.A01.A00[z ? 1 : 0] & 255);
                    i4 = 4;
                    break;
                case 8:
                    j4 = jA6U;
                    i4 = 3;
                    break;
                case 9:
                    ca = ca;
                    cd2 = cd2;
                    ca2 = ca2;
                    jA002 = ca.A00(cd2);
                    j2 = ca2.A00;
                    j = Long.MIN_VALUE;
                    if (jA002 == Long.MIN_VALUE) {
                        i4 = 12;
                        break;
                    } else {
                        i4 = 10;
                        break;
                    }
                case 10:
                    if (jA6U == -1) {
                        i4 = 13;
                        break;
                    } else {
                        i4 = 11;
                        break;
                    }
                case 11:
                    if (j2 + jA002 < jA6U) {
                        i4 = 13;
                        break;
                    } else {
                        i4 = 12;
                        break;
                    }
                case 12:
                    return false;
                case 13:
                    ca2 = ca2;
                    i = ca2.A00;
                    if (i >= j2 + jA002) {
                        i4 = 22;
                        break;
                    } else {
                        i4 = 14;
                        break;
                    }
                case 14:
                    ca = ca;
                    cd2 = cd2;
                    if (ca.A00(cd2) != j) {
                        i4 = 16;
                        break;
                    } else {
                        i4 = 15;
                        break;
                    }
                case 15:
                    return z;
                case 16:
                    ca = ca;
                    cd2 = cd2;
                    jA00 = ca.A00(cd2);
                    j3 = 0;
                    if (jA00 < 0) {
                        i4 = 18;
                        break;
                    } else {
                        i4 = 17;
                        break;
                    }
                case 17:
                    if (jA00 <= 2147483647L) {
                        i4 = 19;
                        break;
                    } else {
                        i4 = 18;
                        break;
                    }
                case 18:
                    return false;
                case 19:
                    if (jA00 == j3) {
                        i4 = 21;
                        break;
                    } else {
                        i4 = 20;
                        break;
                    }
                case 20:
                    ca2 = ca2;
                    cd3 = cd3;
                    int i6 = (int) jA00;
                    cd3.A3L(i6);
                    ca2.A00 += i6;
                    i4 = 21;
                    break;
                case 21:
                    cd2 = cd2;
                    cd3 = cd2;
                    z = false;
                    i4 = 13;
                    break;
                case 22:
                    if (i != j2 + jA002) {
                        i4 = 25;
                        break;
                    } else {
                        i4 = 23;
                        break;
                    }
                case 23:
                    z2 = true;
                    i4 = 24;
                    break;
                case 24:
                    return z2;
                case 25:
                    z2 = false;
                    i4 = 24;
                    break;
            }
        }
    }
}
