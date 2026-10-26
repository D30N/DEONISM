package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: assets/audience_network.dex */
public final class KU {
    public static Map<String, Long> A00;
    public static Map<String, Long> A01;
    public static Map<String, String> A02;
    public static byte[] A03;

    public static String A01(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 59);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A03 = new byte[]{58, 56, 41, 17, 60, 46, 41, 15, 56, 46, 45, 50, 51, 46, 56, 31, 73, 0, 31, 73, 0, 31, 73, 0, 31, 94, 0, 31, 94, 0, 31, 94, 104, 105, 61, 107, 61, 106, 104, 57, 95, 121, 99, 100, 109, 42, 102, 107, 121, 126, 42, 107, 110, 42, 120, 111, 121, 122, 101, 100, 121, 111};
    }

    static {
        A04();
        A01 = new ConcurrentHashMap();
        A00 = new ConcurrentHashMap();
        A02 = new ConcurrentHashMap();
    }

    public static long A00(String str, K8 k8) {
        int i = 0;
        long j = 0;
        char c2 = A01.containsKey(str) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return A01.get(str).longValue();
                case 3:
                    k8 = k8;
                    i = KT.A00[k8.ordinal()];
                    if (i == 1) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    j = -1000;
                    if (i == 2) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i == 3) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return j;
                case 7:
                    return j;
                case '\b':
                    return 15000L;
            }
        }
    }

    public static String A02(KV kv) {
        KJ.A05(A01(0, 15, 102), A01(40, 22, 49), A01(32, 8, 100));
        return A02.get(A03(kv));
    }

    public static String A03(KV kv) {
        int iA00 = 0;
        char c2 = 0;
        Locale locale = Locale.US;
        Object[] objArr = new Object[6];
        int iA01 = 0;
        objArr[0] = kv.A08();
        objArr[1] = kv.A04();
        objArr[2] = kv.A05();
        char c3 = kv.A07() == null ? (char) 2 : (char) 6;
        while (true) {
            switch (c3) {
                case 2:
                    iA00 = 0;
                    c3 = 3;
                    break;
                case 3:
                    kv = kv;
                    objArr = objArr;
                    objArr[3] = Integer.valueOf(iA00);
                    c2 = 4;
                    if (kv.A07() != null) {
                        c3 = 5;
                        break;
                    } else {
                        c3 = 4;
                        break;
                    }
                case 4:
                    Object[] objArr2 = objArr;
                    objArr2[c2] = Integer.valueOf(iA01);
                    objArr2[5] = Integer.valueOf(kv.A03());
                    return String.format(locale, A01(15, 17, 1), objArr2);
                case 5:
                    kv = kv;
                    iA01 = kv.A07().A01();
                    c3 = 4;
                    break;
                case 6:
                    kv = kv;
                    iA00 = kv.A07().A00();
                    c3 = 3;
                    break;
            }
        }
    }

    public static void A05(long j, KV kv) {
        A01.put(A03(kv), Long.valueOf(j));
    }

    public static void A06(KV kv) {
        A00.put(A03(kv), Long.valueOf(System.currentTimeMillis()));
    }

    public static void A07(String str, KV kv) {
        A02.put(A03(kv), str);
    }

    public static boolean A08(KV kv) {
        String strA03 = A03(kv);
        boolean z = false;
        char c2 = !A00.containsKey(strA03) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return false;
                case 3:
                    kv = kv;
                    strA03 = strA03;
                    if (System.currentTimeMillis() - A00.get(strA03).longValue() >= A00(strA03, kv.A04())) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z = true;
                    c2 = 5;
                    break;
                case 5:
                    return z;
            }
        }
    }
}
