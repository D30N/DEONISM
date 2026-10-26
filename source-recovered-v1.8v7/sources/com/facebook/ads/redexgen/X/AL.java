package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class AL extends AbstractC0598Kl {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 103);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{6, 30, 16, 14, 30, 8, -10, 2, 0, -63, -7, -12, -10, -8, -11, 2, 2, -2, -63, -12, -9, 6, -63, -4, 1, 7, -8, 5, 6, 7, -4, 7, -4, -12, -1, -63, 5, -8, 10, -12, 5, -9};
    }

    public AL(C03469v c03469v) {
        this.A00 = c03469v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9C
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(C02967u c02967u) {
        AL al = this;
        String strReplace = null;
        int secondsForReward = 0;
        float fA00 = 0.0f;
        int iA03 = ((AbstractC1055b1) al.A00).A09.A0L().A0D().A03();
        boolean z = false;
        float seenPercentage = al.A00.A0f() ? 2.8E-45f : 7.0E-45f;
        while (true) {
            switch (seenPercentage) {
                case 2.8E-45f:
                    al = al;
                    c02967u = c02967u;
                    fA00 = c02967u.A00() / Math.min(iA03 * 1000.0f, al.A00.A0F.getDuration());
                    if (((AbstractC1055b1) al.A00).A0D == null) {
                        seenPercentage = 7.0E-45f;
                        break;
                    } else {
                        seenPercentage = 4.2E-45f;
                        break;
                    }
                case 4.2E-45f:
                    al = al;
                    float seenPercentage2 = 100.0f * fA00;
                    ((AbstractC1055b1) al.A00).A0D.setProgress(seenPercentage2);
                    if (fA00 < 1.0f) {
                        seenPercentage = 7.0E-45f;
                        break;
                    } else {
                        seenPercentage = 5.6E-45f;
                        break;
                    }
                case 5.6E-45f:
                    al = al;
                    z = false;
                    al.A00.setForcedTimeViewIncomplete(false);
                    al.A00.A0W();
                    ((AbstractC1055b1) al.A00).A0D.setToolbarActionMode(al.A00.getCloseButtonStyle());
                    seenPercentage = 7.0E-45f;
                    break;
                case 7.0E-45f:
                    al = al;
                    if (!al.A00.A05) {
                        seenPercentage = 1.3E-44f;
                        break;
                    } else {
                        seenPercentage = 8.4E-45f;
                        break;
                    }
                case 8.4E-45f:
                    al = al;
                    c02967u = c02967u;
                    secondsForReward = al.A00.A09.A0D().A02() - ((int) (c02967u.A00() / 1000.0f));
                    if (secondsForReward <= 0) {
                        seenPercentage = 1.7E-44f;
                        break;
                    } else {
                        seenPercentage = 9.8E-45f;
                        break;
                    }
                case 9.8E-45f:
                    al = al;
                    strReplace = ((AbstractC1055b1) al.A00).A09.A0O().A00().replace(A00(0, 6, 68), String.valueOf(secondsForReward));
                    if (((AbstractC1055b1) al.A00).A0D == null) {
                        seenPercentage = 1.3E-44f;
                        break;
                    } else {
                        seenPercentage = 1.1E-44f;
                        break;
                    }
                case 1.1E-44f:
                    al = al;
                    strReplace = strReplace;
                    ((AbstractC1055b1) al.A00).A0D.setToolbarActionMessage(strReplace);
                    seenPercentage = 1.3E-44f;
                    break;
                case 1.3E-44f:
                    al = al;
                    if (al.A00.A01 == null) {
                        seenPercentage = 1.5E-44f;
                        break;
                    } else {
                        seenPercentage = 1.4E-44f;
                        break;
                    }
                case 1.4E-44f:
                    al = al;
                    c02967u = c02967u;
                    al.A00.A01.A0L(c02967u);
                    seenPercentage = 1.5E-44f;
                    break;
                case 1.5E-44f:
                    return;
                case 1.7E-44f:
                    al = al;
                    if (((AbstractC1055b1) al.A00).A0D == null) {
                        seenPercentage = 2.0E-44f;
                        break;
                    } else {
                        seenPercentage = 1.8E-44f;
                        break;
                    }
                case 1.8E-44f:
                    al = al;
                    ((AbstractC1055b1) al.A00).A0D.setToolbarActionMessage(A00(0, 0, 83));
                    seenPercentage = 2.0E-44f;
                    break;
                case 2.0E-44f:
                    al = al;
                    al.A00.getAudienceNetworkListener().A3r(A00(6, 36, 44));
                    al.A00.A0E.A05();
                    al.A00.A05 = z;
                    seenPercentage = 1.3E-44f;
                    break;
            }
        }
    }
}
