package com.facebook.ads.redexgen.X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.api.BuildConfigApi;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: assets/audience_network.dex */
public final class XQ extends C8N {
    public static byte[] A00;
    public static final C8H A01;
    public static final C8H A02;
    public static final C8H[] A03;
    public static final String A04;
    public static final String A05;
    public static final String A06;
    public static final String A07;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 79);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A00 = new byte[]{-25, -30, -34, -40, -31, -26, 9, 26, 9, 18, 24, 23, -70, 4, 5, 12, 5, 20, 5, -32, 6, 18, 15, 13, -32, 52, 47, 43, 37, 46, 51, -32, 23, 8, 5, 18, 5, -32, 14, 15, 20, -32, 5, 24, 9, 19, 20, 19, -32, -24, 19, 5, 12, 5, 3, 20, -32, -15, -32, 6, 18, 15, 13, -32, 37, 54, 37, 46, 52, 51, -32, 23, 8, 5, 18, 5, -32, 52, 47, 43, 37, 46, 51, -18, -94, 114, -113, 114, -64, -79, -60, -64, 50, 45, 41, 35, 44, 29, 39, 34, -27, -42, -23, -27, -79, -31, -29, -38, -34, -46, -29, -22, -79, -36, -42, -22, -24, 13, 21, 0, 11, 8, 3, -65, 19, 14, 10, 4, 13, -51, 10, 61, 40, 42, 53, 57, 46, 52, 51, -27, 60, 45, 42, 51, -27, 57, 55, 62, 46, 51, 44, -27, 57, 52, -27, 41, 42, 49, 42, 57, 42, -27, 40, 45, 46, 49, 41, 49, 42, 56, 56, -27, 57, 52, 48, 42, 51, 56, -13, -23, -28, -32, -38, -29};
    }

    static {
        A04();
        A02 = new C8H(0, A00(92, 8, 111), A00(100, 16, 66));
        A01 = new C8H(1, A00(179, 5, 38), A00(88, 4, 29));
        A03 = new C8H[]{A02, A01};
        A07 = XQ.class.getSimpleName();
        C8H[] c8hArr = A03;
        String strA00 = A00(0, 6, 36);
        A05 = C8N.A02(strA00, c8hArr);
        A06 = C8N.A03(strA00, A03, A01);
        A04 = A00(13, 71, 113) + A02.A01 + A00(85, 3, 3) + A00(6, 6, 85) + A00(84, 1, 37) + XO.A08.A01 + A00(12, 1, 66);
    }

    public XQ(C8J c8j) {
        super(c8j);
    }

    @Override // com.facebook.ads.redexgen.X.C8N
    public final String A06() {
        return A00(0, 6, 36);
    }

    @Override // com.facebook.ads.redexgen.X.C8N
    public final C8H[] A0A() {
        return A03;
    }

    public final Cursor A0B() {
        return A05().rawQuery(A05, null);
    }

    public final String A0C(String str) throws SQLiteException, IllegalArgumentException {
        String string;
        if (!TextUtils.isEmpty(str)) {
            Cursor cursorRawQuery = null;
            try {
                cursorRawQuery = A05().rawQuery(A06, new String[]{str});
                if (cursorRawQuery.moveToNext()) {
                    string = cursorRawQuery.getString(A02.A00);
                } else {
                    string = null;
                }
                if (!TextUtils.isEmpty(string)) {
                    cursorRawQuery.close();
                    return string;
                }
                String string2 = UUID.randomUUID().toString();
                ContentValues contentValues = new ContentValues(2);
                String existingTokenId = A02.A01;
                contentValues.put(existingTokenId, string2);
                String existingTokenId2 = A01.A01;
                contentValues.put(existingTokenId2, str);
                SQLiteDatabase sQLiteDatabaseA05 = A05();
                String existingTokenId3 = A00(0, 6, 36);
                sQLiteDatabaseA05.insertOrThrow(existingTokenId3, null, contentValues);
                cursorRawQuery.close();
                return string2;
            } catch (Throwable th) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th;
            }
        }
        throw new IllegalArgumentException(A00(k.AppCompatTheme_windowActionBarOverlay, 14, 80));
    }

    public final void A0D() throws SQLException {
        try {
            A05().execSQL(A04);
        } catch (SQLException e) {
            if (BuildConfigApi.isDebug()) {
                Log.e(A07, A00(130, 49, k.AppCompatTheme_windowFixedHeightMajor), e);
            }
        }
    }
}
