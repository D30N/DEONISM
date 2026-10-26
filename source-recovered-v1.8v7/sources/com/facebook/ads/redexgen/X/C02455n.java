package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5n, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02455n {
    public static boolean A04;
    public static byte[] A05;
    public static final String A06;
    public final C02465o A00;
    public final C02475p A01;
    public final XJ A02;
    public final QV A03;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 125);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A05 = new byte[]{33, 51, 30, 36, 55, 51, 49, 32, 50};
    }

    static {
        A01();
        A06 = C02455n.class.getSimpleName();
    }

    public C02455n(XJ xj, InterfaceC0746Qh interfaceC0746Qh, C02465o c02465o, C02475p c02475p) {
        this.A02 = xj;
        this.A03 = interfaceC0746Qh.A4N(QW.A05);
        this.A00 = c02465o;
        this.A01 = c02475p;
        this.A03.A3H(new C0839Tz(this));
        A02();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A02() {
        if (C0601Ko.A02(this)) {
            return;
        }
        try {
            if (this.A03.A7k()) {
                String strOptString = this.A03.A5y().optString(A00(0, 9, 66));
                if (!TextUtils.isEmpty(strOptString)) {
                    this.A00.A04(this.A02, strOptString);
                    if (!A04 || JQ.A0b(this.A02)) {
                        A04 = true;
                        this.A01.A05();
                    }
                }
            }
        } catch (Throwable th) {
            C0601Ko.A00(th, this);
        }
    }
}
