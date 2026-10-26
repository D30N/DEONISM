package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.c5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1120c5 extends C9D<String> {
    public final /* synthetic */ JT A00;
    public final /* synthetic */ C1121c6 A01;

    public C1120c5(C1121c6 c1121c6, JT jt) {
        this.A01 = c1121c6;
        this.A00 = jt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9D
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A02(String str) {
        C1120c5 c1120c5 = this;
        super.A02(str);
        char c2 = c1120c5.A00.A0B() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c1120c5 = c1120c5;
                    c1120c5.A01.A02.A4o();
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    c1120c5 = c1120c5;
                    c1120c5.A01.A02.A4n();
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C9D
    public final void A01(int i, String str) {
        super.A01(i, str);
    }
}
