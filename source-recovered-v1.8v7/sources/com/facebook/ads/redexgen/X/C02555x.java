package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.5x, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02555x {
    public final List<InterfaceC02545w> A00 = new ArrayList();

    public final void A00(InterfaceC02545w interfaceC02545w) {
        this.A00.add(interfaceC02545w);
    }

    public final void A01(EnumC02626e enumC02626e) {
        Iterator<InterfaceC02545w> it = this.A00.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    enumC02626e = enumC02626e;
                    it = it;
                    it.next().ADj(enumC02626e);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }
}
