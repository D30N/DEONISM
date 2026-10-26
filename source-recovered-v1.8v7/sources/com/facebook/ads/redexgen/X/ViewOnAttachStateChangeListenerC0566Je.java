package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Je, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnAttachStateChangeListenerC0566Je implements View.OnAttachStateChangeListener {
    public final /* synthetic */ EnumC0564Jc A00;
    public final /* synthetic */ C0565Jd A01;

    public ViewOnAttachStateChangeListenerC0566Je(C0565Jd c0565Jd, EnumC0564Jc enumC0564Jc) {
        this.A01 = c0565Jd;
        this.A00 = enumC0564Jc;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.A01.A02(this.A00, null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
