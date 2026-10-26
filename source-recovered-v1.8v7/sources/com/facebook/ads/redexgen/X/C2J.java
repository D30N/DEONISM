package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.2J, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2J {
    public static final int[] A00 = new int[0];
    public static final long[] A01 = new long[0];
    public static final Object[] A02 = new Object[0];

    public static int A00(int i) {
        return A01(i * 8) / 8;
    }

    public static int A01(int i) {
        int i2 = 0;
        int i3 = 4;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i3 >= 32) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    i2 = 1;
                    if (i > (1 << i3) - 12) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return (i2 << i3) - 12;
                case 5:
                    i3++;
                    c2 = 2;
                    break;
                case 6:
                    return i;
            }
        }
    }

    public static int A02(int[] iArr, int i, int mid) {
        int midVal = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = i - 1;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i3 > i4) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    iArr = iArr;
                    midVal = (i3 + i4) >>> 1;
                    i2 = iArr[midVal];
                    if (i2 >= mid) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i3 = midVal + 1;
                    c2 = 2;
                    break;
                case 5:
                    if (i2 <= mid) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    i4 = midVal - 1;
                    c2 = 2;
                    break;
                case 7:
                    return midVal;
                case '\b':
                    return i3 ^ (-1);
            }
        }
    }

    public static int A03(long[] jArr, int i, long j) {
        long j2 = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = i - 1;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i3 > i4) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    jArr = jArr;
                    i2 = (i3 + i4) >>> 1;
                    j2 = jArr[i2];
                    if (j2 >= j) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i3 = i2 + 1;
                    c2 = 2;
                    break;
                case 5:
                    if (j2 <= j) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    i4 = i2 - 1;
                    c2 = 2;
                    break;
                case 7:
                    return i2;
                case '\b':
                    return i3 ^ (-1);
            }
        }
    }

    public static boolean A04(Object obj, Object obj2) {
        boolean z = false;
        char c2 = obj != obj2 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    obj = obj;
                    if (obj == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    obj = obj;
                    obj2 = obj2;
                    if (!obj.equals(obj2)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z = true;
                    c2 = 5;
                    break;
                case 5:
                    return z;
                case 6:
                    z = false;
                    c2 = 5;
                    break;
            }
        }
    }
}
