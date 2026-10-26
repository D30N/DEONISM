package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class XE extends AbstractRunnableC0608Kw {
    public final /* synthetic */ AnonymousClass74 A00;
    public final /* synthetic */ AnonymousClass75 A01;
    public final /* synthetic */ C7C A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;

    public XE(C7C c7c, ArrayList arrayList, AnonymousClass74 anonymousClass74, AnonymousClass75 anonymousClass75, ArrayList arrayList2) {
        this.A02 = c7c;
        this.A03 = arrayList;
        this.A00 = anonymousClass74;
        this.A01 = anonymousClass75;
        this.A04 = arrayList2;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0608Kw
    public final void A06() {
        XE xe = this;
        XI adContext = null;
        AtomicBoolean atomicBooleanA0B = C7C.A0B(xe.A03);
        char c2 = xe.A02.A04 instanceof XI ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    xe = xe;
                    atomicBooleanA0B = atomicBooleanA0B;
                    adContext = (XI) xe.A02.A04;
                    if (!atomicBooleanA0B.get()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    xe = xe;
                    adContext = adContext;
                    adContext.A0A().A3v(C0627Lq.A01(xe.A02.A00));
                    c2 = 4;
                    break;
                case 4:
                    XE xe2 = xe;
                    xe2.A02.A02.post(new XD(xe2, atomicBooleanA0B));
                    C7C.A0B(xe2.A04);
                    return;
                case 5:
                    xe = xe;
                    adContext = adContext;
                    adContext.A0A().A3u(C0627Lq.A01(xe.A02.A00));
                    c2 = 4;
                    break;
            }
        }
    }
}
