package com.facebook.ads.redexgen.X;

import java.util.ArrayList;

/* loaded from: assets/audience_network.dex */
public class WI implements InterfaceC02616d {
    public final /* synthetic */ WL A00;

    public WI(WL wl) {
        this.A00 = wl;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        WI wi = this;
        int loopSize = 0;
        ArrayList arrayList = null;
        int iMin = 0;
        char c2 = wi.A00.A04 != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    wi = wi;
                    arrayList = new ArrayList();
                    iMin = Math.min(wi.A00.A04.length, wi.A00.A03.A0U());
                    loopSize = 0;
                    c2 = 3;
                    break;
                case 3:
                    if (loopSize >= iMin) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    wi = wi;
                    arrayList = arrayList;
                    arrayList.add(wi.A00.A04[loopSize].name);
                    loopSize++;
                    c2 = 3;
                    break;
                case 5:
                    return wi.A00.A0E(arrayList);
                case 6:
                    return wi.A00.A07(EnumC02726o.A06);
            }
        }
    }
}
