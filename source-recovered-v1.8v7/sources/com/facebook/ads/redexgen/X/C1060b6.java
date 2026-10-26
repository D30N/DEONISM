package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.b6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1060b6 implements GY {
    public final List<GX> A00;

    public C1060b6(List<GX> list) {
        this.A00 = list;
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final List<GX> A5q(long j) {
        C1060b6 c1060b6 = this;
        List<GX> listEmptyList = null;
        char c2 = j >= 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c1060b6 = c1060b6;
                    listEmptyList = c1060b6.A00;
                    c2 = 3;
                    break;
                case 3:
                    return listEmptyList;
                case 4:
                    listEmptyList = Collections.emptyList();
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final long A6E(int i) {
        boolean z = false;
        char c2 = i == 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    IJ.A03(z);
                    return 0L;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final int A6F() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final int A6Z(long j) {
        int i = 0;
        char c2 = j < 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i = 0;
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
