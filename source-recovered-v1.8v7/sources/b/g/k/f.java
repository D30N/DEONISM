package b.g.k;

/* loaded from: classes.dex */
public class f<T> implements e<T> {
    private final Object[] a;

    /* renamed from: b, reason: collision with root package name */
    private int f907b;

    public f(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.a = new Object[i];
    }

    private boolean c(T t) {
        for (int i = 0; i < this.f907b; i++) {
            if (this.a[i] == t) {
                return true;
            }
        }
        return false;
    }

    @Override // b.g.k.e
    public boolean a(T t) {
        if (c(t)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i = this.f907b;
        Object[] objArr = this.a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f907b = i + 1;
        return true;
    }

    @Override // b.g.k.e
    public T b() {
        int i = this.f907b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f907b = i - 1;
        return t;
    }
}
