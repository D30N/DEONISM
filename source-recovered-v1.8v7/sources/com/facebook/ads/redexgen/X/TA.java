package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class TA implements InterfaceC02084b {
    public final /* synthetic */ C4G A00;

    public TA(C4G c4g) {
        this.A00 = c4g;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02084b
    public final View A5e(int i) {
        return this.A00.A0t(i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02084b
    public final int A5g(View view) {
        return this.A00.A0n(view) + ((C4H) view.getLayoutParams()).rightMargin;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02084b
    public final int A5h(View view) {
        return this.A00.A0k(view) - ((C4H) view.getLayoutParams()).leftMargin;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02084b
    public final int A6f() {
        return this.A00.A0h() - this.A00.A0f();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02084b
    public final int A6g() {
        return this.A00.A0e();
    }
}
