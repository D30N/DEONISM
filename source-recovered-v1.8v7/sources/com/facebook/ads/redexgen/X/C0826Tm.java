package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAd;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Tm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0826Tm implements AnonymousClass74 {
    public final List<C0770Rf> A00;
    public final /* synthetic */ C0827Tn A01;

    public C0826Tm(C0827Tn c0827Tn, List<C0770Rf> list) {
        this.A01 = c0827Tn;
        this.A00 = list;
    }

    private void A00() {
        this.A01.A00.A07(true);
        this.A01.A00.A04();
        this.A01.A00.A05(0);
        Iterator<C0770Rf> it = this.A00.iterator();
        while (it.hasNext()) {
            this.A01.A00.A06(new NativeAd(this.A01.A01, new C1141cR(this.A01.A01, it.next(), null, C1141cR.A0I(), this.A01.A00.A03())));
        }
        C0600Kn.A00(new C0825Tl(this));
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass74
    public final void A98() {
        A00();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass74
    public final void A9F() {
        A00();
    }
}
