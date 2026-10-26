package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.Log;
import d.b.a.b.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.facebook.ads.redexgen.X.2m, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01692m extends BZ {
    public static byte[] A05;
    public static final Pattern A06;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final boolean A04;

    public static String A02(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 87);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A05 = new byte[]{84, 67, 70, 84, 32, 24, 87, 85, 70, 85, 67, 84, 32, 24, 87, 85, 70, 84, 32, 24, 87, 85, 84, 67, 70, 70, 0, 32, 82, 85, 84, 32, 24, 87, 85, 28, 36, 38, 63, 63, 38, 33, 40, 111, 43, 38, 46, 35, 32, 40, 58, 42, 111, 35, 38, 33, 42, 111, 56, 38, 59, 39, 111, 41, 42, 56, 42, 61, 111, 44, 32, 35, 58, 34, 33, 60, 111, 59, 39, 46, 33, 111, 41, 32, 61, 34, 46, 59, 117, 111, 36, 110, 101, 111, 2, 2, 48, 75, 98, Byte.MAX_VALUE, 96, 108, 121, 55, 45, 116, 84, 70, 99, 66, 68, 72, 67, 66, 85, 37, 2, 87, 83, 70, 37, 4, 47, 40, 61, 46, 40, 16, 40, 42, 51, 51, 42, 45, 36, 99, 39, 42, 34, 47, 44, 36, 54, 38, 99, 47, 42, 45, 38, 99, 33, 38, 37, 44, 49, 38, 99, 32, 44, 46, 51, 47, 38, 55, 38, 99, 37, 44, 49, 46, 34, 55, 121, 99, 22, 7, 26, 22, 8, 48, 50, 43, 43, 50, 53, 60, 123, 50, 53, 45, 58, 55, 50, 63, 123, 47, 50, 54, 50, 53, 60, 97, 123, 90, 68, 119, 100, 111, 117, 114, 92, 21, 123, 86, 94, 83, 80, 88, 74, 90, 5, 31, 123, 123, 105};
    }

    static {
        A03();
        A06 = Pattern.compile(A02(0, 35, 43));
    }

    public C01692m() {
        this(null);
    }

    public C01692m(List<byte[]> list) {
        super(A02(105, 10, 112));
        if (list != null && !list.isEmpty()) {
            this.A04 = true;
            String strA0T = C0560Iy.A0T(list.get(0));
            IJ.A03(strA0T.startsWith(A02(97, 8, 90)));
            A06(strA0T);
            A04(new C0544Ii(list.get(1)));
            return;
        }
        this.A04 = false;
    }

    public static long A00(String str) throws NumberFormatException {
        Matcher matcher = A06.matcher(str);
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        long j = Long.parseLong(matcher.group(1)) * 60 * 60 * 1000000;
        long timestampUs = Long.parseLong(matcher.group(2));
        long j2 = j + (timestampUs * 60 * 1000000);
        long timestampUs2 = Long.parseLong(matcher.group(3));
        return j2 + (timestampUs2 * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.BZ
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C1063b9 A0b(byte[] bArr, int i, boolean z) throws NumberFormatException {
        ArrayList arrayList = new ArrayList();
        IY iy = new IY();
        C0544Ii c0544Ii = new C0544Ii(bArr, i);
        if (!this.A04) {
            A04(c0544Ii);
        }
        A05(c0544Ii, arrayList, iy);
        GX[] gxArr = new GX[arrayList.size()];
        arrayList.toArray(gxArr);
        return new C1063b9(gxArr, iy.A05());
    }

    private void A04(C0544Ii c0544Ii) {
        String strA0P = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    c0544Ii = c0544Ii;
                    strA0P = c0544Ii.A0P();
                    if (strA0P == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    strA0P = strA0P;
                    if (!strA0P.startsWith(A02(203, 8, 86))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return;
                case 5:
                    return;
            }
        }
    }

    private void A05(C0544Ii c0544Ii, List<GX> list, IY iy) throws NumberFormatException {
        C01692m c01692m = this;
        String strA0P = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    c0544Ii = c0544Ii;
                    strA0P = c0544Ii.A0P();
                    if (strA0P == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c01692m = c01692m;
                    if (!c01692m.A04) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 4:
                    strA0P = strA0P;
                    if (!strA0P.startsWith(A02(97, 8, 90))) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c01692m = c01692m;
                    strA0P = strA0P;
                    c01692m.A06(strA0P);
                    c2 = 2;
                    break;
                case 6:
                    strA0P = strA0P;
                    if (!strA0P.startsWith(A02(212, 10, 104))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c01692m = c01692m;
                    list = list;
                    iy = iy;
                    strA0P = strA0P;
                    c01692m.A07(strA0P, list, iy);
                    c2 = 2;
                    break;
                case '\b':
                    return;
            }
        }
    }

    private void A06(String str) {
        C01692m c01692m = this;
        String key = null;
        char c2 = 0;
        int iHashCode = 0;
        char c3 = 0;
        char c4 = 0;
        String[] strArrSplit = TextUtils.split(str.substring(A02(97, 8, 90).length()), A02(90, 1, 95));
        c01692m.A01 = strArrSplit.length;
        c01692m.A02 = -1;
        c01692m.A00 = -1;
        c01692m.A03 = -1;
        int i = 0;
        int i2 = 2;
        while (true) {
            switch (i2) {
                case 2:
                    c01692m = c01692m;
                    int i3 = c01692m.A01;
                    c3 = 0;
                    if (i >= i3) {
                        i2 = 19;
                        break;
                    } else {
                        i2 = 3;
                        break;
                    }
                case 3:
                    strArrSplit = strArrSplit;
                    key = C0560Iy.A0P(strArrSplit[i].trim());
                    iHashCode = key.hashCode();
                    c2 = 2;
                    c4 = 1;
                    if (iHashCode == 100571) {
                        i2 = 17;
                        break;
                    } else {
                        i2 = 4;
                        break;
                    }
                case 4:
                    if (iHashCode == 3556653) {
                        i2 = 15;
                        break;
                    } else {
                        i2 = 5;
                        break;
                    }
                case 5:
                    if (iHashCode == 109757538) {
                        i2 = 14;
                        break;
                    } else {
                        i2 = 6;
                        break;
                    }
                case 6:
                    c3 = 65535;
                    i2 = 7;
                    break;
                case 7:
                    if (c3 == 0) {
                        i2 = 13;
                        break;
                    } else {
                        i2 = 8;
                        break;
                    }
                case 8:
                    if (c3 == c4) {
                        i2 = 12;
                        break;
                    } else {
                        i2 = 9;
                        break;
                    }
                case 9:
                    if (c3 == c2) {
                        i2 = 11;
                        break;
                    } else {
                        i2 = 10;
                        break;
                    }
                case 10:
                    i++;
                    i2 = 2;
                    break;
                case 11:
                    c01692m = c01692m;
                    c01692m.A03 = i;
                    i2 = 10;
                    break;
                case 12:
                    c01692m = c01692m;
                    c01692m.A00 = i;
                    i2 = 10;
                    break;
                case 13:
                    c01692m = c01692m;
                    c01692m.A02 = i;
                    i2 = 10;
                    break;
                case 14:
                    key = key;
                    if (!key.equals(A02(k.AppCompatTheme_windowMinWidthMajor, 5, 11))) {
                        i2 = 6;
                        break;
                    } else {
                        i2 = 7;
                        break;
                    }
                case 15:
                    key = key;
                    if (!key.equals(A02(174, 4, 53))) {
                        i2 = 6;
                        break;
                    } else {
                        i2 = 16;
                        break;
                    }
                case 16:
                    c3 = 2;
                    i2 = 7;
                    break;
                case 17:
                    key = key;
                    if (!key.equals(A02(91, 3, 92))) {
                        i2 = 6;
                        break;
                    } else {
                        i2 = 18;
                        break;
                    }
                case 18:
                    c3 = 1;
                    i2 = 7;
                    break;
                case 19:
                    c01692m = c01692m;
                    if (c01692m.A02 == -1) {
                        i2 = 22;
                        break;
                    } else {
                        i2 = 20;
                        break;
                    }
                case 20:
                    c01692m = c01692m;
                    if (c01692m.A00 == -1) {
                        i2 = 22;
                        break;
                    } else {
                        i2 = 21;
                        break;
                    }
                case 21:
                    c01692m = c01692m;
                    if (c01692m.A03 != -1) {
                        i2 = 23;
                        break;
                    } else {
                        i2 = 22;
                        break;
                    }
                case 22:
                    c01692m = c01692m;
                    c3 = 0;
                    c01692m.A01 = 0;
                    i2 = 23;
                    break;
                case 23:
                    return;
            }
        }
    }

    private void A07(String str, List<GX> list, IY iy) throws NumberFormatException {
        String text = str;
        List<GX> list2 = list;
        IY iy2 = iy;
        C01692m c01692m = this;
        long jA00 = 0;
        long jA002 = 0;
        String endTimeString = null;
        String strA02 = null;
        long j = 0;
        String[] strArrSplit = null;
        int i = c01692m.A01;
        String strA022 = A02(105, 10, 112);
        char c2 = i == 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    Log.w(strA022, A02(127, 47, 20) + text);
                    return;
                case 3:
                    c01692m = c01692m;
                    text = text;
                    strArrSplit = text.substring(A02(212, 10, 104).length()).split(A02(90, 1, 95), c01692m.A01);
                    if (strArrSplit.length == c01692m.A01) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    Log.w(strA022, A02(35, 55, 24) + text);
                    return;
                case 5:
                    c01692m = c01692m;
                    strArrSplit = strArrSplit;
                    jA002 = A00(strArrSplit[c01692m.A02]);
                    strA02 = A02(178, 25, 12);
                    j = -9223372036854775807L;
                    if (jA002 != -9223372036854775807L) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    Log.w(strA022, strA02 + text);
                    return;
                case 7:
                    c01692m = c01692m;
                    strArrSplit = strArrSplit;
                    jA00 = -9223372036854775807L;
                    endTimeString = strArrSplit[c01692m.A00];
                    if (!endTimeString.trim().isEmpty()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\b':
                    endTimeString = endTimeString;
                    jA00 = A00(endTimeString);
                    if (jA00 != j) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    Log.w(strA022, strA02 + text);
                    return;
                case '\n':
                    c01692m = c01692m;
                    list2 = list2;
                    iy2 = iy2;
                    strArrSplit = strArrSplit;
                    String strReplaceAll = strArrSplit[c01692m.A03].replaceAll(A02(k.AppCompatTheme_windowActionBar, 7, 46), A02(94, 0, 112));
                    String strA023 = A02(211, 1, 72);
                    list2.add(new GX(strReplaceAll.replaceAll(A02(222, 3, 112), strA023).replaceAll(A02(94, 3, 9), strA023)));
                    iy2.A04(jA002);
                    if (jA00 == j) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    list2 = list2;
                    iy2 = iy2;
                    list2.add(null);
                    iy2.A04(jA00);
                    c2 = '\f';
                    break;
                case '\f':
                    return;
            }
        }
    }
}
