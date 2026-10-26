package d.b.a.a.e.e;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class d4 extends f3<Double> implements z4<Double>, m6, RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    private double[] f2655c;

    /* renamed from: d, reason: collision with root package name */
    private int f2656d;

    static {
        new d4(new double[0], 0).b();
    }

    d4() {
        this(new double[10], 0);
    }

    private d4(double[] dArr, int i) {
        this.f2655c = dArr;
        this.f2656d = i;
    }

    private final void i(int i) {
        if (i < 0 || i >= this.f2656d) {
            throw new IndexOutOfBoundsException(j(i));
        }
    }

    private final String j(int i) {
        int i2 = this.f2656d;
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
        double dDoubleValue = ((Double) obj).doubleValue();
        c();
        if (i < 0 || i > (i2 = this.f2656d)) {
            throw new IndexOutOfBoundsException(j(i));
        }
        double[] dArr = this.f2655c;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f2655c, i, dArr2, i + 1, this.f2656d - i);
            this.f2655c = dArr2;
        }
        this.f2655c[i] = dDoubleValue;
        this.f2656d++;
        ((AbstractList) this).modCount++;
    }

    @Override // d.b.a.a.e.e.f3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        h(((Double) obj).doubleValue());
        return true;
    }

    @Override // d.b.a.a.e.e.f3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        c();
        u4.d(collection);
        if (!(collection instanceof d4)) {
            return super.addAll(collection);
        }
        d4 d4Var = (d4) collection;
        int i = d4Var.f2656d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f2656d;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.f2655c;
        if (i3 > dArr.length) {
            this.f2655c = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(d4Var.f2655c, 0, this.f2655c, this.f2656d, d4Var.f2656d);
        this.f2656d = i3;
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
        if (!(obj instanceof d4)) {
            return super.equals(obj);
        }
        d4 d4Var = (d4) obj;
        if (this.f2656d != d4Var.f2656d) {
            return false;
        }
        double[] dArr = d4Var.f2655c;
        for (int i = 0; i < this.f2656d; i++) {
            if (Double.doubleToLongBits(this.f2655c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // d.b.a.a.e.e.z4
    public final /* synthetic */ z4<Double> f(int i) {
        if (i >= this.f2656d) {
            return new d4(Arrays.copyOf(this.f2655c, i), this.f2656d);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        i(i);
        return Double.valueOf(this.f2655c[i]);
    }

    public final void h(double d2) {
        c();
        int i = this.f2656d;
        double[] dArr = this.f2655c;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f2655c = dArr2;
        }
        double[] dArr3 = this.f2655c;
        int i2 = this.f2656d;
        this.f2656d = i2 + 1;
        dArr3[i2] = d2;
    }

    @Override // d.b.a.a.e.e.f3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i = 0; i < this.f2656d; i++) {
            iB = (iB * 31) + u4.b(Double.doubleToLongBits(this.f2655c[i]));
        }
        return iB;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f2655c[i] == dDoubleValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        c();
        i(i);
        double[] dArr = this.f2655c;
        double d2 = dArr[i];
        if (i < this.f2656d - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.f2656d--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d2);
    }

    @Override // d.b.a.a.e.e.f3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.f2656d; i++) {
            if (obj.equals(Double.valueOf(this.f2655c[i]))) {
                double[] dArr = this.f2655c;
                System.arraycopy(dArr, i + 1, dArr, i, (this.f2656d - i) - 1);
                this.f2656d--;
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
        double[] dArr = this.f2655c;
        System.arraycopy(dArr, i2, dArr, i, this.f2656d - i2);
        this.f2656d -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        c();
        i(i);
        double[] dArr = this.f2655c;
        double d2 = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2656d;
    }
}
