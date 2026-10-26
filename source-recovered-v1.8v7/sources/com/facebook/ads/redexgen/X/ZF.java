package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public class ZF implements D5, CL {
    public long A00 = -1;
    public long A01 = -1;
    public long[] A02;
    public long[] A03;
    public final /* synthetic */ ZG A04;

    public ZF(ZG zg) {
        this.A04 = zg;
    }

    public final void A00(long j) {
        this.A00 = j;
    }

    public final void A01(C0544Ii c0544Ii) {
        ZF zf = this;
        c0544Ii.A0Z(1);
        int iA0G = c0544Ii.A0G() / 18;
        zf.A02 = new long[iA0G];
        zf.A03 = new long[iA0G];
        int i = 0;
        int i2 = 2;
        while (true) {
            switch (i2) {
                case 2:
                    if (i >= iA0G) {
                        i2 = 4;
                        break;
                    } else {
                        i2 = 3;
                        break;
                    }
                case 3:
                    zf = zf;
                    c0544Ii = c0544Ii;
                    zf.A02[i] = c0544Ii.A0L();
                    zf.A03[i] = c0544Ii.A0L();
                    c0544Ii.A0Z(2);
                    i++;
                    i2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.D5
    public final CL A4R() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.CL
    public final long A65() {
        return this.A04.A01.A01();
    }

    @Override // com.facebook.ads.redexgen.X.CL
    public final CK A6t(long j) {
        long[] jArr = null;
        ZF zf = this;
        int iA0B = C0560Iy.A0B(zf.A02, zf.A04.A04(j), true, true);
        long jA03 = zf.A04.A03(zf.A02[iA0B]);
        CM cm = new CM(jA03, zf.A00 + zf.A03[iA0B]);
        char c2 = jA03 < j ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    zf = zf;
                    jArr = zf.A02;
                    if (iA0B != jArr.length - 1) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return new CK(cm);
                case 4:
                    ZF zf2 = zf;
                    ZG zg = zf2.A04;
                    long seekPosition = jArr[iA0B + 1];
                    long jA032 = zg.A03(seekPosition);
                    long j2 = zf2.A00;
                    long seekPosition2 = zf2.A03[iA0B + 1];
                    return new CK(cm, new CM(jA032, j2 + seekPosition2));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CL
    public final boolean A7n() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.D5
    public final long AC4(CD cd) throws InterruptedException, IOException {
        long j = this.A01;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.A01 = -1L;
        return j2;
    }

    @Override // com.facebook.ads.redexgen.X.D5
    public final long ADS(long j) {
        long jA04 = this.A04.A04(j);
        this.A01 = this.A02[C0560Iy.A0B(this.A02, jA04, true, true)];
        return jA04;
    }
}
