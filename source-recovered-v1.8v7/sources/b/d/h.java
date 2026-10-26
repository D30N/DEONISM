package b.d;

/* loaded from: classes.dex */
public class h<E> implements Cloneable {
    private static final Object f = new Object();

    /* renamed from: b, reason: collision with root package name */
    private boolean f774b;

    /* renamed from: c, reason: collision with root package name */
    private int[] f775c;

    /* renamed from: d, reason: collision with root package name */
    private Object[] f776d;
    private int e;

    public h() {
        this(10);
    }

    public h(int i) {
        this.f774b = false;
        if (i == 0) {
            this.f775c = c.a;
            this.f776d = c.f753c;
        } else {
            int iE = c.e(i);
            this.f775c = new int[iE];
            this.f776d = new Object[iE];
        }
    }

    private void e() {
        int i = this.e;
        int[] iArr = this.f775c;
        Object[] objArr = this.f776d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f774b = false;
        this.e = i2;
    }

    public void b(int i, E e) {
        int i2 = this.e;
        if (i2 != 0 && i <= this.f775c[i2 - 1]) {
            o(i, e);
            return;
        }
        if (this.f774b && this.e >= this.f775c.length) {
            e();
        }
        int i3 = this.e;
        if (i3 >= this.f775c.length) {
            int iE = c.e(i3 + 1);
            int[] iArr = new int[iE];
            Object[] objArr = new Object[iE];
            int[] iArr2 = this.f775c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f776d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f775c = iArr;
            this.f776d = objArr;
        }
        this.f775c[i3] = i;
        this.f776d[i3] = e;
        this.e = i3 + 1;
    }

    public void c() {
        int i = this.e;
        Object[] objArr = this.f776d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.e = 0;
        this.f774b = false;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public h<E> clone() {
        try {
            h<E> hVar = (h) super.clone();
            hVar.f775c = (int[]) this.f775c.clone();
            hVar.f776d = (Object[]) this.f776d.clone();
            return hVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public E f(int i) {
        return g(i, null);
    }

    public E g(int i, E e) {
        int iA = c.a(this.f775c, this.e, i);
        if (iA >= 0) {
            Object[] objArr = this.f776d;
            if (objArr[iA] != f) {
                return (E) objArr[iA];
            }
        }
        return e;
    }

    public int j(int i) {
        if (this.f774b) {
            e();
        }
        return c.a(this.f775c, this.e, i);
    }

    public int k(E e) {
        if (this.f774b) {
            e();
        }
        for (int i = 0; i < this.e; i++) {
            if (this.f776d[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public int n(int i) {
        if (this.f774b) {
            e();
        }
        return this.f775c[i];
    }

    public void o(int i, E e) {
        int iA = c.a(this.f775c, this.e, i);
        if (iA >= 0) {
            this.f776d[iA] = e;
            return;
        }
        int iA2 = iA ^ (-1);
        if (iA2 < this.e) {
            Object[] objArr = this.f776d;
            if (objArr[iA2] == f) {
                this.f775c[iA2] = i;
                objArr[iA2] = e;
                return;
            }
        }
        if (this.f774b && this.e >= this.f775c.length) {
            e();
            iA2 = c.a(this.f775c, this.e, i) ^ (-1);
        }
        int i2 = this.e;
        if (i2 >= this.f775c.length) {
            int iE = c.e(i2 + 1);
            int[] iArr = new int[iE];
            Object[] objArr2 = new Object[iE];
            int[] iArr2 = this.f775c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f776d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f775c = iArr;
            this.f776d = objArr2;
        }
        int i3 = this.e;
        if (i3 - iA2 != 0) {
            int[] iArr3 = this.f775c;
            int i4 = iA2 + 1;
            System.arraycopy(iArr3, iA2, iArr3, i4, i3 - iA2);
            Object[] objArr4 = this.f776d;
            System.arraycopy(objArr4, iA2, objArr4, i4, this.e - iA2);
        }
        this.f775c[iA2] = i;
        this.f776d[iA2] = e;
        this.e++;
    }

    public void q(int i) {
        int iA = c.a(this.f775c, this.e, i);
        if (iA >= 0) {
            Object[] objArr = this.f776d;
            Object obj = objArr[iA];
            Object obj2 = f;
            if (obj != obj2) {
                objArr[iA] = obj2;
                this.f774b = true;
            }
        }
    }

    public int r() {
        if (this.f774b) {
            e();
        }
        return this.e;
    }

    public E s(int i) {
        if (this.f774b) {
            e();
        }
        return (E) this.f776d[i];
    }

    public String toString() {
        if (r() <= 0) {
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
            E eS = s(i);
            if (eS != this) {
                sb.append(eS);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
