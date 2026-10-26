package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.7l, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C7l extends KR {
    public final /* synthetic */ KC A00;

    public C7l(KC kc) {
        this.A00 = kc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9C
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(KS ks) {
        C7l c7l = this;
        char c2 = c7l.A00.A01 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c7l = c7l;
                    if (!c7l.A00.A03) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    ks = ks;
                    if (ks.A00().getAction() != 0) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c7l = c7l;
                    c7l.A00.A05.removeCallbacksAndMessages(null);
                    if (!c7l.A00.A0D(PX.A04)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c7l = c7l;
                    c7l.A00.A03();
                    c7l.A00.A06(true, false);
                    c2 = 7;
                    break;
                case 7:
                    c7l = c7l;
                    if (!c7l.A00.A02) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c7l = c7l;
                    c7l.A00.A05.postDelayed(new KK(c7l), c7l.A00.A00);
                    c2 = '\t';
                    break;
                case '\t':
                    return;
            }
        }
    }
}
