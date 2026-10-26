package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.support.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;

/* loaded from: assets/audience_network.dex */
public final class B2 {

    @Nullable
    public final Handler A00;

    @Nullable
    public final B3 A01;

    public B2(@Nullable Handler handler, @Nullable B3 b3) {
        this.A00 = b3 != null ? (Handler) IJ.A01(handler) : null;
        this.A01 = b3;
    }

    public final void A01(int i) {
        if (this.A01 != null) {
            this.A00.post(new B1(this, i));
        }
    }

    public final void A02(int i, long j, long j2) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0376Az(this, i, j, j2));
        }
    }

    public final void A03(Format format) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0375Ay(this, format));
        }
    }

    public final void A04(BW bw) {
        if (this.A01 != null) {
            this.A00.post(new B0(this, bw));
        }
    }

    public final void A05(BW bw) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0373Aw(this, bw));
        }
    }

    public final void A06(String str, long j, long j2) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0374Ax(this, str, j, j2));
        }
    }
}
