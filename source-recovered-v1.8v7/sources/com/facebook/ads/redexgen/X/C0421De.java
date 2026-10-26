package com.facebook.ads.redexgen.X;

import android.util.Log;
import d.b.a.b.k;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.De, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0421De implements Z2 {
    public static byte[] A05;
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long[] A04;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 25);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A05 = new byte[]{71, 75, 51, 34, 37, 44, 75, 15, 10, 31, 10, 75, 24, 2, 17, 14, 75, 6, 2, 24, 6, 10, 31, 8, 3, 81, 75, 86, 103, 96, 105, 93, 107, 107, 101, 107, 124};
    }

    public C0421De(long j, int i, long j2) {
        this(j, i, j2, -1L, null);
    }

    public C0421De(long j, int i, long j2, long j3, long[] jArr) {
        this.A02 = j;
        this.A00 = i;
        this.A03 = j2;
        this.A01 = j3;
        this.A04 = jArr;
    }

    private long A00(int i) {
        return (this.A03 * i) / 100;
    }

    public static C0421De A01(long j, long j2, CI ci, C0544Ii c0544Ii) {
        int flags;
        int i = ci.A04;
        int i2 = ci.A03;
        int iA08 = c0544Ii.A08();
        int samplesPerFrame = iA08 & 1;
        if (samplesPerFrame != 1 || (flags = c0544Ii.A0H()) == 0) {
            return null;
        }
        long dataSize = C0560Iy.A0G(flags, i * 1000000, i2);
        int samplesPerFrame2 = iA08 & 6;
        if (samplesPerFrame2 != 6) {
            return new C0421De(j2, ci.A02, dataSize);
        }
        long jA0H = c0544Ii.A0H();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            long durationUs = c0544Ii.A0E();
            jArr[i3] = durationUs;
        }
        if (j != -1 && j != j2 + jA0H) {
            StringBuilder sb = new StringBuilder();
            sb.append(A02(2, 25, k.AppCompatTheme_viewInflaterClass));
            sb.append(j);
            sb.append(A02(0, 2, k.AppCompatTheme_viewInflaterClass));
            long durationUs2 = j2 + jA0H;
            sb.append(durationUs2);
            Log.w(A02(27, 10, 23), sb.toString());
        }
        return new C0421De(j2, ci.A02, dataSize, jA0H, jArr);
    }

    @Override // com.facebook.ads.redexgen.X.CL
    public final long A65() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.CL
    public final CK A6t(long j) {
        long[] jArr = null;
        double d2 = 0.0d;
        double prevScaledPosition = 0.0d;
        int i = 0;
        long jA0F = 0;
        long timeUs = 0;
        double d3 = 0.0d;
        double d4 = 0.0d;
        double d5 = 0.0d;
        C0421De c0421De = this;
        char c2 = !A7n() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return new CK(new CM(0L, c0421De.A02 + r4.A00));
                case 3:
                    c0421De = c0421De;
                    jA0F = C0560Iy.A0F(j, 0L, c0421De.A03);
                    d5 = 100.0d;
                    prevScaledPosition = (jA0F * 100.0d) / c0421De.A03;
                    timeUs = 4643211215818981376L;
                    if (prevScaledPosition > 0.0d) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    d3 = 0.0d;
                    c2 = 5;
                    break;
                case 5:
                    C0421De c0421De2 = c0421De;
                    long jRound = Math.round((d3 / timeUs) * c0421De2.A01);
                    long positionOffset = c0421De2.A00;
                    return new CK(new CM(jA0F, c0421De2.A02 + C0560Iy.A0F(jRound, positionOffset, c0421De2.A01 - 1)));
                case 6:
                    if (prevScaledPosition < d5) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    d3 = 256.0d;
                    c2 = 5;
                    break;
                case '\b':
                    c0421De = c0421De;
                    i = (int) prevScaledPosition;
                    jArr = c0421De.A04;
                    d4 = jArr[i];
                    if (i != 99) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    d2 = timeUs;
                    c2 = '\n';
                    break;
                case '\n':
                    double nextScaledPosition = prevScaledPosition - i;
                    double interpolateFraction = d2 - d4;
                    d3 = d4 + (interpolateFraction * nextScaledPosition);
                    c2 = 5;
                    break;
                case 11:
                    jArr = jArr;
                    d2 = jArr[i + 1];
                    c2 = '\n';
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.Z2
    public final long A79(long j) {
        int iA0B = 0;
        double d2 = 0.0d;
        double d3 = 0.0d;
        long j2 = 0;
        long jA00 = 0;
        long j3 = 0;
        long jA002 = 0;
        C0421De c0421De = this;
        long positionOffset = j - c0421De.A02;
        char c2 = A7n() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0421De = c0421De;
                    long nextScaledPosition = c0421De.A00;
                    if (positionOffset > nextScaledPosition) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return 0L;
                case 4:
                    c0421De = c0421De;
                    d2 = (positionOffset * 256.0d) / c0421De.A01;
                    iA0B = C0560Iy.A0B(c0421De.A04, (long) d2, true, true);
                    jA002 = c0421De.A00(iA0B);
                    j3 = c0421De.A04[iA0B];
                    jA00 = c0421De.A00(iA0B + 1);
                    if (iA0B != 99) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    j2 = 256;
                    c2 = 6;
                    break;
                case 6:
                    if (j3 != j2) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    d3 = 0.0d;
                    c2 = '\b';
                    break;
                case '\b':
                    long nextScaledPosition2 = Math.round((jA00 - jA002) * d3);
                    return nextScaledPosition2 + jA002;
                case '\t':
                    d3 = (d2 - j3) / (j2 - j3);
                    c2 = '\b';
                    break;
                case '\n':
                    c0421De = c0421De;
                    j2 = c0421De.A04[iA0B + 1];
                    c2 = 6;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CL
    public final boolean A7n() {
        boolean z = false;
        char c2 = this.A04 != null ? (char) 2 : (char) 4;
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
}
