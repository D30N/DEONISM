package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class TB implements InterfaceC02084b {
    public final /* synthetic */ C4G A00;

    public TB(C4G c4g) {
        this.A00 = c4g;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02084b
    public final View A5e(int i) {
        return this.A00.A0t(i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02084b
    public final int A5g(View view) {
        return this.A00.A0j(view) + ((C4H) view.getLayoutParams()).bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02084b
    public final int A5h(View view) {
        return this.A00.A0o(view) - ((C4H) view.getLayoutParams()).topMargin;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02084b
    public final int A6f() {
        return this.A00.A0X() - this.A00.A0d();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02084b
    public final int A6g() {
        return this.A00.A0g();
    }
}
