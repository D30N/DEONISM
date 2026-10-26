package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class ZJ extends D8 {
    public static byte[] A01;
    public static final int A02;
    public static final byte[] A03;
    public boolean A00;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 104);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A01 = new byte[]{2, 22, 7, 10, 12, 76, 12, 19, 22, 16, 101, 90, 95, 89};
    }

    static {
        A02();
        A02 = C0560Iy.A08(A01(10, 4, 66));
        A03 = new byte[]{79, 112, 117, 115, 72, 101, 97, 100};
    }

    private long A00(byte[] bArr) {
        int config = 0;
        int length = 0;
        int i = 0;
        char c2 = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = bArr[0] & 255;
        int i5 = i4 & 3;
        char c3 = i5 != 0 ? (char) 2 : (char) 14;
        while (true) {
            switch (c3) {
                case 2:
                    c2 = 1;
                    if (i5 == 1) {
                        c3 = '\r';
                        break;
                    } else {
                        c3 = 3;
                        break;
                    }
                case 3:
                    if (i5 == 2) {
                        c3 = '\r';
                        break;
                    } else {
                        c3 = 4;
                        break;
                    }
                case 4:
                    bArr = bArr;
                    i3 = bArr[c2] & 63;
                    c3 = 5;
                    break;
                case 5:
                    config = i4 >> 3;
                    i2 = config & 3;
                    if (config < 16) {
                        c3 = '\b';
                        break;
                    } else {
                        c3 = 6;
                        break;
                    }
                case 6:
                    length = 2500 << i2;
                    c3 = 7;
                    break;
                case 7:
                    return i3 * length;
                case '\b':
                    i = 10000;
                    if (config < 12) {
                        c3 = '\n';
                        break;
                    } else {
                        c3 = '\t';
                        break;
                    }
                case '\t':
                    length = i << (i2 & 1);
                    c3 = 7;
                    break;
                case '\n':
                    if (i2 != 3) {
                        c3 = '\f';
                        break;
                    } else {
                        c3 = 11;
                        break;
                    }
                case 11:
                    length = 60000;
                    c3 = 7;
                    break;
                case '\f':
                    length = i << i2;
                    c3 = 7;
                    break;
                case '\r':
                    i3 = 2;
                    c3 = 5;
                    break;
                case 14:
                    i3 = 1;
                    c3 = 5;
                    break;
            }
        }
    }

    private void A03(List<byte[]> list, int i) {
        list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((i * 1000000000) / 48000).array());
    }

    public static boolean A04(C0544Ii c0544Ii) {
        int iA04 = c0544Ii.A04();
        byte[] bArr = A03;
        if (iA04 < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        c0544Ii.A0c(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, A03);
    }

    @Override // com.facebook.ads.redexgen.X.D8
    public final long A07(C0544Ii c0544Ii) {
        return A04(A00(c0544Ii.A00));
    }

    @Override // com.facebook.ads.redexgen.X.D8
    public final void A09(boolean z) {
        super.A09(z);
        if (z) {
            this.A00 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.D8
    public final boolean A0A(C0544Ii c0544Ii, long j, D7 d7) throws InterruptedException, IOException {
        C0544Ii c0544Ii2 = c0544Ii;
        boolean z = true;
        char c2 = !this.A00 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    ZJ zj = this;
                    byte[] bArrCopyOf = Arrays.copyOf(c0544Ii2.A00, c0544Ii2.A07());
                    int i = bArrCopyOf[9] & 255;
                    int i2 = ((bArrCopyOf[11] & 255) << 8) | (bArrCopyOf[10] & 255);
                    ArrayList arrayList = new ArrayList(3);
                    arrayList.add(bArrCopyOf);
                    zj.A03(arrayList, i2);
                    zj.A03(arrayList, 3840);
                    d7.A00 = Format.A07(null, A01(0, 10, 11), null, -1, -1, i, 48000, arrayList, null, 0, null);
                    zj.A00 = z;
                    return z;
                case 3:
                    c0544Ii2 = c0544Ii2;
                    if (c0544Ii2.A08() != A02) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0544Ii2.A0Y(0);
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }
}
