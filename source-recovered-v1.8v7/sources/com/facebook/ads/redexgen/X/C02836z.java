package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.util.Base64;
import java.io.File;
import java.security.spec.InvalidParameterSpecException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.facebook.ads.redexgen.X.6z, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02836z {
    public static byte[] A00;

    static {
        A03();
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 26);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A00 = new byte[]{-92, -53, -62, -62, 118, -104, -102, 118, -87, -69, -55, -55, -65, -59, -60, 118, -97, -70, -50, -13, -5, -26, -15, -18, -23, -91, -47, -22, -13, -20, -7, -19, -120, -121, -120, -103, -108, -116, -100, 126, -103, -86, -83, -83, -78, -73, -80, -48, -11, -3, -24, -13, -16, -21, -89, -48, -11, -9, -4, -5, -64, -22, -19, -11, -28, -25, -15, -26, -103, -71, -3, -1, -67, -30, -22, -43, -32, -35, -40, -108, -67, -54};
    }

    @SuppressLint({"CatchGeneralException", "BadMethodUse-java.lang.String.length"})
    public static String A01(String str, String str2) {
        try {
            String[] strArrSplit = str2.split(A00(68, 2, 35));
            if (strArrSplit != null && strArrSplit.length != 0) {
                String str3 = strArrSplit[strArrSplit.length - 1];
                if (str3.length() == 16) {
                    return A02(str, str3);
                }
                throw new InvalidParameterSpecException(A00(18, 14, 107));
            }
            throw new IllegalArgumentException(A00(0, 18, 60));
        } catch (Throwable th) {
            AnonymousClass66.A03(th);
            return A00(70, 2, 104);
        }
    }

    @SuppressLint({"TrulyRandom", "BadMethodUse-java.lang.String.length"})
    public static String A02(String str, String str2) throws Throwable {
        char c2 = str != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    str2 = str2;
                    if (str2 == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    str = str;
                    if (!str.isEmpty()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 4:
                    str2 = str2;
                    if (!str2.isEmpty()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    String str3 = str2;
                    int length = str3.length();
                    StringBuilder sb = new StringBuilder();
                    String strA00 = A00(60, 8, 100);
                    sb.append(strA00);
                    sb.append(File.separatorChar);
                    sb.append(A00(32, 3, 43));
                    sb.append(File.separatorChar);
                    sb.append(A00(35, 12, 47));
                    Cipher cipher = Cipher.getInstance(sb.toString());
                    SecretKeySpec secretKeySpec = new SecretKeySpec(str3.getBytes(), strA00);
                    byte[] ivBytes = A04(str3.substring(0, length / 2).getBytes(), str3.substring(length / 2, length).getBytes());
                    cipher.init(1, secretKeySpec, new IvParameterSpec(ivBytes));
                    byte[] ivBytes2 = str.getBytes();
                    return Base64.encodeToString(cipher.doFinal(ivBytes2), 0);
                case 6:
                    throw new IllegalArgumentException(A00(47, 13, 109));
            }
        }
    }

    public static byte[] A04(byte[] bArr, byte[] bArr2) throws NullPointerException {
        byte[] bArr3 = null;
        int i = 0;
        char c2 = bArr != null ? (char) 2 : '\b';
        while (true) {
            switch (c2) {
                case 2:
                    bArr2 = bArr2;
                    if (bArr2 == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    bArr = bArr;
                    bArr2 = bArr2;
                    if (bArr.length != bArr2.length) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    bArr = bArr;
                    bArr3 = new byte[bArr.length];
                    i = 0;
                    c2 = 5;
                    break;
                case 5:
                    bArr = bArr;
                    if (i >= bArr.length) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    bArr = bArr;
                    bArr2 = bArr2;
                    bArr3 = bArr3;
                    bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
                    i++;
                    c2 = 5;
                    break;
                case 7:
                    return bArr3;
                case '\b':
                    throw new NullPointerException(A00(72, 10, 90));
            }
        }
    }
}
