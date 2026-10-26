package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.source.TrackGroup;

/* renamed from: com.facebook.ads.redexgen.X.bG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1070bG implements HP {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final HZ A06;
    public final IM A07;

    public C1070bG(HZ hz) {
        this(hz, 10000, 25000, 25000, 0.75f, 0.75f, 2000L, IM.A00);
    }

    public C1070bG(HZ hz, int i, int i2, int i3, float f, float f2, long j, IM im) {
        this.A06 = hz;
        this.A03 = i;
        this.A02 = i2;
        this.A04 = i3;
        this.A00 = f;
        this.A01 = f2;
        this.A05 = j;
        this.A07 = im;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.HP
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final BN A4T(TrackGroup trackGroup, int... iArr) {
        return new BN(trackGroup, iArr, this.A06, this.A03, this.A02, this.A04, this.A00, this.A01, this.A05, this.A07);
    }
}
