package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Lo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0625Lo {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 48);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A00 = new byte[]{-66, -54, -55, -55, -64, -66, -49, -60, -47, -60, -49, -44, -70, -57, -67, -53, -56, -62, -67, -121, -55, -66, -53, -58, -62, -52, -52, -62, -56, -57, -121, -102, -100, -100, -98, -84, -84, -72, -89, -98, -83, -80, -88, -85, -92, -72, -84, -83, -102, -83, -98};
    }

    public static EnumC0624Ln A00(Context context) {
        NetworkInfo networkInfo = null;
        char c2 = context.checkCallingOrSelfPermission(A01(12, 39, 41)) != 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return EnumC0624Ln.A08;
                case 3:
                    context = context;
                    networkInfo = ((ConnectivityManager) context.getSystemService(A01(0, 12, 43))).getActiveNetworkInfo();
                    if (networkInfo == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    networkInfo = networkInfo;
                    if (!networkInfo.isConnected()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    return EnumC0624Ln.A07;
                case 6:
                    networkInfo = networkInfo;
                    if (networkInfo.getType() != 0) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    networkInfo = networkInfo;
                    switch (networkInfo.getSubtype()) {
                        case 1:
                            c2 = '\t';
                            break;
                        case 2:
                            c2 = '\t';
                            break;
                        case 3:
                            c2 = '\n';
                            break;
                        case 4:
                            c2 = '\t';
                            break;
                        case 5:
                            c2 = '\n';
                            break;
                        case 6:
                            c2 = '\n';
                            break;
                        case 7:
                            c2 = '\t';
                            break;
                        case 8:
                            c2 = '\n';
                            break;
                        case 9:
                            c2 = '\n';
                            break;
                        case 10:
                            c2 = '\n';
                            break;
                        case 11:
                            c2 = '\t';
                            break;
                        case 12:
                            c2 = '\n';
                            break;
                        case 13:
                            c2 = 11;
                            break;
                        case 14:
                            c2 = '\n';
                            break;
                        case 15:
                            c2 = '\n';
                            break;
                        default:
                            c2 = '\b';
                            break;
                    }
                case '\b':
                    return EnumC0624Ln.A08;
                case '\t':
                    return EnumC0624Ln.A03;
                case '\n':
                    return EnumC0624Ln.A04;
                case 11:
                    return EnumC0624Ln.A05;
                case '\f':
                    return EnumC0624Ln.A06;
            }
        }
    }
}
