package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Ue, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0844Ue implements InterfaceC02616d {
    public final /* synthetic */ C0848Ui A00;

    public C0844Ue(C0848Ui c0848Ui) {
        this.A00 = c0848Ui;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        C0844Ue c0844Ue = this;
        AbstractC02766s abstractC02766sA07 = null;
        char c2 = c0844Ue.A00.A01 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0844Ue = c0844Ue;
                    C0848Ui c0848Ui = c0844Ue.A00;
                    abstractC02766sA07 = c0848Ui.A08(c0848Ui.A01.publicSourceDir);
                    c2 = 3;
                    break;
                case 3:
                    return abstractC02766sA07;
                case 4:
                    c0844Ue = c0844Ue;
                    abstractC02766sA07 = c0844Ue.A00.A07(EnumC02726o.A06);
                    c2 = 3;
                    break;
            }
        }
    }
}
