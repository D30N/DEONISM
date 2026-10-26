package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.support.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0473Fn extends RO {
    public static byte[] A02;
    public static final String A03;
    public final Uri A00;
    public final Map<String, String> A01;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 30);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A02 = new byte[]{78, 105, 97, 100, 109, 108, 40, 124, 103, 40, 103, 120, 109, 102, 40, 100, 97, 102, 99, 40, 125, 122, 100, 50, 40, 13, 8, 15, 10};
    }

    static {
        A01();
        A03 = C0473Fn.class.getSimpleName();
    }

    public C0473Fn(XI xi, JW jw, String str, Uri uri, Map<String, String> map, C01170m c01170m, boolean z) {
        super(xi, jw, str, c01170m, z);
        this.A00 = uri;
        this.A01 = map;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01100f
    @Nullable
    public final EnumC01090e A09() {
        try {
            LG.A08(new LG(), ((AbstractC01100f) this).A00, Uri.parse(this.A00.getQueryParameter(A00(25, 4, 127))), this.A02);
            return null;
        } catch (Exception unused) {
            String str = A00(0, 25, 22) + this.A00.toString();
            return EnumC01090e.A02;
        }
    }

    @Override // com.facebook.ads.redexgen.X.RO
    public final void A0C() {
        EnumC01090e enumC01090eA09 = null;
        if (((RO) this).A01) {
            enumC01090eA09 = A09();
        }
        A0D(this.A01, enumC01090eA09);
    }
}
