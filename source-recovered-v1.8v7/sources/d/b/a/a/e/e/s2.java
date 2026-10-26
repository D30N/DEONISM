package d.b.a.a.e.e;

import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class s2<T> implements o2<T>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    @NullableDecl
    private final T f2830b;

    s2(@NullableDecl T t) {
        this.f2830b = t;
    }

    @Override // d.b.a.a.e.e.o2
    public final T a() {
        return this.f2830b;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof s2)) {
            return false;
        }
        T t = this.f2830b;
        T t2 = ((s2) obj).f2830b;
        if (t != t2) {
            return t != null && t.equals(t2);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2830b});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f2830b);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}
