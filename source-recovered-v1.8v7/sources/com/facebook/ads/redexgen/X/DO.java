package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class DO {
    public int A00;
    public byte[] A01;
    public boolean A02;
    public boolean A03;
    public final int A04;

    public DO(int i, int i2) {
        this.A04 = i;
        this.A01 = new byte[i2 + 3];
        this.A01[2] = 1;
    }

    public final void A00() {
        this.A03 = false;
        this.A02 = false;
    }

    public final void A01(int i) {
        DO r3 = this;
        boolean z = true;
        IJ.A04(!r3.A03);
        char c2 = i == r3.A04 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    r3 = r3;
                    r3.A03 = z;
                    if (!r3.A03) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    r3 = r3;
                    r3.A00 = 3;
                    r3.A02 = false;
                    c2 = 4;
                    break;
                case 4:
                    return;
                case 5:
                    z = false;
                    c2 = 2;
                    break;
            }
        }
    }

    public final void A02(byte[] bArr, int i, int i2) {
        DO r4 = this;
        int i3 = 0;
        byte[] bArr2 = null;
        int i4 = 0;
        char c2 = !r4.A03 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    r4 = r4;
                    i3 = i2 - i;
                    bArr2 = r4.A01;
                    int length = bArr2.length;
                    i4 = r4.A00;
                    if (length >= i4 + i3) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    r4 = r4;
                    bArr2 = bArr2;
                    r4.A01 = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                    c2 = 5;
                    break;
                case 5:
                    DO r42 = r4;
                    System.arraycopy(bArr, i, r42.A01, r42.A00, i3);
                    r42.A00 += i3;
                    return;
            }
        }
    }

    public final boolean A03() {
        return this.A02;
    }

    public final boolean A04(int i) {
        if (!this.A03) {
            return false;
        }
        this.A00 -= i;
        this.A03 = false;
        this.A02 = true;
        return true;
    }
}
