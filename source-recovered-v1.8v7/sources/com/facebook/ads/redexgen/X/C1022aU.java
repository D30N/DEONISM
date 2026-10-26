package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import d.b.a.b.k;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.aU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1022aU implements N2 {
    public static byte[] A01;
    public final /* synthetic */ N0 A00;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ k.AppCompatTheme_windowFixedHeightMinor);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{75, 71, 69, 6, 78, 73, 75, 77, 74, 71, 71, 67, 6, 73, 76, 91, 6, 73, 76, 90, 77, 88, 71, 90, 92, 65, 70, 79, 6, 110, 97, 102, 97, 123, 96, 119, 105, 108, 119, 122, 109, 120, 103, 122, 124, 97, 102, 111, 119, 110, 100, 103, Byte.MAX_VALUE};
    }

    public C1022aU(N0 n0) {
        this.A00 = n0;
    }

    @Override // com.facebook.ads.redexgen.X.N2
    public final void A41() {
        if (this.A00.A06 != null) {
            this.A00.A06.A3r(A00(0, 53, 95));
        }
    }

    @Override // com.facebook.ads.redexgen.X.N2
    public final void A42() {
        this.A00.A0L();
        if (this.A00.A07 != null) {
            this.A00.A07.AAq(true);
        }
        this.A00.A0A();
    }

    @Override // com.facebook.ads.redexgen.X.N2
    public final void A7G() {
        C1022aU c1022aU = this;
        char c2 = c1022aU.A00.A03 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c1022aU.A42();
                    return;
                case 3:
                    c1022aU = c1022aU;
                    N0.A01(c1022aU.A00);
                    if (c1022aU.A00.A03.A02() != null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1022aU = c1022aU;
                    c1022aU.A00.A0B();
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    c1022aU = c1022aU;
                    N0 n0 = c1022aU.A00;
                    n0.A0D(n0.A03.A02());
                    c2 = 5;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.N2
    public final void A7p() {
        if (!TextUtils.isEmpty(AnonymousClass24.A0C(this.A00.A04.A00()))) {
            LG.A08(new LG(), this.A00.A04, Uri.parse(AnonymousClass24.A0C(this.A00.A04.A00())), this.A00.A08);
        }
        this.A00.A02.A04();
    }

    @Override // com.facebook.ads.redexgen.X.N2
    public final void A7q() {
        C1022aU c1022aU = this;
        c1022aU.A00.A0L();
        char c2 = c1022aU.A00.A07 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c1022aU = c1022aU;
                    c1022aU.A00.A07.AAq(true);
                    c2 = 3;
                    break;
                case 3:
                    c1022aU = c1022aU;
                    if (!TextUtils.isEmpty(AnonymousClass24.A06(c1022aU.A00.A04.A00()))) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    c1022aU = c1022aU;
                    LG.A08(new LG(), c1022aU.A00.A04, Uri.parse(AnonymousClass24.A06(c1022aU.A00.A04.A00())), c1022aU.A00.A08);
                    c2 = 5;
                    break;
                case 5:
                    C1022aU c1022aU2 = c1022aU;
                    c1022aU2.A00.A02.A06();
                    c1022aU2.A00.A0A();
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.N2
    public final void AAH(AnonymousClass25 anonymousClass25) {
        C1022aU c1022aU = this;
        AnonymousClass27 anonymousClass27A04 = null;
        N0.A00(c1022aU.A00);
        c1022aU.A00.A01 = anonymousClass25;
        char c2 = c1022aU.A00.A01 == AnonymousClass25.A03 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c1022aU = c1022aU;
                    anonymousClass27A04 = AnonymousClass24.A03(c1022aU.A00.A04.A00());
                    c2 = 3;
                    break;
                case 3:
                    c1022aU.A00.A0D(anonymousClass27A04);
                    return;
                case 4:
                    c1022aU = c1022aU;
                    anonymousClass27A04 = AnonymousClass24.A04(c1022aU.A00.A04.A00());
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.N2
    public final void AAP(AnonymousClass27 anonymousClass27) {
        C1022aU c1022aU = this;
        N0.A00(c1022aU.A00);
        c1022aU.A00.A02.A07(anonymousClass27.A01());
        char c2 = anonymousClass27.A05().isEmpty() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c1022aU = c1022aU;
                    anonymousClass27 = anonymousClass27;
                    c1022aU.A00.A0C(anonymousClass27);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    c1022aU = c1022aU;
                    anonymousClass27 = anonymousClass27;
                    c1022aU.A00.A0D(anonymousClass27);
                    c2 = 3;
                    break;
            }
        }
    }
}
