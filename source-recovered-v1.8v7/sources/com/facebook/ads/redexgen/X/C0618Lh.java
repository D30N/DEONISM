package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.support.annotation.Nullable;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.facebook.ads.redexgen.X.Lh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0618Lh {
    public static byte[] A00;
    public static final Pattern A01;

    public static String A02(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 1);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A07() {
        A00 = new byte[]{-120, -70, -73, -73, -86, -77, -71, 101, -72, -71, -90, -88, -80, 101, -71, -73, -90, -88, -86, -104, -52, -29, -101, -47, -28, -52, -29, -101, -53, -47, -99, -22, -98, -51, -101, -103, -53, -79, -99, -54, -51, -98, -102, -99, -87, -89, 104, -96, -101, -99, -97, -100, -87, -87, -91, 104, -101, -98, -83};
    }

    static {
        A07();
        A01 = Pattern.compile(A02(19, 24, 111));
    }

    public static String A00() {
        return A06(new Exception(A02(0, 19, 68)), -1, -1, false);
    }

    public static String A01(int i) {
        float rate = i <= 0 ? 2.8E-45f : 4.2E-45f;
        while (true) {
            switch (rate) {
                case 2.8E-45f:
                    return (String) null;
                case 4.2E-45f:
                    Random r = new Random();
                    float fNextFloat = r.nextFloat();
                    float rate2 = i;
                    if (fNextFloat >= 1.0f / rate2) {
                        rate = 7.0E-45f;
                        break;
                    } else {
                        rate = 5.6E-45f;
                        break;
                    }
                case 5.6E-45f:
                    return A00();
                case 7.0E-45f:
                    return (String) null;
            }
        }
    }

    public static String A03(Context context, @Nullable Throwable th) {
        return A06(th, JQ.A0F(context), JQ.A01(context), JQ.A0u(context));
    }

    public static String A04(String str) {
        Matcher matcher = A01.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return str;
    }

    public static String A06(@Nullable Throwable th, int i, int i2, boolean z) {
        String strA02 = A02(0, 0, 99);
        if (th == null) {
            return strA02;
        }
        try {
            C1158cj c1158cj = new C1158cj();
            InterfaceC0616Lf c1159ck = c1158cj;
            if (i2 >= 0) {
                c1159ck = new C1160cl(c1159ck, i2);
            }
            if (i >= 0) {
                c1159ck = new C1161cm(c1159ck, i, i);
            }
            if (z) {
                c1159ck = new C1159ck(c1159ck);
            }
            C1157ci c1157ci = new C1157ci(c1158cj, 1, c1159ck);
            th.printStackTrace(new PrintWriter(new C0617Lg(c1157ci)));
            c1157ci.flush();
            return c1158cj.toString();
        } catch (Exception unused) {
            return strA02;
        }
    }

    public static boolean A08(C0615Le c0615Le) {
        Iterator<String> it = null;
        Iterator<String> it2 = null;
        boolean z = false;
        String strA02 = c0615Le.A02();
        char c2 = strA02 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return false;
                case 3:
                    strA02 = strA02;
                    z = true;
                    if (!A0A(strA02)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return z;
                case 5:
                    c0615Le = c0615Le;
                    it2 = c0615Le.A01().iterator();
                    c2 = 6;
                    break;
                case 6:
                    it2 = it2;
                    if (!it2.hasNext()) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    it2 = it2;
                    if (!A0A(it2.next())) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return z;
                case '\t':
                    c0615Le = c0615Le;
                    it = c0615Le.A00().iterator();
                    c2 = '\n';
                    break;
                case '\n':
                    it = it;
                    if (!it.hasNext()) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    it = it;
                    if (!A0A(it.next())) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    return z;
                case '\r':
                    return false;
            }
        }
    }

    public static boolean A0A(String str) {
        return str.contains(A02(43, 16, 57));
    }
}
