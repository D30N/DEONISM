package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class AI extends AbstractC0644Mh {
    public static byte[] A01;
    public final /* synthetic */ C03469v A00;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 9);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{-99, -112, -117, -116, -106, 112, -107, -101, -116, -103, -102, -101, -112, -101, -120, -109, 108, -99, -116, -107, -101};
    }

    public AI(C03469v c03469v) {
        this.A00 = c03469v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9C
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(C02987x c02987x) {
        AI ai = this;
        ai.A00.A0S.set(true);
        ai.A00.setForcedTimeViewIncomplete(false);
        ai.A00.A0W();
        char c2 = ai.A00.getAudienceNetworkListener() != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    ai = ai;
                    c02987x = c02987x;
                    ai.A00.getAudienceNetworkListener().A3s(A00(0, 21, 30), c02987x);
                    c2 = 3;
                    break;
                case 3:
                    ai = ai;
                    if (ai.A00.A01 == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    ai = ai;
                    c02987x = c02987x;
                    ai.A00.A01.A0K(c02987x);
                    c2 = 5;
                    break;
                case 5:
                    ai = ai;
                    if (((AbstractC1055b1) ai.A00).A0D == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    ai = ai;
                    ((AbstractC1055b1) ai.A00).A0D.setToolbarActionMode(ai.A00.getCloseButtonStyle());
                    ((AbstractC1055b1) ai.A00).A0D.setToolbarActionMessage(A00(0, 0, k.AppCompatTheme_windowFixedWidthMinor));
                    c2 = 7;
                    break;
                case 7:
                    return;
            }
        }
    }
}
