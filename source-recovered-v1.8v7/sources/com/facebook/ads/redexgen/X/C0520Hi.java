package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.support.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Hi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0520Hi {
    public static byte[] A07;
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final Uri A04;

    @Nullable
    public final String A05;

    @Nullable
    public final byte[] A06;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 22);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A07 = new byte[]{83, 71, -113, -86, -57, -38, -57, -71, -42, -53, -55, -63};
    }

    public C0520Hi(Uri uri, int i) {
        this(uri, 0L, -1L, null, i);
    }

    public C0520Hi(Uri uri, long j, long j2, long j3, @Nullable String str, int i) {
        this(uri, null, j, j2, j3, str, i);
    }

    public C0520Hi(Uri uri, long j, long j2, @Nullable String str) {
        this(uri, j, j, j2, str, 0);
    }

    public C0520Hi(Uri uri, long j, long j2, @Nullable String str, int i) {
        this(uri, j, j, j2, str, i);
    }

    public C0520Hi(Uri uri, @Nullable byte[] bArr, long j, long j2, long j3, @Nullable String str, int i) {
        boolean z = true;
        IJ.A03(j >= 0);
        IJ.A03(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        IJ.A03(z);
        this.A04 = uri;
        this.A06 = bArr;
        this.A01 = j;
        this.A03 = j2;
        this.A02 = j3;
        this.A05 = str;
        this.A00 = i;
    }

    private final C0520Hi A00(long j, long j2) {
        if (j == 0 && this.A02 == j2) {
            return this;
        }
        return new C0520Hi(this.A04, this.A06, this.A01 + j, this.A03 + j, j2, this.A05, this.A00);
    }

    public final C0520Hi A03(long j) {
        long j2 = this.A02;
        return A00(j, j2 != -1 ? j2 - j : -1L);
    }

    public final boolean A04(int i) {
        boolean z = false;
        char c2 = (this.A00 & i) == i ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(A01(3, 9, 80));
        sb.append(this.A04);
        String strA01 = A01(0, 2, 17);
        sb.append(strA01);
        sb.append(Arrays.toString(this.A06));
        sb.append(strA01);
        sb.append(this.A01);
        sb.append(strA01);
        sb.append(this.A03);
        sb.append(strA01);
        sb.append(this.A02);
        sb.append(strA01);
        sb.append(this.A05);
        sb.append(strA01);
        sb.append(this.A00);
        sb.append(A01(2, 1, 28));
        return sb.toString();
    }
}
