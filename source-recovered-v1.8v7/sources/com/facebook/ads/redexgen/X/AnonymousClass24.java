package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.facebook.ads.internal.adreportingconfig.AdReportingReason;
import com.facebook.ads.internal.util.process.ProcessUtils;
import d.b.a.b.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.24, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass24 {
    public static AnonymousClass24 A01;
    public static byte[] A02;
    public static final String[] A03;
    public final SharedPreferences A00;

    public static String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 112);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0N() {
        A02 = new byte[]{87, 64, 85, 74, 87, 81, 122, 68, 65, 122, 74, 85, 81, 76, 74, 75, 86, 3, 20, 1, 30, 3, 5, 46, 16, 21, 46, 23, 30, 29, 29, 30, 6, 46, 4, 1, 46, 25, 20, 16, 21, 24, 31, 22, 122, 101, 97, 124, 122, 123, 74, 97, 112, 109, 97, 91, 86, 68, 67, 104, 66, 71, 83, 86, 67, 82, 83, 104, 67, 94, 90, 82, 68, 67, 86, 90, 71, 57, 53, 58, 53, 51, 49, 11, 53, 48, 11, 36, 38, 49, 50, 49, 38, 49, 58, 55, 49, 39, 38, 42, 40, 107, 35, 36, 38, 32, 39, 42, 42, 46, 107, 36, 33, 54, 107, 4, 1, 26, 23, 0, 21, 10, 23, 17, 12, 11, 2, 26, 6, 10, 11, 3, 12, 2, 106, 108, 68, 69, 72, 73, 115, 77, 72, 115, 72, 73, 95, 79, 94, 69, 92, 88, 69, 67, 66, 105, 126, 107, 116, 105, 111, 114, 117, 124, 0, 12, 3, 12, 10, 8, 50, 12, 9, 50, 29, 31, 8, 11, 8, 31, 8, 3, 14, 8, 30, 50, 24, 31, 4, 45, 34, 37, 34, 56, 35, 46, 47, 20, 57, 46, 59, 36, 57, 63, 20, 42, 47, 60, 55, 54, 51, 59, 45, 58, 49, 0, 55, 58, 62, 59, 54, 49, 56, 56, 25, 86, 4, 19, 6, 25, 4, 2, 86, 23, 18, 86, 25, 6, 2, 31, 25, 24, 5, 14, 17, 0, 38, 24, 20, 38, 16, 38, 10, 28, 28, 16, 23, 30, 38, 13, 17, 16, 10, 10, 1, 0, 5, 13, 27, 12, 7, 54, 6, 25, 29, 0, 6, 7, 26, 86, 77, 84, 84, 124, 115, 116, 115, 105, 114, Byte.MAX_VALUE, 126, 69, 126, Byte.MAX_VALUE, 105, 121, 104, 115, 106, 110, 115, 117, 116, 39, 34, 25, 37, 46, 41, 47, 37, 35, 53, 25, 51, 52, 47, 73, 126, 107, 116, 105, 111, 59, 90, Byte.MAX_VALUE, 61, 60, 49, 48, 10, 52, 49, 10, 51, 58, 57, 57, 58, 34, 10, 32, 37, 10, 61, 48, 52, 49, 60, 59, 50, 38, 3, 71, 21, 2, 23, 8, 21, 19, 2, 3, 73, 19, 50, 125, 53, 52, 57, 56, 125, 60, 57, 125, 50, 45, 41, 52, 50, 51, 46, 111, 110, 99, 98, 88, 102, 99, 88, 104, 119, 115, 110, 104, 105, 116, 73, 94, 75, 84, 73, 79, 100, 90, 95, 45, 58, 47, 48, 45, 43, 0, 62, 59, 0, 59, 58, 44, 60, 45, 54, 47, 43, 54, 48, 49, 107, 6, 42, 57, 32, 107, 42, 47, 107, 42, 56, 107, 36, 45, 45, 46, 37, 56, 34, 61, 46, 107, 36, 57, 107, 34, 37, 42, 59, 59, 57, 36, 59, 57, 34, 42, 63, 46, 72, 73, 68, 69, Byte.MAX_VALUE, 65, 68, 95, 96, 113, 40, 105, 101, 40, 65, 40, 123, 109, 109, 97, 102, 111, 40, 124, 96, 97, 123, 55, 2, 39, 99, 43, 42, 39, 39, 38, 45, 109, 25, 6, 2, 31, 25, 24, 41, 0, 23, 26, 3, 19, 5, 41, 38, 41, 47, 45, 104, 41, 44, 104, 56, 58, 45, 46, 45, 58, 45, 38, 43, 45, 59, 116, 89, 80, 76, 28, 73, 79, 28, 73, 82, 88, 89, 78, 79, 72, 93, 82, 88, 28, 75, 84, 93, 72, 28, 85, 79, 28, 84, 93, 76, 76, 89, 82, 85, 82, 91, 18, 28, 107, 84, 69, 28, 88, 83, 82, 27, 72, 28, 69, 83, 73, 28, 75, 93, 82, 72, 28, 72, 83, 28, 79, 89, 89, 28, 72, 84, 85, 79, 3, 103, 70, 75, 74, 15, 110, 75, 71, 113, 107, 108, 62, 109, 107, 124, 115, 119, 109, 109, 119, 113, 112, 62, 119, 109, 62, 112, 113, 105, 62, 124, 123, 119, 112, 121, 62, 108, 123, 104, 119, 123, 105, 123, 122, 48, 40, 5, 12, 16, 64, 21, 19, 64, 21, 14, 4, 5, 18, 19, 20, 1, 14, 4, 64, 23, 8, 1, 20, 64, 9, 19, 64, 8, 1, 16, 16, 5, 14, 9, 14, 7, 78, 64, 55, 8, 25, 64, 9, 19, 64, 20, 8, 9, 19, 64, 9, 14, 1, 16, 16, 18, 15, 16, 18, 9, 1, 20, 5, 95, 27, 20, 19, 20, 14, 21, 24, 25, 34, 21, 20, 25, 24, 34, 28, 25, 118, 64, 64, 5, 67, 64, 82, 64, 87, 5, 68, 65, 86, 5, 73, 76, 78, 64, 5, 81, 77, 76, 86};
    }

    static {
        A0N();
        A03 = new String[]{A05(464, 7, 80), A05(136, 19, 92), A05(326, 25, 37), A05(381, 15, k.AppCompatTheme_windowFixedHeightMinor), A05(396, 9, 75), A05(405, 21, 47), A05(17, 27, 1), A05(0, 17, 85), A05(77, 21, 36), A05(713, 16, 13), A05(189, 18, 59), A05(283, 20, 106), A05(243, 20, 9), A05(303, 14, 54), A05(164, 25, 29)};
    }

    public AnonymousClass24(XJ xj) {
        this.A00 = xj.getSharedPreferences(ProcessUtils.getProcessSpecificName(A05(98, 36, 53), xj), 0);
    }

    public static long A00(XJ xj) {
        return A02(xj).A01(A05(55, 22, 71), 0L);
    }

    private long A01(String str, long j) {
        return this.A00.getLong(str, j);
    }

    public static AnonymousClass24 A02(XJ xj) {
        if (A01 == null) {
            synchronized (AnonymousClass24.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass24(xj);
                }
            }
        }
        return A01;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.AnonymousClass27 A03(com.facebook.ads.redexgen.X.XJ r8) {
        /*
            r0 = 0
            r7 = 0
            r0 = 0
            r0 = 0
            com.facebook.ads.redexgen.X.27 r6 = new com.facebook.ads.redexgen.X.27
            java.lang.String r0 = A0H(r8)
            r6.<init>(r0)
            r0 = 2
        Le:
            switch(r0) {
                case 2: goto L1e;
                case 11: goto L12;
                case 15: goto L72;
                default: goto L11;
            }
        L11:
            goto Le
        L12:
            java.util.Iterator r7 = (java.util.Iterator) r7     // Catch: org.json.JSONException -> L4f
            java.lang.Object r0 = r7.next()     // Catch: org.json.JSONException -> L4f
            com.facebook.ads.redexgen.X.27 r0 = (com.facebook.ads.redexgen.X.AnonymousClass27) r0     // Catch: org.json.JSONException -> L4f
            r6.A06(r0)     // Catch: org.json.JSONException -> L4f
            goto L43
        L1e:
            com.facebook.ads.redexgen.X.XJ r8 = (com.facebook.ads.redexgen.X.XJ) r8     // Catch: org.json.JSONException -> L4f
            com.facebook.ads.redexgen.X.24 r4 = A02(r8)     // Catch: org.json.JSONException -> L4f
            r2 = 381(0x17d, float:5.34E-43)
            r1 = 15
            r0 = 119(0x77, float:1.67E-43)
            java.lang.String r3 = A05(r2, r1, r0)     // Catch: org.json.JSONException -> L4f
            r2 = 134(0x86, float:1.88E-43)
            r1 = 0
            r0 = 41
            java.lang.String r0 = A05(r2, r1, r0)     // Catch: org.json.JSONException -> L4f
            java.lang.String r0 = r4.A0J(r3, r0)     // Catch: org.json.JSONException -> L4f
            java.util.List r0 = A0K(r0)     // Catch: org.json.JSONException -> L4f
            java.util.Iterator r7 = r0.iterator()     // Catch: org.json.JSONException -> L4f
        L43:
            boolean r0 = r7.hasNext()     // Catch: org.json.JSONException -> L4f
            if (r0 == 0) goto L4c
            r0 = 11
            goto Le
        L4c:
            r0 = 15
            goto Le
        L4f:
            r1 = move-exception
            com.facebook.ads.redexgen.X.24 r0 = A02(r8)
            r0.A0M()
            com.facebook.ads.redexgen.X.8Z r5 = r8.A04()
            int r4 = com.facebook.ads.redexgen.X.C03008a.A1c
            com.facebook.ads.redexgen.X.8b r3 = new com.facebook.ads.redexgen.X.8b
            r3.<init>(r1)
            r2 = 155(0x9b, float:2.17E-43)
            r1 = 9
            r0 = 107(0x6b, float:1.5E-43)
            java.lang.String r0 = A05(r2, r1, r0)
            r5.A83(r0, r4, r3)
            r0 = 15
            goto Le
        L72:
            com.facebook.ads.redexgen.X.27 r6 = (com.facebook.ads.redexgen.X.AnonymousClass27) r6
            com.facebook.ads.redexgen.X.27 r6 = (com.facebook.ads.redexgen.X.AnonymousClass27) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass24.A03(com.facebook.ads.redexgen.X.XJ):com.facebook.ads.redexgen.X.27");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.AnonymousClass27 A04(com.facebook.ads.redexgen.X.XJ r8) {
        /*
            r0 = 0
            r7 = 0
            r0 = 0
            r0 = 0
            com.facebook.ads.redexgen.X.27 r6 = new com.facebook.ads.redexgen.X.27
            java.lang.String r0 = A0I(r8)
            r6.<init>(r0)
            r0 = 2
        Le:
            switch(r0) {
                case 2: goto L1e;
                case 11: goto L12;
                case 15: goto L71;
                default: goto L11;
            }
        L11:
            goto Le
        L12:
            java.util.Iterator r7 = (java.util.Iterator) r7     // Catch: org.json.JSONException -> L4e
            java.lang.Object r0 = r7.next()     // Catch: org.json.JSONException -> L4e
            com.facebook.ads.redexgen.X.27 r0 = (com.facebook.ads.redexgen.X.AnonymousClass27) r0     // Catch: org.json.JSONException -> L4e
            r6.A06(r0)     // Catch: org.json.JSONException -> L4e
            goto L42
        L1e:
            com.facebook.ads.redexgen.X.XJ r8 = (com.facebook.ads.redexgen.X.XJ) r8     // Catch: org.json.JSONException -> L4e
            com.facebook.ads.redexgen.X.24 r4 = A02(r8)     // Catch: org.json.JSONException -> L4e
            r2 = 0
            r1 = 17
            r0 = 85
            java.lang.String r3 = A05(r2, r1, r0)     // Catch: org.json.JSONException -> L4e
            r2 = 134(0x86, float:1.88E-43)
            r1 = 0
            r0 = 41
            java.lang.String r0 = A05(r2, r1, r0)     // Catch: org.json.JSONException -> L4e
            java.lang.String r0 = r4.A0J(r3, r0)     // Catch: org.json.JSONException -> L4e
            java.util.List r0 = A0K(r0)     // Catch: org.json.JSONException -> L4e
            java.util.Iterator r7 = r0.iterator()     // Catch: org.json.JSONException -> L4e
        L42:
            boolean r0 = r7.hasNext()     // Catch: org.json.JSONException -> L4e
            if (r0 == 0) goto L4b
            r0 = 11
            goto Le
        L4b:
            r0 = 15
            goto Le
        L4e:
            r1 = move-exception
            com.facebook.ads.redexgen.X.24 r0 = A02(r8)
            r0.A0M()
            com.facebook.ads.redexgen.X.8Z r5 = r8.A04()
            int r4 = com.facebook.ads.redexgen.X.C03008a.A1f
            com.facebook.ads.redexgen.X.8b r3 = new com.facebook.ads.redexgen.X.8b
            r3.<init>(r1)
            r2 = 155(0x9b, float:2.17E-43)
            r1 = 9
            r0 = 107(0x6b, float:1.5E-43)
            java.lang.String r0 = A05(r2, r1, r0)
            r5.A83(r0, r4, r3)
            r0 = 15
            goto Le
        L71:
            com.facebook.ads.redexgen.X.27 r6 = (com.facebook.ads.redexgen.X.AnonymousClass27) r6
            com.facebook.ads.redexgen.X.27 r6 = (com.facebook.ads.redexgen.X.AnonymousClass27) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass24.A04(com.facebook.ads.redexgen.X.XJ):com.facebook.ads.redexgen.X.27");
    }

    public static String A06(XJ xj) {
        return A02(xj).A0J(A05(303, 14, 54), A05(134, 0, 41));
    }

    public static String A07(XJ xj) {
        return A02(xj).A0J(A05(283, 20, 106), A05(611, 38, 110));
    }

    public static String A08(XJ xj) {
        return A02(xj).A0J(A05(713, 16, 13), A05(492, 10, 51));
    }

    public static String A09(XJ xj) {
        return A02(xj).A0J(A05(189, 18, 59), A05(351, 12, 23));
    }

    public static String A0A(XJ xj) {
        return A02(xj).A0J(A05(136, 19, 92), A05(729, 23, 85));
    }

    public static String A0B(XJ xj) {
        return A02(xj).A0J(A05(464, 7, 80), A05(604, 7, 95));
    }

    public static String A0C(XJ xj) {
        return A02(xj).A0J(A05(164, 25, 29), A05(134, 0, 41));
    }

    public static String A0D(XJ xj) {
        return A02(xj).A0J(A05(77, 21, 36), A05(514, 21, 56));
    }

    public static String A0E(XJ xj) {
        return A02(xj).A0J(A05(405, 21, 47), A05(426, 38, 59));
    }

    public static String A0F(XJ xj) {
        return A02(xj).A0J(A05(396, 9, 75), A05(317, 9, 107));
    }

    public static String A0G(XJ xj) {
        return A02(xj).A0J(A05(243, 20, 9), A05(471, 21, k.AppCompatTheme_windowFixedWidthMajor));
    }

    public static String A0H(XJ xj) {
        return A02(xj).A0J(A05(326, 25, 37), A05(535, 69, 76));
    }

    public static String A0I(XJ xj) {
        return A02(xj).A0J(A05(17, 27, 1), A05(649, 64, 16));
    }

    private String A0J(String str, String str2) {
        String str3 = null;
        String string = this.A00.getString(str, str2);
        char c2 = string != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    string = string;
                    if (!string.equals(A05(279, 4, 72))) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    str2 = str2;
                    str3 = str2;
                    c2 = 4;
                    break;
                case 4:
                    return str3;
                case 5:
                    string = string;
                    str3 = string;
                    c2 = 4;
                    break;
            }
        }
    }

    public static List<AnonymousClass27> A0K(String str) throws JSONException {
        List<AdReportingReason> reasonsList = null;
        int i = 0;
        AnonymousClass27 anonymousClass27 = null;
        Iterator<AnonymousClass27> it = null;
        JSONArray jSONArray = null;
        char c2 = !TextUtils.isEmpty(str) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    str = str;
                    if (!str.equalsIgnoreCase(A05(279, 4, 72))) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return new ArrayList();
                case 4:
                    str = str;
                    jSONArray = new JSONArray(str);
                    reasonsList = new ArrayList<>();
                    i = 0;
                    c2 = 5;
                    break;
                case 5:
                    jSONArray = jSONArray;
                    if (i >= jSONArray.length()) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    jSONArray = jSONArray;
                    JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                    anonymousClass27 = new AnonymousClass27(jSONObject.getInt(A05(502, 12, 6)), jSONObject.getString(A05(44, 11, 101)), jSONObject.optString(A05(207, 16, 47)));
                    it = A0K(jSONObject.optString(A05(263, 16, 25))).iterator();
                    c2 = 7;
                    break;
                case 7:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    anonymousClass27 = anonymousClass27;
                    it = it;
                    anonymousClass27.A06(it.next());
                    c2 = 7;
                    break;
                case '\t':
                    reasonsList = (ArrayList) reasonsList;
                    anonymousClass27 = anonymousClass27;
                    reasonsList.add(anonymousClass27);
                    i++;
                    c2 = 5;
                    break;
                case '\n':
                    return (ArrayList) reasonsList;
            }
        }
    }

    @Nullable
    public static Map<String, String> A0L(XJ xj, @Nullable String str) throws JSONException {
        String strA05 = A05(155, 9, 107);
        if (str == null || str.isEmpty() || str.equals(A05(134, 2, 65))) {
            return null;
        }
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            for (String str2 : A03) {
                if (!jSONObject.has(str2)) {
                    return null;
                }
                String key = jSONObject.getString(str2);
                map.put(str2, key);
            }
            if (A0K(jSONObject.getString(A05(0, 17, 85))).size() == 0) {
                xj.A04().A83(strA05, C03008a.A1e, new C03018b(A05(223, 20, 6)));
                return null;
            }
            if (A0K(jSONObject.getString(A05(381, 15, k.AppCompatTheme_windowFixedHeightMinor))).size() == 0) {
                xj.A04().A83(strA05, C03008a.A1b, new C03018b(A05(363, 18, 45)));
                return null;
            }
            return map;
        } catch (JSONException e) {
            xj.A04().A83(strA05, C03008a.A1d, new C03018b(e));
            return null;
        }
    }

    private void A0M() {
        SharedPreferences.Editor editorEdit = this.A00.edit();
        editorEdit.putLong(A05(55, 22, 71), 0L);
        editorEdit.apply();
    }

    public static void A0O(XJ xj, @Nullable String str) throws JSONException {
        SharedPreferences.Editor editorEdit = null;
        int i = 0;
        int length = 0;
        String[] strArr = null;
        Map<String, String> mapA0L = A0L(xj, str);
        char c2 = mapA0L != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    mapA0L = mapA0L;
                    if (mapA0L.size() == A03.length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    xj = xj;
                    editorEdit = A02(xj).A00.edit();
                    strArr = A03;
                    length = strArr.length;
                    i = 0;
                    c2 = 5;
                    break;
                case 5:
                    if (i >= length) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    mapA0L = mapA0L;
                    editorEdit = editorEdit;
                    strArr = strArr;
                    String str2 = strArr[i];
                    editorEdit.putString(str2, mapA0L.get(str2));
                    i++;
                    c2 = 5;
                    break;
                case 7:
                    SharedPreferences.Editor editor = editorEdit;
                    editor.putLong(A05(55, 22, 71), System.currentTimeMillis());
                    editor.apply();
                    return;
            }
        }
    }

    public static boolean A0P(XJ xj, boolean z) {
        boolean isNativeReportingAvailable = false;
        boolean z2 = false;
        boolean z3 = false;
        char c2 = !z ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    xj = xj;
                    boolean isNativeReportingEnabled = JQ.A1Q(xj);
                    if (!isNativeReportingEnabled) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z2 = true;
                    c2 = 4;
                    break;
                case 4:
                    xj = xj;
                    if (A00(xj) <= 0) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    isNativeReportingAvailable = true;
                    c2 = 6;
                    break;
                case 6:
                    if (!z2) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (!isNativeReportingAvailable) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    z3 = true;
                    c2 = '\t';
                    break;
                case '\t':
                    return z3;
                case '\n':
                    isNativeReportingAvailable = false;
                    c2 = 6;
                    break;
                case 11:
                    z2 = false;
                    c2 = 4;
                    break;
            }
        }
    }
}
