package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.6B, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6B {
    public final List<C6L> A00 = new ArrayList();

    public final void A00() {
        Iterator<C6L> it = this.A00.iterator();
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
                    it = it;
                    C6L biometricSignalLifecycleHandler = it.next();
                    biometricSignalLifecycleHandler.ABe();
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    public final void A01(C6L c6l) {
        this.A00.add(c6l);
    }
}
