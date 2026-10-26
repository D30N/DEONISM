package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Rj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0774Rj extends AbstractC01200p {
    public static final String A05 = C0774Rj.class.getSimpleName();
    public C0772Rh A00;
    public boolean A01;
    public final XI A02;
    public final JW A03;
    public final AbstractC0666Ne A04;

    public C0774Rj(XI xi, JW jw, AbstractC0666Ne abstractC0666Ne, Q1 q1, AbstractC01210q abstractC01210q) {
        super(xi, abstractC01210q, q1);
        this.A03 = jw;
        this.A04 = abstractC0666Ne;
        this.A02 = xi;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01200p
    public final void A06(Map<String, String> map) {
        C0774Rj c0774Rj = this;
        C0772Rh c0772Rh = c0774Rj.A00;
        char c2 = c0772Rh != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0772Rh = c0772Rh;
                    if (!TextUtils.isEmpty(c0772Rh.A5k())) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    c0774Rj = c0774Rj;
                    map = map;
                    c0774Rj.A02.A0A().A2Z();
                    c0774Rj.A03.A87(c0774Rj.A00.A5k(), map);
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    public final synchronized void A07() {
        if (!this.A01 && this.A00 != null) {
            this.A01 = true;
            if (!TextUtils.isEmpty(this.A00.A03())) {
                ExecutorC0630Lt.A00(new C0773Ri(this));
            }
        }
    }

    public final void A08(C0772Rh c0772Rh) {
        this.A00 = c0772Rh;
    }
}
