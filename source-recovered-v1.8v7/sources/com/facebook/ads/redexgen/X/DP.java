package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class DP {
    public int A00;
    public long A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final DI A05;
    public final C0543Ih A06 = new C0543Ih(new byte[64]);
    public final C0556Iu A07;

    public DP(DI di, C0556Iu c0556Iu) {
        this.A05 = di;
        this.A07 = c0556Iu;
    }

    private void A00() {
        this.A06.A08(8);
        this.A03 = this.A06.A0F();
        this.A02 = this.A06.A0F();
        this.A06.A08(6);
        this.A00 = this.A06.A04(8);
    }

    private void A01() {
        DP dp = this;
        long jA04 = 0;
        int i = 0;
        int i2 = 0;
        char c2 = 0;
        boolean z = false;
        int i3 = 0;
        dp.A01 = 0L;
        char c3 = dp.A03 ? (char) 2 : (char) 6;
        while (true) {
            switch (c3) {
                case 2:
                    dp = dp;
                    i = 4;
                    dp.A06.A08(4);
                    i2 = 3;
                    c2 = 30;
                    z = true;
                    z = true;
                    dp.A06.A08(1);
                    i3 = 15;
                    dp.A06.A08(1);
                    jA04 = (dp.A06.A04(3) << 30) | (dp.A06.A04(15) << 15) | dp.A06.A04(15);
                    dp.A06.A08(1);
                    if (!dp.A04) {
                        c3 = 3;
                        break;
                    } else {
                        c3 = 5;
                        break;
                    }
                case 3:
                    dp = dp;
                    if (!dp.A02) {
                        c3 = 5;
                        break;
                    } else {
                        c3 = 4;
                        break;
                    }
                case 4:
                    dp = dp;
                    dp.A06.A08(i);
                    dp.A06.A08(z ? 1 : 0);
                    dp.A06.A08(z ? 1 : 0);
                    dp.A06.A08(z ? 1 : 0);
                    dp.A07.A07((dp.A06.A04(i2) << c2) | (dp.A06.A04(i3) << i3) | dp.A06.A04(i3));
                    dp.A04 = z;
                    c3 = 5;
                    break;
                case 5:
                    dp = dp;
                    dp.A01 = dp.A07.A07(jA04);
                    c3 = 6;
                    break;
                case 6:
                    return;
            }
        }
    }

    public final void A02() {
        this.A04 = false;
        this.A05.ACo();
    }

    public final void A03(C0544Ii c0544Ii) throws AF {
        c0544Ii.A0c(this.A06.A00, 0, 3);
        this.A06.A07(0);
        A00();
        c0544Ii.A0c(this.A06.A00, 0, this.A00);
        this.A06.A07(0);
        A01();
        this.A05.ABb(this.A01, true);
        this.A05.A47(c0544Ii);
        this.A05.ABa();
    }
}
