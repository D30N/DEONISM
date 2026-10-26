package d.b.a.a.e.e;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class s4 extends f3<Integer> implements x4, m6, RandomAccess {
    private static final s4 e;

    /* renamed from: c, reason: collision with root package name */
    private int[] f2832c;

    /* renamed from: d, reason: collision with root package name */
    private int f2833d;

    static {
        s4 s4Var = new s4(new int[0], 0);
        e = s4Var;
        s4Var.b();
    }

    s4() {
        this(new int[10], 0);
    }

    private s4(int[] iArr, int i) {
        this.f2832c = iArr;
        this.f2833d = i;
    }

    public static s4 i() {
        return e;
    }

    private final void k(int i) {
        if (i < 0 || i >= this.f2833d) {
            throw new IndexOutOfBoundsException(l(i));
        }
    }

    private final String l(int i) {
        int i2 = this.f2833d;
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
        int iIntValue = ((Integer) obj).intValue();
        c();
        if (i < 0 || i > (i2 = this.f2833d)) {
            throw new IndexOutOfBoundsException(l(i));
        }
        int[] iArr = this.f2832c;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f2832c, i, iArr2, i + 1, this.f2833d - i);
            this.f2832c = iArr2;
        }
        this.f2832c[i] = iIntValue;
        this.f2833d++;
        ((AbstractList) this).modCount++;
    }

    @Override // d.b.a.a.e.e.f3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        j(((Integer) obj).intValue());
        return true;
    }

    @Override // d.b.a.a.e.e.f3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        c();
        u4.d(collection);
        if (!(collection instanceof s4)) {
            return super.addAll(collection);
        }
        s4 s4Var = (s4) collection;
        int i = s4Var.f2833d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f2833d;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f2832c;
        if (i3 > iArr.length) {
            this.f2832c = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(s4Var.f2832c, 0, this.f2832c, this.f2833d, s4Var.f2833d);
        this.f2833d = i3;
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
        if (!(obj instanceof s4)) {
            return super.equals(obj);
        }
        s4 s4Var = (s4) obj;
        if (this.f2833d != s4Var.f2833d) {
            return false;
        }
        int[] iArr = s4Var.f2832c;
        for (int i = 0; i < this.f2833d; i++) {
            if (this.f2832c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // d.b.a.a.e.e.z4
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final x4 f(int i) {
        if (i >= this.f2833d) {
            return new s4(Arrays.copyOf(this.f2832c, i), this.f2833d);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(h(i));
    }

    public final int h(int i) {
        k(i);
        return this.f2832c[i];
    }

    @Override // d.b.a.a.e.e.f3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f2833d; i2++) {
            i = (i * 31) + this.f2832c[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f2832c[i] == iIntValue) {
                return i;
            }
        }
        return -1;
    }

    public final void j(int i) {
        c();
        int i2 = this.f2833d;
        int[] iArr = this.f2832c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f2832c = iArr2;
        }
        int[] iArr3 = this.f2832c;
        int i3 = this.f2833d;
        this.f2833d = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        c();
        k(i);
        int[] iArr = this.f2832c;
        int i2 = iArr[i];
        if (i < this.f2833d - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f2833d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // d.b.a.a.e.e.f3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.f2833d; i++) {
            if (obj.equals(Integer.valueOf(this.f2832c[i]))) {
                int[] iArr = this.f2832c;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f2833d - i) - 1);
                this.f2833d--;
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
        int[] iArr = this.f2832c;
        System.arraycopy(iArr, i2, iArr, i, this.f2833d - i2);
        this.f2833d -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        c();
        k(i);
        int[] iArr = this.f2832c;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2833d;
    }
}
