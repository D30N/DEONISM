package d.b.a.a.e.e;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class n4 extends f3<Float> implements z4<Float>, m6, RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    private float[] f2773c;

    /* renamed from: d, reason: collision with root package name */
    private int f2774d;

    static {
        new n4(new float[0], 0).b();
    }

    n4() {
        this(new float[10], 0);
    }

    private n4(float[] fArr, int i) {
        this.f2773c = fArr;
        this.f2774d = i;
    }

    private final void i(int i) {
        if (i < 0 || i >= this.f2774d) {
            throw new IndexOutOfBoundsException(j(i));
        }
    }

    private final String j(int i) {
        int i2 = this.f2774d;
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
        float fFloatValue = ((Float) obj).floatValue();
        c();
        if (i < 0 || i > (i2 = this.f2774d)) {
            throw new IndexOutOfBoundsException(j(i));
        }
        float[] fArr = this.f2773c;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f2773c, i, fArr2, i + 1, this.f2774d - i);
            this.f2773c = fArr2;
        }
        this.f2773c[i] = fFloatValue;
        this.f2774d++;
        ((AbstractList) this).modCount++;
    }

    @Override // d.b.a.a.e.e.f3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        h(((Float) obj).floatValue());
        return true;
    }

    @Override // d.b.a.a.e.e.f3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        c();
        u4.d(collection);
        if (!(collection instanceof n4)) {
            return super.addAll(collection);
        }
        n4 n4Var = (n4) collection;
        int i = n4Var.f2774d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f2774d;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.f2773c;
        if (i3 > fArr.length) {
            this.f2773c = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(n4Var.f2773c, 0, this.f2773c, this.f2774d, n4Var.f2774d);
        this.f2774d = i3;
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
        if (!(obj instanceof n4)) {
            return super.equals(obj);
        }
        n4 n4Var = (n4) obj;
        if (this.f2774d != n4Var.f2774d) {
            return false;
        }
        float[] fArr = n4Var.f2773c;
        for (int i = 0; i < this.f2774d; i++) {
            if (Float.floatToIntBits(this.f2773c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // d.b.a.a.e.e.z4
    public final /* synthetic */ z4<Float> f(int i) {
        if (i >= this.f2774d) {
            return new n4(Arrays.copyOf(this.f2773c, i), this.f2774d);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        i(i);
        return Float.valueOf(this.f2773c[i]);
    }

    public final void h(float f) {
        c();
        int i = this.f2774d;
        float[] fArr = this.f2773c;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f2773c = fArr2;
        }
        float[] fArr3 = this.f2773c;
        int i2 = this.f2774d;
        this.f2774d = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // d.b.a.a.e.e.f3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f2774d; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f2773c[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f2773c[i] == fFloatValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        c();
        i(i);
        float[] fArr = this.f2773c;
        float f = fArr[i];
        if (i < this.f2774d - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.f2774d--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // d.b.a.a.e.e.f3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.f2774d; i++) {
            if (obj.equals(Float.valueOf(this.f2773c[i]))) {
                float[] fArr = this.f2773c;
                System.arraycopy(fArr, i + 1, fArr, i, (this.f2774d - i) - 1);
                this.f2774d--;
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
        float[] fArr = this.f2773c;
        System.arraycopy(fArr, i2, fArr, i, this.f2774d - i2);
        this.f2774d -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        c();
        i(i);
        float[] fArr = this.f2773c;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2774d;
    }
}
