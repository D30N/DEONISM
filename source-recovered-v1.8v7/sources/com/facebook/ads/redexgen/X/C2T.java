package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.2T, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C2T<K, V> {
    public static int A03;
    public static int A04;
    public static Object[] A05;
    public static Object[] A06;
    public static byte[] A07;
    public int[] A01 = C2J.A00;
    public Object[] A02 = C2J.A02;
    public int A00 = 0;

    static {
        A04();
    }

    public static String A03(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 21);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A07 = new byte[]{66, 78, 87, 11, 23, 22, 12, 95, 50, 30, 15, 86, 119, 113};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2T != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    private final int A00() {
        C2T<K, V> c2t = this;
        int index = 0;
        int end = 0;
        int i = 0;
        int i2 = c2t.A00;
        char c2 = i2 == 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return -1;
                case 3:
                    c2t = c2t;
                    end = A02(c2t.A01, i2, 0);
                    if (end >= 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return end;
                case 5:
                    c2t = c2t;
                    if (c2t.A02[end << 1] != null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return end;
                case 7:
                    index = end + 1;
                    c2 = '\b';
                    break;
                case '\b':
                    if (index >= i2) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c2t = c2t;
                    if (c2t.A01[index] != 0) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c2t = c2t;
                    if (c2t.A02[index << 1] != null) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    return index;
                case '\f':
                    index++;
                    c2 = '\b';
                    break;
                case '\r':
                    i = end - 1;
                    c2 = 14;
                    break;
                case 14:
                    if (i < 0) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    c2t = c2t;
                    if (c2t.A01[i] != 0) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    c2t = c2t;
                    if (c2t.A02[i << 1] != null) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    return i;
                case 18:
                    i--;
                    c2 = 14;
                    break;
                case 19:
                    return index ^ (-1);
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2T != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    private final int A01(Object obj, int i) {
        C2T<K, V> c2t = this;
        int iA02 = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = c2t.A00;
        int i5 = i4 == 0 ? 2 : 3;
        while (true) {
            switch (i5) {
                case 2:
                    return -1;
                case 3:
                    c2t = c2t;
                    iA02 = A02(c2t.A01, i4, i);
                    if (iA02 >= 0) {
                        i5 = 5;
                        break;
                    } else {
                        i5 = 4;
                        break;
                    }
                case 4:
                    return iA02;
                case 5:
                    c2t = c2t;
                    obj = obj;
                    int i6 = iA02 << 1;
                    if (!obj.equals(c2t.A02[i6])) {
                        i5 = 7;
                        break;
                    } else {
                        i5 = 6;
                        break;
                    }
                case 6:
                    return iA02;
                case 7:
                    i3 = iA02 + 1;
                    i5 = 8;
                    break;
                case 8:
                    if (i3 >= i4) {
                        i5 = 13;
                        break;
                    } else {
                        i5 = 9;
                        break;
                    }
                case 9:
                    c2t = c2t;
                    int i7 = c2t.A01[i3];
                    if (i7 != i) {
                        i5 = 13;
                        break;
                    } else {
                        i5 = 10;
                        break;
                    }
                case 10:
                    c2t = c2t;
                    obj = obj;
                    if (!obj.equals(c2t.A02[i3 << 1])) {
                        i5 = 12;
                        break;
                    } else {
                        i5 = 11;
                        break;
                    }
                case 11:
                    return i3;
                case 12:
                    i3++;
                    i5 = 8;
                    break;
                case 13:
                    i2 = iA02 - 1;
                    i5 = 14;
                    break;
                case 14:
                    if (i2 < 0) {
                        i5 = 19;
                        break;
                    } else {
                        i5 = 15;
                        break;
                    }
                case 15:
                    c2t = c2t;
                    if (c2t.A01[i2] != i) {
                        i5 = 19;
                        break;
                    } else {
                        i5 = 16;
                        break;
                    }
                case 16:
                    c2t = c2t;
                    obj = obj;
                    if (!obj.equals(c2t.A02[i2 << 1])) {
                        i5 = 18;
                        break;
                    } else {
                        i5 = 17;
                        break;
                    }
                case 17:
                    return i2;
                case 18:
                    i2--;
                    i5 = 14;
                    break;
                case 19:
                    int i8 = i3 ^ (-1);
                    return i8;
            }
        }
    }

    public static int A02(int[] iArr, int i, int i2) {
        try {
            return C2J.A02(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2T != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    private void A05(int i) {
        if (i == 8) {
            synchronized (C0796Sf.class) {
                if (A06 != null) {
                    Object[] objArr = A06;
                    this.A02 = objArr;
                    A06 = (Object[]) objArr[0];
                    this.A01 = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    A04--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0796Sf.class) {
                if (A05 != null) {
                    Object[] objArr2 = A05;
                    this.A02 = objArr2;
                    A05 = (Object[]) objArr2[0];
                    this.A01 = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    A03--;
                    return;
                }
            }
        }
        this.A01 = new int[i];
        this.A02 = new Object[i << 1];
    }

    public static void A06(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0796Sf.class) {
                if (A04 < 10) {
                    objArr[0] = A06;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    A06 = objArr;
                    A04++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0796Sf.class) {
                if (A03 < 10) {
                    objArr[0] = A05;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    A05 = objArr;
                    A03++;
                }
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2T != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final int A07(Object obj) {
        int i = 0;
        int i2 = 0;
        int i3 = this.A00 * 2;
        Object[] objArr = this.A02;
        char c2 = obj == null ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    i2 = 1;
                    c2 = 3;
                    break;
                case 3:
                    if (i2 >= i3) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    objArr = objArr;
                    if (objArr[i2] != null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return i2 >> 1;
                case 6:
                    i2 += 2;
                    c2 = 3;
                    break;
                case 7:
                    i = 1;
                    c2 = '\b';
                    break;
                case '\b':
                    if (i >= i3) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    obj = obj;
                    objArr = objArr;
                    if (!obj.equals(objArr[i])) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    return i >> 1;
                case 11:
                    i += 2;
                    c2 = '\b';
                    break;
                case '\f':
                    return -1;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2T != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final int A08(Object obj) {
        C2T<K, V> c2t = this;
        int iA01 = 0;
        char c2 = obj == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c2t = c2t;
                    iA01 = c2t.A00();
                    c2 = 3;
                    break;
                case 3:
                    return iA01;
                case 4:
                    c2t = c2t;
                    obj = obj;
                    iA01 = c2t.A01(obj, obj.hashCode());
                    c2 = 3;
                    break;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2T != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final K A09(int i) {
        return (K) this.A02[i << 1];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2T != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final V A0A(int i) {
        C2T<K, V> c2t = this;
        Object[] objArr = null;
        int[] iArr = null;
        int i2 = 0;
        int[] iArr2 = null;
        int i3 = 0;
        Object[] objArr2 = c2t.A02;
        Object obj = objArr2[(i << 1) + 1];
        int i4 = c2t.A00;
        int i5 = i4 <= 1 ? 2 : 5;
        while (true) {
            switch (i5) {
                case 2:
                    c2t = c2t;
                    objArr2 = objArr2;
                    A06(c2t.A01, objArr2, i4);
                    c2t.A01 = C2J.A00;
                    c2t.A02 = C2J.A02;
                    i3 = 0;
                    i5 = 3;
                    break;
                case 3:
                    c2t = c2t;
                    if (i4 != c2t.A00) {
                        i5 = 17;
                        break;
                    } else {
                        i5 = 4;
                        break;
                    }
                case 4:
                    c2t.A00 = i3;
                    return (V) obj;
                case 5:
                    c2t = c2t;
                    i3 = i4 - 1;
                    iArr2 = c2t.A01;
                    i2 = 8;
                    if (iArr2.length <= 8) {
                        i5 = 14;
                        break;
                    } else {
                        i5 = 6;
                        break;
                    }
                case 6:
                    c2t = c2t;
                    iArr2 = iArr2;
                    if (c2t.A00 >= iArr2.length / 3) {
                        i5 = 14;
                        break;
                    } else {
                        i5 = 7;
                        break;
                    }
                case 7:
                    if (i4 <= i2) {
                        i5 = 9;
                        break;
                    } else {
                        i5 = 8;
                        break;
                    }
                case 8:
                    i2 = i4 + (i4 >> 1);
                    i5 = 9;
                    break;
                case 9:
                    c2t = c2t;
                    iArr = c2t.A01;
                    objArr = c2t.A02;
                    c2t.A05(i2);
                    if (i4 != c2t.A00) {
                        i5 = 18;
                        break;
                    } else {
                        i5 = 10;
                        break;
                    }
                case 10:
                    if (i <= 0) {
                        i5 = 12;
                        break;
                    } else {
                        i5 = 11;
                        break;
                    }
                case 11:
                    c2t = c2t;
                    iArr = iArr;
                    objArr = objArr;
                    System.arraycopy(iArr, 0, c2t.A01, 0, i);
                    System.arraycopy(objArr, 0, c2t.A02, 0, i << 1);
                    i5 = 12;
                    break;
                case 12:
                    if (i >= i3) {
                        i5 = 3;
                        break;
                    } else {
                        i5 = 13;
                        break;
                    }
                case 13:
                    c2t = c2t;
                    iArr = iArr;
                    objArr = objArr;
                    System.arraycopy(iArr, i + 1, c2t.A01, i, i3 - i);
                    System.arraycopy(objArr, (i + 1) << 1, c2t.A02, i << 1, (i3 - i) << 1);
                    i5 = 3;
                    break;
                case 14:
                    if (i >= i3) {
                        i5 = 16;
                        break;
                    } else {
                        i5 = 15;
                        break;
                    }
                case 15:
                    c2t = c2t;
                    int[] iArr3 = c2t.A01;
                    System.arraycopy(iArr3, i + 1, iArr3, i, i3 - i);
                    Object[] objArr3 = c2t.A02;
                    System.arraycopy(objArr3, (i + 1) << 1, objArr3, i << 1, (i3 - i) << 1);
                    i5 = 16;
                    break;
                case 16:
                    c2t = c2t;
                    Object[] objArr4 = c2t.A02;
                    objArr4[i3 << 1] = null;
                    objArr4[(i3 << 1) + 1] = null;
                    i5 = 3;
                    break;
                case 17:
                    throw new ConcurrentModificationException();
                case 18:
                    throw new ConcurrentModificationException();
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2T != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final V A0B(int i) {
        return (V) this.A02[(i << 1) + 1];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2T != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final V A0C(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.A02;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2T != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final void A0D(int i) {
        C2T<K, V> c2t = this;
        Object[] objArr = null;
        int[] iArr = null;
        int i2 = c2t.A00;
        char c2 = c2t.A01.length < i ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c2t = c2t;
                    iArr = c2t.A01;
                    objArr = c2t.A02;
                    c2t.A05(i);
                    if (c2t.A00 <= 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c2t = c2t;
                    iArr = iArr;
                    objArr = objArr;
                    System.arraycopy(iArr, 0, c2t.A01, 0, i2);
                    System.arraycopy(objArr, 0, c2t.A02, 0, i2 << 1);
                    c2 = 4;
                    break;
                case 4:
                    iArr = iArr;
                    objArr = objArr;
                    A06(iArr, objArr, i2);
                    c2 = 5;
                    break;
                case 5:
                    c2t = c2t;
                    if (c2t.A00 != i2) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return;
                case 7:
                    throw new ConcurrentModificationException();
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2T != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final void clear() {
        C2T<K, V> c2t = this;
        int osize = c2t.A00 > 0 ? 2 : 3;
        while (true) {
            switch (osize) {
                case 2:
                    c2t = c2t;
                    int[] iArr = c2t.A01;
                    Object[] objArr = c2t.A02;
                    int i = c2t.A00;
                    c2t.A01 = C2J.A00;
                    c2t.A02 = C2J.A02;
                    c2t.A00 = 0;
                    A06(iArr, objArr, i);
                    osize = 3;
                    break;
                case 3:
                    c2t = c2t;
                    if (c2t.A00 > 0) {
                        osize = 5;
                        break;
                    } else {
                        osize = 4;
                        break;
                    }
                case 4:
                    return;
                case 5:
                    throw new ConcurrentModificationException();
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2T != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final boolean containsKey(Object obj) {
        boolean z = false;
        char c2 = A08(obj) >= 0 ? (char) 2 : (char) 4;
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

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2T != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final boolean containsValue(Object obj) {
        boolean z = false;
        char c2 = A07(obj) >= 0 ? (char) 2 : (char) 4;
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

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2T != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<?, ?> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2T != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final boolean equals(Object obj) {
        Object obj2 = obj;
        C2T<K, V> c2t = this;
        Object obj3 = null;
        V vA0B = null;
        Object obj4 = null;
        V vA0B2 = null;
        Object objA09 = null;
        Map map = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        Object objA092 = null;
        C2T c2t2 = null;
        char c2 = c2t == obj2 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return true;
                case 3:
                    obj2 = obj2;
                    z = false;
                    if (!(obj2 instanceof C2T)) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c2t = c2t;
                    obj2 = obj2;
                    c2t2 = (C2T) obj2;
                    if (c2t.size() == c2t2.size()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    z = false;
                    i = 0;
                    c2 = 7;
                    break;
                case 7:
                    c2t = c2t;
                    if (i >= c2t.A00) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    try {
                        c2t = c2t;
                        objA09 = c2t.A09(i);
                        vA0B2 = c2t.A0B(i);
                        obj4 = c2t2.get(objA09);
                        if (vA0B2 != null) {
                            c2 = 16;
                            break;
                        } else {
                            c2 = '\r';
                            break;
                        }
                    } catch (ClassCastException unused) {
                        return z;
                    } catch (NullPointerException unused2) {
                        return z;
                    }
                case '\r':
                    obj4 = obj4;
                    if (obj4 != null) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    c2t2 = c2t2;
                    objA09 = objA09;
                    if (!c2t2.containsKey(objA09)) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 16:
                    vA0B2 = (V) vA0B2;
                    obj4 = obj4;
                    if (!vA0B2.equals(obj4)) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    i++;
                    c2 = 7;
                    break;
                case 19:
                    return false;
                case 20:
                    return false;
                case 21:
                    return true;
                case 24:
                    obj2 = obj2;
                    if (!(obj2 instanceof Map)) {
                        c2 = '-';
                        break;
                    } else {
                        c2 = 25;
                        break;
                    }
                case 25:
                    c2t = c2t;
                    obj2 = obj2;
                    map = (Map) obj2;
                    if (c2t.size() == map.size()) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 26;
                        break;
                    }
                case 26:
                    return false;
                case 27:
                    z = false;
                    i2 = 0;
                    c2 = 28;
                    break;
                case 28:
                    c2t = c2t;
                    if (i2 >= c2t.A00) {
                        c2 = '*';
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 30:
                    c2t = c2t;
                    objA092 = c2t.A09(i2);
                    vA0B = c2t.A0B(i2);
                    obj3 = map.get(objA092);
                    if (vA0B != null) {
                        c2 = '%';
                        break;
                    } else {
                        c2 = '\"';
                        break;
                    }
                case '\"':
                    obj3 = obj3;
                    if (obj3 != null) {
                        c2 = '(';
                        break;
                    } else {
                        c2 = '#';
                        break;
                    }
                case '#':
                    try {
                        map = map;
                        objA092 = objA092;
                        if (!map.containsKey(objA092)) {
                            c2 = '(';
                            break;
                        } else {
                            c2 = '\'';
                            break;
                        }
                    } catch (ClassCastException unused3) {
                        return z;
                    } catch (NullPointerException unused4) {
                        return z;
                    }
                case '%':
                    vA0B = (V) vA0B;
                    obj3 = obj3;
                    if (!vA0B.equals(obj3)) {
                        c2 = ')';
                        break;
                    } else {
                        c2 = '\'';
                        break;
                    }
                case '\'':
                    i2++;
                    c2 = 28;
                    break;
                case '(':
                    return false;
                case ')':
                    return false;
                case '*':
                    return true;
                case '-':
                    return false;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2T != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final V get(Object obj) {
        C2T<K, V> c2t = this;
        Object obj2 = null;
        int iA08 = c2t.A08(obj);
        char c2 = iA08 >= 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c2t = c2t;
                    obj2 = c2t.A02[(iA08 << 1) + 1];
                    c2 = 3;
                    break;
                case 3:
                    return (V) obj2;
                case 4:
                    obj2 = null;
                    c2 = 3;
                    break;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2T != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final int hashCode() {
        Object obj = null;
        int i = 0;
        int v = 0;
        int[] iArr = this.A01;
        Object[] objArr = this.A02;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        int i5 = this.A00;
        int s = 2;
        while (true) {
            switch (s) {
                case 2:
                    if (i3 >= i5) {
                        s = 7;
                        break;
                    } else {
                        s = 3;
                        break;
                    }
                case 3:
                    iArr = iArr;
                    objArr = objArr;
                    obj = objArr[i4];
                    v = iArr[i3];
                    if (obj != null) {
                        s = 6;
                        break;
                    } else {
                        s = 4;
                        break;
                    }
                case 4:
                    i = 0;
                    s = 5;
                    break;
                case 5:
                    i2 += v ^ i;
                    i3++;
                    i4 += 2;
                    s = 2;
                    break;
                case 6:
                    obj = obj;
                    i = obj.hashCode();
                    s = 5;
                    break;
                case 7:
                    return i2;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2T != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final boolean isEmpty() {
        boolean z = false;
        char c2 = this.A00 <= 0 ? (char) 2 : (char) 4;
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

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2T != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final V put(K k, V v) {
        Object obj = k;
        C2T<K, V> c2t = this;
        int iHashCode = 0;
        int i = 0;
        int[] iArr = null;
        int iA01 = 0;
        Object[] objArr = null;
        int[] iArr2 = null;
        int[] iArr3 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = c2t.A00;
        char c2 = obj == null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c2t = c2t;
                    iHashCode = 0;
                    iA01 = c2t.A00();
                    c2 = 3;
                    break;
                case 3:
                    if (iA01 < 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    int i5 = (iA01 << 1) + 1;
                    Object[] objArr2 = c2t.A02;
                    Object obj2 = objArr2[i5];
                    objArr2[i5] = v;
                    return (V) obj2;
                case 5:
                    c2t = c2t;
                    obj = obj;
                    iHashCode = obj.hashCode();
                    iA01 = c2t.A01(obj, iHashCode);
                    c2 = 3;
                    break;
                case 6:
                    c2t = c2t;
                    i = iA01 ^ (-1);
                    if (i4 < c2t.A01.length) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    i3 = 4;
                    if (i4 < 8) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    i3 = (i4 >> 1) + i4;
                    c2 = '\t';
                    break;
                case '\t':
                    c2t = c2t;
                    iArr = c2t.A01;
                    objArr = c2t.A02;
                    c2t.A05(i3);
                    if (i4 != c2t.A00) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c2t = c2t;
                    iArr3 = c2t.A01;
                    if (iArr3.length <= 0) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c2t = c2t;
                    iArr = iArr;
                    objArr = objArr;
                    iArr3 = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    System.arraycopy(objArr, 0, c2t.A02, 0, objArr.length);
                    c2 = '\f';
                    break;
                case '\f':
                    iArr = iArr;
                    objArr = objArr;
                    A06(iArr, objArr, i4);
                    c2 = '\r';
                    break;
                case '\r':
                    if (i >= i4) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    c2t = c2t;
                    int[] iArr4 = c2t.A01;
                    System.arraycopy(iArr4, i, iArr4, i + 1, i4 - i);
                    Object[] objArr3 = c2t.A02;
                    System.arraycopy(objArr3, i << 1, objArr3, (i + 1) << 1, (c2t.A00 - i) << 1);
                    c2 = 15;
                    break;
                case 15:
                    c2t = c2t;
                    i2 = c2t.A00;
                    if (i4 != i2) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    c2t = c2t;
                    iArr2 = c2t.A01;
                    if (i >= iArr2.length) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    C2T<K, V> c2t2 = c2t;
                    iArr2[i] = iHashCode;
                    Object[] objArr4 = c2t2.A02;
                    objArr4[i << 1] = obj;
                    objArr4[(i << 1) + 1] = v;
                    c2t2.A00 = i2 + 1;
                    return (V) ((Object) null);
                case 18:
                    if (i4 < i3) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    i3 = 8;
                    c2 = '\t';
                    break;
                case 20:
                    throw new ConcurrentModificationException();
                case 21:
                    throw new ConcurrentModificationException();
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2T != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final V remove(Object obj) {
        int iA08 = A08(obj);
        if (iA08 >= 0) {
            return A0A(iA08);
        }
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2T != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final int size() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2T != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final String toString() {
        C2T<K, V> c2t = this;
        Object key = null;
        Object objA09 = null;
        String strA03 = null;
        StringBuilder sb = null;
        int i = 0;
        char c2 = c2t.isEmpty() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return A03(12, 2, 25);
                case 3:
                    c2t = c2t;
                    sb = new StringBuilder(c2t.A00 * 28);
                    sb.append('{');
                    i = 0;
                    c2 = 4;
                    break;
                case 4:
                    c2t = c2t;
                    if (i >= c2t.A00) {
                        c2 = 14;
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
                    sb.append(A03(0, 2, k.AppCompatTheme_windowMinWidthMinor));
                    c2 = 7;
                    break;
                case 7:
                    c2t = c2t;
                    objA09 = c2t.A09(i);
                    strA03 = A03(2, 10, 106);
                    if (objA09 == c2t) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    sb = sb;
                    objA09 = objA09;
                    sb.append(objA09);
                    c2 = '\t';
                    break;
                case '\t':
                    c2t = c2t;
                    sb = sb;
                    sb.append('=');
                    key = c2t.A0B(i);
                    if (key == c2t) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    sb = sb;
                    key = key;
                    sb.append(key);
                    c2 = 11;
                    break;
                case 11:
                    i++;
                    c2 = 4;
                    break;
                case '\f':
                    sb = sb;
                    strA03 = strA03;
                    sb.append(strA03);
                    c2 = 11;
                    break;
                case '\r':
                    sb = sb;
                    strA03 = strA03;
                    sb.append(strA03);
                    c2 = '\t';
                    break;
                case 14:
                    StringBuilder sb2 = sb;
                    sb2.append('}');
                    return sb2.toString();
            }
        }
    }
}
