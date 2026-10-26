package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Mr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0653Mr extends RelativeLayout implements PD {

    @Nullable
    public C0755Qq A00;

    public AbstractC0653Mr(XI xi) {
        super(xi);
    }

    public AbstractC0653Mr(XI xi, AttributeSet attributeSet, int i) {
        super(xi, attributeSet, i);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
    }

    public void A09() {
    }

    public void A0A() {
    }

    @Override // com.facebook.ads.redexgen.X.PD
    public final void A7t(C0755Qq c0755Qq) {
        this.A00 = c0755Qq;
        A09();
    }

    @Override // com.facebook.ads.redexgen.X.PD
    public final void ADf(C0755Qq c0755Qq) {
        A0A();
        this.A00 = null;
    }

    @Nullable
    public C0755Qq getVideoView() {
        return this.A00;
    }
}
