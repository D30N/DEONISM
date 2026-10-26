package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.2K, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2K<E> implements Cloneable {
    public static byte[] A04;
    public static final Object A05;
    public int A00;
    public boolean A01;
    public long[] A02;
    public Object[] A03;

    public static String A03(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 91);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A05() {
        A04 = new byte[]{-103, -115, -8, 68, 56, 57, 67, -16, 29, 49, 64, -7, -14, -12};
    }

    static {
        A05();
        A05 = new Object();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public C2K() {
        this(10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public C2K(int i) {
        this.A01 = false;
        if (i == 0) {
            this.A02 = C2J.A01;
            this.A03 = C2J.A02;
        } else {
            int iA00 = C2J.A00(i);
            this.A02 = new long[iA00];
            this.A03 = new Object[iA00];
        }
        this.A00 = 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    private final long A00(int i) {
        if (this.A01) {
            A04();
        }
        return this.A02[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C2K<E> clone() {
        C2K<E> c2k = null;
        try {
            c2k = (C2K) super.clone();
            c2k.A02 = (long[]) this.A02.clone();
            c2k.A03 = (Object[]) this.A03.clone();
            return c2k;
        } catch (CloneNotSupportedException unused) {
            return c2k;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    private final E A02(long j, E e) {
        C2K<E> c2k = this;
        Object[] objArr = null;
        int iA03 = C2J.A03(c2k.A02, c2k.A00, j);
        char c2 = iA03 >= 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c2k = c2k;
                    objArr = c2k.A03;
                    if (objArr[iA03] != A05) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return e;
                case 4:
                    return (E) objArr[iA03];
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    private void A04() {
        Object obj = null;
        int i = this.A00;
        int i2 = 0;
        long[] jArr = this.A02;
        Object[] objArr = this.A03;
        int i3 = 0;
        int i4 = 2;
        while (true) {
            switch (i4) {
                case 2:
                    if (i3 >= i) {
                        i4 = 8;
                        break;
                    } else {
                        i4 = 3;
                        break;
                    }
                case 3:
                    objArr = objArr;
                    obj = objArr[i3];
                    Object val = A05;
                    if (obj == val) {
                        i4 = 7;
                        break;
                    } else {
                        i4 = 4;
                        break;
                    }
                case 4:
                    if (i3 == i2) {
                        i4 = 6;
                        break;
                    } else {
                        i4 = 5;
                        break;
                    }
                case 5:
                    jArr = jArr;
                    objArr = objArr;
                    obj = obj;
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                    i4 = 6;
                    break;
                case 6:
                    i2++;
                    i4 = 7;
                    break;
                case 7:
                    i3++;
                    i4 = 2;
                    break;
                case 8:
                    C2K<E> c2k = this;
                    c2k.A01 = false;
                    c2k.A00 = i2;
                    return;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final int A06() {
        if (this.A01) {
            A04();
        }
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final E A07(int i) {
        if (this.A01) {
            A04();
        }
        return (E) this.A03[i];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final E A08(long j) {
        return A02(j, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final void A09() {
        int i = this.A00;
        Object[] objArr = this.A03;
        int i2 = 0;
        int i3 = 2;
        while (true) {
            switch (i3) {
                case 2:
                    if (i2 >= i) {
                        i3 = 4;
                        break;
                    } else {
                        i3 = 3;
                        break;
                    }
                case 3:
                    objArr = objArr;
                    objArr[i2] = null;
                    i2++;
                    i3 = 2;
                    break;
                case 4:
                    C2K<E> c2k = this;
                    c2k.A00 = 0;
                    c2k.A01 = false;
                    return;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final void A0A(int i) {
        Object[] objArr = this.A03;
        Object obj = objArr[i];
        Object obj2 = A05;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.A01 = true;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void A0B(long j, E e) {
        C2K<E> c2k = this;
        int i = 0;
        int i2 = 0;
        Object[] objArr = null;
        int iA03 = 0;
        int iA032 = C2J.A03(c2k.A02, c2k.A00, j);
        char c2 = iA032 >= 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c2k = c2k;
                    e = (E) e;
                    c2k.A03[iA032] = e;
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    c2k = c2k;
                    iA03 = iA032 ^ (-1);
                    if (iA03 >= c2k.A00) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c2k = c2k;
                    objArr = c2k.A03;
                    if (objArr[iA03] != A05) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c2k.A02[iA03] = j;
                    objArr[iA03] = e;
                    return;
                case 7:
                    c2k = c2k;
                    if (!c2k.A01) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c2k = c2k;
                    if (c2k.A00 < c2k.A02.length) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c2k = c2k;
                    c2k.A04();
                    iA03 = C2J.A03(c2k.A02, c2k.A00, j) ^ (-1);
                    c2 = '\n';
                    break;
                case '\n':
                    c2k = c2k;
                    i2 = c2k.A00;
                    if (i2 < c2k.A02.length) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c2k = c2k;
                    int iA00 = C2J.A00(i2 + 1);
                    long[] jArr = new long[iA00];
                    Object[] objArr2 = new Object[iA00];
                    long[] jArr2 = c2k.A02;
                    System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                    Object[] objArr3 = c2k.A03;
                    System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
                    c2k.A02 = jArr;
                    c2k.A03 = objArr2;
                    c2 = '\f';
                    break;
                case '\f':
                    c2k = c2k;
                    i = c2k.A00;
                    if (i - iA03 == 0) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c2k = c2k;
                    long[] jArr3 = c2k.A02;
                    System.arraycopy(jArr3, iA03, jArr3, iA03 + 1, i - iA03);
                    Object[] objArr4 = c2k.A03;
                    System.arraycopy(objArr4, iA03, objArr4, iA03 + 1, c2k.A00 - iA03);
                    c2 = 14;
                    break;
                case 14:
                    c2k = c2k;
                    e = e;
                    c2k.A02[iA03] = j;
                    c2k.A03[iA03] = e;
                    c2k.A00++;
                    c2 = 3;
                    break;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final String toString() {
        C2K<E> c2k = this;
        Object objA07 = null;
        StringBuilder sb = null;
        int i = 0;
        char c2 = c2k.A06() <= 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return A03(12, 2, 28);
                case 3:
                    c2k = c2k;
                    sb = new StringBuilder(c2k.A00 * 28);
                    sb.append('{');
                    i = 0;
                    c2 = 4;
                    break;
                case 4:
                    c2k = c2k;
                    if (i >= c2k.A00) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i <= 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    sb = sb;
                    sb.append(A03(0, 2, 18));
                    c2 = 7;
                    break;
                case 7:
                    c2k = c2k;
                    sb = sb;
                    sb.append(c2k.A00(i));
                    sb.append('=');
                    objA07 = c2k.A07(i);
                    if (objA07 == c2k) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    sb = sb;
                    objA07 = objA07;
                    sb.append(objA07);
                    c2 = '\t';
                    break;
                case '\t':
                    i++;
                    c2 = 4;
                    break;
                case '\n':
                    sb = sb;
                    sb.append(A03(2, 10, k.AppCompatTheme_windowActionModeOverlay));
                    c2 = '\t';
                    break;
                case 11:
                    StringBuilder sb2 = sb;
                    sb2.append('}');
                    return sb2.toString();
            }
        }
    }
}
