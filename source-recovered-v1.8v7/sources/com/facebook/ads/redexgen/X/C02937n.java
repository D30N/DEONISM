package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.7n, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C02937n extends AbstractC0604Ks {
    public final /* synthetic */ KC A00;

    public C02937n(KC kc) {
        this.A00 = kc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9C
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(L4 l4) {
        C02937n c02937n = this;
        boolean z = false;
        char c2 = c02937n.A00.A03 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    c02937n = c02937n;
                    if (!c02937n.A00.A02) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c02937n = c02937n;
                    z = false;
                    c02937n.A00.A03 = false;
                    if (!c02937n.A00.A0D(PX.A03)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    c02937n = c02937n;
                    if (!c02937n.A00.A04) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c02937n = c02937n;
                    c02937n.A00.A04 = z;
                    c02937n.A00.A05.postDelayed(new KL(c02937n), c02937n.A00.A00);
                    c2 = 6;
                    break;
                case 6:
                    return;
                case 7:
                    c02937n = c02937n;
                    if (!c02937n.A00.A0D(PX.A02)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c02937n = c02937n;
                    c02937n.A00.A03();
                    c02937n.A00.A06(true, true);
                    c2 = 6;
                    break;
            }
        }
    }
}
