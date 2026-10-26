package com.facebook.ads.redexgen.X;

import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.Uf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0845Uf implements InterfaceC02616d {
    public final /* synthetic */ C0848Ui A00;

    public C0845Uf(C0848Ui c0848Ui) {
        this.A00 = c0848Ui;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        C0845Uf c0845Uf = this;
        AbstractC02766s abstractC02766sA07 = null;
        char c2 = Build.VERSION.SDK_INT < 24 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return c0845Uf.A00.A07(EnumC02726o.A04);
                case 3:
                    c0845Uf = c0845Uf;
                    if (c0845Uf.A00.A01 == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0845Uf = c0845Uf;
                    C0848Ui c0848Ui = c0845Uf.A00;
                    abstractC02766sA07 = c0848Ui.A08(c0848Ui.A01.deviceProtectedDataDir);
                    c2 = 5;
                    break;
                case 5:
                    return abstractC02766sA07;
                case 6:
                    c0845Uf = c0845Uf;
                    abstractC02766sA07 = c0845Uf.A00.A07(EnumC02726o.A06);
                    c2 = 5;
                    break;
            }
        }
    }
}
