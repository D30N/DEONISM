package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: assets/audience_network.dex */
public final class H2 {
    public static byte[] A02;
    public static final Pattern A03;
    public final C0544Ii A00 = new C0544Ii();
    public final StringBuilder A01 = new StringBuilder();

    public static String A01(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 84);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A07() {
        A02 = new byte[]{-42, -33, -34, -28, -99, -25, -43, -39, -41, -40, -28, -33, -40, -50, -49, -36, -42, -45, -40, -49, -44, -32, -35, -32, -29, 71, -27, -110, -1, 39, 38, 65, 58, 52, 46, 48, 8, -19, -13, 38, 41, -19, 40, -11, -12, -19, 39, 40, 42, -46, -37, -38, -32, -103, -46, -51, -39, -43, -40, -27, -21, -21, 20, 38, 22, 22, 7, 26, 22, -49, 6, 7, 5, 17, 20, 3, 22, 11, 17, 16, -7, 6, 3, -5, -105, 48, 47, 49, 57, 53, 64, 61, 67, 60, 50, -5, 49, 61, 58, 61, 64, 22, 33, 14, 25, 22, 16, -60, -51, -52, -46, -117, -47, -46, -41, -54, -61, -41, -87};
    }

    static {
        A07();
        A03 = Pattern.compile(A01(29, 19, k.AppCompatTheme_windowFixedHeightMinor));
    }

    public static char A00(C0544Ii c0544Ii, int i) {
        return (char) c0544Ii.A00[i];
    }

    public static String A02(C0544Ii c0544Ii) {
        int limit = 0;
        boolean z = false;
        int iA06 = c0544Ii.A06();
        int iA07 = c0544Ii.A07();
        boolean z2 = false;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (iA06 >= iA07) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (!z2) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 4:
                    c0544Ii = c0544Ii;
                    limit = iA06 + 1;
                    if (((char) c0544Ii.A00[iA06]) != ')') {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    z = true;
                    c2 = 6;
                    break;
                case 6:
                    z2 = z;
                    iA06 = limit;
                    c2 = 2;
                    break;
                case 7:
                    z = false;
                    c2 = 6;
                    break;
                case '\b':
                    C0544Ii c0544Ii2 = c0544Ii;
                    return c0544Ii2.A0S((iA06 - 1) - c0544Ii2.A06()).trim();
            }
        }
    }

    public static String A03(C0544Ii c0544Ii, StringBuilder sb) {
        char c2 = 0;
        sb.setLength(0);
        int iA06 = c0544Ii.A06();
        int iA07 = c0544Ii.A07();
        boolean z = false;
        char c3 = 2;
        while (true) {
            switch (c3) {
                case 2:
                    if (iA06 >= iA07) {
                        c3 = 16;
                        break;
                    } else {
                        c3 = 3;
                        break;
                    }
                case 3:
                    if (!z) {
                        c3 = 4;
                        break;
                    } else {
                        c3 = 16;
                        break;
                    }
                case 4:
                    c0544Ii = c0544Ii;
                    c2 = (char) c0544Ii.A00[iA06];
                    if (c2 < 'A') {
                        c3 = 6;
                        break;
                    } else {
                        c3 = 5;
                        break;
                    }
                case 5:
                    if (c2 <= 'Z') {
                        c3 = 14;
                        break;
                    } else {
                        c3 = 6;
                        break;
                    }
                case 6:
                    if (c2 < 'a') {
                        c3 = '\b';
                        break;
                    } else {
                        c3 = 7;
                        break;
                    }
                case 7:
                    if (c2 <= 'z') {
                        c3 = 14;
                        break;
                    } else {
                        c3 = '\b';
                        break;
                    }
                case '\b':
                    if (c2 < '0') {
                        c3 = '\n';
                        break;
                    } else {
                        c3 = '\t';
                        break;
                    }
                case '\t':
                    if (c2 <= '9') {
                        c3 = 14;
                        break;
                    } else {
                        c3 = '\n';
                        break;
                    }
                case '\n':
                    if (c2 == '#') {
                        c3 = 14;
                        break;
                    } else {
                        c3 = 11;
                        break;
                    }
                case 11:
                    if (c2 == '-') {
                        c3 = 14;
                        break;
                    } else {
                        c3 = '\f';
                        break;
                    }
                case '\f':
                    if (c2 == '.') {
                        c3 = 14;
                        break;
                    } else {
                        c3 = '\r';
                        break;
                    }
                case '\r':
                    if (c2 != '_') {
                        c3 = 15;
                        break;
                    } else {
                        c3 = 14;
                        break;
                    }
                case 14:
                    sb = sb;
                    iA06++;
                    sb.append(c2);
                    c3 = 2;
                    break;
                case 15:
                    z = true;
                    c3 = 2;
                    break;
                case 16:
                    C0544Ii c0544Ii2 = c0544Ii;
                    c0544Ii2.A0Z(iA06 - c0544Ii2.A06());
                    return sb.toString();
            }
        }
    }

    public static String A04(C0544Ii c0544Ii, StringBuilder sb) {
        String strA03 = null;
        String strA01 = null;
        A0A(c0544Ii);
        char c2 = c0544Ii.A04() == 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (String) null;
                case 3:
                    c0544Ii = c0544Ii;
                    sb = sb;
                    strA03 = A03(c0544Ii, sb);
                    strA01 = A01(25, 0, 79);
                    if (!strA01.equals(strA03)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    return strA03;
                case 5:
                    return strA01 + ((char) c0544Ii.A0E());
            }
        }
    }

    public static String A05(C0544Ii c0544Ii, StringBuilder sb) {
        int iA06 = 0;
        String strA04 = null;
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (!z) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case 3:
                    c0544Ii = c0544Ii;
                    sb = sb;
                    iA06 = c0544Ii.A06();
                    strA04 = A04(c0544Ii, sb);
                    if (strA04 != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    String token = (String) null;
                    return token;
                case 5:
                    strA04 = strA04;
                    if (!A01(25, 1, k.AppCompatTheme_windowFixedHeightMajor).equals(strA04)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 6:
                    strA04 = strA04;
                    if (!A01(28, 1, 112).equals(strA04)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0544Ii = c0544Ii;
                    c0544Ii.A0Y(iA06);
                    z = true;
                    c2 = 2;
                    break;
                case '\b':
                    sb2 = sb2;
                    strA04 = strA04;
                    sb2.append(strA04);
                    c2 = 2;
                    break;
                case '\t':
                    return sb2.toString();
            }
        }
    }

    public static String A06(C0544Ii c0544Ii, StringBuilder sb) {
        String token = null;
        String strA04 = null;
        int iA06 = 0;
        String strA042 = null;
        A0A(c0544Ii);
        char c2 = c0544Ii.A04() < 5 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    String target = (String) null;
                    return target;
                case 3:
                    c0544Ii = c0544Ii;
                    if (!A01(60, 5, 93).equals(c0544Ii.A0S(5))) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    String target2 = (String) null;
                    return target2;
                case 5:
                    c0544Ii = c0544Ii;
                    sb = sb;
                    iA06 = c0544Ii.A06();
                    strA042 = A04(c0544Ii, sb);
                    if (strA042 != null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    String target3 = (String) null;
                    return target3;
                case 7:
                    strA042 = strA042;
                    if (!A01(48, 1, 91).equals(strA042)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c0544Ii.A0Y(iA06);
                    String target4 = A01(25, 0, 79);
                    return target4;
                case '\t':
                    strA042 = strA042;
                    token = null;
                    String target5 = A01(27, 1, 22);
                    if (!target5.equals(strA042)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c0544Ii = c0544Ii;
                    token = A02(c0544Ii);
                    c2 = 11;
                    break;
                case 11:
                    c0544Ii = c0544Ii;
                    sb = sb;
                    strA04 = A04(c0544Ii, sb);
                    String target6 = A01(26, 1, 104);
                    if (!target6.equals(strA04)) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    strA04 = strA04;
                    if (strA04 != null) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    String target7 = (String) null;
                    return target7;
                case 14:
                    return token;
            }
        }
    }

    private void A08(H6 h6, String str) {
        String[] classDivision = null;
        int iIndexOf = 0;
        String str2 = null;
        int i = 0;
        int iIndexOf2 = 0;
        Matcher matcher = null;
        int i2 = 0;
        int i3 = 0;
        char c2 = A01(25, 0, 79).equals(str) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    str = str;
                    iIndexOf2 = str.indexOf(91);
                    i = -1;
                    i3 = 0;
                    i2 = 1;
                    if (iIndexOf2 == -1) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    str = str;
                    matcher = A03.matcher(str.substring(iIndexOf2));
                    if (!matcher.matches()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    h6 = h6;
                    matcher = matcher;
                    h6.A0K(matcher.group(i2));
                    c2 = 6;
                    break;
                case 6:
                    i3 = 0;
                    str = str.substring(0, iIndexOf2);
                    c2 = 7;
                    break;
                case 7:
                    str = str;
                    classDivision = C0560Iy.A0o(str, A01(k.AppCompatTheme_windowActionModeOverlay, 2, 39));
                    str2 = classDivision[i3];
                    iIndexOf = str2.indexOf(35);
                    if (iIndexOf == i) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    h6 = h6;
                    str2 = str2;
                    h6.A0J(str2.substring(i3, iIndexOf));
                    h6.A0I(str2.substring(iIndexOf + 1));
                    c2 = '\t';
                    break;
                case '\t':
                    classDivision = classDivision;
                    if (classDivision.length <= i2) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    h6 = h6;
                    classDivision = classDivision;
                    h6.A0L((String[]) Arrays.copyOfRange(classDivision, i2, classDivision.length));
                    c2 = 11;
                    break;
                case 11:
                    return;
                case '\f':
                    h6 = h6;
                    str2 = str2;
                    h6.A0J(str2);
                    c2 = '\t';
                    break;
            }
        }
    }

    public static void A09(C0544Ii c0544Ii) {
        while (!TextUtils.isEmpty(c0544Ii.A0P())) {
        }
    }

    public static void A0A(C0544Ii c0544Ii) {
        boolean z = false;
        boolean z2 = true;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    c0544Ii = c0544Ii;
                    if (c0544Ii.A04() <= 0) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (!z2) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0544Ii = c0544Ii;
                    if (!A0D(c0544Ii)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    c0544Ii = c0544Ii;
                    if (!A0C(c0544Ii)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    z = true;
                    c2 = 7;
                    break;
                case 7:
                    z2 = z;
                    c2 = 2;
                    break;
                case '\b':
                    z = false;
                    c2 = 7;
                    break;
                case '\t':
                    return;
            }
        }
    }

    public static void A0B(C0544Ii c0544Ii, H6 h6, StringBuilder sb) {
        int iA06 = 0;
        boolean z = false;
        String strA05 = null;
        String strA04 = null;
        A0A(c0544Ii);
        String strA03 = A03(c0544Ii, sb);
        String strA01 = A01(25, 0, 79);
        char c2 = strA01.equals(strA03) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c0544Ii = c0544Ii;
                    sb = sb;
                    if (!A01(84, 1, 9).equals(A04(c0544Ii, sb))) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    return;
                case 5:
                    c0544Ii = c0544Ii;
                    sb = sb;
                    A0A(c0544Ii);
                    strA05 = A05(c0544Ii, sb);
                    if (strA05 == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    strA01 = strA01;
                    strA05 = strA05;
                    if (!strA01.equals(strA05)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return;
                case '\b':
                    c0544Ii = c0544Ii;
                    sb = sb;
                    iA06 = c0544Ii.A06();
                    strA04 = A04(c0544Ii, sb);
                    if (!A01(28, 1, 112).equals(strA04)) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    strA03 = strA03;
                    if (!A01(20, 5, 29).equals(strA03)) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    h6 = h6;
                    strA05 = strA05;
                    h6.A0C(IO.A02(strA05));
                    c2 = 11;
                    break;
                case 11:
                    return;
                case '\f':
                    strA03 = strA03;
                    if (!A01(85, 16, k.AppCompatTheme_windowMinWidthMajor).equals(strA03)) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    h6 = h6;
                    strA05 = strA05;
                    h6.A0B(IO.A02(strA05));
                    c2 = 11;
                    break;
                case 14:
                    strA03 = strA03;
                    z = true;
                    if (!A01(65, 15, 78).equals(strA03)) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    strA05 = strA05;
                    if (!A01(11, 9, 22).equals(strA05)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    h6 = h6;
                    h6.A0G(z);
                    c2 = 11;
                    break;
                case 17:
                    strA03 = strA03;
                    if (!A01(49, 11, 24).equals(strA03)) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    h6 = h6;
                    strA05 = strA05;
                    h6.A0D(strA05);
                    c2 = 11;
                    break;
                case 19:
                    strA03 = strA03;
                    if (!A01(0, 11, 28).equals(strA03)) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    strA05 = strA05;
                    if (!A01(80, 4, 67).equals(strA05)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    h6 = h6;
                    h6.A0E(z);
                    c2 = 11;
                    break;
                case 22:
                    strA03 = strA03;
                    if (!A01(107, 10, 10).equals(strA03)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    strA05 = strA05;
                    if (!A01(101, 6, 89).equals(strA05)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 24:
                    h6 = h6;
                    h6.A0F(z);
                    c2 = 11;
                    break;
                case 25:
                    strA04 = strA04;
                    if (!A01(25, 1, k.AppCompatTheme_windowFixedHeightMajor).equals(strA04)) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 26;
                        break;
                    }
                case 26:
                    c0544Ii = c0544Ii;
                    c0544Ii.A0Y(iA06);
                    c2 = '\t';
                    break;
                case 27:
                    return;
            }
        }
    }

    public static boolean A0C(C0544Ii c0544Ii) {
        int limit = 0;
        char c2 = 0;
        char c3 = 0;
        int i = 0;
        int i2 = 0;
        int iA06 = c0544Ii.A06();
        int iA07 = c0544Ii.A07();
        byte[] bArr = c0544Ii.A00;
        int position = iA06 + 2 <= iA07 ? 2 : 10;
        while (true) {
            switch (position) {
                case 2:
                    bArr = bArr;
                    i2 = iA06 + 1;
                    int position2 = bArr[iA06];
                    c2 = '/';
                    if (position2 != 47) {
                        position = 10;
                        break;
                    } else {
                        position = 3;
                        break;
                    }
                case 3:
                    bArr = bArr;
                    i = i2 + 1;
                    c3 = '*';
                    if (bArr[i2] != 42) {
                        position = 10;
                        break;
                    } else {
                        position = 4;
                        break;
                    }
                case 4:
                    if (i + 1 >= iA07) {
                        position = 9;
                        break;
                    } else {
                        position = 5;
                        break;
                    }
                case 5:
                    bArr = bArr;
                    limit = i + 1;
                    if (((char) bArr[i]) != c3) {
                        position = 8;
                        break;
                    } else {
                        position = 6;
                        break;
                    }
                case 6:
                    bArr = bArr;
                    if (((char) bArr[limit]) != c2) {
                        position = 8;
                        break;
                    } else {
                        position = 7;
                        break;
                    }
                case 7:
                    iA07 = limit + 1;
                    i = iA07;
                    position = 4;
                    break;
                case 8:
                    i = limit;
                    position = 4;
                    break;
                case 9:
                    C0544Ii c0544Ii2 = c0544Ii;
                    c0544Ii2.A0Z(iA07 - c0544Ii2.A06());
                    return true;
                case 10:
                    return false;
            }
        }
    }

    public static boolean A0D(C0544Ii c0544Ii) {
        char cA00 = A00(c0544Ii, c0544Ii.A06());
        char c2 = cA00 != '\t' ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    if (cA00 == '\n') {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (cA00 == '\f') {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (cA00 == '\r') {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (cA00 == ' ') {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return false;
                case 7:
                    c0544Ii.A0Z(1);
                    return true;
            }
        }
    }

    public final H6 A0E(C0544Ii c0544Ii) {
        H2 h2 = this;
        H6 h6 = null;
        boolean z = false;
        int iA06 = 0;
        boolean z2 = false;
        String strA04 = null;
        String strA01 = null;
        h2.A01.setLength(0);
        int iA062 = c0544Ii.A06();
        A09(c0544Ii);
        h2.A00.A0b(c0544Ii.A00, c0544Ii.A06());
        h2.A00.A0Y(iA062);
        String strA06 = A06(h2.A00, h2.A01);
        H6 h62 = null;
        int position = strA06 != null ? 2 : 3;
        while (true) {
            switch (position) {
                case 2:
                    h2 = h2;
                    if (!A01(48, 1, 91).equals(A04(h2.A00, h2.A01))) {
                        position = 3;
                        break;
                    } else {
                        position = 4;
                        break;
                    }
                case 3:
                    return (H6) null;
                case 4:
                    h2 = h2;
                    strA06 = strA06;
                    h6 = new H6();
                    h2.A08(h6, strA06);
                    strA04 = null;
                    z2 = false;
                    position = 5;
                    break;
                case 5:
                    strA01 = A01(25, 1, k.AppCompatTheme_windowFixedHeightMajor);
                    if (!z2) {
                        position = 6;
                        break;
                    } else {
                        position = 12;
                        break;
                    }
                case 6:
                    h2 = h2;
                    iA06 = h2.A00.A06();
                    strA04 = A04(h2.A00, h2.A01);
                    if (strA04 == null) {
                        position = 8;
                        break;
                    } else {
                        position = 7;
                        break;
                    }
                case 7:
                    strA04 = strA04;
                    strA01 = strA01;
                    if (!strA01.equals(strA04)) {
                        position = 11;
                        break;
                    } else {
                        position = 8;
                        break;
                    }
                case 8:
                    z = true;
                    position = 9;
                    break;
                case 9:
                    z2 = z;
                    if (!z2) {
                        position = 10;
                        break;
                    } else {
                        position = 5;
                        break;
                    }
                case 10:
                    h2 = h2;
                    h6 = h6;
                    h2.A00.A0Y(iA06);
                    A0B(h2.A00, h6, h2.A01);
                    position = 5;
                    break;
                case 11:
                    z = false;
                    position = 9;
                    break;
                case 12:
                    strA01 = strA01;
                    if (!strA01.equals(strA04)) {
                        position = 14;
                        break;
                    } else {
                        position = 13;
                        break;
                    }
                case 13:
                    h6 = h6;
                    h62 = h6;
                    position = 14;
                    break;
                case 14:
                    return h62;
            }
        }
    }
}
