package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Vj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0875Vj implements InterfaceC02616d {
    public final /* synthetic */ C0877Vl A00;
    public final /* synthetic */ List A01;

    public C0875Vj(C0877Vl c0877Vl, List list) {
        this.A00 = c0877Vl;
        this.A01 = list;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() throws IOException {
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
                    String strA07 = C0877Vl.A07((String) bundledSignalMetadata.A01());
                    map.put(strA07, new C0876Vk(C0877Vl.A03(strA07)));
                    c2 = 2;
                    break;
                case 5:
                    return this.A00.A02(map);
            }
        }
    }
}
