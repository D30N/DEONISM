package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class US implements InterfaceC02616d {
    public final /* synthetic */ C0848Ui A00;

    public US(C0848Ui c0848Ui) {
        this.A00 = c0848Ui;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() throws Exception {
        US us = this;
        AbstractC02766s abstractC02766sA07 = null;
        String strA06 = us.A00.A03.A06(10004);
        char c2 = strA06 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    us = us;
                    strA06 = strA06;
                    abstractC02766sA07 = us.A00.A08(strA06);
                    c2 = 3;
                    break;
                case 3:
                    return abstractC02766sA07;
                case 4:
                    us = us;
                    abstractC02766sA07 = us.A00.A07(EnumC02726o.A06);
                    c2 = 3;
                    break;
            }
        }
    }
}
