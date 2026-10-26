package com.facebook.ads.redexgen.X;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: assets/audience_network.dex */
public abstract class BR {
    public int A00;

    public final void A00(int i) {
        this.A00 |= i;
    }

    public final void A01(int i) {
        this.A00 &= i ^ (-1);
    }

    public final void A02(int i) {
        this.A00 = i;
    }

    public final boolean A03() {
        return A06(RecyclerView.UNDEFINED_DURATION);
    }

    public final boolean A04() {
        return A06(4);
    }

    public final boolean A05() {
        return A06(1);
    }

    public final boolean A06(int i) {
        boolean z = false;
        char c2 = (this.A00 & i) == i ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    public void A07() {
        this.A00 = 0;
    }
}
