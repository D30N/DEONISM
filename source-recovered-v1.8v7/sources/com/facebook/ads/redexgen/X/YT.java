package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class YT extends BR {
    public static byte[] A04;
    public long A00;
    public ByteBuffer A01;
    public final BU A02 = new BU();
    public final int A03;

    static {
        A05();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 58);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A05() {
        A04 = new byte[]{28, 43, 56, 56, 59, 44, 126, 42, 49, 49, 126, 45, 51, 63, 50, 50, 126, 118, 73, 85, 73, 76};
    }

    public YT(int i) {
        this.A03 = i;
    }

    public static YT A02() {
        return new YT(0);
    }

    private ByteBuffer A04(int i) {
        YT yt = this;
        ByteBuffer byteBuffer = null;
        int iCapacity = 0;
        int i2 = yt.A03;
        char c2 = i2 == 1 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return ByteBuffer.allocate(i);
                case 3:
                    if (i2 != 2) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return ByteBuffer.allocateDirect(i);
                case 5:
                    yt = yt;
                    byteBuffer = yt.A01;
                    if (byteBuffer != null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    iCapacity = 0;
                    c2 = 7;
                    break;
                case 7:
                    throw new IllegalStateException(A03(0, 18, 100) + iCapacity + A03(18, 3, 83) + i + A03(21, 1, 95));
                case '\b':
                    byteBuffer = byteBuffer;
                    iCapacity = byteBuffer.capacity();
                    c2 = 7;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.BR
    public final void A07() {
        super.A07();
        ByteBuffer byteBuffer = this.A01;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final void A08() {
        this.A01.flip();
    }

    public final void A09(int position) throws IllegalStateException {
        YT yt = this;
        int requiredCapacity = 0;
        int i = 0;
        ByteBuffer byteBufferA04 = null;
        ByteBuffer byteBuffer = yt.A01;
        char c2 = byteBuffer == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    YT yt2 = yt;
                    ByteBuffer newData = yt2.A04(position);
                    yt2.A01 = newData;
                    return;
                case 3:
                    yt = yt;
                    byteBuffer = byteBuffer;
                    int iCapacity = byteBuffer.capacity();
                    ByteBuffer newData2 = yt.A01;
                    requiredCapacity = newData2.position();
                    i = requiredCapacity + position;
                    if (iCapacity < i) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return;
                case 5:
                    yt = yt;
                    byteBufferA04 = yt.A04(i);
                    if (requiredCapacity <= 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    yt = yt;
                    byteBufferA04 = byteBufferA04;
                    yt.A01.position(0);
                    ByteBuffer newData3 = yt.A01;
                    newData3.limit(requiredCapacity);
                    ByteBuffer newData4 = yt.A01;
                    byteBufferA04.put(newData4);
                    c2 = 7;
                    break;
                case 7:
                    yt.A01 = byteBufferA04;
                    return;
            }
        }
    }

    public final boolean A0A() {
        return A06(1073741824);
    }

    public final boolean A0B() {
        YT yt = this;
        boolean z = false;
        char c2 = yt.A01 == null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    yt = yt;
                    if (yt.A03 != 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z = true;
                    c2 = 4;
                    break;
                case 4:
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }
}
