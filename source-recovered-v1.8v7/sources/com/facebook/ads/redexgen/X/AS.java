package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.support.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class AS {
    public int A00;
    public int A01;
    public Handler A03;
    public Object A04;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final AQ A0A;
    public final AR A0B;
    public final AbstractC0352Ab A0C;
    public long A02 = -9223372036854775807L;
    public boolean A05 = true;

    public AS(AQ aq, AR ar, AbstractC0352Ab abstractC0352Ab, int i, Handler handler) {
        this.A0A = aq;
        this.A0B = ar;
        this.A0C = abstractC0352Ab;
        this.A03 = handler;
        this.A01 = i;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01;
    }

    public final long A02() {
        return this.A02;
    }

    public final Handler A03() {
        return this.A03;
    }

    public final AR A04() {
        return this.A0B;
    }

    public final AS A05() {
        IJ.A04(!this.A09);
        if (this.A02 == -9223372036854775807L) {
            IJ.A03(this.A05);
        }
        this.A09 = true;
        this.A0A.ACx(this);
        return this;
    }

    public final AS A06(int i) {
        IJ.A04(!this.A09);
        this.A00 = i;
        return this;
    }

    public final AS A07(@Nullable Object obj) {
        IJ.A04(!this.A09);
        this.A04 = obj;
        return this;
    }

    public final AbstractC0352Ab A08() {
        return this.A0C;
    }

    public final Object A09() {
        return this.A04;
    }

    public final synchronized void A0A(boolean z) {
        this.A07 |= z;
        this.A08 = true;
        notifyAll();
    }

    public final boolean A0B() {
        return this.A05;
    }

    public final synchronized boolean A0C() throws InterruptedException {
        IJ.A04(this.A09);
        IJ.A04(this.A03.getLooper().getThread() != Thread.currentThread());
        while (!this.A08) {
            wait();
        }
        return this.A07;
    }

    public final synchronized boolean A0D() {
        return this.A06;
    }
}
