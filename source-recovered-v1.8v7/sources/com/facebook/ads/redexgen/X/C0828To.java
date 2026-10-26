package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.widget.ImageView;

/* renamed from: com.facebook.ads.redexgen.X.To, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0828To implements C5H {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C5J A01;
    public final /* synthetic */ C1141cR A02;

    public C0828To(C5J c5j, ImageView imageView, C1141cR c1141cR) {
        this.A01 = c5j;
        this.A00 = imageView;
        this.A02 = c1141cR;
    }

    @Override // com.facebook.ads.redexgen.X.C5H
    public final void A9i(@Nullable Drawable drawable) {
        C1141cR.A0Y(drawable, this.A00);
        this.A02.A1D(drawable);
    }
}
