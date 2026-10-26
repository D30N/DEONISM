package com.facebook.ads.redexgen.X;

import android.widget.RelativeLayout;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.7N, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7N extends AbstractC0653Mr {
    public final int A00;
    public final C9C<C02967u> A01;
    public final PS A02;
    public final String A03;
    public final String A04;
    public final AtomicBoolean A05;

    public C7N(XI xi, int i, String str, String str2) {
        super(xi);
        this.A01 = new IX(this);
        this.A00 = i;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = new AtomicBoolean(false);
        this.A02 = new PS(xi);
        this.A02.setText(this.A03 + ' ' + i);
        addView(this.A02, new RelativeLayout.LayoutParams(-2, -2));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0653Mr
    public final void A09() {
        super.A09();
        if (getVideoView() != null) {
            getVideoView().getEventBus().A05(this.A01);
        }
        this.A02.setOnClickListener(new PR(this));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0653Mr
    public final void A0A() {
        if (getVideoView() != null) {
            this.A02.setOnClickListener(null);
            getVideoView().getEventBus().A06(this.A01);
        }
        super.A0A();
    }
}
