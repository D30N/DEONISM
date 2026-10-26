package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.7Z, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C7Z extends KR {
    public final /* synthetic */ C0550Io A00;

    public C7Z(C0550Io c0550Io) {
        this.A00 = c0550Io;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9C
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(KS ks) {
        C7Z c7z = this;
        char c2 = c7z.A00.A01 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    ks = ks;
                    if (ks.A00().getAction() != 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c7z = c7z;
                    c7z.A00.A04.removeCallbacksAndMessages(null);
                    c7z.A00.A07(new PM(c7z));
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }
}
