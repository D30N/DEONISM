package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class J0 {
    public static byte[] A05;
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final List<byte[]> A04;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 12);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A05 = new byte[]{47, 24, 24, 5, 24, 74, 26, 11, 24, 25, 3, 4, 13, 74, 43, 60, 41, 74, 9, 5, 4, 12, 3, 13};
    }

    public J0(List<byte[]> initializationData, int i, int i2, int i3, float f) {
        this.A04 = initializationData;
        this.A02 = i;
        this.A03 = i2;
        this.A01 = i3;
        this.A00 = f;
    }

    public static J0 A00(C0544Ii c0544Ii) throws AF {
        try {
            c0544Ii.A0Z(4);
            int iA0E = (c0544Ii.A0E() & 3) + 1;
            if (iA0E != 3) {
                ArrayList arrayList = new ArrayList();
                int numSequenceParameterSets = c0544Ii.A0E() & 31;
                for (int j = 0; j < numSequenceParameterSets; j++) {
                    arrayList.add(A03(c0544Ii));
                }
                int iA0E2 = c0544Ii.A0E();
                for (int numPictureParameterSets = 0; numPictureParameterSets < iA0E2; numPictureParameterSets++) {
                    arrayList.add(A03(c0544Ii));
                }
                int i = -1;
                int i2 = -1;
                float f = 1.0f;
                if (numSequenceParameterSets > 0) {
                    byte[] bArr = (byte[]) arrayList.get(0);
                    byte[] bArr2 = (byte[]) arrayList.get(0);
                    int height = bArr.length;
                    C0539Id c0539IdA06 = C0540Ie.A06(bArr2, iA0E, height);
                    i = c0539IdA06.A06;
                    i2 = c0539IdA06.A02;
                    f = c0539IdA06.A00;
                }
                return new J0(arrayList, iA0E, i, i2, f);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new AF(A01(0, 24, 102), e);
        }
    }

    public static byte[] A03(C0544Ii c0544Ii) {
        int offset = c0544Ii.A0I();
        int iA06 = c0544Ii.A06();
        c0544Ii.A0Z(offset);
        return IN.A08(c0544Ii.A00, iA06, offset);
    }
}
