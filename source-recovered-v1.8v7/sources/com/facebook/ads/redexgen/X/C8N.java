package com.facebook.ads.redexgen.X;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import d.b.a.b.k;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.8N, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C8N {
    public static byte[] A01;
    public final C8J A00;

    static {
        A04();
    }

    public static String A01(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 12);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A01 = new byte[]{125, 113, 86, 115, 86, 117, -62, -48, -51, -50, -98, -46, -65, -64, -54, -61, -98, -57, -60, -98, -61, -42, -57, -47, -46, -47, -98, 120, -114, Byte.MIN_VALUE, -121, Byte.MIN_VALUE, 126, -113, 91, 107, 122, 109, 105, 124, 109, 72, 124, 105, 106, 116, 109, 72, 63, 101, 113, 110, 108, 63, -96, -88, 49, 104, 89, 86, 99, 86, 49};
    }

    public abstract String A06();

    public abstract C8H[] A0A();

    public C8N(C8J c8j) {
        this.A00 = c8j;
    }

    private String A00() {
        int i = 0;
        String strA01 = null;
        C8H[] c8hArrA0A = A0A();
        char c2 = c8hArrA0A.length < 1 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (String) null;
                case 3:
                    strA01 = A01(27, 0, 82);
                    i = 0;
                    c2 = 4;
                    break;
                case 4:
                    c8hArrA0A = c8hArrA0A;
                    if (i >= c8hArrA0A.length - 1) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c8hArrA0A = c8hArrA0A;
                    strA01 = strA01 + c8hArrA0A[i].A02() + A01(0, 2, 69);
                    i++;
                    c2 = 4;
                    break;
                case 6:
                    C8H[] c8hArr = c8hArrA0A;
                    return strA01 + c8hArr[c8hArr.length - 1].A02();
            }
        }
    }

    public static String A02(String str, C8H[] c8hArr) {
        StringBuilder sb = new StringBuilder(A01(28, 7, 47));
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    c8hArr = c8hArr;
                    if (i >= c8hArr.length - 1) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c8hArr = c8hArr;
                    sb = sb;
                    sb.append(c8hArr[i].A01);
                    sb.append(A01(0, 2, 69));
                    i++;
                    c2 = 2;
                    break;
                case 4:
                    StringBuilder sb2 = sb;
                    sb2.append(c8hArr[r6.length - 1].A01);
                    sb2.append(A01(48, 6, 19));
                    sb2.append(str);
                    return sb2.toString();
            }
        }
    }

    public static String A03(String str, C8H[] c8hArr, C8H c8h) {
        return A02(str, c8hArr) + A01(56, 7, 5) + c8h.A01 + A01(2, 4, 42);
    }

    public final SQLiteDatabase A05() {
        return this.A00.A0E();
    }

    public final void A07(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL(A01(35, 13, 28) + A06() + A01(54, 2, k.AppCompatTheme_windowActionBarOverlay) + A00() + A01(27, 1, 67));
    }

    public final void A08(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL(A01(6, 21, k.AppCompatTheme_viewInflaterClass) + A06());
    }

    public final boolean A09() {
        boolean z = false;
        char c2 = A05().delete(A06(), null, null) > 0 ? (char) 2 : (char) 4;
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
