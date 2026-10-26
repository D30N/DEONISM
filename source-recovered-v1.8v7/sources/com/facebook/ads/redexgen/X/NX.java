package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class NX {
    public static byte[] A08;
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final String A07;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 29);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A08 = new byte[]{2, 7, 2, 13, 2, -6, 5, -8, 14, 11, 5, -55, -44, -46, -60, -56, -44, -45, -39, -54, -45, -39, -60, -47, -44, -58, -55, -54, -55, -60, -46, -40, -68, -65, -79, -76, -81, -74, -71, -66, -71, -61, -72, -81, -67, -61, -113, -126, -112, -115, -116, -117, -112, -126, 124, -126, -117, -127, 124, -118, -112, -8, -5, -19, -16, -21, -1, 0, -19, -2, 0, -21, -7, -1, -10, -17, -4, -14, -6, -13, 0, -19, 2, -9, -5, -13, -19, -5, 1, -82, -98, -83, -86, -89, -89, -102, -83, -96, -100, -97, -76, -102, -88, -82, -75, -89, -75, -75, -85, -79, -80, -95, -88, -85, -80, -85, -75, -86, -95, -81, -75};
    }

    public NX(String str, long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.A07 = str;
        this.A01 = j;
        this.A03 = j2;
        this.A04 = j3;
        this.A00 = j4;
        this.A05 = j5;
        this.A02 = j6;
        this.A06 = j7;
    }

    public final Map<String, String> A02() {
        HashMap map = new HashMap(7);
        map.put(A00(0, 11, k.AppCompatTheme_windowNoTitle), this.A07);
        map.put(A00(74, 15, 113), String.valueOf(this.A01));
        map.put(A00(61, 13, 111), String.valueOf(this.A03));
        map.put(A00(46, 15, 0), String.valueOf(this.A04));
        map.put(A00(11, 21, 72), String.valueOf(this.A00));
        map.put(A00(89, 15, 30), String.valueOf(this.A05));
        map.put(A00(32, 14, 51), String.valueOf(this.A02));
        map.put(A00(104, 17, 37), String.valueOf(this.A06));
        return map;
    }
}
