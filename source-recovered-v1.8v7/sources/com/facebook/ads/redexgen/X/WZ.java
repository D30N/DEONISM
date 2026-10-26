package com.facebook.ads.redexgen.X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class WZ implements InterfaceC02616d {
    public final /* synthetic */ C0893Wb A00;
    public final /* synthetic */ List A01;

    public WZ(C0893Wb c0893Wb, List list) {
        this.A00 = c0893Wb;
        this.A01 = list;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        C02606c bundledSignalMetadata = null;
        HashMap map = new HashMap();
        Iterator it = this.A01.iterator();
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
                    map = map;
                    bundledSignalMetadata = bundledSignalMetadata;
                    String str = (String) bundledSignalMetadata.A01();
                    C0892Wa systemProperty = new C0892Wa(str);
                    map.put(str, systemProperty);
                    c2 = 2;
                    break;
                case 5:
                    return this.A00.A02(map);
            }
        }
    }
}
