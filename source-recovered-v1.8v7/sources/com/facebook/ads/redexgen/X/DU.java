package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class DU {
    public final int A00;
    public final String A01;
    public final List<DT> A02;
    public final byte[] A03;

    public DU(int i, String str, List<DT> list, byte[] bArr) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.A03 = bArr;
    }
}
