package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class GF {
    public final int A00;
    public final int A01;
    public final List<GH> A02;
    public final List<GM> A03;
    public final List<GH> A04;

    public GF(int i, int i2, List<GM> list, List<GH> list2, List<GH> list3) {
        List<GH> listUnmodifiableList;
        List<GH> listUnmodifiableList2;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = Collections.unmodifiableList(list);
        if (list2 == null) {
            listUnmodifiableList = Collections.emptyList();
        } else {
            listUnmodifiableList = Collections.unmodifiableList(list2);
        }
        this.A02 = listUnmodifiableList;
        if (list3 == null) {
            listUnmodifiableList2 = Collections.emptyList();
        } else {
            listUnmodifiableList2 = Collections.unmodifiableList(list3);
        }
        this.A04 = listUnmodifiableList2;
    }
}
