package b.d;

/* loaded from: classes.dex */
public class d<E> implements Cloneable {
    private static final Object f = new Object();

    /* renamed from: b, reason: collision with root package name */
    private boolean f754b;

    /* renamed from: c, reason: collision with root package name */
    private long[] f755c;

    /* renamed from: d, reason: collision with root package name */
    private Object[] f756d;
    private int e;

    public d() {
        this(10);
    }

    public d(int i) {
        this.f754b = false;
        if (i == 0) {
            this.f755c = c.f752b;
            this.f756d = c.f753c;
        } else {
            int iF = c.f(i);
            this.f755c = new long[iF];
            this.f756d = new Object[iF];
        }
    }

    private void f() {
        int i = this.e;
        long[] jArr = this.f755c;
        Object[] objArr = this.f756d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f754b = false;
        this.e = i2;
    }

    public void b(long j, E e) {
        int i = this.e;
        if (i != 0 && j <= this.f755c[i - 1]) {
            o(j, e);
            return;
        }
        if (this.f754b && this.e >= this.f755c.length) {
            f();
        }
        int i2 = this.e;
        if (i2 >= this.f755c.length) {
            int iF = c.f(i2 + 1);
            long[] jArr = new long[iF];
            Object[] objArr = new Object[iF];
            long[] jArr2 = this.f755c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f756d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f755c = jArr;
            this.f756d = objArr;
        }
        this.f755c[i2] = j;
        this.f756d[i2] = e;
        this.e = i2 + 1;
    }

    public void c() {
        int i = this.e;
        Object[] objArr = this.f756d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.e = 0;
        this.f754b = false;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public d<E> clone() {
        try {
            d<E> dVar = (d) super.clone();
            dVar.f755c = (long[]) this.f755c.clone();
            dVar.f756d = (Object[]) this.f756d.clone();
            return dVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Deprecated
    public void e(long j) {
        q(j);
    }

    public E g(long j) {
        return j(j, null);
    }

    public E j(long j, E e) {
        int iB = c.b(this.f755c, this.e, j);
        if (iB >= 0) {
            Object[] objArr = this.f756d;
            if (objArr[iB] != f) {
                return (E) objArr[iB];
            }
        }
        return e;
    }

    public int k(long j) {
        if (this.f754b) {
            f();
        }
        return c.b(this.f755c, this.e, j);
    }

    public long n(int i) {
        if (this.f754b) {
            f();
        }
        return this.f755c[i];
    }

    public void o(long j, E e) {
        int iB = c.b(this.f755c, this.e, j);
        if (iB >= 0) {
            this.f756d[iB] = e;
            return;
        }
        int iB2 = iB ^ (-1);
        if (iB2 < this.e) {
            Object[] objArr = this.f756d;
            if (objArr[iB2] == f) {
                this.f755c[iB2] = j;
                objArr[iB2] = e;
                return;
            }
        }
        if (this.f754b && this.e >= this.f755c.length) {
            f();
            iB2 = c.b(this.f755c, this.e, j) ^ (-1);
        }
        int i = this.e;
        if (i >= this.f755c.length) {
            int iF = c.f(i + 1);
            long[] jArr = new long[iF];
            Object[] objArr2 = new Object[iF];
            long[] jArr2 = this.f755c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f756d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f755c = jArr;
            this.f756d = objArr2;
        }
        int i2 = this.e;
        if (i2 - iB2 != 0) {
            long[] jArr3 = this.f755c;
            int i3 = iB2 + 1;
            System.arraycopy(jArr3, iB2, jArr3, i3, i2 - iB2);
            Object[] objArr4 = this.f756d;
            System.arraycopy(objArr4, iB2, objArr4, i3, this.e - iB2);
        }
        this.f755c[iB2] = j;
        this.f756d[iB2] = e;
        this.e++;
    }

    public void q(long j) {
        int iB = c.b(this.f755c, this.e, j);
        if (iB >= 0) {
            Object[] objArr = this.f756d;
            Object obj = objArr[iB];
            Object obj2 = f;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f754b = true;
            }
        }
    }

    public void r(int i) {
        Object[] objArr = this.f756d;
        Object obj = objArr[i];
        Object obj2 = f;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f754b = true;
        }
    }

    public int s() {
        if (this.f754b) {
            f();
        }
        return this.e;
    }

    public E t(int i) {
        if (this.f754b) {
            f();
        }
        return (E) this.f756d[i];
    }

    public String toString() {
        if (s() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.e * 28);
        sb.append('{');
        for (int i = 0; i < this.e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(n(i));
            sb.append('=');
            E eT = t(i);
            if (eT != this) {
                sb.append(eT);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
