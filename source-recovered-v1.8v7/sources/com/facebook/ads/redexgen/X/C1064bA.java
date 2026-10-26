package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.bA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1064bA implements GY {
    public final long[] A00;
    public final GX[] A01;

    public C1064bA(GX[] gxArr, long[] jArr) {
        this.A01 = gxArr;
        this.A00 = jArr;
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final List<GX> A5q(long j) {
        C1064bA c1064bA = this;
        GX[] gxArr = null;
        int iA0B = C0560Iy.A0B(c1064bA.A00, j, true, false);
        char c2 = iA0B != -1 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c1064bA = c1064bA;
                    gxArr = c1064bA.A01;
                    if (gxArr[iA0B] != null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return Collections.emptyList();
                case 4:
                    return Collections.singletonList(gxArr[iA0B]);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final long A6E(int i) {
        C1064bA c1064bA = this;
        boolean z = false;
        boolean z2 = true;
        char c2 = i >= 0 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    c1064bA = c1064bA;
                    IJ.A03(z);
                    if (i >= c1064bA.A00.length) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    IJ.A03(z2);
                    return c1064bA.A00[i];
                case 5:
                    z2 = false;
                    c2 = 4;
                    break;
                case 6:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final int A6F() {
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final int A6Z(long j) {
        int i = 0;
        int iA0A = C0560Iy.A0A(this.A00, j, false, false);
        char c2 = iA0A < this.A00.length ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i = iA0A;
                    c2 = 3;
                    break;
                case 3:
                    return i;
                case 4:
                    i = -1;
                    c2 = 3;
                    break;
            }
        }
    }
}
