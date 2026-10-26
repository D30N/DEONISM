package d.b.a.a.e.e;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class t2<T> implements o2<T> {

    /* renamed from: b, reason: collision with root package name */
    private volatile o2<T> f2837b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f2838c;

    /* renamed from: d, reason: collision with root package name */
    @NullableDecl
    private T f2839d;

    t2(o2<T> o2Var) {
        m2.a(o2Var);
        this.f2837b = o2Var;
    }

    @Override // d.b.a.a.e.e.o2
    public final T a() {
        if (!this.f2838c) {
            synchronized (this) {
                if (!this.f2838c) {
                    T tA = this.f2837b.a();
                    this.f2839d = tA;
                    this.f2838c = true;
                    this.f2837b = null;
                    return tA;
                }
            }
        }
        return this.f2839d;
    }

    public final String toString() {
        Object string = this.f2837b;
        if (string == null) {
            String strValueOf = String.valueOf(this.f2839d);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(strValueOf);
            sb.append(">");
            string = sb.toString();
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(strValueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
