package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Cm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0411Cm {
    public static C0410Cl A00(int i, long[] jArr, int[] iArr, long j) {
        int i2 = 8192 / i;
        int iA04 = 0;
        for (int i3 : iArr) {
            iA04 += C0560Iy.A04(i3, i2);
        }
        long[] jArr2 = new long[iA04];
        int[] iArr2 = new int[iA04];
        int iMax = 0;
        long[] jArr3 = new long[iA04];
        int[] iArr3 = new int[iA04];
        int i4 = 0;
        int i5 = 0;
        for (int chunkIndex = 0; chunkIndex < iArr.length; chunkIndex++) {
            int maximumSize = iArr[chunkIndex];
            long j2 = jArr[chunkIndex];
            while (maximumSize > 0) {
                int iMin = Math.min(i2, maximumSize);
                jArr2[i5] = j2;
                iArr2[i5] = i * iMin;
                iMax = Math.max(iMax, iArr2[i5]);
                jArr3[i5] = i4 * j;
                iArr3[i5] = 1;
                j2 += iArr2[i5];
                i4 += iMin;
                maximumSize -= iMin;
                i5++;
            }
        }
        return new C0410Cl(jArr2, iArr2, iMax, jArr3, iArr3, j * i4);
    }
}
