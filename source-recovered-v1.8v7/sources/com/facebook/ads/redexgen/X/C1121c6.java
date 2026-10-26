package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.c6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1121c6 implements JW {

    @SuppressLint({"StaticFieldLeak"})
    @Nullable
    public static JW A03;
    public static byte[] A04;
    public static final String A05;
    public static volatile boolean A06;
    public final XJ A00;
    public final C9G A01;
    public final JV A02;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 93);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A04 = new byte[]{-104, -35, -18, -35, -26, -20, -90, -98, -47, -47, -62, -54, -51, -47, -58, -53, -60, 125, -47, -52, 125, -55, -52, -60, 125, -66, -53, 125, -58, -53, -45, -66, -55, -58, -63, 125};
    }

    static {
        A03();
        A05 = C1121c6.class.getSimpleName();
        A06 = false;
    }

    public C1121c6(XJ xj) {
        JU juA00;
        this.A00 = xj;
        if (JR.A0R(xj)) {
            this.A01 = C9E.A00(xj);
            juA00 = C0562Ja.A01(xj, this.A01);
        } else {
            EO eoA01 = C9E.A01(xj);
            juA00 = C0562Ja.A00(xj, eoA01);
            this.A01 = eoA01;
        }
        this.A02 = new C1118c3(xj, juA00);
        M3.A07.execute(new C1119c4(this));
        A04(xj);
    }

    public static synchronized JW A01(XJ xj) {
        if (A03 == null) {
            A03 = new C1121c6(xj);
        }
        return A03;
    }

    public static synchronized void A04(XJ xj) {
        if (A06) {
            return;
        }
        DynamicLoaderFactory.makeLoader(xj).getInitApi().onAdEventManagerCreated(xj);
        A06 = true;
    }

    private void A05(JT jt) {
        if (!jt.A0A()) {
            Log.e(A05, A02(7, 29, 0) + jt.A06() + A02(0, 7, 27));
            return;
        }
        this.A01.AE0(jt, new C1120c5(this, jt));
    }

    @Override // com.facebook.ads.redexgen.X.JW
    public final void A7w(String str, Map<String, String> map) {
        A05(new JS().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(JX.A03).A02(JY.A03).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JW
    public final void A7z(String str, Map<String, String> map) {
        A05(new JS().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(JX.A03).A02(JY.A05).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JW
    public final void A80(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JS().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(JX.A03).A02(JY.A06).A06(C0567Jf.A0A(str, EnumC0564Jc.A0H)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JW
    public final void A81(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JS().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(JX.A03).A02(JY.A07).A06(C0567Jf.A0A(str, EnumC0564Jc.A05)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JW
    public final void A82(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JS().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(JX.A03).A02(JY.A0A).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JW
    public final void A85(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JS().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(JX.A03).A02(JY.A0B).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JW
    public final void A87(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JS().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(JX.A04).A02(JY.A0C).A06(C0567Jf.A0A(str, EnumC0564Jc.A0S)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JW
    public final void A88(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JS().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(JX.A04).A02(JY.A0D).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JW
    public final void A89(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JS().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(JX.A04).A02(JY.A0G).A06(C0567Jf.A0A(str, EnumC0564Jc.A0U)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JW
    public final void A8B(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JS().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(JX.A03).A02(JY.A0F).A06(C0567Jf.A0A(str, EnumC0564Jc.A0V)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JW
    public final void A8D(String str, Map<String, String> map, String str2, JX jx) {
        A05(new JS().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(jx).A02(JY.A00(str2)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JW
    public final void A8E(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JS().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(JX.A03).A02(JY.A0H).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JW
    public final void A8I(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JS().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A01(JX.A03).A02(JY.A0J).A06(C0567Jf.A0A(str, EnumC0564Jc.A0X)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JW
    public final void A8K(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JS().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(JX.A03).A02(JY.A0E).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JW
    public final void A8L(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JS().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(JX.A04).A02(JY.A0K).A06(C0567Jf.A0A(str, EnumC0564Jc.A0b)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JW
    public final void A8M(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JS().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(JX.A03).A02(JY.A0O).A06(C0567Jf.A0A(str, EnumC0564Jc.A0d)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JW
    public final void A8N(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JS().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(JX.A03).A02(JY.A0N).A06(C0567Jf.A0A(str, EnumC0564Jc.A0e)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JW
    public final void A8O(String str, Map<String, String> map) {
        A05(new JS().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(JX.A04).A02(JY.A0P).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JW
    public final void A8Q(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JS().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(JX.A04).A02(JY.A0Q).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JW
    public final void ABl(String str) {
        new QQ(this.A00).execute(str);
    }
}
