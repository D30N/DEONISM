package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: assets/audience_network.dex */
public class W2 implements InterfaceC02616d {
    public final /* synthetic */ WL A00;

    public W2(WL wl) {
        this.A00 = wl;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        W2 w2 = this;
        int loopCount = 0;
        ArrayList arrayList = null;
        int iMin = 0;
        char c2 = w2.A00.A05 != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    w2 = w2;
                    arrayList = new ArrayList();
                    iMin = Math.min(w2.A00.A05.length, w2.A00.A03.A0U());
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
                    w2 = w2;
                    arrayList = arrayList;
                    arrayList.add(w2.A00.A05[loopCount].name);
                    loopCount++;
                    c2 = 3;
                    break;
                case 5:
                    ArrayList arrayList2 = arrayList;
                    Collections.sort(arrayList2);
                    return w2.A00.A0E(arrayList2);
                case 6:
                    return w2.A00.A07(EnumC02726o.A06);
            }
        }
    }
}
