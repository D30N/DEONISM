package com.facebook.ads.redexgen.X;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import d.b.a.b.k;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: assets/audience_network.dex */
public final class HB {
    public static byte[] A01;
    public static final Pattern A02;
    public static final Pattern A03;
    public final StringBuilder A00 = new StringBuilder();

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 30);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A05() {
        A01 = new byte[]{-36, -28, 111, 104, -100, -109, 107, Byte.MAX_VALUE, 105, 122, 104, -100, -109, 107, 105, -64, -76, -59, -62, -43, -6, 2, -19, -8, -11, -16, -84, -19, -8, -11, -13, -6, -7, -15, -6, 0, -84, 2, -19, -8, 1, -15, -58, -84, -43, -34, -44, 9, -2, 11, 4, -31, -41, -24, -45, 4, -101, -76, -79, -76, -75, -67, -76, 102, -87, -69, -85, 102, -71, -85, -70, -70, -81, -76, -83, 102, -120, -107, 103, -116, -108, Byte.MAX_VALUE, -118, -121, -126, 62, Byte.MAX_VALUE, -116, -127, -122, -115, -112, 62, -108, Byte.MAX_VALUE, -118, -109, -125, 88, 62, -91, -114, -121, -120, -106, -70, -69, -88, -71, -69, -8, -17, -19, -18, -6, -9, -7, 2, 8, -7, 6, -126, -77, 120, -76, -122, -75, -110, 92, -112, -121, 95, 93, -112, -89, 95, 97, 97, 114, -112, -89, 95, 92, -112, -121, 95, 93, 92, 98, 94, 93, 115, 88, 3, 0, 5, -4, -11, 82, -60, -48, -45, -100, -86, -89, -69, -71, -71, -120, -70, -86, -107, -90, -73, -72, -86, -73, -109, -85, -87, -80, -80, -87, -82, -89, 96, -94, -95, -92, 96, -93, -75, -91, 96, -77, -91, -76, -76, -87, -82, -89, 122, 96, -62, 9, -73, -71, -73, -66, -65, -62, -71, -66, -73, 112, -59, -66, -61, -59, -64, -64, -65, -62, -60, -75, -76, 112, -75, -66, -60, -71, -60, -55, -118, 112, 119, 118, -79, -68, -71, -73, -66, -80, -56, -58, -51, -51, -58, -53, -60, 125, -64, -46, -62, 125, -44, -58, -47, -59, 125, -65, -66, -63, 125, -59, -62, -66, -63, -62, -49, -105, 125, -58, -62, -67, -67, -59, -66, -111, 125, -51, -52, -48, -58, -47, -58, -52, -53};
    }

    static {
        A05();
        A02 = Pattern.compile(A03(127, 26, 22));
        A03 = Pattern.compile(A03(3, 12, 34));
    }

    public static int A00(String str) {
        char c2;
        char c3 = 0;
        switch (str.hashCode()) {
            case -1364013995:
                c2 = '\b';
                break;
            case -1074341483:
                c2 = '\n';
                break;
            case 100571:
                c2 = '\f';
                break;
            case 109757538:
                c2 = 14;
                break;
            default:
                c2 = 2;
                break;
        }
        while (true) {
            switch (c2) {
                case 2:
                    c3 = 65535;
                    c2 = 3;
                    break;
                case 3:
                    if (c3 == 0) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (c3 == 1) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (c3 == 2) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (c3 == 3) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    Log.w(A03(162, 15, 39), A03(78, 22, 0) + str);
                    return RecyclerView.UNDEFINED_DURATION;
                case '\b':
                    str = str;
                    if (!str.equals(A03(k.AppCompatTheme_windowActionBar, 6, k.AppCompatTheme_windowFixedHeightMajor))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c3 = 1;
                    c2 = 3;
                    break;
                case '\n':
                    str = str;
                    if (!str.equals(A03(272, 6, 59))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c3 = 2;
                    c2 = 3;
                    break;
                case '\f':
                    str = str;
                    if (!str.equals(A03(44, 3, 82))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c3 = 3;
                    c2 = 3;
                    break;
                case 14:
                    str = str;
                    if (!str.equals(A03(105, 5, 41))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    c3 = 0;
                    c2 = 3;
                    break;
                case 16:
                    return 2;
                case 17:
                    return 1;
                case 18:
                    return 0;
            }
        }
    }

    public static int A01(String str, int i) {
        int length = 0;
        int iIndexOf = str.indexOf(62, i);
        char c2 = iIndexOf == -1 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    str = str;
                    length = str.length();
                    c2 = 3;
                    break;
                case 3:
                    return length;
                case 4:
                    length = iIndexOf + 1;
                    c2 = 3;
                    break;
            }
        }
    }

    public static Layout.Alignment A02(String str) {
        char c2;
        char c3 = 0;
        switch (str.hashCode()) {
            case -1364013995:
                c2 = '\n';
                break;
            case -1074341483:
                c2 = '\f';
                break;
            case 100571:
                c2 = 14;
                break;
            case 3317767:
                c2 = 16;
                break;
            case 108511772:
                c2 = 18;
                break;
            case 109757538:
                c2 = 20;
                break;
            default:
                c2 = 2;
                break;
        }
        while (true) {
            switch (c2) {
                case 2:
                    c3 = 65535;
                    c2 = 3;
                    break;
                case 3:
                    if (c3 == 0) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (c3 == 1) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (c3 == 2) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (c3 == 3) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (c3 == 4) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    if (c3 == 5) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    Log.w(A03(162, 15, 39), A03(19, 25, 110) + str);
                    return (Layout.Alignment) null;
                case '\n':
                    str = str;
                    if (!str.equals(A03(k.AppCompatTheme_windowActionBar, 6, k.AppCompatTheme_windowFixedHeightMajor))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c3 = 2;
                    c2 = 3;
                    break;
                case '\f':
                    str = str;
                    if (!str.equals(A03(272, 6, 59))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c3 = 3;
                    c2 = 3;
                    break;
                case 14:
                    str = str;
                    if (!str.equals(A03(44, 3, 82))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    c3 = 4;
                    c2 = 3;
                    break;
                case 16:
                    str = str;
                    if (!str.equals(A03(101, 4, 4))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    c3 = 1;
                    c2 = 3;
                    break;
                case 18:
                    str = str;
                    if (!str.equals(A03(110, 5, 104))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    c3 = 5;
                    c2 = 3;
                    break;
                case 20:
                    str = str;
                    if (!str.equals(A03(105, 5, 41))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    c3 = 0;
                    c2 = 3;
                    break;
                case 22:
                    return Layout.Alignment.ALIGN_OPPOSITE;
                case 23:
                    return Layout.Alignment.ALIGN_CENTER;
                case 24:
                    return Layout.Alignment.ALIGN_NORMAL;
            }
        }
    }

    public static String A04(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return null;
        }
        return C0560Iy.A0p(strTrim, A03(k.AppCompatTheme_windowMinWidthMajor, 5, 58))[0];
    }

    public static void A06(SpannableStringBuilder spannableStringBuilder, H6 h6, int i, int i2) {
        boolean z = false;
        int i3 = 0;
        int iA07 = 0;
        char c2 = h6 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    h6 = h6;
                    i3 = 33;
                    if (h6.A08() == -1) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    spannableStringBuilder = spannableStringBuilder;
                    h6 = h6;
                    spannableStringBuilder.setSpan(new StyleSpan(h6.A08()), i, i2, i3);
                    c2 = 5;
                    break;
                case 5:
                    h6 = h6;
                    if (!h6.A0O()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    spannableStringBuilder = spannableStringBuilder;
                    spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, i3);
                    c2 = 7;
                    break;
                case 7:
                    h6 = h6;
                    if (!h6.A0P()) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    spannableStringBuilder = spannableStringBuilder;
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, i3);
                    c2 = '\t';
                    break;
                case '\t':
                    h6 = h6;
                    if (!h6.A0N()) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    spannableStringBuilder = spannableStringBuilder;
                    h6 = h6;
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(h6.A06()), i, i2, i3);
                    c2 = 11;
                    break;
                case 11:
                    h6 = h6;
                    if (!h6.A0M()) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    spannableStringBuilder = spannableStringBuilder;
                    h6 = h6;
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(h6.A05()), i, i2, i3);
                    c2 = '\r';
                    break;
                case '\r':
                    h6 = h6;
                    if (h6.A0H() == null) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    spannableStringBuilder = spannableStringBuilder;
                    h6 = h6;
                    spannableStringBuilder.setSpan(new TypefaceSpan(h6.A0H()), i, i2, i3);
                    c2 = 15;
                    break;
                case 15:
                    h6 = h6;
                    if (h6.A0A() == null) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    spannableStringBuilder = spannableStringBuilder;
                    h6 = h6;
                    spannableStringBuilder.setSpan(new AlignmentSpan.Standard(h6.A0A()), i, i2, i3);
                    c2 = 17;
                    break;
                case 17:
                    h6 = h6;
                    iA07 = h6.A07();
                    z = true;
                    if (iA07 == 1) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    if (iA07 == 2) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    if (iA07 == 3) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    return;
                case 21:
                    spannableStringBuilder = spannableStringBuilder;
                    h6 = h6;
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(h6.A04() / 100.0f), i, i2, i3);
                    c2 = 20;
                    break;
                case 22:
                    spannableStringBuilder = spannableStringBuilder;
                    h6 = h6;
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(h6.A04()), i, i2, i3);
                    c2 = 20;
                    break;
                case 23:
                    spannableStringBuilder = spannableStringBuilder;
                    h6 = h6;
                    spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) h6.A04(), z), i, i2, i3);
                    c2 = 20;
                    break;
            }
        }
    }

    public static void A07(String str, SpannableStringBuilder spannableStringBuilder) {
        char c2 = 0;
        int iHashCode = str.hashCode();
        char c3 = iHashCode != 3309 ? (char) 2 : (char) 22;
        while (true) {
            switch (c3) {
                case 2:
                    if (iHashCode == 3464) {
                        c3 = 20;
                        break;
                    } else {
                        c3 = 3;
                        break;
                    }
                case 3:
                    if (iHashCode == 96708) {
                        c3 = 18;
                        break;
                    } else {
                        c3 = 4;
                        break;
                    }
                case 4:
                    if (iHashCode == 3374865) {
                        c3 = 16;
                        break;
                    } else {
                        c3 = 5;
                        break;
                    }
                case 5:
                    c2 = 65535;
                    c3 = 6;
                    break;
                case 6:
                    if (c2 == 0) {
                        c3 = 15;
                        break;
                    } else {
                        c3 = 7;
                        break;
                    }
                case 7:
                    if (c2 == 1) {
                        c3 = 14;
                        break;
                    } else {
                        c3 = '\b';
                        break;
                    }
                case '\b':
                    if (c2 == 2) {
                        c3 = '\r';
                        break;
                    } else {
                        c3 = '\t';
                        break;
                    }
                case '\t':
                    if (c2 == 3) {
                        c3 = '\f';
                        break;
                    } else {
                        c3 = '\n';
                        break;
                    }
                case '\n':
                    str = str;
                    Log.w(A03(162, 15, 39), A03(206, 31, 50) + str + A03(278, 2, 56));
                    c3 = 11;
                    break;
                case 11:
                    return;
                case '\f':
                    spannableStringBuilder = spannableStringBuilder;
                    spannableStringBuilder.append('&');
                    c3 = 11;
                    break;
                case '\r':
                    spannableStringBuilder = spannableStringBuilder;
                    spannableStringBuilder.append(' ');
                    c3 = 11;
                    break;
                case 14:
                    spannableStringBuilder = spannableStringBuilder;
                    spannableStringBuilder.append('>');
                    c3 = 11;
                    break;
                case 15:
                    spannableStringBuilder = spannableStringBuilder;
                    spannableStringBuilder.append('<');
                    c3 = 11;
                    break;
                case 16:
                    str = str;
                    if (!str.equals(A03(15, 4, 52))) {
                        c3 = 5;
                        break;
                    } else {
                        c3 = 17;
                        break;
                    }
                case 17:
                    c2 = 2;
                    c3 = 6;
                    break;
                case 18:
                    str = str;
                    if (!str.equals(A03(159, 3, 69))) {
                        c3 = 5;
                        break;
                    } else {
                        c3 = 19;
                        break;
                    }
                case 19:
                    c2 = 3;
                    c3 = 6;
                    break;
                case 20:
                    str = str;
                    if (!str.equals(A03(0, 2, 82))) {
                        c3 = 5;
                        break;
                    } else {
                        c3 = 21;
                        break;
                    }
                case 21:
                    c2 = 0;
                    c3 = 6;
                    break;
                case 22:
                    str = str;
                    if (!str.equals(A03(76, 2, 3))) {
                        c3 = 5;
                        break;
                    } else {
                        c3 = 23;
                        break;
                    }
                case 23:
                    c2 = 1;
                    c3 = 6;
                    break;
            }
        }
    }

    public static void A08(String str, H8 h8) {
        String strA03 = A03(162, 15, 39);
        Matcher matcher = A03.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            try {
                if (A03(153, 4, k.AppCompatTheme_windowFixedWidthMinor).equals(strGroup)) {
                    A09(strGroup2, h8);
                } else if (A03(237, 5, 50).equals(strGroup)) {
                    h8.A0B(A02(strGroup2));
                } else if (A03(280, 8, 63).equals(strGroup)) {
                    A0A(strGroup2, h8);
                } else if (A03(51, 4, 80).equals(strGroup)) {
                    h8.A05(HC.A00(strGroup2));
                } else {
                    Log.w(strA03, A03(56, 20, 40) + strGroup + A03(203, 1, 106) + strGroup2);
                }
            } catch (NumberFormatException unused) {
                Log.w(strA03, A03(177, 26, 34) + matcher.group());
            }
        }
    }

    public static void A09(String str, H8 h8) throws NumberFormatException {
        int i = 0;
        int iIndexOf = str.indexOf(44);
        int i2 = 0;
        char c2 = iIndexOf != -1 ? (char) 2 : '\t';
        while (true) {
            switch (c2) {
                case 2:
                    String str2 = str;
                    h8 = h8;
                    i2 = 0;
                    h8.A06(A00(str2.substring(iIndexOf + 1)));
                    str = str2.substring(0, iIndexOf);
                    c2 = 3;
                    break;
                case 3:
                    str = str;
                    if (!str.endsWith(A03(100, 1, 98))) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    str = str;
                    h8 = h8;
                    h8.A03(HC.A00(str)).A07(i2);
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    str = str;
                    i = Integer.parseInt(str);
                    if (i >= 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    i--;
                    c2 = '\b';
                    break;
                case '\b':
                    h8 = h8;
                    h8.A03(i).A07(1);
                    c2 = 5;
                    break;
                case '\t':
                    h8 = h8;
                    h8.A06(RecyclerView.UNDEFINED_DURATION);
                    c2 = 3;
                    break;
            }
        }
    }

    public static void A0A(String str, H8 h8) throws NumberFormatException {
        int iIndexOf = str.indexOf(44);
        char c2 = iIndexOf != -1 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    String str2 = str;
                    h8 = h8;
                    h8.A08(A00(str2.substring(iIndexOf + 1)));
                    str = str2.substring(0, iIndexOf);
                    c2 = 3;
                    break;
                case 3:
                    h8.A04(HC.A00(str));
                    return;
                case 4:
                    h8 = h8;
                    h8.A08(RecyclerView.UNDEFINED_DURATION);
                    c2 = 3;
                    break;
            }
        }
    }

    public static void A0B(String str, H9 h9, SpannableStringBuilder spannableStringBuilder, List<H6> list, List<HA> list2) {
        String str2 = str;
        H9 h92 = h9;
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        List<H6> list3 = list;
        List<HA> list4 = list2;
        int i = 0;
        char c2 = 0;
        int i2 = 0;
        int size = 0;
        int i3 = h92.A00;
        int length = spannableStringBuilder2.length();
        String str3 = h92.A01;
        int iHashCode = str3.hashCode();
        char c3 = iHashCode != 0 ? (char) 2 : (char) 23;
        while (true) {
            switch (c3) {
                case 2:
                    if (iHashCode == 105) {
                        c3 = 21;
                        break;
                    } else {
                        c3 = 3;
                        break;
                    }
                case 3:
                    if (iHashCode == 3314158) {
                        c3 = 19;
                        break;
                    } else {
                        c3 = 4;
                        break;
                    }
                case 4:
                    if (iHashCode == 98) {
                        c3 = 17;
                        break;
                    } else {
                        c3 = 5;
                        break;
                    }
                case 5:
                    if (iHashCode == 99) {
                        c3 = 15;
                        break;
                    } else {
                        c3 = 6;
                        break;
                    }
                case 6:
                    if (iHashCode == 117) {
                        c3 = '\r';
                        break;
                    } else {
                        c3 = 7;
                        break;
                    }
                case 7:
                    if (iHashCode == 118) {
                        c3 = 11;
                        break;
                    } else {
                        c3 = '\b';
                        break;
                    }
                case '\b':
                    c2 = 65535;
                    c3 = '\t';
                    break;
                case '\t':
                    i = 33;
                    switch (c2) {
                        case 0:
                            c3 = 25;
                            break;
                        case 1:
                            c3 = 26;
                            break;
                        case 2:
                            c3 = 27;
                            break;
                        case 3:
                            c3 = 28;
                            break;
                        case 4:
                            c3 = 28;
                            break;
                        case 5:
                            c3 = 28;
                            break;
                        case 6:
                            c3 = 28;
                            break;
                        default:
                            c3 = '\n';
                            break;
                    }
                case '\n':
                    return;
                case 11:
                    str3 = str3;
                    if (!str3.equals(A03(55, 1, 112))) {
                        c3 = '\b';
                        break;
                    } else {
                        c3 = '\f';
                        break;
                    }
                case '\f':
                    c2 = 5;
                    c3 = '\t';
                    break;
                case '\r':
                    str3 = str3;
                    if (!str3.equals(A03(204, 1, k.AppCompatTheme_windowFixedHeightMajor))) {
                        c3 = '\b';
                        break;
                    } else {
                        c3 = 14;
                        break;
                    }
                case 14:
                    c2 = 2;
                    c3 = '\t';
                    break;
                case 15:
                    str3 = str3;
                    if (!str3.equals(A03(k.AppCompatTheme_windowFixedWidthMinor, 1, 1))) {
                        c3 = '\b';
                        break;
                    } else {
                        c3 = 16;
                        break;
                    }
                case 16:
                    c2 = 3;
                    c3 = '\t';
                    break;
                case 17:
                    str3 = str3;
                    if (!str3.equals(A03(205, 1, 55))) {
                        c3 = '\b';
                        break;
                    } else {
                        c3 = 18;
                        break;
                    }
                case 18:
                    c2 = 0;
                    c3 = '\t';
                    break;
                case 19:
                    str3 = str3;
                    if (!str3.equals(A03(47, 4, 127))) {
                        c3 = '\b';
                        break;
                    } else {
                        c3 = 20;
                        break;
                    }
                case 20:
                    c2 = 4;
                    c3 = '\t';
                    break;
                case 21:
                    str3 = str3;
                    if (!str3.equals(A03(157, 1, 110))) {
                        c3 = '\b';
                        break;
                    } else {
                        c3 = 22;
                        break;
                    }
                case 22:
                    c2 = 1;
                    c3 = '\t';
                    break;
                case 23:
                    str3 = str3;
                    if (!str3.equals(A03(19, 0, 43))) {
                        c3 = '\b';
                        break;
                    } else {
                        c3 = 24;
                        break;
                    }
                case 24:
                    c2 = 6;
                    c3 = '\t';
                    break;
                case 25:
                    spannableStringBuilder2 = spannableStringBuilder2;
                    spannableStringBuilder2.setSpan(new StyleSpan(1), i3, length, i);
                    c3 = 28;
                    break;
                case 26:
                    spannableStringBuilder2 = spannableStringBuilder2;
                    spannableStringBuilder2.setSpan(new StyleSpan(2), i3, length, i);
                    c3 = 28;
                    break;
                case 27:
                    spannableStringBuilder2 = spannableStringBuilder2;
                    spannableStringBuilder2.setSpan(new UnderlineSpan(), i3, length, i);
                    c3 = 28;
                    break;
                case 28:
                    str2 = str2;
                    h92 = h92;
                    list3 = list3;
                    list4 = list4;
                    list4.clear();
                    A0D(list3, str2, h92, list4);
                    size = list4.size();
                    i2 = 0;
                    c3 = 29;
                    break;
                case 29:
                    if (i2 >= size) {
                        c3 = 31;
                        break;
                    } else {
                        c3 = 30;
                        break;
                    }
                case 30:
                    spannableStringBuilder2 = spannableStringBuilder2;
                    list4 = list4;
                    A06(spannableStringBuilder2, list4.get(i2).A01, i3, length);
                    i2++;
                    c3 = 29;
                    break;
                case 31:
                    return;
            }
        }
    }

    public static void A0C(String str, String str2, H8 h8, List<H6> list) {
        List<H6> list2 = list;
        String str3 = str2;
        String str4 = str;
        String strSubstring = null;
        char c2 = 0;
        int iIndexOf = 0;
        int entityEndIndex = 0;
        char cCharAt = 0;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        int i3 = 0;
        int i4 = 0;
        String strA04 = null;
        int i5 = 0;
        int iMin = 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int iA01 = 0;
        char c3 = 2;
        while (true) {
            switch (c3) {
                case 2:
                    str3 = str3;
                    if (iA01 >= str3.length()) {
                        c3 = '#';
                        break;
                    } else {
                        c3 = 3;
                        break;
                    }
                case 3:
                    str3 = str3;
                    cCharAt = str3.charAt(iA01);
                    if (cCharAt == '&') {
                        c3 = 25;
                        break;
                    } else {
                        c3 = 4;
                        break;
                    }
                case 4:
                    if (cCharAt == '<') {
                        c3 = 6;
                        break;
                    } else {
                        c3 = 5;
                        break;
                    }
                case 5:
                    spannableStringBuilder = spannableStringBuilder;
                    spannableStringBuilder.append(cCharAt);
                    iA01++;
                    c3 = 2;
                    break;
                case 6:
                    str3 = str3;
                    if (iA01 + 1 < str3.length()) {
                        c3 = '\b';
                        break;
                    } else {
                        c3 = 7;
                        break;
                    }
                case 7:
                    iA01++;
                    c3 = 2;
                    break;
                case '\b':
                    str3 = str3;
                    i = iA01;
                    z2 = false;
                    c2 = '/';
                    i3 = 1;
                    if (str3.charAt(i + 1) != '/') {
                        c3 = 19;
                        break;
                    } else {
                        c3 = '\t';
                        break;
                    }
                case '\t':
                    z = true;
                    c3 = '\n';
                    break;
                case '\n':
                    str3 = str3;
                    iA01 = A01(str3, i + 1);
                    if (str3.charAt(iA01 - 2) != c2) {
                        c3 = '\f';
                        break;
                    } else {
                        c3 = 11;
                        break;
                    }
                case 11:
                    z2 = true;
                    c3 = '\f';
                    break;
                case '\f':
                    if (!z) {
                        c3 = 14;
                        break;
                    } else {
                        c3 = '\r';
                        break;
                    }
                case '\r':
                    i3 = 2;
                    c3 = 14;
                    break;
                case 14:
                    i2 = i3 + i;
                    if (!z2) {
                        c3 = 18;
                        break;
                    } else {
                        c3 = 15;
                        break;
                    }
                case 15:
                    i4 = iA01 - 2;
                    c3 = 16;
                    break;
                case 16:
                    str3 = str3;
                    strSubstring = str3.substring(i2, i4);
                    strA04 = A04(strSubstring);
                    if (strA04 == null) {
                        c3 = 2;
                        break;
                    } else {
                        c3 = 17;
                        break;
                    }
                case 17:
                    strA04 = strA04;
                    if (!A0E(strA04)) {
                        c3 = 2;
                        break;
                    } else {
                        c3 = 20;
                        break;
                    }
                case 18:
                    i4 = iA01 - 1;
                    c3 = 16;
                    break;
                case 19:
                    z = false;
                    c3 = '\n';
                    break;
                case 20:
                    if (!z) {
                        c3 = 23;
                        break;
                    } else {
                        c3 = 21;
                        break;
                    }
                case 21:
                    arrayDeque = arrayDeque;
                    if (!arrayDeque.isEmpty()) {
                        c3 = 22;
                        break;
                    } else {
                        c3 = 2;
                        break;
                    }
                case 22:
                    str4 = str4;
                    list2 = list2;
                    spannableStringBuilder = spannableStringBuilder;
                    arrayDeque = arrayDeque;
                    arrayList = arrayList;
                    strA04 = strA04;
                    H9 startTag = (H9) arrayDeque.pop();
                    A0B(str4, startTag, spannableStringBuilder, list2, arrayList);
                    if (!startTag.A01.equals(strA04)) {
                        c3 = 21;
                        break;
                    } else {
                        c3 = 2;
                        break;
                    }
                case 23:
                    if (!z2) {
                        c3 = 24;
                        break;
                    } else {
                        c3 = 2;
                        break;
                    }
                case 24:
                    spannableStringBuilder = spannableStringBuilder;
                    arrayDeque = arrayDeque;
                    strSubstring = strSubstring;
                    arrayDeque.push(H9.A01(strSubstring, spannableStringBuilder.length()));
                    c3 = 2;
                    break;
                case 25:
                    str3 = str3;
                    iIndexOf = str3.indexOf(59, iA01 + 1);
                    entityEndIndex = str3.indexOf(32, iA01 + 1);
                    i5 = -1;
                    if (iIndexOf != -1) {
                        c3 = 31;
                        break;
                    } else {
                        c3 = 26;
                        break;
                    }
                case 26:
                    iMin = entityEndIndex;
                    c3 = 27;
                    break;
                case 27:
                    if (iMin == i5) {
                        c3 = '\"';
                        break;
                    } else {
                        c3 = 28;
                        break;
                    }
                case 28:
                    str3 = str3;
                    spannableStringBuilder = spannableStringBuilder;
                    A07(str3.substring(iA01 + 1, iMin), spannableStringBuilder);
                    if (iMin != entityEndIndex) {
                        c3 = 30;
                        break;
                    } else {
                        c3 = 29;
                        break;
                    }
                case 29:
                    spannableStringBuilder = spannableStringBuilder;
                    String tagName = A03(2, 1, 49);
                    spannableStringBuilder.append((CharSequence) tagName);
                    c3 = 30;
                    break;
                case 30:
                    iA01 = iMin + 1;
                    c3 = 2;
                    break;
                case 31:
                    if (entityEndIndex != i5) {
                        c3 = '!';
                        break;
                    } else {
                        c3 = ' ';
                        break;
                    }
                case ' ':
                    iMin = iIndexOf;
                    c3 = 27;
                    break;
                case '!':
                    iMin = Math.min(iIndexOf, entityEndIndex);
                    c3 = 27;
                    break;
                case '\"':
                    spannableStringBuilder = spannableStringBuilder;
                    spannableStringBuilder.append(cCharAt);
                    iA01++;
                    c3 = 2;
                    break;
                case '#':
                    arrayDeque = arrayDeque;
                    if (!arrayDeque.isEmpty()) {
                        c3 = '$';
                        break;
                    } else {
                        c3 = '%';
                        break;
                    }
                case '$':
                    str4 = str4;
                    list2 = list2;
                    spannableStringBuilder = spannableStringBuilder;
                    arrayDeque = arrayDeque;
                    arrayList = arrayList;
                    A0B(str4, (H9) arrayDeque.pop(), spannableStringBuilder, list2, arrayList);
                    c3 = '#';
                    break;
                case '%':
                    SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                    A0B(str4, H9.A00(), spannableStringBuilder2, list2, arrayList);
                    h8.A0C(spannableStringBuilder2);
                    return;
            }
        }
    }

    public static void A0D(List<H6> list, String str, H9 h9, List<HA> list2) {
        int iA09 = 0;
        H6 h6 = null;
        int size = list.size();
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= size) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    list = list;
                    str = str;
                    h9 = h9;
                    h6 = list.get(i);
                    iA09 = h6.A09(str, h9.A01, h9.A03, h9.A02);
                    if (iA09 <= 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    list2 = list2;
                    h6 = h6;
                    list2.add(new HA(iA09, h6));
                    c2 = 5;
                    break;
                case 5:
                    i++;
                    c2 = 2;
                    break;
                case 6:
                    Collections.sort(list2);
                    return;
            }
        }
    }

    public static boolean A0E(String str) {
        char c2 = 0;
        int iHashCode = str.hashCode();
        char c3 = iHashCode != 98 ? (char) 2 : (char) 25;
        while (true) {
            switch (c3) {
                case 2:
                    if (iHashCode == 99) {
                        c3 = 23;
                        break;
                    } else {
                        c3 = 3;
                        break;
                    }
                case 3:
                    if (iHashCode == 105) {
                        c3 = 21;
                        break;
                    } else {
                        c3 = 4;
                        break;
                    }
                case 4:
                    if (iHashCode == 3314158) {
                        c3 = 19;
                        break;
                    } else {
                        c3 = 5;
                        break;
                    }
                case 5:
                    if (iHashCode == 117) {
                        c3 = 17;
                        break;
                    } else {
                        c3 = 6;
                        break;
                    }
                case 6:
                    if (iHashCode == 118) {
                        c3 = 15;
                        break;
                    } else {
                        c3 = 7;
                        break;
                    }
                case 7:
                    c2 = 65535;
                    c3 = '\b';
                    break;
                case '\b':
                    if (c2 == 0) {
                        c3 = 27;
                        break;
                    } else {
                        c3 = '\t';
                        break;
                    }
                case '\t':
                    if (c2 == 1) {
                        c3 = 27;
                        break;
                    } else {
                        c3 = '\n';
                        break;
                    }
                case '\n':
                    if (c2 == 2) {
                        c3 = 27;
                        break;
                    } else {
                        c3 = 11;
                        break;
                    }
                case 11:
                    if (c2 == 3) {
                        c3 = 27;
                        break;
                    } else {
                        c3 = '\f';
                        break;
                    }
                case '\f':
                    if (c2 == 4) {
                        c3 = 27;
                        break;
                    } else {
                        c3 = '\r';
                        break;
                    }
                case '\r':
                    if (c2 == 5) {
                        c3 = 27;
                        break;
                    } else {
                        c3 = 14;
                        break;
                    }
                case 14:
                    return false;
                case 15:
                    str = str;
                    if (!str.equals(A03(55, 1, 112))) {
                        c3 = 7;
                        break;
                    } else {
                        c3 = 16;
                        break;
                    }
                case 16:
                    c2 = 5;
                    c3 = '\b';
                    break;
                case 17:
                    str = str;
                    if (!str.equals(A03(204, 1, k.AppCompatTheme_windowFixedHeightMajor))) {
                        c3 = 7;
                        break;
                    } else {
                        c3 = 18;
                        break;
                    }
                case 18:
                    c2 = 4;
                    c3 = '\b';
                    break;
                case 19:
                    str = str;
                    if (!str.equals(A03(47, 4, 127))) {
                        c3 = 7;
                        break;
                    } else {
                        c3 = 20;
                        break;
                    }
                case 20:
                    c2 = 3;
                    c3 = '\b';
                    break;
                case 21:
                    str = str;
                    if (!str.equals(A03(157, 1, 110))) {
                        c3 = 7;
                        break;
                    } else {
                        c3 = 22;
                        break;
                    }
                case 22:
                    c2 = 2;
                    c3 = '\b';
                    break;
                case 23:
                    str = str;
                    if (!str.equals(A03(k.AppCompatTheme_windowFixedWidthMinor, 1, 1))) {
                        c3 = 7;
                        break;
                    } else {
                        c3 = 24;
                        break;
                    }
                case 24:
                    c2 = 1;
                    c3 = '\b';
                    break;
                case 25:
                    str = str;
                    if (!str.equals(A03(205, 1, 55))) {
                        c3 = 7;
                        break;
                    } else {
                        c3 = 26;
                        break;
                    }
                case 26:
                    c2 = 0;
                    c3 = '\b';
                    break;
                case 27:
                    return true;
            }
        }
    }

    public static boolean A0F(String str, Matcher matcher, C0544Ii c0544Ii, H8 h8, StringBuilder sb, List<H6> list) {
        String strA0P = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        matcher = matcher;
                        h8.A0A(HC.A01(matcher.group(1))).A09(HC.A01(matcher.group(2)));
                        A08(matcher.group(3), h8);
                        sb.setLength(0);
                        c2 = '\t';
                        break;
                    } catch (NumberFormatException unused) {
                        Log.w(A03(162, 15, 39), A03(242, 30, 63) + matcher.group());
                        return false;
                    }
                case '\t':
                    c0544Ii = c0544Ii;
                    strA0P = c0544Ii.A0P();
                    if (!TextUtils.isEmpty(strA0P)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\n':
                    sb = sb;
                    if (sb.length() <= 0) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    sb = sb;
                    sb.append(A03(158, 1, 42));
                    c2 = '\f';
                    break;
                case '\f':
                    sb = sb;
                    strA0P = strA0P;
                    sb.append(strA0P.trim());
                    c2 = '\t';
                    break;
                case '\r':
                    A0C(str, sb.toString(), h8, list);
                    return true;
            }
        }
    }

    public final boolean A0G(C0544Ii c0544Ii, H8 h8, List<H6> list) {
        C0544Ii c0544Ii2 = c0544Ii;
        String strA0P = null;
        Matcher matcher = null;
        Matcher matcher2 = null;
        String strA0P2 = c0544Ii2.A0P();
        char c2 = strA0P2 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return false;
                case 3:
                    strA0P2 = strA0P2;
                    matcher = A02.matcher(strA0P2);
                    if (!matcher.matches()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return A0F(null, matcher, c0544Ii2, h8, this.A00, list);
                case 5:
                    c0544Ii2 = c0544Ii2;
                    strA0P = c0544Ii2.A0P();
                    if (strA0P != null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return false;
                case 7:
                    strA0P = strA0P;
                    matcher2 = A02.matcher(strA0P);
                    if (!matcher2.matches()) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return A0F(strA0P2.trim(), matcher2, c0544Ii2, h8, this.A00, list);
                case '\t':
                    return false;
            }
        }
    }
}
