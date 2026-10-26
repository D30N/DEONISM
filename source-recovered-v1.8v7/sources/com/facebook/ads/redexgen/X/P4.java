package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class P4 implements View.OnTouchListener {
    public final /* synthetic */ C0755Qq A00;

    public P4(C0755Qq c0755Qq) {
        this.A00 = c0755Qq;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.A00.A0B.A02(new KS(view, motionEvent));
        return false;
    }
}
