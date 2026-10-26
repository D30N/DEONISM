package b.g.k;

/* loaded from: classes.dex */
public class g<T> extends f<T> {

    /* renamed from: c, reason: collision with root package name */
    private final Object f908c;

    public g(int i) {
        super(i);
        this.f908c = new Object();
    }

    @Override // b.g.k.f, b.g.k.e
    public boolean a(T t) {
        boolean zA;
        synchronized (this.f908c) {
            zA = super.a(t);
        }
        return zA;
    }

    @Override // b.g.k.f, b.g.k.e
    public T b() {
        T t;
        synchronized (this.f908c) {
            t = (T) super.b();
        }
        return t;
    }
}
