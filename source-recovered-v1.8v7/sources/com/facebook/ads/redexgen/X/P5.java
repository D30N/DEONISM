package com.facebook.ads.redexgen.X;

import android.view.ViewTreeObserver;

/* loaded from: assets/audience_network.dex */
public class P5 implements ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ C0755Qq A00;
    public final /* synthetic */ PC A01;

    public P5(C0755Qq c0755Qq, PC pc) {
        this.A00 = c0755Qq;
        this.A01 = pc;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        if (z) {
            this.A00.A0Y(this.A01, 4);
        }
    }
}
