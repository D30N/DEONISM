package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.0k, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01150k {
    public static byte[] A06;
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List<String> A05;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 125);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A06 = new byte[]{61, 76, 76, 79, 69, 80, 65, 59, 81, 78, 72, 33, 21, 38, 31, 25, 40, 19, 41, 38, 29, -34, -19, -19, -16, -26, -15, -30, 45, 40, 51, 51, 41, 40, 42, 50, 38, 60, 57, 51, 47, 32, 34, 42, 32, 38, 36, -16, -22, -2, -28, -19, -26, -8, -19, -22, -8};
    }

    public C01150k(String str, String str2, String str3, List<String> mKeyHashes, String str4, String str5) {
        this.A04 = str;
        this.A01 = str2;
        this.A00 = str3;
        this.A05 = mKeyHashes;
        this.A03 = str4;
        this.A02 = str5;
    }

    /* JADX WARN: Incorrect condition in loop: B:9:0x0044 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.C01150k A00(org.json.JSONObject r8) {
        /*
            if (r8 != 0) goto L4
            r0 = 0
            return r0
        L4:
            r2 = 40
            r1 = 7
            r0 = 66
            java.lang.String r0 = A01(r2, r1, r0)
            java.lang.String r3 = r8.optString(r0)
            r2 = 21
            r1 = 7
            r0 = 0
            java.lang.String r0 = A01(r2, r1, r0)
            java.lang.String r4 = r8.optString(r0)
            r2 = 0
            r1 = 11
            r0 = 95
            java.lang.String r0 = A01(r2, r1, r0)
            java.lang.String r5 = r8.optString(r0)
            r2 = 47
            r1 = 10
            r0 = 8
            java.lang.String r0 = A01(r2, r1, r0)
            org.json.JSONArray r2 = r8.optJSONArray(r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            if (r2 == 0) goto L50
            r1 = 0
        L40:
            int r0 = r2.length()
            if (r1 >= r0) goto L50
            java.lang.String r0 = r2.optString(r1)
            r6.add(r0)
            int r1 = r1 + 1
            goto L40
        L50:
            r2 = 11
            r1 = 10
            r0 = 55
            java.lang.String r0 = A01(r2, r1, r0)
            java.lang.String r7 = r8.optString(r0)
            r2 = 28
            r1 = 12
            r0 = 74
            java.lang.String r0 = A01(r2, r1, r0)
            java.lang.String r8 = r8.optString(r0)
            com.facebook.ads.redexgen.X.0k r2 = new com.facebook.ads.redexgen.X.0k
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C01150k.A00(org.json.JSONObject):com.facebook.ads.redexgen.X.0k");
    }

    public final String A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }

    public final String A05() {
        return this.A04;
    }
}
