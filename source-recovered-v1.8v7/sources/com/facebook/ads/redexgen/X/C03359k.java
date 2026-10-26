package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.9k, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C03359k extends AbstractC0598Kl {
    public static byte[] A01;
    public final /* synthetic */ C1029ab A00;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 69);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{-41, -17, -31, -33, -17, -39};
    }

    public C03359k(C1029ab c1029ab) {
        this.A00 = c1029ab;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9C
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(C02967u c02967u) {
        C03359k c03359k = this;
        int remainingSecondsForReward = 0;
        int duration = 0;
        int iA00 = 0;
        int i = 0;
        int i2 = 0;
        char c2 = c03359k.A00.A09 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c03359k = c03359k;
                    c02967u = c02967u;
                    iA00 = c02967u.A00();
                    duration = c03359k.A00.A09.getDuration() - iA00;
                    if (!JQ.A0s(c03359k.A00.A0R)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c03359k = c03359k;
                    if (c03359k.A00.A09.getState() != EnumC0737Py.A02) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c03359k = c03359k;
                    c03359k.A00.A0M.postDelayed(new C1036ai(c03359k, iA00), 5000L);
                    c2 = 6;
                    break;
                case 6:
                    c03359k = c03359k;
                    i = 3000;
                    if (!c03359k.A00.A0h) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c03359k = c03359k;
                    if (c03359k.A00.A0B == null) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    if (duration > i) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c03359k = c03359k;
                    if (!c03359k.A00.A0B.A0J()) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c03359k = c03359k;
                    c03359k.A00.A0B.A0F();
                    c2 = 11;
                    break;
                case 11:
                    c03359k = c03359k;
                    i2 = 1;
                    if (c03359k.A00.A01 <= 0) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    c03359k = c03359k;
                    float f = iA00 / (c03359k.A00.A01 * 1000.0f);
                    c03359k.A00.A04.setProgress(100.0f * f);
                    if (f < 1.0f) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c03359k = c03359k;
                    if (!c03359k.A00.A0I) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 14:
                    c03359k = c03359k;
                    c03359k.A00.A04.setToolbarActionMode(i2);
                    c2 = 15;
                    break;
                case 15:
                    c03359k = c03359k;
                    if (c03359k.A00.A04 == null) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    c03359k = c03359k;
                    remainingSecondsForReward = c03359k.A00.A0K - (iA00 / AdError.NETWORK_ERROR_CODE);
                    if (remainingSecondsForReward <= 0) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    c03359k = c03359k;
                    c03359k.A00.A04.setToolbarActionMessage(c03359k.A00.A0P.A0O().A00().replace(A00(0, 6, 55), String.valueOf(remainingSecondsForReward)));
                    c2 = 18;
                    break;
                case 18:
                    return;
                case 19:
                    c03359k = c03359k;
                    c03359k.A00.A04.setToolbarActionMessage(A00(0, 0, 35));
                    c03359k.A00.A04.setToolbarActionMode(i2);
                    c2 = 18;
                    break;
                case 20:
                    c03359k = c03359k;
                    if (c03359k.A00.A0C == null) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    c03359k = c03359k;
                    if (!c03359k.A00.A0C.A0G()) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    if (duration > i) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    c03359k = c03359k;
                    c03359k.A00.A0C.A0F();
                    c2 = 11;
                    break;
            }
        }
    }
}
