package d.b.a.a.e.e;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class o6<E> extends f3<E> implements RandomAccess {
    private static final o6<Object> e;

    /* renamed from: c, reason: collision with root package name */
    private E[] f2784c;

    /* renamed from: d, reason: collision with root package name */
    private int f2785d;

    static {
        o6<Object> o6Var = new o6<>(new Object[0], 0);
        e = o6Var;
        o6Var.b();
    }

    private o6(E[] eArr, int i) {
        this.f2784c = eArr;
        this.f2785d = i;
    }

    private final void h(int i) {
        if (i < 0 || i >= this.f2785d) {
            throw new IndexOutOfBoundsException(i(i));
        }
    }

    private final String i(int i) {
        int i2 = this.f2785d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public static <E> o6<E> j() {
        return (o6<E>) e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e2) {
        int i2;
        c();
        if (i < 0 || i > (i2 = this.f2785d)) {
            throw new IndexOutOfBoundsException(i(i));
        }
        E[] eArr = this.f2784c;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = (E[]) new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f2784c, i, eArr2, i + 1, this.f2785d - i);
            this.f2784c = eArr2;
        }
        this.f2784c[i] = e2;
        this.f2785d++;
        ((AbstractList) this).modCount++;
    }

    @Override // d.b.a.a.e.e.f3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e2) {
        c();
        int i = this.f2785d;
        E[] eArr = this.f2784c;
        if (i == eArr.length) {
            this.f2784c = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f2784c;
        int i2 = this.f2785d;
        this.f2785d = i2 + 1;
        eArr2[i2] = e2;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // d.b.a.a.e.e.z4
    public final /* synthetic */ z4 f(int i) {
        if (i >= this.f2785d) {
            return new o6(Arrays.copyOf(this.f2784c, i), this.f2785d);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        h(i);
        return this.f2784c[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i) {
        c();
        h(i);
        E[] eArr = this.f2784c;
        E e2 = eArr[i];
        if (i < this.f2785d - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (r2 - i) - 1);
        }
        this.f2785d--;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e2) {
        c();
        h(i);
        E[] eArr = this.f2784c;
        E e3 = eArr[i];
        eArr[i] = e2;
        ((AbstractList) this).modCount++;
        return e3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2785d;
    }
}
