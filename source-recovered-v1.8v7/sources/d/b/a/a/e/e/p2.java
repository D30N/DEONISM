package d.b.a.a.e.e;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class p2<T> extends n2<T> {

    /* renamed from: b, reason: collision with root package name */
    private final T f2794b;

    p2(T t) {
        this.f2794b = t;
    }

    @Override // d.b.a.a.e.e.n2
    public final boolean b() {
        return true;
    }

    @Override // d.b.a.a.e.e.n2
    public final T c() {
        return this.f2794b;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof p2) {
            return this.f2794b.equals(((p2) obj).f2794b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2794b.hashCode() + 1502476572;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f2794b);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 13);
        sb.append("Optional.of(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}
