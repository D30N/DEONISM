package com.facebook.ads.redexgen.X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Va, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0866Va implements InterfaceC02616d {
    public final /* synthetic */ C0868Vc A00;
    public final /* synthetic */ List A01;

    public C0866Va(C0868Vc c0868Vc, List list) {
        this.A00 = c0868Vc;
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
                    C0867Vb deviceFeatures = new C0867Vb(str);
                    map.put(str, deviceFeatures);
                    c2 = 2;
                    break;
                case 5:
                    return this.A00.A03((HashMap<String, C0867Vb>) map);
            }
        }
    }
}
