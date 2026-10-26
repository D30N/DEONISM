package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: com.facebook.ads.redexgen.X.2O, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2O<K, V> implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
    public static byte[] A04;
    public int A00;
    public final /* synthetic */ C2Q A03;
    public boolean A02 = false;
    public int A01 = -1;

    static {
        A02();
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 19);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A04 = new byte[]{-62, -41, -21, -20, -10, -93, -26, -14, -15, -9, -28, -20, -15, -24, -11, -93, -25, -14, -24, -10, -93, -15, -14, -9, -93, -10, -8, -13, -13, -14, -11, -9, -93, -11, -24, -9, -28, -20, -15, -20, -15, -22, -93, -48, -28, -13, -79, -56, -15, -9, -11, -4, -93, -14, -27, -19, -24, -26, -9, -10};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2O != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    public C2O(C2Q c2q) {
        this.A03 = c2q;
        this.A00 = c2q.A04() - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2O != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    @Override // java.util.Iterator
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final Map.Entry<K, V> next() {
        if (hasNext()) {
            this.A01++;
            this.A02 = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2O != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        C2O<K, V> c2o = this;
        int i = 0;
        Map.Entry entry = null;
        boolean z = false;
        char c2 = c2o.A02 ? (char) 2 : '\b';
        while (true) {
            switch (c2) {
                case 2:
                    obj = obj;
                    z = false;
                    if (!(obj instanceof Map.Entry)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    return false;
                case 4:
                    c2o = c2o;
                    obj = obj;
                    z = false;
                    entry = (Map.Entry) obj;
                    i = 1;
                    if (!C2J.A04(entry.getKey(), c2o.A03.A07(c2o.A01, 0))) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c2o = c2o;
                    entry = entry;
                    if (!C2J.A04(entry.getValue(), c2o.A03.A07(c2o.A01, i))) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    z = true;
                    c2 = 7;
                    break;
                case 7:
                    return z;
                case '\b':
                    throw new IllegalStateException(A00(1, 59, 112));
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2O != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    @Override // java.util.Map.Entry
    public final K getKey() {
        if (this.A02) {
            return (K) this.A03.A07(this.A01, 0);
        }
        throw new IllegalStateException(A00(1, 59, 112));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2O != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    @Override // java.util.Map.Entry
    public final V getValue() {
        if (this.A02) {
            return (V) this.A03.A07(this.A01, 1);
        }
        throw new IllegalStateException(A00(1, 59, 112));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2O != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z = false;
        char c2 = this.A01 < this.A00 ? (char) 2 : (char) 4;
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

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2O != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    @Override // java.util.Map.Entry
    public final int hashCode() {
        C2O<K, V> c2o = this;
        Object value = null;
        int iHashCode = 0;
        int iHashCode2 = 0;
        Object objA07 = null;
        char c2 = c2o.A02 ? (char) 2 : '\b';
        while (true) {
            switch (c2) {
                case 2:
                    c2o = c2o;
                    iHashCode2 = 0;
                    value = c2o.A03.A07(c2o.A01, 0);
                    objA07 = c2o.A03.A07(c2o.A01, 1);
                    if (value != null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    iHashCode = 0;
                    c2 = 4;
                    break;
                case 4:
                    objA07 = objA07;
                    if (objA07 != null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return iHashCode2 ^ iHashCode;
                case 6:
                    objA07 = objA07;
                    iHashCode2 = objA07.hashCode();
                    c2 = 5;
                    break;
                case 7:
                    value = value;
                    iHashCode = value.hashCode();
                    c2 = 4;
                    break;
                case '\b':
                    throw new IllegalStateException(A00(1, 59, 112));
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2O != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    @Override // java.util.Iterator
    public final void remove() {
        if (this.A02) {
            this.A03.A0E(this.A01);
            this.A01--;
            this.A00--;
            this.A02 = false;
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2O != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        if (this.A02) {
            return (V) this.A03.A08(this.A01, v);
        }
        throw new IllegalStateException(A00(1, 59, 112));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2O != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    public final String toString() {
        return getKey() + A00(0, 1, k.AppCompatTheme_viewInflaterClass) + getValue();
    }
}
