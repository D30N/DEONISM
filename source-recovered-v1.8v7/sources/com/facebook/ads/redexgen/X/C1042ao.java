package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.ao, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1042ao implements LN {
    public final /* synthetic */ C1040am A00;

    public C1042ao(C1040am c1040am) {
        this.A00 = c1040am;
    }

    public /* synthetic */ C1042ao(C1040am c1040am, C1047at c1047at) {
        this(c1040am);
    }

    @Override // com.facebook.ads.redexgen.X.LN
    public final void A9E() {
        C1042ao c1042ao = this;
        c1042ao.A00.A0H();
        int i = 0;
        char c2 = c1042ao.A00.A0N ? (char) 2 : '\b';
        while (true) {
            switch (c2) {
                case 2:
                    c1042ao = c1042ao;
                    if (!c1042ao.A00.A0V()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c1042ao = c1042ao;
                    c1042ao.A00.A0P.setToolbarActionMode(1);
                    c2 = 4;
                    break;
                case 4:
                    c1042ao = c1042ao;
                    if (!c1042ao.A00.A0O) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 5:
                    c1042ao = c1042ao;
                    C0635Ly.A0Y(c1042ao.A00, 500);
                    if (c1042ao.A00.A05 == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c1042ao = c1042ao;
                    C0635Ly.A0Q(c1042ao.A00.A05, i);
                    c2 = 7;
                    break;
                case 7:
                    return;
                case '\b':
                    c1042ao = c1042ao;
                    i = 0;
                    c1042ao.A00.A0P.setToolbarActionMode(0);
                    c2 = 4;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.LN
    public final void AAh(float f) {
        this.A00.A0P.setProgress(100.0f * (1.0f - (f / this.A00.A0A.A07())));
        this.A00.A0N((int) f);
    }
}
