package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Sg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0797Sg<T> implements C2R<T> {
    public static byte[] A02;
    public int A00;
    public final Object[] A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 114);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A02 = new byte[]{-30, -10, -13, -82, -5, -17, 6, -82, -2, -3, -3, -6, -82, 1, -9, 8, -13, -82, -5, 3, 1, 2, -82, -16, -13, -82, -52, -82, -66, -66, -23, -17, -30, -34, -31, -10, -99, -26, -21, -99, -15, -27, -30, -99, -19, -20, -20, -23, -98};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Sg != com.facebook.ads.internal.androidx.support.v4.util.Pools$SimplePool<T> */
    public C0797Sg(int i) {
        if (i > 0) {
            this.A01 = new Object[i];
            return;
        }
        throw new IllegalArgumentException(A00(0, 29, 28));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Sg != com.facebook.ads.internal.androidx.support.v4.util.Pools$SimplePool<T> */
    /* JADX WARN: Multi-variable type inference failed */
    private boolean A02(T t) {
        C0797Sg<T> c0797Sg = this;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    c0797Sg = c0797Sg;
                    if (i >= c0797Sg.A00) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0797Sg = c0797Sg;
                    t = t;
                    if (c0797Sg.A01[i] != t) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return true;
                case 5:
                    i++;
                    c2 = 2;
                    break;
                case 6:
                    return false;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Sg != com.facebook.ads.internal.androidx.support.v4.util.Pools$SimplePool<T> */
    @Override // com.facebook.ads.redexgen.X.C2R
    public T A2O() {
        int i = this.A00;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.A01;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.A00 = i - 1;
        return t;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Sg != com.facebook.ads.internal.androidx.support.v4.util.Pools$SimplePool<T> */
    @Override // com.facebook.ads.redexgen.X.C2R
    public boolean ACM(T t) {
        C0797Sg<T> c0797Sg = this;
        Object[] objArr = null;
        int i = 0;
        char c2 = !c0797Sg.A02(t) ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0797Sg = c0797Sg;
                    i = c0797Sg.A00;
                    objArr = c0797Sg.A01;
                    if (i >= objArr.length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    objArr[i] = t;
                    c0797Sg.A00 = i + 1;
                    return true;
                case 4:
                    return false;
                case 5:
                    throw new IllegalStateException(A00(29, 20, 11));
            }
        }
    }
}
