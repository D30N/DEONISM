package com.facebook.ads.redexgen.X;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Gx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0509Gx {
    public static byte[] A00;

    static {
        A03();
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 110);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A00 = new byte[]{115, 66, 57, 16, 69, 97, 41, 91, 21, 20, 68, 50, 40, 94, 84, 116, 94, 84, 41, 46};
    }

    public static H1 A00(H1 h1, String[] strArr, Map<String, H1> map) {
        H1 h12 = null;
        int length = 0;
        int i = 0;
        int length2 = 0;
        int i2 = 0;
        char c2 = h1 == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    strArr = strArr;
                    if (strArr != null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return (H1) null;
                case 4:
                    h1 = h1;
                    i2 = 0;
                    i = 1;
                    if (h1 != null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    strArr = strArr;
                    if (strArr.length != i) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return map.get(strArr[0]);
                case 7:
                    h1 = h1;
                    if (h1 != null) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    strArr = strArr;
                    if (strArr.length <= i) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    strArr = strArr;
                    h12 = new H1();
                    length2 = strArr.length;
                    c2 = '\n';
                    break;
                case '\n':
                    if (i2 >= length2) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    strArr = strArr;
                    map = map;
                    h12 = h12;
                    h12.A0E(map.get(strArr[i2]));
                    i2++;
                    c2 = '\n';
                    break;
                case '\f':
                    return h12;
                case '\r':
                    h1 = h1;
                    if (h1 == null) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    strArr = strArr;
                    if (strArr == null) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    strArr = strArr;
                    if (strArr.length != i) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    return h1.A0E(map.get(strArr[0]));
                case 17:
                    h1 = h1;
                    if (h1 == null) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    strArr = strArr;
                    if (strArr == null) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    strArr = strArr;
                    if (strArr.length <= i) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    strArr = strArr;
                    length = strArr.length;
                    c2 = 21;
                    break;
                case 21:
                    if (i2 >= length) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    h1 = h1;
                    strArr = strArr;
                    map = map;
                    h1.A0E(map.get(strArr[i2]));
                    i2++;
                    c2 = 21;
                    break;
                case 23:
                    return h1;
                case 24:
                    return h1;
            }
        }
    }

    public static String A02(String str) {
        String strA01 = A01(12, 1, 76);
        String strReplaceAll = str.replaceAll(A01(18, 2, 74), strA01).replaceAll(A01(13, 5, 16), strA01);
        String strA012 = A01(0, 1, 61);
        return strReplaceAll.replaceAll(strA01, strA012).replaceAll(A01(1, 11, k.AppCompatTheme_windowFixedHeightMinor), strA012);
    }

    public static void A04(SpannableStringBuilder spannableStringBuilder) {
        char c2 = 0;
        int length = spannableStringBuilder.length() - 1;
        char c3 = 2;
        while (true) {
            switch (c3) {
                case 2:
                    if (length < 0) {
                        c3 = 5;
                        break;
                    } else {
                        c3 = 3;
                        break;
                    }
                case 3:
                    spannableStringBuilder = spannableStringBuilder;
                    if (spannableStringBuilder.charAt(length) != ' ') {
                        c3 = 5;
                        break;
                    } else {
                        c3 = 4;
                        break;
                    }
                case 4:
                    length--;
                    c3 = 2;
                    break;
                case 5:
                    if (length < 0) {
                        c3 = '\b';
                        break;
                    } else {
                        c3 = 6;
                        break;
                    }
                case 6:
                    spannableStringBuilder = spannableStringBuilder;
                    c2 = '\n';
                    if (spannableStringBuilder.charAt(length) == '\n') {
                        c3 = '\b';
                        break;
                    } else {
                        c3 = 7;
                        break;
                    }
                case 7:
                    spannableStringBuilder = spannableStringBuilder;
                    spannableStringBuilder.append(c2);
                    c3 = '\b';
                    break;
                case '\b':
                    return;
            }
        }
    }

    public static void A05(SpannableStringBuilder spannableStringBuilder, int i, int i2, H1 h1) {
        boolean z = false;
        int iA06 = 0;
        char c2 = h1.A07() != -1 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    spannableStringBuilder = spannableStringBuilder;
                    h1 = h1;
                    spannableStringBuilder.setSpan(new StyleSpan(h1.A07()), i, i2, 33);
                    c2 = 3;
                    break;
                case 3:
                    h1 = h1;
                    if (!h1.A0P()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    spannableStringBuilder = spannableStringBuilder;
                    spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
                    c2 = 5;
                    break;
                case 5:
                    h1 = h1;
                    if (!h1.A0Q()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    spannableStringBuilder = spannableStringBuilder;
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
                    c2 = 7;
                    break;
                case 7:
                    h1 = h1;
                    if (!h1.A0O()) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    spannableStringBuilder = spannableStringBuilder;
                    h1 = h1;
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(h1.A05()), i, i2, 33);
                    c2 = '\t';
                    break;
                case '\t':
                    h1 = h1;
                    if (!h1.A0N()) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    spannableStringBuilder = spannableStringBuilder;
                    h1 = h1;
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(h1.A04()), i, i2, 33);
                    c2 = 11;
                    break;
                case 11:
                    h1 = h1;
                    if (h1.A0L() == null) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    spannableStringBuilder = spannableStringBuilder;
                    h1 = h1;
                    spannableStringBuilder.setSpan(new TypefaceSpan(h1.A0L()), i, i2, 33);
                    c2 = '\r';
                    break;
                case '\r':
                    h1 = h1;
                    if (h1.A08() == null) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    spannableStringBuilder = spannableStringBuilder;
                    h1 = h1;
                    spannableStringBuilder.setSpan(new AlignmentSpan.Standard(h1.A08()), i, i2, 33);
                    c2 = 15;
                    break;
                case 15:
                    h1 = h1;
                    iA06 = h1.A06();
                    z = true;
                    if (iA06 == 1) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    if (iA06 == 2) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    if (iA06 == 3) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    return;
                case 19:
                    spannableStringBuilder = spannableStringBuilder;
                    h1 = h1;
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(h1.A03() / 100.0f), i, i2, 33);
                    c2 = 18;
                    break;
                case 20:
                    spannableStringBuilder = spannableStringBuilder;
                    h1 = h1;
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(h1.A03()), i, i2, 33);
                    c2 = 18;
                    break;
                case 21:
                    spannableStringBuilder = spannableStringBuilder;
                    h1 = h1;
                    spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) h1.A03(), z), i, i2, 33);
                    c2 = 18;
                    break;
            }
        }
    }
}
