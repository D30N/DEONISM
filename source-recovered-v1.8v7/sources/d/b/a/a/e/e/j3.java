package d.b.a.a.e.e;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class j3 extends f3<Boolean> implements z4<Boolean>, m6, RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    private boolean[] f2728c;

    /* renamed from: d, reason: collision with root package name */
    private int f2729d;

    static {
        new j3(new boolean[0], 0).b();
    }

    j3() {
        this(new boolean[10], 0);
    }

    private j3(boolean[] zArr, int i) {
        this.f2728c = zArr;
        this.f2729d = i;
    }

    private final void i(int i) {
        if (i < 0 || i >= this.f2729d) {
            throw new IndexOutOfBoundsException(j(i));
        }
    }

    private final String j(int i) {
        int i2 = this.f2729d;
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
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        c();
        if (i < 0 || i > (i2 = this.f2729d)) {
            throw new IndexOutOfBoundsException(j(i));
        }
        boolean[] zArr = this.f2728c;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f2728c, i, zArr2, i + 1, this.f2729d - i);
            this.f2728c = zArr2;
        }
        this.f2728c[i] = zBooleanValue;
        this.f2729d++;
        ((AbstractList) this).modCount++;
    }

    @Override // d.b.a.a.e.e.f3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        h(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // d.b.a.a.e.e.f3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        c();
        u4.d(collection);
        if (!(collection instanceof j3)) {
            return super.addAll(collection);
        }
        j3 j3Var = (j3) collection;
        int i = j3Var.f2729d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f2729d;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f2728c;
        if (i3 > zArr.length) {
            this.f2728c = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(j3Var.f2728c, 0, this.f2728c, this.f2729d, j3Var.f2729d);
        this.f2729d = i3;
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
        if (!(obj instanceof j3)) {
            return super.equals(obj);
        }
        j3 j3Var = (j3) obj;
        if (this.f2729d != j3Var.f2729d) {
            return false;
        }
        boolean[] zArr = j3Var.f2728c;
        for (int i = 0; i < this.f2729d; i++) {
            if (this.f2728c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // d.b.a.a.e.e.z4
    public final /* synthetic */ z4<Boolean> f(int i) {
        if (i >= this.f2729d) {
            return new j3(Arrays.copyOf(this.f2728c, i), this.f2729d);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        i(i);
        return Boolean.valueOf(this.f2728c[i]);
    }

    public final void h(boolean z) {
        c();
        int i = this.f2729d;
        boolean[] zArr = this.f2728c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f2728c = zArr2;
        }
        boolean[] zArr3 = this.f2728c;
        int i2 = this.f2729d;
        this.f2729d = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // d.b.a.a.e.e.f3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iC = 1;
        for (int i = 0; i < this.f2729d; i++) {
            iC = (iC * 31) + u4.c(this.f2728c[i]);
        }
        return iC;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f2728c[i] == zBooleanValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        c();
        i(i);
        boolean[] zArr = this.f2728c;
        boolean z = zArr[i];
        if (i < this.f2729d - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.f2729d--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // d.b.a.a.e.e.f3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.f2729d; i++) {
            if (obj.equals(Boolean.valueOf(this.f2728c[i]))) {
                boolean[] zArr = this.f2728c;
                System.arraycopy(zArr, i + 1, zArr, i, (this.f2729d - i) - 1);
                this.f2729d--;
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
        boolean[] zArr = this.f2728c;
        System.arraycopy(zArr, i2, zArr, i, this.f2729d - i2);
        this.f2729d -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        c();
        i(i);
        boolean[] zArr = this.f2728c;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2729d;
    }
}
