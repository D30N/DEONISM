package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1080bQ implements HW {
    public static byte[] A08;
    public int A00;
    public int A01;
    public int A02;
    public HV[] A03;
    public final int A04;
    public final boolean A05;
    public final byte[] A06;
    public final HV[] A07;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        int i4 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    bArrCopyOfRange = bArrCopyOfRange;
                    if (i4 >= bArrCopyOfRange.length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    bArrCopyOfRange = bArrCopyOfRange;
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 90);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A08 = new byte[]{-36, -48, -55, -30, -39, -20, -28, -39, -41, -24, -39, -40, -108, -43, -32, -32, -29, -41, -43, -24, -35, -29, -30, -82, -108};
    }

    public C1080bQ(boolean z, int i) {
        this(z, i, 0);
    }

    public C1080bQ(boolean z, int i, int i2) {
        IJ.A03(i > 0);
        IJ.A03(i2 >= 0);
        this.A05 = z;
        this.A04 = i;
        this.A01 = i2;
        this.A03 = new HV[i2 + 100];
        if (i2 > 0) {
            this.A06 = new byte[i2 * i];
            for (int i3 = 0; i3 < i2; i3++) {
                this.A03[i3] = new HV(this.A06, i3 * i);
            }
        } else {
            this.A06 = null;
        }
        this.A07 = new HV[1];
    }

    public final synchronized int A02() {
        return this.A00 * this.A04;
    }

    public final synchronized void A03() {
        if (this.A05) {
            A04(0);
        }
    }

    public final synchronized void A04(int i) {
        boolean z = i < this.A02;
        this.A02 = i;
        if (z) {
            ADe();
        }
    }

    @Override // com.facebook.ads.redexgen.X.HW
    public final synchronized HV A3M() {
        HV hv;
        this.A00++;
        if (this.A01 > 0) {
            HV[] hvArr = this.A03;
            int i = this.A01 - 1;
            this.A01 = i;
            hv = hvArr[i];
            this.A03[this.A01] = null;
        } else {
            hv = new HV(new byte[this.A04], 0);
        }
        return hv;
    }

    @Override // com.facebook.ads.redexgen.X.HW
    public final int A6Q() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.HW
    public final synchronized void ACK(HV hv) {
        this.A07[0] = hv;
        ACL(this.A07);
    }

    @Override // com.facebook.ads.redexgen.X.HW
    public final synchronized void ACL(HV[] hvArr) {
        if (this.A01 + hvArr.length >= this.A03.length) {
            this.A03 = (HV[]) Arrays.copyOf(this.A03, Math.max(this.A03.length * 2, this.A01 + hvArr.length));
        }
        for (HV hv : hvArr) {
            if (hv.A01 == this.A06 || hv.A01.length == this.A04) {
                HV[] hvArr2 = this.A03;
                int i = this.A01;
                this.A01 = i + 1;
                hvArr2[i] = hv;
            } else {
                throw new IllegalArgumentException(A00(2, 23, 26) + System.identityHashCode(hv.A01) + A00(0, 2, 86) + System.identityHashCode(this.A06) + A00(0, 2, 86) + hv.A01.length + A00(0, 2, 86) + this.A04);
            }
        }
        this.A00 -= hvArr.length;
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.X.HW
    public final synchronized void ADe() {
        int lowIndex = Math.max(0, C0560Iy.A04(this.A02, this.A04) - this.A00);
        if (lowIndex >= this.A01) {
            return;
        }
        if (this.A06 != null) {
            int i = 0;
            int i2 = this.A01 - 1;
            while (i <= i2) {
                HV hv = this.A03[i];
                if (hv.A01 == this.A06) {
                    i++;
                } else {
                    HV hv2 = this.A03[i2];
                    if (hv2.A01 != this.A06) {
                        i2--;
                    } else {
                        int highIndex = i + 1;
                        this.A03[i] = hv2;
                        this.A03[i2] = hv;
                        i2--;
                        i = highIndex;
                    }
                }
            }
            lowIndex = Math.max(lowIndex, i);
            if (lowIndex >= this.A01) {
                return;
            }
        }
        Arrays.fill(this.A03, lowIndex, this.A01, (Object) null);
        this.A01 = lowIndex;
    }
}
