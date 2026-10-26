package com.facebook.ads.redexgen.X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class XO extends C8N {
    public static byte[] A00;
    public static final C8H A01;
    public static final C8H A02;
    public static final C8H A03;
    public static final C8H A04;
    public static final C8H A05;
    public static final C8H A06;
    public static final C8H A07;
    public static final C8H A08;
    public static final C8H A09;
    public static final C8H[] A0A;
    public static final String A0B;

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 95);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A00 = new byte[]{-51, -22, -51, -20, 19, 36, 19, 28, 34, 33, 78, 64, 78, 78, 68, 74, 73, 58, 68, 63, -47, -60, -64, -53, -72, -67, -61, -76, -74, -76, -63, -40, -35, -44, -55, 2, -13, 6, 2, -50, 0, -13, -12, -13, 0, -13, -4, -15, -13, 1, -50, 34, 29, 25, 19, 28, 33, -50, -3, -4, -50, 3, -2, -14, -17, 2, -13, -50, -15, -17, 1, -15, -17, -14, -13, -50, -3, -4, -50, -14, -13, -6, -13, 2, -13, -50, 0, -13, 1, 2, 0, -9, -15, 2, 9, 28, 28, 13, 21, 24, 28, 55, 57, 48, 54, 57, 48, 59, 64, 35, 21, 28, 21, 19, 36, -16, -6, -16, 22, 34, 31, 29, -16, 53, 70, 53, 62, 68, 67, -16, 39, 24, 21, 34, 21, -16, 37, 23, 30, 23, 21, 38, -14, 53, 65, 71, 64, 70, -6, -4, -5, -14, 24, 36, 33, 31, -14, 55, 72, 55, 64, 70, 69, 14, -1, 18, 14, -2, -5, 14, -5, -10, -15, -19, -25, -16, -31, -21, -26, 49, 35, 49, 49, 39, 45, 44, 29, 50, 39, 43, 35, 15, 0, 19, 15, -37, 11, 13, 4, 8, -4, 13, 20, -37, 6, 0, 20, -8, -19, -15, -23, 48, 65, 48, 57, 63, 42, 52, 47};
    }

    static {
        A04();
        A03 = new C8H(0, A00(211, 8, 108), A00(191, 16, 92));
        A08 = new C8H(1, A00(171, 8, 35), A00(35, 59, 79));
        String strA00 = A00(24, 7, 16);
        A04 = new C8H(2, A00(101, 8, 104), strA00);
        String strA002 = A00(163, 4, 91);
        A09 = new C8H(3, A00(31, 4, 5), strA002);
        String strA003 = A00(20, 4, 32);
        A07 = new C8H(4, A00(207, 4, 37), strA003);
        A06 = new C8H(5, A00(179, 12, 95), strA003);
        A05 = new C8H(6, A00(10, 10, k.AppCompatTheme_windowNoTitle), strA002);
        A02 = new C8H(7, A00(167, 4, 59), strA002);
        A01 = new C8H(8, A00(94, 7, 73), strA00);
        A0A = new C8H[]{A03, A08, A04, A09, A07, A06, A05, A02, A01};
        A0B = C8N.A02(A00(4, 6, 79), A0A);
    }

    public XO(C8J c8j) {
        super(c8j);
    }

    @Override // com.facebook.ads.redexgen.X.C8N
    public final String A06() {
        return A00(4, 6, 79);
    }

    @Override // com.facebook.ads.redexgen.X.C8N
    public final C8H[] A0A() {
        return A0A;
    }

    public final Cursor A0B() {
        return A05().rawQuery(A00(136, 27, k.AppCompatTheme_windowActionBar), null);
    }

    public final Cursor A0C() {
        return A05().rawQuery(A0B, null);
    }

    public final Cursor A0D(String str) {
        return A05().rawQuery(A00(109, 27, 113) + A03.A01 + A00(0, 4, 78), new String[]{str});
    }

    public final String A0E(String str, int i, String str2, double d2, double d3, String str3, Map<String, String> map) throws SQLException {
        Map<String, String> map2 = map;
        String string = null;
        String string2 = UUID.randomUUID().toString();
        ContentValues contentValues = new ContentValues(9);
        contentValues.put(A03.A01, string2);
        contentValues.put(A08.A01, str);
        contentValues.put(A04.A01, Integer.valueOf(i));
        contentValues.put(A09.A01, str2);
        contentValues.put(A07.A01, Double.valueOf(d2));
        contentValues.put(A06.A01, Double.valueOf(d3));
        contentValues.put(A05.A01, str3);
        String str4 = A02.A01;
        String str5 = null;
        char c2 = map2 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    map2 = map2;
                    string = new JSONObject(map2).toString();
                    c2 = 3;
                    break;
                case 3:
                    ContentValues contentValues2 = contentValues;
                    contentValues2.put(str4, string);
                    contentValues2.put(A01.A01, (Integer) 0);
                    A05().insertOrThrow(A00(4, 6, 79), str5, contentValues2);
                    return string2;
                case 4:
                    str5 = null;
                    string = null;
                    c2 = 3;
                    break;
            }
        }
    }

    public final boolean A0F(String str) {
        SQLiteDatabase sQLiteDatabaseA05 = A05();
        StringBuilder sb = new StringBuilder();
        sb.append(A03.A01);
        sb.append(A00(0, 4, 78));
        return sQLiteDatabaseA05.delete(A00(4, 6, 79), sb.toString(), new String[]{str}) > 0;
    }
}
