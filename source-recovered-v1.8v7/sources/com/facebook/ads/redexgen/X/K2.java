package com.facebook.ads.redexgen.X;

import java.util.LinkedList;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class K2 {
    public final K0 A0B;
    public final boolean A0F;
    public final String A0C = K2.class.getSimpleName();
    public final int A07 = 101;
    public final int A0A = 102;
    public final int A08 = 103;
    public final int A03 = 104;
    public final int A09 = 105;
    public final int A02 = 106;
    public final int A04 = 107;
    public final int A05 = 108;
    public final int A06 = 109;
    public final int A01 = 110;
    public final boolean A0E = false;
    public long A00 = -1;
    public final List<K1> A0D = new LinkedList();

    public K2(C8C c8c, K0 k0) {
        int iA0C = JR.A0C(c8c);
        if (iA0C < 1) {
            this.A0F = false;
        } else {
            double sessionRandom = iA0C;
            this.A0F = c8c.A05().A00() < 1.0d / sessionRandom;
        }
        this.A0B = k0;
    }

    private int A00() {
        return this.A0B.A5t();
    }

    private int A01() {
        if (this.A00 > 0) {
            return (int) (System.currentTimeMillis() - this.A00);
        }
        return -1;
    }

    private void A03(K1 k1) {
        synchronized (this.A0D) {
            this.A0D.add(k1);
        }
    }

    public final void A04() {
        if (!this.A0F) {
            return;
        }
        A03(new K1(A01(), 110, A00(), null));
    }

    public final void A05() {
        if (!this.A0F) {
            return;
        }
        A03(new K1(A01(), 106, A00(), null));
    }

    public final void A06() {
        if (!this.A0F) {
            return;
        }
        A03(new K1(A01(), 104, A00(), null));
    }

    public final void A07() {
        if (!this.A0F) {
            return;
        }
        A03(new K1(A01(), 109, -1, null));
    }

    public final void A08() {
        if (!this.A0F) {
            return;
        }
        A03(new K1(A01(), 107, A00(), null));
    }

    public final void A09() {
        if (!this.A0F) {
            return;
        }
        A03(new K1(A01(), 108, A00(), null));
    }

    public final void A0A() {
        if (!this.A0F) {
            return;
        }
        this.A00 = System.currentTimeMillis();
        A03(new K1(0, 101, -1, null));
    }

    public final void A0B() {
        if (!this.A0F) {
            return;
        }
        A03(new K1(A01(), 105, A00(), null));
    }

    public final void A0C() {
        if (!this.A0F) {
            return;
        }
        A03(new K1(A01(), 102, A00(), null));
    }

    public final void A0D(C8C c8c, String str) {
        if (!this.A0F) {
            return;
        }
        A03(new K1(A01(), 103, A00(), null));
        M3.A05.execute(new RunnableC0587Jz(this, str, c8c));
    }
}
