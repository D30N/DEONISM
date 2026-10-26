package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.Rx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0788Rx implements AnonymousClass74 {
    public final /* synthetic */ C0790Rz A00;

    public C0788Rx(C0790Rz c0790Rz) {
        this.A00 = c0790Rz;
    }

    private void A00(boolean z) {
        C0788Rx c0788Rx = this;
        char c2 = z ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0788Rx = c0788Rx;
                    c0788Rx.A00.A03.A8n();
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    c0788Rx = c0788Rx;
                    c0788Rx.A00.A03.A8m(AdError.CACHE_ERROR);
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass74
    public final void A98() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass74
    public final void A9F() {
        A00(true);
    }
}
