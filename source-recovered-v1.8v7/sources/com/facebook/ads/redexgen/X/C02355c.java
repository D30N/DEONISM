package com.facebook.ads.redexgen.X;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5c, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02355c {
    public static byte[] A00;

    static {
        A02();
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 103);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A00 = new byte[]{29, 21, 24, 74, 70, 71, 93, 76, 71, 93, 19, 6, 6, 74, 70, 68, 7, 79, 72, 74, 76, 75, 70, 70, 66, 7, 66, 72, 93, 72, 71, 72, 7, 89, 91, 70, 95, 64, 77, 76, 91, 7, 104, 93, 93, 91, 64, 75, 92, 93, 64, 70, 71, 96, 77, 121, 91, 70, 95, 64, 77, 76, 91, 24, 23, 29, 11, 22, 16, 29, 16, 29, 123, 126, 122, 126, 99, 72, 99, 101, 118, 116, 124, 126, 121, 112};
    }

    public static C02345b A00(ContentResolver contentResolver) {
        String strA01 = A01(72, 14, 112);
        String strA012 = A01(63, 9, 30);
        String strA013 = A01(0, 3, 27);
        Cursor cursor = null;
        try {
            Cursor cursorQuery = contentResolver.query(Uri.parse(A01(3, 60, 78)), new String[]{strA013, strA012, strA01}, null, null, null);
            if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                C02345b c02345b = new C02345b(null, null, false);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return c02345b;
            }
            String string = cursorQuery.getString(cursorQuery.getColumnIndex(strA013));
            String advertisingId = cursorQuery.getString(cursorQuery.getColumnIndex(strA012));
            C02345b c02345b2 = new C02345b(string, advertisingId, Boolean.valueOf(cursorQuery.getString(cursorQuery.getColumnIndex(strA01))).booleanValue());
            cursorQuery.close();
            return c02345b2;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }
}
