package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class XT extends AbstractRunnableC0608Kw {
    public static byte[] A05;
    public final /* synthetic */ int A00;
    public final /* synthetic */ C8C A01;
    public final /* synthetic */ C8T A02;
    public final /* synthetic */ C03018b A03;
    public final /* synthetic */ String A04;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 89);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A05 = new byte[]{-23, 10, 7, 26, 12, -59, 8, 23, 6, 24, 13, -59, 7, 10, 8, 6, 26, 24, 10, -59, 24, -22, 19, 27, 14, 23, 20, 19, 18, 10, 19, 25, -23, 6, 25, 6, -11, 23, 20, 27, 14, 9, 10, 23, -59, 19, 20, 25, -59, 14, 19, 15, 10, 8, 25, 10, 9, -1, -3, -1, 4, 1, 39, 42, 42, 47, 58, 47, 53, 52, 39, 50, 37, 47, 52, 44, 53, -38, -16, -11, -14, -89, -16, -6, -89, -11, -4, -13, -13, -88, 0, 2, -17, 1, 6, -3, -14, -7, 14, -7, 1, 4, -7, -6, 4, -3, -9, -4, 1, 11, 3, -9, 11, 8, -7, -5, -3, -48, -61, -49, -45, -61, -47, -46, -67, -57, -62, -32, -45, -47, -35, -32, -46, -51, -46, -49, -30, -49, -48, -49, -31, -45, 33, 35, 16, 34, 39, 30, 19, 13, 17, 29, 18, 19, -38};
    }

    public XT(C8C c8c, String str, int i, C03018b c03018b, C8T c8t) {
        this.A01 = c8c;
        this.A04 = str;
        this.A00 = i;
        this.A03 = c03018b;
        this.A02 = c8t;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0608Kw
    public final void A06() {
        String stackTrace;
        Map<String, String> mapA4S;
        String strA6S;
        try {
            if (C8U.A0I(this.A01, this.A04, this.A00, this.A03)) {
                return;
            }
            C0568Jg.A06(this.A01, JY.A09.toString() + A00(154, 1, 71) + this.A04);
            Throwable cause = this.A03.getCause();
            if (cause != null) {
                stackTrace = C0618Lh.A03(this.A01, cause);
            } else if (JR.A0Q(this.A01)) {
                stackTrace = C0618Lh.A03(this.A01, this.A03);
            } else {
                stackTrace = A00(62, 0, 4) + this.A03.getMessage();
            }
            if (JR.A0T(this.A01)) {
                mapA4S = this.A01.A02().A4S();
            } else if (this.A02 != null) {
                mapA4S = this.A02.A6A();
            } else if (C8U.A02) {
                String message = A00(0, 57, 76);
                C8U.A0F(new RuntimeException(message, this.A03));
                mapA4S = new HashMap<>();
            } else {
                mapA4S = this.A01.A02().A4S();
            }
            mapA4S.put(A00(90, 7, 52), this.A04);
            mapA4S.put(A00(142, 12, 85), String.valueOf(this.A00));
            JSONObject jSONObjectA02 = this.A03.A02();
            if (jSONObjectA02 != null) {
                mapA4S.put(A00(62, 15, 109), jSONObjectA02.toString());
            }
            if ((A00(57, 5, 67).equals(this.A04) || A00(127, 15, 21).equals(this.A04)) && (strA6S = this.A01.A02().A6S()) != null) {
                mapA4S.put(A00(97, 20, 63), strA6S);
            }
            String strA07 = this.A01.A07();
            if (strA07 != null && !TextUtils.isEmpty(strA07)) {
                mapA4S.put(A00(k.AppCompatTheme_windowActionModeOverlay, 10, 5), strA07);
            }
            C8S c8s = (C8S) C8U.A09.get();
            if (c8s == null) {
                C8U.A0F(new RuntimeException(A00(77, 13, 46)));
            } else {
                c8s.ADz(stackTrace, mapA4S, this.A01);
            }
        } catch (Throwable th) {
            C8U.A0F(th);
        }
    }
}
