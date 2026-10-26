package com.facebook.ads.redexgen.X;

import android.os.Build;

/* loaded from: assets/audience_network.dex */
public class UZ implements InterfaceC02616d {
    public final /* synthetic */ C0848Ui A00;

    public UZ(C0848Ui c0848Ui) {
        this.A00 = c0848Ui;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        UZ uz = this;
        AbstractC02766s abstractC02766sA04 = null;
        char c2 = Build.VERSION.SDK_INT < 24 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return uz.A00.A07(EnumC02726o.A04);
                case 3:
                    uz = uz;
                    if (uz.A00.A01 == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    uz = uz;
                    C0848Ui c0848Ui = uz.A00;
                    abstractC02766sA04 = c0848Ui.A04(c0848Ui.A01.minSdkVersion);
                    c2 = 5;
                    break;
                case 5:
                    return abstractC02766sA04;
                case 6:
                    uz = uz;
                    abstractC02766sA04 = uz.A00.A07(EnumC02726o.A06);
                    c2 = 5;
                    break;
            }
        }
    }
}
