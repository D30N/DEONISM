package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.facebook.ads.NativeAdBase;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Tn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0827Tn implements InterfaceC01441n {
    public static byte[] A03;
    public C5F A00;
    public XI A01;
    public final NativeAdBase.MediaCacheFlag A02;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 104);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A03 = new byte[]{3, -4, -7, -4, -3, 5, -4, -21, -34, -15, -26, -13, -30};
    }

    public C0827Tn(C5F c5f, XI xi, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = c5f;
        this.A01 = xi;
        this.A02 = mediaCacheFlag;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01441n
    public final void A9Y(K5 k5) {
        C0600Kn.A00(new C0824Tk(this, k5));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01441n
    public final void AAN(List<C0770Rf> list) {
        C7C c7c = new C7C(this.A01);
        String strA02 = A02(0, 7, 38);
        for (C0770Rf c0770Rf : list) {
            if (A02(0, 7, 38).equals(strA02)) {
                strA02 = c0770Rf.A0Q();
            }
            if (this.A02.equals(NativeAdBase.MediaCacheFlag.ALL)) {
                if (c0770Rf.A0J() != null) {
                    c7c.A0Q(new AnonymousClass79(c0770Rf.A0J().getUrl(), c0770Rf.A0J().getHeight(), c0770Rf.A0J().getWidth(), c0770Rf.A0Q(), A02(7, 6, 21)));
                }
                if (c0770Rf.A0I() != null) {
                    c7c.A0Q(new AnonymousClass79(c0770Rf.A0I().getUrl(), c0770Rf.A0I().getHeight(), c0770Rf.A0I().getWidth(), c0770Rf.A0Q(), A02(7, 6, 21)));
                }
                if (!TextUtils.isEmpty(c0770Rf.A0S())) {
                    c7c.A0V(new C7B(c0770Rf.A0S(), c0770Rf.A0Q(), A02(7, 6, 21), c0770Rf.A0M().longValue()));
                }
            }
        }
        c7c.A0P(new C0826Tm(this, list), new AnonymousClass75(strA02, A02(7, 6, 21)));
    }
}
