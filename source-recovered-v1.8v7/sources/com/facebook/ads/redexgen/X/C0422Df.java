package com.facebook.ads.redexgen.X;

import android.util.Log;
import d.b.a.b.k;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Df, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0422Df implements Z2 {
    public static byte[] A03;
    public final long A00;
    public final long[] A01;
    public final long[] A02;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 76);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A03 = new byte[]{-72, -84, -49, -69, -53, -62, -103, -35, -38, -19, -38, -103, -20, -30, -13, -34, -103, -26, -30, -20, -26, -38, -19, -36, -31, -77, -103, 27, 39, 55, 46, 24, 42, 42, 48, 42, 55};
    }

    public C0422Df(long[] jArr, long[] jArr2, long j) {
        this.A02 = jArr;
        this.A01 = jArr2;
        this.A00 = j;
    }

    public static C0422Df A00(long j, long j2, CI ci, C0544Ii c0544Ii) {
        CI ci2 = ci;
        C0544Ii c0544Ii2 = c0544Ii;
        long j3 = 0;
        long j4 = 0;
        int iA0G = 0;
        long j5 = 0;
        int iA0I = 0;
        long j6 = 0;
        long[] jArr = null;
        long jA0G = 0;
        int iA0I2 = 0;
        int i = 0;
        int i2 = 0;
        int iA0I3 = 0;
        long j7 = 0;
        long j8 = 0;
        int i3 = 0;
        long j9 = 0;
        long[] jArr2 = null;
        C0544Ii c0544Ii3 = c0544Ii2;
        c0544Ii3.A0Z(10);
        int iA08 = c0544Ii2.A08();
        char c2 = iA08 <= 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (C0422Df) null;
                case 3:
                    ci2 = ci2;
                    i2 = ci2.A03;
                    j7 = iA08;
                    j8 = 1000000;
                    if (i2 < 32000) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i3 = 1152;
                    c2 = 5;
                    break;
                case 5:
                    c0544Ii2 = c0544Ii2;
                    ci2 = ci2;
                    c0544Ii3 = c0544Ii3;
                    jA0G = C0560Iy.A0G(j7, j8 * i3, i2);
                    iA0I2 = c0544Ii2.A0I();
                    iA0I = c0544Ii2.A0I();
                    iA0I3 = c0544Ii2.A0I();
                    c0544Ii3.A0Z(2);
                    j9 = j2 + ci2.A02;
                    jArr2 = new long[iA0I2];
                    jArr = new long[iA0I2];
                    i = 0;
                    j6 = j2;
                    c2 = 6;
                    break;
                case 6:
                    if (i >= iA0I2) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    jArr2 = jArr2;
                    jArr = jArr;
                    j5 = jA0G;
                    jArr2[i] = (i * jA0G) / iA0I2;
                    jArr[i] = Math.max(j6, j9);
                    if (iA0I3 == 1) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    if (iA0I3 == 2) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    if (iA0I3 == 3) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    if (iA0I3 == 4) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    return (C0422Df) null;
                case '\f':
                    c0544Ii2 = c0544Ii2;
                    iA0G = c0544Ii2.A0G();
                    c2 = 16;
                    break;
                case '\r':
                    c0544Ii2 = c0544Ii2;
                    iA0G = c0544Ii2.A0I();
                    c2 = 16;
                    break;
                case 14:
                    c0544Ii2 = c0544Ii2;
                    iA0G = c0544Ii2.A0E();
                    c2 = 16;
                    break;
                case 15:
                    c0544Ii2 = c0544Ii2;
                    iA0G = c0544Ii2.A0H();
                    c2 = 16;
                    break;
                case 16:
                    j6 += iA0G * iA0I;
                    i++;
                    jA0G = j5;
                    c2 = 6;
                    break;
                case 17:
                    i3 = 576;
                    c2 = 5;
                    break;
                case 18:
                    j3 = jA0G;
                    j4 = j;
                    if (j4 == -1) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    if (j4 == j6) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    Log.w(A01(27, 10, k.AppCompatTheme_windowFixedWidthMinor), A01(2, 25, 45) + j4 + A01(0, 2, 64) + j6);
                    c2 = 21;
                    break;
                case 21:
                    return new C0422Df(jArr2, jArr, j3);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CL
    public final long A65() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.CL
    public final CK A6t(long j) {
        C0422Df c0422Df = this;
        long[] jArr = null;
        int iA0B = C0560Iy.A0B(c0422Df.A02, j, true, true);
        CM cm = new CM(c0422Df.A02[iA0B], c0422Df.A01[iA0B]);
        char c2 = cm.A01 < j ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0422Df = c0422Df;
                    jArr = c0422Df.A02;
                    if (iA0B != jArr.length - 1) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return new CK(cm);
                case 4:
                    return new CK(cm, new CM(jArr[iA0B + 1], c0422Df.A01[iA0B + 1]));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.Z2
    public final long A79(long j) {
        return this.A02[C0560Iy.A0B(this.A01, j, true, true)];
    }

    @Override // com.facebook.ads.redexgen.X.CL
    public final boolean A7n() {
        return true;
    }
}
