package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import d.b.a.b.k;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.7B, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C7B {
    public static byte[] A09;
    public long A00;

    @Nullable
    public Integer A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public final String A06;
    public final String A07;
    public final String A08;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i2);
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
        A09 = new byte[]{44, 47, 33, 36};
    }

    public C7B(String str, String str2, String str3) {
        this.A03 = A00(0, 0, 127);
        this.A02 = A00(0, 4, k.AppCompatTheme_viewInflaterClass);
        this.A00 = -1L;
        this.A08 = str;
        this.A07 = str2;
        this.A06 = str3;
        this.A01 = null;
    }

    public C7B(String str, String str2, String str3, long j) {
        this.A03 = A00(0, 0, 127);
        this.A02 = A00(0, 4, k.AppCompatTheme_viewInflaterClass);
        this.A00 = -1L;
        this.A08 = str;
        this.A07 = str2;
        this.A06 = str3;
        this.A01 = null;
        this.A00 = j;
    }
}
