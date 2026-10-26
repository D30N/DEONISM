package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.8t, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03198t {
    public static byte[] A0F;
    public static final AdPlacementType A0G;
    public static final String A0H;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public AdPlacementType A0B;
    public List<C03178r> A0C;
    public boolean A0D;
    public final long A0E = System.currentTimeMillis();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C03198t(java.util.Map<java.lang.String, java.lang.String> r12) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C03198t.<init>(java.util.Map):void");
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 9);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A0F = new byte[]{40, 55, 58, 59, 49, 1, 42, 55, 51, 59, 1, 46, 49, 50, 50, 55, 48, 57, 1, 55, 48, 42, 59, 44, 40, 63, 50, 102, 114, 109, 97, 115, 101, 102, 109, 104, 109, 112, 125, 91, 103, 108, 97, 103, 111, 91, 109, 106, 112, 97, 118, 114, 101, 104, 17, 13, 0, 2, 4, 12, 4, 15, 21, 62, 9, 4, 8, 6, 9, 21, 124, 107, 104, 124, 107, 125, 102, 59, 55, 54, 46, 7, 44, 42, 57, 59, 51, 49, 54, 63, 7, 60, 57, 44, 57, 35, 36, 60, 43, 38, 35, 46, 43, 62, 35, 37, 36, 21, 46, 63, 56, 43, 62, 35, 37, 36, 21, 35, 36, 21, 57, 47, 41, 37, 36, 46, 57, 104, 101, 108, 121, 69, 71, 69, 78, 67, 71, 68, 74, 67, 32, 63, 51, 33, 55, 52, 63, 58, 63, 34, 47, 9, 53, 62, 51, 53, 61, 9, 34, 63, 53, 61, 51, 36, 44, 51, 63, 45, 59, 56, 51, 54, 51, 46, 35, 5, 57, 50, 63, 57, 49, 5, 51, 52, 51, 46, 51, 59, 54, 5, 62, 63, 54, 59, 35, 46, 57, 58, 46, 57, 47, 52, 3, 40, 52, 46, 57, 47, 52, 51, 48, 56, 60, 67, 104, 106, 102, 110, 105, 58, 108, 18, 47, 39, 62, 37, 50, 36, 106, 40, 44, 43, 26, 51, 44, 32, 50, 36, 39, 44, 41, 44, 49, 60, 26, 53, 32, 55, 38, 32, 43, 49, 36, 34, 32, 69, 14, 31, 10, 22, 67, 81, 96, 119, 99, 103, 119, 97, 102, 77, 102, 123, Byte.MAX_VALUE, 119, 125, 103, 102, 126, 98, 111, 109, 107, 99, 107, 96, 122, 81, 121, 103, 106, 122, 102, 5, 34, 42, 47, 38, 39, 99, 55, 44, 99, 48, 38, 55, 99, 32, 44, 44, 40, 42, 38, 109};
    }

    static {
        A02();
        A0H = C03198t.class.getSimpleName();
        A0G = AdPlacementType.UNKNOWN;
    }

    public static C03198t A00(JSONObject jSONObject) {
        Map<String, String> definitionParams = null;
        Iterator<String> itKeys = null;
        char c2 = jSONObject == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (C03198t) null;
                case 3:
                    jSONObject = jSONObject;
                    itKeys = jSONObject.keys();
                    definitionParams = new HashMap<>();
                    c2 = 4;
                    break;
                case 4:
                    itKeys = itKeys;
                    if (!itKeys.hasNext()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    jSONObject = jSONObject;
                    itKeys = itKeys;
                    definitionParams = (HashMap) definitionParams;
                    String next = itKeys.next();
                    definitionParams.put(next, String.valueOf(jSONObject.opt(next)));
                    c2 = 4;
                    break;
                case 6:
                    return new C03198t((HashMap) definitionParams);
            }
        }
    }

    public final int A03() {
        return this.A02 * AdError.NETWORK_ERROR_CODE;
    }

    public final int A04() {
        return this.A03;
    }

    public final int A05() {
        return this.A06;
    }

    public final int A06() {
        return this.A07;
    }

    public final int A07() {
        return this.A08;
    }

    public final int A08() {
        return this.A09;
    }

    public final int A09() {
        return this.A0A;
    }

    public final long A0A() {
        return this.A04 * AdError.NETWORK_ERROR_CODE;
    }

    public final long A0B() {
        return this.A05 * AdError.NETWORK_ERROR_CODE;
    }

    public final long A0C() {
        return this.A0E;
    }

    public final AdPlacementType A0D() {
        return this.A0B;
    }

    public final boolean A0E() {
        return this.A0D;
    }
}
