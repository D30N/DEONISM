package b.e.a;

/* loaded from: classes.dex */
class h<T> implements g<T> {
    private final Object[] a;

    /* renamed from: b, reason: collision with root package name */
    private int f791b;

    h(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.a = new Object[i];
    }

    @Override // b.e.a.g
    public boolean a(T t) {
        int i = this.f791b;
        Object[] objArr = this.a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f791b = i + 1;
        return true;
    }

    @Override // b.e.a.g
    public T b() {
        int i = this.f791b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f791b = i - 1;
        return t;
    }

    @Override // b.e.a.g
    public void c(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            int i3 = this.f791b;
            Object[] objArr = this.a;
            if (i3 < objArr.length) {
                objArr[i3] = t;
                this.f791b = i3 + 1;
            }
        }
    }
}
