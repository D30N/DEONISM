package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class UP implements InterfaceC02616d {
    public final /* synthetic */ C0848Ui A00;

    public UP(C0848Ui c0848Ui) {
        this.A00 = c0848Ui;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        UP up = this;
        AbstractC02766s abstractC02766sA07 = null;
        char c2 = up.A00.A01 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    up = up;
                    C0848Ui c0848Ui = up.A00;
                    abstractC02766sA07 = c0848Ui.A04(c0848Ui.A01.theme);
                    c2 = 3;
                    break;
                case 3:
                    return abstractC02766sA07;
                case 4:
                    up = up;
                    abstractC02766sA07 = up.A00.A07(EnumC02726o.A06);
                    c2 = 3;
                    break;
            }
        }
    }
}
