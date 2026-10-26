package com.facebook.ads.redexgen.X;

import com.facebook.ads.VideoStartReason;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum PC {
    A04(VideoStartReason.NOT_STARTED),
    A05(VideoStartReason.USER_STARTED),
    A03(VideoStartReason.AUTO_STARTED);

    public static byte[] A01;
    public final VideoStartReason A00;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 81);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A01 = new byte[]{41, 40, 51, 56, 52, 51, 38, 53, 51, 34, 35, 71, 83, 82, 73, 89, 85, 82, 71, 84, 82, 67, 66, 87, 81, 71, 80, 93, 81, 86, 67, 80, 86, 71, 70};
    }

    static {
        A02();
    }

    PC(VideoStartReason videoStartReason) {
        this.A00 = videoStartReason;
    }

    public static PC A00(VideoStartReason videoStartReason) {
        PC pc = null;
        PC[] pcArrValues = values();
        int length = pcArrValues.length;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= length) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    videoStartReason = videoStartReason;
                    pcArrValues = pcArrValues;
                    pc = pcArrValues[i];
                    if (pc.A00 != videoStartReason) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return pc;
                case 5:
                    i++;
                    c2 = 2;
                    break;
                case 6:
                    return A04;
            }
        }
    }
}
