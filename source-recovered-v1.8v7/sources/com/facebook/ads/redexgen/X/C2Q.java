package com.facebook.ads.redexgen.X;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.2Q, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C2Q<K, V> {

    /* JADX WARN: Incorrect inner types in field signature: Lcom/facebook/ads/redexgen/X/2Q<TK;TV;>.EntrySet; */
    public C2M A00;

    /* JADX WARN: Incorrect inner types in field signature: Lcom/facebook/ads/redexgen/X/2Q<TK;TV;>.KeySet; */
    public C2N A01;

    /* JADX WARN: Incorrect inner types in field signature: Lcom/facebook/ads/redexgen/X/2Q<TK;TV;>.ValuesCollection; */
    public C2P A02;

    public abstract int A04();

    public abstract int A05(Object obj);

    public abstract int A06(Object obj);

    public abstract Object A07(int i, int i2);

    public abstract V A08(int i, V v);

    public abstract Map<K, V> A0A();

    public abstract void A0D();

    public abstract void A0E(int i);

    public abstract void A0F(K k, V v);

    public static <K, V> boolean A00(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    map = map;
                    it = it;
                    if (!map.containsKey(it.next())) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 2;
                        break;
                    }
                case 4:
                    return false;
                case 5:
                    return true;
            }
        }
    }

    public static <K, V> boolean A01(Map<K, V> map, Collection<?> collection) {
        boolean z = false;
        int size = map.size();
        Iterator<?> it = collection.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    map = map;
                    it = it;
                    map.remove(it.next());
                    c2 = 2;
                    break;
                case 4:
                    map = map;
                    if (size == map.size()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    z = true;
                    c2 = 6;
                    break;
                case 6:
                    return z;
                case 7:
                    z = false;
                    c2 = 6;
                    break;
            }
        }
    }

    public static <K, V> boolean A02(Map<K, V> map, Collection<?> collection) {
        boolean z = false;
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    collection = collection;
                    it = it;
                    if (!collection.contains(it.next())) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 2;
                        break;
                    }
                case 4:
                    it = it;
                    it.remove();
                    c2 = 2;
                    break;
                case 5:
                    map = map;
                    if (size == map.size()) {
                        c2 = '\b';
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
                    z = false;
                    c2 = 7;
                    break;
            }
        }
    }

    public static <T> boolean A03(Set<T> set, Object obj) {
        boolean z = false;
        Set set2 = null;
        boolean z2 = true;
        char c2 = set == obj ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return z2;
                case 3:
                    obj = obj;
                    z = false;
                    if (!(obj instanceof Set)) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    obj = obj;
                    set2 = (Set) obj;
                    c2 = 5;
                    break;
                case 5:
                    try {
                        set = set;
                        if (set.size() != set2.size()) {
                            c2 = '\n';
                            break;
                        } else {
                            c2 = '\b';
                            break;
                        }
                    } catch (ClassCastException unused) {
                        return z;
                    } catch (NullPointerException unused2) {
                        return z;
                    }
                case '\b':
                    set = set;
                    set2 = set2;
                    if (!set.containsAll(set2)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case '\n':
                    z2 = false;
                    c2 = 11;
                    break;
                case 11:
                    return z2;
                case 14:
                    return false;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Q != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V> */
    public final Collection<V> A09() {
        if (this.A02 == null) {
            this.A02 = new Collection<V>() { // from class: com.facebook.ads.redexgen.X.2P
                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2P != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean add(V v) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2P != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean addAll(Collection<? extends V> collection) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2P != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final void clear() {
                    this.A00.A0D();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2P != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean contains(Object obj) {
                    boolean z = false;
                    char c2 = this.A00.A06(obj) >= 0 ? (char) 2 : (char) 4;
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

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2P != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean containsAll(Collection<?> collection) {
                    C2P<V> c2p = this;
                    Iterator<?> it = collection.iterator();
                    char c2 = 2;
                    while (true) {
                        switch (c2) {
                            case 2:
                                it = it;
                                if (!it.hasNext()) {
                                    c2 = 5;
                                    break;
                                } else {
                                    c2 = 3;
                                    break;
                                }
                            case 3:
                                c2p = c2p;
                                it = it;
                                if (!c2p.contains(it.next())) {
                                    c2 = 4;
                                    break;
                                } else {
                                    c2 = 2;
                                    break;
                                }
                            case 4:
                                return false;
                            case 5:
                                return true;
                        }
                    }
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2P != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean isEmpty() {
                    boolean z = false;
                    char c2 = this.A00.A04() == 0 ? (char) 2 : (char) 4;
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

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2P != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection, java.lang.Iterable
                public final Iterator<V> iterator() {
                    return new C2L(this.A00, 1);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2P != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean remove(Object obj) {
                    int iA06 = this.A00.A06(obj);
                    if (iA06 >= 0) {
                        this.A00.A0E(iA06);
                        return true;
                    }
                    return false;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2P != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean removeAll(Collection<?> collection) {
                    C2P<V> c2p = this;
                    int i = 0;
                    int iA04 = c2p.A00.A04();
                    boolean z = false;
                    int i2 = 0;
                    int i3 = 2;
                    while (true) {
                        switch (i3) {
                            case 2:
                                if (i2 >= iA04) {
                                    i3 = 6;
                                    break;
                                } else {
                                    i3 = 3;
                                    break;
                                }
                            case 3:
                                c2p = c2p;
                                collection = collection;
                                i = 1;
                                if (!collection.contains(c2p.A00.A07(i2, 1))) {
                                    i3 = 5;
                                    break;
                                } else {
                                    i3 = 4;
                                    break;
                                }
                            case 4:
                                c2p = c2p;
                                c2p.A00.A0E(i2);
                                i2--;
                                iA04--;
                                z = true;
                                i3 = 5;
                                break;
                            case 5:
                                i2 += i;
                                i3 = 2;
                                break;
                            case 6:
                                return z;
                        }
                    }
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2P != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean retainAll(Collection<?> collection) {
                    C2P<V> c2p = this;
                    int i = 0;
                    int iA04 = c2p.A00.A04();
                    boolean z = false;
                    int i2 = 0;
                    int i3 = 2;
                    while (true) {
                        switch (i3) {
                            case 2:
                                if (i2 >= iA04) {
                                    i3 = 6;
                                    break;
                                } else {
                                    i3 = 3;
                                    break;
                                }
                            case 3:
                                c2p = c2p;
                                collection = collection;
                                i = 1;
                                if (!collection.contains(c2p.A00.A07(i2, 1))) {
                                    i3 = 4;
                                    break;
                                } else {
                                    i3 = 5;
                                    break;
                                }
                            case 4:
                                c2p = c2p;
                                c2p.A00.A0E(i2);
                                i2--;
                                iA04--;
                                z = true;
                                i3 = 5;
                                break;
                            case 5:
                                i2 += i;
                                i3 = 2;
                                break;
                            case 6:
                                return z;
                        }
                    }
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2P != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final int size() {
                    return this.A00.A04();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2P != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final Object[] toArray() {
                    return this.A00.A0G(1);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2P != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final <T> T[] toArray(T[] tArr) {
                    return (T[]) this.A00.A0H(tArr, 1);
                }
            };
        }
        return this.A02;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Q != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V> */
    public final Set<Map.Entry<K, V>> A0B() {
        if (this.A00 == null) {
            this.A00 = new Set<Map.Entry<K, V>>() { // from class: com.facebook.ads.redexgen.X.2M
                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2M != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                /* renamed from: A00, reason: merged with bridge method [inline-methods] */
                public final boolean add(Map.Entry<K, V> entry) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2M != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
                    C2M<K, V> c2m = this;
                    boolean z = false;
                    int iA04 = c2m.A00.A04();
                    Iterator<? extends Map.Entry<K, V>> it = collection.iterator();
                    char c2 = 2;
                    while (true) {
                        switch (c2) {
                            case 2:
                                it = it;
                                if (!it.hasNext()) {
                                    c2 = 4;
                                    break;
                                } else {
                                    c2 = 3;
                                    break;
                                }
                            case 3:
                                c2m = c2m;
                                it = it;
                                Map.Entry<K, V> next = it.next();
                                c2m.A00.A0F(next.getKey(), next.getValue());
                                c2 = 2;
                                break;
                            case 4:
                                c2m = c2m;
                                if (iA04 == c2m.A00.A04()) {
                                    c2 = 7;
                                    break;
                                } else {
                                    c2 = 5;
                                    break;
                                }
                            case 5:
                                z = true;
                                c2 = 6;
                                break;
                            case 6:
                                return z;
                            case 7:
                                z = false;
                                c2 = 6;
                                break;
                        }
                    }
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2M != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final void clear() {
                    this.A00.A0D();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2M != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean contains(Object obj) {
                    C2M<K, V> c2m = this;
                    Map.Entry entry = null;
                    int iA05 = 0;
                    char c2 = !(obj instanceof Map.Entry) ? (char) 2 : (char) 3;
                    while (true) {
                        switch (c2) {
                            case 2:
                                return false;
                            case 3:
                                c2m = c2m;
                                obj = obj;
                                entry = (Map.Entry) obj;
                                iA05 = c2m.A00.A05(entry.getKey());
                                if (iA05 >= 0) {
                                    c2 = 5;
                                    break;
                                } else {
                                    c2 = 4;
                                    break;
                                }
                            case 4:
                                return false;
                            case 5:
                                return C2J.A04(c2m.A00.A07(iA05, 1), entry.getValue());
                        }
                    }
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2M != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean containsAll(Collection<?> collection) {
                    C2M<K, V> c2m = this;
                    Iterator<?> it = collection.iterator();
                    char c2 = 2;
                    while (true) {
                        switch (c2) {
                            case 2:
                                it = it;
                                if (!it.hasNext()) {
                                    c2 = 5;
                                    break;
                                } else {
                                    c2 = 3;
                                    break;
                                }
                            case 3:
                                c2m = c2m;
                                it = it;
                                if (!c2m.contains(it.next())) {
                                    c2 = 4;
                                    break;
                                } else {
                                    c2 = 2;
                                    break;
                                }
                            case 4:
                                return false;
                            case 5:
                                return true;
                        }
                    }
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2M != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean equals(Object obj) {
                    return C2Q.A03(this, obj);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2M != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final int hashCode() {
                    C2M<K, V> c2m = this;
                    Object objA07 = null;
                    int iHashCode = 0;
                    int iHashCode2 = 0;
                    Object objA072 = null;
                    int i = 0;
                    int iA04 = c2m.A00.A04() - 1;
                    char c2 = 2;
                    while (true) {
                        switch (c2) {
                            case 2:
                                if (iA04 < 0) {
                                    c2 = '\t';
                                    break;
                                } else {
                                    c2 = 3;
                                    break;
                                }
                            case 3:
                                c2m = c2m;
                                iHashCode2 = 0;
                                objA07 = c2m.A00.A07(iA04, 0);
                                objA072 = c2m.A00.A07(iA04, 1);
                                if (objA07 != null) {
                                    c2 = '\b';
                                    break;
                                } else {
                                    c2 = 4;
                                    break;
                                }
                            case 4:
                                iHashCode = 0;
                                c2 = 5;
                                break;
                            case 5:
                                objA072 = objA072;
                                if (objA072 != null) {
                                    c2 = 7;
                                    break;
                                } else {
                                    c2 = 6;
                                    break;
                                }
                            case 6:
                                i += iHashCode2 ^ iHashCode;
                                iA04--;
                                c2 = 2;
                                break;
                            case 7:
                                objA072 = objA072;
                                iHashCode2 = objA072.hashCode();
                                c2 = 6;
                                break;
                            case '\b':
                                objA07 = objA07;
                                iHashCode = objA07.hashCode();
                                c2 = 5;
                                break;
                            case '\t':
                                return i;
                        }
                    }
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2M != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean isEmpty() {
                    boolean z = false;
                    char c2 = this.A00.A04() == 0 ? (char) 2 : (char) 4;
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

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2M != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection, java.lang.Iterable
                public final Iterator<Map.Entry<K, V>> iterator() {
                    return new C2O(this.A00);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2M != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean remove(Object obj) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2M != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean removeAll(Collection<?> collection) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2M != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean retainAll(Collection<?> collection) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2M != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final int size() {
                    return this.A00.A04();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2M != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final Object[] toArray() {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2M != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final <T> T[] toArray(T[] tArr) {
                    throw new UnsupportedOperationException();
                }
            };
        }
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Q != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V> */
    public final Set<K> A0C() {
        if (this.A01 == null) {
            this.A01 = new Set<K>() { // from class: com.facebook.ads.redexgen.X.2N
                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2N != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean add(K k) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2N != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean addAll(Collection<? extends K> collection) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2N != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final void clear() {
                    this.A00.A0D();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2N != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean contains(Object obj) {
                    boolean z = false;
                    char c2 = this.A00.A05(obj) >= 0 ? (char) 2 : (char) 4;
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

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2N != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean containsAll(Collection<?> collection) {
                    return C2Q.A00(this.A00.A0A(), collection);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2N != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean equals(Object obj) {
                    return C2Q.A03(this, obj);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2N != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final int hashCode() {
                    C2N<K> c2n = this;
                    int i = 0;
                    Object objA07 = null;
                    int i2 = 0;
                    int iA04 = c2n.A00.A04() - 1;
                    char c2 = 2;
                    while (true) {
                        switch (c2) {
                            case 2:
                                if (iA04 < 0) {
                                    c2 = 6;
                                    break;
                                } else {
                                    c2 = 3;
                                    break;
                                }
                            case 3:
                                c2n = c2n;
                                i = 0;
                                objA07 = c2n.A00.A07(iA04, 0);
                                if (objA07 != null) {
                                    c2 = 5;
                                    break;
                                } else {
                                    c2 = 4;
                                    break;
                                }
                            case 4:
                                i2 += i;
                                iA04--;
                                c2 = 2;
                                break;
                            case 5:
                                objA07 = objA07;
                                i = objA07.hashCode();
                                c2 = 4;
                                break;
                            case 6:
                                return i2;
                        }
                    }
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2N != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean isEmpty() {
                    boolean z = false;
                    char c2 = this.A00.A04() == 0 ? (char) 2 : (char) 4;
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

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2N != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection, java.lang.Iterable
                public final Iterator<K> iterator() {
                    return new C2L(this.A00, 0);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2N != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean remove(Object obj) {
                    int iA05 = this.A00.A05(obj);
                    if (iA05 >= 0) {
                        this.A00.A0E(iA05);
                        return true;
                    }
                    return false;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2N != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean removeAll(Collection<?> collection) {
                    return C2Q.A01(this.A00.A0A(), collection);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2N != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean retainAll(Collection<?> collection) {
                    return C2Q.A02(this.A00.A0A(), collection);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2N != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final int size() {
                    return this.A00.A04();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2N != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final Object[] toArray() {
                    return this.A00.A0G(0);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2N != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final <T> T[] toArray(T[] tArr) {
                    return (T[]) this.A00.A0H(tArr, 0);
                }
            };
        }
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Q != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V> */
    public final Object[] A0G(int i) {
        C2Q<K, V> c2q = this;
        int iA04 = c2q.A04();
        Object[] objArr = new Object[iA04];
        int i2 = 0;
        int i3 = 2;
        while (true) {
            switch (i3) {
                case 2:
                    if (i2 >= iA04) {
                        i3 = 4;
                        break;
                    } else {
                        i3 = 3;
                        break;
                    }
                case 3:
                    c2q = c2q;
                    objArr = objArr;
                    objArr[i2] = c2q.A07(i2, i);
                    i2++;
                    i3 = 2;
                    break;
                case 4:
                    return objArr;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Q != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T[] A0H(T[] tArr, int i) {
        C2Q<K, V> c2q = this;
        int i2 = 0;
        int iA04 = c2q.A04();
        char c2 = tArr.length < iA04 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), iA04);
                    c2 = 3;
                    break;
                case 3:
                    i2 = 0;
                    c2 = 4;
                    break;
                case 4:
                    if (i2 >= iA04) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c2q = c2q;
                    tArr = tArr;
                    tArr[i2] = c2q.A07(i2, i);
                    i2++;
                    c2 = 4;
                    break;
                case 6:
                    tArr = (T[]) tArr;
                    if (tArr.length <= iA04) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    tArr = tArr;
                    tArr[iA04] = 0;
                    c2 = '\b';
                    break;
                case '\b':
                    return (T[]) tArr;
            }
        }
    }
}
