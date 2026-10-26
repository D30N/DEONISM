package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1079bP implements InterfaceC0516He {
    public static byte[] A03;
    public int A00;
    public C0520Hi A01;
    public byte[] A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 107);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A03 = new byte[]{10, 49, 48, 66, 52, 5, 3, -28, -64, -39, -48, -29, -37, -48, -50, -33, -48, -49, -117, -64, -67, -76, -117, -47, -38, -35, -40, -52, -33, -91, -117, 32, 30, -8, 12, 30, 14, 20, 20, 29, 74, 74, 71, 74, -8, 79, 64, 65, 68, 61, -8, 72, 57, 74, 75, 65, 70, 63, -8, 26, 57, 75, 61, 14, 12, -8, 61, 70, 59, 71, 60, 61, 60, -8, 75, 76, 74, 65, 70, 63, 18, -8, -7, -10, 9, -10, 23, 48, 53, 55, 50, 50, 49, 52, 54, 39, 38, -30, 53, 37, 42, 39, 47, 39, -4, -30};
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0516He
    public final Uri A7F() {
        Uri uri = null;
        C0520Hi c0520Hi = this.A01;
        char c2 = c0520Hi != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0520Hi = c0520Hi;
                    uri = c0520Hi.A04;
                    c2 = 3;
                    break;
                case 3:
                    return uri;
                case 4:
                    uri = null;
                    c2 = 3;
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
    
        return r3.A02.length;
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0516He
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long ABU(com.facebook.ads.redexgen.X.C0520Hi r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1079bP.ABU(com.facebook.ads.redexgen.X.Hi):long");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0516He
    public final void close() throws IOException {
        this.A01 = null;
        this.A02 = null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0516He
    public final int read(byte[] bArr, int i, int i2) {
        C1079bP c1079bP = this;
        int length = 0;
        char c2 = i2 == 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return 0;
                case 3:
                    c1079bP = c1079bP;
                    length = c1079bP.A02.length - c1079bP.A00;
                    if (length != 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return -1;
                case 5:
                    C1079bP c1079bP2 = c1079bP;
                    int iMin = Math.min(i2, length);
                    System.arraycopy(c1079bP2.A02, c1079bP2.A00, bArr, i, iMin);
                    c1079bP2.A00 += iMin;
                    return iMin;
            }
        }
    }
}
