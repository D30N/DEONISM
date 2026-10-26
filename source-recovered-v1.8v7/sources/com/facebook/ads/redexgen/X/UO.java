package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class UO implements InterfaceC02616d {
    public final /* synthetic */ C0848Ui A00;

    public UO(C0848Ui c0848Ui) {
        this.A00 = c0848Ui;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        UO uo = this;
        AbstractC02766s abstractC02766sA07 = null;
        char c2 = uo.A00.A01 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    uo = uo;
                    C0848Ui c0848Ui = uo.A00;
                    abstractC02766sA07 = c0848Ui.A08(c0848Ui.A01.taskAffinity);
                    c2 = 3;
                    break;
                case 3:
                    return abstractC02766sA07;
                case 4:
                    uo = uo;
                    abstractC02766sA07 = uo.A00.A07(EnumC02726o.A06);
                    c2 = 3;
                    break;
            }
        }
    }
}
