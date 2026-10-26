package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0472Fm extends AbstractC1009aH {
    public static byte[] A02;
    public final /* synthetic */ RW A00;
    public final /* synthetic */ C0772Rh A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 78);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A02 = new byte[]{-96, -51, -51, -54, -51, 123, -64, -45, -64, -66, -48, -49, -60, -55, -62, 123, -68, -66, -49, -60, -54, -55, -27, -31, -32, -29};
    }

    public C0472Fm(RW rw, C0772Rh c0772Rh) {
        this.A00 = rw;
        this.A01 = c0772Rh;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0669Nh
    public final void A8u() {
        this.A00.A09 = true;
        if (!this.A00.A0A) {
            return;
        }
        this.A00.A06();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1009aH, com.facebook.ads.redexgen.X.InterfaceC0669Nh
    public final void A9A(String str, Map<String, String> map) {
        C0472Fm c0472Fm = this;
        c0472Fm.A00.A02.A0A().A3Y();
        Uri uri = Uri.parse(str);
        char c2 = A00(22, 4, 49).equals(uri.getScheme()) ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    uri = uri;
                    if (!C01110g.A04(uri.getAuthority())) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0472Fm = c0472Fm;
                    if (c0472Fm.A00.A00 == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0472Fm = c0472Fm;
                    c0472Fm.A00.A00.A92(c0472Fm.A00);
                    c2 = 5;
                    break;
                case 5:
                    C0472Fm c0472Fm2 = c0472Fm;
                    AbstractC01100f abstractC01100fA00 = C01110g.A00(c0472Fm2.A00.A02, c0472Fm2.A00.A03, c0472Fm2.A01.A5k(), uri, map);
                    if (abstractC01100fA00 == null) {
                        return;
                    }
                    try {
                        c0472Fm2.A00.A02.A0A().A3V();
                        abstractC01100fA00.A0B();
                        return;
                    } catch (Exception e) {
                        Log.e(RW.A0C, A00(0, 22, 13), e);
                        return;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1009aH, com.facebook.ads.redexgen.X.InterfaceC0669Nh
    public final void A9j() {
        C0472Fm c0472Fm = this;
        boolean z = false;
        RI riA0A = c0472Fm.A00.A02.A0A();
        char c2 = c0472Fm.A00.A01 != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    c0472Fm = c0472Fm;
                    riA0A = riA0A;
                    riA0A.A3Z(z);
                    if (c0472Fm.A00.A01 == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0472Fm = c0472Fm;
                    c0472Fm.A00.A01.A02();
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1009aH, com.facebook.ads.redexgen.X.InterfaceC0669Nh
    public final void AAR() {
        this.A00.A02.A0A().A3b();
        this.A00.A01.A07();
    }
}
