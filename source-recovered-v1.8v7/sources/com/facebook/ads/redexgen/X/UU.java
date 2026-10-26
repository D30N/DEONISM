package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class UU implements InterfaceC02616d {
    public final /* synthetic */ C0848Ui A00;

    public UU(C0848Ui c0848Ui) {
        this.A00 = c0848Ui;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() throws Throwable {
        UU uu = this;
        AbstractC02766s abstractC02766sA07 = null;
        String strA06 = null;
        char c2 = uu.A00.A02.A0a() == EnumC02656h.A0H ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return uu.A00.A07(EnumC02726o.A03);
                case 3:
                    uu = uu;
                    strA06 = uu.A00.A03.A06(10010);
                    if (strA06 == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    uu = uu;
                    strA06 = strA06;
                    abstractC02766sA07 = uu.A00.A08(strA06);
                    c2 = 5;
                    break;
                case 5:
                    return abstractC02766sA07;
                case 6:
                    uu = uu;
                    abstractC02766sA07 = uu.A00.A07(EnumC02726o.A06);
                    c2 = 5;
                    break;
            }
        }
    }
}
