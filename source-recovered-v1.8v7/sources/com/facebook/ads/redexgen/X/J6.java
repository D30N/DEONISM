package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class J6 {
    public static byte[] A02;
    public final int A00;
    public final List<byte[]> A01;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 126);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A02 = new byte[]{14, 57, 57, 36, 57, 107, 59, 42, 57, 56, 34, 37, 44, 107, 3, 14, 29, 8, 107, 40, 36, 37, 45, 34, 44};
    }

    public J6(List<byte[]> initializationData, int i) {
        this.A01 = initializationData;
        this.A00 = i;
    }

    public static J6 A00(C0544Ii c0544Ii) throws AF {
        try {
            c0544Ii.A0Z(21);
            int csdStartPosition = c0544Ii.A0E() & 3;
            int i = c0544Ii.A0E();
            int numberOfNalUnits = 0;
            int iA06 = c0544Ii.A06();
            for (int i2 = 0; i2 < i; i2++) {
                c0544Ii.A0Z(1);
                int iA0I = c0544Ii.A0I();
                for (int i3 = 0; i3 < iA0I; i3++) {
                    int iA0I2 = c0544Ii.A0I();
                    int csdLength = iA0I2 + 4;
                    numberOfNalUnits += csdLength;
                    c0544Ii.A0Z(iA0I2);
                }
            }
            c0544Ii.A0Y(iA06);
            byte[] bArr = new byte[numberOfNalUnits];
            int i4 = 0;
            for (int bufferPosition = 0; bufferPosition < i; bufferPosition++) {
                c0544Ii.A0Z(1);
                int i5 = c0544Ii.A0I();
                for (int j = 0; j < i5; j++) {
                    int nalUnitLength = c0544Ii.A0I();
                    byte[] bArr2 = C0540Ie.A02;
                    int csdLength2 = C0540Ie.A02.length;
                    System.arraycopy(bArr2, 0, bArr, i4, csdLength2);
                    int csdLength3 = C0540Ie.A02.length;
                    int i6 = i4 + csdLength3;
                    byte[] bArr3 = c0544Ii.A00;
                    int csdLength4 = c0544Ii.A06();
                    System.arraycopy(bArr3, csdLength4, bArr, i6, nalUnitLength);
                    i4 = i6 + nalUnitLength;
                    c0544Ii.A0Z(nalUnitLength);
                }
            }
            int csdLength5 = csdStartPosition + 1;
            return new J6(numberOfNalUnits == 0 ? null : Collections.singletonList(bArr), csdLength5);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new AF(A01(0, 25, 53), e);
        }
    }
}
