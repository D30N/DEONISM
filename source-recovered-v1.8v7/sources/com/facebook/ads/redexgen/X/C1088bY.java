package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import d.b.a.b.k;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1088bY implements InterfaceC0546Ik<String> {
    public static byte[] A00;

    static {
        A01();
    }

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 96);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A00 = new byte[]{-11, -22, -23, 80, 65, 84, 80, 11, 82, 80, 80, 69, 54, 73, 69, 68, 80, 73, 72};
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0546Ik
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final boolean A4y(String str) {
        boolean z = false;
        String strA0P = C0560Iy.A0P(str);
        char c2 = !TextUtils.isEmpty(strA0P) ? (char) 2 : '\b';
        while (true) {
            switch (c2) {
                case 2:
                    strA0P = strA0P;
                    if (!strA0P.contains(A00(11, 4, 113))) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    strA0P = strA0P;
                    if (!strA0P.contains(A00(3, 8, k.AppCompatTheme_windowNoTitle))) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    strA0P = strA0P;
                    if (!strA0P.contains(A00(15, 4, k.AppCompatTheme_windowNoTitle))) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 5:
                    strA0P = strA0P;
                    if (!strA0P.contains(A00(0, 3, 29))) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 6:
                    z = true;
                    c2 = 7;
                    break;
                case 7:
                    return z;
                case '\b':
                    z = false;
                    c2 = 7;
                    break;
            }
        }
    }
}
