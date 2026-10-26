package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import d.b.a.b.k;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class XF implements C0M {
    public static byte[] A01;
    public final /* synthetic */ XJ A00;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 37);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{53, 49, 61, 59, 57};
    }

    public XF(XJ xj) {
        this.A00 = xj;
    }

    @Override // com.facebook.ads.redexgen.X.C0M
    public final void A7x(Throwable th) {
        this.A00.A04().A83(A00(0, 5, k.AppCompatTheme_windowFixedWidthMinor), C03008a.A1J, new C03018b(th));
    }

    @Override // com.facebook.ads.redexgen.X.C0M
    public final void A86(Throwable th) {
        this.A00.A04().A83(A00(0, 5, k.AppCompatTheme_windowFixedWidthMinor), C03008a.A1L, new C03018b(th));
    }

    @Override // com.facebook.ads.redexgen.X.C0M
    public final void ACC(String str, int i, @Nullable String str2, @Nullable Integer num, @Nullable Long l, AnonymousClass06 anonymousClass06) {
        C7F.A05(this.A00, anonymousClass06.A06, anonymousClass06.A08, anonymousClass06.A09, anonymousClass06.A07, anonymousClass06.A03, i, str2, num, l, null);
    }

    @Override // com.facebook.ads.redexgen.X.C0M
    public final void ACD(String str, boolean z, AnonymousClass06 anonymousClass06) {
        C7F.A04(this.A00, new C7E(anonymousClass06.A06, anonymousClass06.A08, anonymousClass06.A07, anonymousClass06.A03, str), z);
    }
}
