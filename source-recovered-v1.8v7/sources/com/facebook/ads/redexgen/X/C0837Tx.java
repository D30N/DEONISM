package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import d.b.a.b.k;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Tx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0837Tx implements C5V {
    public static byte[] A02;
    public final C5W A00;
    public final String A01;

    static {
        A02();
    }

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ k.AppCompatTheme_windowFixedHeightMajor);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A02 = new byte[]{62, 57, 39, 14, 3, 10, 31};
    }

    public C0837Tx(C5W c5w, String str) {
        this.A00 = c5w;
        this.A01 = str;
    }

    @Nullable
    public static C0837Tx A00(JSONObject jSONObject) {
        C5W c5wA00 = C5W.A00(jSONObject.optString(A01(3, 4, 12)));
        String strOptString = jSONObject.optString(A01(0, 3, 61));
        char c2 = c5wA00 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    strOptString = strOptString;
                    if (strOptString != null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return (C0837Tx) null;
                case 4:
                    return new C0837Tx(c5wA00, strOptString);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C5V
    public final C5W A7E() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        C0837Tx c0837Tx = this;
        C0837Tx c0837Tx2 = null;
        char c2 = c0837Tx == obj ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return true;
                case 3:
                    obj = obj;
                    if (obj == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0837Tx = c0837Tx;
                    obj = obj;
                    if (c0837Tx.getClass() == obj.getClass()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    c0837Tx = c0837Tx;
                    obj = obj;
                    c0837Tx2 = (C0837Tx) obj;
                    if (c0837Tx.A00 == c0837Tx2.A00) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return false;
                case '\b':
                    return c0837Tx.A01.equals(c0837Tx2.A01);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C5V
    public final String getUrl() {
        return this.A01;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }
}
