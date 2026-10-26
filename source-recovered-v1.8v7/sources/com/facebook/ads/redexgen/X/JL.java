package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.Format;

/* loaded from: assets/audience_network.dex */
public final class JL {

    @Nullable
    public final Handler A00;

    @Nullable
    public final JM A01;

    public JL(@Nullable Handler handler, @Nullable JM jm) {
        this.A00 = jm != null ? (Handler) IJ.A01(handler) : null;
        this.A01 = jm;
    }

    public final void A01(int i, int i2, int i3, float f) {
        if (this.A01 != null) {
            this.A00.post(new JI(this, i, i2, i3, f));
        }
    }

    public final void A02(int i, long j) {
        if (this.A01 != null) {
            this.A00.post(new JH(this, i, j));
        }
    }

    public final void A03(Surface surface) {
        if (this.A01 != null) {
            this.A00.post(new JJ(this, surface));
        }
    }

    public final void A04(Format format) {
        if (this.A01 != null) {
            this.A00.post(new JG(this, format));
        }
    }

    public final void A05(BW bw) {
        if (this.A01 != null) {
            this.A00.post(new JK(this, bw));
        }
    }

    public final void A06(BW bw) {
        if (this.A01 != null) {
            this.A00.post(new JE(this, bw));
        }
    }

    public final void A07(String str, long j, long j2) {
        if (this.A01 != null) {
            this.A00.post(new JF(this, str, j, j2));
        }
    }
}
