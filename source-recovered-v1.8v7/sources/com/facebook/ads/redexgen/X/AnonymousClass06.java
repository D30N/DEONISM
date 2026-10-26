package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.06, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass06 {
    public static byte[] A0B;
    public int A00;
    public int A01;

    @Nullable
    public Integer A02;
    public String A03;
    public String A04;
    public boolean A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 68);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A0B = new byte[]{-53, -60, -63, -60, -59, -51, -60};
    }

    public AnonymousClass06(AnonymousClass06 anonymousClass06) {
        this.A04 = A00(7, 0, 75);
        this.A01 = -1;
        this.A00 = -1;
        this.A09 = anonymousClass06.A09;
        this.A08 = anonymousClass06.A08;
        this.A06 = anonymousClass06.A06;
        this.A07 = anonymousClass06.A07;
        this.A02 = anonymousClass06.A02;
        this.A03 = anonymousClass06.A03;
        this.A0A = anonymousClass06.A0A;
    }

    public AnonymousClass06(String str) {
        this.A04 = A00(7, 0, 75);
        this.A01 = -1;
        this.A00 = -1;
        this.A09 = str;
        String strA00 = A00(0, 7, 18);
        this.A08 = strA00;
        this.A06 = strA00;
        this.A07 = strA00;
        this.A02 = null;
        this.A03 = strA00;
        this.A0A = false;
    }

    public AnonymousClass06(String str, String str2, String str3, String str4, String str5, boolean z) {
        this.A04 = A00(7, 0, 75);
        this.A01 = -1;
        this.A00 = -1;
        this.A09 = str;
        this.A08 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A02 = null;
        this.A03 = str5;
        this.A0A = z;
    }
}
