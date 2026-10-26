package com.facebook.ads.redexgen.X;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.bF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1069bF implements GY {
    public static byte[] A04;
    public final int A00;
    public final List<C1068bE> A01;
    public final long[] A02;
    public final long[] A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
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
        A04 = new byte[]{114};
    }

    public C1069bF(List<C1068bE> list) {
        this.A01 = list;
        this.A00 = list.size();
        this.A02 = new long[this.A00 * 2];
        for (int i = 0; i < this.A00; i++) {
            C1068bE c1068bE = list.get(i);
            int i2 = i * 2;
            this.A02[i2] = c1068bE.A01;
            this.A02[i2 + 1] = c1068bE.A00;
        }
        long[] jArr = this.A02;
        this.A03 = Arrays.copyOf(jArr, jArr.length);
        Arrays.sort(this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final List<GX> A5q(long j) {
        C1069bF c1069bF = this;
        String strA00 = null;
        long[] jArr = null;
        C1068bE c1068bE = null;
        ArrayList arrayList = null;
        C1068bE c1068bE2 = null;
        SpannableStringBuilder spannableStringBuilder = null;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    c1069bF = c1069bF;
                    if (i >= c1069bF.A00) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c1069bF = c1069bF;
                    jArr = c1069bF.A02;
                    if (jArr[i * 2] > j) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    jArr = jArr;
                    if (j >= jArr[(i * 2) + 1]) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (arrayList != null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    arrayList = new ArrayList();
                    c2 = 7;
                    break;
                case 7:
                    c1069bF = c1069bF;
                    c1068bE = c1069bF.A01.get(i);
                    if (!c1068bE.A00()) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    if (c1068bE2 != null) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c1068bE = c1068bE;
                    c1068bE2 = c1068bE;
                    c2 = '\n';
                    break;
                case '\n':
                    i++;
                    c2 = 2;
                    break;
                case 11:
                    strA00 = A00(0, 1, 93);
                    if (spannableStringBuilder != null) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    c1068bE = c1068bE;
                    strA00 = strA00;
                    spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append(c1068bE2.A0C).append((CharSequence) strA00).append(c1068bE.A0C);
                    c2 = '\n';
                    break;
                case '\r':
                    c1068bE = c1068bE;
                    strA00 = strA00;
                    spannableStringBuilder.append((CharSequence) strA00).append(c1068bE.A0C);
                    c2 = '\n';
                    break;
                case 14:
                    c1068bE = c1068bE;
                    arrayList.add(c1068bE);
                    c2 = '\n';
                    break;
                case 15:
                    if (spannableStringBuilder == null) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    arrayList.add(new C1068bE(spannableStringBuilder));
                    c2 = 17;
                    break;
                case 17:
                    if (arrayList == null) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    return arrayList;
                case 19:
                    if (c1068bE2 == null) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    arrayList.add(c1068bE2);
                    c2 = 17;
                    break;
                case 21:
                    return Collections.emptyList();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final long A6E(int i) {
        C1069bF c1069bF = this;
        boolean z = false;
        boolean z2 = true;
        char c2 = i >= 0 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    c1069bF = c1069bF;
                    IJ.A03(z);
                    if (i >= c1069bF.A03.length) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    IJ.A03(z2);
                    return c1069bF.A03[i];
                case 5:
                    z2 = false;
                    c2 = 4;
                    break;
                case 6:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final int A6F() {
        return this.A03.length;
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final int A6Z(long j) {
        int i = 0;
        int iA0A = C0560Iy.A0A(this.A03, j, false, false);
        char c2 = iA0A < this.A03.length ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i = iA0A;
                    c2 = 3;
                    break;
                case 3:
                    return i;
                case 4:
                    i = -1;
                    c2 = 3;
                    break;
            }
        }
    }
}
