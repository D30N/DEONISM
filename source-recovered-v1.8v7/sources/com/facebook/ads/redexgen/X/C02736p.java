package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.util.Log;
import java.util.Arrays;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.6p, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02736p {
    public static byte[] A05;
    public static final String A06;
    public final int A00;
    public final EnumC02726o A01;

    @Nullable
    public final String A02;

    @Nullable
    public final String A03;

    @Nullable
    public final String A04;

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 42);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A05 = new byte[]{114, -97, -97, -100, -97, 77, 112, -97, -110, -114, -95, -106, -101, -108, 77, 119, Byte.MIN_VALUE, 124, 123, -44, -35, -99, -85, -20, -22, -33, -25};
    }

    static {
        A01();
        A06 = C02736p.class.getSimpleName();
    }

    public C02736p(EnumC02726o enumC02726o) {
        this.A01 = enumC02726o;
        this.A00 = enumC02726o.A02();
        this.A03 = null;
        this.A02 = null;
        this.A04 = null;
    }

    @SuppressLint({"BadMethodUse-java.lang.String.length"})
    public C02736p(Throwable th) {
        String string;
        this.A01 = EnumC02726o.A07;
        this.A00 = th.getClass().getName().hashCode();
        this.A03 = th.getClass().getName();
        this.A02 = th.getMessage();
        if (th.getStackTrace() != null && th.getStackTrace().length > 1 && th.getStackTrace().toString().length() > 500) {
            string = th.getStackTrace()[0].toString().substring(0, 500);
        } else {
            string = th.getStackTrace()[0].toString();
        }
        this.A04 = string;
    }

    public final int A02() {
        return this.A00;
    }

    public final int A03() {
        C02736p c02736p = this;
        int i = 0;
        String str = null;
        int length = 0;
        int length2 = 0;
        String str2 = null;
        int i2 = 0;
        String str3 = c02736p.A03;
        int length3 = 0;
        char c2 = str3 != null ? (char) 2 : '\t';
        while (true) {
            switch (c2) {
                case 2:
                    str3 = str3;
                    length2 = str3.getBytes().length;
                    c2 = 3;
                    break;
                case 3:
                    c02736p = c02736p;
                    i2 = length2 + 4;
                    str2 = c02736p.A02;
                    if (str2 == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    str2 = str2;
                    length = str2.getBytes().length;
                    c2 = 5;
                    break;
                case 5:
                    c02736p = c02736p;
                    i = i2 + length;
                    str = c02736p.A04;
                    if (str == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    str = str;
                    length3 = str.getBytes().length;
                    c2 = 7;
                    break;
                case 7:
                    return i + length3;
                case '\b':
                    length = 0;
                    c2 = 5;
                    break;
                case '\t':
                    length2 = 0;
                    c2 = 3;
                    break;
            }
        }
    }

    public final EnumC02726o A04() {
        return this.A01;
    }

    @Nullable
    public final String A05() {
        return this.A02;
    }

    @Nullable
    public final String A06() {
        return this.A03;
    }

    @Nullable
    public final String A07() {
        return this.A04;
    }

    @SuppressLint({"BadMethodUse-android.util.Log.e"})
    public final JSONObject A08() throws JSONException {
        int i = 0;
        String strA00 = null;
        JSONObject jSONObject = new JSONObject();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        i = C02716n.A00[this.A01.ordinal()];
                        c2 = 7;
                        break;
                    } catch (JSONException e) {
                        Log.e(A06, A00(0, 19, 3), e);
                        break;
                    }
                case 7:
                    strA00 = A00(23, 2, 93);
                    if (i == 1) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    jSONObject.put(strA00, this.A00);
                    break;
                case '\n':
                    C02736p c02736p = this;
                    jSONObject.put(strA00, c02736p.A00);
                    jSONObject.put(A00(19, 2, 69), c02736p.A03);
                    jSONObject.put(A00(25, 2, 80), c02736p.A02);
                    jSONObject.put(A00(21, 2, 14), c02736p.A04);
                    break;
            }
        }
        return jSONObject;
    }
}
