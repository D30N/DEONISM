package com.facebook.ads.redexgen.X;

import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.Ua, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0840Ua implements InterfaceC02616d {
    public final /* synthetic */ C0848Ui A00;

    public C0840Ua(C0848Ui c0848Ui) {
        this.A00 = c0848Ui;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        C0840Ua c0840Ua = this;
        AbstractC02766s abstractC02766sA04 = null;
        char c2 = Build.VERSION.SDK_INT < 4 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return c0840Ua.A00.A07(EnumC02726o.A04);
                case 3:
                    c0840Ua = c0840Ua;
                    if (c0840Ua.A00.A01 == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0840Ua = c0840Ua;
                    C0848Ui c0848Ui = c0840Ua.A00;
                    abstractC02766sA04 = c0848Ui.A04(c0848Ui.A01.targetSdkVersion);
                    c2 = 5;
                    break;
                case 5:
                    return abstractC02766sA04;
                case 6:
                    c0840Ua = c0840Ua;
                    abstractC02766sA04 = c0840Ua.A00.A07(EnumC02726o.A06);
                    c2 = 5;
                    break;
            }
        }
    }
}
