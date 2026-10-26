package com.facebook.ads.redexgen.X;

import android.os.Build;

/* loaded from: assets/audience_network.dex */
public class UQ implements InterfaceC02616d {
    public final /* synthetic */ C0848Ui A00;

    public UQ(C0848Ui c0848Ui) {
        this.A00 = c0848Ui;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        UQ uq = this;
        AbstractC02766s abstractC02766sA04 = null;
        char c2 = Build.VERSION.SDK_INT < 26 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return uq.A00.A07(EnumC02726o.A04);
                case 3:
                    uq = uq;
                    if (uq.A00.A01 == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    uq = uq;
                    C0848Ui c0848Ui = uq.A00;
                    abstractC02766sA04 = c0848Ui.A04(c0848Ui.A01.category);
                    c2 = 5;
                    break;
                case 5:
                    return abstractC02766sA04;
                case 6:
                    uq = uq;
                    abstractC02766sA04 = uq.A00.A07(EnumC02726o.A06);
                    c2 = 5;
                    break;
            }
        }
    }
}
