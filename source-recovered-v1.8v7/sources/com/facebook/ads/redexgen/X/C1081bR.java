package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.support.annotation.Nullable;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.bR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1081bR implements HZ, InterfaceC0535Hz<Object> {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;

    @Nullable
    public final Handler A06;

    @Nullable
    public final HY A07;
    public final IM A08;
    public final C0555It A09;

    public C1081bR() {
        this(null, null, 1000000L, AdError.SERVER_ERROR_CODE, IM.A00);
    }

    public C1081bR(@Nullable Handler handler, @Nullable HY hy, long j, int i, IM im) {
        this.A06 = handler;
        this.A07 = hy;
        this.A09 = new C0555It(i);
        this.A08 = im;
        this.A01 = j;
    }

    private void A01(int i, long j, long j2) {
        Handler handler = this.A06;
        if (handler != null && this.A07 != null) {
            handler.post(new Hj(this, i, j, j2));
        }
    }

    @Override // com.facebook.ads.redexgen.X.HZ
    public final synchronized long A5S() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Hz
    public final synchronized void A96(Object obj, int i) {
        this.A02 += i;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Hz
    public final synchronized void ABE(Object obj) {
        IJ.A04(this.A00 > 0);
        long jA4r = this.A08.A4r();
        long nowMs = jA4r - this.A03;
        int i = (int) nowMs;
        long nowMs2 = i;
        this.A05 += nowMs2;
        long j = this.A04;
        long nowMs3 = this.A02;
        this.A04 = j + nowMs3;
        if (i > 0) {
            long nowMs4 = i;
            this.A09.A03((int) Math.sqrt(this.A02), (this.A02 * 8000) / nowMs4);
            if (this.A05 >= 2000 || this.A04 >= 524288) {
                float bitsPerSecond = this.A09.A02(0.5f);
                this.A01 = (long) bitsPerSecond;
            }
        }
        A01(i, this.A02, this.A01);
        int i2 = this.A00 - 1;
        this.A00 = i2;
        if (i2 > 0) {
            this.A03 = jA4r;
        }
        this.A02 = 0L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Hz
    public final synchronized void ABF(Object obj, C0520Hi c0520Hi) {
        if (this.A00 == 0) {
            this.A03 = this.A08.A4r();
        }
        this.A00++;
    }
}
