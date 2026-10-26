package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class GJ {
    public final long A00;

    @Nullable
    public final String A01;
    public final List<GF> A02;
    public final List<GI> A03;

    public GJ(@Nullable String str, long j, List<GF> list, List<GI> list2) {
        this.A01 = str;
        this.A00 = j;
        this.A02 = Collections.unmodifiableList(list);
        this.A03 = Collections.unmodifiableList(list2);
    }
}
