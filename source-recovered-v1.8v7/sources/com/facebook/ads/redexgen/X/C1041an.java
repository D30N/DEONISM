package com.facebook.ads.redexgen.X;

import android.text.TextUtils;

/* renamed from: com.facebook.ads.redexgen.X.an, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1041an implements InterfaceC0704Oq {
    public final /* synthetic */ C1040am A00;

    public C1041an(C1040am c1040am) {
        this.A00 = c1040am;
    }

    public /* synthetic */ C1041an(C1040am c1040am, C1047at c1047at) {
        this(c1040am);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0704Oq
    public final void A9H() {
        this.A00.A0U(true);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0704Oq
    public final void A9j() {
        if (!TextUtils.isEmpty(this.A00.A09.A0P())) {
            this.A00.A0D.A87(this.A00.A09.A0P(), new C0676No().A03(this.A00.A06.getViewabilityChecker()).A02(this.A00.A06.getTouchDataRecorder()).A05());
            this.A00.A0C.A0A().A2Z();
        }
        this.A00.A0H.A3r(this.A00.A0I.A6O());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0704Oq
    public final void AA9() {
        this.A00.A0H.A3r(this.A00.A0I.A6C());
    }
}
