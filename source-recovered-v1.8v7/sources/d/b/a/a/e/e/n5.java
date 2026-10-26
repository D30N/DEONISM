package d.b.a.a.e.e;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class n5 extends f3<Long> implements w4, m6, RandomAccess {
    private static final n5 e;

    /* renamed from: c, reason: collision with root package name */
    private long[] f2775c;

    /* renamed from: d, reason: collision with root package name */
    private int f2776d;

    static {
        n5 n5Var = new n5(new long[0], 0);
        e = n5Var;
        n5Var.b();
    }

    n5() {
        this(new long[10], 0);
    }

    private n5(long[] jArr, int i) {
        this.f2775c = jArr;
        this.f2776d = i;
    }

    public static n5 i() {
        return e;
    }

    private final void j(int i) {
        if (i < 0 || i >= this.f2776d) {
            throw new IndexOutOfBoundsException(k(i));
        }
    }

    private final String k(int i) {
        int i2 = this.f2776d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        c();
        if (i < 0 || i > (i2 = this.f2776d)) {
            throw new IndexOutOfBoundsException(k(i));
        }
        long[] jArr = this.f2775c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f2775c, i, jArr2, i + 1, this.f2776d - i);
            this.f2775c = jArr2;
        }
        this.f2775c[i] = jLongValue;
        this.f2776d++;
        ((AbstractList) this).modCount++;
    }

    @Override // d.b.a.a.e.e.f3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        h(((Long) obj).longValue());
        return true;
    }

    @Override // d.b.a.a.e.e.f3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        c();
        u4.d(collection);
        if (!(collection instanceof n5)) {
            return super.addAll(collection);
        }
        n5 n5Var = (n5) collection;
        int i = n5Var.f2776d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f2776d;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f2775c;
        if (i3 > jArr.length) {
            this.f2775c = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(n5Var.f2775c, 0, this.f2775c, this.f2776d, n5Var.f2776d);
        this.f2776d = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // d.b.a.a.e.e.f3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5)) {
            return super.equals(obj);
        }
        n5 n5Var = (n5) obj;
        if (this.f2776d != n5Var.f2776d) {
            return false;
        }
        long[] jArr = n5Var.f2775c;
        for (int i = 0; i < this.f2776d; i++) {
            if (this.f2775c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // d.b.a.a.e.e.w4
    public final long g(int i) {
        j(i);
        return this.f2775c[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(g(i));
    }

    public final void h(long j) {
        c();
        int i = this.f2776d;
        long[] jArr = this.f2775c;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f2775c = jArr2;
        }
        long[] jArr3 = this.f2775c;
        int i2 = this.f2776d;
        this.f2776d = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // d.b.a.a.e.e.f3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i = 0; i < this.f2776d; i++) {
            iB = (iB * 31) + u4.b(this.f2775c[i]);
        }
        return iB;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f2775c[i] == jLongValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // d.b.a.a.e.e.z4
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final w4 f(int i) {
        if (i >= this.f2776d) {
            return new n5(Arrays.copyOf(this.f2775c, i), this.f2776d);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        c();
        j(i);
        long[] jArr = this.f2775c;
        long j = jArr[i];
        if (i < this.f2776d - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.f2776d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // d.b.a.a.e.e.f3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.f2776d; i++) {
            if (obj.equals(Long.valueOf(this.f2775c[i]))) {
                long[] jArr = this.f2775c;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f2776d - i) - 1);
                this.f2776d--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        c();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f2775c;
        System.arraycopy(jArr, i2, jArr, i, this.f2776d - i2);
        this.f2776d -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        c();
        j(i);
        long[] jArr = this.f2775c;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2776d;
    }
}
