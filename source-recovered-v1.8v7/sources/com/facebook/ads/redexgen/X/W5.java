package com.facebook.ads.redexgen.X;

import java.util.ArrayList;

/* loaded from: assets/audience_network.dex */
public class W5 implements InterfaceC02616d {
    public final /* synthetic */ WL A00;

    public W5(WL wl) {
        this.A00 = wl;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        W5 w5 = this;
        int loopCount = 0;
        ArrayList arrayList = null;
        int iMin = 0;
        char c2 = w5.A00.A06 != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    w5 = w5;
                    arrayList = new ArrayList();
                    iMin = Math.min(w5.A00.A06.length, w5.A00.A03.A0U());
                    loopCount = 0;
                    c2 = 3;
                    break;
                case 3:
                    if (loopCount >= iMin) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    w5 = w5;
                    arrayList = arrayList;
                    arrayList.add(w5.A00.A06[loopCount]);
                    loopCount++;
                    c2 = 3;
                    break;
                case 5:
                    return w5.A00.A0E(arrayList);
                case 6:
                    return w5.A00.A07(EnumC02726o.A06);
            }
        }
    }
}
