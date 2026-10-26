package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class DJ {
    public static final byte[] A04 = {0, 0, 1};
    public int A00;
    public int A01;
    public byte[] A02;
    public boolean A03;

    public DJ(int i) {
        this.A02 = new byte[i];
    }

    public final void A00() {
        this.A03 = false;
        this.A00 = 0;
        this.A01 = 0;
    }

    public final void A01(byte[] bArr, int i, int i2) {
        DJ dj = this;
        int i3 = 0;
        byte[] bArr2 = null;
        int i4 = 0;
        char c2 = !dj.A03 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    dj = dj;
                    i3 = i2 - i;
                    bArr2 = dj.A02;
                    int length = bArr2.length;
                    i4 = dj.A00;
                    if (length >= i4 + i3) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    dj = dj;
                    bArr2 = bArr2;
                    dj.A02 = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                    c2 = 5;
                    break;
                case 5:
                    DJ dj2 = dj;
                    System.arraycopy(bArr, i, dj2.A02, dj2.A00, i3);
                    dj2.A00 += i3;
                    return;
            }
        }
    }

    public final boolean A02(int i, int i2) {
        DJ dj = this;
        char c2 = dj.A03 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    dj = dj;
                    dj.A00 -= i2;
                    if (dj.A01 != 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i != 181) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    dj = dj;
                    dj.A01 = dj.A00;
                    c2 = 5;
                    break;
                case 5:
                    byte[] bArr = A04;
                    dj.A01(bArr, 0, bArr.length);
                    return false;
                case 6:
                    if (i != 179) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    dj = dj;
                    dj.A03 = true;
                    c2 = 5;
                    break;
                case '\b':
                    dj.A03 = false;
                    return true;
            }
        }
    }
}
