package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Sw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0811Sw implements OO {
    public final /* synthetic */ C0804Sp A00;

    public C0811Sw(C0804Sp c0804Sp) {
        this.A00 = c0804Sp;
    }

    @Override // com.facebook.ads.redexgen.X.OO
    public final void ABP(View view) {
        if (this.A00.A07) {
            this.A00.A05 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.OO
    public final void ABQ(View view) {
        C0811Sw c0811Sw = this;
        YQ yq = (YQ) view;
        yq.A0g();
        char c2 = c0811Sw.A00.A07 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0811Sw = c0811Sw;
                    c0811Sw.A00.A05 = true;
                    c2 = 3;
                    break;
                case 3:
                    c0811Sw = c0811Sw;
                    if (!c0811Sw.A00.A0E.A0a()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    yq = yq;
                    if (((Integer) yq.getTag(-1593835536)).intValue() != 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0811Sw = c0811Sw;
                    c0811Sw.A00.A0E.A0V();
                    c2 = 6;
                    break;
                case 6:
                    return;
            }
        }
    }
}
