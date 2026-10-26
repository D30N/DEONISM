package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;

/* loaded from: assets/audience_network.dex */
public final class AG {
    public final int A00;
    public final long A01;
    public final long A02;
    public final AbstractC0352Ab A03;
    public final F8 A04;
    public final TrackGroupArray A05;
    public final HU A06;

    @Nullable
    public final Object A07;
    public final boolean A08;
    public volatile long A09;
    public volatile long A0A;

    public AG(AbstractC0352Ab abstractC0352Ab, long j, TrackGroupArray trackGroupArray, HU hu) {
        this(abstractC0352Ab, null, new F8(0), j, -9223372036854775807L, 1, false, trackGroupArray, hu);
    }

    public AG(AbstractC0352Ab abstractC0352Ab, @Nullable Object obj, F8 f8, long j, long j2, int i, boolean z, TrackGroupArray trackGroupArray, HU hu) {
        this.A03 = abstractC0352Ab;
        this.A07 = obj;
        this.A04 = f8;
        this.A02 = j;
        this.A01 = j2;
        this.A0A = j;
        this.A09 = j;
        this.A00 = i;
        this.A08 = z;
        this.A05 = trackGroupArray;
        this.A06 = hu;
    }

    public static void A00(AG ag, AG ag2) {
        ag2.A0A = ag.A0A;
        ag2.A09 = ag.A09;
    }

    public final AG A01(int i) {
        AG ag = new AG(this.A03, this.A07, this.A04.A00(i), this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, ag);
        return ag;
    }

    public final AG A02(int i) {
        AG ag = new AG(this.A03, this.A07, this.A04, this.A02, this.A01, i, this.A08, this.A05, this.A06);
        A00(this, ag);
        return ag;
    }

    public final AG A03(AbstractC0352Ab abstractC0352Ab, Object obj) {
        AG ag = new AG(abstractC0352Ab, obj, this.A04, this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, ag);
        return ag;
    }

    public final AG A04(F8 f8, long j, long j2) {
        long j3 = j2;
        AbstractC0352Ab abstractC0352Ab = this.A03;
        Object obj = this.A07;
        if (!f8.A01()) {
            j3 = -9223372036854775807L;
        }
        return new AG(abstractC0352Ab, obj, f8, j, j3, this.A00, this.A08, this.A05, this.A06);
    }

    public final AG A05(TrackGroupArray trackGroupArray, HU hu) {
        AG ag = new AG(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, this.A08, trackGroupArray, hu);
        A00(this, ag);
        return ag;
    }

    public final AG A06(boolean z) {
        AG ag = new AG(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, z, this.A05, this.A06);
        A00(this, ag);
        return ag;
    }
}
