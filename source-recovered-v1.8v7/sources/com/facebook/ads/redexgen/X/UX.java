package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class UX implements InterfaceC02616d {
    public final /* synthetic */ C0848Ui A00;

    public UX(C0848Ui c0848Ui) {
        this.A00 = c0848Ui;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        UX ux = this;
        AbstractC02766s abstractC02766sA07 = null;
        String strA0f = ux.A00.A02.A0f();
        char c2 = strA0f != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    ux = ux;
                    strA0f = strA0f;
                    abstractC02766sA07 = ux.A00.A08(strA0f);
                    c2 = 3;
                    break;
                case 3:
                    return abstractC02766sA07;
                case 4:
                    ux = ux;
                    abstractC02766sA07 = ux.A00.A07(EnumC02726o.A06);
                    c2 = 3;
                    break;
            }
        }
    }
}
