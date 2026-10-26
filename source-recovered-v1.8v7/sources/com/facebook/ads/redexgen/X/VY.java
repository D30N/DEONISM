package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import d.b.a.b.k;
import java.lang.reflect.Field;
import java.util.Arrays;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class VY implements InterfaceC02676j {
    public static byte[] A07;

    @Nullable
    public final Class A01;

    @Nullable
    public final String A03 = (String) A02(A03(21, 14, 127));

    @Nullable
    public final String A04 = (String) A02(A03(40, 10, 96));

    @Nullable
    public final Boolean A00 = A00();

    @Nullable
    public final String A05 = (String) A02(A03(0, 6, 82));

    @Nullable
    public final Integer A02 = A01();

    @Nullable
    public final String A06 = (String) A02(A03(9, 12, 9));

    static {
        A04();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
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

    public static void A04() {
        A07 = new byte[]{29, 23, 26, 13, 20, 9, 91, 83, 94, 86, 69, 82, 83, 73, 79, 78, 95, 78, 65, 77, 69, 55, 38, 38, 58, 63, 53, 55, 34, 63, 57, 56, 41, 63, 50, 40, 86, 64, 56, 45, 43, 60, 32, 37, 45, 54, 61, 48, 57, 44, 8, 16, 84, 78, 79, 72, 95, 77, 24, 11, 28, 29, 7, 1, 0, 17, 13, 1, 10, 11};
    }

    public VY(@Nullable Class cls) {
        this.A01 = cls;
    }

    @Nullable
    private Boolean A00() {
        Object objA02 = A02(A03(53, 5, 3));
        char c2 = objA02 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    objA02 = objA02;
                    if (!(objA02 instanceof Boolean)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return (Boolean) objA02;
                case 4:
                    return (Boolean) null;
            }
        }
    }

    @Nullable
    private Integer A01() {
        Object objA02 = A02(A03(58, 12, 71));
        char c2 = objA02 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    objA02 = objA02;
                    if (!(objA02 instanceof Integer)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return (Integer) objA02;
                case 4:
                    return (Integer) null;
            }
        }
    }

    @Nullable
    @SuppressLint({"CatchGeneralException"})
    private Object A02(String str) {
        Object obj = null;
        Class cls = this.A01;
        char c2 = cls == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (Object) null;
                case 3:
                    try {
                        str = str;
                        cls = cls;
                        Field declaredField = cls.getDeclaredField(str);
                        declaredField.setAccessible(true);
                        obj = declaredField.get(null);
                        c2 = '\b';
                        break;
                    } catch (Throwable unused) {
                        obj = null;
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return obj;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02676j
    public final boolean A7d(Object obj) {
        VY oldBuildConfigParams = this;
        boolean z = false;
        String str = null;
        Integer num = null;
        Boolean bool = null;
        String str2 = null;
        String str3 = null;
        VY vy = (VY) obj;
        String str4 = oldBuildConfigParams.A03;
        char c2 = str4 != null ? (char) 2 : (char) 15;
        while (true) {
            switch (c2) {
                case 2:
                    vy = vy;
                    str4 = str4;
                    if (!str4.equals(vy.A03)) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    oldBuildConfigParams = oldBuildConfigParams;
                    str2 = oldBuildConfigParams.A04;
                    if (str2 == null) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    vy = vy;
                    str2 = str2;
                    if (!str2.equals(vy.A04)) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    oldBuildConfigParams = oldBuildConfigParams;
                    bool = oldBuildConfigParams.A00;
                    if (bool == null) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    vy = vy;
                    bool = bool;
                    if (!bool.equals(vy.A00)) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    oldBuildConfigParams = oldBuildConfigParams;
                    str3 = oldBuildConfigParams.A05;
                    if (str3 == null) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    vy = vy;
                    str3 = str3;
                    if (!str3.equals(vy.A05)) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    oldBuildConfigParams = oldBuildConfigParams;
                    num = oldBuildConfigParams.A02;
                    if (num == null) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    vy = vy;
                    num = num;
                    if (!num.equals(vy.A02)) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    oldBuildConfigParams = oldBuildConfigParams;
                    str = oldBuildConfigParams.A06;
                    if (str == null) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    vy = vy;
                    str = str;
                    if (!str.equals(vy.A06)) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    z = true;
                    c2 = 14;
                    break;
                case 14:
                    return z;
                case 15:
                    z = false;
                    c2 = 14;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02676j
    @SuppressLint({"BadMethodUse-java.lang.String.length"})
    public final int ADH() {
        VY vy = this;
        int i = 0;
        String str = null;
        int length = 0;
        int i2 = 0;
        String str2 = null;
        int length2 = 0;
        String str3 = null;
        int length3 = 0;
        int i3 = 0;
        int length4 = A03(6, 3, 51).length() + A03(36, 2, 61).length() + A03(35, 1, 69).length() + A03(52, 1, 59).length() + A03(38, 2, 71).length() + A03(50, 2, k.AppCompatTheme_windowFixedHeightMinor).length() + 4 + 8;
        String str4 = vy.A03;
        int length5 = 0;
        char c2 = str4 != null ? (char) 2 : '\f';
        while (true) {
            switch (c2) {
                case 2:
                    str4 = str4;
                    length3 = str4.length();
                    c2 = 3;
                    break;
                case 3:
                    vy = vy;
                    i3 = length4 + length3;
                    str3 = vy.A04;
                    if (str3 == null) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    str3 = str3;
                    length2 = str3.length();
                    c2 = 5;
                    break;
                case 5:
                    vy = vy;
                    i2 = i3 + length2;
                    str2 = vy.A05;
                    if (str2 == null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    str2 = str2;
                    length = str2.length();
                    c2 = 7;
                    break;
                case 7:
                    vy = vy;
                    i = i2 + length;
                    str = vy.A06;
                    if (str == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    str = str;
                    length5 = str.length();
                    c2 = '\t';
                    break;
                case '\t':
                    return i + length5;
                case '\n':
                    length = 0;
                    c2 = 7;
                    break;
                case 11:
                    length2 = 0;
                    c2 = 5;
                    break;
                case '\f':
                    length3 = 0;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02676j
    public final JSONObject ADa() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(A03(6, 3, 51), this.A03);
        jSONObject.put(A03(36, 2, 61), this.A04);
        jSONObject.put(A03(35, 1, 69), this.A00);
        jSONObject.put(A03(52, 1, 59), this.A05);
        jSONObject.put(A03(38, 2, 71), this.A02);
        jSONObject.put(A03(50, 2, k.AppCompatTheme_windowFixedHeightMinor), this.A06);
        return jSONObject;
    }
}
