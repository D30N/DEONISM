package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1135cL implements AnonymousClass74 {
    public static byte[] A03;
    public final /* synthetic */ C0770Rf A00;
    public final /* synthetic */ C1141cR A01;
    public final /* synthetic */ boolean A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 88);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A03 = new byte[]{-74, -47, -39, -36, -43, -44, -112, -28, -33, -112, -44, -33, -25, -34, -36, -33, -47, -44, -112, -47, -112, -35, -43, -44, -39, -47, -98};
    }

    public C1135cL(C1141cR c1141cR, C0770Rf c0770Rf, boolean z) {
        this.A01 = c1141cR;
        this.A00 = c0770Rf;
        this.A02 = z;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass74
    public final void A98() {
        C1135cL c1135cL = this;
        String errorMessage = null;
        AdErrorType adErrorType = null;
        char c2 = c1135cL.A01.A0W != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c1135cL = c1135cL;
                    c1135cL.A01.A0W.A0V();
                    c1135cL.A01.A0W = null;
                    c2 = 3;
                    break;
                case 3:
                    c1135cL = c1135cL;
                    adErrorType = AdErrorType.CACHE_FAILURE_ERROR;
                    errorMessage = A00(0, 27, 24);
                    c1135cL.A01.A0Y.A0A().A2c(C0627Lq.A01(c1135cL.A01.A00), adErrorType.getErrorCode(), errorMessage);
                    if (c1135cL.A01.A0F == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1135cL = c1135cL;
                    adErrorType = adErrorType;
                    errorMessage = errorMessage;
                    c1135cL.A01.A0F.A9Y(K5.A02(adErrorType, errorMessage));
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass74
    public final void A9F() {
        C1135cL c1135cL = this;
        C1141cR c1141cR = c1135cL.A01;
        c1141cR.A0W = c1135cL.A00;
        char c2 = c1135cL.A02 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c1141cR = c1141cR;
                    if (c1141cR.A09 == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c1135cL = c1135cL;
                    c1135cL.A01.A09.A0H();
                    c2 = 4;
                    break;
                case 4:
                    c1135cL = c1135cL;
                    if (c1135cL.A01.A0F == null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c1135cL = c1135cL;
                    if (!c1135cL.A01.A0D.equals(EnumC0575Jn.A04)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c1135cL = c1135cL;
                    if (!c1135cL.A01.A0m()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 7:
                    c1135cL = c1135cL;
                    c1135cL.A01.A0F.AAE();
                    c2 = '\b';
                    break;
                case '\b':
                    c1135cL = c1135cL;
                    if (!c1135cL.A02) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c1135cL = c1135cL;
                    c1135cL.A01.A0F.A8o();
                    c2 = '\n';
                    break;
                case '\n':
                    return;
            }
        }
    }
}
