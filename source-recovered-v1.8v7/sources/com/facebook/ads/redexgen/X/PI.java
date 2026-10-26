package com.facebook.ads.redexgen.X;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* loaded from: assets/audience_network.dex */
public class PI extends Animation {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ PK A02;

    public PI(PK pk, int i, int i2) {
        this.A02 = pk;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = (int) (this.A01 + ((this.A00 - r2) * f));
        this.A02.getLayoutParams().width = i;
        this.A02.requestLayout();
        this.A02.A01.getLayoutParams().width = i - this.A00;
        this.A02.A01.requestLayout();
    }

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        return true;
    }
}
