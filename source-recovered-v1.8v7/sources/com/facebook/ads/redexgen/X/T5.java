package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class T5 extends AnonymousClass40 {
    public T5(C4G c4g) {
        super(c4g, null);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass40
    public final int A06() {
        return this.A02.A0X();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass40
    public final int A07() {
        return this.A02.A0X() - this.A02.A0d();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass40
    public final int A08() {
        return this.A02.A0d();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass40
    public final int A09() {
        return this.A02.A0Y();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass40
    public final int A0A() {
        return this.A02.A0g();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass40
    public final int A0B() {
        return (this.A02.A0X() - this.A02.A0g()) - this.A02.A0d();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass40
    public final int A0C(View view) {
        return this.A02.A0j(view) + ((C4H) view.getLayoutParams()).bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass40
    public final int A0D(View view) {
        C4H c4h = (C4H) view.getLayoutParams();
        return this.A02.A0l(view) + c4h.topMargin + c4h.bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass40
    public final int A0E(View view) {
        C4H c4h = (C4H) view.getLayoutParams();
        return this.A02.A0m(view) + c4h.leftMargin + c4h.rightMargin;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass40
    public final int A0F(View view) {
        return this.A02.A0o(view) - ((C4H) view.getLayoutParams()).topMargin;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass40
    public final int A0G(View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.bottom;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass40
    public final int A0H(View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.top;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass40
    public final void A0J(int i) {
        this.A02.A10(i);
    }
}
