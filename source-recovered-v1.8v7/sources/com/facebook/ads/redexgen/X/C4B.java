package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.4B, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C4B {
    public int A00;
    public int A01;
    public int A02;
    public int A03;

    private final C4B A00(C4Y c4y, int i) {
        View view = c4y.A0H;
        this.A01 = view.getLeft();
        this.A03 = view.getTop();
        this.A02 = view.getRight();
        this.A00 = view.getBottom();
        return this;
    }

    public final C4B A01(C4Y c4y) {
        return A00(c4y, 0);
    }
}
