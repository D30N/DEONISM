package com.facebook.ads.redexgen.X;

import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.7M, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7M extends AbstractC0653Mr {
    public final C9C<C0603Kr> A00;

    public C7M(XI xi) {
        this(xi, null);
    }

    public C7M(XI xi, AttributeSet attributeSet) {
        this(xi, attributeSet, 0);
    }

    public C7M(XI xi, AttributeSet attributeSet, int i) {
        super(xi, attributeSet, i);
        this.A00 = new IU(this);
        int iApplyDimension = (int) TypedValue.applyDimension(1, 40.0f, getResources().getDisplayMetrics());
        ProgressBar progressBar = new ProgressBar(getContext());
        progressBar.setIndeterminate(true);
        progressBar.getIndeterminateDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_IN);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iApplyDimension, iApplyDimension);
        layoutParams.addRule(13);
        addView(progressBar, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0653Mr
    public final void A09() {
        super.A09();
        setVisibility(0);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A05(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0653Mr
    public final void A0A() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A06(this.A00);
        }
        setVisibility(8);
        super.A0A();
    }
}
