package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import d.b.a.b.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class GC implements QV {
    public static byte[] A05;

    @Nullable
    public JSONObject A00;

    @Nullable
    public JSONObject A01;
    public final QW A03;
    public final List<QX> A04 = new ArrayList();
    public boolean A02 = false;

    static {
        A03();
    }

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 89);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A05 = new byte[]{38, 17, 10, 0, 8, 1, 68, 12, 5, 23, 68, 10, 11, 68, 2, 13, 10, 3, 1, 22, 20, 22, 13, 10, 16, 15, 0, 7, 14, 12, 27, 25, 27, 0, 7, 29, 73, 72, 84, 73, 7, 28, 5, 5, 117, 110, 119, 119, 80, 95, 88, 81, 83, 68, 70, 68, 95, 88, 66, 22, 11, 11, 22, 88, 67, 90, 90, 99, 84, 79, 69, 77, 68, 1, 72, 82, 1, 79, 78, 85, 1, 83, 68, 64, 69, 88, 55, 50, 39, 50, 115, 110, 110, 115, 61, 38, 63, 63, 18, 37, 62, 52, 60, 53, 112, 117, 35, 112, 52, 49, 36, 49, 112, 37, 32, 52, 49, 36, 53, 106, 90, 122, 122, 112, 52, 49, 36, 49, 112, 122, 122, 90, 117, 35, 90, 122, 122, 112, 54, 57, 62, 55, 53, 34, 32, 34, 57, 62, 36, 112, 122, 122, 90, 117, 35};
    }

    public GC(QW qw) {
        this.A03 = qw;
    }

    private boolean A04(@Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        boolean z = false;
        char c2 = jSONObject == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    jSONObject2 = jSONObject2;
                    if (jSONObject2 != null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return false;
                case 4:
                    jSONObject = jSONObject;
                    z = true;
                    if (jSONObject == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    jSONObject2 = jSONObject2;
                    if (jSONObject2 != null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return z;
                case 7:
                    return z ^ QU.A02(jSONObject, jSONObject2);
            }
        }
    }

    public final synchronized boolean A05(JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        if (jSONObject != null) {
            if (jSONObject2 == null && this.A03.A04()) {
                throw new IllegalArgumentException(A02(48, 19, 111));
            }
            if (jSONObject2 == null || this.A03.A04()) {
                if (!A04(this.A00, jSONObject) && !A04(this.A01, jSONObject2)) {
                    return false;
                }
                this.A00 = jSONObject;
                this.A01 = jSONObject2;
                this.A02 = true;
                for (QX l : this.A04) {
                    l.A3t();
                }
                try {
                    Locale locale = Locale.US;
                    String strA02 = A02(98, 57, 9);
                    Object[] objArr = new Object[3];
                    objArr[0] = this.A03;
                    objArr[1] = this.A00 == null ? A02(44, 4, 66) : this.A00.toString(2);
                    objArr[2] = this.A01 == null ? A02(44, 4, 66) : this.A01.toString(2);
                    String.format(locale, strA02, objArr);
                } catch (JSONException unused) {
                }
                return true;
            }
            throw new IllegalArgumentException(A02(25, 19, 48));
        }
        throw new IllegalArgumentException(A02(86, 12, 10));
    }

    @Override // com.facebook.ads.redexgen.X.QV
    public final synchronized void A3H(QX qx) {
        this.A04.add(qx);
    }

    @Override // com.facebook.ads.redexgen.X.QV
    public final synchronized JSONObject A5y() {
        if (this.A00 != null) {
        } else {
            throw new IllegalStateException(A02(67, 19, k.AppCompatTheme_windowFixedWidthMajor));
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.QV
    public final synchronized JSONObject A6I() {
        if (this.A03.A04()) {
            if (this.A01 != null) {
            } else {
                throw new IllegalStateException(A02(67, 19, k.AppCompatTheme_windowFixedWidthMajor));
            }
        } else {
            throw new IllegalStateException(A02(0, 25, 61));
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.QV
    public final QW A6N() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.QV
    public final synchronized boolean A7k() {
        return this.A02;
    }
}
