package d.b.a.a.e.e;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class q2<T> implements o2<T>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    private final o2<T> f2805b;

    /* renamed from: c, reason: collision with root package name */
    private volatile transient boolean f2806c;

    /* renamed from: d, reason: collision with root package name */
    @NullableDecl
    private transient T f2807d;

    q2(o2<T> o2Var) {
        m2.a(o2Var);
        this.f2805b = o2Var;
    }

    @Override // d.b.a.a.e.e.o2
    public final T a() {
        if (!this.f2806c) {
            synchronized (this) {
                if (!this.f2806c) {
                    T tA = this.f2805b.a();
                    this.f2807d = tA;
                    this.f2806c = true;
                    return tA;
                }
            }
        }
        return this.f2807d;
    }

    public final String toString() {
        Object string;
        if (this.f2806c) {
            String strValueOf = String.valueOf(this.f2807d);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(strValueOf);
            sb.append(">");
            string = sb.toString();
        } else {
            string = this.f2805b;
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(strValueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
