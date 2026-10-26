package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class LV {
    public static byte[] A00;

    static {
        A05();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 108);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A05() {
        A00 = new byte[]{10, 1, -14, -18, 15, -64, 19, 21, 3, 8, -64, 1, 12, 7, 15, 18, 9, 20, 8, 13, -50, -63, -28, -25, -32, -101, -23, -22, -17, -101, -31, -22, -16, -23, -33, -101, -22, -19, -101, -23, -22, -17, -101, -36, -34, -34, -32, -18, -18, -28, -35, -25, -32, -87, -17, -11, -58, 11, 30, 9, 11, 22, 26, 15, 21, 20, -44};
    }

    @Nullable
    public static String A01(File file) throws Exception {
        FileInputStream fileInputStream;
        int i;
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance(A00(0, 3, 81));
                        byte[] bArr = new byte[1024];
                        do {
                            i = fileInputStream.read(bArr);
                            if (i > 0) {
                                messageDigest.update(bArr, 0, i);
                            }
                        } while (i != -1);
                        return A04(messageDigest.digest());
                    } catch (IOException unused) {
                        throw new Exception(A00(54, 13, 58));
                    }
                } catch (NoSuchAlgorithmException unused2) {
                    throw new Exception(A00(3, 18, 52));
                }
            } catch (FileNotFoundException unused3) {
                throw new Exception(A00(21, 33, 15));
            }
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException unused4) {
            }
        }
    }

    @Nullable
    public static final String A02(String str) throws Exception {
        return A01(new File(str));
    }

    public static String A03(byte[] bArr) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int two_halfs = 0;
        byte b2 = 0;
        StringBuilder sb = new StringBuilder();
        int length = bArr.length;
        int i4 = 0;
        int halfbyte = 2;
        while (true) {
            switch (halfbyte) {
                case 2:
                    if (i4 >= length) {
                        halfbyte = 11;
                        break;
                    } else {
                        halfbyte = 3;
                        break;
                    }
                case 3:
                    bArr = bArr;
                    b2 = bArr[i4];
                    two_halfs = (b2 >>> 4) & 15;
                    i3 = 0;
                    halfbyte = 4;
                    break;
                case 4:
                    if (two_halfs < 0) {
                        halfbyte = 10;
                        break;
                    } else {
                        halfbyte = 5;
                        break;
                    }
                case 5:
                    if (two_halfs > 9) {
                        halfbyte = 10;
                        break;
                    } else {
                        halfbyte = 6;
                        break;
                    }
                case 6:
                    i2 = two_halfs + 48;
                    halfbyte = 7;
                    break;
                case 7:
                    sb = sb;
                    sb.append((char) i2);
                    two_halfs = b2 & 15;
                    i = i3 + 1;
                    if (i3 < 1) {
                        halfbyte = 9;
                        break;
                    } else {
                        halfbyte = 8;
                        break;
                    }
                case 8:
                    i4++;
                    halfbyte = 2;
                    break;
                case 9:
                    i3 = i;
                    halfbyte = 4;
                    break;
                case 10:
                    i2 = (two_halfs - 10) + 97;
                    halfbyte = 7;
                    break;
                case 11:
                    return sb.toString();
            }
        }
    }

    public static String A04(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        int length = bArr.length;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    bArr = bArr;
                    sb = sb;
                    byte b2 = bArr[i];
                    sb.append(Integer.toString((b2 & 255) + 256, 16).substring(1));
                    i++;
                    c2 = 2;
                    break;
                case 4:
                    return sb.toString();
            }
        }
    }
}
