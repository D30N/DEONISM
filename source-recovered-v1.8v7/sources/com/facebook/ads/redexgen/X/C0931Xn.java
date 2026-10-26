package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import com.facebook.ads.AdSettings;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0931Xn implements C8E {
    public static C0931Xn A04;
    public static byte[] A05;
    public C0V A00;
    public C8D A01;
    public C03248z A02;

    @Nullable
    public InterfaceC0746Qh A03;

    static {
        A05();
    }

    public static String A04(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 99);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A05() {
        A05 = new byte[]{83, 101, 115, 115, 105, 111, 110, 32, 100, 97, 116, 97, 32, 105, 110, 105, 116, 105, 97, 108, 105, 122, 101, 100, 28, 31, 72, 24, 31, 18, 24, 45, 58, 47, 48, 45, 43, 12, 58, 44, 44, 54, 48, 49, 27, 62, 43, 62, 22, 49, 54, 43, 54, 62, 51, 54, 37, 58, 59};
    }

    @Nullable
    public static C5S A00(XJ xj, @Nullable InterfaceC0746Qh interfaceC0746Qh) {
        char c2 = JQ.A0z(xj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    interfaceC0746Qh = interfaceC0746Qh;
                    if (interfaceC0746Qh != null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return (C5S) null;
                case 4:
                    return C5T.A00().A01(interfaceC0746Qh);
            }
        }
    }

    public static synchronized C0931Xn A01() {
        if (A04 == null) {
            A04 = new C0931Xn();
        }
        return A04;
    }

    @Nullable
    public static Q6 A02(XJ xj) {
        if (!JQ.A0w(xj)) {
            return null;
        }
        return QO.A01(xj);
    }

    @Nullable
    public static InterfaceC0746Qh A03(XJ xj, @Nullable Q6 q6) {
        if (!JQ.A1V(xj) || q6 == null) {
            return null;
        }
        return AbstractC0747Qi.A00().A01(q6, C0590Kc.A05(xj), new C0930Xm(new KV(xj, A04(0, 0, 55), null, KB.A08, AdSettings.getTestAdType() != AdSettings.TestAdType.DEFAULT ? AdSettings.getTestAdType().getAdTypeString() : null, 0, AdSettings.isTestMode(xj), AdSettings.isMixedAudience(), new KG(), C0618Lh.A01(JQ.A0G(xj)), null, null), xj), C0744Qf.A00().A00());
    }

    public static void A06() {
        KJ.A05(A04(31, 28, 60), A04(0, 24, 99), A04(24, 7, 73));
    }

    public static void A07(XJ xj, @Nullable C5S c5s) {
        char c2 = JQ.A0z(xj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c5s = c5s;
                    if (c5s != null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    C5Q.A00().A01(c5s, xj);
                    return;
            }
        }
    }

    public static void A08(XJ xj, @Nullable InterfaceC0746Qh interfaceC0746Qh) {
        char c2 = JQ.A0c(xj) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    interfaceC0746Qh = interfaceC0746Qh;
                    if (interfaceC0746Qh != null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    new C02455n(xj, interfaceC0746Qh, new C02465o(), DynamicLoaderImpl.getBidderTokenProviderApi());
                    return;
            }
        }
    }

    @Nullable
    public final synchronized InterfaceC0746Qh A09() {
        return this.A03;
    }

    public final synchronized void A0A(XJ xj) {
        if (this.A03 != null) {
            return;
        }
        this.A03 = A03(xj, A02(xj));
        A07(xj, A00(xj, this.A03));
        A08(xj, this.A03);
        if (this.A03 != null) {
            this.A03.A59();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C8E
    public final JW A5H(XJ xj) {
        return C1121c6.A01(xj);
    }

    @Override // com.facebook.ads.redexgen.X.C8E
    public final synchronized C8D A5V(C8C c8c) {
        if (this.A01 == null) {
            this.A01 = new C0928Xk(this);
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.C8E
    public final synchronized C8Z A5z(C8C c8c) {
        return new XV(c8c);
    }

    @Override // com.facebook.ads.redexgen.X.C8E
    public final synchronized C8F A68(C8C c8c) {
        return new C0926Xi(this, c8c);
    }

    @Override // com.facebook.ads.redexgen.X.C8E
    @Nullable
    public final synchronized C0V A6L(C8C c8c) {
        if (!JQ.A0k(c8c)) {
            return null;
        }
        if (this.A00 == null) {
            this.A00 = C0W.A00().A01(new C0929Xl(this, c8c));
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.C8E
    public final synchronized C8G A6s(C8C c8c) {
        return new C0927Xj(this, c8c);
    }

    @Override // com.facebook.ads.redexgen.X.C8E
    public final synchronized C03248z A70() {
        if (this.A02 == null) {
            this.A02 = new C03248z();
            A06();
        }
        return this.A02;
    }
}
