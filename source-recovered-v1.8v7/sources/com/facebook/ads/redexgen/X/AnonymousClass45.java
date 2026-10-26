package com.facebook.ads.redexgen.X;

import android.database.Observable;

/* renamed from: com.facebook.ads.redexgen.X.45, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class AnonymousClass45 extends Observable<AnonymousClass46> {
    public final void A00() {
        AnonymousClass45 anonymousClass45 = this;
        int size = anonymousClass45.mObservers.size() - 1;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (size < 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    anonymousClass45 = anonymousClass45;
                    ((AnonymousClass46) anonymousClass45.mObservers.get(size)).A00();
                    size--;
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }
}
