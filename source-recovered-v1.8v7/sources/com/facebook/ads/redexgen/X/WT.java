package com.facebook.ads.redexgen.X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class WT implements InterfaceC02616d {
    public final /* synthetic */ C6Z A00;
    public final /* synthetic */ WV A01;
    public final /* synthetic */ List A02;

    public WT(WV wv, List list, C6Z c6z) {
        this.A01 = wv;
        this.A02 = list;
        this.A00 = c6z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        WT wt = this;
        C02606c bundledSignalMetadata = null;
        HashMap map = new HashMap();
        Iterator it = wt.A02.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    it = it;
                    bundledSignalMetadata = (C02606c) it.next();
                    if (!bundledSignalMetadata.A02()) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    wt = wt;
                    map = map;
                    bundledSignalMetadata = bundledSignalMetadata;
                    String str = (String) bundledSignalMetadata.A01();
                    map.put(str, new WU(wt.A01.A00, str, wt.A00));
                    c2 = 2;
                    break;
                case 5:
                    return wt.A01.A03((HashMap<String, WU>) map);
            }
        }
    }
}
