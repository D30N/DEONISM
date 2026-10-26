package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import com.facebook.ads.internal.util.process.ProcessUtils;
import d.b.a.b.k;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5Z, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C5Z {
    public static byte[] A01;
    public SharedPreferences A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 104);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{115, 102, 102, 96, 123, 112, 103, 102, 123, 125, 124, 91, 118, 98, 110, 108, 47, 103, 96, 98, 100, 99, 110, 110, 106, 47, 96, 101, 114, 47, 104, 101, 103, 96, 107, 110, 106, 110, 115, 70, 99, 83, 117, 102, 100, 108, 110, 105, 96, 74, 72, 74, 65, 76, 125, 122, 105, 108, 126, 109, 122, 124, 97, 123, 97, 102, 111, 65, 108};
    }

    public C5Z(C8C c8c) {
        this.A00 = c8c.getSharedPreferences(ProcessUtils.getProcessSpecificName(A00(13, 21, 105), c8c), 0);
    }

    public final C5Y A02() {
        SharedPreferences sharedPreferences = this.A00;
        String strA00 = A00(56, 13, 96);
        if (sharedPreferences.contains(strA00)) {
            return new C5Y(this.A00.getString(strA00, A00(0, 0, 5)), this.A00.getBoolean(A00(34, 15, 111), false), C5X.A08, this.A00.getLong(A00(49, 7, 65), -1L));
        }
        return C5Y.A00();
    }

    public final String A03() {
        return this.A00.getString(A00(0, 13, k.AppCompatTheme_windowMinWidthMajor), A00(0, 0, 5));
    }

    public final void A04(C5Y c5y) {
        SharedPreferences.Editor editorEdit = this.A00.edit();
        editorEdit.putString(A00(56, 13, 96), c5y.A03());
        editorEdit.putBoolean(A00(34, 15, 111), c5y.A04());
        editorEdit.putLong(A00(49, 7, 65), c5y.A01());
        editorEdit.apply();
    }

    public final void A05(String str) {
        SharedPreferences.Editor editorEdit = this.A00.edit();
        editorEdit.putString(A00(0, 13, k.AppCompatTheme_windowMinWidthMajor), str);
        editorEdit.apply();
    }
}
