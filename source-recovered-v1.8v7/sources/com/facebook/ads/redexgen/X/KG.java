package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.protocol.AdErrorType;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class KG {
    public static byte[] A05;
    public final KF A00;

    @Nullable
    public final Long A01;

    @Nullable
    public final String A02;

    @Nullable
    public final String A03;

    @Nullable
    public final String A04;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 53);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A05 = new byte[]{32, 45, 36, 49, 18, 57, 52, 112, 117, 52, 112, 54, 63, 34, 112, 36, 53, 61, 32, 60, 49, 36, 53, 112, 117, 35, 112, 50, 53, 57, 62, 55, 112, 37, 35, 53, 52, 112, 63, 62, 112, 36, 53, 61, 32, 60, 49, 36, 53, 112, 117, 35, 22, 39, 47, 50, 46, 35, 54, 39, 98, 103, 49, 98, 43, 49, 98, 44, 45, 54, 98, 52, 35, 46, 43, 38, 98, 32, 35, 44, 44, 39, 48, 98, 54, 39, 47, 50, 46, 35, 54, 39, 93, 76, 85, 122, 93, 69, 82, 95, 90, 87, 19, 113, 90, 87, 99, 82, 74, 95, 92, 82, 87, 121, 82, 95, 27, 30, 95, 27, 93, 84, 73, 27, 104, Byte.MAX_VALUE, 112, 27, 77, 94, 73, 72, 82, 84, 85, 27, 30, 72, 27, 89, 94, 82, 85, 92, 27, 78, 72, 94, 95, 27, 84, 85, 27, 104, Byte.MAX_VALUE, 112, 27, 77, 94, 73, 72, 82, 84, 85, 27, 30, 72, 41, 56, 48, 45, 49, 60, 41, 56, 93, 118, 123, 63, 58, 123, 63, 121, 112, 109, 63, 111, 115, 126, 124, 122, 114, 122, 113, 107, 63, 58, 108, 63, 125, 122, 118, 113, 120, 63, 106, 108, 122, 123, 63, 112, 113, 63, 111, 115, 126, 124, 122, 114, 122, 113, 107, 63, 58, 108, 104, 99, 110, 85, 99, 110, 113, 96, 120, 109, 110, 96, 101, 88, 115, 126, 58, 63, 126, 58, 124, 117, 104, 58, 83, 94, 92, 91, 58, 63, 105, 58, 120, Byte.MAX_VALUE, 115, 116, 125, 58, 111, 105, Byte.MAX_VALUE, 126, 58, 117, 116, 58, 83, 94, 92, 91, 58, 63, 105, 2, 57, 36, 34, 39, 39, 56, 37, 35, 50, 51, 119, 21, 62, 51, 7, 54, 46, 59, 56, 54, 51, 119, 35, 46, 39, 50, 119, 56, 51, 62, 5, 46, 51, 55, 63, 5, 46, 53, 49, 63, 52, 67, 66, 81, 78, 68, 66, 120, 78, 67, 69, 82, 68, 88, 91, 65, 82, 83, 104, 71, 91, 86, 84, 82, 90, 82, 89, 67, 104, 94, 83, 96, 119, 120, 76, 101, 118, 97, 96, 122, 124, 125};
    }

    public KG() {
        this.A00 = KF.A04;
        this.A01 = null;
        this.A03 = null;
        this.A04 = null;
        this.A02 = null;
    }

    public KG(XI xi, @Nullable String str, String str2, KB kb) throws K6 {
        String strA01 = A01(329, 21, 2);
        String strA012 = A01(350, 11, 38);
        String strA013 = A01(0, 4, 97);
        String strA014 = A01(167, 8, 104);
        if (TextUtils.isEmpty(str)) {
            this.A00 = KF.A04;
            this.A01 = null;
            this.A03 = null;
            this.A04 = null;
            this.A02 = null;
            return;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int i = KE.A00[KF.valueOf(jSONObject.getString(strA013).toUpperCase()).ordinal()];
                String strA015 = A01(320, 9, 18);
                String strA016 = A01(306, 14, 111);
                String strA017 = A01(225, 6, 63);
                if (i == 1) {
                    this.A00 = KF.A03;
                    this.A01 = Long.valueOf(jSONObject.getString(strA017));
                    this.A02 = jSONObject.optString(strA016, null);
                    this.A03 = jSONObject.getString(strA015);
                    this.A04 = null;
                } else if (i == 2) {
                    this.A00 = KF.A02;
                    this.A01 = Long.valueOf(jSONObject.getString(strA017));
                    this.A02 = jSONObject.optString(strA016, null);
                    this.A03 = jSONObject.getString(strA015);
                    this.A04 = new JSONObject(jSONObject.getString(A01(231, 7, 52))).toString();
                } else {
                    throw new K6(AdErrorType.BID_PAYLOAD_ERROR, A01(278, 28, 98) + jSONObject.getString(strA013));
                }
                if (jSONObject.getString(strA012).equals(BuildConfigApi.getVersionName(xi))) {
                    if (jSONObject.getString(strA01).equals(str2)) {
                        HashSet hashSet = new HashSet(Arrays.asList(Integer.valueOf(KB.A0D.A03()), Integer.valueOf(KB.A0G.A03()), Integer.valueOf(KB.A0E.A03()), Integer.valueOf(KB.A0F.A03())));
                        if (jSONObject.getInt(strA014) != kb.A03()) {
                            if (!hashSet.contains(Integer.valueOf(jSONObject.getInt(strA014))) || !hashSet.contains(Integer.valueOf(kb.A03()))) {
                                throw new K6(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, A01(4, 48, 101), this.A01, Integer.valueOf(jSONObject.getInt(strA014)), kb));
                            }
                            return;
                        }
                        return;
                    }
                    throw new K6(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, A01(175, 50, 42), this.A01, jSONObject.getString(strA01), str2));
                }
                throw new K6(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, A01(113, 54, 14), this.A01, jSONObject.getString(strA012), BuildConfigApi.getVersionName(xi)));
            } catch (JSONException e) {
                e = e;
                xi.A04().A83(A01(92, 3, 9), C03008a.A0E, new C03018b(e));
                throw new K6(AdErrorType.BID_PAYLOAD_ERROR, A01(95, 18, 6), e);
            }
        } catch (JSONException e2) {
            e = e2;
        }
    }

    @Nullable
    public static KB A00(String str) throws K6 {
        try {
            return KB.A00(new JSONObject(str).getInt(A01(167, 8, 104)));
        } catch (JSONException e) {
            throw new K6(AdErrorType.BID_PAYLOAD_ERROR, A01(95, 18, 6), e);
        }
    }

    public static void A03(KB kb) throws K6 {
        char c2 = !KB.A0C.equals(kb) ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    kb = kb;
                    if (!KB.A0A.equals(kb)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 3:
                    kb = kb;
                    if (!KB.A0B.equals(kb)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    kb = kb;
                    if (!KB.A09.equals(kb)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return;
                case 6:
                    throw new K6(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, A01(52, 40, k.AppCompatTheme_windowFixedHeightMinor), Integer.valueOf(kb.A03())));
            }
        }
    }

    @Nullable
    public final String A04() {
        Long l = this.A01;
        if (l == null) {
            return null;
        }
        return l.toString();
    }

    @Nullable
    public final String A05() {
        return this.A02;
    }

    @Nullable
    public final String A06() {
        return this.A04;
    }

    public final void A07(String str) throws K6 {
        if (this.A03.equals(str)) {
        } else {
            throw new K6(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, A01(238, 40, 47), this.A01, this.A03, str));
        }
    }

    public final boolean A08() {
        boolean z = false;
        char c2 = this.A00 != KF.A04 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    public final boolean A09() {
        boolean z = false;
        char c2 = this.A00 == KF.A02 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }
}
