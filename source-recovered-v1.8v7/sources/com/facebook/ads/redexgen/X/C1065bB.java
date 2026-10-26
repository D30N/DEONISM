package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.bB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1065bB implements GY {
    public final C0507Gv A00;
    public final Map<String, H1> A01;
    public final Map<String, C0508Gw> A02;
    public final long[] A03;

    public C1065bB(C0507Gv c0507Gv, Map<String, H1> map, Map<String, C0508Gw> map2) {
        Map<String, H1> mapEmptyMap;
        this.A00 = c0507Gv;
        this.A02 = map2;
        if (map != null) {
            mapEmptyMap = Collections.unmodifiableMap(map);
        } else {
            mapEmptyMap = Collections.emptyMap();
        }
        this.A01 = mapEmptyMap;
        this.A03 = c0507Gv.A0F();
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final List<GX> A5q(long j) {
        return this.A00.A0D(j, this.A01, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final long A6E(int i) {
        return this.A03[i];
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final int A6F() {
        return this.A03.length;
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final int A6Z(long j) {
        int i = 0;
        int iA0A = C0560Iy.A0A(this.A03, j, false, false);
        char c2 = iA0A < this.A03.length ? (char) 2 : (char) 4;
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
