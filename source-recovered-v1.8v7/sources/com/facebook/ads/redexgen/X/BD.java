package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.source.TrackGroup;

/* loaded from: assets/audience_network.dex */
public final class BD extends AbstractC1071bH {
    public final int A00;

    @Nullable
    public final Object A01;

    public BD(TrackGroup trackGroup, int i) {
        this(trackGroup, i, 0, null);
    }

    public BD(TrackGroup trackGroup, int i, int i2, @Nullable Object obj) {
        super(trackGroup, i);
        this.A00 = i2;
        this.A01 = obj;
    }

    @Override // com.facebook.ads.redexgen.X.HQ
    public final int A6x() {
        return 0;
    }
}
