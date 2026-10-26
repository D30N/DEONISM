package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class TM implements MQ {
    public final WeakReference<C02304x> A00;

    public TM(C02304x c02304x) {
        this.A00 = new WeakReference<>(c02304x);
    }

    private void A00(C02304x c02304x) {
        C0703Op c0703Op = c02304x.A0C;
        if (c0703Op != null) {
            c02304x.A06.bringChildToFront(c0703Op);
        }
    }

    @Override // com.facebook.ads.redexgen.X.MQ
    public final void A3J(View view, int i, RelativeLayout.LayoutParams layoutParams) {
        C02304x c02304x = this.A00.get();
        if (c02304x != null) {
            c02304x.A06.addView(view, i, layoutParams);
            A00(c02304x);
        }
    }

    @Override // com.facebook.ads.redexgen.X.MQ
    public final void A3K(View view, RelativeLayout.LayoutParams layoutParams) {
        C02304x c02304x = this.A00.get();
        if (c02304x != null) {
            c02304x.A06.addView(view, layoutParams);
            A00(c02304x);
        }
    }

    @Override // com.facebook.ads.redexgen.X.MQ
    public void A3r(String str) {
        if (this.A00.get() != null) {
            this.A00.get().A0D(str);
        }
    }

    @Override // com.facebook.ads.redexgen.X.MQ
    public void A3s(String str, C9A c9a) {
        if (this.A00.get() != null) {
            this.A00.get().A0F(str, c9a);
        }
    }

    @Override // com.facebook.ads.redexgen.X.MQ
    public final void A7o(String str, C1R c1r) {
        if (this.A00.get() != null) {
            this.A00.get().A0E(str, c1r);
        }
    }
}
